#include<bits/stdc++.h>
using namespace std;
// Function to print a substring str[low..high]
void printSubStr(string str, int low, int high)
{
    for (int i = low; i <= high; ++i)
        cout << str[i];
}
int longestPalSubstr(string str)
{
    int start =0,end=1,hi,low;
     int n = str.length();
    for(int i = 0; i < n ; i++)
{
    //for even palindrome :
    hi=i;
    low=i-1;
    
    while(low>=0 && hi<n && str[low]==str[hi])
    {
        if(hi-low+1>end){
            start=low;
            end=hi-low+1;
        }
        low--;
        hi++;
    } 
    //for odd palindrome :
    hi=i+1;
    low=i-1;
    while(low>=0 && hi<n && str[low]==str[hi])
    {
        if(hi-low+1>end){
            start=low;
            end=hi-low+1;
        }
        low--;
        hi++;
    } 
}
 cout << "Longest palindrome substring is: ";
  printSubStr(str, start, start + end - 1);
 
return end;
}
 
// Driver code
int main()
{
    string str = "forgeeksskeegfor";
 
    // Function call
    cout << "\nLength is: " << longestPalSubstr(str);
    return 0;
}


