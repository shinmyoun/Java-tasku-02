import java.util.ArrayList;
import java.util.List;

public class Sample05_1 {
    public static void main(String[] args) {

        /*<シナリオ⑤_1>
         **String型のListかMapを作成して、その内容をコンソール画面に表示してみよう。
         ** 条件①
         ** Listに入れる内容は何でもOKだが、複数入れること。（コレクション型は割愛）
         */

        //listの使い方
        //List<データ型名> オブジェクト名 = new ArrayList<データ型名>();
        List<String> list = new ArrayList<String>();

        list.add("犬");
        list.add("猫");
        list.add("サル");
        list.add("河童");

        //昇順[数字の時]
        //Collections.sort(list);

        list.forEach(System.out::println);

    }
}