package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class L0 implements View.OnKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f12699a;

    public L0(SearchView searchView) {
        this.f12699a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        SearchView searchView = this.f12699a;
        if (searchView.f12774G0 != null) {
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f12783a;
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i7 == 66) {
                    view.cancelLongPress();
                    searchView.getContext().startActivity(searchView.a(null, "android.intent.action.SEARCH", null, searchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (searchView.f12774G0 != null && searchView.f12802v0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i7 == 66 || i7 == 84 || i7 == 61) {
                    return searchView.e(searchAutoComplete.getListSelection());
                }
                if (i7 == 21 || i7 == 22) {
                    searchAutoComplete.setSelection(i7 == 21 ? 0 : searchAutoComplete.length());
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.a();
                    return true;
                }
                if (i7 == 19) {
                    searchAutoComplete.getListSelection();
                    return false;
                }
            }
        }
        return false;
    }
}
