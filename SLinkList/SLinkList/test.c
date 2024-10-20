#include"SLinkList.h"
#include "contact.h"

void test1()
{
	SLTNode* node1 = (SLTNode*)malloc(sizeof(SLTNode));
	node1->data = 1;

	SLTNode* node2 = (SLTNode*)malloc(sizeof(SLTNode));
	node2->data = 2;

	SLTNode* node3 = (SLTNode*)malloc(sizeof(SLTNode));
	node3->data = 3;

	SLTNode* node4 = (SLTNode*)malloc(sizeof(SLTNode));
	node4->data = 4;

	node1->next = node2;
	node2->next = node3;
	node3->next = node4;
	node4->next = NULL;

	SLTNode* plist = node1;
	SLTPrint(plist);
}

void test2()
{
	SLTNode* plist = NULL;
	SLTPushBack(&plist, 1);
	SLTPushBack(&plist, 2);
	SLTPushBack(&plist, 3);
	SLTPushBack(&plist, 4);
	SLTPrint(plist);//1->2->3->4->NULL
	SLTPushFront(&plist, 2);
	SLTPrint(plist);//2->1->2->3->4->NULL
	SLTPopBack(&plist);
	SLTPrint(plist);//2->1->2->3->NULL
	SLTPopFront(&plist);
	SLTPrint(plist);//1->2->3->NULL

	SLTNode* pret = SLTFind(plist, 2);
	if (pret)
	{
		printf("找到了!\n");
	}
	else
	{
		printf("没找到\n");
	}

	SLTInsert(&plist, pret, 10);
	SLTPrint(plist);//1->10->2->3->NULL
	SLTErase(&plist, pret);
	SLTPrint(plist);//1->10->3->NULL

	SLTNode* pret2 = SLTFind(plist, 10);
	SLTInsertAfter(&plist, pret2, 20);
	SLTPrint(plist);//1->10->20->3->NULL
	SLTEraseAfter(&plist, pret2);
	SLTPrint(plist);//1->10->3->NULL
	SLTDestroy(&plist);
	SLTPrint(plist);
}

void test3()
{
	contact* con = NULL;
	InitContact(con);
}

int main()
{
	//test1();
	//test2();
	test3();
	return 0;
}