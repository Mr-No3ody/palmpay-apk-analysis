package androidx.appcompat.widget;

import android.widget.AbsListView;
import androidx.annotation.DoNotInline;

/* JADX INFO: renamed from: androidx.appcompat.widget.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0865j0 {
    @DoNotInline
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    @DoNotInline
    public static void b(AbsListView absListView, boolean z3) {
        absListView.setSelectedChildViewEnabled(z3);
    }
}
