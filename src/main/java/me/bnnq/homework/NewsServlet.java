package me.bnnq.homework;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import me.bnnq.homework.services.ServiceContainer;
import me.bnnq.homework.utils.Views;

@WebServlet(name = "newsServlet", value = "/news")
public class NewsServlet extends HttpServlet
{
    @Override
    public void init()
    {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        int id = request.getAttribute("id") != null ? (int)request.getAttribute("id") : 0;
        var news = ServiceContainer.getNewsRepository().getById(id);
        request.setAttribute("news", news);

        Views.get(getServletContext(), "news", request, response);
    }

    public void destroy()
    {

    }
}