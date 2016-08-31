# api-console

* **Build Image**
 
```
❯     docker build -t api-console .

```
* **Run**

<ol>  <B> 1. Default</B></ol>


```
❯     docker build -t api-console .

```

<ol>  <B> 2. Using Simple file</B></ol>


```
❯     http://localhost:9000/index.html?raml=apis/simple.raml 

```

<ol>  <B> 3. Using Docker Volume</B></ol>


```
❯   docker run --name my-api-console_1 -p 9000:9000 -d -v $(pwd)/raml-files:/data/dist/apis api-console

```

* **Test**

<ol>  <B> 1. Using Simple file</B></ol>
 
```
❯     http://localhost:9000/index.html?raml=apis/simple.raml 

```

<ol>  <B> 1. Using Docker Volume</B></ol>
 
```
❯     http://localhost:9000/index.html?raml=apis/simple.raml 

```
 
 
-------------------------------------------------------------

# [Atom + api-workbench](https://atom.io/packages/api-workbench)

### For creating RAML files

![atome_api-workench](https://cloud.githubusercontent.com/assets/7684497/18092803/07ad9fea-6ece-11e6-8704-bba0cfed66cb.png)


-------------------------------------------------------------

# [raml-mockup](https://www.npmjs.com/package/raml-mockup)

# [osprey-mock-service](https://github.com/mulesoft-labs/osprey-mock-service)  

  Generate an API mock service from a RAML definition using Osprey.

```
❯     osprey-mock-service -f simple.raml -p 8000

```  
  


