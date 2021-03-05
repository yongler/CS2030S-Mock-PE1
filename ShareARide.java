class ShareARide extends Service {

  @Override 
  public int computeFare(Request request) {
    int fare = 50 * request.getDistance();
    if (600 <= request.getTime() && request.getTime() <= 900) {
      fare += 500;
    }
    return fare / request.getNumOfPassengers();
  }

  @Override
  public String toString() {
    return "ShareARide";
  }
}
