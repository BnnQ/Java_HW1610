package me.bnnq.homework;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import me.bnnq.homework.utils.Views;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "historyServlet", value = "/history")
public class HistoryServlet extends HttpServlet
{
    @Override
    public void init()
    {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        String history = "Acer is a company that produces laptops and other electronic devices. It was founded in 1976 by Stan Shih and his friends as Multitech, a company that designed hand-held electronic games and distributed imported semiconductors. In 1981, the company changed its name to Acer, which means sharp or acute in Latin. It also launched its first personal computer, the MicroProfessor, which was a teaching tool. In the following years, Acer started to produce PC clones, which were computers and components that were sold under other brands. Acer also diversified into different products, such as keyboards, monitors, and CD-ROM drives. In the late 1980s, Acer became one of the most vertically integrated microcomputer manufacturers in the world, controlling every aspect of its production process. However, in the early 1990s, Acer faced a financial crisis due to overexpansion and competition from cheaper Asian rivals. The company suffered a loss of US$22.7 million in 1991. To overcome the crisis, Acer implemented a new business model in 1992, called \"fast food\", which involved outsourcing its manufacturing to local contractors and focusing on design, marketing, and distribution. This allowed Acer to reduce its costs and increase its flexibility and responsiveness to market changes. In 1994, Acer launched its Aspire series of multimedia PCs, which were aimed at the home and small office markets. The Aspire PCs featured innovative designs and technologies, such as built-in speakers, modems, and CD-ROM drives. In 1995, Acer became the world's seventh-largest PC brand and the leading exporter in Taiwan. The company also expanded into new markets, such as Latin America, Eastern Europe, and China. In 1996, Acer introduced its TravelMate series of notebook computers, which were designed for mobile professionals. The TravelMate notebooks offered high performance, long battery life, and wireless connectivity. In 1997, Acer acquired Texas Instruments' notebook division, which gave it access to advanced technology and a strong presence in the US market. Acer also launched its AcerNet project, which aimed to provide Internet services and solutions to its customers. In 1998, Acer reorganized into five groups: Acer International Service Group, Acer Sertek Service Group, Acer Semiconductor Group, Acer Information Products Group, and Acer Peripherals Group. The reorganization was intended to improve efficiency and coordination among the different businesses. In 1999, Acer spun off its semiconductor business as Wistron Corporation, which became an independent contract manufacturer. Acer also sold its stake in BenQ Corporation, which was its former peripherals division. Acer focused on its core IT products business and its new Internet-related ventures.";
        var links = new ArrayList<String>();
        links.add("https://en.wikipedia.org/wiki/Acer_Inc.");
        links.add("https://www.company-histories.com/Acer-Inc-Company-History.html");
        links.add("https://successstory.com/companies/acer-inc");

        var images = new String[] { "wwwroot/images/acer1.jpg", "wwwroot/images/acer2.jpg", "wwwroot/images/acer3.jpg" };
        request.setAttribute("manufacturerName", "Acer");
        request.setAttribute("history", history);
        request.setAttribute("links", links);
        request.setAttribute("images", images);

        Views.get(getServletContext(), "history", request, response);
    }

    public void destroy()
    {

    }
}