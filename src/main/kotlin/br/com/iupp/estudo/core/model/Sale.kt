package br.com.iupp.estudo.core.model

import io.micronaut.core.annotation.Introspected
import java.util.*

@Introspected
data class Sale(
    val id:UUID,
    val productid:UUID,
    val qty:Double
)