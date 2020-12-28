public class PrimitiveTypesChallenge {


    public static void main(String[] args){
        byte myNewByteVar  = 23;
        short myShortVar = 25424;
        int x = 25;
        long b = 50000 + 10*(myShortVar+myNewByteVar+myShortVar);
        System.out.println(b);

        short shotTotal = (short)(1000 + 10 * (myNewByteVar + myShortVar + x));
    }
}
