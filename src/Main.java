import java.util.Arrays;

public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("1 Фамилия Имя Отчество", 2000);
        employees[1] = new Employee("2 Фамилия Имя Отчество", 2300);
        employees[2] = new Employee("3 Фамилия Имя Отчество", 4000);
        employees[3] = new Employee("4 Фамилия Имя Отчество", 1700);
        employees[4] = new Employee("5 Фамилия Имя Отчество", 2100);
        employees[5] = new Employee("6 Фамилия Имя Отчество", 5000);
        employees[6] = new Employee("7 Фамилия Имя Отчество", 4300);
        employees[7] = new Employee("8 Фамилия Имя Отчество", 2200);
        employees[8] = new Employee("9 Фамилия Имя Отчество", 6000);
        employees[9] = new Employee("10 Фамилия Имя Отчество", 3200);
        System.out.println(Arrays.toString(employees) + " ");


        System.out.println("Сумма всех зарплат: " + calculateSumSalary());
        Employee employeeWithMaxSalary = getEmployeeWithMaxSalary();
        if (employeeWithMaxSalary == null) {
            System.out.println("Нет сотрудника с максимальной зарплатой");
        } else {
            System.out.println("Сотрудник с максимальной зарплатой: " + getEmployeeWithMaxSalary());
        }

        Employee employeeWithMinSalary = getEmployeeWithMinSalary();
        if (employeeWithMinSalary == null) {
            System.out.println("Нет сотрудника с минимальной зарплатой");
        } else {
            System.out.println("Сотрудник с минимальной зарплатой: " + getEmployeeWithMinSalary());
        }
    }

    public static int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public static Employee getEmployeeWithMaxSalary(){
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for(Employee employee : employees) {
            if(employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    public static Employee getEmployeeWithMinSalary(){
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for(Employee employee : employees) {
            if(employee != null && employee.getSalary() <= min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

}