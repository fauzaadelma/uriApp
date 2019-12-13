package com.example.uriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ReportActivity extends AppCompatActivity {
    int quantity =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void inc(View view) {
        if (quantity == 10) {
            // Show an error message as a toast
            Toast.makeText(this, "You can't give rating more than 10", Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * This method is cal led when the minus button is clicked.
     */
    public void dec(View view) {
        if (quantity == 0) {
            // Show an error message as a toast
            Toast.makeText(this, "You can't give rating under 1", Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        // Mengambil nama user
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        EditText pengarangField = (EditText) findViewById(R.id.pengarang_field);
        String pengarang = pengarangField.getText().toString();

        EditText commentField = (EditText) findViewById(R.id.comment_field);
        String comment = commentField.getText().toString();

        String priceMessage = createOrderSummary(name, pengarang, comment);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Penilaian terhadap " + name + " " + pengarang + " " + comment + " " );
        intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    private String createOrderSummary(String name, String pengarang, String comment) {
        String priceMessage = "Judul Buku: " + name;
        priceMessage += "\nPengarang: " + pengarang;
        priceMessage += "\nRating: " + quantity;
        priceMessage += "\nKomentar: " + comment;
        return priceMessage;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
