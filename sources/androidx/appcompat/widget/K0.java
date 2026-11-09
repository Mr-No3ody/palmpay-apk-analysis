package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class K0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f12696a;

    public K0(SearchView searchView) {
        this.f12696a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f12696a;
        ImageView imageView = searchView.f12787e;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f12783a;
        if (view == imageView) {
            searchView.o(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f12798s0;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f12789g) {
            searchView.d();
            return;
        }
        if (view == searchView.f12788f) {
            searchView.h();
            return;
        }
        if (view != searchView.f12790i) {
            if (view == searchAutoComplete) {
                searchView.c();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f12774G0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.b(searchView.f12781M, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f12780L);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
        }
    }
}
