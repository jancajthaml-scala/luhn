package com.github.jancajthaml

/**
  * Luhn Checksum algorithm
  *
  * @see https://en.wikipedia.org/wiki/Luhn_algorithm
  *
  * @author jan.cajthaml
  */
object luhn_checksum extends ((String) => Int) {

  /**
   * @return check_digit
   */
  def apply(number: String): Int = {
    val sanitized = (number + '0').replaceFirst("^0+(?!$)", "").reverse.map(_.toInt)
    val odd = Iterator.from(1, 2).takeWhile(_ < sanitized.size).map(sanitized(_))
    val even = sanitized.filterNot(odd.toSet).map(_.toInt << 1)
    val check = (odd.sum + even.sum) & 0x1
    if (check == 0) 0 else (10 - check)
  }

}
