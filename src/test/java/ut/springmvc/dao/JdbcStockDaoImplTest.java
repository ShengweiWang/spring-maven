package ut.springmvc.dao;

import java.sql.Timestamp;

<<<<<<< HEAD


=======
>>>>>>> ad2e6a53680d22418f2d5dbe84349a0e80705468
import org.junit.Test;

import junit.framework.TestCase;
import ut.springmvc.bo.StockBo;
import ut.springmvc.model.Stock;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcStockDaoImplTest extends TestCase {
	
	@Test
	public void testDao () throws Exception {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		
		StockBo stockBo = (StockBo) context.getBean("stockBo");
		Stock stock = new Stock();
		stock.setName("syb2");
		stock.setPrice(5.5);
		stock.setTime(new Timestamp(System.currentTimeMillis()).toString());
		
		stockBo.save(stock);
	}
	
	
}
