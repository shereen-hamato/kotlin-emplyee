package com.employee.employee.controller


import com.employee.employee.entity.Employee
import com.employee.employee.service.EmployeeService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/employees")
class EmployeeController(private val employeeService: EmployeeService) {

    @GetMapping()
    fun getAllEmployees(): List<Employee> = employeeService.getAllEmployee()

    @GetMapping("/{id}")
    fun getEmployee(@PathVariable("id") id: Long):Employee = employeeService.getEmployeeById(id)

    @PostMapping()
    fun createEmployee(@RequestBody employee: Employee): Employee = employeeService.createEmployee(employee)

    @PutMapping("{id}")
    fun updateEmployee(@PathVariable("id") id: Long, @RequestBody employee: Employee): Employee =
        employeeService.updateEmployee(id,employee)

    @DeleteMapping("{id}")
    fun deleteEmployee(@PathVariable("id") id :Long) = employeeService.deleteEmployee(id)


}