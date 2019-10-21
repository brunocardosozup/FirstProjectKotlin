class VeiculoModel(var placa: String, var veiculo: String, var cor: String, var modelo: String) {


    //    var placa = String
//    var veiculo = String
    public override fun toString(): String {
        return "Placa: " + this.placa + "\n Veiculo: " + this.veiculo +
                "\n Cor: " + this.cor + "\n Modelo: " + this.modelo + "\n"
    }

}
