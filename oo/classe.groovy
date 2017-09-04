class person{
    String name
    Integer idade

    person(name, idade){
        this.name = name
        this.idade = idade
    }

    String getName(){
        return this.name
    }

    Integer getIdade(){
        return this.idade
    }
}

def p = new person("Luis", 25)
def nome
def idade
nome = p.getName()
idade = p.getIdade()
println "${nome} ${idade}"