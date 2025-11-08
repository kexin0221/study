#include<stdio.h>
int main()
{
	FILE* pf = fopen("text.txt", "r");
	if (pf == NULL)
	{
		perror("fopen");
		return 1;
	}
	fclose(pf);
	pf = NULL;
	return 0;
}