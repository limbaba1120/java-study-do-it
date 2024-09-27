## 01. 객체 간의 상속?
### 클래스 상속
- 새로운 클래스를 정의 할 때 이미 구현된 클래스를 상속 받아서 속성이나 기능을 확장하여 클래스를 구현함
- 이미 구현된 클래스보다 더 구체적인 기능을 가진 클래스를 구현해야 할 때 기존 클래스를 상속함
- 자바는 단일 상속만을 지원 -> 여러가지 클래스를 상속받으면 모호해진다
- extends 키워드 뒤에는 단 하나의 클래스를 올 수 있음
### 상속 구현 하는 경우
- 상위 클래스는 하위 클래스 보다 더 일반적인 개념과 기능을 가짐
- 하위 클래스는 상위 클래스 보다 더 구체적인 개념과 기능을 가짐
- 하위 클래스가 상위 클래스의 속성과 기능을 확장 (extends)한다는 의미
## 02. 상속을 활용한 멤버십 클래스 구현하기
### 일반 고객 클래스 구현
- 고객의 속성: 고객 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립비율
- 일반 고객의 경우 물품 구매시 1%의 보너스 포인트 적립

## 03.상속에서 클래스 생성 과정과 형 변환
### 하위 클래스가 생성 되는 과정
- 하위 클래스를 생성하면 상위 클래스가 먼저 생성됨
- new VIPCustomer()를 호출하면 Customer()가 먼저 호출 됨
- 클래스가 상속 받은 경우 하위 클래스의 생성자에서 반드시 상위 클래스의 생성자를 호출함

### Super
- 하위 클래스에서 가지는 상위 클래스에 대한 참조값
- super()는 상위 클래스의 기본 생성자를 호출 함
- 하위 클래스에서 명시적으로 상위 클래스의 생성자를 호출하지 않으면 super()가 호출
- 상위 클래스의 기본 생성자가 없는 경우 하위 클래스에서는 생성자에서는 super를 이용해 ㅇ명시적으로 상위 클래스의 생성자 호출
### 형 변환
```
Customer customerLee = new VIPCustomer(); // 상위 클래스로 변수를 선언하고 하위 클래스의 생성자로 인스턴스 생성
```

## 04. 메서드 재정의하기 (overiding)
### 하위 클래스에서 메서드 재정의 하기
- 오버라이딩 : 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우 하위 클래스에서 동일한 이름의  메서드를 재정의 할 수 있음
- VIP Customer 클래스의 calPrice()는 할인율이 적용되지 않음
- 재정의 하여 구현해야함