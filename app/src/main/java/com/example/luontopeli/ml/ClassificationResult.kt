package com.example.luontopeli.ml

/**
 * Yhteinen malli ML Kit -tunnistuksen tuloksille.
 * Käytetään CameraScreen + ViewModel + UI:ssa.
 */
sealed class ClassificationResults {

    /**
     * Onnistunut tunnistus (paras match)
     */
    data class Success(
        val label: String,
        val confidence: Float
    ) : ClassificationResult()

    /**
     * Kuvassa ei luontoa (tai ei relevantteja tuloksia)
     */
    data class NotNature(
        val labels: List<String>
    ) : ClassificationResult()

    /**
     * Virhe tunnistuksessa
     */
    data class Error(
        val message: String
    ) : ClassificationResult()
}