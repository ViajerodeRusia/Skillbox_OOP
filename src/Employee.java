import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String position;
    private double salary;
    private final double bonusManager = 0.05;
    private final double bonusTopManager = 1.5;
    private final static int companyIncome = Main.generateRandom(8_000_000, 12_000_000);

    public Employee(String name, String surname, String position, double salary, Integer earnedMoney) {
        this.name = name;
        this.surname = surname;
        this.position = position;

        switch(position) {

            case "Manager":
            this.salary = salary * (bonusManager * earnedMoney);
            break;

            case "TopManager":
                if(companyIncome>10_000_000) {
                    this.salary = salary + (bonusTopManager * companyIncome);
                } else {
                    this.salary = salary;
                }
            break;

            case "Operator":
            this.salary = salary;
            break;

            default:
                throw new RuntimeException("Неверно указана должность");
        }
    }

    @Override
    public String toString() {
        return "Employee{name='%s', surname='%s', position='%s', salary=%s}".formatted(name, surname, position, salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Double.compare(employee.bonusManager, bonusManager) == 0
                && Double.compare(employee.bonusTopManager, bonusTopManager) == 0 && companyIncome == employee.companyIncome
                && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname)
                && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, position, salary, bonusManager, bonusTopManager, companyIncome);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonusManager() {
        return bonusManager;
    }

    public double getBonusTopManager() {
        return bonusTopManager;
    }

    public static int getCompanyIncome() {
        return companyIncome;
    }
}
