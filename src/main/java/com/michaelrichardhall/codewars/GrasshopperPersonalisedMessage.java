package src.main.java.com.michaelrichardhall.codewars;

// Grasshopper - Personalized Message
// Create a function that gives a personalized greeting. This function takes two parameters: name and owner.
//
//        Use conditionals to return the proper message:
//
//        case	return
//        name equals owner	'Hello boss'
//        otherwise	'Hello guest'

class GrassHopperPersonalisedMessage {
    static String greet(String name, String owner) {
        return "Hello " + (name.equals(owner) ? "boss" : "guest");
    }
}

