#pragma once

#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>

#define LIST_INIT_SIZE 100
#define ADD_SIZE 10
#define FALSE -2
#define TRUE 1

typedef int ElemType;
typedef struct
{
	ElemType* elem;
	int usedsize;//当前长度
	int capacity;//当前最大容量
}SqList;

//初始化顺序表
int InitList(SqList* L);
//插入元素
int ListInsert(SqList* L, int index, ElemType e);
//获取顺序表长度
int ListLength(SqList* L);
//获取元素值
int GetElem(SqList* L, int index);
//创建顺序表
int CreateList(SqList* L, int length);
//删除指定位置的元素
int ListDelete(SqList* L, int index);
//打印顺序表
int PrintList(SqList L);