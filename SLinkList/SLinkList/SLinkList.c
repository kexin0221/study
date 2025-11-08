#include"SLinkList.h"

void SLTPrint(SLTNode* phead)
{
	SLTNode* pcur = phead;
	while (pcur)//pcur != NULL
	{
		printf("%d->", pcur->data);
		pcur = pcur->next;
	}
	printf("NULL\n");
}

SLTNode* CreateNode(SLTDataType x)
{
	SLTNode* newnode = (SLTNode*)malloc(sizeof(SLTNode));
	if (newnode == NULL)
	{
		perror("malloc error");
		exit(1);
	}
	newnode->data = x;
	newnode->next = NULL;
	return newnode;

}

void SLTPushBack(SLTNode** pphead, SLTDataType x)
{
	assert(pphead);
	SLTNode* newnode = CreateNode(x);
	if (*pphead == NULL)
	{
		*pphead = newnode;
		return;
	}
	else {
		SLTNode* ptail = *pphead;
		while (ptail->next)
		{
			ptail = ptail->next;
		}
		ptail->next = newnode;
	}
}

void SLTPushFront(SLTNode** pphead, SLTDataType x)
{
	assert(pphead);
	SLTNode* newnode = CreateNode(x);
	newnode->next = *pphead;
	*pphead = newnode;
}

void SLTPopBack(SLTNode** pphead)
{
	assert(pphead && *pphead);

	if ((*pphead)->next == NULL)
	{
		free(*pphead);
		pphead == NULL;
	}else{
		SLTNode* ptail = *pphead;
		SLTNode* prev = *pphead;
		while (ptail->next)
		{
			prev = ptail;
			ptail = ptail->next;
		}
		free(ptail);
		ptail = NULL;
		prev->next = NULL;
	}
}

void SLTPopFront(SLTNode** pphead)
{
	assert(pphead && *pphead);
	SLTNode* pnext = (*pphead)->next;
	free(*pphead);
	*pphead = pnext;
}

SLTNode* SLTFind(SLTNode* phead, SLTDataType x)
{
	SLTNode* pcur = phead;
	while (pcur)
	{
		if (pcur->data == x)
		{
			return pcur;
		}
		pcur = pcur->next;
	}
	return NULL;
}

void SLTInsert(SLTNode** pphead, SLTNode* pos, SLTDataType x)
{
	assert(pphead && *pphead);
	assert(pos);
	if (pos == *pphead)
	{
		SLTPushFront(pphead,x);
	}
	else 
	{
		SLTNode* pcur = *pphead;
		while (pcur->next != pos)
		{
			pcur = pcur->next;
		}
		SLTNode* newnode = CreateNode(x);
		newnode->next = pos;
		pcur->next = newnode;
	}
}

void SLTErase(SLTNode** pphead, SLTNode* pos)
{
	assert(pphead && *pphead);
	assert(pos);
	if (pos == *pphead)
	{
		SLTPopFront(pphead);
	}
	else 
	{
		SLTNode* pcur = *pphead;
		while (pcur->next != pos)
		{
			pcur = pcur->next;
		}
		pcur->next = pos->next;
		free(pos);
		pos = NULL;
	}
}

void SLTInsertAfter(SLTNode** pphead, SLTNode* pos, SLTDataType x)
{
	assert(pphead && *pphead);
	assert(pos);
	SLTNode* newnode = CreateNode(x);
	SLTNode* pnext = pos->next;
	newnode->next = pnext;
	pos->next = newnode;
}

void SLTEraseAfter(SLTNode** pphead, SLTNode* pos)
{
	assert(pphead && *pphead);
	assert(pos);
	SLTNode* del = pos->next;
	pos->next = del->next;
	free(del);
	del = NULL;
}

void SLTDestroy(SLTNode** pphead)
{
	assert(pphead && *pphead);
	SLTNode* pcur = *pphead;
	while (pcur)
	{
		SLTNode* next = pcur->next;
		free(pcur);
		pcur = next;
	}
	*pphead = NULL;
}
