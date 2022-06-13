# 야구게임 
게임규칙<br>
랜덤하게 생성된 숫자 3개를 유저가 입력한 숫자와 비교하여 <br>
자리수가 같은 숫자가 있으면 1스트라이크 숫자만 같으면 1볼로 3스트라이크가 되면 끝나는 게임이다<br>
# 야구게임 코드
메소드 2개 생성<br>
![image](https://user-images.githubusercontent.com/102035198/173282329-55b624e6-e8d1-4f13-9f71-a6998c1ff211.png)<br>
난수발생<br>
![image](https://user-images.githubusercontent.com/102035198/173264443-284f670e-f6b0-4204-ab5e-70555d829be3.png)<br>
<br>
![image](https://user-images.githubusercontent.com/102035198/173282291-c22f7f07-9ef4-40d0-abaa-2c6c107cb4ab.png)<br>
![image](https://user-images.githubusercontent.com/102035198/173282849-6ea2d33a-e5de-4edb-a1a4-042b5d7ec470.png)<br>
사용자가 입력하는 데이터를 받아들이는 BufferedReader() 메소드의 객체변수 in 생성<br>
![image](https://user-images.githubusercontent.com/102035198/173282213-a3c08e0a-1e20-4dfe-818e-29c3161892df.png)<br>
중복제거와 유저가 입력한 숫자와 컴퓨터가 생성한 숫자를 비교<br>
# 출력화면
![image](https://user-images.githubusercontent.com/102035198/173264797-f04075fe-034e-4d94-816f-80eb1df47124.png)<br>
8 1 4 입력 8과1은 자리수는 맞지 않고 숫자만 같으므로 2볼과 4는 자리수와 숫자가 같으므로 1스트라이크가 나온다<br>
1 8 4 입력 1 8 4 모두 다 자리수와 숫자가 같기 때문에 3스트라이크가 나온다<br>
3스트라이크가 나오면 끝나는 문구가 나오고 종료
