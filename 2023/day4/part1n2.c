#include <stdio.h>
#include <string.h>
int main(int argc, char **argv) {
  int arr[100] = {0};
  FILE *in = fopen(argv[1], "r");
  int c;
  int total = 0;
  int win_length = 10;    // input :10, example 5
  int ticket_length = 25; // input: 25, example 8
  int scores[193] = {0};
  int copies[193] = {0};

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
    printf("|");
    for (int i = 0; i < ticket_length; i++) {
      fscanf(in, "%d", &n);
      printf("%d", n);
      if (arr[n] == 1) {
        printf("*");
        score++;
      }
      printf(" ");
    }
    printf(" -> %d %d\n", c, score);
    scores[c] = score;
    total += score;
  }

  int total_copies = 0;
  for (int i = 1; i <= c; i++) {
    copies[i] += 1;
    printf("Card %d (%d) %d\n", i, scores[i], copies[i]);
    int limit = i + scores[i];
    if (limit > c) {
      limit = c;
    }
    for (int j = i + 1; j <= limit; j++) {
      copies[j] += copies[i];
    }
    total_copies += copies[i];
  }
  printf("%d\n", total_copies);
  return 0;
}