package androidx.appcompat.widget;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes.dex */
public final class G0 implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f12683a;

    public G0(SearchView searchView) {
        this.f12683a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        SearchView searchView = this.f12683a;
        Editable text = searchView.f12783a.getText();
        searchView.f12771D0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        searchView.n(!zIsEmpty);
        int i12 = 8;
        if (searchView.f12768B0 && !searchView.f12800u0 && zIsEmpty) {
            searchView.f12788f.setVisibility(8);
            i12 = 0;
        }
        searchView.f12790i.setVisibility(i12);
        searchView.j();
        searchView.m();
        if (searchView.f12792k0 != null && !TextUtils.equals(charSequence, searchView.f12770C0)) {
            searchView.f12792k0.onQueryTextChange(charSequence.toString());
        }
        searchView.f12770C0 = charSequence.toString();
    }
}
