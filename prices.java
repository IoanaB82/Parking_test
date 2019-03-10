public class Prices {

  public static Prices[] getPrices(){
    Prices[] pricesList = {
       new Price(1, 10.00, "Maximum 1 hour stay"),
       new Price(2, 30.00, "Between 1 hour and up to 5 hours"),
       new Price(3, 200.00, "Between 5 hours and up to 24 hours"),
       new Price(4, 1000.00, "Between 24 hours and up to 5 days"),
                           };
     return pricesList();
   }
}
/*
Cat1 = 10; slot price for 1 unit = 1 hour = 60min = 3600sec;
Cat2 = 30; slot price for time between 3601sec (1hour+) and 18000 sec=5 hours
Cat3 = 200; slot price for time between 18001 sec(5h+) and 86400 sec = 24h
Cat4 = 1000; slot price for time between 86401 sec (24h+) and 432000sec = 5days
*/
