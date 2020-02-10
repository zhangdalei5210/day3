package net.work.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@AllArgsConstructor
//@Data
//@NoArgsConstructor
public class Stu {
    private Integer id;
    private String sname;
    private  Integer age;

    public Stu() {
    }

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Stu(Integer id, String sname, Integer age) {
        this.id = id;
        this.sname = sname;
        this.age = age;
    }
}
