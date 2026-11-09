package androidx.appcompat.widget;

import android.graphics.Rect;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;

/* JADX INFO: renamed from: androidx.appcompat.widget.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0880r0 {
    @DoNotInline
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    @DoNotInline
    public static void b(PopupWindow popupWindow, boolean z3) {
        popupWindow.setIsClippedToScreen(z3);
    }
}
