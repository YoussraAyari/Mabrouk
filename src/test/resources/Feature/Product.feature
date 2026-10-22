Feature: accéder à la page d'un produit 
Scenario:  selectionner un produit 
Given  utilisateur est accéder a la page Chemises & Blouses
When utilisateur clique sur le produit "CHEMISE À COL CLASSIQUE ET COUPE AMPLE"
Then utilisateur est dans la page produit "CHEMISE À COL CLASSIQUE ET COUPE AMPLE"