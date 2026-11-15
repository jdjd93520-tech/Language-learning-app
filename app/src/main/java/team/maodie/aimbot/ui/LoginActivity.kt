package team.maodie.aimbot.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Owner-authorized unlocked build entry point.
 * Opens the existing main application directly; Android runtime permissions
 * for screen capture, overlay, and Shizuku remain required.
 */
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
