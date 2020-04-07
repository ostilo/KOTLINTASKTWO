package com.elkanah.kotlintasktwo.ui

import android.os.Parcel
import android.os.Parcelable

data class ShoppingItems(val name: String?, val price: Int, val descp: String?, val expireDate: String?) :Parcelable {
    override fun writeToParcel(dest: Parcel, flags: Int) {
            dest.writeString(name)
        dest.writeInt(price)
        dest.writeString(descp)
        dest.writeString(expireDate)
    }

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    ) {
    }


    companion object CREATOR : Parcelable.Creator<ShoppingItems> {
        override fun createFromParcel(parcel: Parcel): ShoppingItems {
            return ShoppingItems(parcel)
        }

        override fun newArray(size: Int): Array<ShoppingItems?> {
            return arrayOfNulls(size)
        }
    }

    override fun describeContents(): Int {
        return 0
    }
}


