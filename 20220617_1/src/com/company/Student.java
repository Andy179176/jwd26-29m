package com.company;

import java.util.List;

public class Student {
    private String name;
    private List<Integer> scores;

    public Student(String name, List<Integer> scores) {
        this.name = name;
        this.scores = scores;
    }

    @Override
    public String toString() {
        return name + "  "   + scores;
    };

    public String getName() {
        return name;
    }

    public  double getGPA(){
        if(scores==null||scores.isEmpty()) return 0;
        double res=0;
        for (Integer i:scores) {
            if(i!=null) res+=i;
        }
        return 1.0*res/scores.size();
    }
}
