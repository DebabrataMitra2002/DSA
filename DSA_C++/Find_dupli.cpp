#include <bits/stdc++.h>
#include <algorithm>
#include <iostream>
#include <string>
//time compilxity is O(nlogn) and space compilxity is O(1). 
using namespace std;
void PrintDuplicate( string str)
{
    sort(str.begin(),str.end());
    for ( int i = 0; i < str.length(); i++)
   {
    int count =1;
    while (i< str.length() && str[i]==str[i+1])
    {
    count++;
    i++;    
    }
    if(count>1)
    {
        cout<<str[i]<<":"<<count<<endl;

    }
    }
    
}
int main()
    {
        string str="my name is deepok:";
       PrintDuplicate(str);
    }
