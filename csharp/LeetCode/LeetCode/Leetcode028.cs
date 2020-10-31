namespace LeetCode
{
    public class Leetcode028
    {
        public int StrStr(string haystack, string needle)
        {
            if (string.IsNullOrEmpty(needle)) return 0;
            for (int i = 0; i < haystack.Length - (needle.Length - 1); i++)
            {
                var found = true;
                for (int j = 0; j < needle.Length; j++)
                {
                    if (haystack[i + j] != needle[j])
                    {
                        found = false;
                        break;
                    }
                }

                if (found)
                {
                    return i;
                }
            }

            return -1;
        }
    }
}