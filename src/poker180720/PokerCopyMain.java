package poker180720;

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.util.Random;
import java.lang.Enum;
import java.lang.reflect.Array;
import java.awt.color.*;
import java.applet.*;

public class PokerCopyMain {
	
		
	public static void main(String [] args) {
		String [] card = { "♠_A","◆_A","♥_A","♣_A",// 0  1  2  3
			"♠_2","◆_2","♥_2","♣_2",//4  5  6  7
			"♠_3","◆_3","♥_3","♣_3",//8  9  10 11
			"♠_4","◆_4","♥_4","♣_4",//12 13 14 15
			"♠_5","◆_5","♥_5","♣_5",//16 17 18 19
			"♠_6","◆_6","♥_6","♣_6",//20 21 22 23
			"♠_7","◆_7","♥_7","♣_3",//24 25 26 27
			"♠_8","◆_8","♥_8","♣_4",//28 29 30 31
			"♠_9","◆_9","♥_9","♣_9",//32 33 34 35
			"♠_10","◆_10","♥_10","♣_10",//36 37 38 39
			"♠_J","◆_J","♥_J","♣_J",//40 41 42 43
			"♠_Q","◆_Q","♥_Q","♣_Q",//44 45 46 47 
			"♠_K","◆_K","♥_K","♣_K",//48 49 50 51
		};//모든 카드들의 정보 총 52장
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("-----------------NewPoker-----------------");
		System.out.println("게임 시작 : 1 을 입력하세요\n 족보 : 2 를 입력하세요 \n 배팅룰 : 3 을 입력하세요");
		int opening = scan.nextInt();
		
		/*card[]card_r = card.values();*/
		switch(opening) {
		case 1 :
			try {
				
				String playerHands [] = new String [7];//플레이어의 패
				String comHands [] = new String [7];//컴퓨터의 패
				int i = 0;
				while(i !=7) {
					comHands [i] = card[ran.nextInt(51)];
					for(int j = 0;j<=i;j++) {
						if(i!=j) {
							if(comHands [i].equals(comHands[j])) {
								i = 0;
							}
						}
					}
					i++;
				}//컴퓨터 패 먼저 드로우
				int h = 0;
				while(h !=7) { 
					playerHands [h] = card[ran.nextInt(51)];
					for(int j = 0;j<=h;j++) {
						if(h!=j) {
							if(playerHands [h].equals(playerHands[j])) {
								h = 0;
							}
						}
					}
					h++;
					for(int c = 0; c<7;c++) {
						if(playerHands[h-1].equals(comHands[c])) {
							h = 0;
							break;
						}
					}
				}//플레이어 패 드로우
				int point_sf_c = 0;
				int point_fc_c = 0;
				int point_fh_c = 0;
				int point_f_c = 0;
				int point_st_c = 0;
				int point_tr_c = 0;
				int point_tp_c = 0;
				int point_op_c = 0;
				int point_t_c = 0;
				int point_sf_p = 0;
				int point_fc_p = 0;
				int point_fh_p = 0;
				int point_f_p = 0;
				int point_st_p = 0;
				int point_tr_p = 0;
				int point_tp_p = 0;
				int point_op_p = 0;
				int point_t_p = 0;
				int count_c_s = 0;
				int count_c_d = 0;
				int count_c_h = 0;
				int count_c_c = 0;
				int count_p_s = 0;
				int count_p_d = 0;
				int count_p_h = 0;
				int count_p_c = 0;
				int count_c_A = 0;
				int count_c_2 = 0;
				int count_c_3 = 0;
				int count_c_4 = 0;
				int count_c_5 = 0;
				int count_c_6 = 0;
				int count_c_7 = 0;
				int count_c_8 = 0;
				int count_c_9 = 0;
				int count_c_10 = 0;
				int count_c_J = 0;
				int count_c_Q = 0;
				int count_c_K = 0;
				int count_p_A = 0;
				int count_p_2 = 0;
				int count_p_3 = 0;
				int count_p_4 = 0;
				int count_p_5 = 0;
				int count_p_6 = 0;
				int count_p_7 = 0;
				int count_p_8 = 0;
				int count_p_9 = 0;
				int count_p_10 = 0;
				int count_p_J = 0;
				int count_p_Q = 0;
				int count_p_K = 0;
				int st_point_c_A = 0;
				int st_point_c_2= 0;
				int st_point_c_3= 0;
				int st_point_c_4= 0;
				int st_point_c_5= 0;
				int st_point_c_6= 0;
				int st_point_c_7= 0;
				int st_point_c_8= 0;
				int st_point_c_9= 0;
				int st_point_c_10= 0;
				int st_point_p_A = 0;
				int st_point_p_2= 0;
				int st_point_p_3= 0;
				int st_point_p_4= 0;
				int st_point_p_5= 0;
				int st_point_p_6= 0;
				int st_point_p_7= 0;
				int st_point_p_8= 0;
				int st_point_p_9= 0;
				int st_point_p_10= 0;
				for(int a = 0; a<7;a++) {
					if(comHands[a].charAt(0)=='♠') {
						count_c_s++;
					}
					if(comHands[a].charAt(0)=='◆') {
						count_c_d++;
					}
					if(comHands[a].charAt(0)=='♥') {
						count_c_h++;
					}
					if(comHands[a].charAt(0)=='♣') {
						count_c_c++;
					}
					if(comHands[a].charAt(2)=='A') {
						count_c_A++;
						
					}
					if(comHands[a].charAt(2)=='2') {
						count_c_2++;
					}
					if(comHands[a].charAt(2)=='3') {
						count_c_3++;
					}
					if(comHands[a].charAt(2)=='4') {
						count_c_4++;
					}
					if(comHands[a].charAt(2)=='5') {
						count_c_5++;
					}
					if(comHands[a].charAt(2)=='6') {
						count_c_6++;
					}
					if(comHands[a].charAt(2)=='7') {
						count_c_7++;
					}
					if(comHands[a].charAt(2)=='8') {
						count_c_8++;
					}
					if(comHands[a].charAt(2)=='9') {
						count_c_9++;
					}
					if(comHands[a].charAt(2)=='1') {
						count_c_10++;
					}
					if(comHands[a].charAt(2)=='J') {
						count_c_J++;
					}
					if(comHands[a].charAt(2)=='Q') {
						count_c_Q++;
					}
					if(comHands[a].charAt(2)=='K') {
						count_c_K++;
					}
					
					if(playerHands[a].charAt(0)=='♠') {
						count_p_s++;
					}
					if(playerHands[a].charAt(0)=='◆') {
						count_p_d++;
					}
					if(playerHands[a].charAt(0)=='♥') {
						count_p_h++;
					}
					if(playerHands[a].charAt(0)=='♣') {
						count_p_c++;
					}
					if(playerHands[a].charAt(2)=='A') {
						count_p_A++;
					}
					if(playerHands[a].charAt(2)=='2') {
						count_p_2++;
					}
					if(playerHands[a].charAt(2)=='3') {
						count_p_3++;
					}
					if(playerHands[a].charAt(2)=='4') {
						count_p_4++;
					}
					if(playerHands[a].charAt(2)=='5') {
						count_p_5++;
					}
					if(playerHands[a].charAt(2)=='6') {
						count_p_6++;
					}
					if(playerHands[a].charAt(2)=='7') {
						count_p_7++;
					}
					if(playerHands[a].charAt(2)=='8') {
						count_p_8++;
					}
					if(playerHands[a].charAt(2)=='9') {
						count_p_9++;
					}
					if(playerHands[a].charAt(2)=='1') {
						count_p_10++;
					}
					if(playerHands[a].charAt(2)=='J') {
						count_p_J++;
					}
					if(playerHands[a].charAt(2)=='Q') {
						count_p_Q++;
					}
					if(playerHands[a].charAt(2)=='K') {
						count_p_K++;
					}
				}
				int countBox_c_s [] = {count_c_s,count_c_d,count_c_h,count_c_c};
				int countBox_c_n [] = {count_c_A,count_c_2,count_c_3,count_c_4,count_c_5,count_c_6,count_c_7,count_c_8,count_c_9,count_c_10,count_c_J,count_c_Q,count_c_K};
				int countBox_p_s [] = {count_p_s,count_p_d,count_p_h,count_p_c};
				int countBox_p_n [] = {count_p_A,count_p_2,count_p_3,count_p_4,count_p_5,count_p_6,count_p_7,count_p_8,count_p_9,count_p_10,count_p_J,count_p_Q,count_p_K};
				
				//포카드
				for(int a = 0;a<countBox_c_n.length;a++) {
					if(countBox_c_n[a]==4) {
						if(a==0) {
							point_fc_c = 98000;
						}
						if(a==1) {
							point_fc_c = 98001;
						}
						if(a==2) {
							point_fc_c = 98002;
						}
						if(a==3) {
							point_fc_c = 98003;
						}
						if(a==4) {
							point_fc_c = 98004;
						}
						if(a==5) {
							point_fc_c = 98005;
						}
						if(a==6) {
							point_fc_c = 98006;
						}
						if(a==7) {
							point_fc_c = 98007;
						}
						if(a==8) {
							point_fc_c = 98008;
						}
						if(a==9) {
							point_fc_c = 98009;
						}
						if(a==10) {
							point_fc_c = 98010;
						}
						if(a==11) {
							point_fc_c = 98011;
						}
						if(a==12) {
							point_fc_c = 98012;
						}
						
					}
				}
				for(int a = 0;a<countBox_p_n.length;a++) {
					if(countBox_p_n[a]==4) {
						if(a==0) {
							point_fc_p = 98000;
						}
						if(a==1) {
							point_fc_p = 98001;
						}
						if(a==2) {
							point_fc_p = 98002;
						}
						if(a==3) {
							point_fc_p = 98003;
						}
						if(a==4) {
							point_fc_p = 98004;
						}
						if(a==5) {
							point_fc_p = 98005;
						}
						if(a==6) {
							point_fc_p = 98006;
						}
						if(a==7) {
							point_fc_p = 98007;
						}
						if(a==8) {
							point_fc_p = 98008;
						}
						if(a==9) {
							point_fc_p = 98009;
						}
						if(a==10) {
							point_fc_p = 98010;
						}
						if(a==11) {
							point_fc_p = 98011;
						}
						if(a==12) {
							point_fc_p = 98012;
						}
						
					}
				}
				//풀하우스
				for(int a = 0;a<countBox_c_n.length;a++) {
					if(countBox_c_n[a]==3) {
						for(int b = 0;b<countBox_c_n.length;b++) {
							if(countBox_c_n[b]==2) {
								if(a==0) {
									point_fh_c = 97987;
								}
								if(a==1) {
									point_fh_c = 97988;
								}
								if(a==2) {
									point_fh_c = 97989;
								}
								if(a==3) {
									point_fh_c = 97990;
								}
								if(a==4) {
									point_fh_c = 97991;
								}
								if(a==5) {
									point_fh_c = 97992;
								}
								if(a==6) {
									point_fh_c = 97993;
								}
								if(a==7) {
									point_fh_c = 97994;
								}
								if(a==8) {
									point_fh_c = 97995;
								}
								if(a==9) {
									point_fh_c = 97996;
								}
								if(a==10) {
									point_fh_c = 97997;
								}
								if(a==11) {
									point_fh_c = 97998;
								}
								if(a==12) {
									point_fh_c = 97999;
								}
							}
						}
					}
				}
				for(int a = 0;a<countBox_p_n.length;a++) {
					if(countBox_p_n[a]==3) {
						for(int b = 0;b<countBox_p_n.length;b++) {
							if(countBox_p_n[b]==2) {
								if(a==0) {
									point_fh_p = 97987;
								}
								if(a==1) {
									point_fh_p = 97988;
								}
								if(a==2) {
									point_fh_p = 97989;
								}
								if(a==3) {
									point_fh_p = 97990;
								}
								if(a==4) {
									point_fh_p = 97991;
								}
								if(a==5) {
									point_fh_p = 97992;
								}
								if(a==6) {
									point_fh_p = 97993;
								}
								if(a==7) {
									point_fh_p = 97994;
								}
								if(a==8) {
									point_fh_p = 97995;
								}
								if(a==9) {
									point_fh_p = 97996;
								}
								if(a==10) {
									point_fh_p = 97997;
								}
								if(a==11) {
									point_fh_p = 97998;
								}
								if(a==12) {
									point_fh_p = 97999;
								}
							}
						}
					}
				}
				
				//플러쉬
				for(int a = 0;a<4;a++) {
					if(countBox_p_s[a]>5) {
						if(a==0) {
							for(int b = 0;b<7;b++) {
								if(playerHands[b].charAt(0)=='♠') {
									if(playerHands[b].charAt(2)=='A') {
										if(point_f_p<=90399+1)
											point_f_p = 90399+1;
									}
									if(playerHands[b].charAt(2)=='2') {
										if(point_f_p<=90399+2)
											point_f_p = 90399+2;
									}
									if(playerHands[b].charAt(2)=='3') {
										if(point_f_p<=90399+3)
											point_f_p = 90399+3;
									}
									if(playerHands[b].charAt(2)=='4') {
										if(point_f_p<=90399+4)
											point_f_p = 90399+4;
									}
									if(playerHands[b].charAt(2)=='5') {
										if(point_f_p<=90399+5)
											point_f_p = 90399+5;
									}
									if(playerHands[b].charAt(2)=='6') {
										if(point_f_p<=90399+6)
											point_f_p = 90399+6;
									}
									if(playerHands[b].charAt(2)=='7') {
										if(point_f_p<=90399+7)
											point_f_p = 90399+7;
									}
									if(playerHands[b].charAt(2)=='8') {
										if(point_f_p<=90399+8)
											point_f_p = 90399+8;
									}
									if(playerHands[b].charAt(2)=='9') {
										if(point_f_p<=90399+9)
											point_f_p = 90399+9;
									}
									if(playerHands[b].charAt(2)=='1') {
										if(point_f_p<=90399+10)
											point_f_p = 90399+10;
									}
									if(playerHands[b].charAt(2)=='J') {
										if(point_f_p<=90399+11)
											point_f_p = 90399+11;
									}
									if(playerHands[b].charAt(2)=='Q') {
										if(point_f_p<=90399+12)
											point_f_p = 90399+12;
									}
									if(playerHands[b].charAt(2)=='K') {
										if(point_f_p<=90399+13)
											point_f_p = 90399+13;
									}
								}
							}
						}
						if(a==1) {
							for(int b = 0;b<7;b++) {
								if(playerHands[b].charAt(0)=='◆') {
									if(playerHands[b].charAt(2)=='A') {
										if(point_f_p<=90299+1)
											point_f_p = 90299+1;
									}
									if(playerHands[b].charAt(2)=='2') {
										if(point_f_p<=90299+2)
											point_f_p = 90299+2;
									}
									if(playerHands[b].charAt(2)=='3') {
										if(point_f_p<=90299+3)
											point_f_p = 90299+3;
									}
									if(playerHands[b].charAt(2)=='4') {
										if(point_f_p<=90299+4)
											point_f_p = 90299+4;
									}
									if(playerHands[b].charAt(2)=='5') {
										if(point_f_p<=90299+5)
											point_f_p = 90299+5;
									}
									if(playerHands[b].charAt(2)=='6') {
										if(point_f_p<=90299+6)
											point_f_p = 90299+6;
									}
									if(playerHands[b].charAt(2)=='7') {
										if(point_f_p<=90299+7)
											point_f_p = 90299+7;
									}
									if(playerHands[b].charAt(2)=='8') {
										if(point_f_p<=90299+8)
											point_f_p = 90299+8;
									}
									if(playerHands[b].charAt(2)=='9') {
										if(point_f_p<=90299+9)
											point_f_p = 90299+9;
									}
									if(playerHands[b].charAt(2)=='1') {
										if(point_f_p<=90299+10)
											point_f_p = 90299+10;
									}
									if(playerHands[b].charAt(2)=='J') {
										if(point_f_p<=90299+11)
											point_f_p = 90299+11;
									}
									if(playerHands[b].charAt(2)=='Q') {
										if(point_f_p<=90299+12)
											point_f_p = 90299+12;
									}
									if(playerHands[b].charAt(2)=='K') {
										if(point_f_p<=90299+13)
											point_f_p = 90299+13;
									}
								}
							}
							
						}
						if(a==2) {
							for(int b = 0;b<7;b++) {
								if(playerHands[b].charAt(0)=='♥') {
									if(playerHands[b].charAt(2)=='A') {
										if(point_f_p<=90199+1)
											point_f_p = 90199+1;
									}
									if(playerHands[b].charAt(2)=='2') {
										if(point_f_p<=90199+2)
											point_f_p = 90199+2;
									}
									if(playerHands[b].charAt(2)=='3') {
										if(point_f_p<=90199+3)
											point_f_p = 90199+3;
									}
									if(playerHands[b].charAt(2)=='4') {
										if(point_f_p<=90199+4)
											point_f_p = 90199+4;
									}
									if(playerHands[b].charAt(2)=='5') {
										if(point_f_p<=90199+5)
											point_f_p = 90199+5;
									}
									if(playerHands[b].charAt(2)=='6') {
										if(point_f_p<=90199+6)
											point_f_p = 90199+6;
									}
									if(playerHands[b].charAt(2)=='7') {
										if(point_f_p<=90199+7)
											point_f_p = 90199+7;
									}
									if(playerHands[b].charAt(2)=='8') {
										if(point_f_p<=90199+8)
											point_f_p = 90199+8;
									}
									if(playerHands[b].charAt(2)=='9') {
										if(point_f_p<=90199+9)
											point_f_p = 90199+9;
									}
									if(playerHands[b].charAt(2)=='1') {
										if(point_f_p<=90199+10)
											point_f_p = 90199+10;
									}
									if(playerHands[b].charAt(2)=='J') {
										if(point_f_p<=90199+11)
											point_f_p = 90199+11;
									}
									if(playerHands[b].charAt(2)=='Q') {
										if(point_f_p<=90199+12)
											point_f_p = 90199+12;
									}
									if(playerHands[b].charAt(2)=='K') {
										if(point_f_p<=90199+13)
											point_f_p = 90199+13;
									}
								}
							}
							
						}
						if(a==3) {
							for(int b = 0;b<7;b++) {
								if(playerHands[b].charAt(0)=='♣') {
									if(playerHands[b].charAt(2)=='A') {
										if(point_f_p<=90099+1)
											point_f_p = 90099+1;
									}
									if(playerHands[b].charAt(2)=='2') {
										if(point_f_p<=90099+2)
											point_f_p = 90099+2;
									}
									if(playerHands[b].charAt(2)=='3') {
										if(point_f_p<=90099+3)
											point_f_p = 90099+3;
									}
									if(playerHands[b].charAt(2)=='4') {
										if(point_f_p<=90099+4)
											point_f_p = 90099+4;
									}
									if(playerHands[b].charAt(2)=='5') {
										if(point_f_p<=90099+5)
											point_f_p = 90099+5;
									}
									if(playerHands[b].charAt(2)=='6') {
										if(point_f_p<=90099+6)
											point_f_p = 90099+6;
									}
									if(playerHands[b].charAt(2)=='7') {
										if(point_f_p<=90099+7)
											point_f_p = 90099+7;
									}
									if(playerHands[b].charAt(2)=='8') {
										if(point_f_p<=90099+8)
											point_f_p = 90099+8;
									}
									if(playerHands[b].charAt(2)=='9') {
										if(point_f_p<=90099+9)
											point_f_p = 90099+9;
									}
									if(playerHands[b].charAt(2)=='1') {
										if(point_f_p<=90099+10)
											point_f_p = 90099+10;
									}
									if(playerHands[b].charAt(2)=='J') {
										if(point_f_p<=90099+11)
											point_f_p = 90099+11;
									}
									if(playerHands[b].charAt(2)=='Q') {
										if(point_f_p<=90099+12)
											point_f_p = 90099+12;
									}
									if(playerHands[b].charAt(2)=='K') {
										if(point_f_p<=90099+13)
											point_f_p = 90099+13;
									}
								}
							}
						}
					}
				}
				//System.out.println("플러쉬 테스트입니다."+point_f_c);
				//스트레이트
				for(int a = 0; a<=4;a++) {
					if(countBox_c_n[a]>0) {
						st_point_c_A++;
					}
				}
				for(int a = 1; a<=5;a++) {
					if(countBox_c_n[a]>0) {
						st_point_c_2++;
					}
				}
				for(int a = 2; a<=6;a++) {
					if(countBox_c_n[a]>0) {
						st_point_c_3++;
					}
				}
				for(int a = 3; a<=7;a++) {
					if(countBox_c_n[a]>0) {
						st_point_c_4++;
					}
				}
				for(int a = 4; a<=8;a++) {
					if(countBox_c_n[a]>0) {
						st_point_c_5++;
					}
				}
				for(int a = 5; a<=9;a++) {
					if(countBox_c_n[a]>0) {
						st_point_c_6++;
					}
				}
				for(int a = 6; a<=10;a++) {
					if(countBox_c_n[a]>0) {
						st_point_c_7++;
					}
				}
				for(int a = 7; a<=11;a++) {
					if(countBox_c_n[a]>0) {
						st_point_c_8++;
					}
				}
				for(int a = 8; a<=12;a++) {
					if(countBox_c_n[a]>0) {
						st_point_c_9++;
					}
				}
				for(int a = 9; a<=12;a++) {
					if(countBox_c_n[a]>0) {
						if(countBox_c_n[0]>0) {
							st_point_c_10++;
						}
					}
				}

				for(int a = 0; a<=4;a++) {
					if(countBox_p_n[a]>0) {
						st_point_p_A++;
					}
				}
				for(int a = 1; a<=5;a++) {
					if(countBox_p_n[a]>0) {
						st_point_p_2++;
					}
				}
				for(int a = 2; a<=6;a++) {
					if(countBox_p_n[a]>0) {
						st_point_p_3++;
					}
				}
				for(int a = 3; a<=7;a++) {
					if(countBox_p_n[a]>0) {
						st_point_p_4++;
					}
				}
				for(int a = 4; a<=8;a++) {
					if(countBox_p_n[a]>0) {
						st_point_p_5++;
					}
				}
				for(int a = 5; a<=9;a++) {
					if(countBox_p_n[a]>0) {
						st_point_p_6++;
					}
				}
				for(int a = 6; a<=10;a++) {
					if(countBox_p_n[a]>0) {
						st_point_p_7++;
					}
				}
				for(int a = 7; a<=11;a++) {
					if(countBox_p_n[a]>0) {
						st_point_p_8++;
					}
				}
				for(int a = 8; a<=12;a++) {
					if(countBox_p_n[a]>0) {
						st_point_p_9++;
					}
				}
				for(int a = 9; a<=12;a++) {
					if(countBox_p_n[a]>0) {
						
							st_point_p_10++;
						
					}
					if(countBox_p_n[0]>0) {
						st_point_p_10++;
					}
				}
	
				int st_pointBox_c [] = {st_point_c_A,st_point_c_2,st_point_c_3,st_point_c_4,st_point_c_5,st_point_c_6,st_point_c_7,st_point_c_8,st_point_c_9,st_point_c_10};
				int st_pointBox_p [] = {st_point_p_A,st_point_p_2,st_point_p_3,st_point_p_4,st_point_p_5,st_point_p_6,st_point_p_7,st_point_p_8,st_point_p_9,st_point_p_10};
				
				if(st_pointBox_c[0]==5) {
					for(int b = 0; b<7;b++) {
						if(comHands[b].charAt(2)==('5')) {
							if(comHands[b].charAt(0)=='♠') {
								if(point_st_c<=80030)
										point_st_c = 80030;
								
								
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_st_c<=80020)
									point_st_c = 80020;
								
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_st_c<=80010)
									point_st_c = 80010;
								
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_st_c<=80000)
									point_st_c = 80000;
								
							}
						}
					}
				}
				if(st_pointBox_c[1]==5) {
					for(int b = 0; b<7;b++) {
						if(comHands[b].charAt(2)==('6')) {
							if(comHands[b].charAt(0)=='♠') {
								if(point_st_c<=80130)
										point_st_c = 80130;
								
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_st_c<=80120)
									point_st_c = 80120;
								
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_st_c<=80110)
									point_st_c = 80110;
								
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_st_c<=80100)
									point_st_c = 80100;
								
							}
						}
					}
				}
				if(st_pointBox_c[2]==5) {
					for(int b = 0; b<7;b++) {
						if(comHands[b].charAt(2)==('7')) {
							if(comHands[b].charAt(0)=='♠') {
								if(point_st_c<=80230)
										point_st_c = 80230;
								
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_st_c<=80220)
									point_st_c = 80220;
								
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_st_c<=80210)
									point_st_c = 80210;
								
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_st_c<=80200)
									point_st_c = 80200;
								
							}
						}
					}
				}
				if(st_pointBox_c[3]==5) {
					for(int b = 0; b<7;b++) {
						if(comHands[b].charAt(2)==('8')) {
							if(comHands[b].charAt(0)=='♠') {
								if(point_st_c<=80330)
										point_st_c = 80330;
								
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_st_c<=80320)
									point_st_c = 80320;
								
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_st_c<=80310)
									point_st_c = 80310;
								
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_st_c<=80300)
									point_st_c = 80300;
								
							}
						}
					}
				}
				if(st_pointBox_c[4]==5) {
					for(int b = 0; b<7;b++) {
						if(comHands[b].charAt(2)==('9')) {
							if(comHands[b].charAt(0)=='♠') {
								if(point_st_c<=80430)
										point_st_c = 80430;
								
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_st_c<=80420)
									point_st_c = 80420;
								
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_st_c<=80410)
									point_st_c = 80410;
								
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_st_c<=80400)
									point_st_c = 80400;
								
							}
						}
					}
				}
				if(st_pointBox_c[5]==5) {
					for(int b = 0; b<7;b++) {
						if(comHands[b].charAt(2)==('1')) {
							if(comHands[b].charAt(0)=='♠') {
								if(point_st_c<=80530)
										point_st_c = 80530;
								
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_st_c<=80520)
									point_st_c = 80520;
								
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_st_c<=80510)
									point_st_c = 80510;
								
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_st_c<=80500)
									point_st_c = 80500;
								
							}
						}
					}
				}
				if(st_pointBox_c[6]==5) {
					for(int b = 0; b<7;b++) {
						if(comHands[b].charAt(2)==('J')) {
							if(comHands[b].charAt(0)=='♠') {
								if(point_st_c<=80630)
										point_st_c = 80630;
								
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_st_c<=80620)
									point_st_c = 80620;
								
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_st_c<=80610)
									point_st_c = 80610;
								
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_st_c<=80600)
									point_st_c = 80600;
								
							}
						}
					}
				}
				if(st_pointBox_c[7]==5) {
					for(int b = 0; b<7;b++) {
						if(comHands[b].charAt(2)==('Q')) {
							if(comHands[b].charAt(0)=='♠') {
								if(point_st_c<=80730)
										point_st_c = 80730;
								
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_st_c<=80720)
									point_st_c = 80720;
								
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_st_c<=80710)
									point_st_c = 80710;
								
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_st_c<=80700)
									point_st_c = 80700;
								
							}
						}
					}
				}
				if(st_pointBox_c[8]==5) {
					for(int b = 0; b<7;b++) {
						if(comHands[b].charAt(2)==('K')) {
							if(comHands[b].charAt(0)=='♠') {
								if(point_st_c<=80830)
										point_st_c = 80830;
								
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_st_c<=80820)
									point_st_c = 80820;
								
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_st_c<=80810)
									point_st_c = 80810;
								
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_st_c<=80800)
									point_st_c = 80800;
								
							}
						}
					}
				}
				if(st_pointBox_c[9]==5) {
					for(int b = 0; b<7;b++) {
						if(comHands[b].charAt(2)==('A')) {
							if(comHands[b].charAt(0)=='♠') {
								if(point_st_c<=80930)
										point_st_c = 80930;
								
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_st_c<=80920)
									point_st_c = 80920;
								
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_st_c<=80910)
									point_st_c = 80910;
								
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_st_c<=80900)
									point_st_c = 80900;
								
							}
						}
					}
				}

				if(st_pointBox_p[0]==5) {
					for(int b = 0; b<7;b++) {
						if(playerHands[b].charAt(2)==('5')) {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_st_p<=80030)
										point_st_p = 80030;
								
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_st_p<=80020)
									point_st_p = 80020;
								
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_st_p<=80010)
									point_st_p = 80010;
								
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_st_p<=80000)
									point_st_p = 80000;
								
							}
						}
					}
				}
				if(st_pointBox_p[1]==5) {
					for(int b = 0; b<7;b++) {
						if(playerHands[b].charAt(2)==('6')) {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_st_p<=80130)
										point_st_p = 80130;
								
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_st_p<=80120)
									point_st_p = 80120;
								
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_st_p<=80110)
									point_st_p = 80110;
								
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_st_p<=80100)
									point_st_p = 80100;
								
							}
						}
					}
				}
				if(st_pointBox_p[2]==5) {
					for(int b = 0; b<7;b++) {
						if(playerHands[b].charAt(2)==('7')) {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_st_p<=80230)
										point_st_p = 80230;
								
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_st_p<=80220)
									point_st_p = 80220;
								
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_st_p<=80210)
									point_st_p = 80210;
								
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_st_p<=80200)
									point_st_p = 80200;
								
							}
						}
					}
				}
				if(st_pointBox_p[3]==5) {
					for(int b = 0; b<7;b++) {
						if(playerHands[b].charAt(2)==('8')) {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_st_p<=80330)
										point_st_p = 80330;
								
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_st_p<=80320)
									point_st_p = 80320;
								
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_st_p<=80310)
									point_st_p = 80310;
								
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_st_p<=80300)
									point_st_p = 80300;
								
							}
						}
					}
				}
				if(st_pointBox_p[4]==5) {
					for(int b = 0; b<7;b++) {
						if(playerHands[b].charAt(2)==('9')) {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_st_p<=80430)
										point_st_p = 80430;
								
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_st_p<=80420)
									point_st_p = 80420;
								
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_st_p<=80410)
									point_st_p = 80410;
								
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_st_p<=80400)
									point_st_p = 80400;
								
							}
						}
					}
				}
				if(st_pointBox_p[5]==5) {
					for(int b = 0; b<7;b++) {
						if(playerHands[b].charAt(2)==('1')) {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_st_p<=80530)
										point_st_p = 80530;
								
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_st_p<=80520)
									point_st_p = 80520;
								
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_st_p<=80510)
									point_st_p = 80510;
								
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_st_p<=80500)
									point_st_p = 80500;
								
							}
						}
					}
				}
				if(st_pointBox_p[6]==5) {
					for(int b = 0; b<7;b++) {
						if(playerHands[b].charAt(2)==('J')) {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_st_p<=80630)
										point_st_p = 80630;
								
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_st_p<=80620)
									point_st_p = 80620;
								
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_st_p<=80610)
									point_st_p = 80610;
								
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_st_p<=80600)
									point_st_p = 80600;
								
							}
						}
					}
				}
				if(st_pointBox_p[7]==5) {
					for(int b = 0; b<7;b++) {
						if(playerHands[b].charAt(2)==('Q')) {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_st_p<=80730)
										point_st_p = 80730;
								
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_st_p<=80720)
									point_st_p = 80720;
								
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_st_p<=80710)
									point_st_p = 80710;
								
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_st_p<=80700)
									point_st_p = 80700;
								
							}
						}
					}
				}
				if(st_pointBox_p[8]==5) {
					for(int b = 0; b<7;b++) {
						if(playerHands[b].charAt(2)==('K')) {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_st_p<=80830)
										point_st_p = 80830;
								
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_st_p<=80820)
									point_st_p = 80820;
								
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_st_p<=80810)
									point_st_p = 80810;
								
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_st_p<=80800)
									point_st_p = 80800;
								
							}
						}
					}
				}
				if(st_pointBox_p[9]==5) {
					for(int b = 0; b<7;b++) {
						if(playerHands[b].charAt(2)==('A')) {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_st_p<=80930)
										point_st_p = 80930;
								
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_st_p<=80920)
									point_st_p = 80920;
								
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_st_p<=80910)
									point_st_p = 80910;
								
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_st_p<=80900)
									point_st_p = 80900;
								
							}
						}
					}
				}
				//트리플

				if(countBox_c_n[0]==3) {
					for(int b = 0;b<7;b++) {
						if(comHands[b].charAt(2)=='A') {
							if(comHands[b].charAt(0)=='♠') {
								if(point_tr_c<70030) {
									point_tr_c = 70030;
								}
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_tr_c<70020) {
									point_tr_c = 70020;
								}
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_tr_c<70010) {
									point_tr_c = 70010;
								}
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_tr_c<70000) {
									point_tr_c = 70000;
								}
							}
							
						}
					}
				}
				if(countBox_c_n[1]==3) {
					for(int b = 0;b<7;b++) {
						if(comHands[b].charAt(2)=='2') {
							if(comHands[b].charAt(0)=='♠') {
								if(point_tr_c<70130) {
									point_tr_c = 70130;
								}
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_tr_c<70120) {
									point_tr_c = 70120;
								}
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_tr_c<70110) {
									point_tr_c = 70110;
								}
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_tr_c<70100) {
									point_tr_c = 70100;
								}
							}
							
						}
					}
				}
				if(countBox_c_n[2]==3) {
					for(int b = 0;b<7;b++) {
						if(comHands[b].charAt(2)=='3') {
							if(comHands[b].charAt(0)=='♠') {
								if(point_tr_c<70230) {
									point_tr_c = 70230;
								}
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_tr_c<70220) {
									point_tr_c = 70220;
								}
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_tr_c<70210) {
									point_tr_c = 70210;
								}
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_tr_c<70200) {
									point_tr_c = 70200;
								}
							}
							
						}
					}
				}
				if(countBox_c_n[3]==3) {
					for(int b = 0;b<7;b++) {
						if(comHands[b].charAt(2)=='4') {
							if(comHands[b].charAt(0)=='♠') {
								if(point_tr_c<70330) {
									point_tr_c = 70330;
								}
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_tr_c<70320) {
									point_tr_c = 70320;
								}
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_tr_c<70310) {
									point_tr_c = 70310;
								}
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_tr_c<70300) {
									point_tr_c = 70300;
								}
							}
							
						}
					}
				}
				if(countBox_c_n[4]==3) {
					for(int b = 0;b<7;b++) {
						if(comHands[b].charAt(2)=='5') {
							if(comHands[b].charAt(0)=='♠') {
								if(point_tr_c<70430) {
									point_tr_c = 70430;
								}
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_tr_c<70420) {
									point_tr_c = 70420;
								}
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_tr_c<70410) {
									point_tr_c = 70410;
								}
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_tr_c<70400) {
									point_tr_c = 70400;
								}
							}
							
						}
					}
				}
				if(countBox_c_n[5]==3) {
					for(int b = 0;b<7;b++) {
						if(comHands[b].charAt(2)=='6') {
							if(comHands[b].charAt(0)=='♠') {
								if(point_tr_c<70530) {
									point_tr_c = 70530;
								}
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_tr_c<70520) {
									point_tr_c = 70520;
								}
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_tr_c<70510) {
									point_tr_c = 70510;
								}
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_tr_c<70500) {
									point_tr_c = 70500;
								}
							}
							
						}
					}
				}
				if(countBox_c_n[6]==3) {
					for(int b = 0;b<7;b++) {
						if(comHands[b].charAt(2)=='7') {
							if(comHands[b].charAt(0)=='♠') {
								if(point_tr_c<70630) {
									point_tr_c = 70630;
								}
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_tr_c<70620) {
									point_tr_c = 70620;
								}
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_tr_c<70610) {
									point_tr_c = 70610;
								}
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_tr_c<70600) {
									point_tr_c = 70600;
								}
							}
							
						}
					}
				}
				if(countBox_c_n[7]==3) {
					for(int b = 0;b<7;b++) {
						if(comHands[b].charAt(2)=='8') {
							if(comHands[b].charAt(0)=='♠') {
								if(point_tr_c<70730) {
									point_tr_c = 70730;
								}
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_tr_c<70720) {
									point_tr_c = 70720;
								}
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_tr_c<70710) {
									point_tr_c = 70710;
								}
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_tr_c<70700) {
									point_tr_c = 70700;
								}
							}
							
						}
					}
				}
				if(countBox_c_n[8]==3) {
					for(int b = 0;b<7;b++) {
						if(comHands[b].charAt(2)=='9') {
							if(comHands[b].charAt(0)=='♠') {
								if(point_tr_c<70830) {
									point_tr_c = 70830;
								}
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_tr_c<70820) {
									point_tr_c = 70820;
								}
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_tr_c<70810) {
									point_tr_c = 70810;
								}
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_tr_c<70800) {
									point_tr_c = 70800;
								}
							}
							
						}
					}
				}
				if(countBox_c_n[9]==3) {
					for(int b = 0;b<7;b++) {
						if(comHands[b].charAt(2)=='1') {
							if(comHands[b].charAt(0)=='♠') {
								if(point_tr_c<70930) {
									point_tr_c = 70930;
								}
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_tr_c<70920) {
									point_tr_c = 70920;
								}
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_tr_c<70910) {
									point_tr_c = 70910;
								}
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_tr_c<70900) {
									point_tr_c = 70900;
								}
							}
							
						}
					}
				}
				if(countBox_c_n[10]==3) {
					for(int b = 0;b<7;b++) {
						if(comHands[b].charAt(2)=='J') {
							if(comHands[b].charAt(0)=='♠') {
								if(point_tr_c<71030) {
									point_tr_c = 71030;
								}
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_tr_c<71020) {
									point_tr_c = 71020;
								}
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_tr_c<71010) {
									point_tr_c = 71010;
								}
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_tr_c<71000) {
									point_tr_c = 71000;
								}
							}
							
						}
					}
				}
				if(countBox_c_n[11]==3) {
					for(int b = 0;b<7;b++) {
						if(comHands[b].charAt(2)=='Q') {
							if(comHands[b].charAt(0)=='♠') {
								if(point_tr_c<71130) {
									point_tr_c = 71130;
								}
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_tr_c<71120) {
									point_tr_c = 71120;
								}
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_tr_c<71110) {
									point_tr_c = 71110;
								}
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_tr_c<71100) {
									point_tr_c = 71100;
								}
							}
							
						}
					}
				}
				if(countBox_c_n[12]==3) {
					for(int b = 0;b<7;b++) {
						if(comHands[b].charAt(2)=='K') {
							if(comHands[b].charAt(0)=='♠') {
								if(point_tr_c<71230) {
									point_tr_c = 71230;
								}
							}
							if(comHands[b].charAt(0)=='◆') {
								if(point_tr_c<71220) {
									point_tr_c = 71220;
								}
							}
							if(comHands[b].charAt(0)=='♥') {
								if(point_tr_c<71210) {
									point_tr_c = 71210;
								}
							}
							if(comHands[b].charAt(0)=='♣') {
								if(point_tr_c<71200) {
									point_tr_c = 71200;
								}
							}
							
						}
					}
				}
				if(countBox_p_n[0]==3) {
					for(int b = 0;b<7;b++) {
						if(playerHands[b].charAt(2)=='A') {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_tr_p<70030) {
									point_tr_p = 70030;
								}
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_tr_p<70020) {
									point_tr_p = 70020;
								}
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_tr_p<70010) {
									point_tr_p = 70010;
								}
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_tr_p<70000) {
									point_tr_p = 70000;
								}
							}
							
						}
					}
				}
				if(countBox_p_n[1]==3) {
					for(int b = 0;b<7;b++) {
						if(playerHands[b].charAt(2)=='2') {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_tr_p<70130) {
									point_tr_p = 70130;
								}
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_tr_p<70120) {
									point_tr_p = 70120;
								}
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_tr_p<70110) {
									point_tr_p = 70110;
								}
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_tr_p<70100) {
									point_tr_p = 70100;
								}
							}
							
						}
					}
				}
				if(countBox_p_n[2]==3) {
					for(int b = 0;b<7;b++) {
						if(playerHands[b].charAt(2)=='3') {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_tr_p<70230) {
									point_tr_p = 70230;
								}
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_tr_p<70220) {
									point_tr_p = 70220;
								}
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_tr_p<70210) {
									point_tr_p = 70210;
								}
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_tr_p<70200) {
									point_tr_p = 70200;
								}
							}
							
						}
					}
				}
				if(countBox_p_n[3]==3) {
					for(int b = 0;b<7;b++) {
						if(playerHands[b].charAt(2)=='4') {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_tr_p<70330) {
									point_tr_p = 70330;
								}
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_tr_p<70320) {
									point_tr_p = 70320;
								}
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_tr_p<70310) {
									point_tr_p = 70310;
								}
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_tr_p<70300) {
									point_tr_p = 70300;
								}
							}
							
						}
					}
				}
				if(countBox_p_n[4]==3) {
					for(int b = 0;b<7;b++) {
						if(playerHands[b].charAt(2)=='5') {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_tr_p<70430) {
									point_tr_p = 70430;
								}
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_tr_p<70420) {
									point_tr_p = 70420;
								}
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_tr_p<70410) {
									point_tr_p = 70410;
								}
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_tr_p<70400) {
									point_tr_p = 70400;
								}
							}
							
						}
					}
				}
				if(countBox_p_n[5]==3) {
					for(int b = 0;b<7;b++) {
						if(playerHands[b].charAt(2)=='6') {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_tr_p<70530) {
									point_tr_p = 70530;
								}
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_tr_p<70520) {
									point_tr_p = 70520;
								}
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_tr_p<70510) {
									point_tr_p = 70510;
								}
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_tr_p<70500) {
									point_tr_p = 70500;
								}
							}
							
						}
					}
				}
				if(countBox_p_n[6]==3) {
					for(int b = 0;b<7;b++) {
						if(playerHands[b].charAt(2)=='7') {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_tr_p<70630) {
									point_tr_p = 70630;
								}
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_tr_p<70620) {
									point_tr_p = 70620;
								}
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_tr_p<70610) {
									point_tr_p = 70610;
								}
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_tr_p<70600) {
									point_tr_p = 70600;
								}
							}
							
						}
					}
				}
				if(countBox_p_n[7]==3) {
					for(int b = 0;b<7;b++) {
						if(playerHands[b].charAt(2)=='8') {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_tr_p<70730) {
									point_tr_p = 70730;
								}
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_tr_p<70720) {
									point_tr_p = 70720;
								}
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_tr_p<70710) {
									point_tr_p = 70710;
								}
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_tr_p<70700) {
									point_tr_p = 70700;
								}
							}
							
						}
					}
				}
				if(countBox_p_n[8]==3) {
					for(int b = 0;b<7;b++) {
						if(playerHands[b].charAt(2)=='9') {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_tr_p<70830) {
									point_tr_p = 70830;
								}
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_tr_p<70820) {
									point_tr_p = 70820;
								}
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_tr_p<70810) {
									point_tr_p = 70810;
								}
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_tr_p<70800) {
									point_tr_p = 70800;
								}
							}
							
						}
					}
				}
				if(countBox_p_n[9]==3) {
					for(int b = 0;b<7;b++) {
						if(playerHands[b].charAt(2)=='1') {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_tr_p<70930) {
									point_tr_p = 70930;
								}
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_tr_p<70920) {
									point_tr_p = 70920;
								}
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_tr_p<70910) {
									point_tr_p = 70910;
								}
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_tr_p<70900) {
									point_tr_p = 70900;
								}
							}
							
						}
					}
				}
				if(countBox_p_n[10]==3) {
					for(int b = 0;b<7;b++) {
						if(playerHands[b].charAt(2)=='J') {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_tr_p<71030) {
									point_tr_p = 71030;
								}
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_tr_p<71020) {
									point_tr_p = 71020;
								}
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_tr_p<71010) {
									point_tr_p = 71010;
								}
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_tr_p<71000) {
									point_tr_p = 71000;
								}
							}
							
						}
					}
				}
				if(countBox_p_n[11]==3) {
					for(int b = 0;b<7;b++) {
						if(playerHands[b].charAt(2)=='Q') {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_tr_p<71130) {
									point_tr_p = 71130;
								}
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_tr_p<71120) {
									point_tr_p = 71120;
								}
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_tr_p<71110) {
									point_tr_p = 71110;
								}
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_tr_p<71100) {
									point_tr_p = 71100;
								}
							}
							
						}
					}
				}
				if(countBox_p_n[12]==3) {
					for(int b = 0;b<7;b++) {
						if(playerHands[b].charAt(2)=='K') {
							if(playerHands[b].charAt(0)=='♠') {
								if(point_tr_p<71230) {
									point_tr_p = 71230;
								}
							}
							if(playerHands[b].charAt(0)=='◆') {
								if(point_tr_p<71220) {
									point_tr_p = 71220;
								}
							}
							if(playerHands[b].charAt(0)=='♥') {
								if(point_tr_p<71210) {
									point_tr_p = 71210;
								}
							}
							if(playerHands[b].charAt(0)=='♣') {
								if(point_tr_p<71200) {
									point_tr_p = 71200;
								}
							}
							
						}
					}
				}
				//System.out.println("트리플 테스트입니다"+point_tr_c);
				//투페어
				int count_tp_c = 0;
				int count_tp_c_sub = 0;
				int count_tp_c_sub2 = 0;
				for(int a = 0; a<13;a++) {
					if(countBox_c_n[a]==2)  {
						count_tp_c++;
					}
					if(count_tp_c==1) {
						count_tp_c_sub = a;
					}
					if(count_tp_c==2) {
						count_tp_c_sub2 = a;
						if(a==1) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='2') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+0;
										}
									}
								}
							}
						}
						if(a==2) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='3') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+0;
										}
									}
								}
							}
						}
						if(a==3) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='4') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+0;
										}
									}
								}
							}
						}
						if(a==4) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='5') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+0;
										}
									}
								}
							}
						}
						if(a==5) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='6') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+0;
										}
									}
								}
							}
						}
						if(a==6) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='7') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+0;
										}
									}
								}
							}
						}
						if(a==7) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='8') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+0;
										}
									}
								}
							}
						}
						if(a==8) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='9') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+0;
										}
									}
								}
							}
						}
						if(a==9) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='1') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+0;
										}
									}
								}
							}
						}
						if(a==10) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='J') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+0;
										}
									}
								}
							}
						}
						if(a==11) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='Q') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+0;
										}
									}
								}
							}
						}
						if(a==12) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='K') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub+0;
										}
									}
								}
							}
						}
					}
					if(count_tp_c==3) {
						if(a==1) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='2') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+0;
										}
									}
								}
							}
						}
						if(a==2) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='3') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+0;
										}
									}
								}
							}
						}
						if(a==3) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='4') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+0;
										}
									}
								}
							}
						}
						if(a==4) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='5') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+0;
										}
									}
								}
							}
						}
						if(a==5) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='6') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+0;
										}
									}
								}
							}
						}
						if(a==6) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='7') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+0;
										}
									}
								}
							}
						}
						if(a==7) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='8') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+0;
										}
									}
								}
							}
						}
						if(a==8) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='9') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+0;
										}
									}
								}
							}
						}
						if(a==9) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='1') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+0;
										}
									}
								}
							}
						}
						if(a==10) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='J') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+0;
										}
									}
								}
							}
						}
						if(a==11) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='Q') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+0;
										}
									}
								}
							}
						}
						if(a==12) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='K') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+3) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+2) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+1) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_tp_c<45000+1000*a+10*count_tp_c_sub2+0) {
											point_tp_c = 45000+1000*a+10*count_tp_c_sub2+0;
										}
									}
								}
							}
						}
					}
				}
				int count_tp_p = 0;
				int count_tp_p_sub = 0;
				int count_tp_p_sub2 = 0;
				for(int a = 0; a<13;a++) {
					if(countBox_p_n[a]==2)  {
						count_tp_p++;
					}
					if(count_tp_p==1) {
						count_tp_p_sub = a;
					}
					if(count_tp_p==2) {
						count_tp_p_sub2 = a;
						if(a==1) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='2') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+0;
										}
									}
								}
							}
						}
						if(a==2) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='3') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+0;
										}
									}
								}
							}
						}
						if(a==3) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='4') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+0;
										}
									}
								}
							}
						}
						if(a==4) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='5') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+0;
										}
									}
								}
							}
						}
						if(a==5) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='6') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+0;
										}
									}
								}
							}
						}
						if(a==6) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='7') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+0;
										}
									}
								}
							}
						}
						if(a==7) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='8') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+0;
										}
									}
								}
							}
						}
						if(a==8) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='9') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+0;
										}
									}
								}
							}
						}
						if(a==9) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='1') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+0;
										}
									}
								}
							}
						}
						if(a==10) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='J') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+0;
										}
									}
								}
							}
						}
						if(a==11) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='Q') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+0;
										}
									}
								}
							}
						}
						if(a==12) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='K') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub+0;
										}
									}
								}
							}
						}
					}
					if(count_tp_p==3) {
						if(a==1) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='2') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+0;
										}
									}
								}
							}
						}
						if(a==2) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='3') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+0;
										}
									}
								}
							}
						}
						if(a==3) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='4') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+0;
										}
									}
								}
							}
						}
						if(a==4) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='5') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+0;
										}
									}
								}
							}
						}
						if(a==5) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='6') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+0;
										}
									}
								}
							}
						}
						if(a==6) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='7') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+0;
										}
									}
								}
							}
						}
						if(a==7) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='8') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+0;
										}
									}
								}
							}
						}
						if(a==8) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='9') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+0;
										}
									}
								}
							}
						}
						if(a==9) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='1') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+0;
										}
									}
								}
							}
						}
						if(a==10) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='J') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+0;
										}
									}
								}
							}
						}
						if(a==11) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='Q') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+0;
										}
									}
								}
							}
						}
						if(a==12) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='K') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+3) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+2) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+1) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_tp_p<45000+1000*a+10*count_tp_p_sub2+0) {
											point_tp_p = 45000+1000*a+10*count_tp_p_sub2+0;
										}
									}
								}
							}
						}
					}
				}
				//System.out.println("투페어 테스트입니다"+point_tp_c);
				//원페어
				for(int a = 12; a>=0;a--) {
					if(countBox_c_n[a]==2) {
						if(a==12) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='K') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_op_c<20000+a*100+3 ) {
											point_op_c = 20000+a*100+3;
										}
									}
									if(comHands[b].charAt(0)=='◆') {
										if(point_op_c<20000+a*100+2 ) {
											point_op_c = 20000+a*100+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_op_c<20000+a*100+1) {
											point_op_c = 20000+a*100+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_op_c<20000+a*100+0) {
											point_op_c = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==11) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='Q') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_op_c<20000+a*100+3 ) {
											point_op_c = 20000+a*100+3;
										}
										}
									if(comHands[b].charAt(0)=='◆') {
										if(point_op_c<20000+a*100+2 ) {
											point_op_c = 20000+a*100+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_op_c<20000+a*100+1) {
											point_op_c = 20000+a*100+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_op_c<20000+a*100+0) {
											point_op_c = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==10) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='J') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_op_c<20000+a*100+3 ) {
											point_op_c = 20000+a*100+3;
										}
										}
									if(comHands[b].charAt(0)=='◆') {
										if(point_op_c<20000+a*100+2 ) {
											point_op_c = 20000+a*100+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_op_c<20000+a*100+1) {
											point_op_c = 20000+a*100+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_op_c<20000+a*100+0) {
											point_op_c = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==9) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='1') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_op_c<20000+a*100+3 ) {
											point_op_c = 20000+a*100+3;
										}
										}
									if(comHands[b].charAt(0)=='◆') {
										if(point_op_c<20000+a*100+2 ) {
											point_op_c = 20000+a*100+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_op_c<20000+a*100+1) {
											point_op_c = 20000+a*100+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_op_c<20000+a*100+0) {
											point_op_c = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==8) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='9') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_op_c<20000+a*100+3 ) {
											point_op_c = 20000+a*100+3;
										}
										}
									if(comHands[b].charAt(0)=='◆') {
										if(point_op_c<20000+a*100+2 ) {
											point_op_c = 20000+a*100+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_op_c<20000+a*100+1) {
											point_op_c = 20000+a*100+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_op_c<20000+a*100+0) {
											point_op_c = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==7) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='8') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_op_c<20000+a*100+3 ) {
											point_op_c = 20000+a*100+3;
										}
										}
									if(comHands[b].charAt(0)=='◆') {
										if(point_op_c<20000+a*100+2 ) {
											point_op_c = 20000+a*100+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_op_c<20000+a*100+1) {
											point_op_c = 20000+a*100+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_op_c<20000+a*100+0) {
											point_op_c = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==6) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='7') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_op_c<20000+a*100+3 ) {
											point_op_c = 20000+a*100+3;
										}
										}
									if(comHands[b].charAt(0)=='◆') {
										if(point_op_c<20000+a*100+2 ) {
											point_op_c = 20000+a*100+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_op_c<20000+a*100+1) {
											point_op_c = 20000+a*100+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_op_c<20000+a*100+0) {
											point_op_c = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==5) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='6') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_op_c<20000+a*100+3 ) {
											point_op_c = 20000+a*100+3;
										}
										}
									if(comHands[b].charAt(0)=='◆') {
										if(point_op_c<20000+a*100+2 ) {
											point_op_c = 20000+a*100+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_op_c<20000+a*100+1) {
											point_op_c = 20000+a*100+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_op_c<20000+a*100+0) {
											point_op_c = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==4) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='5') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_op_c<20000+a*100+3 ) {
											point_op_c = 20000+a*100+3;
										}
										}
									if(comHands[b].charAt(0)=='◆') {
										if(point_op_c<20000+a*100+2 ) {
											point_op_c = 20000+a*100+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_op_c<20000+a*100+1) {
											point_op_c = 20000+a*100+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_op_c<20000+a*100+0) {
											point_op_c = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==3) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='4') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_op_c<20000+a*100+3 ) {
											point_op_c = 20000+a*100+3;
										}
										}
									if(comHands[b].charAt(0)=='◆') {
										if(point_op_c<20000+a*100+2 ) {
											point_op_c = 20000+a*100+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_op_c<20000+a*100+1) {
											point_op_c = 20000+a*100+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_op_c<20000+a*100+0) {
											point_op_c = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==2) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='3') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_op_c<20000+a*100+3 ) {
											point_op_c = 20000+a*100+3;
										}
										}
									if(comHands[b].charAt(0)=='◆') {
										if(point_op_c<20000+a*100+2 ) {
											point_op_c = 20000+a*100+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_op_c<20000+a*100+1) {
											point_op_c = 20000+a*100+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_op_c<20000+a*100+0) {
											point_op_c = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==1) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='2') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_op_c<20000+a*100+3 ) {
											point_op_c = 20000+a*100+3;
										}
										}
									if(comHands[b].charAt(0)=='◆') {
										if(point_op_c<20000+a*100+2 ) {
											point_op_c = 20000+a*100+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_op_c<20000+a*100+1) {
											point_op_c = 20000+a*100+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_op_c<20000+a*100+0) {
											point_op_c = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==0) {
							for(int b=0;b<7;b++) {
								if(comHands[b].charAt(2)=='A') {
									if(comHands[b].charAt(0)=='♠') {
										if(point_op_c<20000+a*100+3 ) {
											point_op_c = 20000+a*100+3;
										}
										}
									if(comHands[b].charAt(0)=='◆') {
										if(point_op_c<20000+a*100+2 ) {
											point_op_c = 20000+a*100+2;
										}
									}
									if(comHands[b].charAt(0)=='♥') {
										if(point_op_c<20000+a*100+1) {
											point_op_c = 20000+a*100+1;
										}
									}
									if(comHands[b].charAt(0)=='♣') {
										if(point_op_c<20000+a*100+0) {
											point_op_c = 20000+a*100+0;
										}
									}
								}
							}
						}
					}
				}
				for(int a = 12; a>=0;a--) {
					if(countBox_p_n[a]==2) {
						if(a==12) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='K') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_op_p<20000+a*100+3 ) {
											point_op_p = 20000+a*100+3;
										}
									}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_op_p<20000+a*100+2 ) {
											point_op_p = 20000+a*100+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_op_p<20000+a*100+1) {
											point_op_p = 20000+a*100+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_op_p<20000+a*100+0) {
											point_op_p = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==11) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='Q') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_op_p<20000+a*100+3 ) {
											point_op_p = 20000+a*100+3;
										}
										}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_op_p<20000+a*100+2 ) {
											point_op_p = 20000+a*100+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_op_p<20000+a*100+1) {
											point_op_p = 20000+a*100+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_op_p<20000+a*100+0) {
											point_op_p = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==10) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='J') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_op_p<20000+a*100+3 ) {
											point_op_p = 20000+a*100+3;
										}
										}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_op_p<20000+a*100+2 ) {
											point_op_p = 20000+a*100+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_op_p<20000+a*100+1) {
											point_op_p = 20000+a*100+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_op_p<20000+a*100+0) {
											point_op_p = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==9) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='1') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_op_p<20000+a*100+3 ) {
											point_op_p = 20000+a*100+3;
										}
										}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_op_p<20000+a*100+2 ) {
											point_op_p = 20000+a*100+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_op_p<20000+a*100+1) {
											point_op_p = 20000+a*100+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_op_p<20000+a*100+0) {
											point_op_p = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==8) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='9') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_op_p<20000+a*100+3 ) {
											point_op_p = 20000+a*100+3;
										}
										}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_op_p<20000+a*100+2 ) {
											point_op_p = 20000+a*100+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_op_p<20000+a*100+1) {
											point_op_p = 20000+a*100+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_op_p<20000+a*100+0) {
											point_op_p = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==7) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='8') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_op_p<20000+a*100+3 ) {
											point_op_p = 20000+a*100+3;
										}
										}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_op_p<20000+a*100+2 ) {
											point_op_p = 20000+a*100+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_op_p<20000+a*100+1) {
											point_op_p = 20000+a*100+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_op_p<20000+a*100+0) {
											point_op_p = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==6) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='7') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_op_p<20000+a*100+3 ) {
											point_op_p = 20000+a*100+3;
										}
										}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_op_p<20000+a*100+2 ) {
											point_op_p = 20000+a*100+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_op_p<20000+a*100+1) {
											point_op_p = 20000+a*100+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_op_p<20000+a*100+0) {
											point_op_p = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==5) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='6') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_op_p<20000+a*100+3 ) {
											point_op_p = 20000+a*100+3;
										}
										}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_op_p<20000+a*100+2 ) {
											point_op_p = 20000+a*100+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_op_p<20000+a*100+1) {
											point_op_p = 20000+a*100+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_op_p<20000+a*100+0) {
											point_op_p = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==4) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='5') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_op_p<20000+a*100+3 ) {
											point_op_p = 20000+a*100+3;
										}
										}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_op_p<20000+a*100+2 ) {
											point_op_p = 20000+a*100+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_op_p<20000+a*100+1) {
											point_op_p = 20000+a*100+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_op_p<20000+a*100+0) {
											point_op_p = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==3) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='4') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_op_p<20000+a*100+3 ) {
											point_op_p = 20000+a*100+3;
										}
										}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_op_p<20000+a*100+2 ) {
											point_op_p = 20000+a*100+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_op_p<20000+a*100+1) {
											point_op_p = 20000+a*100+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_op_p<20000+a*100+0) {
											point_op_p = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==2) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='3') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_op_p<20000+a*100+3 ) {
											point_op_p = 20000+a*100+3;
										}
										}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_op_p<20000+a*100+2 ) {
											point_op_p = 20000+a*100+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_op_p<20000+a*100+1) {
											point_op_p = 20000+a*100+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_op_p<20000+a*100+0) {
											point_op_p = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==1) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='2') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_op_p<20000+a*100+3 ) {
											point_op_p = 20000+a*100+3;
										}
										}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_op_p<20000+a*100+2 ) {
											point_op_p = 20000+a*100+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_op_p<20000+a*100+1) {
											point_op_p = 20000+a*100+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_op_p<20000+a*100+0) {
											point_op_p = 20000+a*100+0;
										}
									}
								}
							}
						}
						if(a==0) {
							for(int b=0;b<7;b++) {
								if(playerHands[b].charAt(2)=='A') {
									if(playerHands[b].charAt(0)=='♠') {
										if(point_op_p<20000+a*100+3 ) {
											point_op_p = 20000+a*100+3;
										}
										}
									if(playerHands[b].charAt(0)=='◆') {
										if(point_op_p<20000+a*100+2 ) {
											point_op_p = 20000+a*100+2;
										}
									}
									if(playerHands[b].charAt(0)=='♥') {
										if(point_op_p<20000+a*100+1) {
											point_op_p = 20000+a*100+1;
										}
									}
									if(playerHands[b].charAt(0)=='♣') {
										if(point_op_p<20000+a*100+0) {
											point_op_p = 20000+a*100+0;
										}
									}
								}
							}
						}
					}
				}
				
				
				//탑
				int topCount_c = 0 ;
				for(int a = 0; a<13;a++) {
					if(countBox_c_n[a]<2) {
						topCount_c++;
					}
				}
				if(topCount_c==13) {
					for(int a = 0;a<7;a++) {
						if(comHands[a].charAt(2)=='A') {
							if(comHands[a].charAt(0)=='♣') {
								if(point_t_c<1) {
									point_t_c = 1;
								}
							}
							if(comHands[a].charAt(0)=='♥') {
								if(point_t_c<2) {
									point_t_c = 2;
								}
							}
							if(comHands[a].charAt(0)=='◆') {
								if(point_t_c<3) {
									point_t_c = 3;
								}
							}
							if(comHands[a].charAt(0)=='♠') {
								if(point_t_c<4) {
									point_t_c = 4;
								}
							}
						}
						if(comHands[a].charAt(2)=='2') {
							if(comHands[a].charAt(0)=='♣') {
								if(point_t_c<5) {
									point_t_c = 5;
								}
							}
							if(comHands[a].charAt(0)=='♥') {
								if(point_t_c<6) {
									point_t_c = 6;
								}
							}
							if(comHands[a].charAt(0)=='◆') {
								if(point_t_c<7) {
									point_t_c = 7;
								}
							}
							if(comHands[a].charAt(0)=='♠') {
								if(point_t_c<8) {
									point_t_c = 8;
								}
							}
						}
						if(comHands[a].charAt(2)=='3') {
							if(comHands[a].charAt(0)=='♣') {
								if(point_t_c<9) {
									point_t_c = 9;
								}
							}
							if(comHands[a].charAt(0)=='♥') {
								if(point_t_c<10) {
									point_t_c = 10;
								}
							}
							if(comHands[a].charAt(0)=='◆') {
								if(point_t_c<11) {
									point_t_c = 11;
								}
							}
							if(comHands[a].charAt(0)=='♠') {
								if(point_t_c<12) {
									point_t_c = 12;
								}
							}
						}
						if(comHands[a].charAt(2)=='4') {
							if(comHands[a].charAt(0)=='♣') {
								if(point_t_c<13) {
									point_t_c = 13;
								}
							}
							if(comHands[a].charAt(0)=='♥') {
								if(point_t_c<14) {
									point_t_c = 14;
								}
							}
							if(comHands[a].charAt(0)=='◆') {
								if(point_t_c<15) {
									point_t_c = 15;
								}
							}
							if(comHands[a].charAt(0)=='♠') {
								if(point_t_c<16) {
									point_t_c = 16;
								}
							}
						}
						if(comHands[a].charAt(2)=='5') {
							if(comHands[a].charAt(0)=='♣') {
								if(point_t_c<17) {
									point_t_c = 17;
								}
							}
							if(comHands[a].charAt(0)=='♥') {
								if(point_t_c<18) {
									point_t_c = 18;
								}
							}
							if(comHands[a].charAt(0)=='◆') {
								if(point_t_c<19) {
									point_t_c = 19;
								}
							}
							if(comHands[a].charAt(0)=='♠') {
								if(point_t_c<20) {
									point_t_c = 20;
								}
							}
						}
						if(comHands[a].charAt(2)=='6') {
							if(comHands[a].charAt(0)=='♣') {
								if(point_t_c<21) {
									point_t_c = 21;
								}
							}
							if(comHands[a].charAt(0)=='♥') {
								if(point_t_c<22) {
									point_t_c = 22;
								}
							}
							if(comHands[a].charAt(0)=='◆') {
								if(point_t_c<23) {
									point_t_c = 23;
								}
							}
							if(comHands[a].charAt(0)=='♠') {
								if(point_t_c<24) {
									point_t_c =24;
								}
							}
							if(comHands[a].charAt(2)=='7') {
								if(comHands[a].charAt(0)=='♣') {
									if(point_t_c<25) {
										point_t_c = 25;
									}
								}
								if(comHands[a].charAt(0)=='♥') {
									if(point_t_c<26) {
										point_t_c = 26;
									}
								}
								if(comHands[a].charAt(0)=='◆') {
									if(point_t_c<27) {
										point_t_c = 27;
									}
								}
								if(comHands[a].charAt(0)=='♠') {
									if(point_t_c<28) {
										point_t_c = 28;
									}
								}
							}
						}
						if(comHands[a].charAt(2)=='8') {
							if(comHands[a].charAt(0)=='♣') {
								if(point_t_c<29) {
									point_t_c = 29;
								}
							}
							if(comHands[a].charAt(0)=='♥') {
								if(point_t_c<30) {
									point_t_c = 30;
								}
							}
							if(comHands[a].charAt(0)=='◆') {
								if(point_t_c<31) {
									point_t_c = 31;
								}
							}
							if(comHands[a].charAt(0)=='♠') {
								if(point_t_c<32) {
									point_t_c = 32;
								}
							}
						}
						if(comHands[a].charAt(2)=='9') {
							if(comHands[a].charAt(0)=='♣') {
								if(point_t_c<33) {
									point_t_c = 33;
								}
							}
							if(comHands[a].charAt(0)=='♥') {
								if(point_t_c<34) {
									point_t_c = 34;
								}
							}
							if(comHands[a].charAt(0)=='◆') {
								if(point_t_c<35) {
									point_t_c = 35;
								}
							}
							if(comHands[a].charAt(0)=='♠') {
								if(point_t_c<36) {
									point_t_c = 36;
								}
							}
						}
						if(comHands[a].charAt(2)=='1') {
							if(comHands[a].charAt(0)=='♣') {
								if(point_t_c<37) {
									point_t_c = 37;
								}
							}
							if(comHands[a].charAt(0)=='♥') {
								if(point_t_c<38) {
									point_t_c = 38;
								}
							}
							if(comHands[a].charAt(0)=='◆') {
								if(point_t_c<39) {
									point_t_c = 39;
								}
							}
							if(comHands[a].charAt(0)=='♠') {
								if(point_t_c<40) {
									point_t_c = 40;
								}
							}
						}
						if(comHands[a].charAt(2)=='J') {
							if(comHands[a].charAt(0)=='♣') {
								if(point_t_c<41) {
									point_t_c = 41;
								}
							}
							if(comHands[a].charAt(0)=='♥') {
								if(point_t_c<42) {
									point_t_c = 42;
								}
							}
							if(comHands[a].charAt(0)=='◆') {
								if(point_t_c<43) {
									point_t_c = 43;
								}
							}
							if(comHands[a].charAt(0)=='♠') {
								if(point_t_c<44) {
									point_t_c = 44;
								}
							}
						}
						if(comHands[a].charAt(2)=='Q') {
							if(comHands[a].charAt(0)=='♣') {
								if(point_t_c<45) {
									point_t_c = 45;
								}
							}
							if(comHands[a].charAt(0)=='♥') {
								if(point_t_c<46) {
									point_t_c = 46;
								}
							}
							if(comHands[a].charAt(0)=='◆') {
								if(point_t_c<47) {
									point_t_c = 47;
								}
							}
							if(comHands[a].charAt(0)=='♠') {
								if(point_t_c<48) {
									point_t_c = 48;
								}
							}
						}
						if(comHands[a].charAt(2)=='K') {
							if(comHands[a].charAt(0)=='♣') {
								if(point_t_c<49) {
									point_t_c = 49;
								}
							}
							if(comHands[a].charAt(0)=='♥') {
								if(point_t_c<50) {
									point_t_c = 50;
								}
							}
							if(comHands[a].charAt(0)=='◆') {
								if(point_t_c<51) {
									point_t_c = 51;
								}
							}
							if(comHands[a].charAt(0)=='♠') {
								if(point_t_c<52) {
									point_t_c = 52;
								}
							}
						}
					}
				}
				int topCount_p = 0 ;
				for(int a = 0; a<13;a++) {
					if(countBox_p_n[a]<2) {
						topCount_p++;
					}
				}
				if(topCount_p==13) {
					for(int a = 0;a<7;a++) {
						if(playerHands[a].charAt(2)=='A') {
							if(playerHands[a].charAt(0)=='♣') {
								if(point_t_p<1) {
									point_t_p = 1;
								}
							}
							if(playerHands[a].charAt(0)=='♥') {
								if(point_t_p<2) {
									point_t_p = 2;
								}
							}
							if(playerHands[a].charAt(0)=='◆') {
								if(point_t_p<3) {
									point_t_p = 3;
								}
							}
							if(playerHands[a].charAt(0)=='♠') {
								if(point_t_p<4) {
									point_t_p = 4;
								}
							}
						}
						if(playerHands[a].charAt(2)=='2') {
							if(playerHands[a].charAt(0)=='♣') {
								if(point_t_p<5) {
									point_t_p = 5;
								}
							}
							if(playerHands[a].charAt(0)=='♥') {
								if(point_t_p<6) {
									point_t_p = 6;
								}
							}
							if(playerHands[a].charAt(0)=='◆') {
								if(point_t_p<7) {
									point_t_p = 7;
								}
							}
							if(playerHands[a].charAt(0)=='♠') {
								if(point_t_p<8) {
									point_t_p = 8;
								}
							}
						}
						if(playerHands[a].charAt(2)=='3') {
							if(playerHands[a].charAt(0)=='♣') {
								if(point_t_p<9) {
									point_t_p = 9;
								}
							}
							if(playerHands[a].charAt(0)=='♥') {
								if(point_t_p<10) {
									point_t_p = 10;
								}
							}
							if(playerHands[a].charAt(0)=='◆') {
								if(point_t_p<11) {
									point_t_p = 11;
								}
							}
							if(playerHands[a].charAt(0)=='♠') {
								if(point_t_p<12) {
									point_t_p = 12;
								}
							}
						}
						if(playerHands[a].charAt(2)=='4') {
							if(playerHands[a].charAt(0)=='♣') {
								if(point_t_p<13) {
									point_t_p = 13;
								}
							}
							if(playerHands[a].charAt(0)=='♥') {
								if(point_t_p<14) {
									point_t_p = 14;
								}
							}
							if(playerHands[a].charAt(0)=='◆') {
								if(point_t_p<15) {
									point_t_p = 15;
								}
							}
							if(playerHands[a].charAt(0)=='♠') {
								if(point_t_p<16) {
									point_t_p = 16;
								}
							}
						}
						if(playerHands[a].charAt(2)=='5') {
							if(playerHands[a].charAt(0)=='♣') {
								if(point_t_p<17) {
									point_t_p = 17;
								}
							}
							if(playerHands[a].charAt(0)=='♥') {
								if(point_t_p<18) {
									point_t_p = 18;
								}
							}
							if(playerHands[a].charAt(0)=='◆') {
								if(point_t_p<19) {
									point_t_p = 19;
								}
							}
							if(playerHands[a].charAt(0)=='♠') {
								if(point_t_p<20) {
									point_t_p = 20;
								}
							}
						}
						if(playerHands[a].charAt(2)=='6') {
							if(playerHands[a].charAt(0)=='♣') {
								if(point_t_p<21) {
									point_t_p = 21;
								}
							}
							if(playerHands[a].charAt(0)=='♥') {
								if(point_t_p<22) {
									point_t_p = 22;
								}
							}
							if(playerHands[a].charAt(0)=='◆') {
								if(point_t_p<23) {
									point_t_p = 23;
								}
							}
							if(playerHands[a].charAt(0)=='♠') {
								if(point_t_p<24) {
									point_t_p =24;
								}
							}
							if(playerHands[a].charAt(2)=='7') {
								if(playerHands[a].charAt(0)=='♣') {
									if(point_t_p<25) {
										point_t_p = 25;
									}
								}
								if(playerHands[a].charAt(0)=='♥') {
									if(point_t_p<26) {
										point_t_p = 26;
									}
								}
								if(playerHands[a].charAt(0)=='◆') {
									if(point_t_p<27) {
										point_t_p = 27;
									}
								}
								if(playerHands[a].charAt(0)=='♠') {
									if(point_t_p<28) {
										point_t_p = 28;
									}
								}
							}
						}
						if(playerHands[a].charAt(2)=='8') {
							if(playerHands[a].charAt(0)=='♣') {
								if(point_t_p<29) {
									point_t_p = 29;
								}
							}
							if(playerHands[a].charAt(0)=='♥') {
								if(point_t_p<30) {
									point_t_p = 30;
								}
							}
							if(playerHands[a].charAt(0)=='◆') {
								if(point_t_p<31) {
									point_t_p = 31;
								}
							}
							if(playerHands[a].charAt(0)=='♠') {
								if(point_t_p<32) {
									point_t_p = 32;
								}
							}
						}
						if(playerHands[a].charAt(2)=='9') {
							if(playerHands[a].charAt(0)=='♣') {
								if(point_t_p<33) {
									point_t_p = 33;
								}
							}
							if(playerHands[a].charAt(0)=='♥') {
								if(point_t_p<34) {
									point_t_p = 34;
								}
							}
							if(playerHands[a].charAt(0)=='◆') {
								if(point_t_p<35) {
									point_t_p = 35;
								}
							}
							if(playerHands[a].charAt(0)=='♠') {
								if(point_t_p<36) {
									point_t_p = 36;
								}
							}
						}
						if(playerHands[a].charAt(2)=='1') {
							if(playerHands[a].charAt(0)=='♣') {
								if(point_t_p<37) {
									point_t_p = 37;
								}
							}
							if(playerHands[a].charAt(0)=='♥') {
								if(point_t_p<38) {
									point_t_p = 38;
								}
							}
							if(playerHands[a].charAt(0)=='◆') {
								if(point_t_p<39) {
									point_t_p = 39;
								}
							}
							if(playerHands[a].charAt(0)=='♠') {
								if(point_t_p<40) {
									point_t_p = 40;
								}
							}
						}
						if(playerHands[a].charAt(2)=='J') {
							if(playerHands[a].charAt(0)=='♣') {
								if(point_t_p<41) {
									point_t_p = 41;
								}
							}
							if(playerHands[a].charAt(0)=='♥') {
								if(point_t_p<42) {
									point_t_p = 42;
								}
							}
							if(playerHands[a].charAt(0)=='◆') {
								if(point_t_p<43) {
									point_t_p = 43;
								}
							}
							if(playerHands[a].charAt(0)=='♠') {
								if(point_t_p<44) {
									point_t_p = 44;
								}
							}
						}
						if(playerHands[a].charAt(2)=='Q') {
							if(playerHands[a].charAt(0)=='♣') {
								if(point_t_p<45) {
									point_t_p = 45;
								}
							}
							if(playerHands[a].charAt(0)=='♥') {
								if(point_t_p<46) {
									point_t_p = 46;
								}
							}
							if(playerHands[a].charAt(0)=='◆') {
								if(point_t_p<47) {
									point_t_p = 47;
								}
							}
							if(playerHands[a].charAt(0)=='♠') {
								if(point_t_p<48) {
									point_t_p = 48;
								}
							}
						}
						if(playerHands[a].charAt(2)=='K') {
							if(playerHands[a].charAt(0)=='♣') {
								if(point_t_p<49) {
									point_t_p = 49;
								}
							}
							if(playerHands[a].charAt(0)=='♥') {
								if(point_t_p<50) {
									point_t_p = 50;
								}
							}
							if(playerHands[a].charAt(0)=='◆') {
								if(point_t_p<51) {
									point_t_p = 51;
								}
							}
							if(playerHands[a].charAt(0)=='♠') {
								if(point_t_p<52) {
									point_t_p = 52;
								}
							}
						}
					}
				}
				int pointBox_c [] = {point_sf_c,point_fc_c,point_fh_c,point_f_c, point_f_c,point_st_c,point_tr_c,point_tp_c,point_op_c,point_t_c};
				int pointBox_p [] = {point_sf_p,point_fc_p,point_fh_p,point_f_p, point_f_p,point_st_p,point_tr_p,point_tp_p,point_op_p,point_t_p};
				int max_c = 0;
				int max_p = 0;
				for(int a = 0; a<pointBox_c.length;a++) {
					if(max_c<pointBox_c[a]) {
						max_c = pointBox_c[a];
					}
				}
				for(int a = 0; a<pointBox_p.length;a++) {
					if(max_p<pointBox_p[a]) {
						max_p = pointBox_p[a];
					}
				}
				boolean winner = max_c<max_p;
				
				
				
				//int playerCoin;
				//FileReader in = new FileReader("coin.txt");
				//int coin_c;
				//String coin_s = new String();
				/*
				 * while((coin_c=in.read())!=-1) { coin_s+=(char)coin_c; } in.close();
				 */
				//playerCoin = Integer.parseInt(coin_s);
				//System.out.println(playerCoin);
				int call_money = 10;
				int ingame_money = 200;
				int playerPay = 100;
				System.out.println("-----------------Game Start-----------------");
				int turn=2;
				int choise;
				System.out.println("1번째 턴");
				System.out.println("상대의 패 : ????  ????  "+comHands[0]);
				System.out.println("나의 패 : " + playerHands[0]+"  "+playerHands[1]+"  "+playerHands[2]);
				System.out.println("Half? or Call? or Die? \n Half : 1, Call : 2, Die : 3");
				choise = scan.nextInt();
				switch(choise){
				case 1 :
					call_money =call_money * 2;
					playerPay = playerPay +(ingame_money/2);
					ingame_money = ingame_money *2;
					break;
				case 2 :
					playerPay = playerPay + call_money;
					ingame_money = ingame_money + call_money*2;
					call_money = call_money*2;
					break;
				case 3 :
					System.out.println("패배하셨습니다");
					//playerCoin = playerCoin - playerPay;
						//FileWriter out = new FileWriter("coin.txt");
					//out.write(playerCoin);
				//	out.close();
					break;
				}
				while(turn!= 7) {
					System.out.println(turn +"번째 턴");
					if(turn<5) {
						System.out.print("com의 패 : ????  ????  ");
						for(int g2 = 0;g2<turn;g2++) {
							System.out.print(comHands[g2]+"  ");
						}
						System.out.print("\n당신의 패 : ");
						for(int g = 0;g<turn+2;g++) {
							System.out.print(playerHands[g]+"  ");
						}
						System.out.println("\n");
					}
					if(turn==5) {
						System.out.print("com의 패 : ????  ????  ");
						for(int g2 = 0;g2<turn-1;g2++) {
							System.out.print(comHands[g2]+"  ");
						}
						System.out.println("????");
						System.out.print("\n당신의 패 : ");
						for(int g = 0;g<turn+2;g++) {
							System.out.print(playerHands[g]+"  ");
						}
						System.out.println("\n");
					}
					if(turn==6) {
						System.out.println("batting was end!");
						System.out.println("com의 패 : "+comHands[5]+"  "+comHands[4]+"  "+comHands[0]+"  "+comHands[1]+"  "+comHands[2]+"  "+comHands[3]+"  "+comHands[6]);
						System.out.print("당신의 패 : " +playerHands[0]+"  "+playerHands[1]+"  "+playerHands[2]+"  "+playerHands[3]+"  "+playerHands[4]+"  "+playerHands[5]+"  "+playerHands[6]);
						System.out.println(winner);
						System.out.println(max_c);
						System.out.println(max_p);
						break;
					}
					System.out.println("Half? or Call? or Die? \n Half : 1, Call : 2, Die : 3");
					choise = scan.nextInt();
					switch(choise){
					case 1 :
						turn++;
						break;
					case 2 :
						turn++;
						break;
					case 3 :
						System.out.println("you die...");
						break;
					}
					if(choise==3) {
						break;
					}
				}
				
			}catch(Exception e) {
				System.out.println("에러발생");
			}
			break;
		case 2 :
			System.out.println("밑으로 내려갈수록 급이 낮습니다");
			System.out.println("Royal Straight Flush : 같은 모양의 카드가 A,10,J,Q,K 로 있을 때");
			System.out.println("ex) ♠_A,♠_10,♠_J,♠_Q,♠_K"); 
			System.out.println("Straight Flush : 5장의 같은 모양의 카드가 연속된 숫자로 있을 때 ");
			System.out.println("ex) ◆_4,◆_5,◆_6,◆_7,◆_8");
			System.out.println("Four Card : 숫자가 같은 카드가 4장이 있을 때");
			System.out.println("ex) ♠_5,◆_5,♥_5,♣_5");
			System.out.println("Full House : 숫자가 같은 카드 3장과 또 다른 숫자가 같은 가드 2장이 있을 때");
			System.out.println("ex) ♠_5,◆_5,♥_5,◆_7,♥_7");
			System.out.println("Flush : 같은 모양의 카드가 5장이 있을 때");
			System.out.println("ex) ♠_4,♠_6,♠_9,♠_J,♠_k");
			System.out.println("Straight : 5장의 카드가 연속된 숫자로 있을 때 ");
			System.out.println("ex) ♠_6,♥_7,♠_9,◆_10,♣_J");
			System.out.println("Triple : 같은 숫자의 카드가 세 장 있을 때");
			System.out.println("ex) clover_7,◆_7,♥_7");
			System.out.println("Two Pair : 같은 숫자의 카드 2장이 두 쌍이 있을 때");
			System.out.println("ex) ◆_5,♥_5, ◆_9, ♣_9");
			System.out.println("One Pair : 같은 숫자의 카드가 2장이 있을 때");
			System.out.println("ex) ♥_A,♣_A");
			System.out.println("Top : 위 내용이 하나도 포함이 안되면 가장 큰수를 Top라고 합니다.");
			System.out.println("만약 위 내용중 같은 족보로 경합할 때에는 가장 큰 수가 승리하게 되고,");
			System.out.println("숫자 또한 같다면, ♠-->◆-->♥-->♣ 순으로, ♠가 기준으로 우위에 있게 됩니다.");
			break;
		case 3:
			System.out.println("Half : 판돈의 절반");
			System.out.println("Call : 배팅액만큼");
			System.out.println("Die : 배팅 포기");
			System.out.println("배팅 시작금은 100원 이고, 한 턴이 넘어갈때마다 2배씩 증가합니다. 플레이어가 Call을 제시할 시 다음턴으로 넘어갑니다. \ncom은 당신이 배팅한 양 만큼만 배팅하고, 배팅 순서는 플레이어가 먼저입니다.");
			break;
		default :
			System.out.println("잘못 입력하셨습니다. 다시입력해주세요");
			break;
		}
	}
}
