/*
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */
package com.example.todo.model;
import javax.persistence.*;

// Write your code here

@Entity
@Table(name = "todolist")
public class Todo{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "todo")
    private String todo;

    @Column(name = "status")
    private String status;

    @Column(name = "priority")
    private String priority;

    public Todo(){}

    public Todo(int id, String todo, String priority, String status){
        this.id = id;
        this.todo = todo;
        this.priority = priority;
        this.status = status;
    } 

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getTodo(){
        return this.todo;
    }
    public void setTodo(String todo){
        this.todo = todo;
    }
    public String getStatus(){
        return this.status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getPriority(){
        return this.priority;
    }
    public void setPriority(String priority){
        this.priority = priority;
    }
    
}