
# Software development life cycle ( SDLC )

![development_lifecycle](https://cloud.githubusercontent.com/assets/7684497/19013548/3ad9feb2-87d4-11e6-87e5-a82360c34e79.jpg)

-------------------------------------------------------------------

# REST API Interface complexity

![rest-api](https://cloud.githubusercontent.com/assets/7684497/19013725/5b7d8d1e-87d9-11e6-864c-d5314a229b68.jpg)

-------------------------------------------------------------------

#RAML

![sdd](https://cloud.githubusercontent.com/assets/7684497/18411385/a57107c0-7776-11e6-9aac-942499f7055b.png)

-------------------------------------------------------------------

## [RAML-SPEC](https://github.com/raml-org/raml-spec/blob/master/versions/raml-08/raml-08.md)


-------------------------------------------------------------------

![raml](https://cloud.githubusercontent.com/assets/7684497/18411352/0aa64a20-7776-11e6-8567-ffb51f2c163f.png)


# Writing Spec (  creating RAML files ) :


## [api-designer](https://github.com/mulesoft/api-designer)

 
```
❯    npm install -g api-designer

    api-designer
    
```
  
## [Atom + api-workbench](https://atom.io/packages/api-workbench)


![atome_api-workench](https://cloud.githubusercontent.com/assets/7684497/18092803/07ad9fea-6ece-11e6-8704-bba0cfed66cb.png)

-------------------------------------------------------------

# Generate documentation : 

# [api-console](https://github.com/mulesoft/api-console)

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

     http://localhost:9000/index.html?raml=apis/planes/api-plane.raml

```

# [raml2html](https://github.com/raml2html/raml2html) 

  A simple RAML to HTML documentation generator, written for Node.js

```
❯     raml2html -i simple.raml -o example.html
      raml2html -i raml-files/planes/api-plane.raml -o api-plane-doc.html
      
```  


# Simulate API


# [osprey-mock-service](https://github.com/mulesoft-labs/osprey-mock-service)  

  Generate an API mock service from a RAML definition using Osprey.

```
❯     osprey-mock-service -f simple.raml -p 8000 --cors

      osprey-mock-service -f raml-files/planes/api-plane.raml -p 8000 --cors
      
```  
# Validate Spec

# [abao](https://github.com/cybertk/abao)  

  **Abao** is a command-line tool for testing API documentation written in RAML format.

```
❯     abao simple.raml --server http://localhost:8000/v1
      
      abao raml-files/planes/api-plane.raml --server http://localhost:8000/v1
      
```    
 

# [raml-mockup](https://github.com/gextech/raml-mockup) ( BONUS )

  https://www.npmjs.com/package/raml-mockup

```
❯    raml-mockup simple.raml -p 5000 -w

     raml-mockup raml-files/planes/api-plane.raml -p 5000 -w

```  
#BUILD

## JAVA

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

## Deploy webService using maven project including RAML to JAX-RS plugin


```
   http://localhost:8080/raml-planes-api/resources/planez

   http://localhost:8080/raml-planes-api/resources/planez/10

```


## PHP - CLI 

### [RAML PHP Client Generator](https://github.com/jays-de/raml-php-generator)

CLI example generated for [api-plane.raml](https://github.com/rac021/raml/blob/master/raml-files/planes/api-plane.raml)

```

<?php

namespace SampleApi;

require_once "vendor/autoload.php" ;

const TEMPLATE_REGEXP = '/{([^{}]+)}/';

use GuzzleHttp\Psr7\Request; use GuzzleHttp\Client as HttpClient;

$options = [
'baseUri' => 'http://localhost:8080/raml-planes-api/resources/planes' ] ;

$client = new Client($options);

$planes = $client->resources->planes->get(null, $options)->getBody() ;

$planeByID = $client->resources->planes->id(10)->get(null, $options)->getBody() ;

echo "\n" ;
echo " All Planes : ----------------------------- " ;
echo "\n \n" ;
echo "  $planes " ;
echo "\n \n" ;
echo " Plane by ID : ----------------------------- " ;
echo "\n \n " ;
echo "  $planeByID " ;
echo "\n \n" ;
echo " ------------------------------------------ " ;

?>

```

## Features :

# [RAML-Merge](https://github.com/mikestowe/php-ramlMerge)

RAML Merge lets you merge in any included RAML files (!include) into a single RAML file via the command line.

```
❯     php ramlMerge.php raml-files/planes/api-plane.raml > api-plane-full.raml

```
