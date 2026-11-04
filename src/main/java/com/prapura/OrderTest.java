package com.prapura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Configuration
@ComponentScan("com.prapura")
public class OrderTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(OrderTest.class);
        System.out.println(context.getBean(TaskService.class).getListOfTasks());
    }
}

@Component
class TaskService {
    public List<Task> listOfTasks;

    TaskService(List<Task> listOfTasks) {
        this.listOfTasks = listOfTasks;
    }

    public List<Task> getListOfTasks() {
        return listOfTasks;
    }
}

interface Task{
}

@Component
@DependsOn("taskB")
@Order(1)
class TaskA implements Task{
    public TaskA(){
        System.out.println("Task A is being created");
    }
}

@Component
@Order(2)
class TaskB implements Task{
    public TaskB(){
        System.out.println("Task B is being created");
    }
}