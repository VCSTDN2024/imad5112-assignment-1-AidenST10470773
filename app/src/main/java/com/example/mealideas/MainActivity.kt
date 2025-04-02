/* what is view binding https://youtu.be/By1jrbOTUF8?si=DYjyXR0HhLKul1oz
*how to make a dropdown menu but was changed from autocomplete textview to button https://youtu.be/jXSNobmB7u4?si=h_z71dLzeU71sp43
*how to make a set onClick lister for buttons https://youtu.be/r1P7slDbtd4?si=Aug31Pkjnuot5FoH
* map of function https://youtu.be/ff8uuCHtiZ8?si=PsQsebSipIRngwy6
*  intent function and how to do it https://youtu.be/2hIY1xuImuQ?si=sGshTue5myL4w3mT
* if and when statements for dropdown menu https://youtu.be/jXSNobmB7u4?si=h_z71dLzeU71sp43 , https://youtu.be/cKgZx5W01zM?si=IWF4_9fruALt8O8S
* toast display https://youtu.be/sOpS0mMN-sg?si=1TT52Fv10jJGWv5G
* clear button https://youtu.be/gHDSkiUksh8?si=1zrsuzunM1gB9tZ9
* exit button https://youtu.be/ceSj2b73C9g?si=w2z9CWeU1SfOFVDc
* showPopupMenu function https://youtu.be/jXSNobmB7u4?si=h_z71dLzeU71sp43
 */
package com.example.mealideas

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.mealideas.databinding.ActivityMainBinding

//In order for binding to function, in the gradle file I added the following code
// buildFeatures {
//        viewBinding = true
//    }

class MainActivity : AppCompatActivity() {
    // Declare a binding variable for the main activity layout
    private lateinit var mainBinding: ActivityMainBinding

    // Variable to store the selected meal type from the dropdown menu
    private var selectedMealType: String? = null

    // Button to trigger the dropdown menu for meal selection
    private lateinit var menuButton: Button

    // Button to generate a meal based on the selected type
    private lateinit var generateMealButton: Button

    // TextView to display the currently selected meal type
    private lateinit var selectedMealTextView: TextView

    // Button to exit the application
    private lateinit var exitButton: Button

    // Button to clear the selected meal type
    private lateinit var clearButton: Button

    // Map to store meal options categorized by meal type
    // This map stores the available meal options, categorized by meal type.
    // Each key in the map represents a meal type (e.g., "breakfast", "lunch"), and the corresponding value is a list of strings, where each string is a meal option for that type.
    private val mealOptions: Map<String, List<String>> = mapOf(
        "breakfast" to listOf("Bacon and Eggs with Coffee"),
        "Morning snack" to listOf("Yogurt"),
        "lunch" to listOf("Sandwich and a Salad"),
        "Lunch Snack" to listOf("Cheese Crackers"),
        "Dinner" to listOf("Pasta with Tomato Sauce and Steak"),
        "Dinner Snack" to listOf("Cookies and Almond Ice Cream"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        // Inflate the layout using view binding
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        // Set the content view to the root of the inflated layout
        // This line sets the root view of the inflated layout as the content view of the activity, making the UI visible to the user.
        setContentView(mainBinding.root)
        // Initialize the views from the binding object
        // These lines initialize the view variables (menuButton, generateMealButton, etc.) by assigning them the corresponding views from the binding object.
        // This allows us to interact with these views programmatically.
        menuButton = mainBinding.dropdownButton
        generateMealButton = mainBinding.generateMealButton
        selectedMealTextView = mainBinding.selectedMealTextView
        exitButton = mainBinding.ExitBtn

        // A Set click listener for the menu button to show the popup menu
        // This block sets a click listener on the menuButton.
        // When the button is clicked, the showPopupMenu function is called to display the dropdown menu.
        menuButton.setOnClickListener {
            showPopupMenu(menuButton, selectedMealTextView)
        }

        // This block sets a click listener on the clearButton.
        // When the button is clicked, it clears the selectedMealType, updates the selectedMealTextView to display "Selected Meal: None",
        // and shows a toast message confirming that the meal selection has been cleared.
        clearButton = mainBinding.ClearBtn
        clearButton.setOnClickListener {
            selectedMealType = null
            selectedMealTextView.text = "Selected Meal: None"
            Toast.makeText(this, "Meal selection cleared", Toast.LENGTH_SHORT).show()
        }

        // A Set click listener for the generate meal button to navigate to the meal display activity
        generateMealButton.setOnClickListener {
            //This code will check if a meal type has been selected
            if (selectedMealType != null) {
                // If a meal type has been selected, it creates an intent to start the MealDisplayActivity.
                val intent = Intent(this, MealDisplayActivity::class.java)
                // It then passes the selected meal type as an extra to the intent using intent.putExtra("MEAL_TYPE", selectedMealType).
                intent.putExtra("MEAL_TYPE", selectedMealType)

                // Retrieve meal options for the selected type and pass them as an extra
                val options = mealOptions[selectedMealType]
                if (options != null) {
                    intent.putStringArrayListExtra("MEAL_OPTIONS", ArrayList(options))
                }

                // Start the MealDisplayActivity, which will display the selected meal
                startActivity(intent)
            } else {
                // Show a toast message if no meal type is selected
                Toast.makeText(this, "Please select a meal type first", Toast.LENGTH_SHORT).show()
            }
        }
        // a set click listener for the exit button to close the application
        exitButton.setOnClickListener {
            finishAffinity()
        }


    }

    // Function to display the popup menu for meal selection
    // This function displays the popup menu for meal selection when the menuButton is clicked.
    private fun showPopupMenu(anchorView: Button, selectedMealTextView: TextView) {
        // Create a PopupMenu anchored to the specified view
        // It creates a PopupMenu object, anchored to the provided anchorView (menuButton).
        val menu = PopupMenu(this, anchorView)
        // Inflate the menu layout from the XML resource
        menu.menuInflater.inflate(R.menu.my_dropdown_menu, menu.menu)

        //A click listener for menu items
        // It sets a click listener for the menu items in the PopupMenu.
        menu.setOnMenuItemClickListener { menuItem: MenuItem ->
            // Determine the selected meal type based on the menu item ID,these id's can be found in the dropdown_item.xml file
            // The selectedMealType variable is updated with the corresponding meal type.
            // When a menu item is clicked, it determines the selected meal type based on the ID of the clicked menu item using a when statement.
            selectedMealType = when (menuItem.itemId) {
                R.id.menu_breakfast -> "breakfast"
                R.id.menu_morning_snack -> "Morning snack"
                R.id.menu_lunch -> "lunch"
                R.id.menu_lunch_snack -> "Lunch Snack"
                R.id.menu_dinner -> "Dinner"
                R.id.menu_dinner_snack -> "Dinner Snack"
                else -> null
            }

            // Update the selected meal TextView and show a toast message if a meal type is selected
            // If a meal type is selected (i.e., selectedMealType is not null), it updates the selectedMealTextView to display the selected meal type
            // and shows a toast message confirming the selection
            if (selectedMealType != null) {
                selectedMealTextView.text = "Selected Meal: $selectedMealType"
                Toast.makeText(this, "$selectedMealType selected", Toast.LENGTH_SHORT).show()
            }
            // Return true to indicate that the menu item click was handled
            true
        }
        // Show the popup menu
        menu.show()


    }


}





