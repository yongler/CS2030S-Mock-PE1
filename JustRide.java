class JustRide extends Service {
  private int fare;

  @Override 
  public int computeFare(Request request) {
    int fare = 22 * request.getDistance();
    if (600 <= request.getTime() && request.getTime() <= 900) {
      fare += 500;
    }
    this.fare = fare;
    return fare;
  }

  @Override
  public String toString() {
    return "JustRide";
  }
}
