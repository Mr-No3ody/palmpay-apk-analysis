package androidx.core.view;

import android.graphics.ImageDecoder;
import android.text.PrecomputedText;
import android.view.DisplayCutout;

/* JADX INFO: renamed from: androidx.core.view.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1057i {
    public static /* bridge */ /* synthetic */ ImageDecoder.Source e(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ DisplayCutout k(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ void r(Object obj) {
    }

    public static /* bridge */ /* synthetic */ boolean t(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ boolean u(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
