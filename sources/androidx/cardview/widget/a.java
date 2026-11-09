package androidx.cardview.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a implements CardViewDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f15025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardView f15026b;

    public a(CardView cardView) {
        this.f15026b = cardView;
    }

    @Override // androidx.cardview.widget.CardViewDelegate
    public final Drawable getCardBackground() {
        return this.f15025a;
    }

    @Override // androidx.cardview.widget.CardViewDelegate
    public final View getCardView() {
        return this.f15026b;
    }

    @Override // androidx.cardview.widget.CardViewDelegate
    public final boolean getPreventCornerOverlap() {
        return this.f15026b.getPreventCornerOverlap();
    }

    @Override // androidx.cardview.widget.CardViewDelegate
    public final boolean getUseCompatPadding() {
        return this.f15026b.getUseCompatPadding();
    }

    @Override // androidx.cardview.widget.CardViewDelegate
    public final void setCardBackground(Drawable drawable) {
        this.f15025a = drawable;
        this.f15026b.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardViewDelegate
    public final void setMinWidthHeightInternal(int i7, int i10) {
        CardView cardView = this.f15026b;
        if (i7 > cardView.mUserSetMinWidth) {
            super/*android.view.View*/.setMinimumWidth(i7);
        }
        if (i10 > cardView.mUserSetMinHeight) {
            super/*android.view.View*/.setMinimumHeight(i10);
        }
    }

    @Override // androidx.cardview.widget.CardViewDelegate
    public final void setShadowPadding(int i7, int i10, int i11, int i12) {
        CardView cardView = this.f15026b;
        cardView.mShadowBounds.set(i7, i10, i11, i12);
        Rect rect = cardView.mContentPadding;
        super/*android.view.View*/.setPadding(i7 + rect.left, i10 + rect.top, i11 + rect.right, i12 + rect.bottom);
    }
}
