/* meal options textview https://youtu.be/r1P7slDbtd4?si=Aug31Pkjnuot5FoH
* displayed meal textview https://youtu.be/jXSNobmB7u4?si=h_z71dLzeU71sp43
* back button https://youtu.be/jXSNobmB7u4?si=h_z71dLzeU71sp43
* how to retrieve intent from main screen https://youtu.be/jXSNobmB7u4?si=h_z71dLzeU71sp43
 */
package com.example.mealideas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mealideas.databinding.ActivityMealDisplayBinding


class MealDisplayActivity : AppCompatActivity() {
    // TextView to display the selected meal type
    private lateinit var displayedMealTextView: TextView
    // TextView to display the meal options for the selected type
    private lateinit var mealOptionsTextView: TextView
    // Button to return to the main activity
    private lateinit var returnButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content view to the layout for this activity
        setContentView(R.layout.activity_meal_display)

        // Initialize UI elements by finding them in the layout
        displayedMealTextView = findViewById(R.id.displayedMealTextView)

        mealOptionsTextView = findViewById(R.id.mealOptionsTextView)
        returnButton = findViewById(R.id.RtnBtn)

        // Retrieve the selected meal type from the intent extras
        val mealType = intent.getStringExtra("MEAL_TYPE")

        // Retrieve the list of meal options from the intent extras
        val mealOptions = intent.getStringArrayListExtra("MEAL_OPTIONS")

        // Display the selected meal type in the TextView
        displayedMealTextView.text = "Meal Type: $mealType"

        // Display the meal options in the TextView, or a default message if none are available
        if (mealOptions != null && mealOptions.isNotEmpty()) {
            mealOptionsTextView.text = "Options: ${mealOptions.joinToString(", ")}"
        } else {
            mealOptionsTextView.text = "Options: No specific options available."
        }

        // Set a click listener for the return button
        returnButton.setOnClickListener {
            // Create an intent to navigate back to the MainActivity
            val intent = Intent(this, MainActivity::class.java)
            // Start the MainActivity
            startActivity(intent)
            // Finish this activity to remove it from the back stack
            finish()
        }
    }
}