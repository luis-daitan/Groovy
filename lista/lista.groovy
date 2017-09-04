
def lista = []

for(int i=0;i<10;i++){
    if (i%2 == 0){
        lista.add("Par")
    }
    else {
        lista.add("Impar")
    }
}
println lista
for(i in 1 .. 2){
    if(lista[i]=="Par"){
        lista.remove(i)
    } 
}
println lista