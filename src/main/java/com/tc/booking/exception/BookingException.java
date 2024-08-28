/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tc.booking.exception;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author binh
 */
@Getter
@Setter
public class BookingException extends Exception {

  private int errNo;
  private String errCode;
  private String errDescription;

  public BookingException(String message) {
    super(message);
    errCode = this.getClass()
        .getSimpleName();
  }

  public BookingException(String message,
      Throwable cause) {
    super(message, cause);
    errCode = this.getClass()
        .getSimpleName();
  }

}
