# Exercice 1 


## Objectifs

### Contexte

J'ai choisi la thématique du commerce en ligne comme source d'inspiration : vous allez créer un embryon d'application qui va permettre la création et la visualisation de clients et de commandes. C'est à la fois assez global pour ne pas impliquer d'éléments qui vous sont encore inconnus, et assez spécifique pour coller avec ce que vous avez appris dans ces chapitres et êtes capables de réaliser.

L'objectif premier de cette étape, c'est de vous familiariser avec le développement web sous Eclipse. Vous allez devoir mettre en place un projet en partant de zéro dans votre environnement, et y créer vos différents fichiers. Le second objectif est que vous soyez à l'aise avec l'utilisation de servlets, de pages JSP et de beans, et de manière générale avec le principe général d'une application Java EE.

### Fonctionnalités

#### Création d'un client

À travers notre petite application, l'utilisateur doit pouvoir créer un client en saisissant des données depuis un formulaire, et visualiser la fiche client en résultant. Puisque vous n'avez pas encore découvert les formulaires, je vais vous fournir une page qui vous servira de base. Votre travail sera de coder :

* un bean, représentant un client ;
* une servlet, chargée de récupérer les données envoyées par le formulaire, de les enregistrer dans le bean et de les transmettre à une JSP ;
* une JSP, chargée d'afficher la fiche du client créé, c'est-à-dire les données transmises par la servlet.

#### Création d'une commande
L'utilisateur doit également pouvoir créer une commande, en saisissant des données depuis un formulaire, et visualiser la fiche en résultant. De même, puisque vous n'avez pas encore découvert les formulaires, je vais vous fournir une page qui vous servira de base. Votre travail sera de coder :

* un bean, représentant une commande ;
* une servlet, chargée de récupérer les données envoyées par le formulaire, de les enregistrer dans le bean et de les transmettre à une JSP ;
* une JSP, chargée d'afficher la fiche de la commande créée, c'est-à-dire les données transmises par la servlet.

#### Contraintes
Comme je viens de vous l'annoncer, vous devez utiliser les deux formulaires comme base pour votre application. Vous les placerez directement à la racine de votre application, sous le répertoire WebContent d'Eclipse.