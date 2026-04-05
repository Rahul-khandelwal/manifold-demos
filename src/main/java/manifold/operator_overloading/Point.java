package manifold.operator_overloading;

public record Point(int x, int y) {

  public Point plus(Point that) {
    return new Point(x + that.x, y + that.y);
  }

  public Point inc() {
    return new Point(x + 1, y + 1);
  }
}
