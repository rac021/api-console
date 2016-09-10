# api-console

* **Build Image**
 
```
❯    docker build -t api-console .

```
* **Run**


<ol>  <i> 1. Using Simple file <a href="https://github.com/rac021/api-console/blob/master/simple.raml">simple.raml</a></i></ol>

```
❯    docker run --name my-api-console_1 -p 9000:9000 -d  api-console

```

<ol>  <i> 2. Using Docker Volume</i></ol>


```
❯    docker run --name my-api-console_1 -p 9000:9000 -d -v $(pwd)/raml-files:/data/dist/apis api-console

```

* **Test**

<ol>  <i> 1. Using Simple file <a href="https://github.com/rac021/api-console/blob/master/simple.raml">simple.raml</a></i></ol>
 
```
❯    http://localhost:9000/index.html?raml=apis/simple.raml 

```

<ol>  <i> 2. Using Docker Volume <a href="https://github.com/rac021/api-console/blob/master/raml-files/planes.raml">planes.raml</a> </i></ol>
 
```
❯    http://localhost:9000/index.html?raml=apis/planes.raml 

```
 
-------------------------------------------------------------

# [Atom + api-workbench](https://atom.io/packages/api-workbench)

### For creating RAML files

![atome_api-workench](https://cloud.githubusercontent.com/assets/7684497/18092803/07ad9fea-6ece-11e6-8704-bba0cfed66cb.png)


-------------------------------------------------------------


# [raml2html](https://github.com/raml2html/raml2html) 

  A simple RAML to HTML documentation generator, written for Node.js

```
❯     raml2html -i simple.raml -o example.html

```  

# [raml-mockup](https://github.com/gextech/raml-mockup) 

  https://www.npmjs.com/package/raml-mockup

```
❯     raml-mockup simple.raml -p 5000 -w

```  

# [osprey-mock-service](https://github.com/mulesoft-labs/osprey-mock-service)  

  Generate an API mock service from a RAML definition using Osprey.

```
❯     osprey-mock-service -f simple.raml -p 8000 --cors
      
```  


# [abao](https://github.com/cybertk/abao)  

  **Abao** is a command-line tool for testing API documentation written in RAML format.

```
❯     abao simple.raml --server http://localhost:8000/v1
      
```    

# [Maven Plugin ( raml for jax-rs )](https://github.com/mulesoft/raml-for-jax-rs/blob/master/maven-plugin.md)  

  Maven plug-in generates JAX-RS annotated interfaces and supporting classes based on one or multiple RAML files

## RAML to JAX-RS

```
   <plugin>
    <groupId>org.raml.plugins</groupId>
    <artifactId>raml-jaxrs-maven-plugin</artifactId>
    <version>1.3.4</version>
    <configuration>
        <!-- Use sourcePaths if you want to provide a single RAML file or a list of RAML files -->
        <sourceDirectory>${basedir}/raml</sourceDirectory>
        <!-- Optionally configure outputDirectory if you don't like the default value: --> 
        <!-- ${project.build.directory}/generated-sources/raml-JAX-RS -->
        <!-- Replace with your package name -->
        <basePackageName>com.acme.api</basePackageName>
        <!-- Valid values: 1.1 2.0 -->
        <jaxrsVersion>2.0</jaxrsVersion>
        <useJsr303Annotations>false</useJsr303Annotations>
        <!-- Valid values: jackson1 jackson2 gson none -->
        <jsonMapper>jackson2</jsonMapper>
        <removeOldOutput>true</removeOldOutput>
        <!-- Optionally set extensions to a list of fully qualified names of classes
        that implement org.raml.jaxrs.codegen.core.ext.GeneratorExtension -->
        <!-- for example:
        <extensions>
            <param>com.abc.AuthorizationAnnotationExtension</param>
            <param>com.abc.ParameterFilterExtension</param>
        </extensions>
        Custom annotator for json schema to pojo convertor
        <customAnnotator>com.abc.MyCustomAnnotator</customAnnotator>
        -->
    </configuration>
    <executions>
        <execution>
            <goals>
                <goal>generate</goal>
            </goals>
            <phase>generate-sources</phase>
        </execution>
    </executions>
</plugin>

```    


## JAX-RS to RAML

```

<plugin>
    <groupId>org.raml.plugins</groupId>
    <artifactId>jaxrs-raml-maven-plugin</artifactId>
    <version>1.3.4</version>
    <configuration>
        <sourcePaths>
            <param>${basedir}/src/main/java/contacts/Contact.java</param>
            <param>${basedir}/src/main/java/contacts/ContactAttrs.java</param>
            <param>${basedir}/src/main/java/contacts/Contacts.java</param>
        </sourcePaths>
        <sourceDirectory>${basedir}/src/main/java</sourceDirectory>
        <outputFile>${project.build.directory}/generated-sources/jaxrs-raml/example.raml</outputFile>
        <removeOldOutput>true</removeOldOutput>
    </configuration>
    <executions>
        <execution>
            <goals>
                <goal>generate-raml</goal>
            </goals>
            <phase>process-classes</phase>
        </execution>
    </executions>
</plugin>


```    
