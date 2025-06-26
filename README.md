# 🦠 COVID‍-19 Statewise Tracker

A simple and visually appealing web application to view COVID‍-19 confirmed cases and risk zone classification for Indian states using a Spring Boot backend and a modern frontend.

---

## 📸 App Screenshots 

![Screenshot 2025-06-26 170245](https://github.com/user-attachments/assets/a8bf187d-3955-4d37-8c83-eb0db6d8cd62)

### 🌛 Night Mode

![Screenshot 2025-06-26 170316](https://github.com/user-attachments/assets/6ed47fdc-86b6-4610-9e6a-59ce51e6a379)


### 🔍 Search & Results

![Screenshot 2025-06-26 170359](https://github.com/user-attachments/assets/94878266-0bc8-4de8-a7a5-0ec2fc8dfd42)
![Screenshot 2025-06-26 170512](https://github.com/user-attachments/assets/bdd21ad7-ede5-428e-9fbf-bbc9c4611df9)
![Screenshot 2025-06-26 170619](https://github.com/user-attachments/assets/c67a3458-fbfa-4a9c-9a72-46c18010a217)


---

## 🌍 Project Overview

The COVID‍-19 Statewise Tracker lets users select or type an Indian state (with auto-suggestions) to fetch the **latest confirmed cases** along with a **risk zone label** (Low → Critical) based on thresholds.

- ✅ Clean and responsive UI
- 🔄 Light/Dark theme with toggle
- ⏳ Modern loading spinner
- 🧽 Auto-complete suggestions
- ☐ Threshold-based risk zones:
  - ≤ 10k: Low Risk 🟢
  - ≤ 100k: Moderate Risk �\dfe1
  - ≤ 500k: High Risk 🟠
  -
    >  500k: Critical Zone 🔴

---

## 🛠️ Tech Stack

- **Backend**: Java, Spring Boot, `RestTemplate`
- **Frontend**: HTML, CSS (with gradients/dark mode), JavaScript (fetch API + autocomplete)
- **Build**: Maven
- **Deployment**: Spring Boot embedded Tomcat
- **Data Source**: Rootnet COVID-19 API  
  - 📡 **API Reference**: [https://api.rootnet.in/covid19-in/unofficial/covid19india.org/statewise](https://api.rootnet.in/covid19-in/unofficial/covid19india.org/statewise)


---

## 📁 File Structure

```
Covid‍-19‍-StateWise‍-Tracker/
├── src/
│   ├── main/
│   │   ├── java/com/example/CovidApp/
│   │   │   ├── controller/
│   │   │   │   └── CovidController.java
│   │   │   ├── dto/
│   │   │   │   └── StateCovidInfo.java
│   │   │   ├── service/
│   │   │   │   └── CovidDataService.java
│   │   │   └── utility/
│   │   │       └── Util.java
│   │   └── resources/
│   │       └── static/
│   │           └── index.html
│   └── test/ ...
├── pom.xml
├── .gitignore
└── README.md
```

---

## 🔄 Application Flow

1. **User enters or selects state** in the search bar (autocomplete powered).
2. **Click "Get Cases"**, frontend sends request to Spring Boot backend.
3. Backend fetches the latest data from Rootnet API.
4. It finds the state’s `totalConfirmed` number.
5. It labels the state with a risk zone.
6. Returns structured information to frontend.
7. Frontend shows the data in a sleek card + loader + updated timestamp.

---

## 🚀 Setup & Run

1. **Clone the repository**

   ```
   git clone https://github.com/Azhar-Mansuri/Covid-19-StateWise-Tracker.git
   cd Covid-19-StateWise-Tracker
   ```

2. **Build with Maven**

   ```
   mvn clean install
   ```

3. **Run the Spring Boot app**

   ```
   mvn spring-boot:run
   ```

4. **Open your browser** at:\
   `http://localhost:8080/index.html`

---

## ✍️ Controller Endpoint

```
GET /covid-data/statewise/{state}
```

- **Request**: State name as path variable (e.g. Madhya Pradesh)
- **Response (Text)**:

```
Total Cases in Madhya Pradesh : 1041867
Zone : Critical Zone 🔴
```

(You can modify this to return JSON as needed.)

---

## 👍 Future Enhancements

- 📊 Use charts to visualize active trends
- 🕐 Cache common state responses to reduce API calls
- 📍 City/District wise Covid cases information
- 🌍 Add multi-language support (Hindi, etc.)

---


## 👤 Author

**Azhar Mansuri**\
🎓 B.Tech (IT) – Swami Vivekanand Group of Institutes, Indore\
🔗 [LinkedIn](https://www.linkedin.com/in/azhar-mansuri)

Leave a ⭐ if you like this project! 🌿

