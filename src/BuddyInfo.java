
public class BuddyInfo {

	private String name;
	private String address;
	private String phone_num;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}

	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo();
		buddy.setName("Homer");
		System.out.println("Hello "+buddy.getName());
	}

}
