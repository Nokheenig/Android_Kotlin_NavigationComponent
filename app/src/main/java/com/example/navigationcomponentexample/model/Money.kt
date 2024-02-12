package com.example.navigationcomponentexample.model

import android.os.Parcel
import android.os.Parcelable
import java.math.BigDecimal

data class Money (val amount: BigDecimal): Parcelable {
    constructor(parcel: Parcel) : this(BigDecimal(0)) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Money> {
        override fun createFromParcel(parcel: Parcel): Money {
            return Money(parcel)
        }

        override fun newArray(size: Int): Array<Money?> {
            return arrayOfNulls(size)
        }
    }
}