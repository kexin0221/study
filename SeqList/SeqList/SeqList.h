#pragma once
#define _CRT_SECURE_NO_WARNINGS 1

#include"Contact.h"

#include<stdio.h>
#include<stdlib.h>
#include<assert.h>

#define N 10;

typedef struct PersonInfo SLDataType;
//动态顺序表
typedef struct SeqList
{
	SLDataType* arr;
	int size;
	int capacity;
}SL;

//初始化
void Init(SL* ps);
//销毁
void Destroy(SL* ps);
//打印
//void Print(SL s);
//头插
void SLPushFront(SL* ps, SLDataType x);
//扩容
void CheckCapacity(SL* ps);
//尾插
void SLPushBack(SL* ps, SLDataType x);
//头删
void SLPopFront(SL* ps);
//尾删
void SLPopBack(SL* ps);
//在指定位置前插入数据
void SLInsert(SL* ps, int pos, SLDataType x);
//在指定位置前删除数据
void SLDelete(SL* ps, int pos);
//查找数据
//int SLFind(SL* ps, SLDataType x);
