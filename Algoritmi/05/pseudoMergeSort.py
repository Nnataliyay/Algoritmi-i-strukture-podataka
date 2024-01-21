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
    
