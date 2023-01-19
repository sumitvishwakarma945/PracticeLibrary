package com.example.toastlibrary

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface


class ShowDialog {
    fun showDialogBox(context: Context,title:String) {
        val builder: AlertDialog.Builder = AlertDialog.Builder(context.applicationContext)

        // Set the message show for the Alert time

        // Set the message show for the Alert time
        builder.setMessage("Do you want to exit ?")

        // Set Alert Title

        // Set Alert Title
        builder.setTitle("Alert !")

        // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show

        // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
        builder.setCancelable(false)

        // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.

        // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
        builder.setPositiveButton("Yes",
            DialogInterface.OnClickListener { dialog: DialogInterface?, which: Int ->
                // When the user click yes button then app will close
                dialog?.cancel()
            } as DialogInterface.OnClickListener)

        // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.

        // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
        builder.setNegativeButton("No",
            DialogInterface.OnClickListener { dialog: DialogInterface, which: Int ->
                // If user click no then dialog box is canceled.
                dialog.cancel()
            } as DialogInterface.OnClickListener)

        // Create the Alert dialog

        // Create the Alert dialog
        val alertDialog: AlertDialog = builder.create()
        // Show the Alert Dialog box
        // Show the Alert Dialog box
        alertDialog.show()
    }
}