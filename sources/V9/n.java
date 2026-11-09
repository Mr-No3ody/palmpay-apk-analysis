package V9;

import com.transsnet.palmpay.contacts.ui.activity.ContactProfileActivity;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.rsp.PalmPayContactQueryResp;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ContactProfileActivity f10210g;

    public /* synthetic */ n(ContactProfileActivity contactProfileActivity, int i7) {
        this.f10209f = i7;
        this.f10210g = contactProfileActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f10209f) {
            case 0:
                this.f10210g.addSubscription(disposable);
                break;
            case 1:
                this.f10210g.addSubscription(disposable);
                break;
            default:
                this.f10210g.addSubscription(disposable);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f10209f) {
            case 0:
                this.f10210g.showLoadingDialog(false);
                ToastUtils.showLong(str);
                break;
            case 1:
                this.f10210g.showLoadingDialog(false);
                ToastUtils.showLong(str);
                break;
            default:
                this.f10210g.showLoadingDialog(false);
                ToastUtils.showLong(str);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f10209f) {
            case 0:
                PalmPayContactQueryResp palmPayContactQueryResp = (PalmPayContactQueryResp) obj;
                ContactProfileActivity contactProfileActivity = this.f10210g;
                contactProfileActivity.showLoadingDialog(false);
                if (!palmPayContactQueryResp.isSuccess()) {
                    ToastUtils.showLong(palmPayContactQueryResp.getRespMsg());
                } else {
                    PalmPayContact data = palmPayContactQueryResp.getData();
                    contactProfileActivity.f27169B = data;
                    boolean zEquals = "1".equals(data.getIsFavourite());
                    contactProfileActivity.f27168A = zEquals;
                    contactProfileActivity.f27176g.setSelected(zEquals);
                    ToastUtils.showLong(contactProfileActivity.f27168A ? R9.f.ct_add_favourite : R9.f.ct_remove_favourite);
                }
                break;
            case 1:
                PalmPayContactQueryResp palmPayContactQueryResp2 = (PalmPayContactQueryResp) obj;
                ContactProfileActivity contactProfileActivity2 = this.f10210g;
                contactProfileActivity2.showLoadingDialog(false);
                if (!palmPayContactQueryResp2.isSuccess()) {
                    ToastUtils.showLong(palmPayContactQueryResp2.getRespMsg());
                } else {
                    contactProfileActivity2.f27169B = palmPayContactQueryResp2.getData();
                    contactProfileActivity2.o();
                    org.greenrobot.eventbus.c.b().f(contactProfileActivity2.f27169B);
                }
                break;
            default:
                PalmPayContactQueryResp palmPayContactQueryResp3 = (PalmPayContactQueryResp) obj;
                ContactProfileActivity contactProfileActivity3 = this.f10210g;
                contactProfileActivity3.showLoadingDialog(false);
                if (!palmPayContactQueryResp3.isSuccess()) {
                    ToastUtils.showLong(palmPayContactQueryResp3.getRespMsg());
                } else {
                    contactProfileActivity3.f27169B = palmPayContactQueryResp3.getData();
                    contactProfileActivity3.o();
                    org.greenrobot.eventbus.c.b().f(contactProfileActivity3.f27169B);
                }
                break;
        }
    }
}
