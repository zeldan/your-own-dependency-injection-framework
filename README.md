# your-own-dependency-injection-framework

![Build Status](https://github.com/zeldan/your-own-dependency-injection-framework/actions/workflows/maven.yml/badge.svg)

This is a small project that demonstrates how to build your own dependency injection framework. 

It supports **constructor** and **field** injection.

- The framework itself can be found under the "com.di.framework" package.
- Sample applications are available under the tests.

### How to use

##### 1. Define how you want to map interfaces to their implementations.

```java
public class DependencyInjectionConfig extends AbstractModule {
    
    @Override
    public void configure() {
        createMapping(GreetingService.class, WelcomeServiceImpl.class);
        createMapping(Logger.class, QuietLoggerImpl.class);
    }
}
```

##### 2. Add **@OwnInject** annotation to the constructor or fields.

```java
public class ConstructorInjectionClient {
    
    private final GreetingService service;
    private final Logger logger;
    
    @OwnInject
    public ConstructorInjectionClient(final GreetingService service, final Logger logger) {
        this.service = service;
        this.logger = logger;
    }
}
```

OR

```java
public class FieldInjectionClient {
    
    @OwnInject
    private GreetingService service;
    
    @OwnInject
    private Logger logger;

}
```

##### 3. Use **OwnDi** to get your injected class.

```java
public class SampleAppToTryDependencyInjection {
    
    public static void main(final String[] args) throws Exception {
        final OwnDiFramework ownDi = OwnDi.getFramework(new DependencyInjectionConfig());
        final ConstructorInjectionClient constructorInjectionClient = (ConstructorInjectionClient) ownDi.inject(ConstructorInjectionClient.class);
    }

}
```

### How It Works

The two main classes are **AbstractModule** and **OwnDiFramework**.
 
* **AbstractModule** contains interfaces with their implementations (subclasses).
* **OwnDiFramework** performs the injection via Java reflection. It checks that the constructor or fields are annotated with the **@OwnInject** annotation.
 

### Running Tests

To execute tests, use the Maven Wrapper included in the project. Run the following command from the root directory of the project:

```sh
./mvnw test
```

This command will compile the project with Java 21 and run all the tests using JUnit.

If you encounter any issues or have any questions, please refer to the documentation or reach out for support.