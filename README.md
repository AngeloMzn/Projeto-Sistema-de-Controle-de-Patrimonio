# Projeto-Sistema-de-Controle-de-Patrimonio
Trabalho da matéria linguagem de programação orientada a objetos da faculdade. Tem o objetivo de aplicar conceitos de orientação a objetos pensando em uma real aplicação.

-lembrar de usar o random para gerar numero de patrimonio

-fazer metodos para movimentação interna(entre delegacias de patrimonio)

-passar numero de patrimonio como parametro para classe patrimonio (gerar o random na main e validar se ja existe um patrimonio com esse numero)

- usar no contrutor de classes filhas super(nPatrimonio, tpPatrimonio, estado), ou seja, puxar da classe pai essas informações sem prejudicar a compilação.


   public Material material(){
        Scanner sc = new Scanner(System.in);
        Random  r = new Random();
        String marca, local, estadoPatrimonio, descricaoMaterial, porte;

        System.out.println("Você está cadastrando um Material!");
        System.out.println("===============================");
        
        System.out.println("Digite a marca do material (Ex: geladeira eletrolux):");
        marca = sc.nextLine(); 

        System.out.println("Digite o local onde o material se encontra (Ex: 2º dp):");
        local = sc.nextLine(); 

        System.out.println("Digite o estado do Material(novo, velho, com defeito)");
        estadoPatrimonio = sc.nextLine();
   
   
    }