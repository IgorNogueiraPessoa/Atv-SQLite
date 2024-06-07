package com.example.appaula.roomDB
import androidx.room.Database
import androidx.room.RoomDatabase

/*configura e referencia a entidade e a versão do banco*/
@Database(
    entities = [Pessoa::class],
    version = 1
)
abstract class PessoaDataBase: RoomDatabase() {
    abstract fun pessoaDao(): PessoaDao
}