package com.palmpay.lib.ui.calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class C implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VerticalMonthRecyclerView f24093b;

    public C(VerticalMonthRecyclerView verticalMonthRecyclerView, int i7) {
        this.f24093b = verticalMonthRecyclerView;
        this.f24092a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VerticalMonthRecyclerView verticalMonthRecyclerView = this.f24093b;
        int i7 = this.f24092a;
        verticalMonthRecyclerView.b(i7, verticalMonthRecyclerView.findViewHolderForAdapterPosition(i7) == null);
    }
}
