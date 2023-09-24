package com.mumu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author mumu
 * @since 2023-09-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ConferenceRooms implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 房间序号
     */
      @TableId(value = "room_id", type = IdType.AUTO)
    private Integer roomId;

    /**
     * 部门
     */
    private String department;

    private String roomName;

    private String type;

    private String location;

    private LocalDate date;

    private LocalTime startTime;

    private LocalTime endTime;

    private String maxDuration;


}
