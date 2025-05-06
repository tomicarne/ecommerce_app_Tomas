package com.tomashazielvasquez.tvasquez150.unab.edu.ecommerceapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.rememberAsyncImagePainter
import com.tomashazielvasquez.tvasquez150.unab.edu.ecommerceapp.ui.theme.EcommerceAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())
    Scaffold (
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar ={
            MediumTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text(
                        "Bienvenido",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ExitToApp,
                            contentDescription = "Localized description"
                        )
                    }
                },
                scrollBehavior = scrollBehavior
            )

        }
    ) {innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Text("promocion", modifier = Modifier.padding(top =16.dp, start = 16.dp, bottom = 8.dp))
            val listUrls = listOf(
                "https://www.freepik.es/vector-premium/promocion-banner-super-venta_20372050.htm",
                "https://es.vecteezy.com/arte-vectorial/2506587-flash-sale-descuento-banner-promocion-fondo",
                "https://es.123rf.com/photo_189853956_plantilla-de-banner-de-gran-venta-hasta-un-50-por-ciento-de-oferta-especial-gran-promoci%C3%B3n-de.html",
                "https://es.pikbest.com/backgrounds/special-offer-sale-fire-burn-template-discount-banner-promotion-concept-design_3122874.html",
                "https://es.vecteezy.com/arte-vectorial/5173920-gran-venta-descuento-banner-plantilla-promocion-con-color-azul-y-amarillo-fondo-abstracto-simple-y-moderno-diseno-plantilla-para-usar-elemento-folleto-cartel-volante-y-pagina-de-destino"
            )
            LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(horizontal = 16.dp,)) {
                for (url in listUrls){
                    item { CardPromo(url) }
                }
                item { CardPromo(listUrls[0]) }
                item { CardPromo(listUrls[1]) }
                item { CardPromo(listUrls[2]) }
                item { CardPromo(listUrls[3]) }
                item { CardPromo(listUrls[4]) }


            }
        }
    }

}
@Composable
fun  CardPromo(url: String){
    Card(
        modifier = Modifier.height(198.dp).width(300.dp)
    ) {
        Image(
            painter = rememberAsyncImagePainter(url),
            contentDescription = "promocion",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
        )
    }
}
@Preview
@Composable
fun homeScreenPreview() {
    EcommerceAppTheme {
        HomeScreen()
    }
}