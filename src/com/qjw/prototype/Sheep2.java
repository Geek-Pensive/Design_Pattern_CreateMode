package com.qjw.prototype;

import java.util.Date;

/**
 * 克隆羊 :深克隆
 * 
 * 注:Cloneable为标记接口
 * 
 * @author q丶帮主
 * 
 */
public class Sheep2 implements Cloneable{
	
	private String sname ;
	private Date birthDay;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object clone = super.clone();
		
		//添加以下代码实现  深复制(deep clone)
		Sheep2 sd = (Sheep2)clone;
		sd.birthDay = (Date)this.birthDay.clone();
		return  clone;
		
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public Sheep2(String sname, Date birthDay) {
		super();
		this.sname = sname;
		this.birthDay = birthDay;
	}
	public Sheep2() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDay == null) ? 0 : birthDay.hashCode());
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sheep2 other = (Sheep2) obj;
		if (birthDay == null) {
			if (other.birthDay != null)
				return false;
		} else if (!birthDay.equals(other.birthDay))
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		return true;
	}
	
}
