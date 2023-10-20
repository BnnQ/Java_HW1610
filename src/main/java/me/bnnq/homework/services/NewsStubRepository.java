package me.bnnq.homework.services;

import me.bnnq.homework.models.News;
import me.bnnq.homework.services.abstractions.IRepository;

import java.util.ArrayList;
import java.util.List;

public class NewsStubRepository implements IRepository<News>
{
    private final List<News> newsList;

    public NewsStubRepository()
    {
        newsList = new ArrayList<>();
        
        newsList.add(new News(
                1,
                "Acer Launches New Chromebook Plus Laptops",
                "Two new models provide more power to get more done",
                "Acer has announced two new Chromebook Plus laptops, the Chromebook Plus 514 and the Chromebook Plus 315. These laptops are designed to offer more performance, battery life, and features for users who need a versatile device for work, school, or entertainment. The Chromebook Plus 514 and the Chromebook Plus 315 are powered by Intel processors and feature up to 8 GB of RAM and up to 256 GB of eMMC storage. They also support Wi-Fi 6 and Bluetooth 5.1 for fast and reliable connectivity. The Chromebook Plus 514 has a 14-inch Full HD IPS touch display with narrow bezels and a 360-degree hinge that allows it to be used in four modes: laptop, tablet, tent, or display. It also has a backlit keyboard, a fingerprint reader, and a stylus that can be stored in the device. The Chromebook Plus 315 has a 15.6-inch Full HD IPS touch display with a numeric keypad and a wide-angle webcam. Both laptops have dual speakers, dual microphones, and two USB Type-C ports that support DisplayPort, Power Delivery, and data transfer. They also have a USB Type-A port, a microSD card reader, and a headphone jack. The Chromebook Plus 514 and the Chromebook Plus 315 run on Chrome OS, which provides access to millions of apps on the Google Play Store, as well as built-in security and automatic updates. Users can also enjoy Google services such as Google Assistant, Google Drive, Google Photos, and Google Meet. The Chromebook Plus 514 and the Chromebook Plus 315 will be available in North America in October and November respectively, starting at $499.99 and $399.99.", 
                new String[] {
                        "wwwroot/images/news1_1.jpg",
                        "wwwroot/images/news1_2.jpg",
                        "wwwroot/images/news1_3.jpg"
                }
        ));
        
        newsList.add(new News(
                2,
                "New Acer Nitro V 15 Laptop Makes Gaming More Accessible",
                "Acer's new gaming laptop offers Intel Raptor Lake processor and GeForce RTX 2050 graphics card for $700", // shortDescription
                "Acer has unveiled its new gaming laptop, the Nitro V 15, which aims to make gaming more accessible to users who want a powerful and affordable device. The Nitro V 15 features a 15.6-inch Full HD IPS display with a refresh rate of 144 Hz and a response time of 3 ms. It also has an eye-catching design with red accents and a backlit keyboard with four-zone RGB lighting. The Nitro V 15 is powered by the Intel Raptor Lake processor, which is the next generation of Intel's mobile processors that offer improved performance and efficiency. It also has the NVIDIA GeForce RTX 2050 graphics card, which is based on the Ampere architecture and supports ray tracing and DLSS technologies. The Nitro V 15 can handle demanding games and applications with ease, thanks to its up to 16 GB of DDR4 RAM and up to 512 GB of PCIe SSD storage. It also has a dual-fan cooling system with Acer CoolBoost technology that increases fan speed by up to 10% and CPU/GPU cooling by up to 9%. The Nitro V 15 has a range of ports and connectivity options, including HDMI 2.1, USB Type-C with Thunderbolt 4, USB Type-A with Power-off Charging, Ethernet, Wi-Fi 6E, Bluetooth 5.2, and DTS:X Ultra audio. It also has a webcam with Super High Dynamic Range (SHDR) and a fingerprint reader for secure login. The Nitro V 15 runs on Windows 11 Home operating system, which provides a smooth and intuitive user experience. It also comes with Acer NitroSense software, which allows users to monitor and customize various aspects of their laptop, such as fan speed, temperature, lighting, power plan, and more. The Nitro V 15 will be available in North America in November for $699.99.", 
                new String[]{
                        "wwwroot/images/news2_1.jpg",
                        "wwwroot/images/news2_2.jpg",
                        "wwwroot/images/news2_3.jpg"
                }
        ));
        
        newsList.add(new News(
                3,
                "Acer Publishes 2022 Sustainability Report and Starts Using Sustainable Fuel Solutions",
                "Acer reduces its sea logistics emissions thanks to biofuel since Q4 2022",
                "Acer has published its 2022 Sustainability Report, which highlights the company's achievements and efforts in environmental, social, and governance (ESG) aspects. The report covers Acer's performance and progress in areas such as climate change, circular economy, human rights, diversity and inclusion, corporate governance, and social impact. One of the notable achievements of Acer in 2022 was the reduction of its sea logistics emissions by using biofuel as a sustainable fuel solution. Since Q4 2022, Acer has been working with its logistics partners to use biofuel for its shipments from Asia to Europe and North America. Biofuel is a renewable energy source that is derived from organic materials such as vegetable oils, animal fats, or waste cooking oil. Biofuel can reduce greenhouse gas emissions by up to 90% compared to conventional fossil fuels. Acer estimates that by using biofuel for its sea logistics, it can reduce its carbon footprint by about 7,080 metric tons of CO2 equivalent per year, which is equivalent to the annual emissions of 1,550 passenger cars. Acer's use of biofuel is part of its commitment to achieve carbon neutrality by 2050. The company has also set interim targets to reduce its Scope 1 and Scope 2 emissions by 60% by 2035 and its Scope 3 emissions by 30% by 2030, compared to the baseline year of 2015. Acer has also implemented various measures to improve its energy efficiency, increase its use of renewable energy, and promote a circular economy. The company has also joined several initiatives and partnerships to support the global climate action agenda, such as the RE100, the Science Based Targets initiative (SBTi), the UN Global Compact, and the Responsible Business Alliance (RBA). The 2022 Sustainability Report also showcases Acer's social and governance initiatives, such as its efforts to protect human rights, foster diversity and inclusion, enhance employee well-being, strengthen corporate governance and ethics, and create positive social impact through education, innovation, and philanthropy. The report is prepared in accordance with the Global Reporting Initiative (GRI) Standards and the UN Guiding Principles Reporting Framework. The report is also verified by a third-party assurance provider to ensure its credibility and transparency. The report can be downloaded from Acer's website: [1](https://news.acer.com/).", 
                new String[] {
                        "wwwroot/images/news3_1.jpg",
                        "wwwroot/images/news3_2.jpg",
                        "wwwroot/images/news3_3.jpg"
                }
        ));

        newsList.add(new News(
                4,
                "Acer Expands Donations to More Schools in Ukraine for Digital Upskilling ",
                "Acer continues its social responsibility program to support education and digital inclusion in Ukraine",
                "Acer has announced that it has expanded its donations of laptops and tablets to more schools in Ukraine, as part of its social responsibility program to support education and digital inclusion in the country. Acer has been donating its devices to schools in Ukraine since 2020, in collaboration with the Ministry of Education and Science of Ukraine, the State Enterprise Information and Telecommunication Systems, and the Ukrainian Center for Educational Quality Assessment. The donations aim to provide students and teachers with access to quality online learning and teaching resources, as well as to enhance their digital skills and competencies. Acer has donated over 2,000 devices to more than 100 schools in 15 regions of Ukraine so far, benefiting over 20,000 students and teachers. The donated devices include Acer TravelMate B3 laptops, Acer Chromebook 311 laptops, Acer Iconia One 10 tablets, and Acer Iconia Tab 10 tablets. The devices are equipped with Windows 10 or Chrome OS operating systems, as well as various educational applications and software. Acer also provides technical support and training for the schools to ensure the effective use of the devices. Acer’s donations are part of its global commitment to promote education and digital inclusion, especially in the face of the COVID-19 pandemic that has disrupted traditional learning methods. Acer believes that technology can empower people to achieve their potential and make a positive impact on society. Acer also supports other initiatives and projects that aim to improve education and digital literacy in Ukraine, such as the International Olympiad in Informatics 2023, the All-Ukrainian School Online Olympiad in Informatics, and the All-Ukrainian School Online Olympiad in Mathematics.",
                new String[] {
                        "wwwroot/images/news4_1.jpg ",
                        "wwwroot/images/news4_2.jpg ",
                        "wwwroot/images/news4_3.jpg "}));
    }
    
    @Override
    public News[] getAll()
    {
        return newsList.toArray(News[]::new);
    }

    @Override
    public News getById(int id)
    {
        return newsList.get(id);
    }

    @Override
    public void add(News news)
    {
        newsList.add(news);
    }

    @Override
    public void update(News item)
    {
        newsList.set(item.getId(), item);
    }

    @Override
    public void delete(int id)
    {
        newsList.remove(id);
    }

}
