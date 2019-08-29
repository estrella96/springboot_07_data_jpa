# Spring BOOT data_access 整合JPA

## 整合jpa

- JPA: ORM(Object Relational Mapping)
- 使用
 1 编写一个实体类Bean和数据表进行映射 配置好映射关系 entity/User.class
```java
//使用JPA注解配置映射关系
@Entity //告诉JPA这是一个实体类
@Table(name="user")//指定和哪一个表映射 如果省略默认是表名小写
public class User {

    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private  Integer id;
    @Column(name = "last_name",length = 50)
    private String lastName;//和数据表对应的列
    @Column
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
```
 2 编写一个Dao接口来操作实体类对应的数据表
```java
//继承JpaRepository完成对数据库的操作
public interface UserRepository extends JpaRepository<User,Integer>{
}
```
 3 基本配置
```yaml
spring:
  jpa:
    hibernate:
#    更新或创建数据表
      ddl-auto: update
#      控制台显示sql
    show-sql: true
```
 4 
 
