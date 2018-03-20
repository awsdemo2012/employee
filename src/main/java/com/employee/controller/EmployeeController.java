package com.employee.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.domain.Employee;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value="/employees", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeeController {

    private static final String template = "Hello, %s!";

    private final AtomicLong counter = new AtomicLong();

    @ApiOperation(value = "/", nickname = "List of Employees")
    @RequestMapping(method = RequestMethod.GET, path="/", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Employee.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(counter.incrementAndGet(), "John", "Doe"));
        employees.add(new Employee(counter.incrementAndGet(), "Alex", "John"));
        return employees;
    }


}
