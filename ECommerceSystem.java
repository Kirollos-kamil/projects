    package e.commerce.system;
import java .util.Scanner;
    import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
 
public class ECommerceSystem {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);  
    Product p1=new BookProduct("O’Reilly","X Publications",3,"OOP",39.99);
    Product p2=new ClothingProduct("medium","cotton",2,"T_shirt",19.99);
    Product p3=new ElectronicProduct("Samsung",1,1,"smartphone",599.9);
//    //without GUI
//    Customer e1 = new Customer(23012112,"kirollos_kamil_kamel","address");
//    System.out.println("welcome to the E-commerce system! ");
//       System.out.println("please enter your name");
//      String n=input.nextLine();
//       System.out.println("please enter yout id");
//       int i=input.nextInt();
//       System.out.println("please enter your address");
//    String address =input.next();
//    System.out.println("how many products you want to add to your cart ?");
//     int y=input.nextInt();
//     Cart c1=new Cart(i,y);
//    for(int j=0;j<y;j++){
//      System.out.println("which product would you like to add? 1- smartphone 2- T-shirt 3-oop");
//       int l=input.nextInt();
//      if(l==1){
//          c1.addproduct(p3);
//      }else if(l==2){
//          c1.addproduct(p2);
//     }else {
//        c1.addproduct(p1);
//     } 
//    }Order o1=new Order(i,1,c1.Cart,c1.total);
//    c1.calculateprice();
//        System.out.println("your total is $"+c1.total+" would you like to place the order ? 1- YES 2- NO");
//          int z=input.nextInt();
//       if(z==1){
//             c1.placeorder();
//                         o1.printOrderInfo();
//         }else if(z==2){
//               System.out.println("thank you ");
//           }else{
//             System.out.println("invalid choice");
//
//    }


    
//GUI
int x= Integer.parseInt( JOptionPane.showInputDialog("welcome to the E-commerce System! \n please enter your ID"));
 String y=  JOptionPane.showInputDialog("please enter your name");
 String z=JOptionPane.showInputDialog("please enter your address");
     int f=Integer.parseInt(JOptionPane.showInputDialog("how many products you want to add to your cart ?"));
 Cart c1=new Cart(x,f);
  for(int j=0;j<f;j++){
      String[] answers={"smartphone ","T-shirt","oop"};
     int d= JOptionPane.showOptionDialog(null,"which product would you like to add?" ,null, JOptionPane.YES_NO_CANCEL_OPTION, 0, null, answers, 0);
       if(d==0){
           c1.addproduct(p3);
       }else if(d==1){
           c1.addproduct(p2);
       }else {
           c1.addproduct(p1);
     } 
  }
  Order o1=new Order(x,1,c1.Cart,c1.total);
   c1.calculateprice();
 int k=  JOptionPane.showConfirmDialog(null, "your total is $"+c1.total+
           "would you like to place the order ? 1- YES 2- NO", null, JOptionPane.YES_NO_OPTION);
   if(k==0){
        c1.placeorder();
        o1.printinfo();
   }
   else if(k==1){
       JOptionPane.showMessageDialog(null,"Thank you", null, JOptionPane.PLAIN_MESSAGE);
   }
   else{
       JOptionPane.showMessageDialog(null,"invalid", null, JOptionPane.PLAIN_MESSAGE);
  }
}
}


