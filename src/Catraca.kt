import java.util.*

class Catraca {
    fun action() {

        var veiculo = Veiculo("", "")

        println("Seja bem-vindo a alocação da zup!!!")

        val input = Scanner(System.`in`)

        var escolha = null
        while (escolha == null) {

            println(
                "Se o digito for 1 ira criar um veiculo:\n" +
                        "Se o digito for 2 remover um veiculo:\n" +
                        "Se o digito for 3 buscar o veiculo por id( PLACA ):\n" +
                        "Se o digito for 4 alugar um veiculo:\n"


            )



            // Código a ser executado
            val escolha = input.nextInt()
            if (escolha == 1) {
                println(" Digite a placa:")
                var placa = input.nextLine()
                println(" Digite o veiculo:")
                var veiculo = input.nextLine()

            } else if (escolha == 2) {
                println("Digite a placa do veiculo que deseja remover:")
                veiculo.listaDeVeiculos.remove("123")
                var opcao = input.nextLine()
                // tenho que passar para função o nome da chave

            } else if (escolha == 3) {
                println("Digite a placa do veiculo que deseja buscar:")
                veiculo.listaDeVeiculos.containsKey(input.nextLine())
            } else {
                println("Desculpe mas não existe veiculo neste local com estes dados!!!")
            }
        }


    }
}