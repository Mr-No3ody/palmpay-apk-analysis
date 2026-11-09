package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0849b0 extends C0847a0 {
    @Override // androidx.appcompat.widget.C0847a0, androidx.appcompat.widget.AbstractC0851c0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // androidx.appcompat.widget.AbstractC0851c0
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
