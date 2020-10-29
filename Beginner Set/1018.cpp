#include<stdio.h>
#include<math.h>

int main(){
    int N, cem, cin, cin1, vin, vin1, dez, dez1, cinco, cinco1, dois, dois1, um, um1;

    scanf("%d", &N);
    printf("%d\n", N);
    cem = N/100;
    cin = N%100;
    cin1 = cin/50;
    vin = cin%50;
    vin1 = vin/20;
    dez = vin%20;
    dez1 = dez/10;
    cinco = dez%10;
    cinco1 = cinco/5;
    dois = cinco%5;
    dois1 = dois/2;
    um = dois%2;
    um1 = um/1;

    printf("%d nota(s) de R$ 100,00\n",cem);
    printf("%d nota(s) de R$ 50,00\n",cin1);
    printf("%d nota(s) de R$ 20,00\n",vin1);
    printf("%d nota(s) de R$ 10,00\n",dez1);
    printf("%d nota(s) de R$ 5,00\n",cinco1);
    printf("%d nota(s) de R$ 2,00\n",dois1);
    printf("%d nota(s) de R$ 1,00\n",um1);

    return 0;
}
