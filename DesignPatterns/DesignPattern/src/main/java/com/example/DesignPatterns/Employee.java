package DesignPattern.src.main.java.com.example.DesignPatterns;

public class Employee {
    private String name;
    private String company;
    private boolean hasCar;//optional
    private boolean hasBike;//optional

    private Employee(EmployeeBuilder employeeBuilder) {
        name = employeeBuilder.name;
        company = employeeBuilder.company;
        hasCar = employeeBuilder.hasCar;
        hasBike = employeeBuilder.hasBike;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    public boolean isHasBike() {
        return hasBike;
    }

    public void setHasBike(boolean hasBike) {
        this.hasBike = hasBike;
    }

    public static class EmployeeBuilder{
        private String name;
        private String company;
        private boolean hasCar;//optional
        private boolean hasBike;//optional
        public EmployeeBuilder(String name,String Company)
        {
            this.name=name;
            this.company=company;

        }


        public EmployeeBuilder setHasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }
        public EmployeeBuilder setHasBike(boolean hasBike) {
            this.hasBike = hasBike;
            return this;
        }
        public Employee build()
        {
            return new Employee(this);
        }
    }
}
