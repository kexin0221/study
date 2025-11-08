#include<stdio.h>
int main()
{
	FILE* pf = fopen("data.txt", "w");
	if(pf==NULL)
	{
		perror("fopen");
		return 1;
	}
	
	FILE* pf2 = fopen("data_copy.txt", "w");
	if (pf2 == NULL)
	{
		perror("fopen-2");
		fclose(pf);
		pf = NULL;
		return 1;
	}
	int ch = 0;
	while ((ch = fgetc(pf)) != EOF)
	{
		fputc(ch, pf2);
	}

	fclose(pf);
	pf = NULL;
	fclose(pf2);
	pf2 = NULL;
}