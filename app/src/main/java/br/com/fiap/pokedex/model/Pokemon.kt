package br.com.fiap.pokedex.model

import android.os.Parcel
import android.os.Parcelable

data class Pokemon(
   val nome: String,
   val tipo: String,
   val imagem: String,
   val descricao: String,
   val geracao: Int,
   val PS: Int,
   val Ataque: Int,
   val Defesa: Int,
   val AtaqueEspecial: Int,
   val DefesaEspecial: Int,
   val VelocidadeEspecial: Int

): Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readInt(),
            parcel.readInt(),
            parcel.readInt(),
            parcel.readInt(),
            parcel.readInt(),
            parcel.readInt()){
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nome)
        parcel.writeString(tipo)
        parcel.writeString(imagem)
        parcel.writeString(descricao)
        parcel.writeInt(geracao)
        parcel.writeInt(PS)
        parcel.writeInt(Ataque)
        parcel.writeInt(Defesa)
        parcel.writeInt(AtaqueEspecial)
        parcel.writeInt(DefesaEspecial)
        parcel.writeInt(VelocidadeEspecial)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Pokemon> {
        override fun createFromParcel(parcel: Parcel): Pokemon {
            return Pokemon(parcel)
        }

        override fun newArray(size: Int): Array<Pokemon?> {
            return arrayOfNulls(size)
        }
    }
}