# Micro-service-REST-Connector

* ## Objectifs : 

<p align="justify">Pour créer un microservice de gestion de comptes bancaires en utilisant Spring Boot, vous pouvez suivre les étapes suivantes :</p>

* ### Créez un projet Spring Boot : 
<p align="justify">Créez un nouveau projet Spring Boot en utilisant un outil de votre choix, tel que Spring Initializr. Ajoutez les dépendances nécessaires, y compris Web, Spring Data JPA, H2 (base de données en mémoire) et Lombok.</p>

* ### Créez l'entité JPA Compte : 
<p align="justify">Définissez une classe Compte qui représente l'entité Compte bancaire. Ajoutez les annotations JPA appropriées pour la persistance des données, telles que @Entity, @Id, @GeneratedValue, etc. Définissez les attributs tels que le numéro de compte, le solde, le titulaire du compte, etc.</p>

* ### Créez l'interface CompteRepository : 
<p align="justify">Créez une interface CompteRepository en utilisant Spring Data JPA. Cette interface héritera de l'interface JpaRepository et vous donnera un ensemble de méthodes prédéfinies pour effectuer des opérations CRUD sur l'entité Compte.</p>

* ### Testez la couche DAO : 
<p align="justify">Vous pouvez écrire des tests unitaires pour tester la couche DAO (Data Access Object) en utilisant un framework de test, tel que JUnit. Vous pouvez tester les méthodes du CompteRepository pour vérifier si elles fonctionnent correctement, par exemple, en ajoutant des comptes, en les récupérant, en les mettant à jour, etc.</p>

* ### Créez le service web RESTful : 
<p align="justify">Créez les endpoints REST pour gérer les opérations CRUD sur les comptes bancaires. Vous pouvez utiliser des annotations telles que @RestController, @GetMapping, @PostMapping, @PutMapping, @DeleteMapping, etc., pour définir les endpoints correspondants à chaque opération.</p>

* ### Testez le microservice web en utilisant un client REST comme Postman : 
<p align="justify">Utilisez un client REST tel que Postman pour tester les endpoints REST que vous avez créés. Vous pouvez envoyer des requêtes GET, POST, PUT, DELETE pour vérifier si les opérations de gestion des comptes fonctionnent comme prévu.</p>

* ### Générez et testez la documentation Swagger des API REST du microservice : 
<p align="justify">Utilisez la bibliothèque Springfox ou une autre bibliothèque compatible Swagger pour générer automatiquement la documentation de vos API REST. Vous pouvez accéder à la documentation générée et tester les API directement depuis l'interface Swagger.</p>

* ### Exposez une API RESTful en utilisant Spring Data Rest en exploitant des projections :
<p align="justify">Si vous souhaitez exposer une API RESTful basée sur Spring Data Rest, vous pouvez annoter votre interface CompteRepository avec @RepositoryRestResource et utiliser des projections pour personnaliser les données renvoyées par l'API.</p>

* ### Créez les DTOs (Data Transfer Objects) et Mappers : 
Définissez les DTOs pour transférer les données entre le client et le microservice. Vous pouvez utiliser des bibliothèques de mappage telles que ModelMapper ou MapStruct pour mapper les entités JPA aux DTOs et vice versa.</p>

* ### Créez la couche Service (métier) du microservice : 
<p align="justify">Créez une couche Service pour implémenter la logique métier associée à la gestion des comptes bancaires. Cette couche peut inclure des opérations telles que le virement, la consultation du solde, la recherche de comptes, etc. Les services peuvent interagir avec le CompteRepository pour effectuer les opérations de persistance nécessaires.</p>

<p align="justify">N'oubliez pas de configurer correctement votre application Spring Boot en ajoutant les annotations et les fichiers de configuration appropriés, tels que @SpringBootApplication, application.properties, etc.</p>

<img width="503" alt="1" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/c6be4b66-f1e8-4a7d-b264-328d13dabdc6">
<img width="503" alt="2" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/48725ed2-64db-4618-a27a-91bccc455361">
<img width="960" alt="3" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/f2bece14-3d74-4fd6-b650-8b9aeace0916">
<img width="960" alt="4" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/987eee8e-8ce7-4381-bf25-f5b5ff005cfd">
<img width="512" alt="5" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/206d546a-d382-46e8-9666-0dc9cf247b74">
<img width="960" alt="6" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/b4adf591-e81e-46d6-8446-5e26770ec093">
<img width="512" alt="7" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/43ce6791-a259-454f-af81-a7d80925a04c">
<img width="512" alt="8" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/b92e9f5d-da90-4727-b25a-e936af6334c3">
<img width="512" alt="9" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/fc834983-a934-46b3-a50d-a534e280b6c2">
<img width="960" alt="10" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/e96131c5-244d-419a-afb3-bf8dec08e7e7">
<img width="960" alt="11" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/d4253f6a-59d3-4699-b506-a130736d79e0">
<img width="512" alt="12" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/568ab74e-acc9-42d2-94c2-f0186aedd584">
<img width="512" alt="13" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/a0869638-0305-4896-90b4-93880487405a">
<img width="960" alt="14" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/3db8e12b-3f87-40a6-806a-3b400d34fcc4">
<img width="960" alt="15" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/7b39a4b9-b93c-4d45-b2e0-cafaeaea2053">
<img width="960" alt="16" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/0fc72641-db07-49fe-94ec-62960895f43b">
<img width="960" alt="17" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/dcdffaee-b1d6-4444-b07b-731c3eb27d26">
<img width="960" alt="18" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/c10f0c4f-c25b-4fac-a1ad-cb0fe1e39b48">
<img width="960" alt="19" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/e4ef4462-498a-4cc0-a55d-7f99d10d1935">
<img width="960" alt="20" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/be5b1cf1-e933-4ba2-ae20-a1b605876873">

