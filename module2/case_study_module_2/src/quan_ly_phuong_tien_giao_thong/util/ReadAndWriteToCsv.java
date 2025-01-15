package quan_ly_phuong_tien_giao_thong.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteToCsv {
    public static void WriteToCsv(String pathFile, List<String> contentList, boolean isAppend) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file, isAppend);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String line : contentList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("Error in writeToCsv: " + e.getMessage());
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error when close file: " + e.getMessage());
            }
        }
    }

    public static List<String> ReadFromCsv(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = "";

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error in readFromCsv: " + e.getMessage());
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error when close file in readFromCsv: " + e.getMessage());
            }
        }
        return stringList;
    }
}
