자동차 경주 게임
=====

####우아한 테크코스 2주차 미션

기능 요구사항
----
* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.

* 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.

* 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.

* 사용자는 몇 번의 이동을 할 것 인지를 입력 할 수 있어야 한다.

* 전진하는 조건은 0에서 9사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.

* 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.


유저 경험 흐름
---
1. 자동차 이름 입력 
2. 이동 횟수 입력
3. 실행 결과 출력
4. 우승자 출력
5. 종료

기능 구현 목록
---
* ~~다수의 자동차 이름 입력 (이름은 `,` 쉼표로 구분해 입력)~~
* ~~자동차 객체 생성 및 이름 저장~~
* 이동 횟수 입력 및 저장
* 0-9 사이 랜덤 값 출력 함수
* 자동차 별 전진 / 정지 시스템
* 횟수 만큼 게임 진행 / 출력
* 전진 횟수 순으로 자동차 정렬
* 가장 많이 전진한 자동차 우승자 선정

Task
---
1. ~~기능 목록 / 유저 플로우 작성~~
2. 워킹 프로토타입 완성
3. 테스트
4. 1차 리팩토링
5. 컨벤션 맞춰 리팩토링
6. 완성 및 깃 풀 리퀘스트

프로그래밍 요구 사항
---
####객체구현  
1. Car 객체를 활용해 구현
2. Car 기본 생성를 추가할 수 없음
3. name, position 변수의 접근 제어인 private을 변경할 수 없다.
4. 가능하면 setPosition(int position)메소드를 추가하지 않고 구현한다.

####코드구현
1. 컨벤션 주의
    - https://google.github.io/styleguide/javaguide.html
    - https://myeonguni.tistory.com/1596
2. indent 3미만  
3. 함수(또는 메소드)는 15라인 이하 / 한번에 한가지 일
4. else 예약어 사용 X, switch/Case도 X