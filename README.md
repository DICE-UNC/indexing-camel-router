indexing
========

An indexing framework for iRODS based middleware, the camel router

### requirements

* install camel-jms in servicemix
* set up etc/activemq.xml in servicemix

        <transportConnector name="amqp" uri="amqp://0.0.0.0:5672"/>
        <transportConnector name="websocket" uri="ws://0.0.0.0:61614"/>

  also need configure jaasAuthenticationPlugin
  
* the indexing bundle
