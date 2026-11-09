package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0847a0 extends AbstractC0851c0 {
    @Override // androidx.appcompat.widget.AbstractC0851c0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C0853d0.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
