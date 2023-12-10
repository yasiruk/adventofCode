#include <stdio.h>
#include <string.h>
int main(int argc, char **argv) {
  int arr[100] = {0};
  FILE *in = fopen(argv[1], "r");
  int c;
  int total = 0;
  int win_length = 10;
  int ticket_length = 25;
  while (fscanf(in, " Card %d:", &c) == 1) {
    for (int i = 0; i < 100; i++) {
      arr[i] = 0;
    }
    int n;
    int score = 0;
    printf("Card %d: ", c);
    for (int i = 0; i < win_length; i++) {
      fscanf(in, "%d", &n);
      printf("%d ", n);
      arr[n] = 1;
    }
    fscanf(in, " | ");
    for (int i = 0; i < ticket_length; i++) {
      fscanf(in, "%d", &n);
      printf("%d", n);
      if (arr[n] == 1) {
        printf("*");
        if (score == 0) {
          score = 1;
        } else {
          score *= 2;
        }
      }
      printf(" ");
    }
    printf(" -> %d %d\n", c, score);
    total += score;
  }
  printf("%d\n", total);
  return 0;
}