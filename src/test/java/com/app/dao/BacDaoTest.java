package com.app.dao;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.ekalife.elions.model.Tertanggung;
import com.ekalife.utils.CustomersUtility;

@SpringBootTest
@RunWith(SpringRunner.class)
@TestPropertySource("classpath:application.properties")
public class BacDaoTest {

	
	@Autowired
	private BacDao bacDao;
	
	@Test
	public void selectRegionalTest(){
		HashMap map = bacDao.selectRegional("000921");
		Assert.assertTrue(map.size()>0);
	}
	
	
	@Test
	public void selectSeqNoSpajTest() {
		String seqNo = bacDao.selectSeqNoSpaj("09");
		System.out.println(seqNo);
		Assert.assertTrue(seqNo.length()>0);
		
	}
	
	/** @Test
	public void insertMstAgenTempTest() {
		
		HashMap map = new HashMap<String,String>();
		map.put("strTmpSPAJ", "1212121221");
		map.put("v_stragentnama", "Patar");
		bacDao.insertMstAgenTemp(map);
		Assert.assertTrue(true);
	};*/
	@Test
	public void selectSequenceClientIDTest() {
		 String sequenceId = bacDao.selectSequenceClientID();
		 System.out.println(sequenceId);
		 Assert.assertTrue(sequenceId, sequenceId.length()>0);
	}
	
	/** @Test
	public void updateMsgTtgClientTestWithEmpty() {
		Tertanggung tertanggung = CustomersUtility.createDemoTertanggung();
		Integer row = bacDao.updateMsgTtgClient(tertanggung);
		System.out.println("result update"+row);
		Assert.assertTrue(row <= 0);
	}
	*/
	/**
	@Test
	public void updateMsgTtgClientTestWithData() {
		Tertanggung tertanggung = CustomersUtility.createDemoTertanggung();
		tertanggung.setMcl_id("010000000308");
		Integer row = bacDao.updateMsgTtgClient(tertanggung);
		System.out.println("result update"+row);
		Assert.assertTrue(row > 0);
	}
	**/
}
