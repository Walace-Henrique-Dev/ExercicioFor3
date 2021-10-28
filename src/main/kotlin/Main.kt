fun main(args: Array<String>) {

        /*
        3 - Crie um programa para ler 4 notas e mostrar a média delas.
         */

        print("Digite sua 1° nota: ")
        var nota1 = readLine()!!.toDouble()
        print("Digite sua 2° nota: ")
        var nota2 = readLine()!!.toDouble()
        print("Digite sua 3° nota: ")
        var nota3 = readLine()!!.toDouble()
        print("Digite sua 4° nota: ")
        var nota4 = readLine()!!.toDouble()



        var media = (nota1 + nota2 + nota3 + nota4) / 4

        print("Sua média é: $media ")
    }

        /*
        var nota = 0.0
    var totalNotas = 0.0
    var media = 0.0
    var i = 1

    while (i in 1..4){
        print("Digite sua nota: ")
        nota = readLine()!!.toDouble()
        totalNotas += nota
        i++
    }

    media = totalNotas / 4

    println("A média das suas notas são: $media")
         */
