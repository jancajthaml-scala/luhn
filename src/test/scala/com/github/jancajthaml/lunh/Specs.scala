package com.github.jancajthaml

import org.scalatest.{FlatSpec, Matchers}

class LunhSpecs extends FlatSpec with Matchers {
  
  "lunh" should "have valid checksum" in {
    luhn_checksum("001230147647009683210024") should === (0)
  }

}