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
//    private Date priceOf;
    private int priceOf;
    private String category;
    private int amount;

    @Ignore
//    public TaskEntry(String description, int priority, Date priceOf) {
//    public TaskEntry(String description, int priority, int priceOf) {
    public TaskEntry(String description, int priority, int priceOf,
                     String category, int amount) {
        this.description = description;
        this.priority = priority;
        this.priceOf = priceOf;
        this.category = category;
        this.amount = amount;
    }

    //    public TaskEntry(int id, String description, int priority, Date priceOf) {
    public TaskEntry(int id, String description, int priority, int priceOf,
                     String category, int amount) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.priceOf = priceOf;
        this.category = category;
        this.amount = amount;
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

//    public Date getPriceOf() {
//        return priceOf;
//    }

    public int getPriceOf() {
        return priceOf;
    }

    //    public void setPriceOf(Date priceOf) {
    public void setPriceOf(int priceOf) {
        this.priceOf = priceOf;
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
