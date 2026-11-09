package androidx.core.app;

import android.content.Intent;

/* JADX INFO: renamed from: androidx.core.app.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1045n implements JobIntentService$GenericWorkItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f15985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f15987c;

    public C1045n(O o10, Intent intent, int i7) {
        this.f15987c = o10;
        this.f15985a = intent;
        this.f15986b = i7;
    }

    @Override // androidx.core.app.JobIntentService$GenericWorkItem
    public final void complete() {
        this.f15987c.stopSelf(this.f15986b);
    }

    @Override // androidx.core.app.JobIntentService$GenericWorkItem
    public final Intent getIntent() {
        return this.f15985a;
    }
}
