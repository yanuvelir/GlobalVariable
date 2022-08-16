
public class NewGlobalVariable
{
    public static final double percent = 10; //final делает глобальную переменную(переменная класса, Статичное поле класса)
                                            // не изменяемой
    public static void main(String[] args)
    {
        percent = 2*5;// После внедрения final перменная не изменяется
        double number = 25;
        System.out.println(number/100*percent);
    }


}
