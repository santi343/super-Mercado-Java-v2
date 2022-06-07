package supermercado;

/**
 * Producto
 */
public abstract class Producto implements Comparable<Producto> {

  protected String name;
  protected int price;

  public Producto(String name, int price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public int compareTo(Producto arg0) {
    return 0;
  }
}
