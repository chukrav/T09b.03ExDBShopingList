package com.example.android.todolist.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "tasks_01")
public class TaskEntry {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String description;
    private int priority;
    @ColumnInfo(name = "price_of")
//    private Date updatedAt;
    private int updatedAt;
    private String category;
    private int amount;

    @Ignore
//    public TaskEntry(String description, int priority, Date updatedAt) {
    public TaskEntry(String description, int priority, int updatedAt) {
        this.description = description;
        this.priority = priority;
        this.updatedAt = updatedAt;
        category = "EVERYTHING";
        amount = 200;
    }

    //    public TaskEntry(int id, String description, int priority, Date updatedAt) {
    public TaskEntry(int id, String description, int priority, int updatedAt) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.updatedAt = updatedAt;
        category = "EVERYTHING";
        amount = 200;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

//    public Date getUpdatedAt() {
//        return updatedAt;
//    }

    public int getUpdatedAt() {
        return updatedAt;
    }

    //    public void setUpdatedAt(Date updatedAt) {
    public void setUpdatedAt(int updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
