# 밥이닝 프로젝트 클론코딩

# 밥이닝 프로젝트 클론 카피 시작

### 사용 툴 및 버젼

- 프레임워크 : Spring Tool Suite 3
    - spring starter project 생성 (boot 기반) spring legacy project(스프링 기반)
    
- JDK : java 8
    - Oracle JDK 지원기간

| JAVA 8 | 2030년 12월 |
| --- | --- |
| JAVA 11 | 2026년 9월 |
| JAVA17 | 2029년 9월 |

지원기간이 가장 길며, 버전이 낮을수록 안정성이 높을것이라 생각되어 JAVA 8 채택

- JAVA 8 이후 패치 내용이 큰 점
    - jdk 1.8부터 함수형 프로그래밍 지원이 가능
        - 람다식(Lambda expressions) - Stream 함수형
        - 인터페이스 (Functional Interface) 디폴트 메서드 ( Default Method) JVM의 변화
        - 병렬 배열 정렬(Parallel Array Sorting) 컬렉션을 위한 대용량 데이터 처리
        - ( 스트림 ) Optional Base64 인코딩과 디코딩을 위한 표준 API
        - 새로운 날짜, 시간 API (Date & Time API)
    
- pom.xml 설정 (Boot, JDK 설정)
    - java 8 을 사용함으로 이에 호환되는 boot 2 버전을 사용
        - spring boot 2 -> jdk 8, 11, 17
        - spring boot 3 -> jdk 17 이상

```xml
<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.4.2</version>
		<!-- Spring boot 2 버전 변경 -->
		<relativePath/>
	</parent>
<properties>
		<java.version>1.8</java.version>
		<!-- JDK 8 버전 변경 -->
	</properties>
```

- 프로젝트 버전 변경값을 적용하기 위한 프로젝트 meven update

- 프로젝트 코드 깃 연동
    - 리모트 저장소를 통하여 코드 저장
    
- 프로젝트 로컬 저장소 위치 변경
    - 깃허브 올리기 프로젝트 폴더 위치 바탕화면으로 변경 refactor - move
    
- 프로젝트 코드 git 연동
    - 프로젝트 폴더에서 git bash here 실행

```java
git config --global user.name "유저이름"
git config --global user.email "유저 이메일"

git init 
	#.git 파일 생성

git add . 
	#선택한 프로젝트 폴더 내의 모든 파일 관리 
	#-> 특정파일만 하고 싶다면 git add 파일이름.파일형식 ex) git add a.txt

git status 
	#상태확인
	#add한 파일 확인

git commit -m "주석" 
	#커밋
	#스테이징 영역으로 보내기

git remote add origin https://github.com/dongwouk/bapinning-clone-coding.git 주소
	#깃허브 주소로 연동

git push -u origin master
	#스테이징 영역의 내용 올리기
```

- pom.xml 의존성 설정 (기본 설정)
    - WEB MVC를 사용하여 웹 어플리케이션을 만드는 데에 필요한 스프링부트의 기본적인 요소 내장형 컨테이너로 톰캣을 기본으로 탑재
    
    ```xml
    <dependency>
    		<groupId>org.springframework.boot</groupId>
    		<artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    ```
    
    - 스프링 부트의 톰캣이 JSP를 지원하도록 해주는 의존성
    
    ```xml
    <dependency>
    		<groupId>org.apache.tomcat.embed</groupId>
    		<artifactId>tomcat-embed-jasper</artifactId>
    </dependency>
    ```
    
    - JSTL 의존성
    
    ```xml
    <dependency>
    		<groupId>javax.servlet</groupId>
    		<artifactId>jstl</artifactId>
    </dependency>
    ```
    
    - 편하게 개발에 집중할 수 있도록 도움을 줌
    - 캐시를 사용하여 성능을 올려주고 파일 저장시(파일 변경시) 자동 재시작 기능
    
    ```xml
    <dependency>
    		<groupId>org.springframework.boot</groupId>
    		<artifactId>spring-boot-devtools</artifactId>
    </dependency>
    ```
    
- application.properties 설정
    - 서버 포트 설정
        - server.port = 8081
    - view 이름으로부터 사용할 view 오브젝트 매핑 설정 view resolver 설정
        - spring.mvc.view.prefix=/WEB-INF/views/
        - spring.mvc.view.suffix=.jsp
    - context path 설정
        - server.servlet.context-path=/app

프로젝트 DB설계 ERD..

로드맵 작성
