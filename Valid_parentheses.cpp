#include <iostream>
#include <bits/stdc++.h>
using namespace std;
// function 1: using stack data structure:Time complexity:O(n); space :O(n) 
bool ValidParenth(string str) 
{
    stack<char> temp;
    for (int i = 0; i < str.length(); i++)
    {
    if(temp.empty())
    {
    temp.push(str[i]);
    }
    else if((temp.top() == '(' && str[i] == ')') ||(temp.top() == '{' && str[i] == '}') ||(temp.top() == '[' && str[i] == ']'))  
{
temp.pop();
} 
else{
    temp.push(str[i]);
}
}
if(temp.empty())
{
    return true;
}
else{
    return false;
}
}
//function 2:Time complexity:O(n); space :O(1)
// bool ValidParenth(string s) {
//         int i=-1;
//         for(auto& ch:s){
//             if(ch=='(' || ch=='{' || ch=='[')
//                 s[++i]=ch;
//             else{
//                 if(i>=0 && ((s[i]=='(' && ch==')') || (s[i]=='{' && ch=='}') || (s[i]=='[' && ch==']')))
//                     i--;
//                 else
//                     return false;
//             }
//         }
//         return i==-1;
//     }  
// Driver code:
int main(){
    string str="((({}[{}])))";
    if (ValidParenth(str))
        cout << "Balanced";
    else
        cout << "Not Balanced";
    return 0;
}