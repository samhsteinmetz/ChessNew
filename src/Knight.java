package Chess;

import java.util.ArrayList;

public class Knight extends piece {
  public Knight(int posx, int posy, boolean isWhite, boolean isAlive) {
    super(posx, posy, isWhite, isAlive);
  }

  @Override
  public boolean move(int posx, int posy) {
    return false;
  }

  @Override
  public ArrayList<Spot> possibleMoves() {
    return null;
  }
}
