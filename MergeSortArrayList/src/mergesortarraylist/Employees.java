/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortarraylist;

/**
 *
 * @author nguoitamxa
 */
public class Employees {
    int id;
    String name;
    int level;

    public Employees() {
    }

    public Employees(int id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
     
    public void print() {
        System.out.printf("%-10s%-10s%-10s\n",id, name, level);
    }
}
