procedure MergeSort(niz as Array) Do:
    len = niz.length
    
    if len == 1 Then Stop return niz

    levi  := []
    desni := []
        
    for i := 1 to len // 2 do
        levi.append(niz[i])
        desni.append(niz[len // 2 + i ])
    end for
    
    MergeSort(levi)
    MergeSort(desni)
    
    konacniNiz := merge(levi, desni)
    
def mergeSort(nasa_lista):
    if len(nasa_lista) > 1: 
        levi = nasa_lista[:len(nasa_lista)//2]
        desni = nasa_lista[len(nasa_lista)//2:]
        
        mergeSort(levi)
        mergeSort(desni)
        merge(levi, desni, nasa_lista)

def merge(levi, desni, nasa_lista):
    i = j = k = 0
    
    while i < len(levi) and j < len(desni):
        if levi[i] <= desni[j]:
            nasa_lista[k] = levi[i]
            i += 1
        else:
            nasa_lista[k] = desni[j]
            j += 1
        k += 1
        
    # ovim delom dodajemo poslednji clan koji je ostao,
    # uvek ce ostati jer prethodni deo zahteva 2 uslova
    while i < len(levi):
        nasa_lista[k] = levi[i]
        i += 1
        k += 1    
    while j < len(desni):
        nasa_lista[k] = desni[j]
        j += 1
        k += 1

nasa_lista = [12,5,32,86,5,6,8,1]
print("Ulazna lista", nasa_lista)
mergeSort(nasa_lista)
print("Sortirana lista", nasa_lista)
