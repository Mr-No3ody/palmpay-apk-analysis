package com.google.android.material.search;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22557b;

    public /* synthetic */ h(Object obj, int i7) {
        this.f22556a = i7;
        this.f22557b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22556a) {
            case 0:
                ((SearchViewAnimationHelper) this.f22557b).hide();
                break;
            case 1:
                ((SearchViewAnimationHelper) this.f22557b).lambda$startShowAnimationExpand$0();
                break;
            case 2:
                ((SearchViewAnimationHelper) this.f22557b).lambda$startShowAnimationTranslate$1();
                break;
            default:
                ((SearchBar) this.f22557b).lambda$startOnLoadAnimation$0();
                break;
        }
    }
}
