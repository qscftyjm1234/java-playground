// 實務範例: 簡單的資料庫備份工具

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatabaseBackupTool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 資料庫備份工具 ===\n");

        // 1. 選擇資料庫
        System.out.println("請選擇要備份的資料庫:");
        System.out.println("1. 生產環境 (production)");
        System.out.println("2. 測試環境 (staging)");
        System.out.println("3. 開發環境 (development)");
        System.out.print("請輸入選項 (1-3): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // 清除緩衝區

        String environment = "";
        switch (choice) {
            case 1:
                environment = "production";
                break;
            case 2:
                environment = "staging";
                break;
            case 3:
                environment = "development";
                break;
            default:
                System.out.println("無效的選項!");
                scanner.close();
                return;
        }

        // 2. 確認備份
        System.out.print("\n確定要備份 " + environment + " 環境? (yes/no): ");
        String confirm = scanner.nextLine();

        if (!confirm.equalsIgnoreCase("yes")) {
            System.out.println("已取消備份");
            scanner.close();
            return;
        }

        // 3. 執行備份 (模擬)
        System.out.println("\n開始備份...");
        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
        String backupFile = environment + "_backup_" + timestamp + ".sql";

        System.out.println("備份檔案: " + backupFile);
        System.out.println("備份中... (這裡會執行實際的備份指令)");

        // 模擬備份過程
        try {
            Thread.sleep(2000); // 模擬 2 秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("✅ 備份完成!");
        System.out.println("檔案位置: /backups/" + backupFile);

        scanner.close();
    }
}
