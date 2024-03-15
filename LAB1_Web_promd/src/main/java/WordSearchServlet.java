import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

@WebServlet("/wordSearch")
public class WordSearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String word = request.getParameter("word");
        if (word != null) {
            String fileContent = readFile("C:/Users/Claaaaaarity/IdeaProjects/lab__1/src/main/resources/Text.txt");
            int wordCount = StringUtils.countMatches(fileContent.toLowerCase(), word.toLowerCase());

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("The word \"" + word + "\" appears " + wordCount + " times.");
            out.println("</body></html>");
        } else {
            // Обработка случая, когда параметр "word" не был передан
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Parameter 'word' is missing.");
        }
    }
    private String readFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String word = request.getParameter("word");
        if (word != null) {
            String fileContent = readFile("C:/Users/Claaaaaarity/IdeaProjects/lab__1/src/main/resources/Text.txt");
            int wordCount = StringUtils.countMatches(fileContent.toLowerCase(), word.toLowerCase());

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("The word \"" + word + "\" appears " + wordCount + " times.");
            out.println("</body></html>");
        } else {
            // Обработка случая, когда параметр "word" не был передан
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Parameter 'word' is missing.");
        }
    }
}
