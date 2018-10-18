<h1>Spring Autowire Component Scan</h1>

<h3>pom.xml</h3>

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-core</artifactId>
    <version>5.1.1.RELEASE</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.1.1.RELEASE</version>
</dependency>
``` 

<h3>Add annotation to your components and autowire</h3>

```java
@Component
public class Person {

    @Autowired
    private Location location;

    public void printPerson(){
        System.out.println("Name:Alpar age:42 location:"+location.getLocation());
    }
}
```

<h3>ApplicationConfigutation.java</h3>

```java
@Configuration
@ComponentScan(basePackages = "com.pethoalpar")
public class AppConfig {
}
```

<h3>Main.java</h3>

```java
public class Main {

    public static void main(String [] args){

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Person person = context.getBean(Person.class);
        person.printPerson();
    }
}
```
