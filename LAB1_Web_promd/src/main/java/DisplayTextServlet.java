import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/displayText")
public class DisplayTextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int fontSize = Integer.parseInt(request.getParameter("fontSize"));
        int numLines = Integer.parseInt(request.getParameter("numLines"));

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        // Пример вывода текста. Необходимо реализовать логику выбора текста.
        for(int i = 0; i < numLines; i++) {
            out.println("<span style='font-size:" + fontSize + "px;'>Line " + (i + 1) + "</span><br/>");
        }

        out.println("</body></html>");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int fontSize = Integer.parseInt(request.getParameter("fontSize"));
        int numLines = Integer.parseInt(request.getParameter("numLines"));

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        // Пример вывода текста. Необходимо реализовать логику выбора текста.
        for(int i = 0; i < numLines; i++) {
            out.println("<span style='font-size:" + fontSize + "px;'>Line " + (i + 1) + "</span><br/>");
        }

        out.println("</body></html>");
    }
}