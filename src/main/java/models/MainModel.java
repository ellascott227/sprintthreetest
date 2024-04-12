package models;

import java.util.Objects;

public class MainModel {
	float firstnumber;
	float secondnumber;
	float sum;

	public MainModel() {
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(firstnumber, secondnumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MainModel other = (MainModel) obj;
		return Float.floatToIntBits(firstnumber) == Float.floatToIntBits(other.firstnumber)
				&& Float.floatToIntBits(secondnumber) == Float.floatToIntBits(other.secondnumber);
	}

	public float addnumbers() {
		sum = firstnumber + secondnumber;
		return sum;
	}

	/**
	 * @return the firstnumber
	 */
	public float getFirstnumber() {
		return firstnumber;
	}

	/**
	 * @param firstnumber the firstnumber to set
	 */
	public void setFirstnumber(float firstnumber) {
		this.firstnumber = firstnumber;
	}

	/**
	 * @return the secondnumber
	 */
	public float getSecondnumber() {
		return secondnumber;
	}

	/**
	 * @param secondnumber the secondnumber to set
	 */
	public void setSecondnumber(float secondnumber) {
		this.secondnumber = secondnumber;
	}

	@Override
	public String toString() {
		return firstnumber + "+" + secondnumber;
	}
	
	
}
