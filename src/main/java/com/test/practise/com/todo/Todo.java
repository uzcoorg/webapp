package com.test.practise.com.todo;

import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

public class Todo {
    private int id;
    private String user;

    @Size(min = 10, message = "Enter atleast 10 Characters.")
    private String desc;

private Date tDate;
private boolean isDone;
 Todo(){}

    public Todo(int id, String user, String desc, Date tDate, boolean isDone) {
        this.id = id;
        this.user = user;
        this.desc = desc;
        this.tDate = tDate;
        this.isDone = isDone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date gettDate() {
        return tDate;
    }

    public void settDate(Date tDate) {
        this.tDate = tDate;
    }

    public boolean isDone() {
        return isDone;
    }

    @Override
    public String toString() {
        return String.format(
                "ToString method - Todo{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", desc='" + desc + '\'' +
                ", tDate=" + tDate +
                ", isDone=" + isDone +
                '}');
    }

    public void setDone(boolean done) {
        isDone = done;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Todo)) return false;
        Todo todo = (Todo) o;
        return getId() == todo.getId();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId());
    }
}
