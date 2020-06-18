public class Application {
    public static void main(String[] args) {
        byte valueByte1 = 2;
        byte valueByte2 = 6;
        byte res1 = (byte) (valueByte1 + valueByte2);
        System.out.println(res1);

        int a = 10;
        int b = 20;
        int res2 = a * b;
        System.out.println(res2);

        long valueLong1 = 10000;
        long valueLong2 = 700;
        long res3 = valueLong1 - valueLong2;
        System.out.println(res3);

        double valueDouble1 = 1.1;
        double valueDouble2 = 0.1;
        double res4 = valueDouble1/valueDouble2;
        System.out.println(res4);

        float valueFloat1 = 222.55F;
        float valueFloat2 = 1.25F;
        float res5 = valueFloat1 + valueFloat2;
        System.out.println(res5);
        
        short valueShort1 = 1;
        short valueShort2 = 2;
        short res6 = (short) (valueShort1 + valueShort2);
        System.out.println(res6);
    }
}
