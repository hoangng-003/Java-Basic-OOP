public class Rectangle extends Shape {
  protected double width;
  protected double length;

  public Rectangle() {
  }

  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  /**
   * this is comment != 0.
   *
   * @this is comment != 0.
   */

  public Rectangle(double width, double length, String color, boolean filled) {
    super(color, filled);
    this.width = width;
    this.length = length;
  }

  public double getWidth() {
    return this.width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return this.length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  @Override
  public double getArea() {
    return width * length;
  }

  @Override
  public double getPerimeter() {
    return 2 * (width + length);
  }

  @Override
  public String toString() {
    return "Rectangle[width=" + width + ",length=" + length
        + ",color=" + super.color + ",filled=" + super.filled + "]";
  }

}
