package com.example.appaula.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.asLiveData
import com.example.appaula.roomDB.Pessoa
import kotlinx.coroutines.launch
import kotlin.coroutines.coroutineContext

class PessoaViewModel(private val repository: Repository): ViewModel() {
    fun getPessoa() = repository.getAllPessoa().asLiveData(viewModelScope.coroutineContext) /*resgatar os comandos preparados em repository, criando os comandos de PessoaDao a serem executados no Main ACTIVITY*/

    fun upsertPessoa(pessoa: Pessoa) {
        viewModelScope.launch {
            repository.upsertPessoa(pessoa)
        }
    }

        fun deletePessoa(pessoa: Pessoa){
            viewModelScope.launch {
                repository.deletePessoa(pessoa)
            }
    }
}