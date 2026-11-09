package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zaj;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zag {
    final zad zaa;
    protected int zab;

    public zag(Uri uri, int i7) {
        this.zab = 0;
        this.zaa = new zad(uri);
        this.zab = i7;
    }

    public abstract void zaa(@Nullable Drawable drawable, boolean z3, boolean z8, boolean z10);

    public final void zab(Context context, Bitmap bitmap, boolean z3) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }

    public final void zac(Context context, zaj zajVar, boolean z3) {
        int i7 = this.zab;
        zaa(i7 != 0 ? context.getResources().getDrawable(i7) : null, z3, false, false);
    }
}
