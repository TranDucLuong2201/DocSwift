package com.dluong.docswift.presentation.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import timber.log.Timber

open class DocSwiftViewModel : ViewModel() {
    fun launchCatching(block: suspend CoroutineScope.() -> Unit) =
        viewModelScope.launch(
            CoroutineExceptionHandler { _, throwable ->
                Timber.tag(ERROR_TAG).d(throwable.message.orEmpty())
            },
            block = block
        )

    companion object {
        const val ERROR_TAG = "DOC SWIFT ERROR"
    }
}