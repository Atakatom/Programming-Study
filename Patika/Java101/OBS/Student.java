package Java101.OBS;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }
    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.exam = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.exam = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.exam = kimya;
        }

    }

    public void addBulkQuizNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.quiz = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.quiz = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.quiz = kimya;
        }

    }

    public void isPass() {
        if (this.mat.exam == 0 || this.fizik.exam == 0 || this.kimya.exam == 0) {
            if (this.mat.quiz == 0 || this.fizik.quiz == 0 || this.kimya.quiz == 0){
                System.out.println("Quiz notlari tam olarak girilmemiş");
            } else {
                System.out.println("Exam notlari tam olarak girilmemis");
            }
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public void calcAvarage() {
        this.avarage = (this.fizik.exam * this.fizik.examWeight + this.kimya.exam * this.kimya.examWeight  + this.mat.exam * this.mat.examWeight ) / 3;
        this.avarage += (this.fizik.quiz * this.fizik.quizWeight + this.kimya.quiz * this.kimya.quizWeight  + this.mat.quiz * this.mat.quizWeight ) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.exam);
        System.out.println("Fizik Notu : " + this.fizik.exam);
        System.out.println("Kimya Notu : " + this.kimya.exam);
    }

}
