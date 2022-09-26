package com.jetbrains.entity;



import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class ChungNhanPK implements Serializable{

	private String maNV;
	private int MaMB;
	public ChungNhanPK() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(MaMB, maNV);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChungNhanPK other = (ChungNhanPK) obj;
		return MaMB == other.MaMB && Objects.equals(maNV, other.maNV);
	}
	
}

