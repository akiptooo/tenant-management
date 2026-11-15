# Tenant Management System

## 1. Project Description
The Tenant Management System is an Android application developed using Kotlin to help manage tenant information and rental records.

## 2. Features
- Tenant registration and login
- Add and view tenant details
- Display tenant information on the dashboard
- Save tenant records using Room Database
- View tenant records persistently
- Call tenants using the phone dialer

## 3. Application Architecture

The application follows a layered architecture:

**UI Layer (`ui/`)**
- Activities and Fragments
- TenantViewModel
- LiveData

**Data Layer (`data/`)**
- Tenant Entity
- TenantDao
- TenantDatabase
- TenantRepository

**Data Flow:**

Screens → TenantViewModel → TenantRepository → Room Database

## 4. Technologies Used
- Kotlin
- Android Studio
- XML
- ViewModel
- LiveData
- Room Database
- Git and GitHub

## 5. Group Members

| Stage | Member Name | Admission Number | Pull Request |
|---|---|---|---|
| Stage 1 | [andrew] | [183672] | [https://github.com/akiptooo/tenant-management] |
| Stage 2 | [nathen] | [191726] | [https://github.com/akiptooo/tenant-management] |
| Stage 3 | [shahnaz] | [191219]  [https://github.com/akiptooo/tenant-management] |
| Stage 4 | [hafsa] | [190516] | [https://github.com/akiptooo/tenant-management] |
| Stage 5 | [franklyne] | [189482] | [https://github.com/akiptooo/tenant-management] |
| Stage 6 | [fardosa] | [191727] | [https://github.com/akiptooo/tenant-management] |  
# tenant-management
