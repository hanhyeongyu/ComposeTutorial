package com.example.composebasicstate

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composebasicstate.ui.theme.ComposeBasicStateTheme


@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
){
    Column {
        StatefulCounter(modifier)

        val list = remember { wellnessViewModel.tasks }
        WellnessTasksList(
            list = list,
            onCheckedTask = { task, checked ->
                wellnessViewModel.changeTaskChecked(task, checked)
            },
            onCloseTask = { task ->
                wellnessViewModel.remove(task)
            },

        )
    }
}

@Preview(showBackground = true)
@Composable
fun WellnessScreenPreview(){
    ComposeBasicStateTheme {
        WellnessScreen()
    }
}

