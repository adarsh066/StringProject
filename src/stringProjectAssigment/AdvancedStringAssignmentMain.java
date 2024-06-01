package stringProjectAssigment;

import java.util.List;
import java.util.Map;

public class AdvancedStringAssignmentMain {
	public static void main(String[] args) {
		String testStr = "aabcccccaaa";
		String palindromeStr = "A man a plan a canal Panama";
		String str1 = "Listen";
		String str2 = "Silent";
		String uniqueStr = "abcabcbb";
		String removeDupStr = "programming";
		String reverseWordsStr = "Hello World";

		System.out.println("Character Frequency: " + CharFrequency.charFrequency(testStr));
		System.out.println("Is Palindrome: " + PalindromeCheck.isPalindrome(palindromeStr));
		System.out.println("Are Anagrams: " + AnagramCheck.areAnagrams(str1, str2));
		System.out.println("Longest Unique Substring: " + LongestUniqueSubstring.longestUniqueSubstring(uniqueStr));
		System.out.println("Compressed String: " + StringCompression.compressString(testStr));
		System.out.println("All Permutations: " + FindPermutations.findPermutations("ABC"));
		System.out.println("Remove Duplicates: " + RemoveDuplicates.removeDuplicates(removeDupStr));
		System.out.println("Reverse Words: " + ReverseWords.reverseWords(reverseWordsStr));
	}
}
