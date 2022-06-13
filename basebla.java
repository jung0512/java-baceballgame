package baseballgame;
import java.util.*;
import java.io.*;

public class basebla {

	public static void main(String[] args) throws IOException{
		int result;
		
		if(args.length==3) {
			//각각 정수형으로 형변환을 통해 x,y,z에 저장한다
			int x = Integer.valueOf(args[0]).intValue();
			int y = Integer.valueOf(args[1]).intValue();
			int z = Integer.valueOf(args[2]).intValue();
			//playGame 메소드 생성
		result = playGame(x,y,z);
		}
		else {
			result = playGame();
		}
		//시도 횟수를 비교해서 칭찬문구 출력
		System.out.println();
		if(result <= 2) {
			System.out.println("참잘했어요");
		}
		else if(result <=5) {
			System.out.println("잘했어요");
		}
		else if(result <= 9) {
			System.out.println("보통입니다");
		}
		else {
			System.out.println("분발하세요");
		}
		
	}

	private static int playGame() throws IOException{
		int x,y,z;
		Random r = new Random();
		//Random 함수로 x,y,z 숫자 생성
		x = Math.abs(r.nextInt() % 9)+1;
		do {
			y = Math.abs(r.nextInt() % 9)+1;
		}while(y==x); //y가 x와 같으면 반복한다
		do {
			z = Math.abs(r.nextInt() % 9)+1;
		}while((z==y)||(z==x)); //z가 y또는x와 같으면 반복한다
		//x,y,z 숫자 출력
		System.out.println(x+","+y+","+z);
		return playGame(x,y,z);
	}

	private static int playGame(int x, int y, int z) throws IOException{
	    int count;  //게임을 시도하는 횟수
	    int strike, ball; //숫자 매칭에 따른 결과 
	    //
	    int[] usr = new int[3]; //사용자가 입력하는 숫자 3개를 저장하는 배열
	    int[] com = { x, y, z }; //컴퓨터가 선택한 숫자 3개를 저장하는 배열

	    System.out.println("숫자 야구 게임");

	    count= 0;

	    do{

	      count++;
	      
	      do{
	        System.out.println("\n카운트: "+count);

	        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	        String user;

	        System.out.print("1번째 숫자: ");  //첫번째 숫자 입력
	        user= in.readLine();
	        usr[0]= new Integer(user).intValue();

	        System.out.print("2번째 숫자: ");  //두번째 숫자 입력
	        user= in.readLine();
	        usr[1]= new Integer(user).intValue();

	        System.out.print("3번째 숫자: ");  //세번째 숫자 입력
	        user= in.readLine();
	        usr[2]= new Integer(user).intValue();

	        if((usr[0]==0)||(usr[1]==0)||(usr[2]==0)){
	          System.out.println("0은 입력하지 마세요. 다시 입력해주세요.");  
	        }else if((usr[0]>9)||(usr[1]>9)||(usr[2]>9)){  
	          System.out.println("1부터 9까지의 숫자 중 하나를 입력해주세요. 다시 입력해주세요.");
	        }else if((usr[0]==usr[1])||(usr[1]==usr[2])||(usr[0]==usr[2])){  
	            
	          System.out.println("모두 다른 숫자를 입력해주세요. 다시 입력해주세요.");
	        }
	      }
	      while((usr[0]==0)||(usr[1]==0)||(usr[2]==0)||
	             (usr[0]>9)||(usr[1]>9)||(usr[2]>9)||
	             (usr[0]==usr[1])||(usr[1]==usr[2])||(usr[0]==usr[2]));

	      strike = ball = 0;
	      //usr배열과 com배열을 비교하여 같으면 스트라이크 1추가
	      if(usr[0]==com[0]) strike++;
	      if(usr[1]==com[1]) strike++;
	      if(usr[2]==com[2]) strike++;
	      //usr배열과 com배열을 비교하여 같으면 볼 1추가
	      if(usr[0]==com[1]) ball++;
	      if(usr[0]==com[2]) ball++;
	      if(usr[1]==com[0]) ball++;
	      if(usr[1]==com[2]) ball++;
	      if(usr[2]==com[0]) ball++;
	      if(usr[2]==com[1]) ball++;
	  //스트라이크와 볼의 개수 출력
	      System.out.println("Strike: "+ strike +" Ball: "+ ball);

	    }
	    while((strike<3)&&(count<11));
		//스트라이크가 3이 되거나 카운트가 11이되면 카운트 리턴
	    return count;
	  }
	

}
