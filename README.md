# api-console

* **Build Image**
 
```
❯    docker build -t api-console .

```
* **Run**

<ol>  <i> 1. Default</i></ol>


```
❯    docker build -t api-console .

```

<ol>  <i> 2. Using Simple file</i></ol>


```
❯    http://localhost:9000/index.html?raml=apis/simple.raml 

```

<ol>  <i> 3. Using Docker Volume</i></ol>


```
❯    docker run --name my-api-console_1 -p 9000:9000 -d -v $(pwd)/raml-files:/data/dist/apis api-console

```

* **Test**

<ol>  <i> 1. Using Simple file</i></ol>
 
```
❯    http://localhost:9000/index.html?raml=apis/simple.raml 

```

<ol>  <i> 1. Using Docker Volume</i></ol>
 
```
❯    http://localhost:9000/index.html?raml=apis/planes.raml 

```
 
-------------------------------------------------------------

# [Atom + api-workbench](https://atom.io/packages/api-workbench)

### For creating RAML files

![atome_api-workench](https://cloud.githubusercontent.com/assets/7684497/18092803/07ad9fea-6ece-11e6-8704-bba0cfed66cb.png)


-------------------------------------------------------------

# [raml-mockup](https://www.npmjs.com/package/raml-mockup)

```
❯     raml-mockup simple.raml -p 5000 -w

```  

# [osprey-mock-service](https://github.com/mulesoft-labs/osprey-mock-service)  

  Generate an API mock service from a RAML definition using Osprey.

```
❯     osprey-mock-service -f simple.raml -p 8000 -w
      
```  
  


