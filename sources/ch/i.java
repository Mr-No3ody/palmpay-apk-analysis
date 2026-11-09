package ch;

import com.transsnet.mtn.sdk.ui.view.InputView;
import com.transsnet.mtn.sdk.ui.view.MTNButton;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements InputView.a, MTNButton.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f19059b;

    public /* synthetic */ i(j jVar, int i7) {
        this.f19058a = i7;
        this.f19059b = jVar;
    }

    @Override // com.transsnet.mtn.sdk.ui.view.InputView.a, com.transsnet.mtn.sdk.ui.view.MTNButton.a
    public final void a() {
        switch (this.f19058a) {
            case 0:
                this.f19059b.d();
                break;
            default:
                j jVar = this.f19059b;
                jVar.f19063d.m(jVar.f19061b.get());
                break;
        }
    }
}
