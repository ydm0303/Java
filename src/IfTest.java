
import java.sql.SQLOutput;
import java.util.Scanner;

class IfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的成绩(0-100)：");
        int score = scan.nextInt();
        if (score == 100) {
            System.out.println("奖励一辆BMW！");
        } else if (score > 80 && score <= 90) {
            System.out.println("奖励一台Iphone。");
        }else if(score >= 60 && score <= 80){
            System.out.println("奖励一台iPad。");

        }else {
            System.out.println("什么也没有。");
        }
    }
}