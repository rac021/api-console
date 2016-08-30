# api-console

```
❯     docker build -t api-console .

      docker run --name my-api-console -p 9000:9000 -d api-console
 
      http://localhost:9000/index.html?raml=apis/simple.raml 
      
```
 
-------------------------------------------------------------

# [Atom + api-workbench](https://atom.io/packages/api-workbench)

### For creating RAML files

![atome_api-workench](https://cloud.githubusercontent.com/assets/7684497/18092803/07ad9fea-6ece-11e6-8704-bba0cfed66cb.png)


-------------------------------------------------------------

# [osprey-mock-service](https://github.com/mulesoft-labs/osprey-mock-service)  

  Generate an API mock service from a RAML definition using Osprey.

```
❯     osprey-mock-service -f simple.raml -p 8000

```  
  


