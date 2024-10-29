package com.example.composebasicstate

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composebasicstate.ui.theme.ComposeBasicStateTheme


@Composable
fun StatefulCounter(modifier: Modifier = Modifier){
    var count by rememberSaveable { mutableStateOf(0) }
    StatelessCounter(count, { count += 1; }, modifier)
}

@Preview(showBackground = true)
@Composable
fun StatefulPreview(){
    ComposeBasicStateTheme {
        StatefulCounter()
    }
}