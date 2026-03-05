package com.example.vkeducation

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.vkeducation.databinding.ActivityFirstBinding


class FirstActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.openSecondActivityBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("TEXT_FROM_FIRST_ACTIVITY", binding.plainTextInput.text.toString())
            startActivity(intent)
        }
        binding.callFriendBtn.setOnClickListener {
            val phoneNumber = binding.plainTextInput.text.toString().trim()
            if (!isValidPhone(phoneNumber)) {
                Toast.makeText(this, "Введен неправильный номер телефона", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:${phoneNumber}")
            }

            startActivity(intent)

        }

        binding.shareTextBtn.setOnClickListener {
            val intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, binding.plainTextInput.text.toString())
                type = "text/plain"
            }
            val shareIntent = Intent.createChooser(intent, null)
            startActivity(shareIntent)
        }
    }


}

private fun isValidPhone(phone: String): Boolean {
    val regex = Regex("^8\\d{10}$|^[+]?7\\d{10}$")
    return regex.matches(phone)
}
