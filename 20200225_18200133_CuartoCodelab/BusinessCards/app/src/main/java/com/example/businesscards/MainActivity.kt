import com.example.businesscards.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCard()
        }
    }
}

@Preview
@Composable
fun BusinessCard() {
    Surface(color = Color.Yellow) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Android Logo",
                modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "JL Arroyo & B. Zacarias")
            Text(text = "@AndroidDev")
            Spacer(modifier = Modifier.height(16.dp))
            Row {
                Icon(imageVector = Icons.Default.Phone, contentDescription = "Phone")
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "+51 918858017")
            }
            Row {
                Icon(imageVector = Icons.Default.Email, contentDescription = "Email")
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "jose.arroyo5@unmsm.edu.pe")
            }
        }
    }
}
