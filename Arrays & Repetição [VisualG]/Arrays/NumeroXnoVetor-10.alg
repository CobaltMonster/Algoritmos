algoritmo "NumeroXnoVetor-10"

var
array: vetor[0..10] de inteiro 
i, X: inteiro
encontrado: logico

inicio
encontrado := falso

para i de 1 ate 10 faca
    escreva("Digite o valor da posicao ", i, ": ")
    leia(array[i])
fimpara

escreva("Digite o numero X: ")
leia(X)

para i de 1 ate 10 faca
    se array[i] = X entao
        encontrado := verdadeiro
    fimse
fimpara

se encontrado entao
    escreva("X pertence ao vetor")
senao
    escreva("X nao pertence ao vetor")
fimse

fimalgoritmo