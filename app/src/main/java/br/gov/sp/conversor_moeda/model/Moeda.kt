package br.gov.sp.conversor_moeda.model

data class Moeda(
    val name : String,
    val buy : Double,
    val sell : Double,
    val variation : Double
)
