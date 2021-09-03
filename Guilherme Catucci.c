#include <stdio.h>

int main()
{
    int numeroa, numerob, somar, subtrair, multiplicar, dividir;

    printf("Calcular\n");
    printf("Coloque o primeiro numero: ");
    scanf("%i", &numeroa);
    printf("Coloque o segundo numero: ");
    scanf ("%i", &numerob);
    somar         = numeroa + numerob;
    subtrair      = numeroa - numerob;
    multiplicar   = numeroa * numerob;
    dividir       = numeroa / numerob;

    printf( "A soma e: %i\n", somar );
    printf( "A subtracao e: %i\n", subtrair );
    printf( "O produto e: %i \n", multiplicar );
    printf( "A divisão e: %i \n", dividir );

    return 0;
}


