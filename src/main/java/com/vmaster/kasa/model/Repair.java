package com.vmaster.kasa.model;

import java.time.LocalDate;
import java.util.Objects;

public class Repair {
    private long id;
    private int repairId;
    private int sum;
    private int spare;
    private int salary;
    private String spareName;
    private WareHouse wareHouse;
    private Employ employ;
    private User user;
    private LocalDate date;
    private Kasa kasa;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRepairId() {
        return repairId;
    }

    public void setRepairId(int repairId) {
        this.repairId = repairId;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getSpare() {
        return spare;
    }

    public void setSpare(int spare) {
        this.spare = spare;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSpareName() {
        return spareName;
    }

    public void setSpareName(String spareName) {
        this.spareName = spareName;
    }

    public WareHouse getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    public Employ getEmploy() {
        return employ;
    }

    public void setEmploy(Employ employ) {
        this.employ = employ;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;

    }

    public Kasa getKasa() {
        return kasa;
    }

    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repair repair = (Repair) o;
        return id == repair.id && repairId == repair.repairId && sum == repair.sum && spare == repair.spare && salary == repair.salary && Objects.equals(spareName, repair.spareName) && wareHouse == repair.wareHouse && Objects.equals(employ, repair.employ) && Objects.equals(user, repair.user) && Objects.equals(date, repair.date) && kasa == repair.kasa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, repairId, sum, spare, salary, spareName, wareHouse, employ, user, date, kasa);
    }

    @Override
    public String toString() {
        return "Repair{" +
                "id=" + id +
                ", repairId=" + repairId +
                ", sum=" + sum +
                ", spare=" + spare +
                ", salary=" + salary +
                ", spareName='" + spareName + '\'' +
                ", wareHouse=" + wareHouse +
                ", employ=" + employ +
                ", user=" + user +
                ", date=" + date +
                ", kasa=" + kasa +
                '}';
    }
}
