package br.com.proxyspring.service;

import br.com.proxyspring.bean.StudentBean;

public interface Student {
    public String mostrarPerfil(StudentBean student);
    public StudentBean getStudentBean();
}

