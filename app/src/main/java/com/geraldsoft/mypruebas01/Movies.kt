package com.geraldsoft.mypruebas01

class Movies(
    val id: Int,
    val title: String,
    val imagen: String
)

val movie = (1..100).map {
    Movies(
        id = it,
        title = "Title $it",
        imagen = "https://picsum.photos/200/300?id=$it"
    )
}