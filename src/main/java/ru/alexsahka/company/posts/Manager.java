package ru.alexsahka.company.posts;

public class Manager extends Post{

    public Manager(){

        id   = 2L;
        name = "Менеджер";
    }


    @Override
    public Double getMonthSalary(){

        return 60000.00 + Math.round( Math.random() * 20000 );
    }

}
