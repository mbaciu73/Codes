package com.Assignment;

import java.net.URL;
import java.util.Scanner;

public class stopWords {
	
	static int    i,j;
	private static String[] newWords = null;
	public static void main(String[] args) throws Exception{
		//it retrieves the url using the scanner
		//and holds the data into a string buffer using append
		URL url             = new URL("http://www.lextek.com/manuals/onix/stopwords1.html");
		Scanner website     = new Scanner(url.openStream());
		StringBuffer buffer = new StringBuffer();
		while(website.hasNext()) {
			buffer.append(website.next());
		}
		website.close();
		//Retrieving the String from the String Buffer object
		String outcome = buffer.toString();
		
		//Removing the HTML tags that are not needed in the stopWords
		outcome      = outcome.replaceAll("<[^>]*>", " ");
		outcome      = outcome.replace("&nbsp", " ");
		outcome      = outcome.replace("#", " ");
	    
		//sets the words together into a string then splits it into a char array for capitalizing
		String result = (String) outcome.subSequence(946,3002);
		char[] words  = result.toCharArray();
		
		//the index of the first letter of every word
		//split in 2 to improve efficiency
		int[] startOfWord1 = new int[] {0,1,6,11,17,22,27,34,37,43,48,53,60,64,72,78,83,85,88,95,98,105,111,119,127,130,134,139,145,147,150,
				155,161,165,167,171,172,176,182,189,194,196,202,209,215,222,226,232,237,243,248,254,258,264,271,274,278,281,283,284,288,291,
				297,301,306,313,322,327,334,338,343,344,347,353,362,373,375,379,383,387,391,397,404,409,415,416,420,425,431,434,439,445,449,
				455,459,465,469,474,483,491,501,511,512,516,521,525,530,533,537,540,544,549,554,557,561,565,569,574,581,590,600,608,609,613,
				620,629,632,636,640,645,650,652,657,661,666,669,674,681,689,694,701,709,715,716,719,722,726,732,734,737,741,748,752,756,760,
				766,773,776,783,786,789,796,797,799,808,810,818,828,839,848,852,854,856,859,865,866,870,871,875,880,884,888,892,897,902,903,
				908,915,919,924,930,935,939,942,946,950,956,960,966,973,974,978,982,988,991,995,998,1000};
		int[] startOfWord2 = new int[] {1006,1013,1016,1021,1025,1029,1035,1037,1040,1044,1048,1050,1056,1057,1066,1070,1076,1083,1088,1093,
				1096,1099,1104,1110,1114,1116,1122,1125,1130,1133,1140,1143,1150,1156,1163,1164,1166,1169,1174,1177,1182,1188,1190,1194,1197,
				1201,1205,1211,1218,1223,1225,1230,1237,1245,1251,1256,1262,1265,1268,1272,1273,1277,1283,1290,1295,1298,1305,1310,1316,1321,
				1328,1336,1342,1350,1357,1366,1376,1384,1391,1399,1402,1406,1407,1412,1413,1419,1425,1430,1435,1439,1444,1445,1449,1453,1456,
				1459,1463,1469,1476,1479,1483,1489,1496,1501,1505,1512,1517,1520,1526,1530,1536,1543,1548,1552,1557,1562,1567,1574,1582,1584,
				1588,1596,1603,1612,1621,1626,1632,1637,1642,1646,1650,1651,1655,1660,1664,1668,1671,1676,1680,1684,1689,1698,1703,1707,1712,
				1718,1723,1729,1733,1738,1744,1751,1759,1764,1771,1775,1777,1782,1790,1793,1797,1803,1807,1813,1820,1825,1828,1829,1834,1839,
				1841,1845,1847,1850,1854,1858,1859,1863,1864,1868,1874,1881,1886,1889,1892,1896,1898,1902,1907,1911,1915,1919,1923,1928,1935,
				1940,1945,1948,1953,1958,1961,1965,1969,1975,1982,1986,1992,1999,2004,2009,2010,2011,2015,2020,2023,2026,2031,2038,2046,2050,
				2055};
		//sets the first letter to uppercase using the function below
		for(i = 0; i < words.length; i++){
	    	for(j=0;j<startOfWord1.length;j++) {
	    		if(i==startOfWord1[j]) {
	    			words[i] = UpperCase(words[i]);
	    		}
	    	}
	    }
		for(i = 0; i < words.length; i++){
	    	for(j=0;j<startOfWord2.length;j++) {
	    		if(i==startOfWord2[j]) {
	    			words[i] = UpperCase(words[i]);
	    		}
	    		else {
	    			continue;
	    		}
	    	}
	    }
		//after uppercase is done it creates a string again before splitting using unicode
		String theWords = new String(words);
		newWords        = theWords.split("(?=[A-Z])");
		
		
	}
	//returns the Character to upperCase
	public static char UpperCase(char letter) {

		    char word = Character.toUpperCase(letter);
		    return word;

	}
	//allows other classes to have access to the array of stopWords
	public static String[] getNewWords() {
		return newWords;
	}

}
