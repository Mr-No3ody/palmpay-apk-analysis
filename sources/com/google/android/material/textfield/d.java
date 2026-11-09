package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22588b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f22587a = i7;
        this.f22588b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22587a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f22588b).lambda$tearDown$2();
                break;
            case 1:
                ((DropdownMenuEndIconDelegate) this.f22588b).lambda$afterEditTextChanged$3();
                break;
            default:
                ((TextInputLayout) this.f22588b).lambda$onGlobalLayout$1();
                break;
        }
    }
}
