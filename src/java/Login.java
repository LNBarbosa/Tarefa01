import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logar")
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //chamar parametro
        String email = request.getParameter("email");
        String senha = request.getParameter("pwd");
       
        //request.login(email, senha);
        request.getRequestDispatcher("CadastroItens.html").forward(request, response);
    }
}
