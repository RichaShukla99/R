import javax.swing.JOptionPane;
 
class euler10001stPrimeNumber{
int e7(int N){
int flag =0;
int l =0;
for(int i =0, j =1; i<=N && j<j+1;j++){
flag = 0;
for(int k =2; k<j;k++){
if(j%k==0){
flag++;
System.out.println("flag = "+flag);
}

}
System.out.println("flag2++ = "+flag);
if(flag==0){
i=i+1;
l=j;
System.out.println("i = "+i);

System.out.println("l = "+l);
}

System.out.println("j = "+j);
}

return l;
}}
class sumSquareDifference{



int SQD(int N){
int a = 0,b=0;
for(int i = 1;i<=N;i++){
a=a+(i*i);
}
System.out.printf("\n sum of squares of first %d natural number = %d",N,a);
for(int i =1; i<=N;i++){
b = b+i;
}
b=b*b;
System.out.printf("\n square of sum of first %d natural number = %d  ",N,b);
System.out.printf(" \n difference between sum of squares of the first %d natural numbers and the square of the sum is %d ",N,(b-a));
return (b-a);
}}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class eulerLargestPalindromeProduct{

int palindrome(int n){
int n1 =n;
int n2 =0;
int ndigit = 0;
while(n1>0){
n2 =n1%10; ndigit++;

n1 = n1/10;
}

int n4 =  1;
for(int n3 = 1;n3<=ndigit;n3++) n4 = n4*10; 

n4 = n4/10;

n1 =n;
n2 =0;
int n5 =0;
while(n1>0){
n2 =n1%10; 
n5  =n5+(n2*n4);
n4 = n4/10;
n1 = n1/10;
}
if(n5 ==n) return n;
else return 0;
}



int largestPalindrome(int n){
int p =1;
int n4 =  1;
for(int n3 = 1;n3<=n;n3++){
n4 = n4*10;
}
int a = 1;
for(int n1 =1; n1<n4;n1++){
for(int n2 = 1; n2<n4;n2++){
p= n1*n2;
if(a<=palindrome(p)){
a=p;
}

}}
return a;
}}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class SmallestMultiple{
int smallestmultiple(int FROM, int TO){
int sm = 1;
int a = 0;
int count = 0;

while(sm<sm+1)
{count = 0;
//System.out.println(" inside while sm = "+sm);
for(int i = FROM;i<=TO;i++)
{
if(sm%i==0)
{
count++;
//System.out.println("count = "+count);
}
else
{
break;
}
}
if(count==TO){
if(a<sm)
{a=sm;
//System.out.println("a = "+a);
return a;
}

}
sm++;
}
//System.out.println("sm = "+sm);
return a;
}}



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Euler{
public static void main(String args[]){

eulerLargestPalindromeProduct euler4 = new eulerLargestPalindromeProduct();

//int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number of digit..."));
//String msg4 = "Largest palindrome made from the product of two "+n+"-digit number is ->"+euler4.largestPalindrome(n);
//JOptionPane.showMessageDialog(null,msg4);
/*
SmallestMultiple euler5 = new SmallestMultiple();
int f = Integer.parseInt(JOptionPane.showInputDialog("Enter the starting number(FROM)"));
int t = Integer.parseInt(JOptionPane.showInputDialog("Enter the starting number(TO)"));
String msg5 = " smallest multiple from "+f+" to "+t+" is = "+euler5.smallestmultiple(f,t);
//System.out.println(" smallest multiple from "+f+" to "+t+" is = "+euler5.smallestmultiple(f,t));
JOptionPane.showMessageDialog(null,msg5);

*/


/*

Euler 6: -

The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.



sumSquareDifference euler6 = new sumSquareDifference();
int N6 = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of N i.e. first N natural number"));
String msg6 = "difference between sum of squares of the first "+ N +" natural numbers and the square of the sum is "+ euler6.SQD(N6);
//euler6.SQD(N6);
JOptionPane.showMessageDialog(null,msg6);

*/


/*



By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?

*/

euler10001stPrimeNumber euler7 = new euler10001stPrimeNumber();
int N7 = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of Nth position to get Nth prime number	"));
String msg7 = " the  prime number at "+ N7+ " position is  "+ euler7.e7(N7);
JOptionPane.showMessageDialog(null,msg7);


}}
