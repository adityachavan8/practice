#include<stdio.h>
#include<conio.h>
void main()
{
	int a[5],del,i;
	printf("enter the array element");
	for(i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("enter the deleted index");
	{
		scanf("%d",&del);
	}
	for(i=del;i<5-1;i++)
	{
		a[i]=a[i+1];
	}
	for(i=0;i<5-1;i++)
	{
		printf("%d",a[i]);
		}	
}
