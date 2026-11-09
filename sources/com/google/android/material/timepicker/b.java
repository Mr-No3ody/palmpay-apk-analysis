package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22595b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f22594a = i7;
        this.f22595b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22594a) {
            case 0:
                ((RadialViewGroup) this.f22595b).updateLayoutParams();
                break;
            default:
                ((MaterialTimePicker) this.f22595b).lambda$onViewCreated$0();
                break;
        }
    }
}
