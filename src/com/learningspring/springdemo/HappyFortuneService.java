package com.learningspring.springdemo;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is you Lucky Day!";
    }
}
