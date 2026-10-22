Feature: vérification des menus de la page dacceuil 
Scenario:  acceder a la page dacceuil 
Given utilisateur est dans la page dacceuil 
When utilisateur survole sur le menu  "Femme"  
And cliquer sue le sous menu "Chemises & Blouses"
Then utilisateuteur est dirigé vers la page "Chemises & Blouses"


