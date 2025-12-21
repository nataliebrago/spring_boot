package homework29.single_responsibility;

//Исправление:
public class ReportGenerator_true {

    // Только генерация отчётов
    public String generateReport(String data) {
        return "Generated report for: " + data;
    }

    public class FileSaver {  // Только сохранение в файл
        public void save(String content, String filePath) {
            System.out.println("Saving to: " + filePath);
        }
    }

    public class EmailSender {  // Только отправка по email
        public void send(String content, String email) {
            System.out.println("Sending to: " + email);
        }
    }
    /**Обоснование: Каждый класс теперь фокусируется на одной задаче, что упрощает тестирование и изменения (например, замену способа сохранения).*/
}
