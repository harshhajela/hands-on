# Hands On for Maven
Practice repo

Added new modules
1. jpa-entities - provides entity class
2. web-api - provides jaxb command class
3. web-app - dependencies above 2 modules and uses those classes
4. convertors - mapstruct module uses above 2 modules

##Plugins
1. flatten plugin - To resolve version number. > 3.5 mvn version
2. enforcer plugin - To enforce version of Java/MVN etc.