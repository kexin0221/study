#include "SeqList.h"
int main()
{
	SqList L;
	SqList M;
	InitList(&L);
	CreateList(&L, 5);
	PrintList(L);
	CreateList(&M, 5);
	SqList ret = MergeList(L, 5, M, 5);
	PrintList(ret);
	return 0;
}