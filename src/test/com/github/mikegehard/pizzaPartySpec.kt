package com.github.mikegehard

import io.damo.kspec.Spec
import org.assertj.core.api.Assertions.assertThat

class PizzaPartySpec: Spec({
    describe("pluralization") {
        test {
            assertThat(pluralizePiece(0)).isEqualTo("pieces")
        }

        test {
            assertThat(pluralizePiece(1)).isEqualTo("piece")
        }

        test {
            assertThat(pluralizePiece(2)).isEqualTo("pieces")
        }
    }
})