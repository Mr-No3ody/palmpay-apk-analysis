package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class b implements CardViewImpl {
    @Override // androidx.cardview.widget.CardViewImpl
    public final ColorStateList getBackgroundColor(CardViewDelegate cardViewDelegate) {
        return ((c) cardViewDelegate.getCardBackground()).f15034h;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float getElevation(CardViewDelegate cardViewDelegate) {
        return cardViewDelegate.getCardView().getElevation();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float getMaxElevation(CardViewDelegate cardViewDelegate) {
        return ((c) cardViewDelegate.getCardBackground()).f15031e;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float getMinHeight(CardViewDelegate cardViewDelegate) {
        return getRadius(cardViewDelegate) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float getMinWidth(CardViewDelegate cardViewDelegate) {
        return getRadius(cardViewDelegate) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final float getRadius(CardViewDelegate cardViewDelegate) {
        return ((c) cardViewDelegate.getCardBackground()).f15027a;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void initStatic() {
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void initialize(CardViewDelegate cardViewDelegate, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        cardViewDelegate.setCardBackground(new c(f10, colorStateList));
        View cardView = cardViewDelegate.getCardView();
        cardView.setClipToOutline(true);
        cardView.setElevation(f11);
        setMaxElevation(cardViewDelegate, f12);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void onCompatPaddingChanged(CardViewDelegate cardViewDelegate) {
        setMaxElevation(cardViewDelegate, getMaxElevation(cardViewDelegate));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void onPreventCornerOverlapChanged(CardViewDelegate cardViewDelegate) {
        setMaxElevation(cardViewDelegate, getMaxElevation(cardViewDelegate));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void setBackgroundColor(CardViewDelegate cardViewDelegate, ColorStateList colorStateList) {
        c cVar = (c) cardViewDelegate.getCardBackground();
        if (colorStateList == null) {
            cVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        cVar.f15034h = colorStateList;
        cVar.f15028b.setColor(colorStateList.getColorForState(cVar.getState(), cVar.f15034h.getDefaultColor()));
        cVar.invalidateSelf();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void setElevation(CardViewDelegate cardViewDelegate, float f10) {
        cardViewDelegate.getCardView().setElevation(f10);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void setMaxElevation(CardViewDelegate cardViewDelegate, float f10) {
        c cVar = (c) cardViewDelegate.getCardBackground();
        boolean useCompatPadding = cardViewDelegate.getUseCompatPadding();
        boolean preventCornerOverlap = cardViewDelegate.getPreventCornerOverlap();
        if (f10 != cVar.f15031e || cVar.f15032f != useCompatPadding || cVar.f15033g != preventCornerOverlap) {
            cVar.f15031e = f10;
            cVar.f15032f = useCompatPadding;
            cVar.f15033g = preventCornerOverlap;
            cVar.b(null);
            cVar.invalidateSelf();
        }
        updatePadding(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void setRadius(CardViewDelegate cardViewDelegate, float f10) {
        c cVar = (c) cardViewDelegate.getCardBackground();
        if (f10 == cVar.f15027a) {
            return;
        }
        cVar.f15027a = f10;
        cVar.b(null);
        cVar.invalidateSelf();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public final void updatePadding(CardViewDelegate cardViewDelegate) {
        if (!cardViewDelegate.getUseCompatPadding()) {
            cardViewDelegate.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float f10 = ((c) cardViewDelegate.getCardBackground()).f15031e;
        float f11 = ((c) cardViewDelegate.getCardBackground()).f15027a;
        int iCeil = (int) Math.ceil(d.a(f10, f11, cardViewDelegate.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(d.b(f10, f11, cardViewDelegate.getPreventCornerOverlap()));
        cardViewDelegate.setShadowPadding(iCeil, iCeil2, iCeil, iCeil2);
    }
}
