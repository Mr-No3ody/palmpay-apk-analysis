package androidx.appcompat.widget;

import android.transition.Transition;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;

/* JADX INFO: renamed from: androidx.appcompat.widget.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0890w0 {
    @DoNotInline
    public static void a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    @DoNotInline
    public static void b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
