# CasaDeMarcat

RO  
 Aplicatie pentru casele de marcat V0.80  

BUG-uri cunoscute  
 -La plata cu tichete se poate introduce o valoare mai mare decat cea ce trebuie platita(importanta medie)  

MODIFICARI  
 -0.76 In loc de instantieri ale unei clase, acum programul preia produsele din baza de date  
 -0.76 Butoanele de plata cash si cel de " alta suma" acum functioneaza corespunzator   
 -0.76 Am adaugat posibilitatea de a plati cu bonuri, card, cash, toate  pe acelasi bon  

 -0.80 Generare unui fisier pdf in care se afla bonul pentru printare  
 -0.80 Bonul este salvat in Baza de date    
 -0.80 Implementare functionalitate rest  
 -0.80 Butonul "TOTAL" din lista cu optiuni acum va sterge toate datele din tabel daca in acesta sunt doar produse sterse cu valoarea totala 0    
 -0.80 Tabelul principal este acum extins dinamic( linii inceput: 47 - pentru a oferi un aspect vizual placut)  
 
 -0.82 Am inchis SQL statements, prepared statements, resultSets si connexiuni cu Baza de Date    
 -0.82 Am eliminat mai multe functii goale generate automat  
 
--------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------

EN  
 Cashier app V0.80  
KNOWN BUGS  
 -The current state of the app allows the user to pay more than they have to(ticket payment)  

CHANGES  
 -0.76 Items are now loaded from  SQL instead of class instances   
 -0.76 All cash payment buttons now work as intended    
 -0.76 Now the customer can pay with tickets, cash and card, all 3 at once   

 -0.80 A pdf receipt file is now generated in  "Bonuri" , allowing it to be printed    
 -0.80 The receipt is also saved in the database    
 -0.80 Implemented the "give change" functionality    
 -0.80 The "TOTAL" buton will now erase the table if there are only cancelled items and their total is 0    
 -0.80 Main table is now dinamically extended(At first there are only 47 lines just to make sure it's visually pleasing) 
 
 -0.82 Closed SQL statements, prepared statements, resultSets and connections that were left open with the DB  
 -0.82 Removed several empty functions  
