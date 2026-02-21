algoritmo "MediaOuMelhor"

var
N, i, contador: inteiro
notas: vetor[1..1000] de real
media, soma: real

inicio
escreva("informe o numero de alunos (N): ")
leia(N)

soma := 0

para i de 1 ate N faca
    escreva("Digite a nota do aluno ", i, ": ")
    leia(notas[i])
    soma := soma + notas[i]
fimpara

media := soma / N
escreval(media)  

contador := 0

para i de 1 ate N faca
    se notas[i] >= media entao
        contador := contador + 1
    fimse
fimpara

escreval(contador)

fimalgoritmo
