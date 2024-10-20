#include "List.h"

LTNode* LTInit()
{
	LTNode* phead = CreateNode(-1);
	return phead;
}

void LTDestroy(LTNode* phead)
{
	assert(phead);
	LTNode* pcur = phead->next;
	while (pcur != phead)
	{
		LTNode* next = pcur->next;
		free(pcur);
		pcur = next;
	}
	free(phead);
	phead = NULL;
}

void LTPrint(LTNode* phead)
{
	LTNode* pcur = phead->next;
	while (pcur != phead)
	{
		printf("%d->", pcur->data);
		pcur = pcur->next;
	}
	printf("\n");
}

void LTPushBack(LTNode* phead, LTDataType x)
{
	assert(phead);
	LTNode* node = CreateNode(x);
	//phead phead->prev node
	node->prev = phead->prev;
	node->next = phead;

	phead->prev->next = node;
	phead->prev = node;
}

void LTPopBack(LTNode* phead)
{
	assert(phead && phead->next != phead);
	LTNode* del = phead->prev;
	del->prev->next = phead;
	phead->prev = del->prev;

	free(del);
	del = NULL;
}

void LTPushFront(LTNode* phead, LTDataType x)
{
	assert(phead);
	LTNode* node = CreateNode(x);
	//phead node phead->next
	node->prev = phead;
	node->next = phead->next;
	phead->next->prev = node;
	phead->next = node;
}
	

void LTPopFront(LTNode* phead)
{
	assert(phead && phead->next != phead);
	LTNode* del = phead->next;
	del->next->prev = del->prev;
	phead->next = del->next;

	free(del);
	del = NULL;
}

void LTInsert(LTNode* pos, LTDataType x)
{
	assert(pos);
	LTNode* node = CreateNode(x);
	//pos node pos->next
	node->prev = pos;
	node->next = pos->next;

	pos->next->prev = node;
	pos->next = node;
}

void LTErase(LTNode* pos)
{
	assert(pos);
	
	pos->next->prev = pos->prev;
	pos->prev->next = pos->next;

	free(pos);
	pos = NULL;
}

LTNode* LTFind(LTNode* phead, LTDataType x)
{
	LTNode* pcur = phead->next;
	while (pcur != phead)
	{
		if (pcur->data == x)
		{
			return pcur;
		}
		pcur = pcur->next;
	}
	return NULL;
}

LTNode* CreateNode(LTDataType x)
{
	LTNode* newnode = (LTNode*)malloc(sizeof(LTNode));
	if (newnode == NULL)
	{
		perror("malloc error!");
		exit(1);
	}
	newnode->data = x;
	newnode->next = newnode->prev = newnode;

	return newnode;
}



