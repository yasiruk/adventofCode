#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define SIZE 140

int is_digit(char s) { return (s >= '0') && (s <= '9'); }
int is_symb(char s) { return !is_digit(s) && (s != '.'); }
int tainted_x(char *line, int x, int w) {
  int t = 0;
  if (w - x > 1) {
    t = is_symb(line[x + 1]);
  }
  if (x > 0) {
    t = t || is_symb(line[x - 1]);
  }
  return t || is_symb(line[x]);
}

int tainted(char **map, int y, int x, int h, int w) {
  int t = 0;
  if ((h - y) > 1) {
    t = tainted_x(map[y + 1], x, w);
  }
  if (y > 0) {
    t = t || tainted_x(map[y - 1], x, w);
  }

  return t || tainted_x(map[y], x, w);
}

int pow_ten(int n, int p) {
  while (p > 0) {
    n = n * 10;
    p--;
  }
  return n;
}

int main(int argc, char **argv) {
  FILE *in = fopen(argv[1], "r");
  char **map = malloc(SIZE * sizeof(char *));
  int **gears = malloc(SIZE * sizeof(int *));
  int h = 0;
  int w = 0;
  char *line = malloc(SIZE * sizeof(char));
  while (fscanf(in, "%s", line) == 1) {
    map[h] = line;
    printf("%s\n", map[h]);
    line = malloc(SIZE * sizeof(char));
    gears[h] = malloc(SIZE * sizeof(int));
    h++;
  }
  printf("last %s\n", map[h - 1]);
  w = strlen(map[h - 1]);

  int cur_number = -1;
  int cur_x;
  int cur_number_tainted = 0;
  int tainted_sum = 0;
  for (int y = h - 1; y >= 0; y--) {
    for (int x = w - 1; x >= 0; x--) {
      if (is_digit(map[y][x])) {
        if (cur_number == -1) {
          cur_number = map[y][x] - '0';
          cur_x = x;
        } else {
          cur_number += pow_ten(map[y][x] - '0', cur_x - x);
        }
        cur_number_tainted = cur_number_tainted || tainted(map, y, x, h, w);
      } else if (cur_number != -1) {
        if (cur_number_tainted) {
          tainted_sum += cur_number;
          printf("tainted: %d \n", cur_number);
        } else {
          printf("not tainted %d\n", cur_number);
        }
        cur_number_tainted = 0;
        cur_number = -1;
      }
    }
  }
  if (cur_number != -1 && cur_number_tainted == 1) {
    printf("tainted %d\n", cur_number);
    tainted_sum += cur_number;
  }
  printf("sum %d\n", tainted_sum);
  return 0;
}
