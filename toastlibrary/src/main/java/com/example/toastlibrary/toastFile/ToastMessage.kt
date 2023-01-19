package com.example.toastlibrary.toastFile

import android.content.Context
import android.widget.Toast

class ToastMessage {
    public fun showMessageInToast(context: Context, toast_message:String) {
        Toast.makeText(context, toast_message, Toast.LENGTH_SHORT).show()
    }
}