package com.mahshookfoodway.ui.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp

@Composable
fun verticalSpace(space: Dp) {
    return Spacer(modifier = Modifier.height(space))
}

@Composable
fun horizontalSpace(space: Dp) {
    return Spacer(modifier = Modifier.width(space))
}

@Composable
fun imageStaticShow(id: Int) {
    val painter = painterResource(id = id)
    return Image(
        painter = painter, contentDescription = null,
        modifier = Modifier
            .aspectRatio(painter.intrinsicSize.width / painter.intrinsicSize.height)
            .fillMaxSize(),
        contentScale = ContentScale.Fit
    )
}

@Composable
fun imageStaticCropShow(id: Int, size: Dp) {
    val painter = painterResource(id = id)
    return Image(
        painter = painter, contentDescription = null, contentScale = ContentScale.Crop,
        modifier = Modifier.size(size)
    )
}