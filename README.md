## Performant implementation of Luhn checksum algorithm

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/d991ff72a806434184dfd5b756fd0fd4)](https://www.codacy.com/app/jan-cajthaml/luhn?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=jancajthaml-scala/luhn&amp;utm_campaign=Badge_Grade) [![Build Status](https://travis-ci.org/jancajthaml-scala/luhn.svg?branch=master)](https://travis-ci.org/jancajthaml-scala/luhn)

Algorithm will detect any single-digit error, as well as almost all transpositions of adjacent digits. It will not, however, detect transposition of the two-digit sequence 09 to 90 (or vice versa).

It is not intended to be a cryptographically secure hash function. It is mostly used for pre-flight credit card number validation as specified in [ISO/IEC 7812-1:2015](http://www.iso.org/iso/catalogue_detail?csnumber=66011)

* [Credit Card Validation - Check Digits](https://web.eecs.umich.edu/~bartlett/credit_card_number.html)
* [Wikipedia - Luhn algorithm](https://en.wikipedia.org/wiki/Luhn_algorithm)
