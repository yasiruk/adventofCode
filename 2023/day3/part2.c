#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define SIZE 140
#define T_GEAR 0b10
#define T_SYMB 0b01
#define T_NONE 0b00

struct taint_search
{
  int x;
  int y;
  int type;
};

int is_digit(char s) { return (s >= '0') && (s <= '9'); }
int is_symb(char s) { return s == '*'; }
void tainted_x(char *line, int x, int w, struct taint_search *ts)
{
  if (w - x > 1 && line[x + 1] == '*')
  {
    ts->x = x + 1;
    ts->type = T_GEAR;
  }
  if (x > 0 && line[x - 1] == '*')
  {
    ts->x = x - 1;
    ts->type = T_GEAR;
  }

  if (line[x] == '*')
  {
    ts->x = x;
    ts->type = T_GEAR;
  }
}

void tainted(char **map, int y, int x, int h, int w, struct taint_search *ts)
{
  if ((h - y) > 1)
  {
    tainted_x(map[y + 1], x, w, ts);
    if (ts->type == T_GEAR)
    {
      ts->y = y + 1;
    }
  }
  if (y > 0 && ts->type != T_GEAR)
  {
    tainted_x(map[y - 1], x, w, ts);
    if (ts->type == T_GEAR)
    {
      ts->y = y - 1;
    }
  }
  if (ts->type != T_GEAR)
  {
    tainted_x(map[y], x, w, ts);
    if (ts->type == T_GEAR)
    {
      ts->y = y;
    }
  }
}

int pow_ten(int n, int p)
{
  while (p > 0)
  {
    n = n * 10;
    p--;
  }
  return n;
}

int main(int argc, char **argv)
{
  FILE *in = fopen(argv[1], "r");
  char **map = malloc(SIZE * sizeof(char *));
  int **gears = malloc(SIZE * sizeof(int *));
  int h = 0;
  int w = 0;
  char *line = malloc(SIZE * sizeof(char));
  while (fscanf(in, "%s", line) == 1)
  {
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
  int tainted_sum = 0;
  struct taint_search last_taint;
  last_taint.type = T_NONE;

  for (int y = h - 1; y >= 0; y--)
  {
    for (int x = w - 1; x >= 0; x--)
    {
      if (is_digit(map[y][x]))
      {
        struct taint_search ts;
        ts.type = T_NONE;
        if (cur_number == -1)
        {
          cur_number = map[y][x] - '0';
          cur_x = x;
        }
        else
        {
          cur_number += pow_ten(map[y][x] - '0', cur_x - x);
        }
        tainted(map, y, x, h, w, &ts);
        if (ts.type == T_GEAR)
        {
          last_taint = ts;
        }
      }
      else if (cur_number != -1)
      {
        if (last_taint.type == T_GEAR)
        {
          if (gears[last_taint.y][last_taint.x] == 0)
          {
            gears[last_taint.y][last_taint.x] = -cur_number;
          }
          else
          {
            gears[last_taint.y][last_taint.x] *= -cur_number;
          }
        }
        cur_number = -1;
        last_taint.type = T_NONE;
      }
    }
  }

  if (cur_number != -1 && last_taint.type == T_GEAR)
  {
    if (gears[last_taint.y][last_taint.x] == 0)
    {
      gears[last_taint.y][last_taint.x] = -cur_number;
    }
    else
    {
      gears[last_taint.y][last_taint.x] *= -cur_number;
    }
  }
  for (int i = 0; i < h; i++)
  {
    for (int j = 0; j < w; j++)
    {
      if (gears[i][j] > 0)
      {
        tainted_sum += gears[i][j];
      }
    }
  }
  printf("sum %d\n", tainted_sum);
  return 0;
}
