package class6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
// Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade
// based on the following rules:
       /* if the average score >=90 → grade=A
        if the average score >= 70 and <90 → grade=B
        if the average score>=50 and <70 → grade=C
        if the average score<50 → grade=F*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the scores of quiz, mid term and final score");

        int quiz= scan.nextInt();
        int midTerm= scan.nextInt();
        int finalScore= scan.nextInt();

        int avarageScore=((quiz+midTerm+finalScore)/3);

        if(avarageScore>=90){
            System.out.println("Grade=A");
        } else if (avarageScore>=70&&avarageScore<90){
            System.out.println("Grade=B");
        } else if(avarageScore>=50&&avarageScore<70){
            System.out.println("Grade=C");
        }else if(avarageScore<50){
            System.out.println("Grade=F");
        }







    }}
