package com.bezkoder.springjwt.models;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author lam.le
 * @created 29/09/2021
 */
@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Column(name = "no", unique = true)
    private Long no;
    @Column(name = "customer_id")
    private String customerId;
    @Id
    @Column(name = "name")
    private String name;
    @Column(name = "country")
    private String country;
    @Column(name = "sales_pic")
    private String salesPic;
    @CreationTimestamp
    @Column(name = "create_date")
    private Date createDate;
}
