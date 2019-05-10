package cc.moecraft.school.chapter3.product;

public class ProductPrinter
{
    public static void main(String[] args)
    {
        Product toaster = new Product("Toaster", 29.95d);
        Product roaster = new Product("Roaster", 90.17d);

        System.out.println("Toaster: " + toaster);
        System.out.println("Roaster: " + roaster);

        toaster.reducePrice(5d);
        roaster.reducePrice(5d);

        System.out.println("After reduce, expected: 24.95, 85.17;");
        System.out.println("Toaster: " + toaster);
        System.out.println("Roaster: " + roaster);
    }
}
