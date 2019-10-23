package bonch.dev.bonchdevmessenger.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import bonch.dev.bonchdevmessenger.R

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }

    fun register(view: View){
        val intent = Intent(this@SignUpActivity, MainAppActivity::class.java)
        startActivity(intent)
    }
}
