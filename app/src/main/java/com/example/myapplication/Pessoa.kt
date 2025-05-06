import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Pessoa(val nome: String, val idade: Int) : Parcelable {
    override fun toString(): String {
        return "nome: $nome, idade: $idade."
    }
}

//@Parcelize = permite passar objetos de uma activity para outra.

//data class = classe que armazena dados.
    /*
    Com essa única linha, você já tem:
        •	Um construtor com nome e idade
        •	Uma implementação de toString() que retorna:
    Pessoa(nome=Maria, idade=30)
     */

//Parcelable =
// interface usada para serializar objetos
// classe que permite passar objetos de uma activity para outra.

