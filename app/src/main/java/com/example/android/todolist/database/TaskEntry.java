package com.example.android.todolist.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

//@Entity(tableName = "task")
@Database(entities = {TaskEntry.class}, version = 1, exportSchema = false)
@Entity(tableName = "list")
public class TaskEntry {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "name")
    private String description;
    @ColumnInfo(name = "cost")
    private float cost;
    @ColumnInfo(name = "amount")
    private float amount;
    @ColumnInfo(name = "category")
    private String category;



    @Ignore
    public TaskEntry(String description, float cost, float amount, String category ) {
        this.description = description;
        this.cost = cost;
        this.amount = amount;
        this.category = category;
    }

    public TaskEntry(int id, String description, float cost, float amount, String category) {
        this.id = id;
        this.description = description;
        this.cost = cost;
        this.amount = amount;
        this.category = category;
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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getCategory() {        return category;    }

    public void setCategory(String category) {  this.category = category;  }


}
