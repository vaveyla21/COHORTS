public class Employee {
    String nameSurname;
    int salary;
    int workHours;
    int hireYear;

    Employee(String nameSurname, int salary, int workHours, int hireYear){
        this.nameSurname = nameSurname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void tax(){
        int result = Employee.this.salary;
        if (result<1000) {
            System.out.println("Maaşınız (vergi dilimi alınmamıştır) : " + result);
        }


    }




}
