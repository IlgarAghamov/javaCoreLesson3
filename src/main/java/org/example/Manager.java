package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Manager extends Employee {
    public Manager(String fio, String position, String phoneNumber, BigDecimal salary, LocalDate birthDate) {
        super(fio, position, phoneNumber, salary, birthDate);
    }

    public static void increaseSalaryForEmployees(List<Employee> employees, int bonusValue) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.increaseSalary(bonusValue);
            }
        }
    }
}
