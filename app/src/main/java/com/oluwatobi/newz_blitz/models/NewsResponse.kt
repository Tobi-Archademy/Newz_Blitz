package com.oluwatobi.newz_blitz.models

import com.oluwatobi.newz_blitz.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)