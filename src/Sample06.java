public class Sample06 {
    public static void main(String[] args) {

        /*<シナリオ⑥>
         ** 例外処理(try~catch文)
         */

        try {
            int x = Integer.parseInt(args[0]); //コマンドライン引数1が数字でない→③
            int y = Integer.parseInt(args[1]); //コマンドライン引数が1つ→②、コマンドライン引数2が数字でない→③

            //正常処理
            //（入力値）x = 4; y = 2;
            //（結果） 2
            System.out.println(x / y); //コマンドライン引数2が0→①

        } catch (ArithmeticException e) {

            //①ゼロ割が発生した場合の対処
            System.out.println("[ゼロ割]" + e + "が発生しました");

            //①エラー
            //（入力値）x = 4; y = 0;
            //[ゼロ割]
            //java.lang.ArithmeticException: / by zeroが発生しました

        } catch (ArrayIndexOutOfBoundsException e) {

            //②存在しない配列のインデックスが指定された場合の対処
            System.out.println("[インデックス範囲外指定]" + e + "が発生しました");

            //②エラー
            //（入力値）x = 4; y = なし;
            //[インデックス範囲外指定]
            //java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1が発生しました

        } catch (NumberFormatException e) {

            //③数字の形式でない文字列が入力された場合の対処
            System.out.println("[入力値不正（数字でない）]" + e + "が発生しました");

            //③エラー
            //（入力値）x = 漢; y = 字;
            //[入力値不正（数字でない）]
            //java.lang.NumberFormatException: For input string: "漢"が発生しました

        }
        System.out.println("最後まで処理しました");
    }
}