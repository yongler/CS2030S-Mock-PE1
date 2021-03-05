class TakeACab extends Service {

  @Override 
  public int computeFare(Request request) {
    int fare = 33 * request.getDistance() + 200;
    return fare;
  }

  @Override
  public String toString() {
    return "TakeACab";
  }
}
