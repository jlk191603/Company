package ru.alexsahka.company.posts;

/**
 * Должность
 */
public abstract class Post{

    protected Long id;

    protected String name;


    public abstract Double getMonthSalary();


    public Long getId(){

        return id;
    }


    public void setId( Long id ){

        this.id = id;
    }


    public String getName(){

        return name;
    }


    public void setName( String name ){

        this.name = name;
    }

}
