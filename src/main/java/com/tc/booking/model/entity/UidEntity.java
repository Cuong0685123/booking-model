/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tc.booking.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author binh
 */
@MappedSuperclass
@Setter
@Getter
public class UidEntity extends AppEntity {

  private static final long serialVersionUID = 1L;

  @Column(length = 64)
  private String uuid;

  public UidEntity() {
    super();
    uuid = UUID.randomUUID()
        .toString();
  }

}
