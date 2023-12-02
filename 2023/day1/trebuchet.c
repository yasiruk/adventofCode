#include <stdio.h>

int main(int argc, char **argv) {
  FILE *input = fopen(argv[1], "r");
  int acc = 0;
  int cur = -1;
  int c;
  while ((c = fgetc(input)) != EOF) {
    printf("%c", c);
    if ((c >= '0') && (c <= '9')) {
      if (cur == -1) {
        printf("(+%c0)",c);
        acc += (c - '0') * 10;
      }
      cur = c - '0';
    } else if (c == '\n') {
      acc += cur;
      printf("(+%d)", cur);
      cur = -1;
    }
  };
  fclose(input);
  printf("%d\n", acc);
  return 0;
}
