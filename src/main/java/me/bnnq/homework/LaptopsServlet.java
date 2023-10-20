package me.bnnq.homework;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import me.bnnq.homework.services.ServiceContainer;
import me.bnnq.homework.utils.Views;

@WebServlet(name = "laptopsServlet", value = "/laptops")
public class LaptopsServlet extends HttpServlet
{
    @Override
    public void init()
    {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        var laptopList = ServiceContainer.getLaptopRepository().getAll();
        request.setAttribute("manufacturerName", "Acer");
        request.setAttribute("laptopList", laptopList);

        Views.get(getServletContext(), "laptops", request, response);
    }

    public void destroy()
    {

    }
}