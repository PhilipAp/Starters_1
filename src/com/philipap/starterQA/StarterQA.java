package com.philipap.starterQA;

/*
 * @author PhilipAp
 */
public class StarterQA {
	
	//1
	public boolean sleepIn(boolean weekday, boolean vacation) {
		  return (!weekday || vacation);
		}	
	
	//2
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		// return ((aSmile && bSmile) || (!aSmile && !bSmile));
		 return (aSmile == bSmile);
		}
	
	//3
	public int sumDouble(int a, int b) {
		  if(a == b){
		    return ((a + b) * 2);
		  }
		  else{
		    return (a + b);
		  }
		}
	
	//4
	public int diff21(int n) {
		  if(n > 21){
		    return Math.abs((n - 21) * 2);
		  }else{
		    return Math.abs(n - 21);
		  }
		}
	
	//5
	public boolean parrotTrouble(boolean talking, int hour) {
		  return (talking && (hour < 7 || hour > 20));
		}
	
	//6
	public boolean makes10(int a, int b) {
		  return (a == 10 || b == 10 || (a + b == 10));
		}
	
	//7
	public boolean nearHundred(int n) {
		  return ((Math.abs(100 - n) <= 10) ||
		    (Math.abs(200 - n) <= 10));
		}
	
	//8
	public boolean posNeg(int a, int b, boolean negative) {
		  if (negative) {
		    return (a < 0 && b < 0);
		  }
		  else {
		    return ((a < 0 && b > 0) || (a > 0 && b < 0));
		  }
		}
	
	//9
	public String notString(String str) {
		  if(str.startsWith("not")){
		    return str;
		  }else{
		    return "not " + str;
		  }
		}
	
	//10
	public String missingChar(String str, int n) {
		  String front = str.substring(0, n);		  
		  // Start this substring at n+1 to omit the char.
		  // Can also be shortened to just str.substring(n+1)
		  // which goes through the end of the string.
		  String back = str.substring(n+1, str.length());		  
		  return front + back;
	}
	
	//11
	public String frontBack(String str) {
		  if (str.length() <= 1) return str;
		  
		  String mid = str.substring(1, str.length()-1);
		  
		  // last + mid + first
		  return str.charAt(str.length()-1) + mid + str.charAt(0);
		}
	
	//12
	public String front3(String str) {
		  String front;
		  
		  if (str.length() >= 3) {
		    front = str.substring(0, 3);
		  }
		  else {
		    front = str;
		  }
		  return front + front + front;
		}
	
	//13
	public String backAround(String str) {
		  // Get the last char
		  String last = str.substring(str.length() - 1);
		  return last + str + last;
		}
	
	//14
	public boolean or35(int n) {
		  return (n % 3 == 0) || (n % 5 == 0);
		}
	
	//15
	public String front22(String str) {
		  // First figure the number of chars to take
		  int take = 2;
		  if (take > str.length()) {
		    take = str.length();
		  }		  
		  String front = str.substring(0, take);
		  return front + str + front;
		}
	
	//16
	public boolean startHi(String str) {
		  return (str.startsWith("hi"));
		}
	
	//17
	public boolean icyHot(int temp1, int temp2) {
		  if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
		    return true;
		  } else {
		    return false;
		  }
		  // Could be written as: return ((temp1 < 0 && ...));
		}
	
	//18
	public boolean in1020(int a, int b) {
		  return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
		}
	
	//19
	public boolean hasTeen(int a, int b, int c) {
		  // Here it is written as one big expression,
		  // vs. a series of if-statements.
		  return (a>=13 && a<=19) ||
		         (b>=13 && b<=19) ||
		         (c>=13 && c<=19);
		}
	
	//20
	public boolean loneTeen(int a, int b) {
		  // Store teen-ness in boolean local vars first. Boolean local
		  // vars like this are a little rare, but here they work great.
		  boolean aTeen = (a >= 13 && a <= 19);
		  boolean bTeen = (b >= 13 && b <= 19);
		  
		  return (aTeen && !bTeen) || (!aTeen && bTeen);
		  // Translation: one or the other, but not both.
		  // Alternately could use the Java xor operator, but it's obscure.
		}
	
	//21
	public String delDel(String str) {
		  if (str.length()>=4 && str.substring(1, 4).equals("del")) {
		    // First char + rest of string starting at 4
		    return str.substring(0, 1) + str.substring(4);
		  }
		  // Otherwise return the original string.
		  return str;
		}
	
	//22
	public boolean mixStart(String str) {
		  // Check if string is too small
		  // (so substring() below does not go off the end)
		  if (str.length() < 3) return false;
		  
		  // Pull out length 2 string for the "ix" part
		  // (i.e. substring starting at index 1 and stopping just before 3).
		  String two = str.substring(1, 3);
		  
		  if (two.equals("ix")) {
		    return true;
		  } else {
		    return false;
		  }
		  // This last part can be shortened to just:
		  // return(two.equals("ix"));
		}
	
	//23
	public String startOz(String str) {
		  String result = "";
		  
		  if (str.length() >= 1 && str.charAt(0)=='o') {
		    result = result + str.charAt(0);
		  }
		  
		  if (str.length() >= 2 && str.charAt(1)=='z') {
		    result = result + str.charAt(1);
		  }
		  
		  return result;
		}
	
	//24
	public int intMax(int a, int b, int c) {
		  int max;
		  
		  // First check between a and b
		  if (a > b) {
		    max = a;
		  } else {
		    max = b;
		  }
		  
		  // Now check between max and c
		  if (c > max) {
		    max = c;
		  }
		  
		  return max;
		  
		  // Could use the built in Math.max(x, y) function which selects the larger
		  // of two values.
		}
	
	
	//25
	public int close10(int a, int b) {
		  int aDiff = Math.abs(a - 10);
		  int bDiff = Math.abs(b - 10);
		  
		  if (aDiff < bDiff) {
		    return a;
		  }
		  if (bDiff < aDiff) {
		    return b;
		  }
		  return 0;  // i.e. aDiff == bDiff
		  
		  // Solution notes: aDiff/bDiff local vars clean the code up a bit.
		  // Could have "else" before the second if and the return 0.
		}
	
	//26
	public boolean in3050(int a, int b) {
		  if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
		    return true;
		  }
		  if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
		    return true;
		  }
		  return false;
		  // This could be written as one very large expression,
		  // connecting the two main parts with ||
		}
	
	//27
	public int max1020(int a, int b) {
		  // First make it so the bigger value is in a
		  if (b > a) {
		    int temp = a;
		    a = b;
		    b = temp;
		  }
		  
		  // Knowing a is bigger, just check a first
		  if (a >= 10 && a <= 20) return a;
		  if (b >= 10 && b <= 20) return b;
		  return 0;
		}
	
	//28
	public boolean stringE(String str) {
		  int count = 0;

		  for (int i=0; i<str.length(); i++) {
		    if (str.charAt(i) == 'e') count++;
		    // alternately: str.substring(i, i+1).equals("e")
		  }

		  return (count >= 1 && count <= 3);
		}
	
	//29
	public boolean lastDigit(int a, int b) {
		  // True if the last digits are the same
		  return(a % 10 == b % 10);
		}
	
	//30
	public String endUp(String str) {
		  if (str.length() <= 3) return str.toUpperCase();
		  int cut = str.length() - 3;
		  String front = str.substring(0, cut);
		  String back  = str.substring(cut);  // this takes from cut to the end
		  
		  return front + back.toUpperCase();
		}
	
	//31
	public String everyNth(String str, int n) {
		  String result = "";
		  
		  // Look at every nth char
		  for (int i=0; i<str.length(); i = i + n) {
		    result = result + str.charAt(i);
		  }
		  return result;
		}
}
