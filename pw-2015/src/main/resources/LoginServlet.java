package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
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
	 * Vai processar a valida��o do usu�rio e senha
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// por default chamarei a pagina index e passarei o parametro erro=1
		String pagina = "index.jsp?erro=1";
		
		// Validando se o usu�rio � igual a admin e senha = banana
		// Nunca se coloca usu�rio e senha na classe java! (hardcode)
		// normalmente se busca usu�rio e senha no banco de dados ou arquivos XML
		if(request.getParameter("acao").equals("Entrar")) {
			if(request.getParameter("email").equals("admin")) {
				if(request.getParameter("password").equals("banana")) {
					HttpSession sessao = request.getSession();
					// setando um atributo da sessao
					sessao.setAttribute("login", request.getParameter("login"));
					// como obtive sucesso, chamo a p�gina principal
					pagina = "principal.jsp";
				}
			}
		} else if(request.getParameter("acao").equals("logout")) {
			// no logout invalido a sessao
			HttpSession sessao = request.getSession();
			sessao.invalidate();
			// chamo novamente a pagina principal, que deve chamar a p�gina index
			// que ira mostrar o formulario para o usu�rio logar
			pagina = "principal.jsp";
		}
		
		response.sendRedirect(pagina);
		
	}
	
}
