/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Ste-PC
 */
public class ResultsList {
    private ArrayList<Integer> scores;
    private ArrayList<Integer> grades;
    
    public ResultsList(){
        this.scores = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    
    public void add(int i){
            this.scores.add(i);
            this.grades.add(scoreToGrade(i));
    }
    
    public int scoreToGrade(int i){
        int grade = 0;
        if(i >= 90){
            grade = 5;
        } else if (i >= 80) {
            grade = 4;
        } else if (i >= 70){
            grade = 3;
        } else if (i >= 60){
            grade = 2;
        } else if (i >= 50){
            grade = 1;
        }
        
        return grade;
    }

    public void average(){
        int total = 0;
        for(int score : this.scores){
            total += score;
        }
        System.out.println("Point average (all): " + (double)total/scores.size());
    }
    
    public void passingAverage(){
        int total = 0;
        int passCount = 0;
        for(int score : this.scores){
            if(score >= 50){
                total += score;
                passCount++;
            }
        }
        if(passCount == 0){
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + (double)total/passCount);
        }
    }
    
    public void passPercentage(){
        int passed = 0;
        for(int score:scores){
            if (score >= 50){
                passed++;
            }
        }
        System.out.println("Pass percentage: "+100.0*passed/scores.size());
    }
    
    public void printStar(){
        System.out.print("*");
    }
    
    public void printGradeDistribution(){
        for(int i = 5; i >= 0; i--){
            System.out.print(i +": ");
            for(Integer grade:grades){
                if(grade == i){
                    printStar();
                }
            }    
            System.out.println();
        }
    }
}
