/**
 * @author alexanderpontier - ampontier1
 * CIS175 - Spring 2021
 * Nov 4, 2021
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Monster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String gender;
	private String color;
	@Autowired
	private Types types;

	
	/**
	public Monster() {
		super();
	}
	
	public Monster(String name) {
		super();
		this.name = name;
	}
	
	public Monster(String name, String gender, String color) {
		super();
		this.name = name;
		this.gender = gender;
		this.color = color;
	}
	
	public Monster(long id, String name, String gender, String color) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.color = color;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Types getTypes() {
		return types;
	}
	
	public void setTypes(Types types) {
		this.types = types;
	}
	
	@Override
	public String toString() {
		return "Monster [id=" + id + ", name=" + name + ", gender=" + gender + ", color=" + color
				+ ", types=" + types + "]";
	}
*/
}
