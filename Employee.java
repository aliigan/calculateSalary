public class Employee {
    String name;
    double salary;
    int workHours;
    int startedYear;

    public Employee(String name, double salary, int workHours, int startedYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.startedYear = startedYear;
    }

    public double tax(){
        double tax = 0;
        if (this.salary > 1000){
            tax = salary*0.03;
        }
            return tax;
        }

    public double bonus(){
        double bonus = 0;

        if (workHours > 40){
        bonus += (workHours - 40) * 30;
    }
        return bonus;
    }

    public double raiseSalary(){
        double raise = 0;
        if ((2021-startedYear) >= 10 && (2021-startedYear) <20 ){
            raise = salary*0.10;
        } else if ((2021-startedYear) >= 20) {
            raise = salary*0.15;
        }else if ((2021-startedYear) < 10){
            raise = salary*0.05;
        }else {
            System.out.println("incorrect data. try again.");
        }
        return raise;
    }

    @Override
    public String toString() {
        return "İsim: " + name +
                "\nMaaş: " + salary +
                "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + startedYear +
                "\nVergi: " + tax() +
                "\nBonus: " + bonus() +
                "\nMaaş Artışı: " + raiseSalary() +
                "\nVergi ve bonuslar ile birlikte maaş: " + (salary - tax() + bonus()) +
                "\nToplam maaş: " + (salary + - tax() + bonus() + raiseSalary());
    }
}
