# Meal Ideas App 
 [Aiden Munsamy]
 [StNo.ST10470773]
[IMAD5111]
[Higher certificate in mobile application and web development ]

----------------------------------------------------------




## Links
- **GitHub Repository**: [https://github.com/VCSTDN2024/imad5112-assignment-1-AidenST10470773]
- **YouTube Video**: [https://youtu.be/nFEiArW6hw4?si=CggJivTINoB6fNgJ]

--------------------------------------------------
## Project Overview

The Meal Ideas App is an Android application designed to provide users with quick meal suggestions based on selected meal types (breakfast, lunch, dinner, snacks). Users choose a meal type from a dropdown, navigate to a suggestion screen, and can clear selections or exit. The app uses a simple UI, view binding, and passes data between activities. It aims to solve the common problem of deciding what to eat with an easy-to-use interface and relevant suggestions, serving as a foundation for future enhancements like expanded databases and user customization.


------------------------------------------------------

## Purpose and Features


## Purpose:
The Meal Ideas App aims to simplify the process of deciding what to eat by providing users with quick and relevant meal suggestions. It addresses the common challenge of meal planning by offering a user-friendly interface to select a meal type and receive a corresponding meal idea. The app is designed to be a convenient tool for individuals seeking inspiration for their next meal, whether it's breakfast, lunch, dinner, or a snack.

## Key Features:

- Meal Type Selection:

- Description: Users can easily specify the type of meal they need an idea for by selecting from a dropdown menu. 
- Functionality: The app presents a clear and concise list of meal types, including:
Breakfast
Morning Snack
Lunch
Lunch Snack
Dinner
Dinner Snack
- User Interaction: Tapping a button reveals the dropdown menu, and selecting a meal type updates the app's state to reflect the user's choice. The selected meal type is also displayed on the screen for confirmation.

## Meal Suggestion:
- Description: Once a meal type is selected, users can navigate to a dedicated screen that displays a meal suggestion tailored to their choice.
- Functionality: Upon tapping a "Generate Meal" button (or similar), the app:
- Retrieves a meal suggestion from its internal database (currently a Map within the MainActivity).
- Presents the suggestion in a clear and readable format on a new screen (implemented by MealDisplayActivity).
- The suggestion could include the name of the dish, a brief description, or potentially more detailed information (depending on future enhancements).
- User Interaction: The transition to the meal suggestion screen is triggered by a button press, and the suggested meal is prominently displayed on the new screen.
## Clear Selection:
- Description: The app provides an option for users to clear their current meal type selection.
- Functionality: Tapping a "Clear" button (or similar) resets the app's state, removing the previously selected meal type.
- User Interaction: A button press clears the selection, and the app's display updates to indicate that no meal type is currently selected. A Toast message may also be displayed to confirm the action.
## Exit Application:
- Description: Users can easily exit the application from the main screen.
- Functionality: Tapping an "Exit" button (or similar) closes the app and returns the user to their device's home screen or previous app.
- User Interaction: A button press triggers the app's termination. Overall, the Meal Ideas App offers a streamlined and user-friendly approach to generating meal suggestions. Its core features are designed to be intuitive and efficient, providing a quick solution for users seeking meal inspiration.
------------------------------------------

## Design Considerations

# The design of the Meal Ideas App was based on the following key considerations:

- User Experience (UX): The app was designed with the goal of providing an intuitive and easy-to-navigate user interface, ensuring a seamless user experience. The primary actions (selecting a meal type and generating a suggestion) are easily accessible and clearly labeled.

- Simplicity: The design is minimalistic, focusing on the core features of meal type selection and suggestion without overwhelming the user with unnecessary options or information.

- Functionality: The app focuses on providing a straightforward solution for users seeking quick meal ideas, with clear actions for selecting a meal type, viewing a suggestion, clearing the selection, and exiting the app.

-----------------------------------------------------
## GitHub and GitHub Actions

This project was managed using **GitHub** for version control, where all code changes were committed and pushed regularly. GitHub enabled collaborative coding, allowing me to keep track of changes and maintain project integrity.

### GitHub Actions:
I utilized **GitHub Actions** to automate the build and deployment process. This includes:

- Running automated workflow to ensure the app’s functionality.
- Compiling the app into **APK** and **AAB** files, which are the formats required for distribution.
 ![Screenshot 2025-04-02 110054](https://github.com/user-attachments/assets/cc7e88f7-0afb-41e7-9849-d83966ce2756)




-------------------------------------------------------

### App Screenshots:
![Screenshot 2025-04-02 095659](https://github.com/user-attachments/assets/c643cd46-7838-496c-9c8d-34953c3e5aef)
( home screen which user selects meal type or type to retrieve their result )

![Screenshot 2025-04-02 100157](https://github.com/user-attachments/assets/c05c800b-45ab-4cb7-91bc-c09a343285ae)
(screen at which meal suggestion is suggested to the user)


### Video Demo:
A video showcasing the app's functionality can be viewed here: [https://youtu.be/X4soIOlu2yE?si=J1MxeLppWmZDKHuW].

-----------------------------------------------

## Challenges and Learnings

During the development of the Meal Ideas App, I encountered several challenges, including:

## Challenge 1:
- Implementing the dropdown menu for meal type selection.
-Solution: I researched and utilized the PopupMenu class in Android, learning how to inflate a menu from an XML resource and handle user selections effectively. This involved understanding how to create a menu resource file, populate it with items, and attach a click listener to respond to user choices. I also learned how to anchor the PopupMenu to a specific view (the button in this case) and ensure its proper display.

## Challenge 2:
- Passing data between activities.
- Solution: I learned to use Intent extras to pass the selected meal type from MainActivity to the MealDisplayActivity, ensuring the correct suggestion is displayed. This required understanding how to create an Intent, add data as key-value pairs using putExtra, and retrieve the data in the receiving activity using getExtra. I also explored passing an ArrayList of meal options using putStringArrayListExtra.

## Challenge 3:
- Structuring and managing meal options.
- Solution: I decided to use a Map to store meal options categorized by meal type. This involved choosing an appropriate data structure and understanding how to initialize and access data within the Map. I also considered how this structure could be expanded in the future to accommodate more meal types and options, potentially involving integration with a database or external data source.

## Challenge 4:
- Handling user feedback and interactions.
- Solution: I implemented Toast messages to provide feedback to the user upon selecting a meal type or clearing the selection. This involved learning how to create and display Toast messages with appropriate text and duration. I also focused on ensuring that button clicks and menu selections triggered the correct actions and provided a clear and responsive user experience.

## From these challenges, I learned the importance of:

- Understanding Android UI components and their interactions.
- Effectively navigating between activities and passing data.
- Choosing appropriate data structures for managing application data.
- Providing clear and timely feedback to users through UI elements and messages.
- Considering the scalability and maintainability of the codebase from the outset.
- These learnings have provided a solid foundation for future Android development projects, emphasizing the value of careful planning, research, and iterative development.

------------------------------------

## Future Enhancements

While the current version of the Meal Ideas App provides the core functionality, there are several features that could be added in the future, including:

- Expanded Meal Database: Integrate a more comprehensive database of meal suggestions, potentially using a local database (like SQLite or Room) or connecting to an external API that provides a wider variety of meal options. This would allow for a much richer and more diverse set of suggestions.

- User Customization: Allow users to add their own meal ideas to the database, categorize them, and have them included in the suggestions. This would personalize the app and make it more useful for individuals with specific dietary preferences or favorite meals.

- Filtering and Preferences: Implement filtering options to allow users to narrow down meal suggestions based on criteria such as dietary restrictions (vegetarian, vegan, gluten-free, etc.), cuisine type, ingredients, preparation time, or calorie count. This would cater to a broader range of user needs and preferences.

- Meal Details and Recipes: Provide more detailed information about each meal suggestion, including a list of ingredients, step-by-step cooking instructions, nutritional information, and potentially even images or videos. This would transform the app from a suggestion tool into a more complete meal planning resource.

- User Accounts and Synchronization: Introduce user accounts to allow users to save their favorite meal suggestions, custom meal ideas, and preferences. Synchronizing this data across devices would enhance the user experience and make the app more convenient for users who use multiple devices.

- Shopping List Integration: Add a feature that automatically generates a shopping list based on the ingredients required for a selected meal. This could be further enhanced by integrating with existing shopping list apps or online grocery services.

- Improved UI/UX: Refine the visual design and user interface to create a more polished and engaging experience. This could involve improving the layout, typography, color scheme, and overall aesthetics of the app. Consider implementing Material Design principles for a modern and consistent look and feel.

- Offline Functionality: Ensure that the app can function effectively even without an internet connection, at least for accessing previously viewed meal suggestions or a subset of the meal database. These enhancements would significantly improve the app's usability, versatility, and overall value to end-users, making it a more comprehensive and personalized tool for meal planning and inspiration.

--------------------------------------------

## References

1. back button https://youtu.be/jXSNobmB7u4?si=h_z71dLzeU71sp43
2. how to retrieve intent from main screen https://youtu.be/jXSNobmB7u4?si=h_z71dLzeU71sp43
3. additional information used for layout retrieved from  in class lessons with kingcade
4. what is view binding https://youtu.be/By1jrbOTUF8?si=DYjyXR0HhLKul1oz
5. how to make a dropdown menu but was changed from autocomplete textview to button https://youtu.be/jXSNobmB7u4?si=h_z71dLzeU71sp43
6. how to make a set onClick lister for buttons https://youtu.be/r1P7slDbtd4?si=Aug31Pkjnuot5FoH
7. map of function https://youtu.be/ff8uuCHtiZ8?si=PsQsebSipIRngwy6
8.  intent function and how to do it https://youtu.be/2hIY1xuImuQ?si=sGshTue5myL4w3mT
9. if and when statements for dropdown menu https://youtu.be/jXSNobmB7u4?si=h_z71dLzeU71sp43 , https://youtu.be/cKgZx5W01zM?si=IWF4_9fruALt8O8S
10. toast display https://youtu.be/sOpS0mMN-sg?si=1TT52Fv10jJGWv5G
11. showPopupMenu function https://youtu.be/jXSNobmB7u4?si=h_z71dLzeU71sp43
12. referance for image https://wallpaperbat.com/phone-hd-food-wallpapers

