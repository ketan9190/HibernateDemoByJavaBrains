package com.ketan.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
/*@DiscriminatorColumn(name = "vehicle_type", discriminatorType = DiscriminatorType.STRING)*/
public class Vehicle {
	@Id
	@SequenceGenerator(name = "EMP_SEQ", sequenceName = "emp_seq", allocationSize = 1)

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMP_SEQ")
	private int vehicleId;
	private String vehicleName;
	/*@ManyToOne
	@NotFound(action = NotFoundAction.IGNORE)
	private UserDetails2 user;
	
	public UserDetails2 getUser() {
		return user;
	}
	
	public void setUser(UserDetails2 user) {
		this.user = user;
	}*/

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

}
