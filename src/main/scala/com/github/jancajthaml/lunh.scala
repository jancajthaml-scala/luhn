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
    val set = (number + '0').reverse
    val digit = set.indices.map(i => set(i).toInt << i & 0x1).sum % 10
    if (digit == 0) 0 else (10 - digit)
  }

}
