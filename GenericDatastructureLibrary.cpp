#include<iostream>
using namespace std;

////////////////////////////////////////////////////////////////
// Structure for Singly Linear and Singly Circular
template <class T>
struct nodeS
{
    T data;
    struct nodeS *next;
};

////////////////////////////////////////////////////////////////
// Structure for Doubly Linear and doubly Circular
template <class T>
struct nodeD
{
    T data;
    struct nodeD *next;
    struct nodeD *prev;
};

////////////////////////////////////////////////////////////////
//Structure for Stack and Queue
template<class T>
struct nodeSQ
{
    T data;
    struct nodeSQ *next;
};
/////////////////////////////////////////////////////////////////
// Class of Singly Linear Linked List
template <class T>
class SinglyLL
{
    public:
        struct nodeS<T> * First;

        SinglyLL();

        void InsertFirst(T no);
        void InsertLast(T no);
        void InsertAtPos(T no, int iPos);

        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int iPos);

        void Display();
        int Count();
};

////////////////////////////////////////////////////////////////

// Class of Singly Circular Linked List
template <class T>
class SinglyCL
{
    public:
        struct nodeS<T> * First;
         struct nodeS<T> * Last;

        SinglyCL();

        void InsertFirst(T no);
        void InsertLast(T no);
        void InsertAtPos(T no, int iPos);

        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int iPos);

        void Display();
        int Count();
};

////////////////////////////////////////////////////////////////

// Class of Doubly Linear Linked List

template <class T>
class DoublyLL
{
    public:
        struct nodeD<T> * First;
        struct nodeD<T> * Last;
        

        DoublyLL();

        void InsertFirst(T no);
        void InsertLast(T no);
        void InsertAtPos(T no, int iPos);

        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int iPos);

        void Display();
        int Count();
};

////////////////////////////////////////////////////////////////

// Class of Doubly Circular Linked List

template <class T>
class DoublyCL
{
    public:
        struct nodeD<T> * First;
        struct nodeD<T> * Last;

        DoublyCL();
        
        void InsertFirst(T no);
        void InsertLast(T no);
        void InsertAtPos(T no, int iPos);

        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int iPos);

        void Display();
        int Count();
};
////////////////////////////////////////////////////////////////
//class of Stack

template<class T>
class Stack
{
    public:
     struct nodeSQ<T> *First;
     int iCount;

     Stack();                                                  

     bool IsStackEmpty();                                                          
     void Push(T no);    //Insert;                                  
     T Pop();    
     void Display();          //Delete;
                                                                                                                                             
};
////////////////////////////////////////////////////////////////
//class of Queue

template<class T>
class Queue
{
    public:
     struct nodeSQ<T> *First;
     int iCount;

     Queue();                                                  

     bool IsStackEmpty();                                                          
     void EnQueue(T no);    //Insert;                                  
     T DeQueue();    
     void Display();          //Delete;
                                                                                                                                               
};
////////////////////////////////////////////////////////////////
//Body of Singly Linear Link List
template<class T>
SinglyLL<T>::SinglyLL()
{
    First = NULL;
}

template<class T>
void SinglyLL<T> :: InsertFirst(T NO)
{
    struct nodeS<T> * newn = new struct nodeS<T>;
     newn->data = NO;
     newn->next = NULL;
                                                     
    if(First == NULL)
    {
        First = newn;
    }
    else
    {
        newn->next = First;
        First = newn;

    }
}

