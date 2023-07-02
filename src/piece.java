package Chess;

import java.util.*;

public abstract class piece {

  private int posx;
  private int posy;
  private boolean isWhite;
  private boolean isAlive;

  public piece(int posx, int posy, boolean isWhite, boolean isAlive) {
    this.posx = posx;
    this.posy = posy;
    this.isWhite = isWhite;
    this.isAlive = isAlive;
  }


  abstract public boolean move(int posx, int posy);

  abstract public ArrayList<Spot> possibleMoves(Board currState);

  public int getPosx() {
    return posx;
  }

  public int getPosy() {
    return posy;
  }

  public boolean getIsWhite() {
    return isWhite;
  }

  public boolean getIsAlive() {
    return isAlive;
  }

  public void setPosx(int posx) {
    this.posx = posx;
  }

  public void setPosy(int posy) {
    this.posy = posy;
  }

  public void setIsWhite(boolean isWhite) {
    this.isWhite = isWhite;
  }

  public void setIsAlive(boolean isAlive) {
    this.isAlive = isAlive;
  }

  public String toString() {
    return "piece [posx=" + posx + ", posy=" + posy + ", isWhite=" + isWhite + ", isAlive=" + isAlive + "]";
  }

















}
