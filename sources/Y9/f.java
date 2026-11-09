package Y9;

import W9.B;
import com.transsnet.palmpay.contacts.ui.fragment.PalmPayContactsListFragment;
import com.transsnet.palmpay.core.bean.rsp.PalmPayContactListResp;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PalmPayContactsListFragment f11322f;

    public f(PalmPayContactsListFragment palmPayContactsListFragment) {
        this.f11322f = palmPayContactsListFragment;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f11322f.f(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        this.f11322f.showLoadingDialog(false);
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        PalmPayContactListResp palmPayContactListResp = (PalmPayContactListResp) obj;
        PalmPayContactsListFragment palmPayContactsListFragment = this.f11322f;
        palmPayContactsListFragment.showLoadingDialog(false);
        if (!palmPayContactListResp.isSuccess()) {
            ToastUtils.showLong(palmPayContactListResp.getRespMsg());
            return;
        }
        if (palmPayContactListResp.getData() != null) {
            ArrayList arrayList = new ArrayList();
            if (palmPayContactListResp.getData().getMemberContactsFavouriteList() != null && !palmPayContactListResp.getData().getMemberContactsFavouriteList().isEmpty()) {
                arrayList.addAll(palmPayContactListResp.getData().getMemberContactsFavouriteList());
            }
            if (palmPayContactListResp.getData().getMemberContactsList() == null || palmPayContactListResp.getData().getMemberContactsList().isEmpty()) {
                ModelEmptyView modelEmptyView = new ModelEmptyView(palmPayContactsListFragment.getContext());
                modelEmptyView.f31511b.setImageResource(r.cv_empty_no_palmpay_contacts);
                modelEmptyView.f31512c.setText(R9.f.ct_no_information);
                palmPayContactsListFragment.f27279i.setEmptyView(modelEmptyView);
                palmPayContactsListFragment.f27281o.setVisibility(8);
                palmPayContactsListFragment.f27280j.setVisibility(8);
            } else {
                palmPayContactsListFragment.t = palmPayContactListResp.getData().getMemberContactsList();
                arrayList.addAll(palmPayContactListResp.getData().getMemberContactsList());
                palmPayContactsListFragment.f27281o.setVisibility(0);
                palmPayContactsListFragment.f27280j.setVisibility(0);
            }
            B b7 = palmPayContactsListFragment.f27282p;
            b7.f4985b = arrayList;
            b7.notifyDataSetChanged();
        }
    }
}
