import java.util.Objects;

public class User {
	
	private String name;
	private int age;
	
	
	public User(String name, int age) throws InvalidAgeException  {
		if(age<0) {
			throw new InvalidAgeException("Age can't be negative");
		}
		if(age>200) {
			throw new InvalidAgeException("vampires are not allowed to be a user ");
		}
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
	

}
