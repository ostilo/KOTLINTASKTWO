package com.elkanah.kotlintasktwo.ui

import android.content.Intent
import android.os.Bundle

interface Callback {
    fun sendMyDetails(items: ShoppingItems)
    fun passBundle(bundle: Intent)
}