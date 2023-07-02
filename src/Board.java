package Chess;

import java.util.*;

public class Board {

  private static final int BOARD_SIZE = 8;

  private Spot[][] spots;

  public Board() {
    this.spots = new Spot[BOARD_SIZE][BOARD_SIZE];
    this.resetBoard();
  }

  public Spot getSpot(int x, int y) {
    return spots[x][y];
  }


  public void resetBoard() {
    // initialize white pieces









  }
}
