Singleton & Prototype:

# EN

1. You're developing a Sound Manager for an Operating System. The software manages sound effects for system notifications, app notifications, browsers, games, music etc.

- The audio system must manage all sound-related tasks and must not allow duplicate managers.
- The class must allow developers to share the same sound manager for the sound settings.
- The manager takes a hefty amount of time to load, so it would be wise to create it at start up.
- The sound manager must implement the provided `ISoundManager` interface.

2. Later on you discover that you have created a bottleneck and would need to introduce ASAP multiple sound managers: for music, browsers and notifications.

3. It seems like the OS needs a class for the sound effects that are played. Currently, building one sound effect instance takes quite a while, but we need multiple instances to send across the OS. Is there something we can do about it?

# RO

1. Dezvoltați un Sound Manager pentru un sistem de operare. Software-ul gestionează efectele sonore pentru notificările de sistem, notificările aplicațiilor, browsere, jocuri, muzică etc.

- Sistemul audio trebuie să gestioneze toate sarcinile legate de sunet și nu trebuie să permită existența mai multor manageri simultan.
- Clasa trebuie să le permită dezvoltatorilor să partajeze același sound manager pentru modifica setările de sunet.
- Managerul necesită destul de mult timp pentru a se încărca, așadar ar fi idee bună să fie creat la startup.
- Sound managerul trebuie să implementeze interfața `ISoundManager` care vă este oferită.

2. Mai târziu, descoperi că ai creat un bottleneck și că este nevoie urgentă să introduci mai mulți sound manageri: pentru muzică, browsere și notificări.

3. Se pare că sistemul de operare are nevoie de o clasă pentru efectele sonore care sunt redate. În prezent, construirea unei instanțe de efect sonor durează destul de mult, însă avem nevoie de mai multe instanțe care să fie folosite prin sistem. Există vreo soluție pentru această problemă?

________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

Builder:

# EN

We are developing a software for a Coffee Shop. Customers can place custom coffee orders. Each coffee order has multiple attributes, and customers can request customizations to their coffees. Here are the attributes involved in creating a coffee order:

- Coffee Type (String): Required - The type of coffee (e.g., Espresso, Latte, Cappuccino).
- Price (Float): Required - The price of the coffee order
- Size (String): Required - The size of the coffee (e.g., Small, Medium, Large).
- Milk Type (String): Optional - The type of milk (e.g., Whole, Skim, Almond, Soy).
- Sugar Level (Integer): Optional - The amount of sugar (e.g., 0, 1, 2, 3).
- Ice (Boolean): Optional - Whether the coffee has ice.
- Flavor Shot (String): Optional - The flavor shot used (e.g., Vanilla, Hazelnut, etc).
- Whipped Cream (Boolean): Optional - Whether the coffee has whipped cream.

Some customers may want a basic coffee with no customization, while others may prefer multiple add-ons. The solution must ensure that:  
All required attributes (Coffee Type, Size, and Price) are set.  
Optional features can be included or omitted depending on customer preferences.

The creation process is clear and flexible, without overwhelming customers or developers with too many parameters at once.

# RO

Dezvoltăm un software pentru o cafenea. Clienții pot plasa comenzi de cafea personalizate. Fiecare comandă de cafea are mai multe atribute, iar clienții pot solicita personalizări ale cafelelor lor. Iată atributele implicate în crearea unei comenzi de cafea:

- Tipul de cafea (String): Obligatoriu - Tipul de cafea (de exemplu, Espresso, Latte, Cappuccino).
- Preț (Float): Obligatoriu - Prețul comenzii de cafea
- Dimensiunea (String): Obligatoriu - Dimensiunea cafelei (de exemplu Venti, Medie, Mare).
- Tipul de lapte (String): Opțional - Tipul de lapte (de exemplu, Integral, Degresat, Migdale, Soia).
- Nivelul de zahăr (Integer): Opțional - Cantitatea de zahăr (de exemplu, 0, 1, 2, 3).
- Gheață (Boolean): Opțional - Dacă punem gheață în cafea.
- Aromă (String): Opțional - Aromă adăugată (de exemplu, Vanilie, Dovleac, etc).
- Frișcă (Boolean): Opțional - Dacă punem frișcă în cafea.

Unii clienți pot dori o cafea simplă, fără personalizări, în timp ce alții pot prefera multiple opțiuni adăugate. Soluția trebuie să asigure că: Toate atributele obligatorii (Tipul de cafea, Dimensiunea și Prețul) sunt setate. Caracteristicile opționale pot fi incluse sau omise în funcție de preferințele clienților.

Procesul de creare trebuie să fie clar și flexibil, fără a copleși clienții sau developerii cu prea mulți parametri deodată.

________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

Factory:

# EN

You’re developing a cross-platform document editing application (like a simplified Google Docs). Users can export their documents in multiple formats:

- PDF
- DOCX
- HTML

Each format requires a different export implementation, but they are all part of the same framework.
- The export type is selected by the user at runtime from an UI.
- The UI component handling the export isn't aware of how each export type is implemented.
- The design should allow the export system to be easily extended when new formats (like Markdown or TXT) are introduced, without modifying the UI logic.


# RO

Trebuie să dezvoltați o aplicație de editare a documentelor cross-platform (similară cu o versiune simplificată de Google Docs). Utilizatorii pot exporta documentele în mai multe formate:
- PDF
- DOCX
- HTML

Fiecare format necesită o implementare diferită pentru export, dar toate fac parte din același framework.
- Tipul de export este selectat de utilizator la runtime, prin intermediul unui UI.
- Componenta UI care se ocupă de export nu are informații despre cum este implementat fiecare tip de export.
- Designul ar trebui să permită extinderea facilă a sistemului de export atunci când se introduc noi tipuri de documente (cum ar fi Markdown sau TXT), fără a modifica logica UI-ului.

