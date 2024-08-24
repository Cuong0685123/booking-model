/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tc.booking.model.entity;

import com.tc.booking.model.BookingModel;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author cuong
 */
@MappedSuperclass
@Setter
@Getter
public class AppEntity implements BookingModel, Serializable, Cloneable {

  private static final long serialVersionUID = 1L;

  /**
   *
   */
  public static final int F_DEFAULT = 0;

  /**
   *
   */
  public static final int F_DELETED = -1;

  public static final int F_SYSTEM = 1;

  public static final int F_INVALID = -2;

  /**
   * Id
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /**
   *
   */
  private Date createdAt;

  /**
   *
   */
  private Date updatedAt;

  /**
   * Created by.
   */
  @Column(length = 32)
  private String createdBy;

  /**
   * Updated by.
   */
  @Column(length = 32)
  private String updatedBy;

  private Integer flag;

  public AppEntity() {
    flag = 0;
  }

}
