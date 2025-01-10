package ss17_binary_file.bai_tap.copy_binary_file;

import java.io.*;
import java.util.Scanner;

public class CopyBinaryFile {
    public static void main(String[] args) {
        String sourceFilePath;
        String destFilePath;

        Scanner sc = new Scanner(System.in);
        System.out.print("Path file input: ");
        sourceFilePath = sc.nextLine();
        File sourceFile = new File(sourceFilePath);
        if (!sourceFile.exists()) {
            System.out.println("File input does not exist");
            return;
        }

        System.out.print("Path output file: ");
        destFilePath = sc.nextLine();
        File destFile = new File(destFilePath);
        if (destFile.exists()) {
            System.out.println("⚠️ File đích đã tồn tại. Bạn có muốn ghi đè không? (y/n)");
            String choice = sc.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                System.out.println("❌ Hủy thao tác sao chép.");
                return;
            }
        }

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(sourceFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            byte[] buffer = new byte[1024];
            int bytesRead;

            while((bytesRead = fileInputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("✅ Sao chép file thành công!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("❌ Đã xảy ra lỗi khi sao chép file: " + e.getMessage());
        }


    }
}
