public class challenge
{
    public static void main (String[] args){
        double num1 = 20.00d;
        double num2 = 80.00d;
        double num3 = num1 + num2 *100.00d;
        System.out.println(num3);
        num3%=40;
        System.out.println(num3);

        boolean num4 = (num3 ==0 ) ? true: false;

        if(!num4){
            System.out.println("got some remainders");

        }




    }


}
