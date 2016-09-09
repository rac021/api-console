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


