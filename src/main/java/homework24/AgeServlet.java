package homework24;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class AgeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");  // Устанавливаем тип контента и кодировку
        PrintWriter out = response.getWriter();

        String ageParam = request.getParameter("age");  // Получаем параметр age из запроса
        String result;

        if (ageParam == null || ageParam.isEmpty()) {
            result = "Ошибка: Параметр 'age' не указан.";
        } else {
            try {
                int age = Integer.parseInt(ageParam);  // Преобразуем в число
                if (age < 0) {
                    result = "Ошибка: Возраст не может быть отрицательным.";
                } else if (age >= 18) {
                    result = "Совершеннолетний";
                } else {
                    result = "Несовершеннолетний";
                }
            } catch (NumberFormatException e) {
                result = "Ошибка: Возраст должен быть целым числом.";
            }
        }

        // Выводим результат в HTML-формате
        out.println("<html><body>");
        out.println("<h2>Результат проверки возраста</h2>");
        out.println("<p>" + result + "</p>");
        out.println("</body></html>");
    }
}