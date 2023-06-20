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
<img width="960" alt="21" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/0e19109d-c379-4060-a1a6-63631e451fc5">
<img width="960" alt="22" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/d5836543-fec7-47cd-8a1b-4a5f02e25e57">
<img width="960" alt="23" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/61045963-bcd6-4971-a6fd-aa6601ee54aa">
<img width="960" alt="24" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/f54274ff-14a8-4cd8-93b9-796b03806ea6">
<img width="960" alt="25" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/0ead86fb-1237-4513-9ac8-77a33640ff9f">
<img width="960" alt="26" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/7e0b3bc7-5ec2-4a35-b042-6c1dbcd69d93">
<img width="960" alt="27" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/018007f6-9443-4e4d-9fbb-a45dd3a407ab">
<img width="960" alt="28" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/0cd7b464-f259-49c7-bb67-ab61231d37ee">
<img width="960" alt="29" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/421134b9-dca3-4e42-9bff-3e9f41529a5d">
<img width="960" alt="30" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/dec37520-c04a-4e67-9768-30903be7410b">
<img width="960" alt="31" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/62683335-d379-4ab6-b616-e73a7b309584">
<img width="960" alt="32" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/d52d2d71-295a-49b0-b332-e26c366fb818">
<img width="960" alt="33" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/70fa586f-21c8-4a2e-8926-b34e29480c98">
<img width="960" alt="34" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/a41b5fa0-8726-44d8-8597-28c5040f4d50">
<img width="960" alt="35" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/05b0605d-b4ea-4c89-b131-ff259c6d73c8">
<img width="960" alt="36" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/617928e8-f2d9-4a0c-94ed-1c58f435f6cc">
<img width="960" alt="37" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/4faf0dde-b4b4-4c8e-b07d-a87f6b4da171">
<img width="960" alt="38" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/45beba70-330f-4307-8af0-fe25f3191083">
<img width="960" alt="39" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/37b52e49-1dfe-472f-8022-ce418a6872e5">
<img width="960" alt="40" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/8d0a22f8-c532-4749-9c9a-9cedb5e1c713">
<img width="960" alt="41" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/1f19639c-a5ee-4495-90f8-646d008ed152">
<img width="960" alt="42" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/6d2fa638-b69f-4229-a841-7f5ecbdb1f9e">
<img width="960" alt="43" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/06b99e91-67c5-4170-9080-d692af81067d">
<img width="960" alt="44" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/47825ba5-4647-41d6-9349-80087243d0af">
<img width="960" alt="45" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/8f432f79-6368-46a1-8614-185750465629">
<img width="960" alt="46" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/0f961cc4-22c2-4309-9b2a-8bc1ba5c5b8e">
<img width="960" alt="47" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/d35b3274-07e5-4f51-8dd3-1483af48bd88">
<img width="960" alt="48" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/c47bb5d0-a3f8-4e7a-abc3-0c262320f12d">
<img width="960" alt="49" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/378f439c-9e7b-4a4a-a4fd-a74ae5a75025">
<img width="960" alt="50" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/0d7fc065-25f1-4fc3-ae5f-46bfe620040e">
<img width="960" alt="51" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/d05852b9-9849-46b8-9187-03558a8da043">
<img width="960" alt="52" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/528ef1cc-dfe5-4c8d-aea7-00bc69eee868">
<img width="960" alt="53" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/263206d2-eb64-4045-a2b5-e2f39bc75798">
<img width="960" alt="54" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/88eb8f12-6045-40e6-a92b-299d1a3492e4">
<img width="960" alt="55" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/c4e5a629-f2fe-481f-89f1-8cd72d431d94">
<img width="960" alt="56" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/5aaa05e5-59ca-4840-98af-28228f59a693">
<img width="960" alt="57" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/860affb2-b1a1-4f85-8a8c-13c6711d48d1">
<img width="960" alt="58" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/87fc5404-a3f8-4cfc-95c2-7d5a2730ced9">
<img width="960" alt="59" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/63f4e4cb-99cb-4a59-91de-10b0d89f58cd">
<img width="960" alt="60" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/c162b614-8e33-4ae2-941f-0e70629a675d">
<img width="960" alt="61" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/d3707c11-74f7-47d5-811c-c4d55fb4ffb5">
<img width="960" alt="62" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/6a90fbc0-b8b4-44b5-86a1-73f44267d41e">
<img width="388" alt="63" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/5c2a4d86-3974-4513-8d30-9c8cdecf0785">
<img width="960" alt="64" src="https://github.com/aymaneisruby/Micro-service-REST-Connector/assets/105078337/ec844a60-edc4-40ea-8f7f-ea1615addf85">





