package androidx.transition;

import android.widget.ImageView;

/* JADX INFO: renamed from: androidx.transition.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1248i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18063a;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        f18063a = iArr;
        try {
            iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18063a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
