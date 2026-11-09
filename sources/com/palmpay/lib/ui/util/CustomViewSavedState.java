package com.palmpay.lib.ui.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.customview.view.a;

/* JADX INFO: loaded from: classes3.dex */
public class CustomViewSavedState extends View.BaseSavedState {
    public static final Parcelable.ClassLoaderCreator<CustomViewSavedState> CREATOR = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray f24633a;

    public CustomViewSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f24633a = new SparseArray();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeSparseArray(this.f24633a);
    }
}
