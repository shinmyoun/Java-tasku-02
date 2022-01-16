import java.util.HashMap;
import java.util.Map;

public class Sample05_2 {
    public static void main(String[] args) {

        /*<シナリオ⑤_2>
         **String型のMapを作成して、その内容をコンソール画面に表示してみよう。
         ** 条件①
         ** Listに入れる内容は何でもOKだが、複数入れること。（コレクション型は割愛）
         */

        //Mapの使い方
        //Map<キーの型名, 値の型名> オブジェクト名 = new HashMap<>();
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "田中");
        map.put(3, "鈴木");
        map.put(5, "高橋");

        System.out.println(map.get(1));
        System.out.println(map.get(3));
        System.out.println(map.get(5));


        for (String val : map.values()) {
            System.out.println(val);
        }

        map.remove(1);  //要素を削除
        System.out.println(map.size());  //格納されているペア数を取得


    }
}