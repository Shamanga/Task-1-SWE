package task;

public class Product {
	private String ProductID ;
	private String Type;
	private String Manufacturer ;
	private String Production_date;
	private String expiry_date;
	
		public Product(String ProductID)
			{
				this.ProductID= ProductID;
			}
		public void setType(String Type)
			{
				this.Type = Type ;
			}
		public void setManufacturer(String Manufacturer)
			{
				this.Manufacturer=Manufacturer ;
			}
		public void setPDate(String Production_date)
			{
				this.Production_date=Production_date;
			}
		public void setEDate(String expiry_date)
			{
				this.expiry_date = expiry_date;
			}
		public String getProductID()
			{
				return(this.ProductID);
			}
		public String getType()
			{
				return(this.Type);
			}
		public String getManufacturer()
			{
				return(this.Manufacturer);
			}
		public String getPDate()
			{
				return(this.Production_date);
			}
		public String getEdate()
			{
				return(this.expiry_date);
			}
}
