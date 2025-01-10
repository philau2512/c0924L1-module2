package ss17_binary_file.bai_tap.copy_binary_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteBinaryFile {
    public static <T> List<T> readListObjectFromDat(String filePath) throws IOException {
        List<T> objectList = new ArrayList<>();
        File file = new File(filePath);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        if (file.length() > 0) {
            try {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                objectList = (List<T>) objectInputStream.readObject();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error reading file");
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        return objectList;
    }

    public static <T> void writeListObjectToDat(String filePath, List<T> objectList) {
        File file = new File(filePath);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(objectList);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error writing file");
        } finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }

}
