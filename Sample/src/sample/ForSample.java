package sample;

public class ForSample {

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i+=2) {
            if (i > 20) {
            //繰り返しから抜け出す
                break;
        }
        System.out.println(i);
        }

    }

}
