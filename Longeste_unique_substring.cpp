#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int LongestUnique(string str)
{
   int maxlen=0,start=-1;
   vector<int>dict(256,-1);
  

   for (int i = 0; i < str.length(); i++)
   {
    if(dict[str[i]]>start)
       start=dict[str[i]];
    dict[str[i]]=i;
    maxlen=max(maxlen,i-start);
     }
     return maxlen;
   

}
int main()
{
    string str="abcabcbb" ;
    cout<<LongestUnique(str)<<endl;
}