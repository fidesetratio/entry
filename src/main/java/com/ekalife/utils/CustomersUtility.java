package com.ekalife.utils;

import java.util.Date;
import java.util.Random;

import com.ekalife.elions.model.Tertanggung;

public class CustomersUtility {

	
	public static Tertanggung createDemoTertanggung() {
		Tertanggung tertanggung = new Tertanggung();
		
		tertanggung.setLgj_id("");
		tertanggung.setLjb_id("001");
		tertanggung.setLsag_id(01);
		tertanggung.setLsed_id(01);
		tertanggung.setLside_id(01);
		tertanggung.setLsne_id(01);
		tertanggung.setMcl_first("Patar Timotius");
		tertanggung.setMcl_gelar("01");
		tertanggung.setMcl_jenis(0);
		tertanggung.setMkl_industri("patar");
		tertanggung.setMkl_kerja("patar");
		tertanggung.setMkl_kerja_ket("");
		tertanggung.setMkl_pendanaan("pendanaan");
		tertanggung.setMkl_smbr_penghasilan("mkr_smblpeng");
		tertanggung.setMkl_penghasilan("mkl_penghalsi");
		tertanggung.setMkl_tujuan("mkl_tujuan");
		tertanggung.setMpn_job_desc("job");
		tertanggung.setMspe_date_birth(new Date());
		tertanggung.setMspe_mother("mother");
		tertanggung.setMspe_no_identity("identity");
		tertanggung.setMspe_no_identity_expired(new Date());
		tertanggung.setMspe_place_birth("Jakarta");
		tertanggung.setMspe_sex(01);
		tertanggung.setMspe_sts_mrt("1");
		tertanggung.setMspe_email("patarTimotiuStambunan");
		tertanggung.setLti_id(01);
		tertanggung.setLsre_id_premi(01);
		tertanggung.setMcl_agama("Katolik");
		tertanggung.setMkl_dana_from(01);
		tertanggung.setMkl_hasil_from(01);
		tertanggung.setMkl_smbr_hasil_from(01);
		tertanggung.setMkl_sumber_premi(01);
		tertanggung.setLsre_id(01);
		tertanggung.setMkl_red_flag(0);
		tertanggung.setMcl_first_alias("alias");
		tertanggung.setMcl_green_card("ds");
		tertanggung.setMcl_company_name("ga");
		tertanggung.setMkl_kerja("patar");
		tertanggung.setMcl_npwp("001");
		tertanggung.setMcl_id("010010");
		
		return tertanggung;
	}
}
