package md.tekwill.classwork.strings;

public class StringChainedMethods {
    public static void main(String[] args) {

        String result = "Sunday    ";
        String resultWithZInsteadOfSpaces = result.replace(' ', 'Z');
        String trimmedResultWithZInsteadOfSpaces = resultWithZInsteadOfSpaces.trim();
        String trimmedResultWithZInsteadOfSpacesAndMmsAtTheEnd = trimmedResultWithZInsteadOfSpaces.concat("M m");
        System.out.println(trimmedResultWithZInsteadOfSpacesAndMmsAtTheEnd);

        //this is same as above, but using method chaining! Notice the shortness!
        System.out.println(result.replace(' ', 'Z').trim().concat("M m"));


        String day = "SunDayz";
        day.replace("D", "Z").substring(3);
        System.out.println(day);
        day = day.replace("D", "Z").substring(3);
        System.out.println(day);
    }
}
