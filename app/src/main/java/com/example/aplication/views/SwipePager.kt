package com.example.aplication.views

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.aplication.models.Client
import com.example.aplication.models.Employee
import com.example.aplication.models.Product
import com.example.aplication.models.SaleGet

@Composable
fun SwipePagerScreen(
    clients: List<Client>,
    products: List<Product>,
    employees: List<Employee>,
    sales: List<SaleGet>,
) {
    val pageCount = 4
    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { pageCount }
    )
    HorizontalPager(
        state = pagerState,
        modifier = Modifier.fillMaxSize()
    ) { page ->
        when (page) {
            0 -> ClientList(clients)
            1 -> ClientList(clients)
            2 -> ClientList(clients)
            3 -> ClientList(clients)
        }
    }
}