class EmployeeService(private val employeeRepository:EmployeeRepository){
    fun getAllEmployee():List<Employee> = employeeRepository.getAllEmployee()

    fun getEmployeeById(val id:Long):Employee = employeeRepository.findById(id)
    .orElseThrow{RunTimException("Employee not found")}



}