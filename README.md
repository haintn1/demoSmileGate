### **iCommerce**

1/ **Software development principles**<br/>
`Project use Spring boot framwork with singleton pattern`<br/>

2/ **Code structure**<br/>
`configuration` - all configuration of project<br/>
`constant` - interface common<br/>
`controller` - request and response api <br/>
`converter` - file convert from data to model and opposite<br/>
`dto` - file data transfer<br/>
`entity` - table in database<br/>
`facade` - convert layer<br/>
`repository` - persistent layer<br/>
`service` - business layer<br/>
`Project use elastic search v7.14.0 library and b2b platform`<br/>

3/ **Start project**<br/>
`Step 1: Start demo project`<br/>
`clone source in coding repository`<br/>
`cd coding folder`<br/>
`mvn clean install`<br/>
`mvn spring-boot:run`<br/>
`Step 2: Start b2b platform`<br/>
`clone source in search repository`<br/>
`cd b2bcore`<br/>
`mvn clean install`<br/>
`cd searchcustomapi`<br/>
`mvn spring-boot:run`<br/>
`Step 3: Install Elastic Search 7.14.0`<br/>
`For Windows: https://www.elastic.co/guide/en/elasticsearch/reference/current/zip-windows.html`<br/>
`For Linux: https://www.elastic.co/guide/en/elasticsearch/reference/current/targz.html`<br/>

4/ **Full CURL commands to verify the APIs**<br/>

`Add product`<br/>
`curl --location --request POST 'http://localhost:8088/product' \
--header 'accept: application/json, text/plain, */*' \
--header 'accept-language: en-US,en;q=0.9,vi;q=0.8' \
--header 'content-type: application/json' \
--header 'sec-ch-ua: "Chromium";v="106", "Google Chrome";v="106", "Not;A=Brand";v="99"' \
--header 'sec-ch-ua-mobile: ?0' \
--header 'sec-ch-ua-platform: "Windows"' \
--header 'sec-fetch-dest: empty' \
--header 'sec-fetch-mode: cors' \
--header 'sec-fetch-site: same-origin' \
--header 'user-agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36' \
--data-raw '{
    "id" : 1,
    "name": "Product 161022",
    "sku": "product-161022-4",
    "type": 1,
    "cost": "1",
    "price": "12",
    "branch_id": "brand22",
    "colour": "black",
    "description": "<p>123</p>",
    "categories": [
        "2","1"
    ],
    "variations": [],
    "uom": "PC"
}'`<br/>

`Add to cart`<br/>
`curl --location --request POST 'http://localhost:8088/add-to-cart' \
--header 'accept: application/json' \
--header 'accept-language: en-US,en;q=0.9,vi;q=0.8' \
--header 'cache-control: max-age=0' \
--header 'content-type: application/json' \
--header 'sec-ch-ua: "Chromium";v="106", "Google Chrome";v="106", "Not;A=Brand";v="99"' \
--header 'sec-ch-ua-mobile: ?0' \
--header 'sec-ch-ua-platform: "Windows"' \
--header 'sec-fetch-dest: empty' \
--header 'sec-fetch-mode: cors' \
--header 'sec-fetch-site: same-origin' \
--header 'user-agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36' \
--data-raw '{
    "checkout_id": "",
    "customer_id": "",
    "line_items": [
        {
            "quantity": 1,
            "product_id": "1",
            "fixed_price": "90"
        }
    ]
}'`<br/>

`Add category`<br/>
`curl --location --request POST 'http://localhost:8088/category' \
--header 'accept: application/json, text/plain, */*' \
--header 'accept-language: en-US,en;q=0.9,vi;q=0.8' \
--header 'content-type: application/json' \
--header 'sec-ch-ua: "Chromium";v="106", "Google Chrome";v="106", "Not;A=Brand";v="99"' \
--header 'sec-ch-ua-mobile: ?0' \
--header 'sec-ch-ua-platform: "Windows"' \
--header 'sec-fetch-dest: empty' \
--header 'sec-fetch-mode: cors' \
--header 'sec-fetch-site: same-origin' \
--header 'user-agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36' \
--data-raw '{
    "category_description" : "Description 1",
    "category_name": "Category 1"    
}'`<br/>

`Index Product`<br/>
`curl --location --request POST 'http://localhost:8088/products/index' \
--header 'accept: application/json, text/plain, */*' \
--header 'accept-language: en-US,en;q=0.9,vi;q=0.8' \
--header 'content-length: 0' \
--header 'sec-ch-ua: "Chromium";v="106", "Google Chrome";v="106", "Not;A=Brand";v="99"' \
--header 'sec-ch-ua-mobile: ?0' \
--header 'sec-ch-ua-platform: "Windows"' \
--header 'sec-fetch-dest: empty' \
--header 'sec-fetch-mode: cors' \
--header 'sec-fetch-site: same-origin' \
--header 'user-agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36'`<br/>

`Search Product`<br/>
`curl --location --request GET 'http://localhost:8088/products/search?query=%3A&currentPage=0&pageSize=10&customerGroupId=' \
--header 'accept: */*' \
--header 'accept-language: en-US,en;q=0.9,vi;q=0.8' \
--header 'sec-ch-ua: "Chromium";v="106", "Google Chrome";v="106", "Not;A=Brand";v="99"' \
--header 'sec-ch-ua-mobile: ?0' \
--header 'sec-ch-ua-platform: "Windows"' \
--header 'sec-fetch-dest: empty' \
--header 'sec-fetch-mode: cors' \
--header 'sec-fetch-site: same-origin' \
--header 'user-agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36'`<br/>

`Filter Product`<br/>
`curl --location --request GET 'http://localhost:8088/products/search?query=%3A%3AcategoryNames%3ACategory+1%3A&%3A%3Acolour%3Ablack%3A&currentPage=0&pageSize=10&customerGroupId=' \
--header 'accept: */*' \
--header 'accept-language: en-US,en;q=0.9,vi;q=0.8' \
--header 'sec-ch-ua: "Chromium";v="106", "Google Chrome";v="106", "Not;A=Brand";v="99"' \
--header 'sec-ch-ua-mobile: ?0' \
--header 'sec-ch-ua-platform: "Windows"' \
--header 'sec-fetch-dest: empty' \
--header 'sec-fetch-mode: cors' \
--header 'sec-fetch-site: same-origin' \
--header 'user-agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36'`<br/>
