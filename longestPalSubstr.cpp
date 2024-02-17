#include<bits/stdc++.h>
using namespace std;
// Function to print a substring str[low..high]
// void printSubStr(string str, int low, int high)
// {
//     for (int i = low; i <= high; ++i)
//         cout << str[i];
// }
int longestPalSubstr(string str)
{
    int hi,low;
     int n = str.length();
     int count1=0, count2=0;
    for(int i = 0; i < n ; i++)
{
    //for even palindrome :
    
   hi=i;
    low=i-1;
    
    while(low>=0 && hi<n && str[low]==str[hi])
    {
        // if(hi-low+1>end){
        //     start=low;
        //     end=hi-low+1;
        // }
        count2++;
        low--;
        hi++;
    } 
    //for odd palindrome :

    hi=i+1;
    low=i-1;
    
    while(low>=0 && hi<n && str[low]==str[hi])
    {
        // if(hi-low+1>end){
        //     start=low;
        //     end=hi-low+1;
        // }
        count2++;
        low--;
        hi++;
    } 
}
//  cout << "Longest palindrome substring is: ";
//   printSubStr(str, start, start + end - 1);
 
return count1+count2+n ;
}
 
// Driver code
int main()
{
    string str = "aaa";
 
    // Function call
    cout << "\nLength is: " << longestPalSubstr(str);
    return 0;
}


