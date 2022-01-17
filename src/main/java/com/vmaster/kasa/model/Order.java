package com.vmaster.kasa.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
@Entity
@NamedNativeQuery(name = Order.ORDER_FIND_ALL, query = "select * from Order", resultClass = Order.class)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private int sum;
    private String spareName;
    private WareHouse wareHouse;
    @ManyToOne
    private User user;
    private LocalDate date;
    private Kasa kasa;

    public static final String ORDER_FIND_ALL = "Order.findAllNativeNamed";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public void setId(long id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
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
        Order order = (Order) o;
        return id == order.id && sum == order.sum && Objects.equals(spareName, order.spareName) && wareHouse == order.wareHouse && Objects.equals(user, order.user) && Objects.equals(date, order.date) && kasa == order.kasa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sum, spareName, wareHouse, user, date, kasa);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", sum=" + sum +
                ", spareName='" + spareName + '\'' +
                ", wareHouse=" + wareHouse +
                ", user=" + user +
                ", date=" + date +
                ", kasa=" + kasa +
                '}';
    }
}
