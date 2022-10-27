import java.util.*;

public class choice {
    static void menu() {
		System.out.println("1 - Add Product ");
		System.out.println("2 - Buy Product");
		System.out.println("3 - Sell Product");
        System.out.println("4 - Delete Product ");
		System.out.println("5 - List of stock");
        System.out.println("6 - Available balance");
		System.out.println("0 - Exit");
	}

    public static void main(String[] args) {
		int choice;
        double balance = 0.0;
		
		Scanner sc = new Scanner(System.in);
		ArrayList<product> shopList = new ArrayList<product>();

        do {
			
			product p = new product();
			menu();
			choice = sc.nextInt();
			switch (choice) {
		
			case 1:

				System.out.println("Enter Product No");
				p.setProductNum(sc.nextInt());
				
				System.out.println("Enter Product Name");
				sc = new Scanner(System.in);
				String t = sc.next();
				p.setProductName(t);
				
                System.out.println("Enter Product Quantity");
				p.setQuantity(sc.nextInt());

				System.out.println("Enter Item buy price");
				p.setBuyPrice(sc.nextDouble());

                System.out.println("Enter Item sell price");
				p.setSellPrice(sc.nextDouble());
				
                p.setProfit(0.0);
                p.addNewItem(p);
				shopList.add(p);
            
				
				break;


            case 2:

                System.out.println("Which Product would you like to buy?");
                product b = shopList.get(sc.nextInt());

                System.out.println("Enter Product quantity");
				int add = sc.nextInt();
				b.setQuantity(b.getQuantity() + add);
                balance = balance - b.getBuyPrice();
			
                break;

            case 3:

                System.out.println("Which Product you sold?");
                product s = shopList.get(sc.nextInt());

                System.out.println("Enter Product quantity that you sold");
                try{
                    int no = sc.nextInt();
                    if(no < s.getQuantity()){
                        double prof = s.getSellPrice() - s.getBuyPrice();
				        s.setProfit(s.getProfit()+no * prof);
                        s.setQuantity(s.getQuantity()-no);
                        balance = balance + no * s.getSellPrice();
                    }
                }
                catch(Exception e) {
					System.out.println("Product out of bound");
				}
            
                break;

            case 4:
	
				System.out.println("Which Product would you like to delete?");
				
				int i = sc.nextInt();
				product r = shopList.get(i);
				shopList.remove(r);
				
				break;


            case 5:

				p.displayItems(shopList);
				if (shopList.size()== 0) {
					System.out.println("Empty");
				}

			    break;

            case 6:

				p.displayBalance(balance);
				if (balance == 0.0) {
					System.out.println("Sell some products");
				}

			    break;
			    
            }
        }
        while (choice!= 0);
		System.out.println("End!");
    }
}
