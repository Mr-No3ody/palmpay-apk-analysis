package p185ma;

import Z4.e;
import com.transsnet.palmpay.core.bean.rsp.PalmPayContactListResp;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ShareDialog f39618f;

    public q(ShareDialog shareDialog) {
        this.f39618f = shareDialog;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f39618f.addDisposable(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        PalmPayContactListResp palmPayContactListResp = (PalmPayContactListResp) obj;
        if (!palmPayContactListResp.isSuccess()) {
            ToastUtils.showShort(palmPayContactListResp.getRespMsg());
        } else {
            if (palmPayContactListResp.getData() == null) {
                return;
            }
            this.f39618f.setContactsList(palmPayContactListResp.getData().getMemberContactsList());
        }
    }
}
