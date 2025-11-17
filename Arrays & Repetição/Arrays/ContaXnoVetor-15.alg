algoritmo "ContaXnoVetor-15"

var
array: vetor[1..15] de inteiro
i, X, contador: inteiro

inicio
contador := 0

para i de 1 ate 15 faca
    escreva("informe o valor da posicao ", i, ": ")
    leia(array[i])
fimpara

escreva("informe o numero X: ")
leia(X)

para i de 1 ate 15 faca
    se array[i] = X entao
        contador := contador + 1
    fimse
fimpara

escreva("X aparece ", contador, " vezes.")

fimalgoritmo
