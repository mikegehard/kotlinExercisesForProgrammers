package com.github.mikegehard

import io.damo.kspec.Spec
import org.assertj.core.api.Assertions.assertThat

class PizzaPartySpec: Spec({
    describe("pluralization") {
        test {
            assertThat(piecesOfPizza(0)).isEqualTo("0 pieces")
        }

        test {
            assertThat(piecesOfPizza(1)).isEqualTo("1 piece")
        }

        test {
            assertThat(piecesOfPizza(2)).isEqualTo("2 pieces")
        }
    }
})