# practice for java_spring

##### 2020.08.04
- STS(Spring Tool Suite) 설치

- DI(Dependency Infection)
    - xml에 스프링 프로퍼티 설정
        ```
            // MyInfo에 setter가 존재해야한다.
            <bean id="myInfo" class="com.javalec.ex.MyInfo">
                // 기초 데이터
                <property name="name">
                    <value>chae</value>
                </property>

                <property name="age">
                    <value>27</value>
                </property>

                // List 타입
                <property name="hobbys">
                    <list>
                        <value>헬스</value>
                        <value>독서</value>
                        <value>코딩</value>
                    </list>
                </property>
                
                // 다른 bean객체 참조
                <property>
                    // reference 참조
                    <ref bean="bmiCalculator">
                </property>
            </bean>
        ```
    