package bonch.dev.bonchdevmessenger.ui.fragments

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.fragment.app.DialogFragment
import bonch.dev.bonchdevmessenger.R

class PasswordFragment:DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_password, container, false)
        if (getDialog() != null && getDialog().getWindow() != null) {
            getDialog().getWindow()?.setBackgroundDrawableResource(R.color.Transparent)
        }
        return view
    }
}