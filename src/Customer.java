/**
 * 
 */

/**
 * @author Acer Aspire 5
 *
 */
public class Customer {
	
	
	public String OrderId;
	public String Customername;
	public String pickedUp;
	public String Dlocation;
	public String DPerson;
	public double cost;
	public String DType;
	public double weight;
	public double distance;
	public double priceper1Km;
	
	
	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String orderId) {
		OrderId = orderId;
	}
	public String getCustomername() {
		return Customername;
	}
	public void setCustomername(String customername) {
		Customername = customername;
	}
	public String getPickedUp() {
		return pickedUp;
	}
	public void setPickedUp(String pickedUp) {
		this.pickedUp = pickedUp;
	}
	public String getDlocation() {
		return Dlocation;
	}
	public void setDlocation(String dlocation) {
		Dlocation = dlocation;
	}
	public String getDPerson() {
		return DPerson;
	}
	public void setDPerson(String dPerson) {
		DPerson = dPerson;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getDType() {
		return DType;
	}
	public void setDType(String dType) {
		DType = dType;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getPriceper1Km() {
		return priceper1Km;
	}
	public void setPriceper1Km(double priceper1Km) {
		this.priceper1Km = priceper1Km;
	}
	
	public Customer(String orderId, String customername, String pickedUp, String dlocation, String dPerson, double cost,
			String dType, double weight, double distance, double priceper1Km) {
		super();
		OrderId = orderId;
		Customername = customername;
		this.pickedUp = pickedUp;
		Dlocation = dlocation;
		DPerson = dPerson;
		this.cost = cost;
		DType = dType;
		this.weight = weight;
		this.distance = distance;
		this.priceper1Km = priceper1Km;
	}
	@Override
	public String toString() {
		return "Customer [OrderId=" + OrderId + ", Customername=" + Customername + ", pickedUp=" + pickedUp
				+ ", Dlocation=" + Dlocation + ", DPerson=" + DPerson + ", cost=" + cost + ", DType=" + DType
				+ ", weight=" + weight + ", distance=" + distance + ", priceper1Km=" + priceper1Km + "]";
	}
	
	
	
	
}
