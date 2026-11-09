package p284sb;

import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.credit.ui.activity.SearchMIDActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class U implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchMIDActivity f42142b;

    public /* synthetic */ U(SearchMIDActivity searchMIDActivity, int i7) {
        this.f42141a = i7;
        this.f42142b = searchMIDActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f42141a) {
            case 0:
                this.f42142b.finish();
                break;
            case 1:
                X x3 = (X) this.f42142b.f28783A.getValue();
                x3.getClass();
                ARouter.getInstance().build("/qrcode/scan").navigation();
                x3.f42145a.finish();
                break;
            default:
                this.f42142b.q("");
                break;
        }
    }
}
