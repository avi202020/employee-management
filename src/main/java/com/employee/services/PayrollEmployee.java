package com.employee.services;

import com.employee.model.Employee;

import static java.text.NumberFormat.getCurrencyInstance;


/**
 * DTO Abstraction.
 */
@SuppressWarnings("unused")
public interface PayrollEmployee {

  int getId();

  String getName();

  String getContractTypeName();

  void setPhone(String phone);

  String getPhoneType();

  String getPhoneNumber();

  int getRoleId();

  String getRoleName();

  String getRoleDescription();

  double getBaseSalary();

  double getAnnualSalary();

  default String getFormattedBaseSalary() {
    return getCurrencyInstance().format(getBaseSalary());
  }

  default String getFormattedAnnualSalary() {
    return getCurrencyInstance().format(getAnnualSalary());
  }

  static PayrollEmployee from(com.employee.model.Employee emp) {
    return emp.getContractTypeName().contains("Hourly") ?
        new HourlyPayrollEmployee(emp.getEmpId(), emp.getName(), emp.getContractTypeName(), emp.getRoleId(),
            emp.getRoleName(), emp.getRoleDescription(), emp.getHourlySalary()) :
        new MonthlyPayrollEmployee(emp.getEmpId(), emp.getName(), emp.getContractTypeName(), emp.getRoleId(),
            emp.getRoleName(), emp.getRoleDescription(), emp.getMonthlySalary());
  }

  void setSalary(Employee employee);
}
