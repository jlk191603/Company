package ru.alexsahka.company;

/**
 * Человек
 */
public class Person{

    private Long id;

    private String family;

    private String firstName;

    private String secondName;


    public Person( String family ){

        this.family = family;
    }


    public Long getId(){

        return id;
    }


    public void setId( Long id ){

        this.id = id;
    }


    public String getFamily(){

        return family;
    }


    public void setFamily( String family ){

        this.family = family;
    }


    public String getFirstName(){

        return firstName;
    }


    public void setFirstName( String firstName ){

        this.firstName = firstName;
    }


    public String getSecondName(){

        return secondName;
    }


    public void setSecondName( String secondName ){

        this.secondName = secondName;
    }

}
