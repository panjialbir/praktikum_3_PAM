package com.example.praktikum3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum3.ui.theme.Praktikum3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Praktikum3Theme {


                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun Home(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {        Text(
        text = "PANJI ",
        fontSize = 40.sp)
        BoxHeader()
        Spacer(modifier = Modifier.padding(10.dp))
        Lokasi()
        Spacer(modifier = Modifier.padding(10.dp))
        Keterangan()
    }
}




@Composable
fun BoxHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Cyan))

    {
        Column (horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()){
            Image(painter = painterResource(id = R.drawable.background),
                contentDescription = "", modifier = Modifier.size(150.dp))
            Text(text = "Rain", fontSize = 25.sp, modifier = Modifier.padding(10.dp))
        }
    }
}



@Composable
fun Lokasi(){
    Text(text = "19°C", fontSize = 64.sp, fontWeight = FontWeight.Bold)

    Row() {
        Image(painter = painterResource(id = R.drawable.img), contentDescription = "",
            modifier = Modifier.size(40.dp))

        Spacer(modifier = Modifier.padding(5.dp))

        Text(text = "Yogyakarta", fontSize = 40.sp,)
    }

    Text(text = "Jalan Nulis, Tamantirto, Kasihan, Bantul", fontSize = 20.sp, textAlign = TextAlign.Center, color = Color.Gray)
}

@Composable
fun Keterangan() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(Color.Cyan)
    ) {
        Column(
            modifier = Modifier
                .padding(30.dp)
                .align(Alignment.TopStart)
        ) {
            Text(
                text = "Humidity",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                modifier = Modifier
                    .padding(start = 25.dp)
                    .padding(top = 5.dp),
                text = "98%",
                fontWeight = FontWeight.ExtraBold
            )
        }
        Column(
            modifier = Modifier
                .padding(30.dp)
                .align(Alignment.TopEnd)
        ) {
            Text(
                text = "UV Index",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                modifier = Modifier
                    .padding(start = 25.dp)
                    .padding(top = 5.dp),
                text = "9/10",
                fontWeight = FontWeight.ExtraBold
            )
        }

        Spacer(modifier = Modifier.padding(100.dp))

        Column(
            modifier = Modifier
                .padding(30.dp)
                .align(Alignment.BottomStart)
        ) {
            Text(
                text = "Sunrise",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                text = "05.00 AM",
                fontWeight = FontWeight.Bold
            )
        }

        Column(
            modifier = Modifier
                .padding(30.dp)
                .align(Alignment.BottomEnd)
        ) {
            Text(
                text = "Sunset",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                text = "05.40 PM",
                fontWeight = FontWeight.Bold
            )
        }
    }
}




@Preview(showBackground = true)
@Composable
fun HomePreview() {
    Praktikum3Theme {

        Home()
    }
}