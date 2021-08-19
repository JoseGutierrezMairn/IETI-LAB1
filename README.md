<img align="right" src="https://github.com/ada-school/module-template/blob/main/ada.png">


## Spring Boot Rest API

**Learning Objectives**

- Explain what needs to be donde to achieve the Level 2 on a  RESTFUL API on the Richardson Maturity Model.
- Implement a Level 2 Users RESTFUL API Microservice.
- Implement a Level 2 Tasks RESTFUL API Microservice.
-  User dependencies injections to create a decoupled architecture.


## Growth Mindset 🤹🏽

"Individuals who believe their talents can be developed (through hard work, good strategies, and input from others) have a growth mindset. They tend to achieve more than those with a more fixed mindset (those who believe their talents are innate gifts)" [What Having a "Growth Mindset" Actually means - Harvard Business Review](https://hbr.org/2016/01/what-having-a-growth-mindset-actually-means)  


**Main Topics**
* Microservices.
* RESTFUL API.
* Richardson Maturity Model.
* Dependencies Injection.

## Codelab 🧪

🗣️ "I hear and I forget I see and I remember I do and I understand." Confucius

### Part 1: Implementing the Users Microservice RESTFUL API

1. Create a new project using the [Spring Initializr](https://start.spring.io/)
 * Use either *Java* or *Kotlin* as programming language.
 * Use Gradle as project option(if your computer is slow then use  Maven)
 * Add Spring Web dependencie before generating the project.
2. Create a new repository on Github and commit the files generated in 1.
3. Create a new package called *dto* and inside define your *User* object with at least the following fields:
 * name.
 * email.
 * lastName.
 * created.
4. Create a new package called *data* and inside define your *User* data object with at least the following fields:
 * id.
 * name.
 * email.
 * lastName.
 * created.
5. Create a new package called *service* an inside create the following interface:

**Java:**
 ```java
     public interface UserService
     {
         User create( User user );

         User findById( String id );
         
         Page<User> all();

         void deleteById( String id );

         User update( User user, String userId );
     }
  ```
  **Kotlin:**
  ```kotlin
      interface UserService {

         fun create( user: User): User

         fun findById( String id ): User?
         
         fun  all(): Page<User>

         fun deleteById( String id )

         fun update( User user, String userId ): User

      }
  ```
6. Implement the UserService using a HashMap data structure inside.
7. Make your service implementation *UserServiceHashMap* injectable using the *@Service* annotation.
8. Create a new package called *controller* and create a new class *UserController*
9. Annotate your *UserController* so it becomes a REST Controller:

**Java:**
 ```java
   @RestController
   @RequestMapping( "/user" )
   public class UserController
   {
   }
  ```
  **Kotlin:**
  ```kotlin
   @RestController
   @RequestMapping( "/user" )
   class UserController()
   {
   }
  ```



