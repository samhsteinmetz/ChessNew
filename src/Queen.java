package Chess;

import java.util.ArrayList;

public class Queen extends piece{

  public Queen(int posx, int posy, boolean isWhite, boolean isAlive) {
    super(posx, posy, isWhite, isAlive);
  }

  @Override
  public boolean move(int posx, int posy) {
    return false;
  }

  @Override
  public ArrayList<Spot> possibleMoves(Board currState) {


    return null;
  }


}
