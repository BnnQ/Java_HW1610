package me.bnnq.homework.services;

import me.bnnq.homework.models.Laptop;
import me.bnnq.homework.services.abstractions.IRepository;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class LaptopStubRepository implements IRepository<Laptop>
{
    private final List<Laptop> laptops;

    public LaptopStubRepository()
    {
        laptops = new ArrayList<>();
        var characteristics = new Hashtable<String, String>();
        characteristics.put("Processor", "Intel Core i5-1135G7");
        characteristics.put("RAM", "8 GB");
        characteristics.put("Storage", "512 GB SSD");
        characteristics.put("Display", "15.6\" IPS (1920x1080) Full HD");
        characteristics.put("Graphics", "NVIDIA GeForce MX350, 2 GB");
        characteristics.put("Battery", "Li-Ion, 3-cell, 48 Wh");

        laptops.add(new Laptop(
                1,
                "Aspire 5",
                new String[] { "wwwroot/images/Aspire5_1.jpg", "wwwroot/images/Aspire5_2.jpg", "wwwroot/images/Aspire5_3.jpg" },
                "Acer Aspire 5 A515-56G-50CN is a stylish and powerful laptop that is powered by the latest 11th Gen Intel Core i5 processor and NVIDIA GeForce MX350 graphics card. It has a 15.6 inch Full HD IPS display that is powered by Acer Color Intelligence and Acer BlueLightShield technologies. The laptop comes with 8 GB of RAM and 512 GB SSD storage. It is equipped with a Li-Ion, 3-cell, 48 Wh battery that keeps the device running for upto 8 hours.",
                characteristics));

        var characteristics1 = new Hashtable<String, String>();
        characteristics1.put("Processor", "Intel Core i7");
        characteristics1.put("RAM", "16 GB");
        characteristics1.put("Storage", "512 GB SSD");
        characteristics1.put("Display", "14\" Full HD IPS LCD");
        characteristics1.put("Graphics", "Intel Iris Xe Max Graphics");
        characteristics1.put("Battery", "Li-Ion, 4-cell, 56 Wh");

        laptops.add(new Laptop(
                2,
                "Swift 3X",
                new String[] { "wwwroot/images/Swift3X_1.jpg", "wwwroot/images/Swift3X_2.jpg", "wwwroot/images/Swift3X_3.jpg" },
                "Acer Swift 3X is a powerful and lightweight laptop that is powered by the latest 11th Gen Intel Core i7 processor and Intel Iris Xe Max Graphics. It has a 14-inch Full HD IPS LCD display that is perfect for work and entertainment. The laptop comes with 16 GB of RAM and 512 GB SSD storage. It is equipped with a Li-Ion, 4-cell, 56 Wh battery that keeps the device running for upto 14 hours.",
                characteristics1));

        var characteristics2 = new Hashtable<String, String>();
        characteristics2.put("Processor", "Intel Core i7");
        characteristics2.put("RAM", "16 GB");
        characteristics2.put("Storage", "512 GB SSD");
        characteristics2.put("Display", "13.5\" Full HD IPS Touchscreen");
        characteristics2.put("Graphics", "Intel Iris Xe Graphics");
        characteristics2.put("Battery", "Li-Ion, 4-cell, 56 Wh");

        laptops.add(new Laptop(
                3,
                "Spin 5",
                new String[] { "wwwroot/images/Spin5_1.jpg", "wwwroot/images/Spin5_2.jpg", "wwwroot/images/Spin5_3.jpg" },
                "Acer Spin 5 is a versatile 2-in-1 laptop that can be used as a laptop or tablet. It is powered by the latest 11th Gen Intel Core i7 processor and Intel Iris Xe Graphics. It has a 13.5-inch Full HD IPS touchscreen display that is perfect for work and entertainment. The laptop comes with 16 GB of RAM and 512 GB SSD storage. It is equipped with a Li-Ion, 4-cell, 56 Wh battery that keeps the device running for upto 15 hours.",
                characteristics2));

        var characteristics3 = new Hashtable<String, String>();
        characteristics3.put("Processor", "Intel Core i7");
        characteristics3.put("RAM", "32 GB");
        characteristics3.put("Storage", "1 TB SSD");
        characteristics3.put("Display", "15.6\" Full HD IPS Display");
        characteristics3.put("Graphics", "NVIDIA GeForce RTX 3060");
        characteristics3.put("Battery", "Li-Ion, 4-cell, 84 Wh");

        laptops.add(new Laptop(
                4,
                "ConceptD 7",
                new String[] { "wwwroot/images/ConceptD7_1.jpg", "wwwroot/images/ConceptD7_2.jpg", "wwwroot/images/ConceptD7_3.jpg" },
                "Acer ConceptD 7 is a high-performance laptop designed for content creators and professionals who need powerful computing power. It is powered by the latest 11th Gen Intel Core i7 processor and NVIDIA GeForce RTX 3060 graphics card. It has a stunning 15.6-inch Full HD IPS display that is perfect for creative work. The laptop comes with an impressive amount of RAM at 32 GB and 1 TB SSD storage. It is equipped with a Li-Ion, 4-cell, 84 Wh battery that keeps the device running for up to 10 hours.",
                characteristics3));
    }

    @Override
    public Laptop[] getAll()
    {
        return laptops.toArray(Laptop[]::new);
    }

    @Override
    public Laptop getById(int id)
    {
        for (Laptop laptop : laptops)
        {
            if (laptop.getId() == id)
            {
                return laptop;
            }
        }
        return null;
    }

    @Override
    public void add(Laptop item)
    {
        this.laptops.add(item);
    }

    @Override
    public void update(Laptop item)
    {
        Laptop laptop = getById(item.getId());
        if (laptop != null)
        {
            laptop.setName(item.getName());
            laptop.setPathToPhotos(item.getPathToPhotos());
            laptop.setDescription(item.getDescription());
            laptop.setTechnicalSpecifications(item.getTechnicalSpecifications());
        }
    }

    @Override
    public void delete(int id)
    {
        laptops.removeIf(laptop -> laptop.getId() == id);
    }

    public void delete(Laptop laptop)
    {
        laptops.remove(laptop);
    }

}
