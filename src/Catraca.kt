import java.util.*
import java.util.Scanner

class Catraca {


    fun action() {

        var veiculoT = Veiculo("", "")
        var listaDeVeiculos = hashMapOf(veiculoT.placa to veiculoT.veiculo) /*Passando os dados do veiculo para um Map, para que eu consiga buscar por
        ID ou seja a placa.
        */
//        listaDeVeiculos.to(listOf<Veiculo>())
        val scan = Scanner(System.`in`)


        println(
            "Seja bem-vindo a alocação da zup!!!\n" +
                    "Digite 0 para entrar"
        )


        var verificador: Int = 1


        var controle: Int = scan.nextInt()

        if (controle == 0) {
            var scanif = Scanner(System.`in`)
            var verificador2 = 1

            while (verificador2 == 1) {
                var scanFirstOp = Scanner(System.`in`)

                println(
                    "1 -> Criar veiculo\n" +
                            "2 -> Remover veiculo\n" +
                            "3 -> Atualizar veiculo\n" +
                            "4 -> Buscar veiculo (ID)\n" +
                            "5 -> Tamanho da lista\n"
                )

                var resposta: Int = scanFirstOp.nextInt()

                if (resposta == 1) {
                    println("Digite a placa do veiculo:")
                    var placa = scanif.nextLine()

                    println("Digite o veiculo:")
                    var veiculoResposta = scanif.nextLine()

                    var veiculo = Veiculo(placa, veiculoResposta)

                    listaDeVeiculos.put(placa, veiculoResposta)

                } else if (resposta == 2) {

                    val scan2 = Scanner(System.`in`)
                    println("Digite a placa do veiculo que deseja remover")
                    var remove: String = scan2.nextLine()
                    listaDeVeiculos.remove(veiculoT.placa, veiculoT.veiculo)


                } else if (resposta == 3) {
                    println("Digite a placa do veiculo que deseja buscar")

                } else if (resposta == 5) {
                    println("O tamanho do map é " + listaDeVeiculos.size)

                }


            }


        }


    }

    var veiculo = Veiculo("", "")

    fun excluirVeiculo() {
        veiculo.listaDeVeiculos.forEach {
            print(it.key)
            print(it.value)
        }

    }


    fun buscarVeiculo(placa: String, listaDeVeiculo: Veiculo) {


    }

}
