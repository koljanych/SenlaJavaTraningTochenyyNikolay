package Task3_2;

public class RandomNat {
private int nat = new java.util.Random().nextInt(900)+99;
    
    void number(){
        int nat2 = (nat/100)+((nat%100)/10)+(((nat%100)%10));
        System.out.println(nat);
        System.out.println(nat2);
}
}