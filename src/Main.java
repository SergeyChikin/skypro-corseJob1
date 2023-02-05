
public class Main {

    static Employee[] listOfEmployees = new Employee[10];
    static int currentId = 0;

    public static int counterId() {
        return ++currentId;
    }

    public static void main(String[] args) {
        System.out.println("Курсовая работа.");

        listOfEmployees[0] = new Employee("Багирян Данил Артурович", 1, 55_000);
        listOfEmployees[1] = new Employee("Валуйская Яна Павловна", 5, 48_000);
        listOfEmployees[2] = new Employee("Дятлова Любовь Викторовна", 3, 56_000);
        listOfEmployees[3] = new Employee("Гудков Василий Сергеевич", 4, 52_000);
        listOfEmployees[4] = new Employee("Егоров Семён Сергеевич", 3, 55_700);
        listOfEmployees[5] = new Employee("Жердев Александр Владимирович", 1, 45_400);
        listOfEmployees[6] = new Employee("Коряковцева Юлия Сергеевна", 2, 72_000);
        listOfEmployees[7] = new Employee("Низовский Михаил Андреевич", 4, 52_800);
        listOfEmployees[8] = new Employee("Орехов Егор Григорьевич", 5, 48_300);
        listOfEmployees[9] = new Employee("Перещук Екатерина Викторовна", 2, 71_400);

        for (int i = 0; i < listOfEmployees.length; i++) {
            listOfEmployees[i].getId();
        }

        printEmployeeData();
        calculatingOfSalariesPerMonth();
        searchEmployeeWithMinSalary();
        searchEmployeeWithMaxSalary();
        calculatingAverageValueOfSalaries();
        getFullNameEmployees();
    }

    static void printEmployeeData() {
        System.out.println();
        System.out.println("a. Получение списка всех сотрудников со всеми имеющимися по ним данными.");
        System.out.println();
        for (int i = 0; i < listOfEmployees.length; i++) {
            System.out.println(listOfEmployees[i].toString());
        }
    }

    static void calculatingOfSalariesPerMonth() {
        System.out.println();
        System.out.println("b. Подсчёт суммы затрат на зарплаты в месяц.");
        int allSalary = 0;
        for (int i = 0; i < listOfEmployees.length; i++) {
            allSalary += listOfEmployees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц - " + allSalary + " рублей.");
    }

    static void searchEmployeeWithMinSalary() {
        System.out.println();
        System.out.println("c. Поиск сотрудника с минимальной зарплатой.");
         int minSalary = listOfEmployees[0].getSalary();
         Employee minSalaryEmployee = listOfEmployees[0];
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i].getSalary() < minSalary) {
              minSalary = listOfEmployees[i].getSalary();
                minSalaryEmployee = listOfEmployees[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + minSalaryEmployee.getFullName() +
                " : " + minSalary + " рублей.");
    }

    static void searchEmployeeWithMaxSalary() {
        System.out.println();
        System.out.println("d. Поиск сотрудника с максимальной зарплатой.");
        int maxSalary = listOfEmployees[0].getSalary();
        Employee maxSalaryEmployee = listOfEmployees[0];
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i].getSalary() > maxSalary) {
                maxSalary = listOfEmployees[i].getSalary();
                maxSalaryEmployee = listOfEmployees[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + maxSalaryEmployee.getFullName() +
                " : " + maxSalary + " рублей.");
    }

    static void calculatingAverageValueOfSalaries() {
        System.out.println();
        System.out.println("e. Подсчёт среднего значения зарплат.");
        float allSalary = 0;
        for (int i = 0; i < listOfEmployees.length; i++) {
             allSalary += listOfEmployees[i].getSalary();
        }
        float averageValueOfSalaries = allSalary / listOfEmployees.length;
        System.out.println("Среднее значение зарплат - " + averageValueOfSalaries + " рублей.");
    }

    static void getFullNameEmployees() {
        System.out.println();
        System.out.println("f. Получение Ф.И.О. всех сотрудников.");
        for (int i = 0; i < listOfEmployees.length; i++) {
            System.out.println(listOfEmployees[i].getFullName());
        }
    }

}
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


