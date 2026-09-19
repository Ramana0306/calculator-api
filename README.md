# 🧮 Calculator App

A simple, fast calculator web application built by me as a fresher developer.

---

## 📱 Features

- ✅ Add two numbers
- ✅ Subtract two numbers
- ✅ Multiply two numbers
- ✅ Divide two numbers (with zero-division check)
- ✅ Clean and simple UI
- ✅ Real-time calculation

---

## 🛠️ Tech Stack

**Frontend:**
- React (JavaScript)
- Vite (build tool)
- CSS (styling)

**Backend:**
- Spring Boot (Java)
- Maven (build tool)
- REST API

**Deployment:**
- Railway (backend + frontend)

---

## 🚀 Live Demo

Visit here: [Calculator App](https://calculator-api-production-d825.up.railway.app/)

---

## 📂 Project Structure

```
calculator-api/
├── calculator-api/              (Backend - Spring Boot)
│   ├── src/main/java/
│   │   └── com/example/calculator_api/
│   │       ├── controller/
│   │       │   ├── CalculatorController.java
│   │       │   └── IndexController.java
│   │       └── model/
│   │           ├── CalculatorRequest.java
│   │           └── CalculatorResponse.java
│   └── pom.xml
│
└── calculator-frontend/         (Frontend - React)
    ├── src/
    │   ├── App.jsx
    │   ├── App.css
    │   └── main.jsx
    └── package.json
```

---

## 🎯 How It Works

1. **User enters two numbers** in the input fields
2. **Clicks an operation button** (Add, Subtract, Multiply, Divide)
3. **Frontend sends request** to backend API
4. **Backend calculates** the result
5. **Result displays** instantly on screen

---

## 📝 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/calculator/add` | Add two numbers |
| POST | `/api/calculator/subtract` | Subtract two numbers |
| POST | `/api/calculator/multiply` | Multiply two numbers |
| POST | `/api/calculator/division` | Divide two numbers |



**Live URL:** [calculator-api-production-d825.up.railway.app](https://calculator-api-production-d825.up.railway.app/)

---

## 🎓 What I Learned

- Building full-stack applications
- API design and implementation
- Frontend-backend integration
- Deployment and DevOps basics
- Git and GitHub workflow

---

## 📌 Future Improvements

- [ ] Add scientific calculator features
- [ ] Add calculation history
- [ ] Add keyboard support
- [ ] Add theme (dark/light mode)
- [ ] Add unit tests
- [ ] Add input validation UI
- [ ] Add more operations (power, square root, etc.)



**Made with ❤️ by Ram** 
*A simple calculator to learn full-stack development*
