package kmp.project.fashionmultiplatform.products

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.unit.dp
import kmp.project.fashionmultiplatform.products.components.ProductItem
import kmp.project.fashionmultiplatform.products.components.ProductTypeChip

@Composable
fun ProductsScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        ProductTypesRow(
            modifier = Modifier
                .padding(top = 20.dp, bottom = 10.dp)
                .clipToBounds()
        )
        ProductList()
    }
}

@Composable
fun ProductList(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 140.dp),
        horizontalArrangement = Arrangement.spacedBy(5.dp),
        verticalArrangement = Arrangement.spacedBy(30.dp),
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 10.dp)
    ) {
        items(testProducts) {
            ProductItem(
                title = it.title,
                price = it.price,
                image = it.image
            )
        }
    }
}

@Composable
fun ProductTypesRow(modifier: Modifier = Modifier) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(5.dp),
        contentPadding = PaddingValues(horizontal = 10.dp),
        modifier = modifier
            .fillMaxWidth()
    ) {
        itemsIndexed(testTypes) { index, label ->
            ProductTypeChip(isSelected = index == 0, label = label)
        }
    }
}

val testTypes = mutableListOf(
    "/// new", "best sellers", "jackets", "blazers"
)

val testProducts = mutableListOf(
    Product(
        title = "MAGLIETTA SLIM FIT MEDIUM WEIGHT",
        price = 29.95,
        image = "https://static.zara.net/assets/public/7fba/e6f3/028c4e2f9977/d464d8f49c3a/01501430250-e1/01501430250-e1.jpg?ts=1742205658114&w=285"
    ),
    Product(
        title = "MAGLIETTA SLIM FIT MEDIUM WEIGHT",
        price = 29.95,
        image = "https://static.zara.net/assets/public/6244/07df/6c25481ea880/d50f199b05e6/01501430401-e1/01501430401-e1.jpg?ts=1742205679636&w=285"
    ),
    Product(
        title = "MAGLIETTA BASIC REGULAR FIT",
        price = 22.95,
        image = "https://static.zara.net/assets/public/713b/d851/cdee4769a537/6563fe27b6df/05584471687-e1/05584471687-e1.jpg?ts=1739261522680&w=285"
    ),
    Product(
        title = "MAGLIETTA BASIC MEDIUM WEIGHT",
        price = 15.95,
        image = "https://static.zara.net/assets/public/66d2/0daf/d0f347f18161/66f27d002f40/01887420066-e1/01887420066-e1.jpg?ts=1741688967219&w=285"
    ),
    Product(
        title = "MAGLIETTA BASIC RIB CONTRASTO",
        price = 17.95,
        image = "https://static.zara.net/assets/public/14c7/3259/8f014ae8ad38/7eb431019939/00761412529-e1/00761412529-e1.jpg?ts=1737452354840&w=285"
    ),
    Product(
        title = "MAGLIETTA BASIC REGULAR FIT",
        price = 22.95,
        image = "https://static.zara.net/assets/public/713b/d851/cdee4769a537/6563fe27b6df/05584471687-e1/05584471687-e1.jpg?ts=1739261522680&w=285"
    ),
    Product(
        title = "MAGLIETTA BASIC MEDIUM WEIGHT",
        price = 15.95,
        image = "https://static.zara.net/assets/public/66d2/0daf/d0f347f18161/66f27d002f40/01887420066-e1/01887420066-e1.jpg?ts=1741688967219&w=285"
    ),
    Product(
        title = "MAGLIETTA BASIC RIB CONTRASTO",
        price = 17.95,
        image = "https://static.zara.net/assets/public/14c7/3259/8f014ae8ad38/7eb431019939/00761412529-e1/00761412529-e1.jpg?ts=1737452354840&w=285"
    ),
    Product(
        title = "MAGLIETTA BASIC REGULAR FIT",
        price = 22.95,
        image = "https://static.zara.net/assets/public/713b/d851/cdee4769a537/6563fe27b6df/05584471687-e1/05584471687-e1.jpg?ts=1739261522680&w=285"
    ),
    Product(
        title = "MAGLIETTA BASIC MEDIUM WEIGHT",
        price = 15.95,
        image = "https://static.zara.net/assets/public/66d2/0daf/d0f347f18161/66f27d002f40/01887420066-e1/01887420066-e1.jpg?ts=1741688967219&w=285"
    ),
    Product(
        title = "MAGLIETTA BASIC RIB CONTRASTO",
        price = 17.95,
        image = "https://static.zara.net/assets/public/14c7/3259/8f014ae8ad38/7eb431019939/00761412529-e1/00761412529-e1.jpg?ts=1737452354840&w=285"
    )
)

data class Product(
    val title: String,
    val price: Double,
    val image: String
)

