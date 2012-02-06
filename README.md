## Description
Example of how to extend spring integration by creating and packaging your own custom outbound adapter for reuse.

## How to use it

    <beans xmlns="http://www.springframework.org/schema/beans"
    	...
	xmlns:int-ca="http://jteso.com/schema/integration"
	xsi:schemaLocation="http://www.springframework.org/schema/integration http://www.springframework.org/schema/integration/spring-integration-2.1.xsd
		...
		http://jteso.com/schema/integration http://jteso.com/schema/integration/jteso-integration-1.0.xsd
		http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-3.0.xsd">

    ...
    <!-- messages found in this channel will be printed in the console -->
    <int-ca:terminal-channel-adapter channel="result-channel" />

# Disclamer
This example is for illustration purposes only. In a real environment, you should consider instead using the out of the box 'logging-channel-adapter'.

