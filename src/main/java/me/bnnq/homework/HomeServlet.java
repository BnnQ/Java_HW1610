package me.bnnq.homework;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import me.bnnq.homework.models.LaptopManufacturer;
import me.bnnq.homework.utils.Views;

@WebServlet(name = "homeServlet", value = "/home")
public class HomeServlet extends HttpServlet
{
    @Override
    public void init()
    {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        var manufacturer = new LaptopManufacturer("Acer", "Taiwan", "wwwroot/images/acer.png", 7725, "Acer is a Taiwanese multinational company that specializes in advanced electronics technology. It produces personal computers, laptops, tablets, servers, storage devices, displays, smartphones, and other products. Acer was founded in 1976 by Stan Shih and his friends as Multitech, a distributor of electronic parts and a consultant in microprocessor technologies. The company changed its name to Acer in 1981 and became one of the world’s leading PC brands and manufacturers. Acer is known for its innovative strategies, progressive corporate culture, and global presence",  new String[] { "wwwroot/images/acer1.jpg", "wwwroot/images/acer2.jpg", "wwwroot/images/acer3.jpg" }, new String[] { "https://en.wikipedia.org/wiki/Acer_Inc.", "https://www.company-histories.com/Acer-Inc-Company-History.html", "https://successstory.com/companies/acer-inc" });
        request.setAttribute("manufacturer", manufacturer);

        Views.get(getServletContext(), "home", request, response);
    }

    public void destroy()
    {

    }

}