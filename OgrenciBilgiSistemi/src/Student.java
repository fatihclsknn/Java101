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
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
    //Sözlünün notu
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
    //Sözlünün etkileme orani
    public void addBulkQuizEffect(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.effect = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.effect = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.effect = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + String.format("%.2f",this.avarage));
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.fizik.note =((this.fizik.quiz * (this.fizik.effect /100) +(this.fizik.note * ((100 - this.fizik.effect) /100))));
        this.kimya.note =((this.kimya.quiz * (this.kimya.effect /100) +(this.kimya.note * ((100 - this.kimya.effect) /100))));
        this.mat.note =((this.mat.quiz * (this.mat.effect /100) +(this.mat.note * ((100 - this.mat.effect) /100))));

        this.avarage =   (this.fizik.note + this.kimya.note + this.mat.note) / 3;

    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}