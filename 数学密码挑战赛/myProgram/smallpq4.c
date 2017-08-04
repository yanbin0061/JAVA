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
   mpz_set_str(n,"0X803F734ED9E3A3FBDEF8E3540B7B676FB66D15D2E5139840CB3CD06E62634C00A48EA2BF9BC3D7A709DBB47BE7E27DFB2C0E5B81254E6C326691471AE6DDC4A35539018BA6305DAFF1C480F195118B1310C546C31FE62C7AEC2A947013AC2897D00FD60E7B792DD499315341895BD1D1C9AA923E9373E1E01E2856B4FC8C6893",0);
   mpz_set_str(p,"60000000029",10);
 // int is_prime = -1;
   while(flag)
   {
      //比第二个数大的下一个素数
      mpz_nextprime(p,p);
      mpz_fdiv_r(r,n,p);
      printf("数据4-4\n");
      gmp_printf("p = %Zd\n",p);
      gmp_printf("r = %Zd\n",r);
      if(mpz_get_ui(r)==0)
      {
         mpz_fdiv_q(q,n,p);
         gmp_printf("q = %Zd\n",q);
         gmp_printf("p = %Zd\n",p);
         flag = false;
      }
      if(mpz_get_ui(p)>70000000000)
      {
         printf("进行下一轮\n");
         flag = false;
      }
   }
   return 0;
}
