# 야구게임 
게임규칙<br>
랜덤하게 생성된 숫자 3개를 유저가 입력한 숫자와 비교하여 <br>
자릿수가 같은 숫자가 있으면 1스트라이크 숫자만 같으면 1볼로 3스트라이크가 되면 끝나는 게임이다<br>
# 야구게임 코드
![image](https://user-images.githubusercontent.com/102035198/173285491-20860e27-5822-4520-b1a0-9b98d7056031.png)<br>
result 변수 선언과 정수형으로 형변환을 통해 x,y,z 에 저장<br>
![image](https://user-images.githubusercontent.com/102035198/173283958-404d5aaf-b575-4d4d-8af9-d7e2dea69a0b.png)<br>
메소드 2개를 생성<br>
난수발생시키는 경우 playGame()에 해당<br>
![image](https://user-images.githubusercontent.com/102035198/173285566-b2398239-b7d2-44a3-8747-2369d8cbd79b.png)<br>
시도 횟수(count)값에 따라 다른 문구 출력<br>
시도횟수(count)를 결과값으로 반환하여 result에 저장<br>
![image](https://user-images.githubusercontent.com/102035198/173285691-ae7b8232-6d92-4915-9c1f-7f517d187a54.png)<br>
정수형 x,y,z 선언<br>
난수발생 Random 메소드로 객체변수 r 생성<br>
![image](https://user-images.githubusercontent.com/102035198/173284941-c3058adf-e9be-4a1b-b44f-ad80e0f91f62.png)<br>
1부터9까지의 난수가 발생한다<br>
y가 x와 같은 경우 반복<br>
z가 x 또는 y와 같은 경우 반복한다<br>
![image](https://user-images.githubusercontent.com/102035198/173285807-885301be-f7bc-43b4-8d48-69e57b4f846f.png)<br>
x,y,z의 값을 출력해준다(게임 시 주석처리)<br>
![image](https://user-images.githubusercontent.com/102035198/173285972-2e0c4e41-da30-4d8b-828e-0e7aa457d301.png)<br>
정수형 count,strike,ball 선언<br>
배열 usr과 com 선언<br>
게임 시작문구 출력<br>
![image](https://user-images.githubusercontent.com/102035198/173286152-c97b104a-c56c-4494-80c2-00c85a6a3843.png)<br>
count를 0으로 초기화<br>
count++로 횟수(count) 더하기<br>
횟수(count) 출력<br>
사용자가 입력하는 데이터를 받아들이는 BufferedReader() 메소드의 객체변수 in 생성<br>
문자형 user 선언<br>
첫번째 숫자부터 세번째 숫자까지 입력받기<br>
![image](https://user-images.githubusercontent.com/102035198/173286642-9a4dc093-1800-4225-a478-e72669147486.png)<br>
중복제거와 중복시 다시입력 문구 출력<br>
![image](https://user-images.githubusercontent.com/102035198/173286692-587b8582-cc63-4488-aad6-81e505098dc7.png)<br>
모든 숫자가 1부터9사이, 같은 숫자가 없는 경우에만 반복문을 빠져나옴<br>
![image](https://user-images.githubusercontent.com/102035198/173286756-d058c457-5d1d-46d6-9c1f-3b70eca0c5f2.png)<br>
사용자가 입력한 숫자가 컴퓨터가 랜덤하게 만든 숫자를 비교<br>
자릿수, 숫자가 둘다 같을 경우 strike+1<br>
숫자만 같을 경우 ball+1<br>
모두 비교한 다음 strike와 ball 갯수 출력<br>
![image](https://user-images.githubusercontent.com/102035198/173287062-696a4db6-6bfd-49cd-916f-6d7c14d6c3e4.png)<br>
strike=3 이거나 count=11(시도횟수 11번째)가 되면 종료<br>
# 출력화면
![image](https://user-images.githubusercontent.com/102035198/173264797-f04075fe-034e-4d94-816f-80eb1df47124.png)<br>
8, 1, 4 입력 8과 1은 자릿수는 맞지 않고 숫자만 같으므로 2볼과 4는 자릿수와 숫자가 같으므로 1스트라이크가 나오고,<br>
1, 8, 4 입력 1, 8, 4 모두 다 자릿수와 숫자가 같기 때문에 3스트라이크가 나온다.<br>
3스트라이크가 나오면 끝나는 문구가 나오고 종료
