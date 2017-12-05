package com.ketan.dto;

/*@Entity(name = "user_details")*/
public class UserDetails {
	/*
	
	@Id
	@SequenceGenerator(name = "EMP_SEQs", sequenceName = "emp_seqs", allocationSize = 1)
	
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "EMP_SEQs")
	private int userId;
	private String userName;
	@Temporal(TemporalType.DATE)
	private Date joiningDate;
	@AttributeOverrides({ @AttributeOverride(name = "street", column = @Column(name = "Home_street")) })
	private Address address;
	@Lob
	private String description;
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name = "user_address", joinColumns = @JoinColumn(name = "user_id"))
	@GenericGenerator(name = "hilo-gen", strategy = "sequence")
	@CollectionId(columns = { @Column(name = "address_key") }, generator = "hilo-gen", type = @Type(type = "long"))
	// @OrderColumn(name = "Address_index")
	private Collection<Address> listOfAddresses = new ArrayList<>();
	
	public void setListOfAddresses(Collection<Address> listOfAddresses) {
	this.listOfAddresses = listOfAddresses;
	}
	
	public int getUserId() {
	return userId;
	}
	
	public void setUserId(int userId) {
	this.userId = userId;
	}
	
	@Column(name = "user_name")
	public String getUserName() {
	return userName + " from getter";
	}
	
	public void setUserName(String userName) {
	this.userName = userName;
	}
	
	public Date getJoiningDate() {
	return joiningDate;
	}
	
	public void setJoiningDate(Date joiningDate) {
	this.joiningDate = joiningDate;
	}
	
	public Address getAddress() {
	return address;
	}
	
	public void setAddress(Address address) {
	this.address = address;
	}
	
	public String getDescription() {
	return description;
	}
	
	public void setDescription(String description) {
	this.description = description;
	}
	
	public Collection<Address> getListOfAddresses() {
	return listOfAddresses;
	}
	
	*/}
