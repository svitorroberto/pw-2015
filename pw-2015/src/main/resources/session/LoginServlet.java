package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(value = "/sessao/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	/**
	 * Vai processar a validaï¿½ï¿½o do usuï¿½rio e senha
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		// Validando se o usuï¿½rio ï¿½ igual a admin e senha = banana
		// Nunca se coloca usuï¿½rio e senha na classe java! (hardcode)
		// normalmente se busca usuï¿½rio e senha no banco de dados ou arquivos XML
		    String usuario = req.getParameter("usuario");
		    String senha = req.getParameter("senha");
		    //UsuÃ¡rio vÃ¡lido.
		    if (usuario != null && usuario.equals("joao")
		        && senha!= null && senha.equals("123")) {
		      sessao.setAttribute("usuarioLogado", true);
		    //  req.getRequestDispatcher("PaginaInterna1.jsp").forward(req, resp);
		} else {
			sessao.setAttribute("usuarioLogado", false);
		      req.getRequestDispatcher("Entrar.html").forward(req, resp);
		}
		
		
	}
	
}