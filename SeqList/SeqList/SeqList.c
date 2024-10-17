#include "SeqList.h"

void Init(SL* ps)
{
	ps->arr = NULL;
	ps->capacity = ps->size = 0;
}

void Destroy(SL* ps)
{
	if (ps->arr)
	{
		free(ps->arr);
	}
	ps->arr = NULL;
	ps->capacity = ps->size = 0;
}

//void Print(SL s)
//{
//	for (int i = 0; i < s.size; i++)
//	{
//		printf("%d ", s.arr[i]);
//	}
//	printf("\n");
//}

void SLPushFront(SL* ps, SLDataType x)
{
	assert(ps);
	CheckCapacity(ps);
	for (int i = ps->size - 1; i >= 0; i--)
	{
		ps->arr[i + 1] = ps->arr[i];//arr[1]=arr[0]
	}
	ps->arr[0] = x;
	ps->size++;
}

void CheckCapacity(SL* ps)
{
	if (ps->capacity == ps->size)
	{
		int newcapacity = ps->capacity ? 4 : 2 * ps->capacity;
		SLDataType* tmp = (SLDataType*)realloc(ps->arr, newcapacity * sizeof(SLDataType));
		//À©ÈÝÊ§°Ü
		if (tmp == NULL)
		{
			perror("realloc error");
			exit(1);
		}
		//À©ÈÝ³É¹¦
		ps->arr = tmp;
		ps->capacity = newcapacity;
	}
}

void SLPushBack(SL* ps, SLDataType x)
{
	assert(ps);
	CheckCapacity(ps);
	ps->arr[ps->size++] = x;
}

void SLPopFront(SL* ps)
{
	assert(ps);
	assert(ps->size);
	for (int i = 0; i < ps->size - 1; i++)
	{
		ps->arr[i] = ps->arr[i + 1];//arr[size-2]=arr[size-1]
	}
	ps->size--;
}

void SLPopBack(SL* ps)
{
	assert(ps);
	assert(ps->size);
	ps->size--;
}

void SLInsert(SL* ps, int pos, SLDataType x)
{
	//4 3 2 1
	//pos=2 x=5
	//4 5 3 2 1 
	assert(ps);
	assert(pos >= 0 && pos <= ps->size);
	CheckCapacity(ps);
	for (int i = ps->size ; i > pos - 1; i--)
	{
		ps->arr[i] = ps->arr[i - 1];//arr[2]=arr[1]
	}
	ps->arr[pos - 1] = x;
	ps->size++;
}

void SLDelete(SL* ps, int pos)
{
	//4 5 3 2 1 
	//pos=3
	//4 3 2 1
	assert(ps);
	assert(ps->size);
	assert(pos >= 0 && pos <= ps->size);
	for (int i = pos - 1; i < ps->size; i++)
	{
		ps->arr[i - 1] = ps->arr[i];
	}
	ps->size--;
}

//int SLFind(SL* ps, SLDataType x)
//{
//	//4 3 2 1
//	//x=2
//	//3
//	for (int i = 0; i < ps->size; i++)
//	{
//		if (ps->arr[i] == x)
//		{
//			return i + 1;
//		}
//	}
//	return -1;
//}

