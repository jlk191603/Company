package ru.alexsahka.company;

import java.util.List;

/**
 * Компания
 */
public class Company{

    private Long id;

    private String name;

    private List<Employee> employees;


    public Company( String name ){

        this.name = name;
    }


    public String getName(){

        return name;
    }


    public void setName( String name ){

        this.name = name;
    }


    public List<Employee> getEmployees(){

        return employees;
    }


    public void setEmployees( List<Employee> employees ){

        this.employees = employees;
    }

}
