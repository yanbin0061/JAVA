#include<iostream>
#include<stdio.h>
#include<gmp.h>
int main()
{
   //大整数
   mpz_t n ;
   //一个因子p
   mpz_t p;
   mpz_t q;
   mpz_t r;
   //初始化
   mpz_init(n);
   mpz_init(p);
   mpz_init(q);
   mpz_init(r);
   bool flag = true;
   //赋初值
   mpz_set_str(n,"0X845334AC0B3EB2239FDF0E3069750901E791CB774AD36941E30D85E5A0FED57749A30DC1F1F4CB191D9863F437C98293E8E8888B963BCF16B691F1D4EEF56C6807440E5FB5EC5B95DF3434DEDA30C60DCB4E77294BE027F984D5E675AEB1CBBE57E8CAF140226EAD6DCD9A9636A0CFF586FA434804CB09D7E8C48DE34EBE9049",0);
   mpz_sqrt(p,n);
//   mpz_set_str(p,"106733751329",10);
  // int is_prime = -1;
   while(flag)
   {
      //比第二个数大的下一个素数
      mpz_nextprime(p,p);
      mpz_fdiv_r(r,n,p);
      printf("数据1\n");
      gmp_printf("p = %Zd\n",p);
      gmp_printf("r = %Zd\n",r);
      if(mpz_get_ui(r)==0)
      {
         mpz_fdiv_q(q,n,p);
         gmp_printf("q = %Zd\n",q);
         gmp_printf("p = %Zd\n",p);
         flag = false;
      }
//      if(mpz_get_ui(p)>200000000000)
//      {
//         printf("进行下一轮\n");
//         flag = false;
//      }
   }
   return 0;
}
