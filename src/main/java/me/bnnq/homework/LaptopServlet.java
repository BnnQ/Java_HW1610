package me.bnnq.homework;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import me.bnnq.homework.models.Laptop;
import me.bnnq.homework.services.ServiceContainer;
import me.bnnq.homework.utils.Views;

@WebServlet(name = "laptopServlet", value = "/laptop")
public class LaptopServlet extends HttpServlet
{
    @Override
    public void init()
    {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        int id = Integer.parseInt(request.getParameter("id"));
        Laptop laptop = ServiceContainer.getLaptopRepository().getById(id);
        request.setAttribute("laptop", laptop);

        Views.get(getServletContext(), "laptop", request, response);
    }

    public void destroy()
    {

    }
}