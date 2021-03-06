//================================= INTRO TO MVC
//
//        How do we design software applications?
//
//
//
//
//
//
//
//
//        A best practice of effective software design is to separate concerns.
//
//
//        JS
//        functions
//        scripts
//
//        Java
//        Methods
//        Classes/Objects OOP
//        Design Patterns
//        Architectural Patterns: MVC
//
//
//
//        Each concern should be as separated from another as possible.
//
//        MVC is a software architectural pattern that offers a high level separation of concerns.
//
//
//
//
//
//        Consider the concerns of a full stack application:
//
//        1) How to access and change data
//        2) How to display data / provide a UI
//        3) How to facilitate communication between a client (user) and a server (web app)
//
//
//
//
//        1) Model
//        2) View
//        3) Controller
//
//        MVC is not bound to a specific language tech stack and may be used in all kinds of software, not just web apps.
//
//
//
//
//
//
//
//        In a Java Servlet application, MVC is implemented in these ways:
//
//        1) The model layer is comprised of classes dealing with data manipulation, included
//        - Data Access Objects DAOs (software to initiate changes to our DB)
//        - Beans/Models/POJOs/Entities (a class for CRUDable data, likely mapping to a DB table)
//        - Common interfaces to abstract specific DAO implementations (code in app can be DB type agnostic)
//
//        2) The view layer is mainly made up of JSPs and client-side code to render the UI with the needed data
//
//        3) The controller layer is the gateway between the model and view layer and is made up of Java Servlets, that intercept client-initiated requests and then fulfills those requests by using model layer code to manipulate/CRUD the data (in our case, MySQL).
//
//
//
//
//        MVC Analogy...
//
//        You're on a day hike and realize you forgot to bring a map. You come across a park ranger and ask for directions to "Cat Gifs Peak." The ranger, there name is Servanna, listens, picks up there walki-talki and asks there fellow ranger at the station, Modela, what trail leads to "Cat Gifs Peak?" Modela looks at the map at the station and tells Servanna the coordinates. Servanna then draws the path on an existing map of the trails for the way to go to "Cat Gifs Peak."
//
//        You = the user
//
//        Your Request for Directions = HTTP GET request
//
//        Servanna = a servlet / controller
//
//        Modela = the model logic that communicates directly with a data source (the maps at the
//        station/a database)
//
//        The Drawn Map = the view (JSP) prepared in the controller for the user using the model data.
//
//        Modela specifically represents a DAO, in other words, she can access whatever information is needed and translates it. Other DAOs, station rangers, may exist that specialize in getting specific information. The list of possible park guest needs represents the interface that Servanna uses and Modela implements.
//
//        Imagine that the resource being dealt with in this scenario is a specific instance of NavigationDirection. The model/class/POJO/bean may have the following format:
//
//public class NavigationDirection implements Serializable {
//
//    private String nameOfDestination;
//    private String nameOfGuestRequestingDirections;
//    private String latLongCoordinates;
//    private String dateRequestRecieved;
//
//    public NavigationDirection() {}
//
//    (additional constructors;...)
//            (getters and setters...)
//
//}