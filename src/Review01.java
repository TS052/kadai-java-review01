
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        int result;
        result = tax(price,0.1);
        int cost = price + result ; 
        System.out.println(price + "円の商品の税込価格は"+ cost +"円（消費税は"+(int)result+"円）です。");

    }
    
    public static int tax(int p, double t) {
        int result = (int)Math.floor(p * t);
        return result;
    }
}
