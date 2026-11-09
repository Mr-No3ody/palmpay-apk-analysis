package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class F extends v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17935b;

    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    @Override // androidx.transition.Y
    public final long a(ViewGroup viewGroup, Transition transition, f0 f0Var, f0 f0Var2) {
        int i7;
        int iCenterX;
        int iCenterY;
        int iAbs;
        Integer num;
        f0 f0Var3 = f0Var;
        if (f0Var3 == null && f0Var2 == null) {
            return 0L;
        }
        Rect epicenter = transition.getEpicenter();
        if (f0Var2 == null) {
            i7 = -1;
        } else {
            if (((f0Var3 == null || (num = (Integer) f0Var3.f18045a.get("android:visibilityPropagation:visibility")) == null) ? 8 : num.intValue()) == 0) {
                i7 = -1;
            } else {
                f0Var3 = f0Var2;
                i7 = 1;
            }
        }
        int iB = v0.b(f0Var3, 0);
        int iB2 = v0.b(f0Var3, 1);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = Math.round(viewGroup.getTranslationX()) + iArr[0];
        int iRound2 = Math.round(viewGroup.getTranslationY()) + iArr[1];
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (epicenter != null) {
            iCenterX = epicenter.centerX();
            iCenterY = epicenter.centerY();
        } else {
            iCenterX = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
        }
        int i10 = this.f17935b;
        if (i10 == 8388611) {
            if (viewGroup.getLayoutDirection() == 1) {
                i10 = 5;
            } else {
                i10 = 3;
            }
        } else if (i10 == 8388613) {
            if (viewGroup.getLayoutDirection() == 1) {
                i10 = 3;
            } else {
                i10 = 5;
            }
        }
        if (i10 == 3) {
            iAbs = Math.abs(iCenterY - iB2) + (width - iB);
        } else if (i10 == 5) {
            iAbs = Math.abs(iCenterY - iB2) + (iB - iRound);
        } else if (i10 != 48) {
            iAbs = i10 != 80 ? 0 : (iB2 - iRound2) + Math.abs(iCenterX - iB);
        } else {
            iAbs = Math.abs(iCenterX - iB) + (height - iB2);
        }
        float f10 = iAbs;
        int i11 = this.f17935b;
        float width2 = f10 / ((i11 == 3 || i11 == 5 || i11 == 8388611 || i11 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round(((duration * ((long) i7)) / 3.0f) * width2);
    }
}
