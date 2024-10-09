#include "SeqList.h"
int InitList(SqList* L)
{
	L->elem = (ElemType*)malloc(LIST_INIT_SIZE * 
		sizeof(ElemType));
	if (!L->elem)
	{
		exit(FALSE);
	}
	L->usedsize = 0;
	L->capacity = LIST_INIT_SIZE;
	return TRUE;
}

int ListInsert(SqList* L, int index, ElemType e)
{
	//index位置是否合法
	if (index<1 || index>L->usedsize)
	{
		return FALSE;
	}
	//顺序表容量是否充足
	if (L->usedsize == L->capacity)
	{
		SqList* newbase = (ElemType*)realloc(L->elem, (L->capacity + ADD_SIZE) * sizeof(ElemType));
		if (!newbase)
		{
			return FALSE;
		}
		L->elem = newbase;
		L->capacity += ADD_SIZE;
	}
	SqList* q = &L->elem[index - 1];
	for (SqList* p = &L->elem[L->usedsize - 1]; p >= q; --p)
	{
		*(p + 1) = *(p);
	}
	q = e;
	L->usedsize++;
	return TRUE;
}

int ListLength(SqList* L)
{
	return L->usedsize;
}

int GetElem(SqList* L, int index)
{
	return L->elem[index-1];
}

int CreateList(SqList L, int length)
{
	for (int i = 0; i < length; i++)
	{
		scanf_s("%d", L.elem[L.usedsize - 1]);
		L.usedsize++;
	}
	return TRUE;
}

int ListDelete(SqList* L, int index)
{
	//index位置是否合法
	if (index<1 || index>L->usedsize)
	{
		return FALSE;
	}
	SqList* p = &L->elem[index - 1];

	return TRUE;
}

int PrintList(SqList L)
{
	for (int i = 0; i < L.usedsize; i++)
	{
		printf("%d ", L.elem[i]);
	}
	printf("/n");
	return TRUE;
}
