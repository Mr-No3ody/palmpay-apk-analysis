package androidx.appcompat.widget;

import android.widget.TextView;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {
    @DoNotInline
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    @DoNotInline
    public static void b(TextView textView, int i7, int i10, int i11, int i12) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i7, i10, i11, i12);
    }

    @DoNotInline
    public static void c(TextView textView, int[] iArr, int i7) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
    }

    @DoNotInline
    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
