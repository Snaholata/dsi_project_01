import java.util.*;

public class product {
	private int productNum;
	private String productName;
	private double buy_price;
	private double sell_price;
	private int quantity;
	private double profit;
	
	public product () {
		productNum = 0;
		productName = "";
		buy_price = 0.0;		
		sell_price = 0.0;
        quantity=0;
        profit=0.0;
	}
	
	public product ( int n, String name, double bp, double sp, int qty, double proft) {
		productNum = n;
		productName = name;
		quantity = qty;
		buy_price = bp;
        sell_price = sp;
        quantity = qty;
        profit = proft;
	}

    public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getBuyPrice() {
		return buy_price;
	}

	public void setBuyPrice(double bp) {
		this.buy_price = bp;
	}

	public double getSellPrice() {
		return sell_price;
	}

	public void setSellPrice(double sp) {
		this.sell_price = sp;
    }

    public double getProfit() {
		return profit;
	}

	public void setProfit(double proft) {
		this.profit = proft;
    }



	
	public void addNewItem(product p) {
		this.productName = p.productName ;
		this.productNum = p.productNum ;
		this.quantity = p.quantity;
        this.buy_price = p.buy_price;
        this.sell_price = p.sell_price;
        this.profit = p.profit;
	}

    public void displayItems(ArrayList<product> arr) {
		
		for (product shop : arr) {
			System.out.println("---------------------------");
            System.out.format("%-15s%-20s%-25s%-25s%-15s%-15s\n","Item Number: ",
					"Product Name: ","Product Buy Price: ","Product Sell Price: ", 
                    "Quantity in Stock: ","Profit: ");
            System.out.format("%-15s%-20s%-25s%-25s%-20s%-15s\n",shop.getProductNum(),
            shop.getProductName (),shop.getBuyPrice(),shop.getSellPrice(),shop.getQuantity(),
            shop.getProfit());
			System.out.println("---------------:)--------------- ");
		}
		
	}

    public void displayBalance(double balance) {
		
        System.out.println("---------------------------");
        System.out.println("Balance: " + balance);

        System.out.println("--);------------------------- ");
    }
}
	