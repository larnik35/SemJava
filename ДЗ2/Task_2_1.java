
/// Дана json строка { { "фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}} Задача написать метод(ы),
// который распарсить строку и выдаст ответ вида: Студент Иванов получил 5 по предмету Математика. 
// Студент Петрова получил 4 по предмету Информатика. Студент Краснов получил 5 по предмету Физика. 
// Используйте StringBuilder для подготовки ответа

public class Task_2_1 {

    public static void main(String[] args) {
        String student = new String(
                "  { { \"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"физика\"}} ");
        //System.out.println(student);
        String w = procesingString(student);

        StringBuilder st = new StringBuilder();
        st.append(w);
        System.out.println(st.toString());
    }

    static String procesingString(String student) {
        
        
        String student2 = student.replaceAll("\"фамилия\":\"", " Cтудет ");
        student2 = student2.replaceAll("\",\"оценка\":\"", " получил ");
        student2 = student2.replaceAll("\",\"предмет\":\"", " по придмету ");
        student2 = student2.replaceAll("\"},", ".\n    ");
        student2 = student2.replace("{", "");
        student2 = student2.replaceAll("\"}}", ".");
        return student2;
    }

}
