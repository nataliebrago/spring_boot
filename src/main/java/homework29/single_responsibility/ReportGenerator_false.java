package homework29.single_responsibility;

//Нарушение:
public class ReportGenerator_false {
    public void generateReport(String data) {
        // Генерация отчёта
        System.out.println("Generating report for: " + data);
    }

    public void saveToFile(String report, String filePath) {
        // Сохранение в файл — другая ответственность
        System.out.println("Saving report to: " + filePath);
    }

    public void sendByEmail(String report, String email) {
        // Отправка по email — ещё одна ответственность
        System.out.println("Sending report to: " + email);
    }
}

