public class Employee {
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        float total=0;
        if (salary > 1000){
             total = (float) ((salary * 0.03));
        }
        return (float) total;
    }

    public double bonus(){
        double total = 0;
        if (workHours > 40){
         total = (workHours-40) * 30;
        }
        return total;
    }

    public double raiseSalary(){
        double increasetSalary = 0;
        int year = 2021-hireYear;
        if (year < 10){
            increasetSalary += (salary*5)/100;
        } else if (year > 9 && year < 20) {
            increasetSalary += (salary*10)/100;
        } else if (year>19) {
            increasetSalary += (salary*15)/100;
        }
        return increasetSalary;
    }

    public void print(){
        System.out.println("Ad-Soyad: " + this.name);
        System.out.println("Maaş: " + this.salary);
        System.out.println("Çalışma saati: " + this.workHours);
        System.out.println("İşe başlangıç yılı: " + hireYear);
        System.out.println("VERGİ: " + tax());
        System.out.println("Saatten bonus: " + bonus());
        System.out.println("Maaş artışı : " + raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş: " + (salary+bonus()-tax()));
        System.out.println("Toplam maaş: " + (salary+raiseSalary()));
    }


}
