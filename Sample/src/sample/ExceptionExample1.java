package sample;

import java.security.PublicKey;

public class ExceptionExample1 {

    public static void main(String[] args) {
        System.out.println("処理開始");
        
        try {
        //ここに例外の可能性のあるコードを書く
            System.out.println("割り算開始");
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            //ArithmeticExceptionが起きた時の処理
            System.out.println("ArithmeticExceptionが発生：" + e.getMessage());
        }finally {
            //例外の有無に関係なく実行されるコード
            System.out.println("割り算終了");
        }
        System.out.println("処理終了");
    }

}
