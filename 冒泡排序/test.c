#include<stdio.h>

void bubble_sort(int arr[], int sz)
{
	for (int i = 0; i < sz-1; i++) {
		for (int j = 0; j < sz - i - 1; j++) {
			if (arr[j] > arr[j+1])
			{
				int tmp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = tmp;
			}
		}
	}
}

int main()
{
	int arr[] = { 3,5,1,7,6,2,9,4,8 };
	int sz = sizeof(arr) / sizeof(arr[0]);
	printf("≈≈–Ú«∞:");
	for (int j = 0; j < sz; j++)
	{
		printf("%d ", arr[j]);
	}
	printf("\n");
	printf("≈≈–Ú∫Û:");
	bubble_sort(arr,sz);
	for (int i = 0; i < sz; i++)
	{
		printf("%d ", arr[i]);
	}
	return 0;
}