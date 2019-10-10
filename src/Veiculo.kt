import java.util.*

class Veiculo {


var veiculo = String
var placa = String



}

fun main(args: Array<String>) {


    var veiculo = Veiculo()

    println("Seja bem-vindo a alocação da zup!!!")

    val input = Scanner(System.`in`)

    var opcao = null
    while (opcao == null) {

        var map = hashMapOf("${veiculo.placa}" to "${veiculo.veiculo}") /*Passando os dados do veiculo para um Map, para que eu consiga buscar por
        ID ou seja a placa.
        */

        println(
            "Se o digito for 1 ira criar um veiculo:\n" +
                    "Se o digito for 2 remover um veiculo:\n" +
                    "Se o digito for 3 buscar o veiculo por id( PLACA ):\n" +
                    "Se o digito for 4 alugar um veiculo:\n"

        )
        val opcao = input.nextInt()

        // Código a ser executado
        if (opcao == 1) {
            println(" Digite a placa:")
            val placa = input.nextLine()
            println(" Digite o veiculo:")
            val veiculo = input.nextLine()

        }else if (opcao == 2) {
            println("Digite a placa do veiculo que deseja remover:")
            map.remove("")
            input.nextLine()
            // tenho que passar para função o nome da chave

        }else if (opcao == 3){
            println("Digite a placa do veiculo que deseja buscar:")
            map.containsKey(input.nextLine())
        }
        else {
            println("Desculpe mas não existe veiculo neste local com estes dados!!!")
        }
    }
}
