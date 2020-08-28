package servlets;

import models.Deposit;
import services.Services;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/AddDeposit")
public class AddDepositServlet extends HttpServlet {
    Services services = new Services();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dis = req.getRequestDispatcher("views/deposit.jsp");
        dis.forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String dateOfOpen = req.getParameter("dateOfOpen");
        String percent = req.getParameter("percent");
        String tempInMonths = req.getParameter("tempInMonths");
        if(services.newDeposit(new Deposit(dateOfOpen, percent, tempInMonths))){
            resp.sendRedirect("/");
        }
    }
}
