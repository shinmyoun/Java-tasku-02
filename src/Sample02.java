public class Sample02 {
    public static void main(String[] args) {

        /*<シナリオ②>
         **「1～10まで足した結果」をコンソール画面に表示してみよう。
         ** 条件①
         ** ただし、for文を使って4行程度に収める事。出来る人は更に短くしましょう！
         */

        //実行
        int loopCount = 0; //（初期値0）
        for (int i = 1; i <= 10; i++) {
            loopCount += i;
        }
        System.out.println("<シナリオ②>解答:" + loopCount);
    }
}