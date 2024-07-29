#include<iostream>
using namespace std;
// class Myclass
// {
// public:
//  int mynum;
//  string mystering;
// };

class Car
{
   public
   :
    string model;
    string brand;
    int price;
    int Maxspeed(int speed);
};
int Car::Maxspeed(int speed)
{
    return speed;
}
    

int main()
{
    // Myclass myobj;
    // myobj.mynum=6;
    // myobj.mystering="Debabrata";
    // cout<<myobj.mynum<<endl;
    // cout<<myobj.mystering<<endl;
    // return 0;
    Car obj1;
    obj1.model="blackhornet";
    obj1.brand="BMW";
    obj1.price=1000000;

    Car obj2;
    obj2.brand="TATA Motors";
    obj2.model="white_parl";
    obj2.price=244646;

    cout<<obj1.brand<<" "<<obj1.model<<" "<<obj1.price<<" "<<obj1.Maxspeed(465)<<endl;
    cout<<obj2.brand<<" "<<obj2.model<<" "<<obj2.price<<" "<<obj2.Maxspeed(400)<<endl;
    return 0;

}
