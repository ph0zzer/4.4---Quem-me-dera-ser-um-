class Zoologico{
  void Comportamento() {
    Animal A1 = new AnimaisTerrestres();
    
    Animal A2 = new AnimaisAquaticos();
    
    Animal A3 = new AnimaisAquaticos();

    Animal A4 = new AnimaisTerrestres();
    
    Animal A5 = new AnimaisAquaticos();
    
    Animal A6 = new AnimaisAquaticos();

    Animal A7 = new AnimaisTerrestres();
    
    Animal A8 = new AnimaisAquaticos();
    
    Animal A9 = new AnimaisAquaticos();

    A1.nome = "Jabulani";
    A1.raca = "Leao";
    A1.peso = 90;

    A2.nome = "Vegeta";
    A2.raca = "Tubarao";
    A2.peso = 120;

    A3.nome = "Peixonauta";
    A3.raca = "Peixe";
    A3.peso = 2;

    A4.nome = "WillieWonka";
    A4.raca = "Macaco";
    A4.peso = 60;

    A5.nome = "Pericles";
    A5.raca = "Baleia";
    A5.peso = 1200;

    A6.nome = "ZecaPagodin";
    A6.raca = "Foca";
    A6.peso = 200;

    A7.nome = "DiegoduMadagascar";
    A7.raca = "Tigre";
    A7.peso = 95;

    A8.nome = "SnoopCat";
    A8.raca = "Golfinho";
    A8.peso = 300;

    A9.nome = "Fiona";
    A9.raca = "Sapo";
    A9.peso = 3;

    A1.exComp();

    A2.exComp();

    A3.exComp();

    A4.exComp();

    A5.exComp();

    A6.exComp();

    A7.exComp();

    A8.exComp();

    A9.exComp();
    
  }
}