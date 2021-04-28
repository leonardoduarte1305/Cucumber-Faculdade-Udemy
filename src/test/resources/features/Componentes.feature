#language: pt
Funcionalidade: Acessar varios componentes html

  Contexto: 
    Dado que o usuario acessou o arquivo Campo de Treinamento

  Cenario: Validar campo TextField
    Quando o usuario digitar "Batatinha"
    Entao o resultado no campo text field deve ser "Batatinha"
