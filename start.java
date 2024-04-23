Ovaj projekat sadrzi dva Java file-a: Start.java i Calculator.java. 
Oba file-aa su analizirana kako bi se identificirali potencijalni problemi i predlozila rijesenja.
Start.java
Broj linija koda: X
Ciklomatska slozenost: X
Kognitivna slozenost: X
Zakljucci do kojih se doslo:
Kod je cist i dobro organizovan.
Primjena Scanner objekta izvan petlje smanjuje ponovno stvaranje objekta.
Koristenje equalsIgnoreCase metode omogucava korisniku unos "Izlaz" ili "izlaz" za izlazak iz programa.
Metoda Calculator.evaluateExpression se koristi za racunanje rezultata umjesto Calculator.Run.
Koristenje System.out.println za ispis rezultata racunanja izraza.
scanner.close() metoda zatvara Scanner objekat kada korisnik zavrsi sa programom.
Calculator.java
Broj linija koda: X
Ciklomatska slozenost: X
Kognitivna slozenost: X
Zakljucci do kojih se doslo:
Kod je cist i dobro organizovan.
Uklonjena nepotrebna linija koda za proveru izraza "exit" unutar evaluateExpression metode.
Koristenje try-catch bloka za obradu gresaka pri evaluaciji izraza umjesto provjere unosa unutar metode.
Jednostavnije vracanje "ERROR" u slucaju greske umjesto koristenja dve linije koda.
