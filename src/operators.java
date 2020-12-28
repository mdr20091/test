public class operators {

    public static void main(String[] args) {


        int result = 3; // 1+2 =3
        System.out.println("1+2 = " + result);
        int printpreviousresult = result;
        System.out.println("pervoiusResult= " + printpreviousresult);
        result = result - 1;
        System.out.println("My result is =" + result);
        System.out.println("printpreviousresult= " + printpreviousresult);

        result = result * 10; //2 *10 =20
        System.out.println(result);


        result = result / 5;
        System.out.println("20/5= " + result);


        result = result % 3;  // gives out the remainder
        System.out.println(result);

        result++; // 1+1=2
        System.out.println("1+1 = +" + result);
        result--; //2-1=1
        System.out.println("--- = " + result);

        result += 2; //1+2=3
        System.out.println("1+2 = " + result);

        result *= 10;
        System.out.println("result times 10=" + result);
        //result = reslut / 3
        result /= 3; // 30 /3 ==10
        System.out.println("30/3= " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("and I'm scared");
        }
        int topScore = 100;
        if (topScore == 100) {

            System.out.println("you win!");
        }
        int secondScore = 95;
        if (topScore > secondScore && topScore < 100) {
            System.out.println("greater than second top score and less than 100");
        }
        if ((topScore > 90) || (secondScore <= 90)) {
            System.out.println("this greater thank the number");
        }
        int newValue = 50;
        if ( newValue == 50 ){
            System.out.println("this is an error");
        }
        boolean isCar = false;
        if(isCar==false){
            System.out.println("this is not supposed to happen");

        }
        //car above is true
        isCar =true;
        //since car above is true run true
        boolean wasCar = isCar ? true:false;
        if (wasCar==true) {
            System.out.println("wasCar is true");

        }




































    }


}
