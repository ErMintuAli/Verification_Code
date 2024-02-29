package com.example.verification_code

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.chaos.view.PinView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var verify = findViewById<PinView>(R.id.otp_view)
        var verified = findViewById<TextView>(R.id.verify_view)
        verified.setOnClickListener{
            var data = verify.text
            verified.setText("Verifiad")
      showAlert()
        }
    }

    fun showAlert(){
        var alert = AlertDialog.Builder(this)
        alert.setTitle("Logout")
        alert.setMessage("are you sure to logout")
        alert.setPositiveButton("yes", DialogInterface.OnClickListener { dialog, which ->
            Toast.makeText(this, "Verification completed", Toast.LENGTH_SHORT).show()

        } )
        alert.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->

        } )

        alert.setNeutralButton("ok", DialogInterface.OnClickListener { dialog, which ->

        } )
        alert.show()
    }
}