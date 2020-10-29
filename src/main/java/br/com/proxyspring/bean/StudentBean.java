package br.com.proxyspring.bean;



public class StudentBean {
    private String id;
    private String document;
    private String name;
    public StudentBean() {
    }
    public StudentBean(String id, String document, String name) {
        this.id = id;
        this.document = document;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getDocument() {
        return document;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", document='" + document + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
