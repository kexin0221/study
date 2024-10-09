#include "SeqList.h"
int main()
{
	SqList L;
	InitList(&L);
	CreateList(&L, 5);
	PrintList(L);
	return 0;
}