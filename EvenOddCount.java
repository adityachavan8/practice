#include<stdio.h>
#include<conio.h>
void main()
{
	int a[5],i,Ecount=0,Ocount=0;
	printf("enter the array element");
	for(i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<5;i++)
	{
		if(a[i]%2==0)
		{
			Ecount++;
		}
		else
		{
			Ocount++;
		}
	}
	printf("even number=%d",Ecount);
	printf("odd number=%d",Ocount);
}
