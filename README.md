# Golf Homes & Kingdom — Society Management Prototype

Stack: **Java 17 + Spring Boot 3 + React/Vite + MySQL 8**.

Included UI flows: Admin dashboard, flat-owner accounts, committee/special members, planned/live/closed voting, multiple voting plans, fixed start/end time, live voting extension, one-vote-per-flat backend constraint, complaints, work/expenses, notices, meetings, reports and settings.

## Run
### MySQL
CREATE DATABASE golf_homes_society;
Edit `backend/src/main/resources/application.properties` and set `spring.datasource.password`.

### Backend
cd backend
mvn spring-boot:run

### Frontend
cd frontend
npm install
npm run dev

Frontend: http://localhost:5173 | Backend: http://localhost:8080

## Production security to add before deployment
JWT/session authentication, BCrypt password hashing, role-based authorization, OTP/email verification, CSRF/CORS hardening, audit log, scheduled poll auto-start/auto-close, immutable vote audit, backups and HTTPS.
