package ru.alexsahka.company.posts;

public class TopManager extends Post{

    public TopManager(){

        id   = 3L;
        name = "Тор менеджер";
    }


    @Override
    public Double getMonthSalary(){

        return 100000.00 + Math.round( Math.random() * 50000 );
    }

}
