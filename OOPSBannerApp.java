/**
 * OOPSBannerApp UC2 - OOPS Large Banner Display Application
 *
 * This class demonstrates a simple Java application that outputs OOPS as
 * ASCII art composed of '*' and spaces in a 7-line format.
 *
 * @author Vidyut Singh Baruah
 * @version 2.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        System.out.println(String.join(" ", " *** ", "*** ", "***** ", " *** "));
        System.out.println(String.join(" ", "*   * ", "*   * ", "*    *", "*   * "));
        System.out.println(String.join(" ", "*   * ", "*   * ", "*    *", "*  *  "));
        System.out.println(String.join(" ", "*   * ", "*   * ", "***** ", " *** "));
        System.out.println(String.join(" ", "*   * ", "*   * ", "*     ", "    * "));
        System.out.println(String.join(" ", "*   * ", "*   * ", "*     ", "*   * "));
        System.out.println(String.join(" ", " *** ", " *** ", "*     ", " *** "));
    }
}
