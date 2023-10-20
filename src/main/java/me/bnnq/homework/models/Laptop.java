package me.bnnq.homework.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Dictionary;

@AllArgsConstructor
@Getter
@Setter
public class Laptop
{
    private int id;
    private String name;
    private String[] pathToPhotos;
    private String description;
    private Dictionary<String, String> technicalSpecifications;
}
