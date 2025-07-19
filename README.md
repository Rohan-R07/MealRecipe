# 🍽️ Meal Recipe App

Meal Recipe is a modern Android application built with **Jetpack Compose**, **Retrofit**, and **Room**. It helps users discover delicious meals by category (like Chicken, Pork, etc.), view full meal details, and save their favorite meals for offline access. It also includes a powerful search feature and a clean, Material 3-inspired UI.

---

## ✨ Features

### 🧭 Category Browsing
- Browse meals by categories like Chicken, Pork, Seafood, etc.
- On clicking a category, the app fetches and shows meals under it.

### 📋 Detailed Meal View
- Each meal has a detailed screen showing:
  - Instructions to cook  
  - Ingredients  
  - YouTube video tutorial  
  - Source and category  
- Data fetched using Retrofit from [TheMealDB API](https://www.themealdb.com/api.php)

### 💾 Offline Saved Meals
- Save your favorite meals for offline viewing using **Room database**.
- Access all saved meals in the **Saved section**, even without internet.
- Long press a saved meal to **delete** it via an alert dialog.
- Use the dropdown menu to **Clear All** saved meals at once.

### 🔍 Search Functionality
- Search meals by name.
- Clicking a search result opens the full meal details.
- You can also save from the search result screen.

### 💅 Modern UI & UX
- Built with **Jetpack Compose** & **Material 3**
- Lottie animations and beautiful gradients
- Light/Dark theme support

---

## 🛠️ Built With

- 💻 [Kotlin](https://kotlinlang.org/)
- 🎨 [Jetpack Compose](https://developer.android.com/jetpack/compose)
- 🔌 [Retrofit](https://square.github.io/retrofit/)
- 🗂️ [Room](https://developer.android.com/jetpack/androidx/releases/room)
- 🧪 [ViewModel + StateFlow](https://developer.android.com/topic/libraries/architecture/viewmodel)
- 🧑‍🎨 Google Stitch UI guidelines

---

## 📦 Architecture

- MVVM (Model-View-ViewModel)
- Clean separation of concerns
- Retrofit used for API calls
- Room used for local storage
- State management with `StateFlow` and Compose’s `state` system

---

## 📸 Screenshots

> (Add screenshots of your app here — Category Screen, Meal Detail Screen, Saved Meals, Search)

---

# Clone the repository
git clone https://github.com/yourusername/meal-explorer.git

# Open in Android Studio
# Run on an emulator or physical device


## 🔐 Permissions Required

Add these permissions to your `AndroidManifest.xml`:

```xml
<uses-permission android:name="android.permission.INTERNET"/>
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>



