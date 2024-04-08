package com.yuanxw.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuanxw.reggie.entity.Employee;
import com.yuanxw.reggie.mapper.EmployeeMapper;
import com.yuanxw.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
