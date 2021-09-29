package com.bezkoder.springjwt.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

/**
 * @author lam.le
 * @created 29/09/2021
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private Long no;
    @NotEmpty
    private String customerId;
    @NotEmpty
    private String name;
    @NotEmpty
    private String country;
    @NotEmpty
    private String salesPic;
    private Date createDate;
}
