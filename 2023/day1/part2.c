#include <stdio.h>
#include <stdlib.h>
#include <string.h>

const char *nums[] = {"one", "two",   "three", "four", "five",
                      "six", "seven", "eight", "nine"};

int getNum(const char *str, int *inc);

int main(int argc, char **argv) {
  FILE *input = fopen(argv[1], "r");
  char *contents;
  fseek(input, 0L, SEEK_END);
  long file_size = ftell(input);

  fseek(input, 0, SEEK_SET);

  contents = (char *)calloc(file_size, sizeof(char));

  fread(contents, sizeof(char), file_size, input);

  fclose(input);

  printf("%ld\n%s", file_size, contents);

  int acc = 0;
  int lastNum = -1;
  char *ptr = contents;
  while (*ptr != '\0') {
    char c = *ptr;
    int num = 0;
    printf("%c", c);
    int inc = 0;
    if ((c >= '0') && (c <= '9')) {
      num = c - '0';
      inc = 1;
    } else {
      num = getNum(ptr, &inc);
    }

    if (num > 0) {
      if (lastNum == -1) {
        printf("(%d)", 10 * num);
        acc += 10 * num;
      }
      lastNum = num;
    }
    ptr += inc;
    if (*ptr == '\n') {
      acc += lastNum;
      printf("(+%d)", lastNum);
      lastNum = -1;
    }
  };
  printf("%d\n", acc);
  return 0;
}

int getNum(const char *str, int *inc) {
  for (int i = 0; i < 9; i++) {
    int len = strlen(nums[i]);
    if (strncmp(str, nums[i], len) == 0) {
      *inc = 1;
      printf("(d%d)", i + 1);
      return i + 1;
    }
  }
  *inc = 1;
  return 0;
}
