package br.com.proxyspring.service;

import br.com.proxyspring.bean.StudentBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class StudentServiceProxy implements Student {
    @Autowired
    private StudentService service;

    public String getStudentProfile(String rg) {
        if(Objects.nonNull(service.getStudentBean()) &&
                rg.matches(service.getStudentBean().getDocument())) {
            StudentBean studentBean = service.getStudentBean();
            return mostrarPerfil(studentBean);
        } else {
            return service.getStudentProfile(rg);
        }
    }
    @Override
    public StudentBean getStudentBean() {
        return null;
    }
    @Override
    public String mostrarPerfil(StudentBean studentBean) {
        return "from proxy==>"+ studentBean.toString();
    }
}
