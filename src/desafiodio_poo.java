class Animal {
    private String nome;
    private int idade;
    
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    
    public void emitirSom() {
        System.out.println("O animal emite um som");
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
}

 class Programa {
    public static void main(String[] args) {
        Animal animal = new Animal("Cachorro", 5);
        animal.emitirSom();
        
        System.out.println("Nome do animal: " + animal.getNome());
        System.out.println("Idade do animal: " + animal.getIdade());
        
        animal.setNome("Gato");
        animal.setIdade(3);
        
        System.out.println("Nome do animal atualizado: " + animal.getNome());
        System.out.println("Idade do animal atualizada: " + animal.getIdade());
    }
}
