package Java;

import java.util.InputMismatchException;
import java.util.Scanner; 

public class 判斷奇偶數 {
    public static void main(String[] args) {
        // 區域變數
        int num = 0; 

        // 建立輸入物件
        Scanner scanner = new Scanner(System.in); 
        System.out.print("請輸入一個整數 : ");

        // 異常檢查
        try { 
        num = scanner.nextInt();
            // 奇偶數判斷
            if (num % 2 == 0) { 
                System.out.println(num + " 是偶數");
            } else {
                System.out.println(num + " 是奇數");
            }
        } catch(InputMismatchException e) {
            System.out.println("請輸入整數內容！");
        }
        
        // 釋放資源
        scanner.close();
    }
}