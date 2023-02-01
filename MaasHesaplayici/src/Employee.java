public class Employee {
    String  name;
    double  salary;
    int     workHours;
    int     hireYear;

    int     currentDate = 2021;
    Employee(String name, double salary, int workHours, int hireYear)
    {
        this.name       =   name;
        this.salary     =   salary;
        this.workHours  =   workHours;
        if (currentDate - hireYear > 0)
        {
            this.hireYear   =   hireYear;
        }
        else {
            this.hireYear = 0;
        }


    }

    public  double tax()
    {
        if (this.salary < 1000)
        {
            return 0;
        }
        else {
            return (this.salary * 3) / 100;
        }
    }

    public double bonus()
    {
        if (workHours > 40)
        {
            return (workHours - 40) * 30;
        }
        else
        {
            return 0;
        }
    }

    public  double raiseSalary()
    {
        if (this.currentDate - this.hireYear < 10 && this.currentDate - this.hireYear > 0 )
        {
            return (salary * 0.05);
        }
        else if (this.currentDate - this.hireYear > 9 && this.currentDate - this.hireYear < 20 )
        {
            return (salary * 0.10);
        }
        else {
            return (salary * 0.15);
        }

    }

    @Override
    public String toString() {
        return String.format("Adı: %s\nMaaşı: %.2f\nÇalışma Saati: %d\nBaşlangıç Yılı: %d\nVergi: %.2f\nBonus: %.2f\nMaas Artisi: %.2f\nVergi ve Bonuslar ile birlikte maaş : %.2f\nToplam Maaş : %.2f",
                this.name,this.salary,this.workHours,this.hireYear,tax(),bonus(),raiseSalary(),(salary + bonus() - tax() ),(salary + raiseSalary()));
    }
}
