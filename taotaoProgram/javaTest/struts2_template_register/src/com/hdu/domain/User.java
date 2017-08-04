package com.hdu.domain;

import java.io.Serializable;
import java.util.Date;
/**
 * 数据结构对映的javabean
 * @author Administrator
 *
 */

public class User implements Serializable {
	private String username;
	private String passWord;
	private Date birthday;
	private String hoddy;
	private boolean merried;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getHoddy() {
		return hoddy;
	}
	public void setHoddy(String hoddy) {
		this.hoddy = hoddy;
	}
	public boolean isMerried() {
		return merried;
	}
	public void setMerried(boolean merried) {
		this.merried = merried;
	}
	
}
