package practice;

public class Address {
	private String no;
	private int house;
	private String roud;
	public Address(String no, int house, String roud) {
		this.no = no;
		this.house = house;
		this.roud = roud;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getHouse() {
		return house;
	}
	public void setHouse(int house) {
		this.house = house;
	}
	@Override
	public String toString() {
		return "Address [no=" + no + ", house=" + house + ", roud=" + roud + "]";
	}
	public String getRoud() {
		return roud;
	}
	public void setRoud(String roud) {
		this.roud = roud;
	}
}
