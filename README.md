밥이닝 프로젝트 클론 카피 시작
spring starter project 생성 (boot 기반)
spring legacy project(스프링 기반)

java 8 사용
이유 : 
 - oracle jdk 지원기간이 2030년 12월로 가장 길며
java 8 : 2030년 12월
java 11 : 2026년 09월
java 17 : 2029년 09월

 - jdk 1.8부터 함수형 프로그래밍 지원이 가능해서
람다식(Lambda expressions) - Stream
함수형 인터페이스 (Functional Interface)
디폴트 메서드 ( Default Method)
JVM의 변화
병렬 배열 정렬(Parallel Array Sorting)
컬렉션을 위한 대용량 데이터 처리 ( 스트림 )
Optional
Base64 인코딩과 디코딩을 위한 표준 API
새로운 날짜, 시간 API (Date & Time API)

pom.xml 설정
java 8 을 사용함으로 이에 호환되는 boot 2 버전을 사용
spring boot 2 -> jdk 8, 11, 17
spring boot 3 -> jdk 17 이상

<version>2.4.2</version>
<java.version>1.8</java.version>
프로젝트 meven update

깃허브 올리기
프로젝트 폴더 위치 바탕화면으로 변경
refactor - move 

프로젝트 폴더에서 git bash here
git config --global user.name "유저이름"

git config --global user.email "유저 이메일"

git init      #.git 파일 생성

git add .     #선택한 프로젝트 폴더 내의 모든 파일 관리
		-> 특정파일만 하고 싶다면  git add 파일이름.파일형식  ex) git add a.txt

git status    #상태확인

git commit -m "주석"     #커밋

git remote add origin https://github.com/dongwouk/bapinning-clone-coding.git 주소

git push -u origin master

pom.xml 의존성

WEB MVC를 사용하여 웹 어플리케이션을 만드는 데에 필요한 스프링부트의 기본적인 요소
내장형 컨테이너로 톰캣을 기본으로 탑재
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>

application.properties 설정
서버 포트 설정
server.port = 8080

view 이름으로부터 사용할 view 오브젝트 매핑 설정
view resolver 설정


프로젝트 DB설계
ERD..

로드맵 작성

