import java.util.Scanner

class VeiculoService {

    open val listaDeVeiculo = emptyMap<String, VeiculoModel>().toMutableMap()

    fun excluirVeiculo(placa: String) {

        listaDeVeiculo.remove(placa)
        // fun remover placa e veiculo.

    }


    fun buscarVeiculo(placa: String) {

        println(listaDeVeiculo[placa])
        //Buscar veiculo pela placa.

    }

    fun qtdDeItensNaLista() {
        println(listaDeVeiculo.size)
        // Visualizar a qtd de Itens na lista.
    }

    fun viewAllItens() {

        for (key in listaDeVeiculo.keys) {

            println(listaDeVeiculo.get(key))
            // Visualizar todos itens na lista.
        }
    }


}

