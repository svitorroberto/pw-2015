package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/sessao/logout")
public class LogoutServlet extends HttpServlet {

  protected void service(
      HttpServletRequest req,
      HttpServletResponse resp)
      throws ServletException, IOException {

    //ReferÃªncia para a sessÃ£o.
    HttpSession sessao = req.getSession();
    //Remove todos os objetos da sessÃ£o e a invalida.
    sessao.invalidate();

    resp.sendRedirect("Entrar.html");
  }

}