using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode
{
    public class Leetcode017
    {
        private static Dictionary<string, string> phone = new Dictionary<string, string>
        {
            {"2", "abc"},
            {"3", "def"},
            {"4", "ghi"},
            {"5", "jkl"}, 
            {"6", "mno"}, 
            {"7", "pqrs"},
            {"8", "tuv"}, 
            {"9", "wxyz"},
        };
        
        public static IList<string> LetterCombinations(string digits)
        {
            List<string> result = new List<string>();
            if (string.IsNullOrEmpty(digits)) return result;
            BackTrack("", digits, result);
            return result;
        }

        private static void BackTrack(string combination, string nextDigits, IList<string> result)
        {
            if (nextDigits.Length == 0)
            {
                result.Add(combination);
                return;
            }

            var currentDigit = nextDigits.First().ToString();
            var success = phone.TryGetValue(currentDigit, out string possibleCharacters);

            if (!success) throw new Exception();
            foreach (var character in possibleCharacters)
            {
                BackTrack(combination + character, nextDigits.Substring(1), result);
            }
        }
    }
}