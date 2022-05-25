# Java Lab


### 문자열 계산기 
#### 2022.05.25

- Java 11
- Junit5

---

#### 문자열 계산기 만들기 

### 요구사항
  1) 문자를 구분자(, :)로 구분해서 분리하고 각 숫자의 합을 구해라 (ex : "1,2" -> 2, "1,2:3" -> 6)
  2) 빈문자열, null 값이 들어오면 0 호출
  3) 음수를 전달하면 RuntimeException 예외 처리
  4) 커스텀 구분자 사용 가능 (ex : "//;\n1;2;3" -> 6 "//"과 "\n" 사이 들어간 문자를 구분자로 사용)


### 추가 

- 메소드는 한 가지 책임만
- else 사용 금지
- 인덴트 지키기