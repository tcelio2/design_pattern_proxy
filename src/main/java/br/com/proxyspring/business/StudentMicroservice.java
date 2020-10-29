package br.com.proxyspring.business;

import br.com.proxyspring.bean.StudentBean;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class StudentMicroservice {

    public StudentBean getStudentProfile(String rg) {
        StudentBean studentBean = new StudentBean();
        if(Objects.nonNull(rg) && rg.matches("123")) {
            studentBean.setId("1");
            studentBean.setDocument("123");
            studentBean.setName("Thiago Pereira");
        }
        if(Objects.nonNull(rg) && rg.matches("456")) {
            studentBean.setId("2");
            studentBean.setDocument("456");
            studentBean.setName("Gustavo Pereira");
        }
        return studentBean;
    }


}

