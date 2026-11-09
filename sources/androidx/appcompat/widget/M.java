package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class M extends ListPopupWindow implements AppCompatSpinner.SpinnerPopup {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public CharSequence f12727s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ListAdapter f12728t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Rect f12729u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f12730v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f12731w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f12731w0 = appCompatSpinner;
        this.f12729u0 = new Rect();
        this.f12702A = appCompatSpinner;
        this.f12721k0 = true;
        this.f12724p0.setFocusable(true);
        this.f12703B = new K(this, 0);
    }

    public final void c() {
        int i7;
        PopupWindow popupWindow = this.f12724p0;
        Drawable background = popupWindow.getBackground();
        AppCompatSpinner appCompatSpinner = this.f12731w0;
        Rect rect = appCompatSpinner.f12620i;
        if (background != null) {
            background.getPadding(rect);
            boolean z3 = p1.f12995a;
            i7 = appCompatSpinner.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i7 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = appCompatSpinner.getPaddingLeft();
        int paddingRight = appCompatSpinner.getPaddingRight();
        int width = appCompatSpinner.getWidth();
        int i10 = appCompatSpinner.f12619g;
        if (i10 == -2) {
            int iA = appCompatSpinner.a((SpinnerAdapter) this.f12728t0, popupWindow.getBackground());
            int i11 = (appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i11) {
                iA = i11;
            }
            b(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i10 == -1) {
            b((width - paddingLeft) - paddingRight);
        } else {
            b(i10);
        }
        boolean z8 = p1.f12995a;
        this.f12717f = appCompatSpinner.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f12716e) - this.f12730v0) + i7 : paddingLeft + this.f12730v0 + i7;
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final CharSequence getHintText() {
        return this.f12727s0;
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final int getHorizontalOriginalOffset() {
        return this.f12730v0;
    }

    @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.f12728t0 = listAdapter;
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final void setHorizontalOriginalOffset(int i7) {
        this.f12730v0 = i7;
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final void setPromptText(CharSequence charSequence) {
        this.f12727s0 = charSequence;
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
    public final void show(int i7, int i10) {
        ViewTreeObserver viewTreeObserver;
        PopupWindow popupWindow = this.f12724p0;
        boolean zIsShowing = popupWindow.isShowing();
        c();
        this.f12724p0.setInputMethodMode(2);
        show();
        DropDownListView dropDownListView = this.f12714c;
        dropDownListView.setChoiceMode(1);
        dropDownListView.setTextDirection(i7);
        dropDownListView.setTextAlignment(i10);
        AppCompatSpinner appCompatSpinner = this.f12731w0;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        DropDownListView dropDownListView2 = this.f12714c;
        if (popupWindow.isShowing() && dropDownListView2 != null) {
            dropDownListView2.setListSelectionHidden(false);
            dropDownListView2.setSelection(selectedItemPosition);
            if (dropDownListView2.getChoiceMode() != 0) {
                dropDownListView2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0878q viewTreeObserverOnGlobalLayoutListenerC0878q = new ViewTreeObserverOnGlobalLayoutListenerC0878q(this, 1);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0878q);
        this.f12724p0.setOnDismissListener(new L(this, viewTreeObserverOnGlobalLayoutListenerC0878q));
    }
}
