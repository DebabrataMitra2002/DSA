// #include<iostream>
// using namespace std;

// struct Node
// { 
//     int data;
//    struct Node *next;
// };
 
// Node* head = NULL;

// void insert(int data)
// {
//  Node* newNode = new Node();
//  newNode->data= data ;
//  newNode->next= head ;
//  head = newNode;    
// }

// void print_List(){
//     Node* curr= head;
//     while (curr!=NULL)
//     {
//         cout<<curr->data <<" ";
//         curr = curr->next;

//     }
//     cout<<endl;
    
// }


// int main()
// {
// insert(1);
// insert(2);
// insert(4);
// insert(0);
// print_List();
// }

// #include<iostream>
// using namespace std;

// struct node
// {
//     int data;
//     struct node *next;

// };


// node *head = NULL;

// void Insert(int newdata)
// {
//     node* newnode = new node();
//     newnode->data = newdata;
//     newnode->next = head;
//     head = newnode;
// }

// void print_list()
// {
//     node* curr = head;
//     while (curr!=NULL)
//     {
//         cout<<curr->data<<" ";
//         curr=curr->next;

//     }
//     cout<<endl;
    
// }

// int main()
// {
//     Insert(1);
//     Insert(2);
//     Insert(3);
//     print_list();

// }

#include <iostream>   // using class and oops concept.

using namespace std;

class Node {
public:
  int data;
  Node* next;

  Node(int data) {
    this->data = data;
    this->next = nullptr;
  }
};

class LinkedList {
public:
  Node* head;

  LinkedList() {
    this->head = nullptr;
  }

  void insertAtBeginning(int data) {
    Node* newNode = new Node(data);
    newNode->next = head;
    head = newNode;
  }

  void insertAtEnd(int data) {
    Node* newNode = new Node(data);
    if (head == nullptr) {
      head = newNode;
      return;
    }

    Node* temp = head;
    while (temp->next != nullptr) {
      temp = temp->next;
    }

    temp->next = newNode;
  }

  void deleteAtBeginning() {
    if (head == nullptr) {
      return;
    }

    Node* temp = head;
    head = head->next;
    delete temp;
  }

  void deleteAtEnd() {
    if (head == nullptr) {
      return;
    }

    if (head->next == nullptr) {
      delete head;
      head = nullptr;
      return;
    }

    Node* temp = head;
    while (temp->next->next != nullptr) {
      temp = temp->next;
    }

    delete temp->next;
    temp->next = nullptr;
  }

  void print() {
    Node* temp = head;
    while (temp != nullptr) {
      cout << temp->data << " ";
      temp = temp->next;
    }

    cout << endl;
  }
};

int main() {
  LinkedList linkedList;

  linkedList.insertAtBeginning(10);
  linkedList.insertAtBeginning(20);
  linkedList.insertAtBeginning(30);

  linkedList.print(); // 30 20 10

  linkedList.insertAtEnd(40);
  linkedList.insertAtEnd(50);

  linkedList.print(); // 30 20 10 40 50

  linkedList.deleteAtBeginning();

  linkedList.print(); // 20 10 40 50

  linkedList.deleteAtEnd();

  linkedList.print(); // 20 10 40

  return 0;
}