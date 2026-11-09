package V9;

import Pa.AbstractC0512i;
import com.transsnet.palmpay.contacts.ui.activity.PalmPayContactsListActivity;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.rsp.PalmPayContactListResp;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class C extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PalmPayContactsListActivity f10178f;

    public C(PalmPayContactsListActivity palmPayContactsListActivity) {
        this.f10178f = palmPayContactsListActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f10178f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        this.f10178f.showLoadingDialog(false);
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        PalmPayContactListResp palmPayContactListResp = (PalmPayContactListResp) obj;
        PalmPayContactsListActivity palmPayContactsListActivity = this.f10178f;
        palmPayContactsListActivity.showLoadingDialog(false);
        if (!palmPayContactListResp.isSuccess()) {
            ToastUtils.showLong(palmPayContactListResp.getRespMsg());
            return;
        }
        if (palmPayContactListResp.getData() != null) {
            ArrayList arrayList = new ArrayList();
            if (palmPayContactListResp.getData().getMemberContactsFavouriteList() != null && !palmPayContactListResp.getData().getMemberContactsFavouriteList().isEmpty()) {
                arrayList.addAll(palmPayContactListResp.getData().getMemberContactsFavouriteList());
            }
            if (palmPayContactListResp.getData().getMemberContactsList() != null && !palmPayContactListResp.getData().getMemberContactsList().isEmpty()) {
                List<PalmPayContact> memberContactsList = palmPayContactListResp.getData().getMemberContactsList();
                ArrayList arrayList2 = AbstractC0512i.f7093a;
                arrayList2.clear();
                if (memberContactsList != null && !memberContactsList.isEmpty()) {
                    arrayList2.addAll(memberContactsList);
                }
                arrayList.addAll(palmPayContactListResp.getData().getMemberContactsList());
            }
            W9.B b7 = palmPayContactsListActivity.f27236c;
            b7.f4985b = arrayList;
            b7.notifyDataSetChanged();
        }
    }
}
