package servlets;

import models.Bank;
import models.Client;
import models.Deposit;
import services.Services;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/Registration")
public class RegistrationServlet extends HttpServlet{
    Services services = new Services();

            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                RequestDispatcher dis = req.getRequestDispatcher("views/registration.jsp");
                dis.forward(req, resp);
            }


            protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                String name = req.getParameter("name");
                String password = req.getParameter("password");
                String shortName = req.getParameter("shortName");
                String address = req.getParameter("address");
                String LLC = req.getParameter("LLC");

                if (services.newClient(new Client(name, password, shortName, address, LLC))) {
                    resp.sendRedirect("/");
                }
            }
        }



