package Java;

// 輸入模組
import java.util.Scanner; 

public class 基本輸入和輸出 {
    public static void main(String[] args) {

        // 輸入內容
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入名稱 : ");
        String name = scanner.nextLine();

        // 輸出結果
        System.out.println("Hello ~ " + name + "！");
    }
}