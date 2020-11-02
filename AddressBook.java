public class AddressBook {
	
	private String FirstName;
    	private String LastName;
    	private String Address;
    	private String City;
    	private String State;
    	private int Zip;
    	private long PhoneNumber;
    	private String Email;

  	public String getFirstName() {
        	return FirstName;
    	}

    	public void setFirstName(String FirstName) {
        	this.FirstName = FirstName;
    	}

    	public String getLastName() {
        	return LastName;
    	}

    	public void setLastName(String LastName) {
        	this.LastName = LastName;
    	}

    	public String getAddress() {
        	return Address;
    	}

    	public void setAddress(String Address) {
        	Address = Address;
    	}

    	public String getCity() {
        	return City;
    	}

    	public void setCity(String City) {
        	this.City = City;
    	}

    	public String getState() {
        	return State;
    	}

    	public void setState(String State) {
        	this.State = State;
    	}

    	public int getZip() {
        	return Zip;
    	}

    	public void setZip(int Zip) {
        	this.Zip = Zip;
    	}

    	public long getPhoneNumber() {
        	return PhoneNumber;
    	}

    	public void setPhone(long Phone) {
        	this.PhoneNumber = PhoneNumber;
    	}

    	public String getEmail() {
        	return Email;
    	}

    	public void setEmail(String Email) {
        	this.Email = Email;
    	}

    	@Override
    	public String toString() {
        	return "AddressBook{" +
                	", FirstName='" + FirstName + '\'' +
                	", LastName='" + LastName + '\'' +
                	", Address='" + Address + '\'' +
                	", City='" + City + '\'' +
                	", State='" + State + '\'' +
                	", Zip=" + Zip +
                	", PhoneNumber=" + PhoneNumber +
                	", Email='" + Email + '\'' +
                	'}';
    	}
}
