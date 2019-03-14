# reactjs
Reference: https://spring.io/guides/tutorials/react-and-spring-data-rest/#react-and-spring-data-rest-part-1
IN pom.xml, we can add node, npm, webpack

Key dependencies include:

react.js - toolkit used by this tutorial

rest.js - CujoJS toolkit used to make REST calls

webpack - toolkit used to compile JavaScript components into a single, loadable bundle

babel - write your JavaScript code using ES6 and compile it into ES5 to run in the browser

React and ReactDOM are the main libraries from Facebook used to build this app.

client is custom code that configures rest.js to include support for HAL, URI Templates, and other things. It also sets the default Accept request header to application/hal+json. 
