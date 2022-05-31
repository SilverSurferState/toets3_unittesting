#Opdracht: Mastermind 
Maak in package extoest3_mastermind een class Mastermind. 

In de class voorzie je deze constantes die je dan **moet** gebruiken in de code en in de tests: 

    public static final String RED = "red";
    public static final String GREEN = "green";
    public static final String BLUE = "blue";
    public static final String ORANGE = "orange";
    public static final String BLACK = "black";
    public static final String WHITE = "white";

    public static final int RESULT_BAD = 0;
    public static final int RESULT_ALMOST = 1;
    public static final int RESULT_OK = 2;

Tip: om de code in de tests zo leesbaar mogelijk te houden doe je in de test een import static. 

Je maakt een object van de class Mastermind met een array van Strings. Dit is de code die geraden moet worden. Deze array kan eender welke lengte hebben. 
Je mag ervan uitgaan dat de strings in de array correct zijn (dus: de array bevat geen andere waardes dan de constantes hierboven).  

Maak in deze class een public functie processGuess. 
Deze functie heeft als parameter een array van Strings. Dit is de guess van de user. 
De functie geeft een array van getallen terug. 
De guess moet gecontroleerd worden. Voor elke String in de guess bevat het resultaat: 
* RESULT_BAD als deze String niet voorkomt in de code 
* RESULT_OK als deze String voorkomt in de code en op de juiste plaats staat 
* RESULT_ALMOST als deze String voorkomt in de code maar op een andere plaats staat


Hou er rekening mee dat er foute input kan komen (bvb: de code of de guess zijn leeg of niet-bestaand, of ze bevatten niet evenveel Strings). In dat geval geeft de functie processGuess null terug. 

De mastermind moet werken voor een code van willekeurige lengte. 

Je moet het resultaat niet shuffelen (je mag ervan uitgaan dat dat verderop in de code gebeurt). Dus je mag zelf kiezen in welke volgorde je de resultaten teruggeeft. Maak het jezelf niet te moeilijk! 
