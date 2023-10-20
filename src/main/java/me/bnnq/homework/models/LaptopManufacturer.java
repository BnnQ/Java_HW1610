package me.bnnq.homework.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class LaptopManufacturer
{
    private String name;
    private String country;
    private String pathToLogo;
    private int numberOfEmployees;
    private String shortDescription;
    private String[] pathToPhotos;
    private String[] linksToExternalSources;
}
