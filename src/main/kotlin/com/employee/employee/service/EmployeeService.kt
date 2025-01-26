package com.employee.employee.service
import com.employee.employee.entity.Employee
import com.employee.employee.repository.EmployeeRepository
import org.springframework.stereotype.Service

@Service
class EmployeeService(private val employeeRepository: EmployeeRepository){
    fun getAllEmployee():List<Employee> = employeeRepository.findAll()

    fun getEmployeeById(id:Long):Employee {
        return employeeRepository.findById(id)
            .orElseThrow { RuntimeException("Employee not found") }
    }

    fun createEmployee(employee:Employee):Employee = employeeRepository.save(employee)

    fun updateEmployee(id:Long, employee:Employee):Employee {
            return  if(employeeRepository.existsById(id)){
                employeeRepository.save(
                    Employee(
                        id= employee.id,
                        name= employee.name,
                        surname = employee.surname,
                        email= employee.email,
                        department = employee.department,
                        jobTitle = employee.jobTitle
                    )
                )
            } else throw RuntimeException("Employee not found")
    }

    fun deleteEmployee(id:Long){
        if(employeeRepository.existsById(id)){
            employeeRepository.deleteById(id)
        }else throw RuntimeException("Employee not found")
    }



}