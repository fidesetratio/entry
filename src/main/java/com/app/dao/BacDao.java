package com.app.dao;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import com.ekalife.elions.model.Tertanggung;

@Mapper
public interface BacDao {
	public HashMap selectRegional(String kodeAgen);
	public String selectSeqNoSpaj(String lca_id);
	public String selectSequenceClientID();
	
	
	
	public void insertMstAgenTemp(HashMap map);
	public void insertMstClientTtg(Tertanggung tertanggung);
	
	
	public int updateMsgTtgClient(Tertanggung tertanggung);
	
}
