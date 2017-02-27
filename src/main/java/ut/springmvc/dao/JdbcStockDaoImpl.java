package ut.springmvc.dao;


//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;

import javax.sql.DataSource;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ut.springmvc.model.Stock;


public class JdbcStockDaoImpl extends HibernateDaoSupport implements StockDao {
//	private DataSource dataSource;
	
//	public void setDataSource (DataSource dataSource) {
//		this.dataSource = dataSource;
//	}
	
	public void save(Stock stock) {
		getHibernateTemplate().save(stock);
//		String exec = "INSERT INTO stock_price " + "(name, time, price)  VALUES (?, ?, ?)";
////                String.format("INSERT INTO stock_price VALUES ('%s', '%s', %f);",
////                		stock.getSymbol(), stock.getTimeStamp(), stock.getPrice());
//		Connection conn = null;
//		
//		try {
//			System.out.println(dataSource.toString());
//			conn = dataSource.getConnection();
//			PreparedStatement ps = conn.prepareStatement(exec);
//			ps.setString(1, stock.getSymbol());
//			ps.setString(2, stock.getTimeStamp());
//			ps.setDouble(3, stock.getPrice());
//			ps.executeUpdate();
//			ps.close();
//			
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} finally {
//			if (conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					
//				}
//			}
//		}
		
	}
	public void update(Stock stock) {
		
	}
	public void delete(Stock stock) {
		
	}
	public Stock findByStockCode(String stockCode) {
		return null;
	}
	
}
