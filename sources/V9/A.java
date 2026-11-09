package V9;

import com.transsnet.palmpay.contacts.ui.activity.LocalPalmPayContactsListActivity;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class A extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PalmPayContact f10174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10175g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ LocalPalmPayContactsListActivity f10176i;

    public A(LocalPalmPayContactsListActivity localPalmPayContactsListActivity, PalmPayContact palmPayContact, int i7) {
        this.f10176i = localPalmPayContactsListActivity;
        this.f10174f = palmPayContact;
        this.f10175g = i7;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f10176i.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        this.f10176i.showLoadingDialog(false);
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CommonResult commonResult = (CommonResult) obj;
        LocalPalmPayContactsListActivity localPalmPayContactsListActivity = this.f10176i;
        localPalmPayContactsListActivity.showLoadingDialog(false);
        if (!commonResult.isSuccess()) {
            ToastUtils.showLong(commonResult.getRespMsg());
            return;
        }
        LinkedHashMap linkedHashMap = localPalmPayContactsListActivity.f27231f.f10645e;
        PalmPayContact palmPayContact = this.f10174f;
        if (linkedHashMap.get(palmPayContact.getContactsMemberId()) != null) {
            linkedHashMap.put(palmPayContact.getContactsMemberId(), Boolean.valueOf(!((Boolean) linkedHashMap.get(palmPayContact.getContactsMemberId())).booleanValue()));
        } else {
            linkedHashMap.put(palmPayContact.getContactsMemberId(), Boolean.TRUE);
        }
        localPalmPayContactsListActivity.f27231f.notifyItemChanged(this.f10175g);
    }
}
