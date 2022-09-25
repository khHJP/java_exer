package member.controller;

import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.VVip;
import member.model.vo.Vip;

/**
 * silver, gold 최대 10명씩 관리할수있는 객체배열, 인덱스추가
 *
 */
public class MemberManager {

	private Silver[] sArr = new Silver[10];	
	private Gold[] gArr = new Gold[10];
	private Vip[] vArr = new Vip[10];
	private VVip[] vvArr = new VVip[10];
	private int sindex = 0;
	private int gindex = 0;
	private int vindex = 0;
	private int vvindex = 0;
	
	public void silverInsert(Silver silver) {
		
		if (sArr[sindex] == null)
			sArr[sindex] = silver;
			sindex++;		
	}
	
	
	public void goldInsert(Gold gold) {
	
			if (gArr[gindex] == null)
			gArr[gindex] = gold;
			gindex++;
		}
					
	
	public void vipInsert(Vip vip) {
		
		if (vArr[vindex] == null)
			vArr[vindex] = vip;
			vindex++;	
		
	}


	public void vvipInsert(VVip vvip) {
		
		if (vvArr[vvindex] == null)
			vvArr[vvindex] = vvip;
			vvindex++;	
		
	}

	
	
	public void printData() {
		
		// 현재 존재하는 객체 모두 출력 silver -> gold 순
		System.out.println("---------------------------<<회원정보>>----------------------------\n"
				+ "이름              등급              포인트             이자포인트         \n"
				+ "-----------------------------------------------------------------");
		
		
		for(int i = 0; i < sArr.length; i++) {
			if(sArr[i] == null)
				break;
			System.out.printf("%s %18s %14d %19.2f\n", sArr[i].getName(), sArr[i].getGrade(), sArr[i].getPoint(), (float)(sArr[i].getInterest()));
		}
		
				
		for(int i = 0; i < gArr.length; i++) {
			if(gArr[i] == null)
				break;
			System.out.printf("%s %16s %16d %19.2f\n", gArr[i].getName(), gArr[i].getGrade(), gArr[i].getPoint(), (float)(gArr[i].getInterest()));
		}

	}



	
}
