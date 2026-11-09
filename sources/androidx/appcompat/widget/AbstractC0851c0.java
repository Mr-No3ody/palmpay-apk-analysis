package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0851c0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C0853d0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
