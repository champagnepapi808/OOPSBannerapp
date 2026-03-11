/**
 * OOPSBannerApp UC6 - OOPS Banner with modular helper methods
 *
 * This class demonstrates a simple Java application that outputs OOPS as
 * ASCII art via decomposed static pattern generator methods for O, P, and S.
 *
 * @author Vidyut Singh Baruah
 * @version 2.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] oLeftPattern = getOPattern();
        String[] oRightPattern = getORightPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        for (int i = 0; i < oLeftPattern.length; i++) {
            System.out.println(String.join(" ", oLeftPattern[i], oRightPattern[i], pPattern[i], sPattern[i]));
        }
    }

    private static String[] getOPattern() {
        return new String[] {
            " *** ",
            "*   * ",
            "*   * ",
            "*   * ",
            "*   * ",
            "*   * ",
            " *** "
        };
    }

    private static String[] getORightPattern() {
        String[] left = getOPattern();
        String[] right = new String[left.length];
        for (int i = 0; i < left.length; i++) {
            right[i] = (i == 0) ? left[i].substring(1) : left[i];
        }
        return right;
    }

    private static String[] getPPattern() {
        return new String[] {
            String.join(" ", "***** "),
            String.join(" ", "*    * "),
            String.join(" ", "*    * "),
            String.join(" ", "***** "),
            String.join(" ", "*     "),
            String.join(" ", "*     "),
            String.join(" ", "*     ")
        };
    }

    private static String[] getSPattern() {
        return new String[] {
            String.join(" ", " *** "),
            String.join(" ", "*   * "),
            String.join(" ", "*  *  "),
            String.join(" ", " *** "),
            String.join(" ", "    * "),
            String.join(" ", "*   * "),
            String.join(" ", " *** ")
        };
    }
}
