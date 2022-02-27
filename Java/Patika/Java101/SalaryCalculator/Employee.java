package Java101.SalaryCalculator;


public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name=name;
        this.workHours=workHours;
        this.hireYear=hireYear;
        this.salary=salary;
    }

    public double tax(){
        return (salary > 1000) ? salary * 0.03 : 0;
    }

    double bonus(){
        return (workHours>40) ? (workHours-40)*30 : 0;
    }

    public double raiseSalary()
    {
        int year=2021-this.hireYear;
        if(year<10){
            return this.salary*0.05;
        }
        else if(year>9&&year<20){
            return this.salary*0.1;
        }
        else return this.salary*0.15;
    }

    @Override
    public String toString(){
        var s = new StringBuffer();
        
        s.append("Name : "+name+"\n");
        s.append("Salary : "+salary+"\n");
        s.append("Working Hours : "+workHours+"\n");
        s.append("Starting Year : "+hireYear+"\n");
        s.append("Tax : "+ tax()+"\n");
        s.append("Bonus : "+ bonus()+"\n");
        s.append("Salary Raise : "+ raiseSalary()+"\n");
        s.append("Total Salary with Bonus and Tax:"+ (salary-tax()+bonus())+"\n");
        s.append("Total Salary : "+ (salary-tax()+bonus()+raiseSalary()));

        return s.toString();
    }
}