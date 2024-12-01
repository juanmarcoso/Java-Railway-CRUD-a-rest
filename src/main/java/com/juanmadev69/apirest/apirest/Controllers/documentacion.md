# What are HTTP methods?
### The Postman Team
<sub>August 3, 2023</sub>

**HTTP methods are used to indicate the action an API client would like to perform on a given resource. Each HTTP method maps to a specific operation, such as creating, reading, updating, or deleting a resource, and an HTTP method must be included with every request to a REST API.**

Here, we’ll give a high-level overview of HTTP and explain how it is related to REST APIs. We’ll also review the most common HTTP methods—and explain which ones are safe and idempotent.

## What is HTTP, and how is it related to REST?

HTTP, which stands for Hypertext Transfer Protocol, is the dominant protocol for transmitting data—such as HTML pages, images, and videos—between clients and servers on the internet. It operates on a request-response model, in which the client sends a request to the server, and the server responds with the requested data or an error message. HTTP is stateless, which means that the server handles each request independently—without any knowledge of previous requests.

REST (Representational State Transfer) is the most commonly used architectural style for building web services and APIs, and it emphasizes standardized, stateless interactions between clients and servers. REST APIs are designed around resources, which are accessible via unique API endpoints. These characteristics make HTTP the ideal choice for implementing RESTful principles. HTTP methods are critical components of requests to REST APIs, as they enable clients to specify the action they’d like to perform on a given resource. In fact, it is not possible to send a request to a REST API without an HTTP method.

## What are the most common HTTP methods?

HTTP methods enable API clients to perform CRUD (Create, Read, Update, and Delete) actions on an API’s resources in a standardized and predictable way. The most commonly used HTTP methods are:

### GET

The GET method is used to retrieve data on a server. Clients can use the GET method to access all of the resources of a given type, or they can use it to access a specific resource. For instance, a GET request to the /products endpoint of an e-commerce API would return all of the products in the database, while a GET request to the /products/123 endpoint would return the specific product with an ID of 123. GET requests typically do not include a request body, as the client is not attempting to create or update data.

### POST

The POST method is used to create new resources. For instance, if the manager of an e-commerce store wanted to add a new product to the database, they would send a POST request to the /products endpoint. Unlike GET requests, POST requests typically include a request body, which is where the client specifies the attributes of the resource to be created. For example, a POST request to the /products endpoint might have a request body that looks like this:

```sh
{
  "name": "Sneakers",
  "color": "blue",
  "price": 59.95,
  "currency": "USD"
}
```

### PUT

The PUT method is used to replace an existing resource with an updated version. This method works by replacing the entire resource (i.e., the specific product located at the /products/123 endpoint) with the data that is included in the request’s body. This means that any fields or properties not included in the request body are deleted, and any new fields or properties are added.

### PATCH

The PATCH method is used to update an existing resource. It is similar to PUT, except that PATCH enables clients to update specific properties on a resource—without overwriting the others. For instance, if you have a product resource with fields for name, brand, and price, but you only want to update the price, you could use the PATCH method to send a request that only includes the new value for the price field. The rest of the resource would remain unchanged. This behavior makes the PATCH method more flexible and efficient than PUT.

### DELETE

The DELETE method is used to remove data from a database. When a client sends a DELETE request, it is requesting that the resource at the specified URL be removed. For example, a DELETE request to the /products/123 endpoint will permanently remove the product with an ID of 123 from the database. Some APIs may leverage authorization mechanisms to ensure that only clients with the appropriate permissions are able to delete resources.

## Which HTTP methods are safe?

Safe HTTP methods facilitate read-only operations, which means they do not create or alter the API’s resources. GET is the most commonly used safe method, but the HEAD method—which is used to retrieve only the headers of a resource—is also safe.

## Which HTTP methods are idempotent?

An HTTP method is considered idempotent if it will result in the same outcome no matter how many times it is executed. All safe methods are also idempotent, as are PUT and DELETE. However, POST and PATCH are not idempotent. POST is not idempotent because calling it multiple times will result in multiple resources being created. PATCH can be idempotent, but it is not necessarily so. For instance, a PATCH request may increment a specific field every time it is called, which would modify the resource every time.