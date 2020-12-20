# BootstrapBuilder
Aplikacja dla programistów webowych, którzy chcą szybko utworzyć szkielet aplikacji z wykorzystaniem frameworka Bootstrap 4. Program pozwala na zwrócenie kodu strony z nagłówkiem, stopką, a także odpowiednimi tagami META w kontekście SEO zwykłego, Open Graph i Twittera. Aplikacja będzie dostępna poprzez GUI, a także jako zdalne API, dzieki czemu można ją zintegrować z istniejącymi narzędziami.

Projekt wykonany przez:
- Macieja Hercoga
- Wojciecha Koszelę
- Marię Mikołajczak
- Michała Mędzina

## Instrukcja użycia
### Narzędzie `curl`:
1. Uruchomić aplikację.
2. W terminalu wpisać:

``
curl -X GET --header "Content-type: application/json" --data "{<YOUR JSON CONTENT>}" "localhost:8080/bootstrap_builder/"
``

Na przykład:
`curl -X GET --header "Content-type: application/json" --data "{\"header\" : \"static\"}" "localhost:8080/bootstrap_builder/"`
