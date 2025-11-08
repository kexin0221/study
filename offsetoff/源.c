#include<stdio.h>
#include<stddef.h>

struct S
{
	char a;
	int b;
	char c;
	short d;
};
int main()
{
	//offsetofºêµÄÊ¹ÓÃ
	size_t ret = offsetof(struct S, b);
	printf("%zd", ret);

	return 0;
}