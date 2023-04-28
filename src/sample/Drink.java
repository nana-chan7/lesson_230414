package sample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Drink {
    
    public static void main(String[] args) {
        // スニペット: syso
        System.out.println("Drink class");

        String name;
        int price;
        int amount;
        boolean isSale;  

        name = "コーヒー";
        price = 350;
        amount = 3;
        isSale = true;

        System.out.println(name);
        System.out.println(price);
        System.out.println(amount);
        System.out.println(isSale);

        // int には少数が代入できない
        //amount = 0.1f;

        // String に数値は代入できない
        // name = 100;
        // ※ 文字リテラルは代入できる
        // name = "100"

        // 定数 (constant)
        final Float TAX_RATE = 0.1f;
        System.out.println(TAX_RATE);

        // 定数は値を再代入できない
        // TAX_RATE = 0.08f;

        System.out.println("--------Array-------");
        // Array
        String[] drinks = {"コーヒー", "紅茶", "ほうじ茶"};
        System.out.println(drinks); // ← これだと配列の中身はちゃんと表示できない
        System.out.println(Arrays.toString(drinks)); 
        // Calender, Arraysは自動インポートされて使える(自動で行われない時があるので注意)

        // Python, JavaScript, PHP
        // drinks = ["コーヒー", "紅茶", "ほうじ茶"];

        // 紅茶を取り出すためには
        // 2番目の値を取り出す
        String selectDrink = drinks[1];
        System.out.println(selectDrink);
    }
}
