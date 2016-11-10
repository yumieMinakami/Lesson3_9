package jp.techacademy.yumie.minakami.humanclass;

/**
 * Created by user on 2016/11/10.
 */

// Lesson3  7
import android.util.Log;

// Lesson3 8
class   Dog extends Animal  implements Movable{
    // class variance
    static String   to_jp = "犬";

    // constructor
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    // class functions
    public static void introduce(){
        Log.d("javatest", "これは犬クラスです。");
    }

    // member functions
    public void say(){
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

    @Override
    public void move(){
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");
    }
}
