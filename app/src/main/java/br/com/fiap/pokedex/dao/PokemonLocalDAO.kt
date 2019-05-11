package br.com.fiap.pokedex.dao

import br.com.fiap.pokedex.model.Pokemon

class PokemonLocalDAO{
        fun pegarPokemons() : List<Pokemon> {
            return listOf(
                    getWartortle(),
                    getClefairy(),
                    getEevee(),
                    getCubone(),
                    getVulpix(),
                    getSlowpoke()

            )
        }

        fun getWartortle() : Pokemon{
            return Pokemon(
                    "Wartortle",
                    "Água",
                    "https://assets.pokemon.com/assets/cms2/img/pokedex/full/008.png",
                    "Sua cauda é grande e coberta com uma pele rica e grossa. A cauda torna-se cada vez mais profunda nas cores à medida que Wartortle envelhece. Os arranhões em sua casca são evidência da resistência deste Pokémon como um combatente.",
                    1
            )
        }

    fun getClefairy() : Pokemon{
        return Pokemon(
                "Clefairy",
                "Fada",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/035.png",
                "Em todas as noites de lua cheia, grupos deste Pokémon saem para jogar. Quando a madrugada chega, os Clefairy cansados voltam para seus tranquilos refúgios nas montanhas e vão dormir aninhados um contra o outro.",
                1
        )
    }

    fun getEevee() : Pokemon{
        return Pokemon(
                "Eevee",
                "Normal",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/133.png",
                "Eevee tem uma composição genética instável que de repente se transforma devido ao ambiente em que vive. Radiação de várias pedras faz com que este Pokémon evolua.",
                1
        )
    }

    fun getCubone() : Pokemon{
        return Pokemon(
                "Cubone",
                "Terra",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/104.png",
                "Cubone pinheiros para a mãe que nunca mais verá. Vendo a imagem de sua mãe na lua cheia, ela chora. As manchas no crânio que o Pokémon usa são feitas pelas lágrimas derramadas.",
                1
        )
    }

    fun getVulpix() : Pokemon{
        return Pokemon(
                "Vulpix",
                "Fogo",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/037.png",
                "Na época de seu nascimento, Vulpix tem uma cauda branca. O rabo se separa em seis se este Pokémon receber muito amor do seu treinador. As seis caudas ficam magnificamente enroladas.",
                1
        )
    }


    fun getSlowpoke() : Pokemon{
        return Pokemon(
                "Slowpoke",
                "Psíquico",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/079.png",
                "Slowpoke usa sua cauda para capturar a presa, mergulhando-a na água ao lado de um rio. No entanto, este Pokémon muitas vezes esquece o que está fazendo e muitas vezes passa dias inteiros apenas vagando à beira da água.",
                1
        )
    }
}