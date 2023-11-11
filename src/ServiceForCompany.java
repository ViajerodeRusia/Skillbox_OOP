public class ServiceForCompany implements Service {
    public Employee[] employees;
    public double[] topSalaries = new double[employees.length];
    public double[] lowestSalaries = new double[employees.length];
    private double max = 0;
    private double min = 0;

    public double getTopSalaryStaff() {
        int rounds = 0;
        while (rounds <= employees.length) {
            for (int i = 0; i < employees.length; i++) {
                if (max < employees[i].getSalary()) {
                    max = employees[i].getSalary();
                }
            }
            rounds+=1;
            for (int i = 0; i < topSalaries.length; i++) {
                topSalaries[i] = max;
            }
        }
        return max;
    }
    public double getLowestSalaryStaff() {
        int rounds = 0;
        while (rounds <= employees.length) {
            for (int i = 0; i < employees.length; i++) {
                if (min > employees[i].getSalary()) {
                    min = employees[i].getSalary();
                }
            }
            rounds+=1;
            for (int i = 0; i < lowestSalaries.length; i++) {
                lowestSalaries[i] = min;
            }
        }
        return min;
    }

    @Override
    public void hire(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null) {
                employees[i] = employee;
            }
        }
    }
    @Override
    public void fire(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].equals(employee)) {
                employees[i] = null;
            }
        }
    }
    public void getIncome() {
        Employee.getCompanyIncome();
    }
    public void printEmployees(){
        toString();
    }

}
