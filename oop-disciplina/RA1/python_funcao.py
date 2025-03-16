# Função gerar valores para lista
def lista_valores_aleatorio(tamanho_lista):
    from random import randint

    lista_vazia = []
    for _ in range(tamanho_lista):
        numero_gerado = randint(0, 100)
        lista_vazia.append(numero_gerado)
    
    return lista_vazia


# Programa Principal
tamanho = int(input('Tamanho da lista: '))
valores_lista = lista_valores_aleatorio(tamanho_lista=tamanho)
print(f'lista gerada: {valores_lista}\n')

for num in valores_lista:
    if num % 3 == 0:
        print(f'O número {num} é múltiplo de 3')
    else:
        print(f'O número {num} não é múltiplo de 3')

    if num % 2 == 0:
        print(f'O número {num} é par\n')
    else:
        print(f'O número {num} não é par\n')
