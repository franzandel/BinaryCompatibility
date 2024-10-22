package com.franzandel.binarycompatibility

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.franzandel.binarycompatibility.ui.theme.BinaryCompatibilityTheme
import com.franzandel.common.features.reportFeature
import com.franzandel.design.library.send

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BinaryCompatibilityTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    Button(
                        modifier = Modifier.align(Alignment.Center),
                        onClick = {
                            send(name = "Andel", address = "there")
                            reportFeature()
                        }
                    ) {
                        Text(text = "Send")
                    }
                }
            }
        }
    }
}
