package Chess;

public class Spot {

  private piece piece;
  private int x;
  private int y;

  private SpotColor color;

  private boolean isOccupied;

  public Spot(piece piece, int x, int y, SpotColor color, boolean isOccupied) {
    this.piece = piece;
    this.x = x;
    this.y = y;
    this.color = color;
    this.isOccupied = isOccupied;
  }
  public Spot(int x, int y, SpotColor color, boolean isOccupied) {
    this.piece = null;
    this.x = x;
    this.y = y;
    this.color = color;
    this.isOccupied = isOccupied;
  }


  public piece getPiece() {
    return piece;
  }

  public void setPiece(piece piece) {
    this.piece = piece;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public SpotColor getColor() {
    return color;
  }

  public boolean isOccupied() {
    return isOccupied;
  }

  public void setOccupied(boolean isOccupied) {
    this.isOccupied = isOccupied;
  }










}
