package src.main.java.com.michaelrichardhall.codewars;

import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;

//Welcome!
//Your start-up's BA has told marketing that your website has a large audience in Scandinavia and surrounding countries. Marketing thinks it would be great to welcome visitors to the site in their own language. Luckily you already use an API that detects the user's location, so this is an easy win.
//
//The Task
//Think of a way to store the languages as a database (eg an object). The languages are listed below so you can copy and paste!
//Write a 'welcome' function that takes a parameter 'language' (always a string), and returns a greeting - if you have it in your database. It should default to English if the language is not in the database, or in the event of an invalid input.
//
//The Database
//english: "Welcome",
//czech: "Vitejte",
//danish: "Velkomst",
//dutch: "Welkom",
//estonian: "Tere tulemast",
//finnish: "Tervetuloa",
//flemish: "Welgekomen",
//french: "Bienvenue",
//german: "Willkommen",
//irish: "Failte",
//italian: "Benvenuto",
//latvian: "Gaidits",
//lithuanian: "Laukiamas",
//polish: "Witamy",
//spanish: "Bienvenido",
//swedish: "Valkommen",
//welsh: "Croeso"
//
//Possible invalid inputs include:
//
//IP_ADDRESS_INVALID - not a valid ipv4 or ipv6 ip address
//IP_ADDRESS_NOT_FOUND - ip address not in the database
//IP_ADDRESS_REQUIRED - no ip address was supplied

public class Welcome {
   public static String greet(String language){
    Map<String,String> welcomeMap = Stream.of(new String[][] {
      {"english", "src.main.java.com.michaelrichardhall.codewars.Welcome"},
      {"czech", "Vitejte"},
      {"danish", "Velkomst"},
      {"dutch", "Welkom"},
      {"estonian", "Tere tulemast"},
      {"finnish", "Tervetuloa"},
      {"flemish", "Welgekomen"},
      {"french", "Bienvenue"},
      {"german", "Willkommen"},
      {"irish", "Failte"},
      {"italian", "Benvenuto"},
      {"latvian", "Gaidits"},
      {"lithuanian", "Laukiamas"},
      {"polish", "Witamy"},
      {"spanish", "Bienvenido"},
      {"swedish", "Valkommen"},
      {"welsh", "Croeso"}
      })
      .collect(Collectors.toMap(data -> data[0], data -> data[1]));
     if (welcomeMap.containsKey(language)) {
       return welcomeMap.get(language);
     } 
     return welcomeMap.get("english");
   }
}
