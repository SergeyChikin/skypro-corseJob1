class Employee {
    private String fullName;
    private int department;
    private int salary;
    private int id = 0;
    public Employee(String fullName, int department, int salary){
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = Main.counterId();
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(byte department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Ф.И.О - " + fullName + "; Индекс - " + String.valueOf(getId()) + "; Отдел - " + department +
                "; Зарплата - " + salary + " рублей.";
    }

}

