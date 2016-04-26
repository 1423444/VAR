#RabbitMQ
RabbitMQ ist eine weitere Nachrichtenorientierte Middleware, die sich vor allem durch die Unterstützung von sehr vielen 
Programmiersprachen sowie Protokollen auszeichnet. Ein weiterer positiver Aspekt ist, dass RabbitMQ sehr benutzerfreundlich
und leicht zu handhaben ist. Sozusagen ist RabbitMQ ein Message Broker welcher in der Programmiersprache Erlang geschrieben wurde.  
Oft wird diese Open Source Middleware als ein Übergangswerkzeug eingesetzt um verschiedene Applikationen programmiersprachenunabhängig 
zu entkoppeln oder auch um Informationen und Aufgaben asynchron zu Bearbeiten. RabbitMQ kann für jede gesendete Information 
entscheiden, ob der Erhalt vom Empfänger bestätigt werden muss oder nach dem „Fire und forget“ Prinzip abgesendet wird. 
Damit es einen Schutz vor Ausfällen gibt, werden oft mehrere Server zusammengeschlossen und eine Art Cluster gebildet.
Die Wahrscheinlichkeit von Verlust von Nachrichten wird hiermit deutlich verringert. 
Es wird das AMQP Protokoll für die Kommunikation zwischen Broker, Client und Verbraucher genutzt
