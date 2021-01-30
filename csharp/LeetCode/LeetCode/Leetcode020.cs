using System.Collections.Generic;

namespace LeetCode
{
    public class Leetcode020
    {
        public static bool IsValid(string s)
        {
            if (string.IsNullOrEmpty(s)) return false;

            var mappings = new Dictionary<char, char> {{'(', ')'}, {'[', ']'}, {'{', '}'}};

            var stack = new Stack<char>();
            foreach (var character in s)
            {
                if (mappings.ContainsKey(character))
                {
                    stack.Push(character);
                }
                else
                {
                    var success = stack.TryPop(out char openingElement);
                    if (!success) return false;

                    success = mappings.TryGetValue(openingElement, out char closingElement);
                    if (!success) return false;
                    if (character != closingElement) return false;
                }
            }

            return stack.Count == 0;
        }
    }
}