public class Main {
    public static void main(String[] args) {
        ShopFacade.getInstance().buyProductByCashWithFreeShipping("Doiden@gmail.com");

        ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("KhongE@gmail.com", "0123456789");
    }
}
