package jp.techacademy.yumie.minakami.humanclass;

import android.util.Log;

/**
 * Created by user on 2016/11/10.
 */

// Lesson3 9-1
//class Human extends Animal{
class Human extends Animal implements Thinkable{
    // member variants
    String name;
    String hobby = "旅行";
    int age;

    // constructor
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Human(String hobby){
        this.hobby = hobby;
    }

    public  void say(){
        Log.d("javatest", "私の名前は" + this.name + "です。");
        Log.d("javatest", "私の年齢は" + this.age + "歳です。");
    }

    public void think(){
        Log.d("javatest", "私は " + this.hobby + " について考える。");
    }
}
