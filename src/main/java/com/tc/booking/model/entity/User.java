/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tc.booking.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author binh
 */
@Entity
@Table(name = "bok_user")
@Getter
@Setter
public class User extends AppEntity {

  private static final long serialVersionUID = 1L;

  @Column(length = 32)
  private String login;

  @JsonIgnore
  @Column(name = "sec_salt")
  private String salt;

  @JsonIgnore
  @Column(name = "sec_password")
  private String password;

  @Column(name = "force_change_password", columnDefinition = "tinyint(1) default 0")
  private boolean forceChangePassword;

  private boolean active;

  public User() {
    super();
  }

}
