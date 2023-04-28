package sample;

// 条件分岐
public class Condition {
    public static void main(String[] args) {
        // 価格
        int price = 100;
        // 最大価格
        int maxPrice = 100000000;
        // 所持金
        int money = 100;
        // メッセージ
        String message = "";

 
        // if (money >= price) {
        //     message = "お買い上げありがとうございます。";
        // } else { 
        //     message = "所持金が足りません。";
        // }

        // if (money >= price) {
        //     message = "お買い上げありがとうございます。";
        // } else { 
        //     message = "所持金が足りません。";
        // }

        // if (price <= 0){
        //     message = "価格が正しくありません。";
        // }
        // 論理演算子追加
        // OR : || (どちらかが true だったら)
        if (price <= 0 || price >= maxPrice){
            message = "価格が正しくありません。";
        }
        else if (money >= price){
            message = "お買い上げありがとうございます。";
        }
        else {
            message = "所持金が足りません。";
        }

        System.out.println(message);


        // switch 文    
        String dayString = "日";
        String garbage = "";
        switch (dayString) {
            case "月":
                garbage = "燃えるゴミ";
                break;

            case "水":
                garbage = "燃えないゴミ";
                break;

            default: 
                garbage = "回収なし";
                break;
        }
        System.out.println(garbage);

    }
}
