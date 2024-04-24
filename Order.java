package e.commerce.system;

import javax.swing.JOptionPane;

public class Order{
   private int customerId;
   private int orderId;
   private double totalPrice;
     Product []Cart;

    public Order(int customerId, int orderId, Product[] Cart, double totalprice) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
this.totalPrice=Math.abs(totalprice);
        this.Cart = Cart;
    }
    public void printOrderInfo(){
        System.out.println("here is your orders summary :");
        System.out.println("orderId:"+orderId);
        System.out.println("customer ID:"+customerId);
        System.out.println("products:");
                 for(int i=0;i<Cart.length;i++){
          System.out.println( Cart[i].getName()+" - "+Cart[i].getPrice());
           totalPrice=totalPrice+Cart[i].getPrice();
        }
        System.out.println("Total price :"+totalPrice);
        
       
    }
   //for GUI
   public void printinfo(){
       String list="";
       for(int i=0;i<Cart.length && Cart[i]!=null;i++){
          list+=Cart[i].getName()+":"+Cart[i].getPrice()+"$"+"\n";
            totalPrice=totalPrice+Cart[i].getPrice();
       }
     JOptionPane.showMessageDialog(null,"Customr ID: "+customerId+"\n"+"Order ID: "+orderId+"\n"+list+"Total Price: "+totalPrice+"$");
   }
     
}