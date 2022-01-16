public class Sample04 {
    public static void main(String[] args) {

        /*<シナリオ④>
         **「引数が0なら偽。引数が1なら真」とコンソール画面に表示してみよう。
         ** 条件①
         ** if文で表現できる。
         */

        //（初期値：コマンドライン引数から取得した値）
        int testScore = Integer.parseInt(args[0]);

        //---フィールド----------------------------------------------------
        String True = "真"; //真
        String False = "偽"; //偽

        //実行
        if (testScore == 1) {
            System.out.println(True);
        } else if (testScore == 0) {
            System.out.println(False);
        } else {
            System.out.println("不明な値");
        }
    }
}