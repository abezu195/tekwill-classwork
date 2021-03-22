package md.tekwill.classwork.packages.office;

import md.tekwill.classwork.packages.home.LivingRoom;

public class Cubicle {

//    md.tekwill.classwork.packages.home.LivingRoom livingRoom; // fully qualified name import || try to avoid
    LivingRoom livingRoom; // classes from different packages need imports
    ConferenceHall conferenceHall; // classes in same package don't need imports
}
