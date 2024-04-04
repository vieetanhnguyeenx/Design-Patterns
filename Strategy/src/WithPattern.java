import java.util.Scanner;

public class WithPattern {
    public static void main(String[] args) {
        WithPattern strategy = new WithPattern();
        System.out.println(strategy.perform(200, DiscountType.BLACK_FRIDAY));
    }

    public enum DiscountType {
        DEFAULT {
            @Override
            double getDiscount(double originalPrice){
                return originalPrice;
            };
        },
        BLACK_FRIDAY {
            @Override
            double getDiscount(double originalPrice){
                return originalPrice <= 200 ? originalPrice * 0.8 : originalPrice - 50;
            };
        },
        PRE_ORDER {
            @Override
            double getDiscount(double originalPrice){
                return originalPrice * 0.8;
            };
        },
        PROMOTION {
            @Override
            double getDiscount(double originalPrice){
                return originalPrice <= 200 ? originalPrice * 0.9 : originalPrice - 30;
            };
        };

        abstract double getDiscount(double originalPrice);
    }

    public double perform(double originalPrice, DiscountType type) {
        return type.getDiscount(originalPrice);
    }


}

