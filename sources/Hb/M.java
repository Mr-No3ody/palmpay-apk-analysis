package Hb;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class M implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f3811b;

    public /* synthetic */ M(A a3, int i7) {
        this.f3810a = i7;
        this.f3811b = a3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3810a) {
            case 0:
                this.f3811b.invoke();
                break;
            default:
                this.f3811b.invoke();
                break;
        }
    }
}
