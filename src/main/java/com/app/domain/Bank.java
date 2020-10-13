package com.app.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class Bank {
	
	private String  lbn_nama;
	private Long lbn_id;
	public Bank() {
		
	}
	

	public String getLbn_nama() {
		return lbn_nama;
	}

	public void setLbn_nama(String lbn_nama) {
		this.lbn_nama = lbn_nama;
	}
	
	 @Override
	  public String toString() {
	    return "Bank{" +
	        "id=" + lbn_nama +
	        '}';
	  }


	public Long getLbn_id() {
		return lbn_id;
	}


	public void setLbn_id(Long lbn_id) {
		this.lbn_id = lbn_id;
	}
}
