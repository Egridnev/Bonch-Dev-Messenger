package bonch.dev.bonchdevmessenger.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import bonch.dev.bonchdevmessenger.R
import bonch.dev.bonchdevmessenger.ui.fragments.ChatFragment
import bonch.dev.bonchdevmessenger.ui.fragments.PasswordFragment
import bonch.dev.bonchdevmessenger.ui.fragments.ProfileFragment

class MainAppActivity : AppCompatActivity() {

    val fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app)
        attachChatFragment()

    }

    fun attachChatFragment(){
        fragmentManager.beginTransaction()
            .add(R.id.main_fragment, ChatFragment())
            .commit()
    }

    fun replaceChatForProfile(view: View){
        fragmentManager.beginTransaction()
            .replace(R.id.main_fragment, ProfileFragment())
            .addToBackStack("profile_fragment")
            .commit()
    }

    fun showChangePaswordDilog(view: View){
        PasswordFragment().show(supportFragmentManager,"changePassword")
    }
}
