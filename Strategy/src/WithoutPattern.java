public class WithoutPattern {
    public static void main(String[] args) {
        System.out.println(getPrice(200, "blackFriday"));
    }


    public static double getPrice(double originalPrice, String typePromotion) {
        // Discount when user preorder
        if (typePromotion.equalsIgnoreCase("preOrder"))
            return originalPrice * 0.8;

        // Normal discount
        if (typePromotion.equalsIgnoreCase("promotion"))
            return originalPrice <= 200 ? originalPrice * 0.9 : originalPrice - 30;

        // When black friday
        if (typePromotion.equalsIgnoreCase("blackFriday"))
            return originalPrice <= 200 ? originalPrice * 0.8 : originalPrice - 50;

        // 11.11 ?? roi sao
        // 10.10
        // 22.02


        // Default when not having any discount
        return originalPrice;
    }
}
