import java.util.ArrayList;
import java.util.List;

public class TypeSample {
    public static void main(String[] args) {
        //        cmd + /
        //        ctrl + /
        //        String nameString = 15;
        //        int studentNo = "YOshida";
        //

        //日付
        //今日の日付を変数にして、標準出力

        List<String> nameList = new ArrayList<String>();

        nameList.add("tanaka");
        nameList.add("suzuki");
        nameList.add("ymada");
        nameList.add("kisisita");
        nameList.add("koyyuu");

        for (String name : nameList) {
           System.out.println(name);
        }

        System.out.println(nameList.size());
    }
}