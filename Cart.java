package e.commerce.system;
public class Cart {
   Product []Cart;
    int customerId;
      int NProducts;

    public Cart(int customerId, int NProducts) {
        this.customerId = Math.abs(customerId);
        this.NProducts = Math.abs(NProducts);
        this.setNProducts(NProducts);
    }
    String[]products=new String[NProducts];


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getNProducts() {
        return NProducts;
    }

    public void setNProducts(int NProducts) {
        this.NProducts = Math.abs(NProducts);
        Cart=new Product[this.NProducts];
    }
int x=0;
public void addproduct(Product prod){
    Cart[x]=prod;
    x++;
}
public void removeproduct(Product p2){
for(int i=0;i<Cart.length;i++){
    if(Cart[i].equals(p2)){
        for(int j=i;j+1<Cart.length;j++){
            Cart[j]=Cart[j+1];
        }
        Cart[(Cart.length)-1]=null;
                x--;
                NProducts--;
                break;
    }
            }
}
double total=0;
        public void calculateprice(){
            for(int i=0;i<NProducts;i++){

                total+=Cart[i].getPrice();
            }
         
        }
public void placeorder(){
  Order o=new Order( customerId,1,Cart,total);  
}




}  

