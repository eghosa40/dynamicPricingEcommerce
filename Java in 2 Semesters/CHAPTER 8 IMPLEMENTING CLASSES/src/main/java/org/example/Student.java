package org.example;

public class Student {
    private String studentNumber;
    private String studentName;
    private int marksForMaths = -1;
    private int marksForScience = -1;
    private int marksForEnglish = -1;
    private static double fee = 3000;

    Student(String studentNumber, String studentName){
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    public String getNumber(){
        return studentNumber;
    }

    public String getStudentName(){
        return studentName;
    }

    public void enterMarks(int marksForEnglish, int marksForScience, int marksForMaths){
        this.marksForScience = marksForScience;
        this.marksForEnglish = marksForEnglish;
        this.marksForMaths = marksForMaths;
    }

    public int getMathsMarks(){
        return marksForMaths;
    }

    public int getScienceMarks(){
        return marksForScience;
    }

    public int getEnglishMarks(){
        return marksForEnglish;
    }

    public double calculateAverageMark(){
        double averageMark = (marksForEnglish + marksForMaths + marksForScience) / 3.0;
        return averageMark;
    }

    public static double getFee(){
        return fee;
    }

    public void setFee(double fee){
        Student.fee = fee;
    }
}
