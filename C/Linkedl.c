#include<stdio.h>

struct node
{
    int data;
    struct node * next;
    
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct  node ** PPNODE;




void Insertfirst(PPNODE head,int no)
{

PNODE newn=NULL;
newn=(PNODE)malloc(sizeof(NODE));
newn->data=no;
newn->next=NULL;

if(*head==NULL)
{
    *head=newn;
}
else
{
    newn->next=*head;
    *head=newn;
}
}


Insertlast(PPNODE head,int no)
{
    PNODE newn=NULL;
    PNODE temp=NULL;


    newn=(PNODE)malloc(sizeof(NODE));
    newn->data=no;
    newn->next=NULL;

    if(*head==NULL)
    {
        *head=newn;
    }
    else
    {
        temp=*head;
        while(temp->next!=NULL)
        {
            temp=temp->next;
        }
        temp->next=newn;
    }
}


void Deletefirst(PPNODE head)
{
    PNODE temp=NULL;
    if(*head==NULL)
    {
        return;
    }
    else
    {
        temp=*head;
        *head=temp->next;
        free(temp);
    }
}



int main()
{

PNODE first=NULL;
Insertfirst(&first,101);
Insertfirst(&first,51);


Deletefirst(&first);
    return 0;
}