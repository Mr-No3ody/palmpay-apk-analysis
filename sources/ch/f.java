package ch;

import com.transsnet.mtn.sdk.ui.view.InputView;
import com.transsnet.mtn.sdk.ui.view.MTNButton;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements InputView.a, MTNButton.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f19050b;

    public /* synthetic */ f(h hVar, int i7) {
        this.f19049a = i7;
        this.f19050b = hVar;
    }

    @Override // com.transsnet.mtn.sdk.ui.view.InputView.a, com.transsnet.mtn.sdk.ui.view.MTNButton.a
    public final void a() {
        switch (this.f19049a) {
            case 0:
                this.f19050b.d();
                break;
            default:
                h hVar = this.f19050b;
                hVar.f19057f.m(hVar.f19053b.get());
                break;
        }
    }
}
