# ☕ Estudos em Java: Collections, Streams e Expressões Lambda

Repositório dedicado à prática de estruturas de dados da **Collections Framework** (`List`, `Set`, `Map`), **Programação Funcional** (`Streams API`, Expressões Lambda, Method References) e manipulação de arquivos (`BufferedReader` / CSV) utilizando recursos modernos do **Java (JDK 21 / 25)**.

---

## 📂 Estrutura dos Exercícios

O repositório está dividido em três módulos práticos:

### 1. 📊 Análise de Funcionários (`Empregado/`)
Programa que lê os dados de funcionários (nome, e-mail e salário) a partir de um arquivo `.csv` e realiza operações de filtragem e agregação utilizando **Java Streams e Expressões Lambda**.

* **Funcionalidades:**
  * Filtra e exibe, em ordem alfabética, os e-mails dos funcionários cujo salário é superior a um valor informado pelo usuário.
  * Calcula a soma dos salários de todos os funcionários cujo nome começa com a letra `'M'`.
* **Conceitos aplicados:**
  * Programação Orientada a Objetos (entidade `Employee`).
  * Pipelines de `Stream`: `filter()`, `map()`, `sorted()`, `mapToDouble()`, `sum()` e `collect()`.
  * Expressões Lambda (`x -> ...`) e Method References (`System.out::println`).
  * Leitura de arquivos com `try-with-resources` (`BufferedReader` e `FileReader`).

**Exemplo de entrada (`in.csv`):**
```csv
Maria,maria@gmail.com,3200.00
Alex,alex@gmail.com,1900.00
Marco,marco@gmail.com,1700.00
Bob,bob@gmail.com,3500.00
Anna,anna@gmail.com,2800.00
```

---

### 2. 🗳️ Apuração de Votos (`Candidatos/`)
Programa que lê registros de urnas eletrônicas a partir de um arquivo `.csv` e consolida o total de votos de cada candidato.

* **Funcionalidades:**
  * Lê múltiplos registros contendo o nome do candidato e a quantidade de votos na seção.
  * Acumula os votos por candidato mantendo a ordem de inserção.
* **Conceitos aplicados:**
  * Estrutura chave-valor com `Map<String, Integer>` (`LinkedHashMap`).
  * Manipulação e leitura de arquivos `.csv` com `BufferedReader`.

**Exemplo de entrada (`in.csv`):**
```csv
Alex Blue,15
Maria Green,22
Bob Brown,21
Alex Blue,30
Bob Brown,15
Maria Green,27
Maria Green,22
Bob Brown,25
Alex Blue,31
```

---

### 3. 🎓 Portal de Cursos Online (`Portal-curso/`)
Programa que calcula o número total de alunos únicos matriculados em três cursos distintos (`A`, `B` e `C`) de um instrutor.

* **Funcionalidades:**
  * Recebe os códigos de matrícula dos alunos de cada curso (um mesmo aluno pode estar matriculado em mais de um curso).
  * Calcula o total de estudantes únicos utilizando operações de conjunto (união).
* **Conceitos aplicados:**
  * Coleção de elementos únicos com `Set<Integer>` (`HashSet`).
  * Operação de união de conjuntos (`addAll`).

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 25 - utilizando *Compact Source Files* e *Instance Main Methods* `void main()`)
* **IDE:** IntelliJ IDEA

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/Nicolas1548/Express-es-lambda.git
   ```
2. Abra o projeto no **IntelliJ IDEA** (certifique-se de ter o **JDK 21+** ou **JDK 25** configurado).
3. Navegue até o arquivo `Main.java` do módulo desejado e execute-o.
