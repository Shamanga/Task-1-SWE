package task;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import java.util.List;
import javax.swing.JOptionPane;



public class DAO {
	
	public void insert_product(Product ins_product){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/equipment", "root", "");
			PreparedStatement psmt = conn.prepareStatement("insert into product values (?,?,?,?,?)");
			
			psmt.setString(1, ins_product.getProductID());
			psmt.setString(2, ins_product.getType());
			psmt.setString(3, ins_product.getManufacturer());
			psmt.setString(4, ins_product.getPDate());
			psmt.setString(5, ins_product.getEdate());
			
			int i = psmt.executeUpdate();
			if (i > 0) {
				JOptionPane.showMessageDialog(null, "Product was successfully added");
			}
			else {
				JOptionPane.showMessageDialog(null, "Product was not added");
			}
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	
	public void delete_product(String delID)
	
	{		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/equipment", "root", "");
		PreparedStatement psmt_del = conn.prepareStatement("delete from product where ProductID=?");
		psmt_del.setString(1,delID);
		
		int i = psmt_del.executeUpdate();
		
		if (i > 0) 
			{
			JOptionPane.showMessageDialog(null, "Product was deleted succesfully ");
			}
		else 
			{
			JOptionPane.showMessageDialog(null, "Product was not deleted");
			}
		}
			catch (Exception e) {
		JOptionPane.showMessageDialog(null, e);
	}
	
	}
	
	
	public void update_product(Product upd_product )
	
	
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/equipment", "root", "");
		PreparedStatement psmt_upd = conn.prepareStatement("update product set Type = ?,Manufacturer=?,Production_date=?,expiry_date=? where ProductID=?");
		
		psmt_upd.setString(5, upd_product.getProductID());
		psmt_upd.setString(1, upd_product.getType());
		psmt_upd.setString(2, upd_product.getManufacturer());
		psmt_upd.setString(3, upd_product.getPDate());
		psmt_upd.setString(4, upd_product.getEdate());
		
		int i = psmt_upd.executeUpdate();
		
		if (i > 0) 
			{
			JOptionPane.showMessageDialog(null, "Product was updated succesfully ");
			}
		else 
			{
			JOptionPane.showMessageDialog(null, "Product was not updated");
			}
		}
			catch (Exception e) {
		JOptionPane.showMessageDialog(null, e);
								}
	}
	
	
	public void retrieve_product(String ret_man)
	{
		try
		{
			
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/equipment", "root", "");
		PreparedStatement psmt_ret = conn.prepareStatement("select * from product where Manufacturer = ?");
		psmt_ret.setString(1, ret_man);
		ResultSet rs =  psmt_ret.executeQuery();
		
		int counter = 0 ;
		
		while(rs.next())
			{
			
			String p_id = rs.getString(1);
		    String p_type = rs.getString(2);
		    String p_manu = rs.getString(3);
		    String p_pd = rs.getString(4);
		    String p_ed = rs.getString(5);
		 
		    String output = "Product #%d: Product ID: %s - Type: %s - Manufacturer: %s - Production Date:%s - Expiry Date: %s";
		    System.out.println(String.format(output, ++counter, p_id, p_type, p_manu, p_pd , p_ed));
			}
		
		
		
		
		}
			catch (Exception e) {
		JOptionPane.showMessageDialog(null, e);
								}
	}



	}
	
	
	
	
	

