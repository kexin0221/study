#define _CRT_SECURE_NO_WARNINGS 1

#include "Contact.h"
#include"SeqList.h"

//void test1()
//{
//	SL s;
//	Init(&s);
//	//Destroy(&s);
//	SLPushFront(&s, 1);
//	SLPushFront(&s, 2);
//	SLPushFront(&s, 3);
//	SLPushFront(&s, 4);
//	SLPushFront(&s, 5);
//	Print(s);
//	SLPushBack(&s, 6);
//	Print(s);
//	SLPopFront(&s);
//	Print(s);
//	SLPopBack(&s);
//	Print(s);
//	SLInsert(&s, 2, 5);
//	Print(s);
//	SLDelete(&s, 3);
//	Print(s);
//	int ret = SLFind(&s, 2);
//	if (ret > 0)
//	{
//		printf("找到了：%d", ret);
//	}
//	else
//	{
//		printf("没找到!");
//	}
//}

void menu()
{
	printf("******************通讯录******************\n");
	printf("*******1.增加联系人   2.删除联系人********\n");
	printf("*******3.修改联系人   4.查找联系人********\n");
	printf("*******5.展示联系人   0.   退出  *********\n");
	printf("******************************************\n");
}

int main()
{
	int op = -1;
	Contact con;
	ContactInit(&con);

	do {
		menu();
		printf("请选择您的操作：\n");
		scanf("%d", &op);

		switch (op)
		{
		case 1:
			ContactAdd(&con);
			break;
		case 2:
			ContactDel(&con);
			break;
		case 3:
			ContactModify(&con);
			break;
		case 4:
			ContactFind(&con);
			break;
		case 5:
			ContactShow(&con);
			break;
		case 0:
			printf("退出通讯录....\n");
			break;
		default:
			printf("输入错误，请重新选择您的操作！\n");
			break;
		}
	} while (op != 0);

	ContactDesTroy(&con);
	return 0;
}