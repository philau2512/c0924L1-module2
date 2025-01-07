package ss16_file.bai_tap.file_copy;

import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFilePath;
        String targetFilePath;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đường dẫn file nguồn (Ex: D:\\input.txt): ");
        sourceFilePath = scanner.nextLine();

        File sourceFile = new File(sourceFilePath);
        if (!sourceFile.exists()) {
            System.out.println("❌ File nguồn không tồn tại !");
            return;
        } else if (!sourceFile.isFile()) {
            System.out.println("❌ File nguồn không không phải là file hợp lệ !");
            return;
        }

        System.out.print("Nhập đường dẫn file đầu ra (Ex: D:\\output.txt): ");
        targetFilePath = scanner.nextLine();

        File targetFile = new File(targetFilePath);
        if (targetFile.exists()) {
            System.out.println("⚠️ File đích đã tồn tại. Bạn có muốn ghi đè không? (y/n)");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                System.out.println("❌ Hủy thao tác sao chép.");
                return;
            }
        }

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileReader = new FileReader(sourceFile);
            fileWriter = new FileWriter(targetFile);
            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(fileWriter);

            String line = "";
            int totalCharacters = 0;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                totalCharacters += line.length();
            }
            System.out.println("✅ Sao chép hoàn tất! Số ký tự đã sao chép: " + totalCharacters);
        } catch (FileNotFoundException e) {
            System.out.println("Error file not found.");
        } catch (IOException e) {
            System.out.println("❌ Lỗi trong quá trình sao chép: " + e.getMessage());
        } finally {
            try {
                bufferedWriter.close();
                bufferedReader.close();
                fileWriter.close();
                fileReader.close();
            } catch (IOException e) {
                System.out.println("❌ Lỗi trong quá trình đóng file: " + e.getMessage());
            }
        }

    }
}
