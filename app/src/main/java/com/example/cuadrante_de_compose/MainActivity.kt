package com.example.cuadrante_de_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrante_de_compose.ui.theme.Cuadrante_de_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Cuadrante_de_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    interfaz()
                }
            }
        }
    }
}
@Composable
fun interfaz(){
    Column(Modifier.fillMaxWidth()) {
      Row(Modifier.weight(1f)) {
          testos(
              cabezera = stringResource(R.string.t1t),
              relleno = stringResource(R.string.t1d),
              backgroundColor = Color(0xFFEADDFF),
              modifier = Modifier.weight(1f)
          )
          testos(
              cabezera = stringResource(R.string.t2t),
              relleno = stringResource(R.string.t2d),
              backgroundColor = Color(0xFFD0BCFF),
              modifier = Modifier.weight(1f)
          )
      }
        Row(Modifier.weight(1f)) {
            testos(
                cabezera = stringResource(R.string.t3t),
                relleno = stringResource(R.string.t3d),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            testos(
                cabezera = stringResource(R.string.t4t),
                relleno = stringResource(R.string.t4d),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun testos(cabezera: String,
                   relleno: String,
                   backgroundColor: Color,
                   modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(
            text = cabezera,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = relleno,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Cuadrante_de_ComposeTheme {
        interfaz()
    }
}