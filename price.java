//file to define the price categories for slots;
public class Price{
  int priceCat;
  double pricePrice;
  String priceTime;

//constructor
public Price(){

}

public Price(int iPriceCat, double iPricePrice,String iPriceTime){
  priceCat = iPriceCat;
  pricePrice = iPricePrice;
  priceTime = iPriceTime;
}

//get methods
public int getPriceCat(){
  return this.priceCat;
}

public double getPricePrice(){
  return this.pricePrice;
}
public String getPriceTime(){
  return this.priceTime;
}

}
