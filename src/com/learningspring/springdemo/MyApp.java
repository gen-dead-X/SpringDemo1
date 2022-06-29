package com.learningspring.springdemo;

public class MyApp {
    public static void main(String[] args) {

//        Coach coach = new BaseballCoach();
        Coach coach = new TrackCoach();
        System.out.println(coach.getDailyWorkout());
    }
}
