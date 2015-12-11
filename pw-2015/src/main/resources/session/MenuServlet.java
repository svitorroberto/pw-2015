package session;
;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/sessao/menu")
public class MenuServlet extends HttpServlet {

  protected void service(
      HttpServletRequest req,
      HttpServletResponse resp)
      throws ServletException, IOException {

    //ReferÃªncia para a sessÃ£o.
    HttpSession sessao = req.getSession();

    //ObtÃ©m referÃªncia para o atributo "usuarioLogado".
    Boolean usuarioLogado = (Boolean) sessao.getAttribute("usuarioLogado");
    
    if (usuarioLogado == null || usuarioLogado == false) {
      req.getRequestDispatcher("Entrar.jsp").forward(req, resp);  
    } else {
      req.getRequestDispatcher("menu.jsp").forward(req, resp);
    }
  }

}