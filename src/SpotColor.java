package Chess;

import java.awt.Color;

public enum SpotColor {

  BLACK(Color.BLACK), WHITE(Color.WHITE);

  private Color color;

  private SpotColor(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }


}
