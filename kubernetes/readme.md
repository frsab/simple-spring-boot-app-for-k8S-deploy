# Explication simple de la partie deploy de notre fichier **gitlab-ci.yml**
```BASH
deploy:
  stage: deploy
  environment: production
  script:
    - kubectl apply -f kubernetes/deployment.yaml
    - kubectl apply -f kubernetes/service.yaml
    - kubectl apply -f kubernetes/ingress.yaml
```
## Cette partie du pipeline déploie ton application sur Kubernetes en exécutant ces commandes :

1- **kubectl apply -f kubernetes/deployment.yaml** :  Crée ou met à jour le déploiement de ton application (les pods qui exécutent le conteneur).

2- **kubectl apply -f kubernetes/service.yaml** :Définit un Service Kubernetes pour exposer ton application à d'autres services ou à l'extérieur.

3- **kubectl apply -f kubernetes/ingress.yaml** : Configure un Ingress pour gérer l'accès via un nom de domaine et HTTPS (optionnel mais recommandé).