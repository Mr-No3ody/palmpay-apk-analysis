package androidx.appcompat.widget;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class J0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f12693a;

    public J0(SearchView searchView) {
        this.f12693a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        SearchView searchView = this.f12693a;
        View view2 = searchView.f12791j;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.f12785c.getPaddingLeft();
            Rect rect = new Rect();
            boolean z3 = p1.f12995a;
            boolean z8 = searchView.getLayoutDirection() == 1;
            int dimensionPixelSize = searchView.f12799t0 ? resources.getDimensionPixelSize(p241q.d.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(p241q.d.abc_dropdownitem_icon_width) : 0;
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f12783a;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            searchAutoComplete.setDropDownHorizontalOffset(z8 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
