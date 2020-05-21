package com.capgemini.onlinemoviebooking.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="movie_user")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ")
	@SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
	@Column(name="user_id")
	private Integer userId;
	
	@Size(min=3, max=25, message="Length can be 3 and 10 chars")
	@Column(name="USERNAME",length=10,unique=true)
	private String userName;
	
	@Column(name="ISADMIN")
	private Boolean isAdmin;
	
	@Column(name="USERPASSWORD",length=16)
	private String password;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(int userId, @Size(min = 3, max = 25, message = "Length can be 3 and 10 chars") String userName,
			Boolean isAdmin, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.isAdmin = isAdmin;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
    	

}
