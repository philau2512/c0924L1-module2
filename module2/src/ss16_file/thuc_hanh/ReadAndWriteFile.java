package ss16_file.thuc_hanh;

import java.io.*;

public class ReadAndWriteFile {
    public static void WriteFile(String filePath, String line) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }

    public static String ReadFile(String filePath) {
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = "";
        return line;
    }

}
