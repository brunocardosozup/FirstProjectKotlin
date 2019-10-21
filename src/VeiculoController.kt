import java.util.*

class VeiculoController {

    val veiculocon = VeiculoService()
    fun action() {


        val scan = Scanner(System.`in`)


        println(
            "Seja bem-vindo a alocação da zup!!!\n" +
                    "Digite 0 para entrar"
        )


//        var verificador: Int = 1


        var controle: Int = scan.nextInt()

        if (controle != 0) {

            println("Desculpe tente novamente")
        }

        if (controle == 0) {
            var scanif = Scanner(System.`in`)
            var verificador2 = 1

            while (verificador2 == 1) {
                var scanFirstOp = Scanner(System.`in`)

                println(
                    "1 -> Criar veiculo\n" +
                            "2 -> Remover veiculo\n" +
                            "3 -> Buscar veiculo (ID)\n" +
                            "4 -> Tamanho da lista\n" +
                            "5 -> Visualizar a lista de veiculos\n"
                )

                var resposta: Int = scanFirstOp.nextInt()

                if (resposta == 1) {
                    println("Digite a placa do veiculo:")
                    var placaCadastrada = scanif.nextLine()

                    println("Digite o veiculo:")
                    var veiculoResposta = scanif.nextLine()

                    println("Digite a cor do veiculo:")
                    var corResposta = scanif.nextLine()

                    println("Digite o modelo do veiculo:\n")
                    var modeloResposta = scanif.nextLine()

                    var veiculocadastrado = VeiculoModel(placaCadastrada, veiculoResposta, corResposta, modeloResposta)

                    veiculocon.listaDeVeiculo.put(placaCadastrada, veiculocadastrado)

                } else if (resposta == 2) {


                    // fun remover veiculo
                    val scan2 = Scanner(System.`in`)
                    println("Digite a placa do veiculo que deseja remover")
                    var remove: String = scan2.nextLine()

                    veiculocon.excluirVeiculo(remove)


                } else if (resposta == 3) {
                    val scan3 = Scanner(System.`in`)
                    println("Digite a placa do veiculo que deseja buscar")
                    var buscar: String = scan3.nextLine()

                    veiculocon.buscarVeiculo(buscar)
                    println(buscar)

                } else if (resposta == 4) {
                    println(veiculocon.listaDeVeiculo.size)

                } else if (resposta == 5) {
                    println(veiculocon.listaDeVeiculo)
                }


            }


        }


    }

}