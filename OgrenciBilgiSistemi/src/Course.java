public class Course {
    Teacher courseTeacher;
    String  name;
    String  code;
    String  prefix;
    double     note;
    int     quiz;

    double     effect;

    public  Course(String name, String code, String prefix)
    {
        this.name =             name;
        this.code =             code;
        this.prefix =           prefix;
        this.note =             0;
        this.quiz =             0;
        this.effect =           0;

    }

    public void  addTeacher(Teacher courseTeacher)
    {
        if (courseTeacher.branch.equals(this.prefix))
        {
            this.courseTeacher = courseTeacher;
        }
        else {
            System.out.print("Öğretmen ve ders uyuşmuyor");
        }
    }

    public void  printTeacher()
    {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }


}
