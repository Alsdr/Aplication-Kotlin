package com.example.aplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aplication.models.Client
import com.example.aplication.models.Employee
import com.example.aplication.models.Product
import com.example.aplication.models.SaleGet
import com.example.aplication.services.ApiService
import com.example.aplication.ui.theme.AplicationTheme
import com.example.aplication.views.SwipePagerScreen

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
    var clients by remember { mutableStateOf<List<Client>>(emptyList()) }
    var products by remember { mutableStateOf<List<Product>>(emptyList()) }
    var employees by remember { mutableStateOf<List<Employee>>(emptyList()) }
    var sales by remember { mutableStateOf<List<SaleGet>>(emptyList()) }

    LaunchedEffect(Unit) {
        clients = ApiService.getClients()
        products = ApiService.getProducts()
        employees = ApiService.getEmployees()
        sales = ApiService.getSales()
    }

    SwipePagerScreen(clients, products, employees, sales)
}

