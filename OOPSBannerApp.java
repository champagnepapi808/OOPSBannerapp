/**
 * OOPSBannerApp UC2 - OOPS Large Banner Display Application
 *
 * This class demonstrates a simple Java application that outputs OOPS as
 * ASCII art composed of '*' and spaces in a 7-line format.
 *
 * @author Vidyut Singh Baruah
 * @version 5.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] bannerLines = {
            String.join(" ", " *** ", "*** ", "***** ", " *** "),
            String.join(" ", "*   * ", "*   * ", "*    *", "*   * "),
            String.join(" ", "*   * ", "*   * ", "*    *", "*  *  "),
            String.join(" ", "*   * ", "*   * ", "***** ", " *** "),
            String.join(" ", "*   * ", "*   * ", "*     ", "    * "),
            String.join(" ", "*   * ", "*   * ", "*     ", "*   * "),
            String.join(" ", " *** ", " *** ", "*     ", " *** ")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
