package Java;

import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner; 

public class 基本輸入和輸出 {
    public static void main(String[] args) {
        // 輸入內容
        Scanner scanner = new Scanner(new InputStreamReader(System.in, Charset.forName("MS950")));
        System.out.print("請輸入名稱 : ");
        String name = scanner.nextLine();

        // 輸出結果
        System.out.println("Hello ~ " + name + "！");

        // 釋放資源
        scanner.close();
    }
}