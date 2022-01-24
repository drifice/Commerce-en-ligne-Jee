# Exercice 1 


## Objectifs

### Contexte

J'ai choisi la th�matique du commerce en ligne comme source d'inspiration : vous allez cr�er un embryon d'application qui va permettre la cr�ation et la visualisation de clients et de commandes. C'est � la fois assez global pour ne pas impliquer d'�l�ments qui vous sont encore inconnus, et assez sp�cifique pour coller avec ce que vous avez appris dans ces chapitres et �tes capables de r�aliser.

L'objectif premier de cette �tape, c'est de vous familiariser avec le d�veloppement web sous Eclipse. Vous allez devoir mettre en place un projet en partant de z�ro dans votre environnement, et y cr�er vos diff�rents fichiers. Le second objectif est que vous soyez � l'aise avec l'utilisation de servlets, de pages JSP et de beans, et de mani�re g�n�rale avec le principe g�n�ral d'une application Java EE.

### Fonctionnalit�s

#### Cr�ation d'un client

� travers notre petite application, l'utilisateur doit pouvoir cr�er un client en saisissant des donn�es depuis un formulaire, et visualiser la fiche client en r�sultant. Puisque vous n'avez pas encore d�couvert les formulaires, je vais vous fournir une page qui vous servira de base. Votre travail sera de coder :

* un bean, repr�sentant un client ;
* une servlet, charg�e de r�cup�rer les donn�es envoy�es par le formulaire, de les enregistrer dans le bean et de les transmettre � une JSP ;
* une JSP, charg�e d'afficher la fiche du client cr��, c'est-�-dire les donn�es transmises par la servlet.

#### Cr�ation d'une commande
L'utilisateur doit �galement pouvoir cr�er une commande, en saisissant des donn�es depuis un formulaire, et visualiser la fiche en r�sultant. De m�me, puisque vous n'avez pas encore d�couvert les formulaires, je vais vous fournir une page qui vous servira de base. Votre travail sera de coder :

* un bean, repr�sentant une commande ;
* une servlet, charg�e de r�cup�rer les donn�es envoy�es par le formulaire, de les enregistrer dans le bean et de les transmettre � une JSP ;
* une JSP, charg�e d'afficher la fiche de la commande cr��e, c'est-�-dire les donn�es transmises par la servlet.

#### Contraintes
Comme je viens de vous l'annoncer, vous devez utiliser les deux formulaires comme base pour votre application. Vous les placerez directement � la racine de votre application, sous le r�pertoire WebContent d'Eclipse.