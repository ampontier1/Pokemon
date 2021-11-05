/**
 * @author alexanderpontier - ampontier1
 * CIS175 - Spring 2021
 * Nov 4, 2021
 */
package dmacc.beans;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
public class Types {
	private String type1;
	private String type2;
	
	/**
	public Types() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Types(String type1, String type2) {
		super();
		this.type1 = type1;
		this.type2 = type2;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	@Override
	public String toString() {
		return "Types [type1=" + type1 + ", type2=" + type2 + "]";
	}
	*/

}
