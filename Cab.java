class Cab extends Car {

  public Cab(String numberPlate, int time) {
    super(numberPlate, time);
  }

  @Override 
  public String toString() {
    String str = String.format("Cab %s", super.toString());
    return str;
  }

}
