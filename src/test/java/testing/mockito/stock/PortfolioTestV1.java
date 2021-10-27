package testing.mockito.stock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;


public class PortfolioTestV1 {
  // Variant without annotations
  public static void main(String[] args){
    Portfolio portfolio = new Portfolio();
    StockService stockService = mock(StockService.class);

    portfolio.setStockService(stockService);

    List<Stock> stocks = new ArrayList<Stock>();
    Stock googleStock = new Stock("1","Google", 10);
    stocks.add(googleStock);
    portfolio.setStocks(stocks);

    when(stockService.getPrice(googleStock)).thenReturn(50.00);
    double marketValue = portfolio.getMarketValue();
    System.out.println((marketValue == 500));
  }

}
