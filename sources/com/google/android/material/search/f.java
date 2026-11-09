package com.google.android.material.search;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f22553b;

    public /* synthetic */ f(SearchView searchView, int i7) {
        this.f22552a = i7;
        this.f22553b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f22552a) {
            case 0:
                this.f22553b.lambda$setUpBackButton$1(view);
                break;
            case 1:
                this.f22553b.lambda$setUpClearButton$2(view);
                break;
            default:
                this.f22553b.lambda$setupWithSearchBar$7(view);
                break;
        }
    }
}
