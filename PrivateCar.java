class PrivateCar extends Car {

  public PrivateCar(String numberPlate, int time) {
    super(numberPlate, time);
  }

  @Override 
  public String toString() {
    String str = String.format("PrivateCar %s", super.toString());
    return str;
  }
}
