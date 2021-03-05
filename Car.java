class Car {
  private String numberPlate;
  private int time;

  public Car(String numberPlate, int time) {
    this.numberPlate = numberPlate;
    this.time = time;
  }

  @Override 
  public String toString() {
    String timeStr = this.time > 1 ? "mins" : "min";
    String str = String.format("%s (%d %s away)", this.numberPlate, this.time, timeStr);
    return str;
  }
 
  public int getCarTime() {
    return this.time;
  }
}
