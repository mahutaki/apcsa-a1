public class Milkshake extends MenuItem {
    private boolean hasChoco;

    public Milkshake(String n, double p, boolean c){
        super(n+" milkshake",p);
        hasChoco=c;
    }

    public void setChocolate(boolean c){
        hasChoco = c;
    }

    public double getTotalPrice(){
        if (hasChoco==true){
            return getPrice()*2;
        }
        else {
            return getPrice();
        }
    }

    public String toString(){
        return "Thank you for visiting our food truck. Enjoy your "+getName()+".";
    }
}