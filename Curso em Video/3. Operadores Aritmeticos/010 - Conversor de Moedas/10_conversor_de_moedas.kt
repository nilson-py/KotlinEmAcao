// Algoritmo que lê um valor em reais e exibe o mesmo valor convertido em dólar.
import java.util.Locale

fun main() {
    print("Quanto de dinheiro você possui na carteira?: R$")
    val real = readln().toDouble()
    println("Beleza! Agora mostrarei quantos dólares você pode comprar com esse valor!:")
    val dolar = real / 3.27
    val numeroFormatado = String.format(Locale.US, "%.2f", dolar)
    print("U$${numeroFormatado}")
}
