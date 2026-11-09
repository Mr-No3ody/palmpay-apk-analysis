package com.scwang.smartrefresh.layout.constant;

/* JADX INFO: loaded from: classes3.dex */
public enum RefreshState {
    None(0, false, false, false),
    PullDownToRefresh(1, true, false, false),
    PullUpToLoad(2, true, false, false),
    PullDownCanceled(1, false, false, false),
    PullUpCanceled(2, false, false, false),
    ReleaseToRefresh(1, true, false, false),
    ReleaseToLoad(2, true, false, false),
    ReleaseToTwoLevel(1, true, false, false),
    TwoLevelReleased(1, false, false, false),
    RefreshReleased(1, false, false, false),
    LoadReleased(2, false, false, false),
    Refreshing(1, false, true, false),
    Loading(2, false, true, false),
    TwoLevel(1, false, true, false),
    RefreshFinish(1, false, false, true),
    LoadFinish(2, false, false, true),
    TwoLevelFinish(1, false, false, true);

    public final boolean isDragging;
    public final boolean isFinishing;
    public final boolean isFooter;
    public final boolean isHeader;
    public final boolean isOpening;

    RefreshState(int i7, boolean z3, boolean z8, boolean z10) {
        this.isHeader = i7 == 1;
        this.isFooter = i7 == 2;
        this.isDragging = z3;
        this.isOpening = z8;
        this.isFinishing = z10;
    }
}
