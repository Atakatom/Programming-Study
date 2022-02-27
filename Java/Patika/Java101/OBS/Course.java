package Java101.OBS;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    double exam = 0;
    double quiz = 0;
    double examWeight;
    double quizWeight;

    public Course(String name, String code, String prefix, double quizWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.quizWeight = quizWeight;
        this.examWeight = 1 - quizWeight;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
