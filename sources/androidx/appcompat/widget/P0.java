package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class P0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f12739a;

    public P0(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f12739a = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f12739a;
        if (searchAutoComplete.f12811c) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f12811c = false;
        }
    }
}
