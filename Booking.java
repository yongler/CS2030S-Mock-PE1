class Booking implements Comparable<Booking> {
  private Car car;
  private Service service;
  private Request request;

  public Booking(Car car, Service service, Request request) {
    this.car = car;
    this.service = service;
    this.request = request;
  }

  @Override
  public int compareTo(Booking booking) {
    Integer k = this.service.getFare();
    Integer p = booking.service.getFare();
    int compareFare = (k.compareTo(p));
    if (compareFare == 0) {  
      Integer i = this.car.getCarTime();
      Integer j = booking.car.getCarTime();
      return i.compareTo(j);
    }
    return compareFare;
  }
}
