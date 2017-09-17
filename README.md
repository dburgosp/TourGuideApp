# Tour Guide App

This is a simple Android Studio project for the [Android Basics Nanodegree](https://www.udacity.com/course/android-basics-nanodegree-by-google--nd803) given by Udacity and Google. The goal was to create a tour guide app which presented relevant information to a user who’s visiting my city (I chose **Madrid**). The app could list top attractions, restaurants, public places, or events for the city. It could contain all the best known secrets that only locals know. It was up to us which categories you want to provide, as well as what information to provide in each category, so I decided to show information about **Culture**, **Leisure**, **Restaurants** and **Shopping** in Madrid.

The app provides different layouts for portrait and landscape orientations, and it also contains different resource files and dimens.xml for each screen density (mdpi density, hdpi, xhdpi, xxhdpi and xxxhdpi). There are 20 images for the main activity background, displayed randomly every time you go to the main screen of the app, and 10 tourist attractions for each of the 4 categories (Culture, Leisure, Restaurants and Shopping) stored locally into the app (texts into *strings.xml* and images into *drawable* folder, as indicated in the *Project Specifications* below).

Some screen captures in portrait orientation:

<IMG src="https://github.com/dburgosp/TourGuideApp/blob/master/img_main_portrait.jpg?raw=true" width="150" height="279" title="Main screen in portrait orientation" alt="Main screen in portrait orientation"/> <IMG src="https://github.com/dburgosp/TourGuideApp/blob/master/img_list_portrait.jpg?raw=true" width="150" height="279" title="List of attractions in portrait orientation" alt="List of attractions in portrait orientation"/> <IMG src="https://github.com/dburgosp/TourGuideApp/blob/master/img_detail_portrait.jpg?raw=true" width="150" height="279" title="Attraction details in portrait orientation" alt="Attraction details in portrait orientation"/> <IMG src="https://github.com/dburgosp/TourGuideApp/blob/master/img_photo_portrait.jpg?raw=true" width="150" height="279" title="Attraction image in portrait orientation" alt="Attraction image in portrait orientation"/> <IMG src="https://github.com/dburgosp/TourGuideApp/blob/master/img_map_portrait.jpg?raw=true" width="150" height="279" title="Map location" alt="Map location"/> <IMG src="https://github.com/dburgosp/TourGuideApp/blob/master/img_web_portrait.jpg?raw=true" width="150" height="279" title="Website of the attraction" alt="Website of the attraction"/>

... And some more screen captures in landscape orientation:

<IMG src="https://github.com/dburgosp/TourGuideApp/blob/master/img_main_landscape.jpg?raw=true" width="244" height="150" title="Main screen in landscape orientation" alt="Main screen in landscape orientation"/> <IMG src="https://github.com/dburgosp/TourGuideApp/blob/master/img_list_landscape.jpg?raw=true" width="244" height="150" title="List of attractions in landscape orientation" alt="List of attractions in landscape orientation"/> <IMG src="https://github.com/dburgosp/TourGuideApp/blob/master/img_detail_landscape.jpg?raw=true" width="244" height="150" title="Attraction details in landscape orientation" alt="Attraction details in landscape orientation"/> <IMG src="https://github.com/dburgosp/TourGuideApp/blob/master/img_photo_landscape.jpg?raw=true" width="244" height="150" title="Attraction image in landscape orientation" alt="Attraction image in landscape orientation"/>

# Project Specifications

## Layout

1. **Overall Layout**. App contains at least 4 lists of relevant attractions for a location.
2. **Navigation**. User can navigate between lists using a central screen, a [Navigation Drawer](https://developer.android.com/training/implementing-navigation/nav-drawer.html) or a [ViewPager](https://developer.android.com/reference/android/support/v4/view/ViewPager.html).
3. **List Item Contents**. Each list item contains information about an event, restaurant, historical site, or similar.
4. **Pictures**. At least one list includes pictures of the location.
5. **Layout Best Practices**. The code adheres to all of the following best practices:
   * Text sizes are defined in sp.
   * Lengths are defined in dp.
   * Padding and margin is used appropriately, such that the views are not crammed up against each other.

## Functionality

1. **Location Object**. App contains a custom object for storing location information.
2. **Custom Adapter**. App uses a custom adapter to populate the layout with views based on instances of the custom class.
3. **String Storage**. All strings are stored in the *strings.xml* resource file.
4. **Image Storage**. All images are stored as drawables. All drawables are stored at multiple densities.
5. **Errors**. The code runs without errors.

## Code Readability

1. **Readability**. Code is easily readable such that a fellow programmer can understand the purpose of the app.
2. **Naming Conventions**. All variables, methods, and resource IDs are descriptively named such that another developer reading the code can easily understand their function.
3. **Formatting**. The code is properly formatted:
   * No unnecessary blank lines.
   * No unused variables or methods.
   * No commented out code.
   * The code also has proper indentation when defining variables and methods.
