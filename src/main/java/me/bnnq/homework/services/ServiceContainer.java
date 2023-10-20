package me.bnnq.homework.services;

import me.bnnq.homework.models.Laptop;
import me.bnnq.homework.models.News;
import me.bnnq.homework.services.abstractions.IRepository;

public class ServiceContainer
{
    private static IRepository<Laptop> laptopRepository;

    public static IRepository<Laptop> getLaptopRepository()
    {
        if (laptopRepository == null)
        {
            laptopRepository = new LaptopStubRepository();
        }

        return laptopRepository;
    }

    private static IRepository<News> newsRepository;

    public static IRepository<News> getNewsRepository()
    {
        if (newsRepository == null)
        {
            newsRepository = new NewsStubRepository();
        }

        return newsRepository;
    }

}
