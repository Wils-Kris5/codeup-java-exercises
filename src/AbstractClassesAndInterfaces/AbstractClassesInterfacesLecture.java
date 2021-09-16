package AbstractClassesAndInterfaces;

public class AbstractClassesInterfacesLecture {
    //-- PRE-READING QUESTIONS/Notes
    // What is an abstract class?
    //  a class that serves the same functionality as a super class but cant be instatiated
    //  Abstract class = abstract methods
    //  abstract methods = no body // method name, return type, params is how you define a abstract method
    //              no body = how the method is implemented
    //
    //   implements keyword = provide each method with implementation
    //
    //      IMPLEMENTATION
    //
    // What is an interface:
    //     a type of abstract class.
    //     follows rules{ methods can be either public or static//properties are public and static final//no static methods
    //
    // What can an abstract class do that an interface can’t?
    //    can be defined by extending classes that inclue a class thats inherited and have multiple interfaces// can declare constructors
    //        and destructors
    // What can an interface do that an abstract class can’t?
    //     provides context data regarding  what the object does
    //
    // Does the idea of a bicycle match more closely with an abstract class or interface?
    //
    //
    //
    // Does the idea of “repairable” (being able to repair something) match more closely with an abstract class or interface?
    //
    //
    //
    // What other related examples of abstract classes and interfaces come to mind?


    // -- LECTURE PROVIDED NOTES WITH JUSTIN

    //We will harness the power of inheritance and polymorphsm further in this lesson using more abstraction.
    //
    //Abstract Class - a more general class meant to be extended by other more specific subclasses
    //extending from an abstract class is a "type of" relationship
    //
    //Interface - an aspect of something that may be made a part of another class
    //implementing an interface is a "can do" or "can be" relationship
    //
    //Building b = new Library();
    //
    //Abstract class examples: Building
    //
    //    Sub-abstract Classes:
    //
    //        PublicBuilding
    //            Library
    //            CivicCenter
    //            PoliceDepartment
    //            FireHouse
    //
    //        PrivateBuilding
    //            House
    //            Tent
    //            Shed
    //            Theater
    //            MobileHome
    //
    //        CommercialBuilding
    //            StorageShed
    //            Warehouse
    //            Factory
    //            BicycleRepairShop
    //            GroceryStore
    //
    //
    //Interface examples:
    //
    //    ClimateControlled
    //        adjustHeating()
    //        adjustInsulation()
    //
    //    Portable
    //        getCurrentLocation()
    //        setNewLocation()
    //        secureTransport()
    //        moveToNewLocation()
    //        setAllRecordsToNewLocation()
    //
    //    Accessible
    //        getNewRequirements()
    //        inspect()
    //        adjustBathrooms()
    //        adjustWalkways()
    //        adjustDoors()
    //
    //    Serviceable
    //        installElectricalWiring()
    //        installPlumbing()
    //        connectPower()
    //        disconnectPower()
    //        turnOnWater()
    //        turnOffWater()
    //        makeUtilityPayment()
    //
    //    Sellable
    //        getCurrentOwner()
    //        getOwnerHistory()
    //        transferDeedOfOwnership()
    //        buyerBackgroundCheck()
    //        deriveFairMarketValue()
    //
    //    Rentable
    //        getCurrentRenterInfo()
    //        getRentalHistory()
    //        addRentalRecord()
    //        generateRentalContract()
    //        setRentalRate()
    //        setListingRentalStatus()
    //
    //    Maintainable
    //
    //    Securable
    //
    //
    //-- More "Real World" Scenerio
    //
    //class ServerRequests
    //
    //  giveMePosts()
    //  createAPost()
    //  deleteAPost()
    //
    //
    //Interface CRUDable {
    //  create()
    //  read()
    //  update()
    //  delete()
    //}
    //
    //CRUDFactory {
    //  CRUDable c = new MySQLPostsDataAccessObject();
    //  CRUDable getPostsCrudableObject()
    //    return c;
    //}
    //
    //abstract class DataAccessObject
    //  connect()
    //  executeTransaction()
    //  disconnect()
    //
    //class MySQLPostsDataAccessObject extends DataAccessObject implements CRUDable
    //
    //class MongoDBPostsDataAccessObject extends DataAccessObject implements CRUDable
    //
    //class MariaDBPostsDataAccessObject extends DataAccessObject implements CRUDable

}
