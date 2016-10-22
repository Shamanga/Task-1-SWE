package task;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
	int x = 1;
		while( x == 1)
	{
		System.out.println("What command would you like to use ? ");
		System.out.println("1 - Insert a new product ");
		System.out.println("2 - Delete a product using Product ID ");
		System.out.println("3 - Update a product using Product ID ");
		System.out.println("4 - Retrieve all products under a certain manufacturer name ");
		Scanner scanIn_switch = new Scanner(System.in);
		
		String criteria = scanIn_switch.nextLine();
	//	scanIn_switch.close();
		
		switch(criteria)
		{ case "1" :
				System.out.println("Enter Product ID: ");
				//Scanner scanIn_I = new Scanner(System.in);
				String prod_id_i = scanIn_switch.nextLine();
				System.out.println("Enter product type: ");
				String prod_type_I = scanIn_switch.nextLine();
				System.out.println("Enter Manufacturer Name: ");
				String man_name_i = scanIn_switch.nextLine();
				System.out.println("Enter Production Date: ");
				String prod_date_i = scanIn_switch.nextLine();
				System.out.println("Enter Expire Date: ");
				String exp_date_i = scanIn_switch.nextLine();
			//	scanIn_switch.close();
				Product insert_prod = new Product(prod_id_i);
				insert_prod.setType(prod_type_I);
				insert_prod.setManufacturer(man_name_i);
				insert_prod.setPDate(prod_date_i);
				insert_prod.setEDate(exp_date_i);
				DAO insert_test = new DAO();
				insert_test.insert_product(insert_prod);
		  break;
		  
		case"2":
				DAO delete_test= new DAO();
				System.out.println("Enter Product ID: ");
				String prod_id;
			//	Scanner scanIn_D = new Scanner(System.in);
				prod_id = scanIn_switch.nextLine();
			//	scanIn_switch.close();
				delete_test.delete_product(prod_id);
		break;
		
		case"3":
			
				System.out.println("Enter Product ID you want to update: ");
			//	Scanner scanIn_u = new Scanner(System.in);
				String prod_id_u = scanIn_switch.nextLine();
				System.out.println("Enter product type: ");
				String prod_type_u = scanIn_switch.nextLine();
				System.out.println("Enter Manufacturer Name: ");
				String man_name_u = scanIn_switch.nextLine();
				System.out.println("Enter Production Date: ");
				String prod_date_u = scanIn_switch.nextLine();
				System.out.println("Enter Expire Date: ");
				String exp_date_u = scanIn_switch.nextLine();
			//	scanIn_switch.close();
				Product upda_product = new Product(prod_id_u);
				upda_product.setType(prod_type_u);
				upda_product.setManufacturer(man_name_u);
				upda_product.setPDate(prod_date_u);
				upda_product.setEDate(exp_date_u);		
				DAO update_test = new DAO();
				update_test.update_product(upda_product);
		break;
		
		case"4":
				DAO retrieve_test = new DAO();
				System.out.println("Enter Manufacturer name: ");
				String man_name;
			//	Scanner scanIn_R = new Scanner(System.in);
				man_name = scanIn_switch.nextLine();
			//	scanIn_switch.close();
				retrieve_test.retrieve_product(man_name);
		break;
		
		default :
            System.out.println("Invalid number entered");
		}	
		
	}
		
	}

}
