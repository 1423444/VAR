# Szenario
## Einleitung
Unser Unternehmen heißt Contoso GmbH und wir planen eine Client- Serversoftware für die Verwaltung unserer Hardware zu schreiben. Da wir aber keine Zeit, aber viel Geld haben, planen wir den Einsatz einer Message Oriented Middleware um die Anbindung der Clients an die Server zu vereinfachen. Als Programmiersprache für Client und Server wollen wir Java verwenden.
## Aufbau
Der Client besteht Hauptsächlich aus der grafischen Benutzeroberfläche. Mit dieser können Geräte hinzugefüt, geändert, gefunden und entfernt werden. 
Im Server befindet sich die eigendliche Programmlogik und die Anbindung zur Datenbank. Die Programmlogik kontrolliert, ob der Benutzer plausible Eingaben gemacht hat und die entsprechenden Berechtigungen besitzt. 
Die Middleware stellt die Verbindung der Clients mit dem Server her. 
## Mögliche Middleware-Kandidaten
* xmlBlaster
* Apache ActiveMQ
* RabbitMQ 
* Websphere MQ

## Links
* https://www.techfak.uni-bielefeld.de/~swrede/xml-isy/talks/mom-xmlblaster.pdf
* https://de.wikipedia.org/wiki/Message_Oriented_Middleware
* https://de.wikipedia.org/wiki/Apache_ActiveMQ
* http://www.rabbitmq.com/features.html
* http://www.informatik.uni-leipzig.de/~irmscher/lehre/skripte/VerteilteSystemeScriptum.pdf
* http://de.slideshare.net/PeterREgli/mom-message-oriented-middleware
* https://www.predic8.com/activemq-hornetq-rabbitmq-apollo-qpid-comparison.htm
* https://entwickler.de/online/rabbitmq-zur-verteilten-bearbeitung-von-aufgaben-und-entkopplung-von-applikationsteilen-5-136604.html
