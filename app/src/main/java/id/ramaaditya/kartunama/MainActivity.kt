package id.ramaaditya.kartunama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.ramaaditya.kartunama.ui.theme.KartuNamaTheme

// Kelas utama aplikasi yang menginisialisasi Activity
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Mengatur konten tampilan menggunakan Compose
        setContent {
            KartuNamaTheme {
                // Membuat Surface dengan latar belakang abu-abu
                Surface(modifier = Modifier.fillMaxSize(), color = Color.Gray) {
                    KartuNama() // Memanggil fungsi untuk menampilkan kartu nama
                }
            }
        }
    }
}

// Fungsi untuk menampilkan kartu nama
@Composable
fun KartuNama() {
    // Menyusun elemen-elemen dalam kolom
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(24.dp)
    ) {
        // Menampilkan gambar logo
        val image = painterResource(R.drawable.awqh_6ttn_210908) // Memuat gambar dari sumber daya
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(0.3f) // Mengatur lebar gambar
        )
        // Menampilkan nama dan status
        Text(text = "Rama Aditya", fontSize = 50.sp, color = Color.White)
        Text(text = "Mahasiswa Informatika", fontSize = 20.sp, color = Color.Green)

        // Menampilkan baris kontak dengan ikon
        ContactRow(icon = Icons.Rounded.Phone, text = "Telepon: +62 123 4567 890")
        ContactRow(icon = Icons.Rounded.Email, text = "Email: rama@students.utdi.ac.id")
        ContactRow(icon = Icons.Rounded.Favorite, text = "Instagram: @ramaaditya")
    }
}

// Fungsi untuk menampilkan baris kontak dengan ikon dan teks
@Composable
fun ContactRow(icon: ImageVector, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier.padding(8.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color.Green, // Mengatur warna ikon
            modifier = Modifier.weight(1f) // Mengatur bobot ikon
        )
        Text(
            text = text,
            color = Color.White, // Mengatur warna teks
            modifier = Modifier.weight(4f)
        )
    }
}

// Fungsi untuk menampilkan pratayang dari tampilan KartuNama
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun KartuNamaPreview() {
    KartuNamaTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.Gray // Mengatur warna latar belakang
        ) {
            KartuNama()
        }
    }
}
