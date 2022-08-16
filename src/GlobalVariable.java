

public class GlobalVariable {

    public  static int coffe = 0;

    public static void main(String[] args)
    {
        coffe = 1;
        System.out.println("coffe = " + coffe);

        AddCoffe();
        System.out.println("coffe = " + coffe);

        DrinkCoffe();
        System.out.println("coffe = " + coffe);
    }

    public static void AddCoffe()
    {
        coffe ++;
    }

    public static void DrinkCoffe()
    {
        coffe = 0;
    }

}
