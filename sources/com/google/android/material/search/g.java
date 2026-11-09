package com.google.android.material.search;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f22555b;

    public /* synthetic */ g(SearchView searchView, int i7) {
        this.f22554a = i7;
        this.f22555b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22554a) {
            case 0:
                this.f22555b.lambda$clearFocusAndHideKeyboard$9();
                break;
            case 1:
                this.f22555b.lambda$requestFocusAndShowKeyboard$8();
                break;
            case 2:
                this.f22555b.show();
                break;
            default:
                this.f22555b.requestFocusAndShowKeyboardIfNeeded();
                break;
        }
    }
}
