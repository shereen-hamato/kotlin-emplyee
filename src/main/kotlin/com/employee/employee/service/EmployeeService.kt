import com.employee.employee.entity.Employee
import com.employee.employee.repository.EmployeeRepository

class EmployeeService(private val employeeRepository: EmployeeRepository){
    fun getAllEmployee():List<Employee> = employeeRepository.findAll()

    fun getEmployeeById(id:Long):Employee = employeeRepository.findById(id)
    .orElseThrow{RuntimeException("Employee not found")}



}