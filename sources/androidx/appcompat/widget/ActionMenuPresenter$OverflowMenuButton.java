package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuPresenter$OverflowMenuButton extends AppCompatImageView implements ActionMenuView.ActionMenuChildView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0868l f12571a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionMenuPresenter$OverflowMenuButton(C0868l c0868l, Context context) {
        super(context, null, p241q.a.actionOverflowButtonStyle);
        this.f12571a = c0868l;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        com.facebook.imagepipeline.nativecode.b.S(this, getContentDescription());
        setOnTouchListener(new C0860h(this, this, 0));
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public final boolean needsDividerAfter() {
        return false;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public final boolean needsDividerBefore() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f12571a.d();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i7, int i10, int i11, int i12) {
        boolean frame = super.setFrame(i7, i10, i11, i12);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
