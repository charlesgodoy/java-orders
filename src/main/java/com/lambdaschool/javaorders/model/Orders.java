package com.lambdaschool.javaorders.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ordnum;

    @Column(nullable = false)
    private double ordamount;

    @Column(nullable = false)
    private double advanceamount;

    @ManyToOne
    @JoinColumn(name ="custcode", nullable=false)
    @JsonIgnore
    private Customers customers;

    @ManyToOne
    @JoinColumn(name ="agentcode", nullable=false)
    @JsonIgnore
    private Agents agents;

    @Column(nullable = false)
    private String orddescription;

    public Orders() {
    }

    public Orders(double ordamount, double advanceamount, Customers customers, Agents agents, String orddescription) {
        this.ordamount = ordamount;
        this.advanceamount = advanceamount;
        this.customers = customers;
        this.agents = agents;
        this.orddescription = orddescription;
    }

    public long getOrdnum() {
        return ordnum;
    }

    public double getOrdamount() {
        return ordamount;
    }

    public void setOrdamount(double ordamount) {
        this.ordamount = ordamount;
    }

    public double getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount) {
        this.advanceamount = advanceamount;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public Agents getAgents() {
        return agents;
    }

    public void setAgents(Agents agents) {
        this.agents = agents;
    }

    public String getOrddescription() {
        return orddescription;
    }

    public void setOrddescription(String orddescription) {
        this.orddescription = orddescription;
    }
}
