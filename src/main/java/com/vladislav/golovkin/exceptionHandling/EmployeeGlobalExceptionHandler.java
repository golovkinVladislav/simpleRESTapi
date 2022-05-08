package com.vladislav.golovkin.exceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class EmployeeGlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<EmployeeInfo> handlerException(
            EmployeeException exception)
    {EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setInfo(exception.getMessage());
        return new ResponseEntity<>(employeeInfo, HttpStatus.NOT_FOUND);

    }
    @ExceptionHandler
    public ResponseEntity<EmployeeInfo> handlerException(
            Exception exception)
    {EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setInfo(exception.getMessage());
        return new ResponseEntity<>(employeeInfo, HttpStatus.BAD_REQUEST);

    }
}
