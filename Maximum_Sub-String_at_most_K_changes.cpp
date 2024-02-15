#include <bits/stdc++.h>
#include <iostream>
using namespace std;
int MaxSub_srring(string str, int k, char ch)
{
    int left = 0, right = 0, maxlen = 0, count = 0;
    if (str.length() == 0)
        return 0;

    if (str.length() == 1)
        return 1;

    while (right < str.length())
    {
        if (str[right] != ch)
            count++;

        while (count > k)
        {
            if (str[left] != ch)
                count--;
            left++;
        }

        maxlen = max(maxlen, right - left + 1);
        right++;
    }
    return maxlen;
}
int answer(string& A, int k)
{
    int maxlen = 1;
    for (int i = 0; i < 26; ++i) {
        maxlen = max(maxlen, MaxSub_srring(A, k, i+'A'));
        maxlen = max(maxlen, MaxSub_srring(A, k, i+'a'));
    }
    return maxlen;
}
 
// Driver code:Time Complexity: O(n*k)
// Auxiliary Space: O(1)
int main()
{
    int k = 2;
    string A = "ABABA";
    cout << "Maximum length = " << answer(A, k) << endl;
 
    int d = 2;
    string B = "HAHHHAaHH";
    cout << "Maximum length = " << answer(B, d) << endl;
    return 0;
}
