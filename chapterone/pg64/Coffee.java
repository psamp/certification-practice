enum  CoffeeSize {

  BIG(8), HUGE(10), OVERWHELMING(16);

  private int ounces;

  CoffeeSize(int ounces) {
    this.ounces = ounces;
  }

  int getOunces() {
    return this.ounces;
  }

}

class Coffee {
  CoffeeSize size;

  Coffee(CoffeeSize size) {
    this.size = size;
  }

  public static void main(String[] args) {
    Coffee one = new Coffee(CoffeeSize.HUGE);
    Coffee two = new Coffee(CoffeeSize.BIG);

    System.out.println("One's size: " + one.size.getOunces());

    System.out.println("Two's size: " + two.size.getOunces());

    for (CoffeeSize size : CoffeeSize.values()) {
      System.out.println(size + " | " + size.getOunces());
    }

  }

}