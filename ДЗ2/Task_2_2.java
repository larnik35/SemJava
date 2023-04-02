
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//Создать метод, который запишет результат работы в файл Обработайте исключения и запишите ошибки в лог файл

public class Task_2_2 {
    public static void main(String[] args) {

        String student = new String(
                "  { { \"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"физика\"}} ");
        // System.out.println(student);
        String st = procesingString(student);
        String nameFail = "student.txt";
        writToFile(st, nameFail);

    }

  
    static void writToFile(String st, String nameFail) {
    try {   Logger logger = Logger.getAnonymousLogger();
            FileHandler log = new FileHandler("fail.log", true);
                logger.addHandler(log);
            SimpleFormatter formatter = new SimpleFormatter();
                log.setFormatter(formatter);
        try (FileWriter file = new FileWriter(nameFail, true);) {
                file.write(st);
                file.flush();
                logger.log(Level.INFO, "Запись успешна создана" );

        } catch (IOException e) {

            e.printStackTrace();
            logger.log(Level.WARNING, "Нам всем пришел конец");
        }   log.close();
    }catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    static String procesingString(String student) {

        String student2 = student.replaceAll("\"фамилия\":\"", "Cтудет ");
        student2 = student2.replaceAll("\",\"оценка\":\"", " получил ");
        student2 = student2.replaceAll("\",\"предмет\":\"", " по придмету ");
        student2 = student2.replaceAll("\"},", ".\n     ");
        student2 = student2.replace("{", " ");
        student2 = student2.replaceAll("\"}}", ".\n");
        return student2;
    }

}
