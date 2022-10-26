package mk.finki.ukim.mk.lab.web.servlet;

import mk.finki.ukim.mk.lab.service.impl.BalloonServiceImpl;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="BALUN", urlPatterns = "/")
public class BalloonListServlet extends HttpServlet {

    private final BalloonServiceImpl balloonService;
    private final SpringTemplateEngine templateEngine;

    public BalloonListServlet(BalloonServiceImpl balloonService, SpringTemplateEngine templateEngine) {
        this.balloonService = balloonService;
        this.templateEngine = templateEngine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        WebContext context = new WebContext(req, resp, req.getServletContext());
        context.setVariable("object",this.balloonService.listAll());
        this.templateEngine.process("listBalloons.html", context, resp.getWriter());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
