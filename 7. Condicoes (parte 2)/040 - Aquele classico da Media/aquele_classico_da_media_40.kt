/**
 * Programa que lê duas notas de um aluno, calcula a média aritmética
 * e exibe se o aluno está aprovado, reprovado ou de recuperação.
 */

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

fun main() {
    print("Primeira nota: ")
    val nota1 = readln().toDouble()
    print("Segunda nota: ")
    val nota2 = readln().toDouble()
    val media = (nota1 + nota2) / 2
    val formato = DecimalFormat("0.0", DecimalFormatSymbols(Locale.US))
    println("Sua média é igual a ${formato.format(media)}")
    val situacaoAluno: String = if (media < 5.0) {
        "REPROVADO! Não desista! Tente novamente ano que vem."
    } else if (media in 5.0..6.9) {
        "de RECUPERAÇÃO!"
    } else {
        "APROVADO! Parabéns!"
    }
    print("Você está $situacaoAluno")
}
