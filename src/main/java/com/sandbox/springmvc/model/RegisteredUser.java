package com.sandbox.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The Class RegisteredUser.
 */
@Entity
@Table(schema = "public", name = "registereduser")
public class RegisteredUser {

  /** The id. */
  @Id
  @SequenceGenerator(name = "registereduser_id_seq_gen", sequenceName = "registereduser_id_seq",
      allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "registereduser_id_seq_gen")
  @Column(name = "id")
  private Long id;

  /** The username. */
  @Column(name = "username")
  private String username;

  /** The address. */
  @Column(name = "address")
  private String address;

  /** The email. */
  @Column(name = "email")
  private String email;

  /**
   * Instantiates a new registered user.
   */
  public RegisteredUser() {}

  /**
   * Instantiates a new registered user.
   *
   * @param id the id
   * @param username the username
   * @param address the address
   * @param email the email
   */
  public RegisteredUser(long id, String username, String address, String email) {
    this.id = id;
    this.username = username;
    this.address = address;
    this.email = email;
  }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Gets the username.
   *
   * @return the username
   */
  public String getUsername() {
    return username;
  }

  /**
   * Sets the username.
   *
   * @param username the new username
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Gets the address.
   *
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * Sets the address.
   *
   * @param address the new address
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Gets the email.
   *
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * Sets the email.
   *
   * @param email the new email
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (id ^ (id >>> 32));
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof RegisteredUser)) {
      return false;
    }
    RegisteredUser other = (RegisteredUser) obj;
    if (id != other.id) {
      return false;
    }
    return true;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "User [id=" + id + ", username=" + username + ", address=" + address + ", email=" + email
        + "]";
  }

}
