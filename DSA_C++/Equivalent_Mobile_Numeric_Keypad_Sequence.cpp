#include <bits/stdc++.h>
using namespace std;
string PrintSequence(string arr[] , string line )
{
    string output = "";
    for (int i = 0; i < line.length(); i++)
    {
        if(line[i]==' ')
        {
            output = output + "0";

        }
        else{
            int posi = line[i] - 'A';
            output = output + arr[posi];
        }
    }
    return output ;
}
// Main Code:
int main()
{
    // storing the sequence in array
    string str[]
        = { "2",   "22",  "222", "3",   "33",   "333", "4",
            "44",  "444", "5",   "55",  "555",  "6",   "66",
            "666", "7",   "77",  "777", "7777", "8",   "88",
            "888", "9",   "99",  "999", "9999" };
 
    string input = "DEBABRATA MITRA";
    cout << PrintSequence(str, input);
    return 0;
}