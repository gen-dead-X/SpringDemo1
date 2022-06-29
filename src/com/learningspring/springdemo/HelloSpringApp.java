package com.learningspring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //load the spring cinfiguration file

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container

        Coach coach = context.getBean("coach", Coach.class);

        //class methods on the beans

        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        //close the context
        context.close();
    }

}
