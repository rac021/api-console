
# Software development life cycle ( SDLC )

![development_lifecycle](https://cloud.githubusercontent.com/assets/7684497/19013548/3ad9feb2-87d4-11e6-87e5-a82360c34e79.jpg)

-------------------------------------------------------------------

## REST- API

```

 Resource               /planes:
  
 Verbes                   get:
                          post:
                          put:
                          patch:
                          delete:
      
 Identifiant             /planes/{id}:
                           get:
                           post:
                           put:
                           patch:
                           delete:
    
 Résultat                responses:
                          200:
                            body:
                              application/json:
                                example: |
                                  {
                                    "B-777" : "Hello World"
                                  }

```

-------------------------------------------------------------------

# REST API Interface complexity

![rest-api](https://cloud.githubusercontent.com/assets/7684497/19013725/5b7d8d1e-87d9-11e6-864c-d5314a229b68.jpg)

-------------------------------------------------------------------

## [Spec Driven Development](https://www.mikestowe.com/blog/2014/11/what-is-spec-driven-development.php)

Spec Driven Development consists on creating concise spec that can be used to describe your application’s interactions in a pragmatic way... [ more ](https://www.mikestowe.com/blog/2014/11/what-is-spec-driven-development.php)

  * Contexte :

   * Contract First : Documentation before code
  
   * Documentation managed as source code

   * Human readable docmentation


-------------------------------------------------------------------

#RAML

![sdd](https://cloud.githubusercontent.com/assets/7684497/18411385/a57107c0-7776-11e6-9aac-942499f7055b.png)

## [RAML-SPEC ](https://github.com/raml-org/raml-spec/tree/master/versions)

Restful API Modeling Language

RAML™ is a YAML-based language that describes RESTful APIs. Together with the YAML specification, this specification provides all the information necessary to describe RESTful APIs; to create API client-code and API server-code generators; and to create API user documentation from RAML API definitions... [ more ](https://github.com/raml-org/raml-spec/tree/master/versions)

![raml](https://cloud.githubusercontent.com/assets/7684497/18411352/0aa64a20-7776-11e6-8567-ffb51f2c163f.png)

-------------------------------------------------------------------

## [RAML- Tutorial](http://raml.org/developers/raml-200-tutorial)

   http://raml.org/developers/raml-200-tutorial

```
/songs:
  description: Collection of available songs in Jukebox
  get:
    description: Get a list of songs based on the song title.
    queryParameters:
      songTitle:
        description: "The title of the song to search "
        required: true
        minLength: 3
        type: string
        example: "Get L"
    responses:
      200:
        body:
          application/json:
            example: |
              "songs": [
                  {
                    "songId": "550e8400-e29b-41d4-a716-446655440000",
                    "songTitle": "Get Lucky"
                  },
                  {
                    "songId": "550e8400-e29b-41d4-a716-446655440111",
                    "songTitle": "Loose yourself to dance"
                  },
                  {
                    "songId": "550e8400-e29b-41d4-a716-446655440222",
                    "songTitle": "Gio sorgio by Moroder"
                  }
                  ]
  /{songId}:
    description: Song entity
    get:
      description: Get the song with `songId = {songId}`
      responses:
        200:
          body:
            application/json:
              example: |
                {
                  "songId": "550e8400-e29b-41d4-a716-446655440000",
                  "songTitle": "Get Lucky",
                  "duration": "6:07",
                  "artist": {
                    "artistId": "110e8300-e32b-41d4-a716-664400445500"
                    "artistName": "Daft Punk",
                    "imageURL": "http://travelhymns.com/random-access-memories1.jpg"
                  },
                  "album": {
                    "albumId": "183100e3-0e2b-4404-a716-66104d440550",
                    "albumName": "Random Access Memories",
                    "imageURL": "http://upload.wikimedia.org/Random_Access_Memories.jpg"
                  }
                }
        404:
          body:
            application/json:
              example: |
                {"message": "Song not found"}
    /file-content:
      description: The file to be reproduced by the client
      get:
        description: Get the file content
        responses:
          200:
      post:
  post:
  
```

-------------------------------------------------------------------

# 1) Writing Spec (  creating RAML files ) :


## [api-designer](https://github.com/mulesoft/api-designer)

 
```
❯   npm install -g api-designer

    api-designer
    
```
  
## [Atom + api-workbench](https://atom.io/packages/api-workbench)


![atome_api-workench](https://cloud.githubusercontent.com/assets/7684497/18092803/07ad9fea-6ece-11e6-8704-bba0cfed66cb.png)

-------------------------------------------------------------

# 2) Generate documentation : 

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

```
❯    http://localhost:9000/index.html?raml=apis/simple.raml 
     
```


<ol>  <i> 2. Using Docker Volume</i></ol>


```
❯    docker run --name my-api-console_1 -p 9000:9000 -d -v $(pwd)/raml-files:/data/dist/apis api-console

```


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


# 3) Simulate API


# [osprey-mock-service](https://github.com/mulesoft-labs/osprey-mock-service)  

  Generate an API mock service from a RAML definition using Osprey.

```
❯     osprey-mock-service -f simple.raml -p 8000 --cors

      osprey-mock-service -f raml-files/planes/api-plane.raml -p 8000 --cors
      
```  
# 4) Validate Spec

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

     ----------------------------------------------------------------------
     
     raml-mockup raml-files/planes/api-plane.raml -p 8000 -w
     
     abao raml-files/planes/api-plane.raml --server http://localhost:8000
     
     ----------------------------------------------------------------------
     
```  

# 5) BUILD

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
raml-php-generator raml-files/planes/api-plane.raml -o api-client-php

```


```

<?php

namespace SampleApi                     ;

require_once "vendor/autoload.php"      ;

const TEMPLATE_REGEXP = '/{([^{}]+)}/'  ;

use GuzzleHttp\Psr7\Request; use GuzzleHttp\Client as HttpClient        ;

$options = [
'baseUri' => 'http://localhost:8080/raml-planes-api/resources/planes' ] ;

$client = new Client($options)                                          ;

$planes = $client->resources->planes->get(null, $options)->getBody()    ;

$planeByID = $client->resources->planes->id(10)->get(null, $options)->getBody() ;

echo "\n"                                                  ;
echo " All Planes : ----------------------------- "        ;
echo "\n \n"                                               ;
echo "  $planes "                                          ;
echo "\n \n"                                               ;
echo " Plane by ID : ----------------------------- "       ;
echo "\n \n "                                              ;
echo "  $planeByID "                                       ;
echo "\n \n"                                               ;
echo " ------------------------------------------ "        ;

?>

```

-----------------------------------------------------------

# [Microrest.php](https://github.com/marmelab/microrest.php) ( PHP HTTP server )

Microrest is a Silex provider to setting up a REST API on top of a relational database, based on a 
YAML (RAML) configuration file... [more](http://marmelab.com/blog/2015/01/05/introducing-microrest-raml-api-in-silex.html)

-----------------------------------------------------------

## Features :

# [RAML-Merge](https://github.com/mikestowe/php-ramlMerge)

RAML Merge lets you merge in any included RAML files (!include) into a single RAML file via the command line.

```
❯     php ramlMerge.php raml-files/planes/api-plane.raml > api-plane-full.raml

```

-------------------------------------------------------------------

## [RAML - SWAGGER : Pros and Cons](http://nordicapis.com/top-specification-formats-for-rest-apis)

    * Swagger

       - Pros: Heavily adopted, large community of users and supporters, support multiple languages
       - Cons: Lacks advanced constructs for metadata
    
    * RAML

       - Pros: Supports advanced constructs, decent adoption, human readable format, high industry backing
       - Cons: Lacks code-level tooling, still unproven long-term
       
       
