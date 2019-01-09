package jp.ssie.helloworld.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the login_user database table.
 * 
 */
@Entity
@Table(name="login_user")
@NamedQuery(name="LoginUser.findAll", query="SELECT l FROM LoginUser l")
public class LoginUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	public LoginUser() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}