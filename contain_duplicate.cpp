#include <iostream>
#include <cstdlib>
int Duplicate(int arr[])
{ int al = sizeof(arr)/sizeof(arr[0]);
  int c=0;
	for (int i=0;i<al;i++)
	{   
 int index = abs(arr[i] % al);
        arr[index] = abs(arr[index])+al;
 	}
	for(int i=0;i<al;i++)
	{
		if((arr[i]/al)>=2)
		{
		c++;	
		}
	}
		if(c>1)
		{
		return 1;
		}
        else{
        return 0;
        }
		

}

using namespace std;
int main()
   {
	int array[]={2,3,4,2,-5};
	int b1 = sizeof(array)/sizeof(array[0]);
	cout<<"Array is :";
	for(int i=0;i<b1;i++)
	{
		cout<<array[i]<<"\n";
		
	}
	if(Duplicate(array))
	{
		cout<<"this array has duplicate element.";
		
	}
	else{
		cout<<"this array has no duplicate element.";
	}
	return 0;
}
