package ru.alexsahka.company.posts;

public class Operator extends Post{

    public Operator(){

        id   = 1L;
        name = "Оператор";
    }


    @Override
    public Double getMonthSalary(){

        return 30000.00 + Math.round( Math.random() * 10000 );
    }

}
