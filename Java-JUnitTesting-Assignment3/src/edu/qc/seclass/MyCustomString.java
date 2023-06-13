package edu.qc.seclass;

import java.util.ArrayList;
import java.util.List;

public class MyCustomString implements MyCustomStringInterface {

    private String currentString = null;


    @Override
    public String getString() {
        if (currentString == null)
            return null;            //returns null else currentSring
        else
            return currentString;
    }


    @Override
    public void setString(String string) {

        this.currentString = string;
    }



    @Override
    public int countNumbers() { // method


        if (this.currentString == null) { // if it is null
            throw new NullPointerException("It throws NumPointerException");
        }

        if (this.currentString.isEmpty()) { // if it is empty
            return 0;
        }

        int countNumber = 0;
        // loop to go until data length
        for (int i = 0; i < this.currentString.length(); i++) {

            char result = this.currentString.charAt(i);

            if (!Character.isDigit(result)) {
                continue;
            } else if (i == this.currentString.length() - 1) {
                countNumber++;
            } else if (Character.isDigit(this.currentString.charAt(i + 1))) {
                continue;
            } else {
                countNumber++; // increment by 1
            }

        }

        return countNumber; // get output

    }

    @Override
    public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd) {
        List<String> combineChar = new ArrayList<>();
        if (!startFromEnd && currentString.length() >= n) {
            for (int i = 1; i < currentString.length(); i++) {
                if (n * i < currentString.length()) {
                    combineChar.add(String.valueOf(currentString.charAt((n * i) - 1)));
                } else {
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (String s : combineChar) {
                sb.append(s);
            }
            return sb.toString();
        } else if (startFromEnd && currentString.length() >= n) {
            for (int i = 1; i <= currentString.length(); i++) {
                if (n * i < currentString.length()) {
                    combineChar.add(String.valueOf(currentString.charAt(currentString.length() - (n * i))));
                } else {
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (String s : combineChar) {
                sb.append(s);
            }
            return sb.reverse().toString();
        }
        return "";
    }

    @Override
    public void convertDigitsToNamesInSubstring(int startPosition, int endPosition) {
        // checks the condition
        if (startPosition <= endPosition && (startPosition > 0 && endPosition > 0) && this.currentString == null) {
            throw new NullPointerException(" it throws nullpointer exception ");
        }
        // checks the condition
        if (startPosition > endPosition) {
            throw new IllegalArgumentException("it throws IllegalArgumentException");
        }
        // checks the condition
        if ((startPosition <= endPosition) && (startPosition < 1 || endPosition < 1 || startPosition > this.currentString.length() || endPosition > this.currentString.length())) {
            throw new MyIndexOutOfBoundsException("It throws MyIndexBoundException");
        }
        String Result= ""; // empty string
        String FirstString = ""; // first string
        String LastString = ""; // last string
        int firstIndex = startPosition - 1;
        int lastIndex= endPosition;
        Result = currentString.substring(firstIndex, lastIndex);
        FirstString = currentString.substring(0, firstIndex);
        LastString = currentString.substring(lastIndex);

        Result = Result.replaceAll("0", "Zero");
        Result= Result.replaceAll("1", "One");
        Result= Result.replaceAll("2", "Two");
        Result = Result.replaceAll("3", "Three");
        Result = Result.replaceAll("4", "Four");
        Result = Result.replaceAll("5", "Five");
        Result = Result.replaceAll("6", "Six");
        Result = Result.replaceAll("7", "Seven");
        Result = Result.replaceAll("8", "Eight");
        Result = Result.replaceAll("9", "Nine");
        setString(FirstString + Result + LastString); // setting
    }


}
