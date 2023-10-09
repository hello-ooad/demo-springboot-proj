package com.mumu.entity;

import java.sql.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.sql.Time;

import lombok.*;

/**
 * <p>
 * 
 * </p>
 *
 * @author mumu
 * @since 2023-10-05
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Flighttable implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("FlightNo")
    private String FlightNo;

    @TableField("AirlineCompany")
    private String AirlineCompany;

    @TableField("From1")
    private String From1;

    @TableField("To1")
    private String To1;

      private Integer flightId;

    @TableField("Date1")
    private Date Date1;


    @TableField("DepartureTime")
    private Time DepartureTime;

    @TableField("ArriveTime")
    private Time ArriveTime;


}
