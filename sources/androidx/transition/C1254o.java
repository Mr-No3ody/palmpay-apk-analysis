package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.transition.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1254o extends v0 {
    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    @Override // androidx.transition.Y
    public final long a(ViewGroup viewGroup, Transition transition, f0 f0Var, f0 f0Var2) {
        int i7;
        int iRound;
        int iCenterX;
        Integer num;
        if (f0Var == null && f0Var2 == null) {
            return 0L;
        }
        if (f0Var2 == null) {
            i7 = -1;
        } else {
            if (((f0Var == null || (num = (Integer) f0Var.f18045a.get("android:visibilityPropagation:visibility")) == null) ? 8 : num.intValue()) == 0) {
                i7 = -1;
            } else {
                f0Var = f0Var2;
                i7 = 1;
            }
        }
        int iB = v0.b(f0Var, 0);
        int iB2 = v0.b(f0Var, 1);
        Rect epicenter = transition.getEpicenter();
        if (epicenter != null) {
            iCenterX = epicenter.centerX();
            iRound = epicenter.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int iRound2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + iArr[0]);
            iRound = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + iArr[1]);
            iCenterX = iRound2;
        }
        float f10 = iCenterX - iB;
        float f11 = iRound - iB2;
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        float width = viewGroup.getWidth() - 0.0f;
        float height = viewGroup.getHeight() - 0.0f;
        float fSqrt2 = fSqrt / ((float) Math.sqrt((height * height) + (width * width)));
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round(((duration * ((long) i7)) / 3.0f) * fSqrt2);
    }
}
