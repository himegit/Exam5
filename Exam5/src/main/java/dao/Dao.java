package dao;

import java.sql.ResultSet;

public interface Dao {
	
	public String selectFirstName(String firstName);
	
	public ResultSet showCustomerInfo();
	
	public void deleteFilm(int film_id);
	
	public void insertCustomer(int film_id,String title,String description);
}
