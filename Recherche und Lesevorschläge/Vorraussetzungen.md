# Vorraussetzungen
## Einleitung
Unser Unternehmen heißt Contoso GmbH und wir planen eine Client- Serversoftware für die Verwaltung unserer Hardware zu schreiben. Da wir aber keine Zeit, aber viel Geld haben, planen wir den Einsatz einer Message Oriented Middleware um die Anbindung der Clients an die Server zu vereinfachen. 
## Aufbau
Der Client besteht Hauptsächlich aus der grafischen Benutzeroberfläche. Mit dieser können Geräte hinzugefüt, geändert, gefunden und entfernt werden. 
Im Server befindet sich die eigendliche Programmlogik und die Anbindung zur Datenbank. Die Programmlogik kontrolliert, ob der Benutzer plausible Eingaben gemacht hat und die entsprechenden Berechtigungen besitzt. 
Die Middleware stellt die Verbindung der Clients mit dem Server her. 
## Mögliche Middleware-Kandidaten
* xmlBlaster
* Apache ActiveMQ
* RabbitMQ 
## Links
* https://www.techfak.uni-bielefeld.de/~swrede/xml-isy/talks/mom-xmlblaster.pdf
* https://de.wikipedia.org/wiki/Message_Oriented_Middleware
* https://de.wikipedia.org/wiki/Apache_ActiveMQ
* http://www.rabbitmq.com/features.html
