algoritmo "MaiorMenor-20"

var
array: vetor[1..20] de inteiro
i, maior, menor: inteiro

inicio

para i de 1 ate 20 faca
    escreva("informe o valor da posicao ", i, ": ")
    leia(array[i])
fimpara

maior := array[1]
menor := array[1]

para i de 2 ate 20 faca
    se array[i] > maior entao
        maior := array[i]
    fimse

    se array[i] < menor entao
        menor := array[i]
    fimse
fimpara

escreval("maior valor: ", maior)
escreval("menor valor: ", menor)

fimalgoritmo
