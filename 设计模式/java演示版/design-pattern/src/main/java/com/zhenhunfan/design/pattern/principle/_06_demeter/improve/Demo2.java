package com.zhenhunfan.design.pattern.principle._06_demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: Demo2</p>
 * <p>Description: </p>
 *
 * @author zhenhunfan
 * @version 1.0.0
 * @date 2021/3/1
 */
public class Demo2 {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

/**
 * 学校总部员工类
 */
class Employee {
    private String id;
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
}

/**
 * 学校下属学院员工类
 */
class CollegeEmployee {
    private String id;
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
}

/**
 * 管理学院员工的管理类
 */
class CollegeManager {
    //返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) { //这里我们增加了10个员工至list
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工 id=" + i);
            list.add(emp);
        }
        return list;
    }

    /**
     * 把打印的事情挪到这里
     */
    public void printEmployee(){
        List<CollegeEmployee> list1 = getAllEmployee();
        System.out.println("--------------------------学院员工--------------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}

/**
 * 管理学校总部员工的管理类
 */
class SchoolManager {
    //返回学院的所有员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < 10; i++) { //这里我们增加了10个员工至list
            Employee emp = new Employee();
            emp.setId("学校总部员工 id=" + i);
            list.add(emp);
        }
        return list;
    }

    /**
     * 该方法完成输出学校总部和学院员工信息(id)
     * @param sub
     */
    void printAllEmployee(CollegeManager sub) {
        //打印所有学员员工信息
        sub.printEmployee();

        //获取到学校总部员工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("-------------------------- 学校总部员工--------------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
