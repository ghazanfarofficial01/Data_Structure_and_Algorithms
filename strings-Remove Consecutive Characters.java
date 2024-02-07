//Recursive Approach
class Solution{
    public String removeConsecutiveCharacter(String input){
        if (input.length() <= 1) {
        return input;
        }

    String remainingString = removeConsecutiveCharacter(input.substring(1));

    if (input.charAt(0) == remainingString.charAt(0)) {
        return remainingString;
    } else {
        return input.charAt(0) + remainingString;
    }
    }
}
