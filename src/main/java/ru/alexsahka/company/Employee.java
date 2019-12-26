package ru.alexsahka.company;

import ru.alexsahka.company.posts.Operator;
import ru.alexsahka.company.posts.Post;

/**
 * Сотрудник компании
 */
public class Employee{

    private Long id;

    /**
     * Человек
     */
    private Person person;

    /**
     * Должность
     */
    private Post post;


    public Employee( Person person, Post post ){

        this.person = person;
        this.post   = post;
    }


    public Person getPerson(){

        return person;
    }


    public void setPerson( Person person ){

        this.person = person;
    }


    public Post getPost(){

        return post;
    }


    public void setPost( Post post ){

        this.post = post;
    }

}
