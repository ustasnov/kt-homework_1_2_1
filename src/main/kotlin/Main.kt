import kotlin.math.max

fun main() {
    val commissionPercentage: Float = 0.75f
    val minCommission: Int = 35

    var amount = 10_000
    var commission = (amount * commissionPercentage / 100).toInt()
    commission = if (commission < minCommission) minCommission else commission
    println("Сумма перевода: $amount руб. Комиссия: $commission руб.")

    amount = 5_000
    commission = max((amount * commissionPercentage / 100).toInt(), minCommission)
    println("Сумма перевода: $amount руб. Комиссия: $commission руб.")

    amount = 3_000
    commission = max((amount * commissionPercentage / 100).toInt(), minCommission)
    println("Сумма перевода: $amount руб. Комиссия: $commission руб.")

    amount = 1_000
    commission = max((amount * commissionPercentage / 100).toInt(), minCommission)
    println("Сумма перевода: $amount руб. Комиссия: $commission руб.")
}