#include<stdio.h>

int Addition(int iNo1, int iNo2)
{
    int iAns = 0;

    printf("Inside Addition \n");

    iAns = iNo1 + iNo2;

    return iAns;
}

int main()
{
    int A = 11, B = 10, iRet = 0;

    printf("Inside main \n");

    iRet = Addition(A, B);

    printf("Addition is : %d\n",iRet);

    return 0;
}