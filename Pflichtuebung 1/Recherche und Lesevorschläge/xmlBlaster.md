# xmlBlaster
xmlBlaster ist eine Message Oriented Middleware, welche durch XML-Nachrichten kommuniziert. Der Inhalt der Nachricht kann alles sein z.B. Text, Bilder, Binärdateien oder Java-Objekte. Die Kommunikation mit dem Server kann über eine große Zahl an Protokollen erfolgen, z.B. HTTP, RMI oder CORBA. Wenn der Server nicht verfügbar ist unterstützen die Clients das Zwischenspeichern der Nachrichten. Da xmlBlaster unter der LGPL vertrieben wird darf es auch kommerziell kostenlos eingesetzt werden. Einziges Negatives an dieser Middleware ist, das sie zwar eine Benutzer/Passwort-Abfrage zur Verfügung stellt aber gleichzeitig keine verschlüsselten Verbindungen unterstützt. Möchte man den Datenverkehr vor Lauschangriffen schützen muss man dies sehr aufwenig über SSL realisieren. Ein Einsatz in einem internen geschlossenen Netzwerk ist so gerade noch akzeptabel. Wenn aber auch unautorisiere Personen zugriff zu dieses Netzwerk haben sollte besser eine andere Middleware verwendet werden.
## Bewertungsmatrix
|                         | xmlBlaster |
| ----------------------- |----------- |
| **Lizenztyp**                    | Open Source (LGPL) |
| **Lizenzkosten**                 | 0,- Euro |
**Anschaffungskosten**             | 0,- Euro |
| **Programmiersprache(n) Client** | PHP, Perl, Python, C, C++, C#, Visual Basic.net, Flash, J2ME, Java |
| **Betriebssysteme Client**       | Abhängig von der Programmiersprache (Windows, Linux, MacOS) |
| **Programmiersprache(n) Server** | Java |
| **Betriebssysteme Server**     | Windows, Linux, MacOS |
| **Komplexität**         | Leicht zu erlernen (siehe Link) |
| **Sicherheit**          | Passwortabfrage vorhanden, allerdings erfolgt die Kommunikation mit dem Server unverschlüselt. |
| **Sonstiges**           |  |

## Links
* http://www.xmlblaster.org/
* http://www.xmlblaster.org/xmlBlaster/demo/HelloWorld.java.html
* http://www.xmlblaster.org/FAQ.html#SSH
* https://www.techfak.uni-bielefeld.de/~swrede/xml-isy/talks/mom-xmlblaster.pdf
