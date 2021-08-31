package lab01;

public class Stock {
  String symbol ;
  String name ;
  double previousClosingPrice ;
  double currentPrice ;

public Stock (String symbol, String name){
  this.symbol = symbol ;
  this.name = name ;
}
public double getChangePrecent(double previousClosingPrice, double currentPrice){
  this.previousClosingPrice = previousClosingPrice ;
  this.currentPrice = currentPrice ;

  double changePercentage;
  changePercentage = ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
  return changePercentage;
}
}
