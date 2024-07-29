//#include<iostream>
//#include<string>
//using namespace std;
//int main()
//{   
//   std::cout << "hi, Bdisha.\n"<< std::endl;
//   int a=3;
//   int b=4;
//   cout <<"sum of two number = "<< a+b;
//   char myGrade = 'B';
//cout << myGrade;
//string fullName ;
//cout<<"Enter your name:";
//cin>>fullName;
//getline(cin,fullName);
//cout<<"your name is:"<<fullName;
//char Mychar=112;
//cout<<Mychar;
//  string firstName = "John";
//  string lastName = "Doe";
//  string fullName = firstName + "  " + lastName;
//  cout << fullName;
//string Mytext="my name isdebabrata mitra.i am indian.";
//cout<<"length of the text is:"<<Mytext.length();
//return 0;

//However, cin considers a space (whitespace, tabs, etc) as a terminating character,
//string firstName;
//cout << "Type your first name: ";
//cin >> firstName; // get user input from the keyboard
//cout << "Your name is: " << firstName; string firstName;
//cout << "Type your first name: ";
//cin >> firstName; // get user input from the keyboard
//cout << "Your name is: " << firstName; //That's why, when working with strings, we often use the getline() function to read a line of text. It takes cin as the first parameter, and the string variable as second:
//string myname;
//cout<<"Enter your name :";
//getline(cin,myname);
//cout<<"Your Name is:"<<myname;
//return 0;
//  string letters[2][4] = {
//    { "A", "B", "C", "D" },
//    { "E", "F", "G", "H" }
//  };
//
//  for (int i = 0; i < 2; i++) {
//    for (int j = 0; j < 4; j++) {
//      cout << letters[i][j];
//    }
//    cout<<endl;
//  }
//for (int i = 1; i <= 10; i++) {
//  std::cout << i << std::endl;
//}
//struct {
//	int n;
//	float m;
//	string name;} mydata ;
//	mydata.n=12;
//	mydata.m=12.5;
//	mydata.name="tjhws";
//	cout<<mydata.n<<"\n";
//	cout<<mydata.m<<"\n";
//	cout<<mydata.name<<"\n";
//	
//  return 0;
//int a=10;
//int &b=a;
//cout<<b;
//cout<<a;
//int a=567;
//int*b=&a;
//cout<<&a;
//cout<<b;
//int a;
//cout<<"enter the number for chakeing the number is even or not:"<<"\n";
//cin>>a;
//cout<<"your number is:"<<a<<"\n";
//cout<<(a%2==0)?(cout<<"your number is even:"):(cout<<"your number is odd:");
//int a;
//cout<<"Find factorial Enter number:";
//cin>>a;
//cout<<"your number is :"<<a<<"\n";
//long int fact=1;
//
//for (int i=a;i>0;i--)
//{
//	fact=fact*a;
//	a--;
//}
//cout<<"factoril="<<fact;}
//long int Factorial(int a){
//	long int fact=1;
//	for(int i=a;i>0;i--){
//		fact=fact*a;
//		a--;
//		
//	}
//	return fact;
//}
#include<iostream>
#include<string>
using namespace std;
int main()
{
// int b;
//cout<<"Enter the number for finding the factorial:"<<"\n";
//cin>>b;
//cout<<"factorial ="<<Factorial(b);
//int a;
//cout<<"Enter he number:";
//cin>>a;
//
//int f=0;
//for(int i=1;i<=a;i++)
//{
//	if(a%i==0) 
//	{
//		f++;
//		
//}
//}
//if(f==2)
//{
//	cout<<"number"<<a<<"is prime:";
//}
//else
//{
//	cout<<"number"<<a<<"is not prime:";
//}
//int a,b;
//cout<<"Before sawp:\n";
//cout<<"Enter first number:";
//cin>>a;
//cout<<"Enter second number:";
//cin>>b;
//a=a+b;
//b=a-b;
//a=a-b;
//cout<<"After sawp:\n";
//cout<<"\n 1st number:"<<a;
//cout<<"\n 2nd number:"<<b;
cout<<"Enter the number of term :";
int n,x=0,y=1,z=0;
cin>>n;
if(n==0){
	cout<<"0";
}
else if(n==1)
{
	cout<<"0 1";
	
}
else{
	for(int i=0;i<n;i++)
	{	
	cout<<x<<"\n";
		z=x+y;
		x=y;
		y=z;

	}
	
return 0;
}


}





























