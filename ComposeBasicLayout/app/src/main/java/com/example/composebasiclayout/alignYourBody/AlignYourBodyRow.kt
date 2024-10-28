package com.example.composebasiclayout.alignYourBody

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composebasiclayout.alignYourBodyData
import com.example.composebasiclayout.ui.theme.ComposeBasicLayoutTheme

@Composable
fun AlignYourBodyRow(modifier: Modifier = Modifier){
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ) {
        items(alignYourBodyData) { item ->
            AlignYourBodyElement(item.drawable, item.text)
        }
    }
}





@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun AlignYourBodyRowPreview(){
    ComposeBasicLayoutTheme {
        AlignYourBodyRow()
    }
}