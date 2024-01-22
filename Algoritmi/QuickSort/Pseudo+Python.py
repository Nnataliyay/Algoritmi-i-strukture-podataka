def particionisanje(nasa_lista, start, end):
    
    pivot = nasa_lista[end]
    
    i = start - 1
    
    for j in range(start, end):
        if(nasa_lista[j] <= pivot):
            i = i + 1
            nasa_lista[i], nasa_lista[j] = nasa_lista[j], nasa_lista[i]
    nasa_lista[i + 1], nasa_lista[end] = nasa_lista[end], nasa_lista[i + 1]
    return i + 1

def quickSort(nasa_lista, start, end):
    if(start < end):
        pivot = particionisanje(nasa_lista, start, end)
        quickSort(nasa_lista, start, pivot - 1)
        quickSort(nasa_lista, pivot + 1, end)

nasa_lista = [ 3, 4, 33, 1, 12, 99, 235, 5, 1977]
quickSort(nasa_lista, 0, len(nasa_lista) - 1)
print(nasa_lista)
