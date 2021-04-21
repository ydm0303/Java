/*
升序排列
num1放最小的
num2发中间的
num3放最大的
 */
import java.util.Scanner;
public class IfTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = scanner.nextInt();
        System.out.println("请输入第三个数字：");
        int num3 = scanner.nextInt();
        int min = 0;
        if(num1 > num2){
            min = num2;
            num2 = num1;
            num1 = min;
        } if(num2 > num3){
            min = num3;
            num3 = num2;
            num2 = min;
        }if(num1 > num3 ){
            min = num3;
            num3 = num1;
            num1 = min;
        }
        System.out.println("三个数字从小到大的顺序为：" + num1 +","+ num2 +"," +num3);

    }
}