template<class T>
void SinglyLL<T> :: InsertLast(T NO)
{
    struct nodeS<T> * newn = new struct nodeS<T>;
    newn->data = NO;
    newn->next = NULL;
    
    if(First == NULL)
    {
        First = newn;
    }
    else
    {
      struct nodeS<T> * temp = First;

        while(temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newn;
    }
}

template<class T>
void SinglyLL<T> :: DeleteFirst()
{
    if(First == NULL)
    {
        return;
    }
    else if(First->next == NULL)
    {
        delete First;
        First = NULL;

    }
    else
    {
        struct nodeS<T> * temp = First;
        First = First->next;
        delete temp;
        
    }

}

template<class T>
void SinglyLL<T> :: DeleteLast()
{
    if(First == NULL)
    {
        return;
    }
    else if(First->next == NULL)
    {
        delete First;
        First = NULL;

    }
    else
    {
        struct nodeS<T> * temp = First;
       
       while(temp->next->next != NULL)
       {
        temp = temp->next;
       }
       delete temp->next;
       temp->next = NULL;
        
    }

}

template<class T>
void SinglyLL<T>::InsertAtPos(T NO,int Pos)
{
    int count = Count();

    if((Pos < 1)||(Pos>count+1))
    {
        cout<<"invallid position"<<"\n";
    }

    if(Pos == 1)
    {
        InsertFirst(NO);
    }
    else if(Pos == count + 1)
    {
        InsertLast(NO);
    }
    else
    {
        struct nodeS<T> * newn = new struct nodeS<T>;
        newn->data = NO;
        newn->next = NULL;

        struct nodeS<T> * temp = First;

        for(int icnt = 1;icnt < Pos;icnt++)
        {
            temp = temp->next;
        }
        newn->next = temp->next;
        temp->next = newn;

    }
}

template<class T>
void SinglyLL<T>::DeleteAtPos(int Pos)
{
    int count = Count();

    if((Pos < 1)||(Pos>count+1))
    {
        cout<<"invallid position"<<"\n";
    }

    if(Pos == 1)
    {
        DeleteFirst();
    }
    else if(Pos == count + 1)
    {
        DeleteLast();
    }
    else
    {

        struct nodeS<T> * temp1 = First;
      

        for(int icnt = 1;icnt < Pos-1;icnt++)
        {
            temp1 = temp1->next;
        }
        struct nodeS<T> * temp2 = temp1->next;

        temp1->next = temp2->next;
        delete temp2;
       
    }
}

template<class T>
void SinglyLL<T> :: Display()
{
    struct nodeS<T> * temp = First;

  cout<<"elements in linked list are"<<"\n";
    while(temp != NULL)
    {
        cout<<"|"<<temp->data<<"|->";
        temp = temp->next;
    }
    cout<<"NULL"<<"\n";
}

template<class T>
int SinglyLL <T>:: Count()
{
    struct nodeS<T> * temp = First;
    int icnt = 0;

    while(temp != NULL)
    {
        icnt++;
        temp = temp->next;
    }
    return icnt;
}
/////////////////////////////////////////////////////////////////////////////////////////////
////Body of Singly Circular Link List

template<class T>
SinglyCL<T>::SinglyCL()
{
    First = NULL;
    Last = NULL;
}

template<class T>
void SinglyCL<T>::InsertFirst(T NO)
{
    struct nodeS<T> * newn = new struct nodeS<T>;
    newn->data = NO;
    newn->next = NULL;

    if((First == NULL)&&(Last == NULL))
    {
        First = Last = newn;
        (Last)->next = First;
    }
    else
    {
        newn->next = First;
        First = newn;
        (Last)->next = First;
    }
}

template<class T>
void SinglyCL<T>::InsertLast(T NO)
{
    struct nodeS<T> * newn = new struct nodeS<T>;

    newn->data  = NO;
    newn->next = NULL;

    if((First == NULL) && (Last == NULL))
    {
        First = Last = newn;
        (Last)->next = First;
    }
    else //LL contains at list 1 node
    {
        
        (Last)->next = newn;
         Last = newn;
        (Last)->next = First;
        

    }
}

template<class T>
void SinglyCL<T>::DeleteFirst()
{
    struct nodeS<T> * temp = First;

    if((First == NULL)&&(Last == NULL))
    {
        return;
    }
    else if(First == Last)
    {
        delete First;
        First = NULL;
        Last = NULL;
    }
    else
    {
        First = (First)->next;
        delete temp;
        (Last)->next = First;
    }
}

template<class T>
void SinglyCL<T>::DeleteLast()
{
    
    struct nodeS<T> * temp = Last;

    if((First == NULL)&&(Last == NULL))
    {
        return;
    }
    else if(First == Last)
    {
        delete First;
        First = NULL;
        Last = NULL;
    }
    else
    {
       while(temp->next != (Last))
       {
        temp = temp->next;
       }
       delete temp->next;
       Last = temp;
       (Last)->next = First;
    }

}

template<class T>
void SinglyCL<T>::Display()
{
    struct nodeS<T> * temp = First;
    
    cout<<"elements in linked list are"<<"\n";
    do
    {
        cout<<"|"<<temp->data<<"|->";
        temp = temp->next;
    }while(temp != Last->next);
    cout<<"\n";
}
    
template<class T>
int SinglyCL<T>::Count()
{
    int icnt = 0;
    struct nodeS<T> * temp = First;

    do
    {
        icnt++;
        temp = temp->next;
    }while(temp != Last->next);
    cout<<"\n";

    return icnt;
}

template<class T>
void SinglyCL<T>::InsertAtPos(T NO,int Pos)
{
    int NODECount = 0;
    NODECount = Count();
    struct nodeS<T> * temp = First;

    if((Pos<1)&&(Pos>NODECount + 1))
    {
        cout<<"Invallid Output"<<"\n";

    }

    if(Pos == 1)
    {
        InsertFirst(NO);
    }
    else if(Pos == NODECount)
    {
        InsertLast(NO);
    }
    else
    {
        struct nodeS<T> * newn = new struct nodeS<T>;
        newn->data = NO;
        newn->next = NULL;
        int icnt = 0;

        for(icnt = 1;icnt < Pos-1;icnt++)
        {
            temp = temp->next;
        }
       newn->next = temp->next;
       temp->next = newn;
    }
}

template<class T>
void SinglyCL<T>::DeleteAtPos(int Pos)
{
    int NODECount = 0;
    NODECount = Count();
    struct nodeS<T> * temp1 = First;
    struct nodeS<T> * temp2 = NULL;
    int icnt = 0;

    if((Pos<1)||(Pos>NODECount))
    {
        cout<<"Invallid Output"<<"\n";

    }

    if(Pos == 1)
    {
        DeleteFirst();
    }
    else if(Pos == NODECount)
    {
        DeleteLast();
    }
    else
    {

        for(icnt = 1;icnt < Pos-1;icnt++)
        {
            temp1 = temp1 ->next;
        }
        temp2 = temp1->next; 

      temp1->next = temp2->next;
       delete temp2;
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////
//Doubly Link List Will be start
/////////////////////////////////////////////////////////////////////////////
//Generic Link List of Doubly Circular LinkList
template<class T>
DoublyCL<T>::DoublyCL()
{
    First = NULL;
    Last = NULL;
}

template<class T>
void DoublyCL<T>::InsertFirst(T NO)
{
    struct nodeD<T> *newn = new struct nodeD<T>;

    newn->data = NO;
    newn->next = NULL;
    newn->prev = NULL;

    if((First == NULL)&&(Last == NULL))
    {
        First =  newn;
        Last = newn;
    }
    else
    {
        newn->next = First;
        (First)->prev = newn;
        First = newn;
    }
    (First)->prev = Last;
    (Last)->next = First;
}

template<class T>
void DoublyCL<T>::InsertLast(T NO)
{
   struct nodeD<T> * newn = new struct nodeD<T>;

    newn->data = NO;
    newn->next = NULL;
    newn->prev = NULL;

    if((First == NULL)&&(Last == NULL))
    {
        First =  newn;
        Last = newn;
    }
    else
    {
       (Last)->next = newn;
       newn->prev = Last;
       Last = newn;

    }
    (First)->prev = Last;
    (Last)->next = First;

}

template<class T>
void DoublyCL<T>::DeleteFirst()
{
    if((First == NULL)&&(Last == NULL))
    {
        cout<<"Link List is Already Empty"<<"\n";
    }
    else if(First == Last)
    {
        delete First;
        First = NULL;
        Last = NULL;
    }
    else
    {
        First = (First)->next;
        delete((Last)->next);
        (First)->prev = Last;
        (Last)->next = First;
    }

}

template<class T>
void DoublyCL<T>::DeleteLast()
{
     if((First == NULL)&&(Last == NULL))
    {
        cout<<"Link List is Already Empty"<<"\n";

    }
    else if(First == Last)
    {
        delete First;
        First = NULL;
        Last = NULL;
    }
    else
    {
        Last = (Last)->prev;
        delete((First)->prev);

        (First)->prev = Last;
        (Last)->next = First;
    }


}

template<class T>
void DoublyCL<T>::InsertAtPos(T NO,int ipos)
{
    int NODECOUNT = Count();
    struct nodeD<T> * temp = First;

    if((ipos<1)||(ipos > NODECOUNT + 1))
    {
        cout<<"Invallid Position"<<"\n";
        return;
    }

    if(ipos == 1)
    {
        InsertFirst(NO);
    }
    else if(ipos == NODECOUNT + 1)
    {
        InsertLast(NO);
    }
    else
    {
        struct nodeD<T> * newn = new struct nodeD<T>;
        newn->data = NO;
        newn->next = NULL;
        int icnt = 0;

        newn->data = NO;
        newn->next = NULL;
        newn->prev = NULL;

        for(icnt = 1;icnt < ipos -1;icnt++)
        {
            temp = temp->next;
        }

        newn->next = temp->next;
        temp->next->prev = newn;

        temp->next = newn;
        newn->prev = temp;


    }


}

template<class T>
void DoublyCL<T>::DeleteAtPos(int ipos)
{
   
    int NODECOUNT = Count();
     struct nodeD<T> * temp = NULL;


    if((ipos<1)||(ipos > NODECOUNT))
    {
        cout<<"Invallid Position"<<"\n";
        return;
    }

    if(ipos == 1)
    {
        DeleteFirst();
    }
    else if(ipos == NODECOUNT)
    {
        DeleteLast();
    }
    else
    {
        int iCnt = 0;
        temp = First;

        for(iCnt = 1; iCnt < ipos-1; iCnt++)
        {
            temp = temp->next;
        }

        temp->next = temp->next->next;
        delete temp->next->prev;
        temp->next->prev = temp;
        
    }

        
}



template<class T>
void DoublyCL<T>::Display()
{
    struct nodeD<T> * temp = First;
    int icnt = 0;

    if((First == NULL)&&(Last == NULL))
    {
        cout<<":Linklist is empty"<<"\n";
    }

    cout<<"Elements in Link List are :"<<"\n";
    do
    {
        icnt++;
        cout<<"|"<<temp->data<<"|<=>";
        temp = temp->next;
    }while(temp != Last->next);
    cout<<"\n";


}

template<class T>
int DoublyCL<T>::Count()
{
    struct nodeD<T> * temp = First;
    int i = 0;
    do
    {
        i++;
        temp = temp->next;
    }while(temp != Last->next);
    
    return i;


}
//////////////////////////////////////////////////////////////
//Generic Doubly Liniar Link List
template<class T>
DoublyLL<T> :: DoublyLL()
{
   
    First = NULL;
    Last = NULL;
}

template<class T>
void DoublyLL<T> :: InsertFirst(T no)
{
   struct nodeD<T> * newn = new struct nodeD<T>;

    newn ->data = no;
    newn->next = NULL;
    newn->prev = NULL;

    if((First == NULL)||(Last == NULL))
    {
        First = newn;
        Last = newn;
    }
    else 
    {
        newn -> next = First;
        (First)->prev = newn;
        First = newn;

    }

}

template<class T>
void DoublyLL<T> :: DeleteFirst()
{
    if((First == NULL)&&(Last == NULL))
    {
        return;
    }
    else if((First->next == NULL)||(Last->prev == NULL))
    {
      delete First;
      delete Last;
      First = NULL;
      Last = NULL;
    }
    else
    {
        struct nodeD<T> * temp = First;
        First = First->next;
        delete temp;
    }
}

template<class T>
void DoublyLL<T> :: InsertLast(T no)
{
    struct nodeD<T> * newn = new struct nodeD<T>;
    newn ->data = no;
    newn->next = NULL;
    newn->prev = NULL;

    if((First == NULL)||(Last == NULL))
    {
        First = newn;
        Last = newn;
    }
    else 
    {

       Last->next = newn;
       newn->prev = Last;
       Last = newn;

    }

}

template<class T>
void DoublyLL<T> :: InsertAtPos(T no,int ipos)
{
    int count = Count();
      struct nodeD<T> * temp = First;

    if((ipos < 1)||(ipos > count + 1))
    {
        cout<<"invallid Position"<<"\n";
        return;
    }

    if(ipos == 1)
    {
        InsertFirst(no);
    }
    else if(ipos == count)
    {
        InsertLast(no);
    }
    else
    {
        struct nodeD<T> * newn = new struct nodeD<T>;
        newn->data = no;
        newn->next = NULL;
        int icnt = 0;

        for(icnt = 1;icnt < ipos-1;icnt++)
        {
            temp = temp->next;
        }
       newn->next = temp->next;
       temp->next = newn;
    }
       
}


template<class T>
void DoublyLL<T> :: DeleteLast()
{
    if((First == NULL)&&(Last == NULL))
    {
        return;
    }
    else if((First->next == NULL)||(Last->prev == NULL))
    {
      delete First;
      delete Last;
      First = NULL;
      Last = NULL;
    }
    else
    {
         struct nodeD<T> * temp = First;

        while(temp->next->next != NULL)
        {
            temp = temp->next;
        }
        delete temp->next;
        temp->next = NULL;
    }
}

template<class T>
void DoublyLL<T> :: DeleteAtPos(int ipos)
{
    int count = Count();
    struct nodeD<T> * temp1 = First;
    struct nodeD<T> * temp2 = NULL;
    

   if((ipos < 1)||(ipos > count + 1))
    {
        cout<<"invallid Position"<<"\n";
        return;
    }

    if(ipos == 1)
    {
        DeleteFirst();
    }
    else if(ipos == count)
    {
        DeleteLast();
    }
    else
    {
        for(int icnt = 1;icnt < ipos -1;icnt++)
        {
            temp1 = temp1->next;
        }
        temp2 = temp1->next;

        temp1->next = temp2->next;
        delete temp2;
    }

}

template<class T>
void DoublyLL<T> :: Display()
{
      struct nodeD<T> * temp = First;

    cout<<"elements in linked list are"<<"\n";
    while(temp != NULL)
    {
        cout<<"|"<<temp->data<<"|<=>";
        temp = temp->next;
    }
    cout<<"NULL"<<"\n";

}

template<class T>
int DoublyLL<T> :: Count()
{
      struct nodeD<T> * temp = First;
    int icnt = 0;

    while(temp != NULL)
    {
        icnt++;
        temp = temp->next;
    }
    
    return icnt;
}
/////////////////////////////////////////////////////////////////////////
//Body Of Stack
template<class T>
Stack <T>:: Stack()
{
    First = NULL;
    iCount = 0;
}

template<class T>
bool Stack<T> :: IsStackEmpty()
{
    if(iCount == 0)
    {
        return true;
    }
    else
    {
        return false;
    }


}

template<class T>
void Stack <T>:: Push(T no)       //InsertFirst;
{
    struct nodeSQ<T> * newn = new nodeSQ<T>;

    newn->data = no;
    newn->next = NULL;

    if(First == NULL)
    {
        First = newn;
    }
    else
    {
        newn->next = First;
        First = newn;
    }

     iCount++;

    cout<<no<<"gets push in the Stack Succesfully"<<"\n";
  
    
}
template<class T>
T Stack<T>::Pop()                 //DeleteFirst;
{
    if(First == NULL)
    {
        cout<<"Enable to Pop the Elements as Stack is Empty"<<"\n";
        return (T)-1;
    }
    else 
    {
        T value = First->data;

        struct nodeSQ<T>* temp = First;

        First = First->next;

        delete temp;

        iCount--;
     
        return value;
        
    }


}

template<class T>
void Stack<T> :: Display()
{
    if(First == NULL)
    {
        cout<<"Stack is Empty"<<"\n";
    }
    else
    {
          cout<<"Elements of stack are :"<<"\n";

          struct nodeSQ<T> * temp = First;

          while(temp != NULL)
          {
            cout<<"|"<<temp->data<<"|->";
            temp = temp->next;
          }
          cout<<"NULL"<<"\n";
    }
  
}
///////////////////////////////////////////////////////////////////
//Body of Queue


template<class T>
Queue<T> :: Queue()
{
    First = NULL;
    iCount = 0;
}
template<class T>
bool Queue<T> :: IsStackEmpty()
{
    if(iCount == 0)
    {
        return true;
    }
    else
    {
        return false;
    }


}
template<class T>
void Queue<T> :: EnQueue(T no)       //InsertFirst;
{
    struct nodeSQ <T>* newn = new nodeSQ<T>;
    struct nodeSQ <T>* temp = First;

    newn->data = no;
    newn->next = NULL;

    if(First == NULL)
    {
        First = newn;
    }
    else
    {
        while(temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newn;
        
    }

     iCount++;

    cout<<no<<" gets EnQueue in the Queue Succesfully"<<"\n";
  
    
}

template<class T>
T Queue<T>::DeQueue()                 //DeleteFirst;
{
    if(First == NULL)
    {
        cout<<"Enable to DeQueue the Elements as Queue is Empty"<<"\n";
        return -1;
    }
    else 
    {
        T value = First->data;

        struct nodeSQ <T> * temp = First;

        First = First->next;

        delete temp;

        iCount--;
     
        return value;
        
    }


}

template<class T>
void Queue<T> :: Display()
{
    if(First == NULL)
    {
        cout<<"Queue is Empty"<<"\n";
    }
    else
    {
          cout<<"Elements of Queue are :"<<"\n";

          struct nodeSQ<T> * temp = First;

          while(temp != NULL)
          {
            cout<<"| "<<temp->data<<"|->";
            temp = temp->next;
          }
          cout<<"NULL"<<"\n";
    }
  
}



int main()
{
    
    Queue <int>obj;
    obj.EnQueue(11);
    obj.EnQueue(21);
    obj.EnQueue(51);
    obj.EnQueue(101);

    obj.Display();

    int iret = obj.DeQueue();
    cout<<"DeQueue element is "<< iret<<"\n";

    int iRet = obj.DeQueue();
    cout<<"DeQueue element is "<< iRet<<"\n";

    obj.Display();
     
    return 0;
}