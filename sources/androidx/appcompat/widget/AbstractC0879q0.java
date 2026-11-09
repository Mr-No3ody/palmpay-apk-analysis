package androidx.appcompat.widget;

import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;

/* JADX INFO: renamed from: androidx.appcompat.widget.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0879q0 {
    @DoNotInline
    public static int a(PopupWindow popupWindow, View view, int i7, boolean z3) {
        return popupWindow.getMaxAvailableHeight(view, i7, z3);
    }
}
