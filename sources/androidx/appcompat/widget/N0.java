package androidx.appcompat.widget;

import android.widget.AutoCompleteTextView;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes.dex */
public abstract class N0 {
    @DoNotInline
    public static void a(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }

    @DoNotInline
    public static void b(SearchView.SearchAutoComplete searchAutoComplete, int i7) {
        searchAutoComplete.setInputMethodMode(i7);
    }
}
