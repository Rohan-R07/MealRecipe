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
- 🧑‍🎨 [Google Stitch UI for UI](https://stitch.withgoogle.com/)

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

###Home Screen/Category Screen


This screen recording demonstrates the category navigation feature of the application. Users can browse various food categories such as chicken, beef, and more. Selecting a category displays dishes specific to that category. When a dish is chosen, detailed information appears—including the recipe ingredients, step-by-step instructions, and a YouTube source link for reference. This flow highlights how users can easily explore and discover new recipes within the app.


https://github.com/user-attachments/assets/11365978-f2e7-4823-8797-0139205a4ceb


##Per Dish Details Screen

This screen recording demonstrates the user journey within the application. It starts with the main category selection, where users can choose from options such as chicken, beef, and more. After selecting a category, the app displays related food dishes. When a specific dish is chosen, the detailed view provides the recipe ingredients, step-by-step preparation instructions, and a source link to a YouTube video for additional guidance. This recording highlights the smooth navigation between categories and food details, offering users an easy way to discover and prepare new recipes.




https://github.com/user-attachments/assets/df602811-06d5-4337-9ce4-313bf0b6fd8c


### Search Screen

The following screen recording demonstrates the main user flow of the app. Users start by selecting a food category (e.g., chicken, beef, etc.), which leads to a list of relevant dishes. Upon choosing a dish, the detailed view provides complete ingredient lists, step-by-step instructions, and an embedded YouTube source link for further guidance. This recording showcases the app’s streamlined navigation, intuitive interface, and comprehensive recipe presentation.




https://github.com/user-attachments/assets/0ec83fd2-be5c-4c56-97f3-f1e45e71262f


### Saved Screen


## Profile Screen

this screen contains dummy data no data in this screeen is Real

<img width="390" height="844" alt="Screenshot 2025-07-23 193822" src="https://github.com/user-attachments/assets/97f96371-e459-490c-aee7-a3471a6add1c" />


### Saved Screen


This screen recording demonstrates the app’s main user flow: browsing recipe categories such as chicken and beef, viewing dishes specific to each category, and exploring detailed information for a selected dish. The detail view includes ingredients, step-by-step instructions, and a YouTube source link for preparation guidance, highlighting the app’s easy navigation and comprehensive recipe presentation.



https://github.com/user-attachments/assets/cfbfba11-db83-4b76-9be6-9dff2bb7ca83



---

# Clone the repository

```bash
git clone https://github.com/yourusername/meal-explorer.git

```
# Open in Android Studio
# Run on an emulator or physical device


## 🔐 Permissions Required

Add these permissions to your `AndroidManifest.xml`:

```xml
<uses-permission android:name="android.permission.INTERNET"/>
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>



