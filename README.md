# SistemaPortuario
Sistema com foco em Padrões de Projeto

Visão Geral

Este sistema simula chamadas de trabalhadores portuários usando três padrões de projeto: 

Builder (para construir chamadas)

Decorator (para adicionar regras extras)

Strategy (para definir como os trabalhadores são notificados).


1. Builder Pattern - Criando Chamadas
   
O padrão Builder é usado para montar objetos complexos de forma clara e passo a passo. Evita construtores
longos e melhora a legibilidade do código.

Exemplo:

Chamada chamada = new ChamadaBuilder()

 .setTurno("Noturno")
 
 .setAtividade("Descarga de navio")
 
 .setLocal("Terminal 1")
 
 .build();
 
 
2. Decorator Pattern - Regras Extras
   
Este padrão permite adicionar funcionalidades extras às chamadas sem alterar sua estrutura. Cada regra
(como EPI obrigatório ou transporte incluso) é um decorador.

Exemplo:

ChamadaBase chamadaDecorada = new ChamadaSimples(chamada.toString());

chamadaDecorada = new RequisitoEPI(chamadaDecorada);

chamadaDecorada = new TransporteIncluso(chamadaDecorada);


3. Strategy Pattern - Estratégia de Notificação
   
O padrão Strategy permite definir diferentes formas de notificar os trabalhadores (SMS, Email, App),
trocando a implementação sem mudar o código principal.

Exemplo:

NotificacaoStrategy notificacao = new NotificacaoApp();

notificacao.notificar("Nova chamada: " + chamadaDecorada.getDescricao());

Funcionamento Completo

1. Cria a chamada com Builder.
2. Aplica regras com Decorator.
3. Envia notificação com Strategy.
Tudo isso de forma desacoplada, clara e flexível.

Benefícios

- Código organizado e modular
- Fácil de expandir (mais tipos de notificações, regras, etc)
- Ideal para praticar e demonstrar conhecimentos em Padrões de Projeto.
