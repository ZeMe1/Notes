package com.example.notes.documentation.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}