#include <iostream>
#include <bits/stdc++.h>
using namespace std;
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
// Driver code:
int main(){
    string str="((({}[{}])))";
    if (ValidParenth(str))
        cout << "Balanced";
    else
        cout << "Not Balanced";
    return 0;
}