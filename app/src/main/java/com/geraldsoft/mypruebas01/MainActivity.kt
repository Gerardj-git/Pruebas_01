package com.geraldsoft.mypruebas01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.geraldsoft.mypruebas01.ui.theme.MyPruebas01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyPruebas01Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { padding ->

                    LazyHorizontalGrid(rows = GridCells.Adaptive(120.dp)) {
                        items(100){
                            MovieItem()
                        }
                    }

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListaMovies() {
    MyPruebas01Theme {
        LazyHorizontalGrid(
            rows = GridCells.Adaptive(180.dp),
            horizontalArrangement = Arrangement.Center,
            contentPadding = PaddingValues(8.dp)
        ) {
            items(100){
                MovieItem()
            }
        }
    }
    
}

@Preview(showBackground = true)
@Composable
fun MovieItem() {

    val movies: List<Movies> = movie


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(4.dp)
        ) {

            Text(text = movies[0].title,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
                    .align(Alignment.CenterHorizontally),
                maxLines = 1
            )

            AsyncImage(
                model = movies[0].imagen,
                contentDescription = movies[0].title,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Gray)
                    .aspectRatio(2 / 3f)
            )



        }


}