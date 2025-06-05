package com.example.aplication

import PessoaCard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aplication.models.Pessoa
import com.example.aplication.models.Produto
import com.example.aplication.ui.theme.AplicationTheme
import com.example.aplication.views.FichaPessoal
import com.example.aplication.views.ListaDeProduto


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val produtos = listOf(
        Produto("Arroz", 8.0, false),
        Produto("Feijão", 10.5, true),
        Produto("Cafe", 15.1, true),
        Produto("Leite", 9.99, true),
        Produto("Azeite Portugues", 89.99, true),
        Produto("Queijo", 12.87, true),
        Produto("Batata Escovada", 5.99, true),
    )

    ListaDeProduto(produtos)

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AplicationTheme {
        Greeting("Android")
    }
}