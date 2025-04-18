package Team1_scrum4;

public class Team1_Cat {
	private String name;
	private String color;
	private double weight;
	
	public Team1_Cat() {
		this.name = "";
		this.color = "";
		this.weight = 0.0;
	}
	
	public Team1_Cat(String name) {
		this.name = name;
		this.color = "";
		this.weight = 0.0;
	}
	
	public Team1_Cat(String name, String color, double weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return String.format("Name: %s, Color: %s, Weight (lbs): %.2f", name, color, weight);
	}
}
