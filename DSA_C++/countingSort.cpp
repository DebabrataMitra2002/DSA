#include<bits/stdc++.h>
using namespace std;
vector<int> CountingSort(vector<int>& inputarray)
{
    int n = inputarray.size();
    int m = 0;
    for (int i = 0; i < n; i++)
    {
        m = max(m,inputarray[i]);
    }
    //initialize the count vector :
    vector<int> count(m+1,0);

    //map the inputarray to the count array:
    for (int i = 0; i < n; i++)
    {
        count[inputarray[i]]++;

    }
    // calculate the prefix sum of count array:
    for (int i = 1; i <= m; i++)
    {
        count[i]=count[i-1]+count[i];
    }
    
    //create a outputarray of size n:
    // Creating outputArray[] from countArray[] array
    vector<int> outputArray(n);
    for (int i = n-1; i>=0; i--)
    {
        outputArray[count[inputarray[i]]-1]=inputarray[i];
        count[inputarray[i]]--;
    }
    return outputArray;
}
int main(){
    
    // Input array
    vector<int> inputArray = { 4, 3, 12, 1, 5, 5, 3, 9 };
 
    // Output array
    vector<int> outputArray = CountingSort(inputArray);
 
    for (int i = 0; i < inputArray.size(); i++)
        cout << outputArray[i] << " ";
 
    return 0;
}