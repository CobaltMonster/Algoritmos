algoritmo "Sorteio"

var
N, i: inteiro
tickets: vetor[1..1000] de inteiro

inicio
escreval("informe a quantidade de tickets (N): ")
leia(N)

para i de 1 ate N faca
    escreva("informe o numero do ticket na posicao ", i, ": ")
    leia(tickets[i])
fimpara

para i de N ate 1 passo -1 faca
    escreva(tickets[i], " ")
fimpara

fimalgoritmo
