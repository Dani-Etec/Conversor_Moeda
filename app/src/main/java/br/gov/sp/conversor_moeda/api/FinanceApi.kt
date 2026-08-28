package br.gov.sp.conversor_moeda.api

import br.gov.sp.conversor_moeda.model.FinanceResponse
import retrofit2.Call
import retrofit2.http.GET

interface FinanceApi {
    @GET("finance?key=d18b57f7")
    fun getCotacoes() : Call<FinanceResponse>
}