import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Sample03 {
    public static void main(String[] args) {

        /*<シナリオ③>
         **問題：「3年後の今日が何曜日なのか」を計算して、コンソール画面に表示してみよう
         ** 分解
         *    今日の日付を算出→3年を加算する→3年後の日付の曜日を割り出す。
         ** 条件①
         ** LocalDateTimeとDayOfWeekを使うこと
         */

        // 現在の日時を取得
        LocalDateTime now = LocalDateTime.now();
        // 3年後の日時を取得
        now = now.plusYears(3);

        // 西暦、月、日、曜日を取得
        int year = now.getYear();
        int month = now.getMonthValue();
        int date = now.getDayOfMonth();
        DayOfWeek day = now.getDayOfWeek();

        String dayJpn = "";
        switch (day) {
        case MONDAY:
            dayJpn = "(月)";
            break;
        case TUESDAY:
            dayJpn = "(火)";
            break;
        case WEDNESDAY:
            dayJpn = "(水)";
            break;
        case THURSDAY:
            dayJpn = "(木)";
            break;
        case FRIDAY:
            dayJpn = "(金)";
            break;
        case SATURDAY:
            dayJpn = "(土)";
            break;
        case SUNDAY:
            dayJpn = "(日)";
            break;
        }

        // 結果の表示
        System.out.printf("<シナリオ③>今日の日付：" + year + "年" + month + "月" + date + "日" + dayJpn);

    }
}