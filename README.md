# 🚀 Spring Boot Application Deployment on Minikube

## 📋 Prerequisites

Ensure the following tools are installed:

- 🐳 Docker
- ☸️ Minikube
- 🛠️ kubectl
- ☕ Java 17
- 🌱 Spring Boot application with a Dockerfile

---

## 🚀 1. Start Minikube

Start the Minikube cluster:

```bash
minikube start
```

Configure your shell to use Minikube's Docker daemon:

```bash
eval $(minikube -p minikube docker-env)
```

---

## 🏗️ 2. Build Docker Image

List available Docker images:

```bash
docker images
```

Build the Spring Boot Docker image:

```bash
docker build -t springboot-k8s-demo:1.0 .
```

Verify the image was created:

```bash
docker images
```

---

## ☸️ 3. Create Kubernetes Deployment

Create the deployment:

```bash
kubectl create deployment springboot-k8s \
  --image=springboot-k8s-demo:1.0 \
  --port=8080
```

Verify the deployment:

```bash
kubectl get deployments
```

View deployment details:

```bash
kubectl describe deployment springboot-k8s
```

---

## 🔍 4. Verify Pods

List running pods:

```bash
kubectl get pods
```

View application logs:

```bash
kubectl logs <pod-name>
```

Example:

```bash
kubectl logs springboot-k8s-d6fb8959f-mh6c8
```

---

## 🌐 5. Expose the Application

Expose the deployment using a NodePort service:

```bash
kubectl expose deployment springboot-k8s --type=NodePort
```

Verify the service:

```bash
kubectl get services
```

Get the application URL:

```bash
minikube service springboot-k8s --url
```

---

## 📊 6. Open Kubernetes Dashboard

Launch the Minikube dashboard:

```bash
minikube dashboard
```

Enable the metrics server for additional dashboard features:

```bash
minikube addons enable metrics-server
```

---

## 🗑️ 7. Delete Resources

Delete the service:

```bash
kubectl delete service springboot-k8s
```

Delete the deployment:

```bash
kubectl delete deployment springboot-k8s
```

Verify that all pods are removed:

```bash
kubectl get pods
```

---

## 🛑 8. Stop and Delete Minikube

Stop the Minikube cluster:

```bash
minikube stop
```

Delete the Minikube cluster:

```bash
minikube delete
```

---

## 📄 9. Deploy Using YAML Configuration

Apply the Kubernetes manifest:

```bash
kubectl apply -f k8s-service.yaml
```

Verify resources:

```bash
kubectl get deployments
kubectl get services
kubectl get pods
```

---

## 🧰 Useful Commands

Check cluster nodes:

```bash
kubectl get nodes
```

List deployments:

```bash
kubectl get deployments
```

List services:

```bash
kubectl get services
```

List pods:

```bash
kubectl get pods
```

Describe a pod:

```bash
kubectl describe pod <pod-name>
```

Describe a service:

```bash
kubectl describe service springboot-k8s
```

View pod logs:

```bash
kubectl logs <pod-name>
```

---

## ✅ Workflow Summary

```text
🐳 Build Docker Image
        ↓
☸️ Create Deployment
        ↓
🔍 Verify Pods
        ↓
🌐 Expose Service
        ↓
🚀 Access Application
        ↓
📊 Monitor with Dashboard
```
