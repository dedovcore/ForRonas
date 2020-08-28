package servlets;

import models.Bank;
import services.Services;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/AddBank")
public class AddBankServlet extends HttpServlet {
    Services services = new Services();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dis = req.getRequestDispatcher("views/bank.jsp");
        dis.forward(req, resp);
    }

        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bankName = req.getParameter("name");
        String BIK = req.getParameter("BIK");
        if(services.newBank(new Bank(bankName, BIK ))){
            RequestDispatcher dis = req.getRequestDispatcher("views/deposit.jsp");
            dis.forward(req, resp);
        }
        }
}
