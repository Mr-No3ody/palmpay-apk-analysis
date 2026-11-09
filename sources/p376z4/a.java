package p376z4;

import android.graphics.Bitmap;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f44435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f44436b;

    static {
        int[] iArr = new int[Bitmap.CompressFormat.values().length];
        f44436b = iArr;
        try {
            iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f44436b[Bitmap.CompressFormat.WEBP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f44436b[Bitmap.CompressFormat.JPEG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[Paint.Align.values().length];
        f44435a = iArr2;
        try {
            iArr2[Paint.Align.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f44435a[Paint.Align.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
