package baitapchuong3;

public abstract class Person6 {
	protected String name;
	protected int age;
	protected char gender;
	public Person6() {}
	public Person6(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public abstract void nhapTT();
	@Override
	public String toString() {
		return "Person6 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	

}
