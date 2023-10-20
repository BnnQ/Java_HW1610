package me.bnnq.homework;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import me.bnnq.homework.services.ServiceContainer;
import me.bnnq.homework.utils.Views;

@WebServlet(name = "newsListServlet", value = "/feed")
public class NewsListServlet extends HttpServlet
{
    @Override
    public void init()
    {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        var newsList = ServiceContainer.getNewsRepository().getAll();
        request.setAttribute("newsList", newsList);

        Views.get(getServletContext(), "newsList", request, response);
    }

    public void destroy()
    {

    }
}