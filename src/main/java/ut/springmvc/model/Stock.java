package ut.springmvc.model;

//import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Basic data model class, represent the stock information
 * of a specific company at a specific time
 * @author Shengwei_Wang
 * refer : http://www.jarloo.com/yahoo_finance/
 */
public class Stock {
    private String name;
    private double price;
    private String time;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
    
}