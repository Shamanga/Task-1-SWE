package task;
//import java.util.List;

public interface ProductDAO1 {
	public void insert_product(Product Product);
	public void delete_product(String delID);
	public void update_product(Product upd_product );
	public void retrieve_product(String ret_man);
}
