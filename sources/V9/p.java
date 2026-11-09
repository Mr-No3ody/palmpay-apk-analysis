package V9;

import com.transsnet.palmpay.contacts.ui.activity.ContactProfileActivity;
import com.transsnet.palmpay.contacts.ui.activity.ContactSearchOrScanResultActivity;
import com.transsnet.palmpay.core.bean.rsp.MobileContactListResp;
import com.transsnet.palmpay.core.bean.rsp.PalmPayContactQueryResp;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ContactSearchOrScanResultActivity f10214g;

    public /* synthetic */ p(ContactSearchOrScanResultActivity contactSearchOrScanResultActivity, int i7) {
        this.f10213f = i7;
        this.f10214g = contactSearchOrScanResultActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f10213f) {
            case 0:
                this.f10214g.addSubscription(disposable);
                break;
            default:
                this.f10214g.addSubscription(disposable);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f10213f) {
            case 0:
                this.f10214g.showLoadingDialog(false);
                ToastUtils.showLong(str);
                break;
            default:
                this.f10214g.showLoadingDialog(false);
                ToastUtils.showLong(str);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f10213f) {
            case 0:
                PalmPayContactQueryResp palmPayContactQueryResp = (PalmPayContactQueryResp) obj;
                ContactSearchOrScanResultActivity contactSearchOrScanResultActivity = this.f10214g;
                contactSearchOrScanResultActivity.showLoadingDialog(false);
                if (!palmPayContactQueryResp.isSuccess()) {
                    ToastUtils.showLong(palmPayContactQueryResp.getRespMsg());
                } else if (!palmPayContactQueryResp.getData().isFriend()) {
                    contactSearchOrScanResultActivity.f27188e.setText(contactSearchOrScanResultActivity.getString(R9.f.ct_contact_request_sent));
                    contactSearchOrScanResultActivity.f27188e.setEnabled(false);
                } else {
                    ContactProfileActivity.n(contactSearchOrScanResultActivity, palmPayContactQueryResp.getData());
                    contactSearchOrScanResultActivity.finish();
                }
                break;
            default:
                MobileContactListResp mobileContactListResp = (MobileContactListResp) obj;
                ContactSearchOrScanResultActivity contactSearchOrScanResultActivity2 = this.f10214g;
                contactSearchOrScanResultActivity2.showLoadingDialog(false);
                if (mobileContactListResp.isSuccess() && mobileContactListResp.getData() != null && mobileContactListResp.getData().size() > 0) {
                    contactSearchOrScanResultActivity2.f27190g = mobileContactListResp.getData().get(0);
                    contactSearchOrScanResultActivity2.l();
                } else {
                    ToastUtils.showLong(mobileContactListResp.getRespMsg());
                }
                break;
        }
    }
}
