package com.ngemobi.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ngemobi.service.OadsService;

/**
 * ִ�ж�ʱ����ķ���
 * 
 * @Author user
 *
 * @Date 2017��12��24��
 */
public class QuartJob {
	@Autowired
	private OadsService oadsService;

	public void execute() {
		System.out.println("��ʼִ��");		
		List<String> list = oadsService.getPkgName();
		for (String string : list) {
			addPkg(string);
		}
	}
	public void addPkg(String pkgName) {
		oadsService.addPkgName(pkgName);
	}
}
