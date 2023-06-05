
public class Product
{
	     String name;
	     double price;
	     int quantity;
	     static int totalSold;

	    public Product(String name, double price, int quantity) 
	    {
	        this.name = name;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    public void sell(int quantity) 
	    {
	       if (quantity <= this.quantity) 
	       {
	          this.quantity -= quantity;
	          totalSold += quantity;
	          System.out.println(quantity + " " + name +" Sold "+"---"+" Remaining quantity:"+this.quantity);
	       } 
	       else 
	       {
	             System.out.println("Not enough quantity in "+name +" to sell "+quantity+ ".");
	       }
	    }
	    public static int getTotalSold() 
	    {
	    	return totalSold;
	    }
	    public static void main(String[] args) 
	    {
	        Product p1 = new Product("Product-1", 100, 30);
	        Product p2 = new Product("Product-2", 200, 18);
	        Product p3 = new Product("Product-3", 150, 46);

	        p1.sell(15);
	        p2.sell(10);
	        p3.sell(7);
	        System.out.println("Ans:Total quantity of Product Sold is:-" +Product.getTotalSold());
	    }
}

