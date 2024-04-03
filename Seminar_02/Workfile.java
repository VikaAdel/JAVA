package Seminar_02;
// Напишите метод, который вернет содержимое текущей папки в виде массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае лючения, оно должно записаться в 
// лог-файл.

import java.io.File;
import java.io.FileWriter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Workfile {
    private static Logger logger = Logger.getLogger(Workfile.class.getName());

    public static void main(String[] args) {
        setLogger();
        String[] strContents = getContentFolder(".");
        writeToFile(strContents, ".");

    }

    public static String[] getContentFolder(String folderName) {
        File folder = new File(folderName);
        return folder.list();
    }

    public static void writeToFile(String[] arrStr, String nameFile) {
        try (FileWriter fileWriter = new FileWriter(nameFile)) {
            for (String string : arrStr) {
                fileWriter.write(string);
                fileWriter.write(System.lineSeparator());
            }
            // logger.info(nameFile);
            logger.log(Level.INFO, "данные успешно записаны в файл");
        } catch (Exception e) {
            // e.printStackTrace();
            logger.warning("ошибка записи");

        }
    }

    public static void setLogger() {
        try {
            FileHandler fileHandler = new FileHandler("log.txt", true);
            logger.addHandler(fileHandler);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}