# Sistema Integrado de Votação e Feedback Acadêmico – Campus Calama

Projeto desktop desenvolvido em **Java Swing**, com arquitetura em camadas, voltado para gerenciar votações e feedbacks acadêmicos no Campus Calama.

> Este repositório foi criado como parte do projeto final da disciplina de Engenharia de Software, visando substituir métodos manuais por uma solução automatizada, **segura, transparente e inclusiva**.

---

## 🎯 Objetivo

Criar uma plataforma desktop que:
- Substitua processos manuais e descentralizados por uma solução automatizada
- Garanta **transparência, segurança e anonimato**
- Permita **eleições formais, pesquisas institucionais, feedback anônimo e enquetes rápidas**

---

## 🔧 Tecnologias Utilizadas

| Tecnologia | Uso |
|------------|-----|
| Java 17+ | Linguagem principal |
| Java Swing | Interface gráfica desktop |
| MySQL / JDBC | Banco de dados e persistência |
| Git + GitHub/GitLab | Controle de versão e colaboração |

---

## 🗂 Arquitetura em Camadas

O projeto segue uma **estrutura organizada em camadas** para facilitar manutenção e escalabilidade:

| Camada       | Função |
|--------------|--------|
| **Model**     | Entidades do sistema (`Usuario`, `Enquete`, `Voto`) |
| **View**      | Telas gráficas (`Login`, `Menu Principal`, etc.) |
| **Controller**| Lógica de ações do usuário |
| **Service**   | Regras de negócio (futuro) |
| **Repository**| Acesso ao banco de dados (simulado ou real) |
| **Util**      | Funções auxiliares (conexão com banco, logs) |

---

## 🚀 Como Executar o Projeto

### Pré-requisitos

- JDK 17 ou superior instalado
- IDE Java (como IntelliJ IDEA)
- Git instalado
- MySQL (opcional - futuro)

### Passo a passo

1. Clone o repositório:

\`\`\`bash
git clone git@github.com:Floriano200404/SistemaVotacaoFeedback.git
cd SistemaVotacaoFeedback
\`\`\`

2. Abra o projeto na sua IDE:
   - IntelliJ: File > Open > Selecione a pasta do projeto
   - Marque a pasta \`src\` como fonte (Sources Root)

3. Execute a classe \`Main.java\`

4. Teste com:
   - **Login:** \`admin\`
   - **Senha:** \`123\`


---

## 📋 Git Flow Adotado

Para garantir controle de versão seguro e eficiente, adotamos o seguinte fluxo:

| Branch | Finalidade |
|--------|------------|
| \`main\` | Versão estável do projeto – apenas via Pull Request |
| \`develop\` | Ramo de desenvolvimento principal |
| \`feature/nome-da-funcionalidade\` | Novas funcionalidades |
| \`bugfix/descricao\` | Correções de bugs |

### Exemplo de uso:

\`\`\`bash
git checkout develop
git pull origin develop

git checkout -b feature/tela-login
# Desenvolva sua nova tela

git add .
git commit -m "Tela de login concluída"
git push origin feature/tela-login
\`\`\`

Após revisão, abra uma **Pull Request** para \`develop\`.

---

## 👥 Integrantes do Projeto

| Nome | Função | Contato |
|------|--------|---------|
| Floriano Vieira de Araújo Neto | Gerente de Projeto | florianoneto2004@gmail.com |
| [Nome do colega] | Desenvolvedor | email@example.com |
| [Nome do colega] | Desenvolvedor / Testador | email@example.com |

---




## 💬 Ajuda e Suporte

Tem dúvidas? Encontrou problemas?
- Crie uma **issue** no repositório
- Ou entre em contato com o responsável pelo projeto

---

## 🤝 Contribuição

Contribuições são bem-vindas!

### Como contribuir:

1. Fork o projeto
2. Crie uma branch: \`git checkout -b feature/minha-feature\`
3. Faça suas alterações
4. Commit: \`git commit -m "Descrição das alterações"\`
5. Push: \`git push origin feature/minha-feature\`
6. Abra uma Pull Request

---



## 📌 Referências Úteis

- [Como criar merge requests](https://docs.gitlab.com/ee/user/project/merge_requests/creating_merge_requests.html )
- [GitLab CI/CD](https://docs.gitlab.com/ee/ci/quick_start/ )
- [Controle de branches](https://docs.gitlab.com/topics/git/add_files/ )
- [Integrações no GitLab](https://gitlab.com/silvakaio/sgi-3/-/settings/integrations )

---

> ✅ Este projeto é mantido por **Floriano Vieira de Araújo Neto**  
> Aluno de Analista de Sistema ADS – IFRO Campus Calama  
> Email: florianoneto2004@gmail.com
