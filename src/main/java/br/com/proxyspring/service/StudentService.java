package br.com.proxyspring.service;

import br.com.proxyspring.bean.StudentBean;
import br.com.proxyspring.business.StudentMicroservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements Student {

    @Autowired
    private StudentMicroservice microservice;
    private StudentBean studentBean;

    public String getStudentProfile(String rg) {
        StudentBean studentBean = microservice.getStudentProfile(rg);
        this.studentBean = studentBean;
        return mostrarPerfil(studentBean);
    }
    @Override
    public String mostrarPerfil(StudentBean studentBean) {
        return "From microservice==>"+ studentBean.toString();
    }
    @Override
    public StudentBean getStudentBean() {
        return this.studentBean;
    }
}
