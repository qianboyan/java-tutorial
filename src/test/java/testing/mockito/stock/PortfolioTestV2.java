package testing.mockito.stock;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PortfolioTestV2 {
  // Variant 2 with annotations

  @InjectMocks
  Portfolio portfolio = new Portfolio();

  @Mock
  StockService stockService;

  @Test
  public void PortfolioTest(){
    // portfolio.setStockService(stockService);

    List<Stock> stocks = new ArrayList<Stock>();
    Stock googleStock = new Stock("1","Google", 10);
    stocks.add(googleStock);
    portfolio.setStocks(stocks);

    when(stockService.getPrice(googleStock)).thenReturn(50.00);
    double marketValue = portfolio.getMarketValue();
    Assert.assertEquals(500, marketValue, 0.0);
  }

}
