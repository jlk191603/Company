package ru.alexsahka.company;

import ru.alexsahka.company.posts.Manager;
import ru.alexsahka.company.posts.Operator;
import ru.alexsahka.company.posts.Post;
import ru.alexsahka.company.posts.TopManager;

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main( String[] args ){

        Company company = generateCompany();
        List<Employee> employees = company.getEmployees();
        printSales( employees );
    }


    private static void printSales( List<Employee> employees ){

        StringBuilder sb;
        Post post;
        String space = "\t\t";
        for( Employee emp : employees ){
            sb = new StringBuilder();
            sb.append( emp.getPerson().getFamily() );
            sb.append( space );
            post = emp.getPost();
            sb.append( post.getName() );
            sb.append( space );
            sb.append( post.getMonthSalary() );
            System.out.println( sb );
        }
    }


    private static Company generateCompany(){

        Company company = new Company( "Рога и копыта" );
        company.setEmployees( generateEmployees() );
        return company;
    }


    private static List<Employee> generateEmployees(){

        List<Person> persons = generatePersons();
        List<Post> posts = generatePosts();

        List<Employee> res = new ArrayList<>();
        int postIdx = 0;
        for( Person person : persons ){
            res.add( new Employee( person, posts.get( postIdx ) ) );
            postIdx = postIdx == posts.size() ? 0 : postIdx + 1;
        }
        return res;
    }


    private static List<Person> generatePersons(){

        List<Person> persons = new ArrayList<>();
        String[] families = { "Иванов", "Петров", "Сидоров" };
        for( String family : families ){
            persons.add( new Person( family ) );
        }
        return persons;
    }


    private static List<Post> generatePosts(){

        List<Post> posts = new ArrayList<>();
        posts.add( new Operator() );
        posts.add( new Manager() );
        posts.add( new TopManager() );
        return posts;
    }


}
