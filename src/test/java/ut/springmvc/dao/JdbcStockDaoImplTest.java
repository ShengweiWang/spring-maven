package ut.springmvc.dao;

import org.junit.Test;

import junit.framework.TestCase;
import ut.springmvc.model.Stock;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcStockDaoImplTest extends TestCase {
	
	@Test
	public void testDao () throws Exception {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Spring-Module.xml");
		
		Stock stock = new Stock("syb1", 3.5);
		StockDao stockDao = (StockDao) context.getBean("stockDAO");
		stockDao.save(stock);
	}
	
	
}
