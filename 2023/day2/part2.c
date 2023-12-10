#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct hand {
  int r;
  int g;
  int b;
};

struct game {
  int id;
  int hand_count;
  struct hand *hands;
};

int main(int argc, char **argv) {
  FILE *input = fopen(argv[1], "r");
  char color[20];
  int game_count = 0;
  struct game * games[4000];
  int gid = 0;
  while (fscanf(input, " Game %d:", &gid) == 1) {
    struct game * current_game = malloc(sizeof(struct game));
    current_game->id = gid;
    current_game->hand_count = 0;
    struct hand * hands = malloc(1000*sizeof(struct hand));
    current_game->hands = hands;

    printf("game %d: ", current_game->id);
    while (1) {
      struct hand cur_hand;
      cur_hand.r = cur_hand.b = cur_hand.g = 0;
      char term_char = ' ';
      while (1) {
        int c;
        fscanf(input, "%d", &c);
        fscanf(input, "%s", color);
        char b = color[0];
        printf("h(%d, %d, %d), ", cur_hand.r, cur_hand.g, cur_hand.b);
        printf("('%c'->%d)", b, c);
        term_char = color[strlen(color) - 1];
        if (b == 'r') {
          cur_hand.r = c;
        } else if (b == 'g') {
          cur_hand.g = c;
        } else {
          cur_hand.b = c;
        }
        if (term_char != ',') {
          printf("h(%d, %d, %d)! ", cur_hand.r, cur_hand.g, cur_hand.b);
          break;
        }
      }
      current_game->hands[current_game->hand_count] = cur_hand;
      current_game->hand_count++;
      if (term_char != ';') {
        break;
      }
    }
    games[game_count] = current_game;
    game_count++;
    printf("\n");
  }

  int sum = 0;
  for (int i = 0; i < game_count; i++) {
    struct game *g = games[i];
    printf("g:%d:", g->id);
    int r = 0, gr = 0, b = 0;
    for (int j = 0; j < g->hand_count; j++) {
      struct hand h = g->hands[j];
      printf("h(%d,%d,%d)", h.r, h.g, h.b);
      if (h.r > r) {
        r = h.r;
      }
      if (h.b > b) {
        b = h.b;
      }
      if (h.g > gr) {
        gr = h.g;
      }
    }
    sum += r * gr * b;
    printf("\n");
  }
  printf("sum : %d\n", sum);
  return 0;
}
