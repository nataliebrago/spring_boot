import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

    public class WashingtonTimeServlet extends HttpServlet {
        private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html");
            ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/New_York"));
            resp.getWriter().println("<h1>" + "Время в Вашингтоне: " + now.format(FORMATTER) + "</h1>");
        }
    }
