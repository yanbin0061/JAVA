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
   mpz_set_str(n,"0XD11B49BF43234D6595219AB7C21730DE0A13A7A01E63831A4D4F8DC5A7E68FCA0E9768EF0DABCAD036E08E17E4B27C1151DF364556D8F93D19565D9F40F095A49C6185F2630671EB5EC1EAA514BEC32D93A0F0459B52F1E34D4B9113413403F66619262EF1D3CBB025648C997CD1438DE21CFE4BEA0C6E00C72FFDE587929CB3",0);
   mpz_set_str(p,"20000000089",10);
  // int is_prime = -1;
   while(flag)
   {
      //比第二个数大的下一个素数
      mpz_nextprime(p,p);
      mpz_fdiv_r(r,n,p);
      printf("数据6-3\n");
      gmp_printf("p = %Zd\n",p);
      gmp_printf("r = %Zd\n",r);
      if(mpz_get_ui(r)==0)
      {
         mpz_fdiv_q(q,n,p);
         gmp_printf("q = %Zd\n",q);
         gmp_printf("p = %Zd\n",p);
         flag = false;
      }
      if(mpz_get_ui(p)>40000000000)
      {
         printf("进行下一轮\n");
         flag = false;
      }
   }
   return 0;
}
