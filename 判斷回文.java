package Java;

import java.util.Scanner; 

public class 判斷回文 {
    public static void main(String[] arg) {
        // 輸入內容
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入內容 : ");
        String text = scanner.nextLine();

        // 判斷是否為回文
        String revered_text = new StringBuilder(text).reverse().toString();
        if (text.equals(revered_text)) {
            System.out.println(text + " 是回文！");
        } else {
            System.out.println(text + " 不是回文！");
        }
        
        // 釋放資源
        scanner.close();
    }
}