package com.iiinaiii.sensorlab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxHeight()
    ) {
        Row(Modifier.weight(1f)) {
            GoogleMapView(Modifier.weight(1f))
            GeomagneticView(Modifier.weight(1f))
        }
        Row(Modifier.weight(1f)) {
            RotationVectorView(Modifier.weight(1f))
            FusedOrientationView(Modifier.weight(1f))
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MainScreenPreview() {
    MainScreen()
}