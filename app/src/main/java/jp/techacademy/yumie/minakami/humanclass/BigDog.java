package jp.techacademy.yumie.minakami.humanclass;

/**
 * Created by user on 2016/11/10.
 */

// Lesson3 7
import android.util.Log;

class BigDog extends Dog {
    // クラス変数
    static String to_jp = "大型犬";

    public BigDog(String name, int age){
        super(name, age);
    }

    // クラス関数
    public static void introduce(){
        Log.d("javatest", "これは大型犬クラスです。");
    }
}
