Del 1

Redogör för en likhet och en skillnad mellan programmeringsspråken Java och Python:
Båda programmeringsspråket Java och Python har sina fördelar och nackdelar. 
En skillnad mellan språken är tex att Java-kod komplieras först för att sedan köras. I Python tolkas koden och körs direkt. 
En stor likhet mellan de olika programmeringsspråken är att båda klassas som objektorienterade språk, klasser och objekt används, något som gör de båda språken välstrukturerade och enkla att underhålla. 

Förklara termerna:
Att kod kompileras innebär att det krävs en kompilator som bygger den skrivna koden så att datorn kan hantera den som en körbar fil.
Objektorienterade språk är de språk där man kodar med hjälp av tex objekt och klasser, en fördel med det kan vara att man kan återanvända delar längs vägen. 

Redogöra för följande termer:
		
Objekt:
Ett objekt är en del av en klass som kan ha både olika attribut eller olika beteenden/metoder. I våra exempelhar vi gjort object som MyCar och Pet

Konstruktor:
Kontruktorn skrivs i formen: public className(type parameter);  
Tex: public Pet(String petName);
Konstruktorn är en typ av en metod som kan ta emot information om ett objekts attribut.

Attribut:
Ett attribut kan vara en egenskap för ett objekt. I våra exempel med Frukter eller Husdjur kan det vara färg, storlek eller tex märke. 

Redogöra för de grundläggande principerna för versionshantering:
När flera personer jobbar i samma kod kan det uppstå konflikter om man ändrar på samma kodrader, en s.k. merge conflict. Då är versionshantering ett bra verktyg, det används för att kunna hantera historik i kod. 
Git, skrivet av Linus Torwalds, är ett Version Control System. Programmerar kan checka in och ut sin kod och skapa egna brancher från den ursprungliga koden, som sedan slås samman till den så kallade master/main branchen, 
på så vis kan flera personer koda i samma projekt samtidigt. 


Beskriv kort utvecklingsprocessen TDD:
Testdriven utveckling innebär att utvecklarna skriver enhetstester och testar koden i ett tidigt skede. Jobbar man enligt TDD så skriver man först testet, innan man skriver koden. Det första test man skriver ska också vara ett som felar, för att säkerställa att du kan skriva kod som sedan klarar testet, man följer cykeln Test fails, Test passes, Refactor. 
När enhetstester är på plats kommer det även senare vara mycket säkrare att refaktorera kod när man vet att ett test skulle fånga upp eventuella buggar tidigt. 


Del 2 & 3 ligger under src/inlamningsuppgift
