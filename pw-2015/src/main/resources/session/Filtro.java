package session;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/sessao/*")
public class Filtro implements Filter {

  public void init(FilterConfig filterConfig) throws ServletException {
  }

  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    HttpServletRequest req = (HttpServletRequest) request;
    HttpServletResponse res = (HttpServletResponse) response;

    if (req.getRequestURI().endsWith("/sessao/login")) {
      chain.doFilter(request, response); //Continua com a requisiÃ§Ã£o.
    } else {
      //ReferÃªncia para a sessÃ£o.
      HttpSession sessao = req.getSession();

      //ObtÃ©m referÃªncia para o atributo "usuarioLogado".
      Boolean usuarioLogado = (Boolean) sessao.getAttribute("usuarioLogado");
      
      if (usuarioLogado == null || usuarioLogado == false) {
        res.sendRedirect("PaginaInterna1.html");  
      } else {
        chain.doFilter(request, response); //Continua com a requisiÃ§Ã£o.
      }
      
    }
  }

  public void destroy() {
  }

}