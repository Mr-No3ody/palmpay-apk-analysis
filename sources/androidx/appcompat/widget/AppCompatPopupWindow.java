package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {
    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i7) {
        super(context, attributeSet, i7);
        a(context, attributeSet, i7);
    }

    public final void a(Context context, AttributeSet attributeSet, int i7) {
        Z0 z0F = Z0.f(context, attributeSet, p241q.j.PopupWindow, i7, 0);
        int i10 = p241q.j.PopupWindow_overlapAnchor;
        TypedArray typedArray = z0F.f12863b;
        if (typedArray.hasValue(i10)) {
            setOverlapAnchor(typedArray.getBoolean(p241q.j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(z0F.b(p241q.j.PopupWindow_android_popupBackground));
        z0F.g();
    }
}
