package ArraysandStrings;

public class RotateString {
  public boolean rotateString(String s, String goal) {
    return (s.length() == goal.length() && (s+s).contains(goal));
}

public static void main(String[] args) {
  String s = "abcde";
  String goal = "cdeab";
  RotateString rs = new RotateString();
  System.out.println(rs.rotateString(s, goal));

}
}
