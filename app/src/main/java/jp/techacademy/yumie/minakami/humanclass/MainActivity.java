package jp.techacademy.yumie.minakami.humanclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    // add

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lesson3 7
        //Dog dog = new Dog("ポチ", 3);
        //
        //dog.move();

        // Lesson3 9-1
//        Log.d("javatest", "     Lesson3 9 課題1個目");
//        Human human = new Human("山田太郎", 5);
//        human.say();
//
//        // Lesson3 9-2
//        Log.d("javatest", "     Lesson3 9 課題2個目");
//        human.think();
//
//        // Lesson3 9-3
//        Log.d("javatest", "     Lesson3 9 課題3個目");
//        Human human1 = new Human("鈴木花子", 100);
//        human1.say();
//
//        Human human2 = new Human("〇〇");
//        human2.think();
        Human human0 = new Human("山田太郎", 5, "〇〇");
        human0.say();
        human0.think();

    }

}
