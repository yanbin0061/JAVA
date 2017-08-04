#include<iostream>
#include<fstream>
int main()
{
   using namespace std;
   string file;
   int num = 0; 
   file = "/myProgram/123.txt";
   ifstream infile;
   infile.open(file.data());
//   assert(infile.is_open());
   char c;
   while(!infile.eof())
   {
      num++;
      infile>>c;
      cout<<c;
      if(num%10==0)
      {
         cout<<endl;
      }
   }
   infile.close();
   return 0;
}
  
