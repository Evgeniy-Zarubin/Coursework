import java.util.Arrays;
public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        fullEmployees();
        massive(employees);
        sumFot(employees);
        minFot(employees);
        maxFot(employees);
        sredFot(employees);
        fio(employees);
    }

    public static void fullEmployees(){
        Employee manager = new Employee("Зарубин Евгений Викторович", 1, 125000);
        Employee regionManager = new Employee("Волков Александр Ларионович", 1, 230000);
        Employee director = new Employee("Соловьёв Владимир Леонидович", 2, 321000);
        Employee deputyDirector = new Employee("Леванской Пётр Сергеевич", 1, 280000);
        Employee accountant = new Employee("Тахватулина Алиса Андреевна", 3, 80000);
        Employee merchandiser = new Employee("Антонова Ольга Алексеевна", 4, 75000);
        Employee headOfWarehouse = new Employee("Сергеев Андрей Виктороович", 5, 140000);
        Employee salesAgent = new Employee("Севастьянов Алексей Леонидович", 1, 115000);
        Employee inventoryManagement = new Employee("Клокова Валерия Олеговна", 4, 90000);
        Employee branchManager = new Employee("Войцехович Альберт Викторович", 2, 220000);

        employees[0] = manager;
        employees[1] = regionManager;
        employees[2] = director;
        employees[3] = deputyDirector;
        employees[4] = accountant;
        employees[5] = merchandiser;
        employees[6] = headOfWarehouse;
        employees[7] = salesAgent;
        employees[8] = inventoryManagement;
        employees[9] = branchManager;
    }

    public static void massive(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].toString());
        }
    }

    public static double sumFot(Employee[] employee) {
        double sum = 0;
        for (Employee em : employee) {
            sum = sum + em.getSalary();
        }
        System.out.println("Сумма трат за месяц составляет: " + sum);
        return sum;
    }

    public static double sredFot(Employee[] employee) {
        double avarage = sumFot(employee) / employee.length;
        System.out.println("Средняя зарплата в месяц составляет: " + avarage);
        return avarage;
    }

    public static String minFot(Employee[] employee) {
        double minzp = Integer.MAX_VALUE;
        String fullName = "";
        for (Employee em : employee) {
            if (minzp >= em.getSalary()) {
                minzp = em.getSalary();
                fullName = em.getFullName();
            }
        }
        System.out.println("Минимальная зарплата у сотрудника: " + fullName + " и она равна: " + minzp);

        return fullName + minzp;
    }

    public static String maxFot(Employee[] employee) {
        double maxzp = 0;
        String fullName = "";
        for (Employee em : employee) {
            if (maxzp < em.getSalary()) {
                maxzp = em.getSalary();
                fullName = em.getFullName();
            }
        }
        System.out.println("Максимальная зарплата у сотрудника: " + fullName + " и она равна: " + maxzp);

        return fullName + maxzp;
    }

    public static void fio(Employee[] employee) {
        for (Employee em : employee) {
            System.out.println(em.getFullName());
        }
    }

}