package com.alibaba.android.alpha;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OnProjectExecuteListener f20348b;

    public h(boolean z3, String str) {
        super(str);
        this.f20347a = z3;
    }

    @Override // com.alibaba.android.alpha.Task
    public final void run() {
        OnProjectExecuteListener onProjectExecuteListener = this.f20348b;
        if (onProjectExecuteListener != null) {
            if (this.f20347a) {
                onProjectExecuteListener.onProjectStart();
            } else {
                onProjectExecuteListener.onProjectFinish();
            }
        }
    }
}
