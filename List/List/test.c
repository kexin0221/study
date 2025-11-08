#include"List.h"

void ListTest01()
{
	//LTNode* plist = NULL;
	//LTInit(&plist);
	LTNode* plist = LTInit();

	LTPushFront(plist, 1);
	LTPrint(plist);

	LTPushBack(plist, 2);
	LTPrint(plist);

	LTPushBack(plist, 3);
	LTPrint(plist);

	LTPushBack(plist, 4);
	LTPrint(plist);

	LTPushBack(plist, 5);
	LTPrint(plist);

	LTPopBack(plist);
	LTPrint(plist);

	LTPopFront(plist);
	LTPrint(plist);

	LTNode* find = LTFind(plist, 3);
	if (find == NULL)
	{
		printf("找不到！\n");
	}
	else {
		printf("找到了！\n");
	}

	LTErase(find);
	find = NULL;

	LTPrint(plist);
	LTDestroy(plist);
}

int main()
{
	ListTest01();
	return 0;
}