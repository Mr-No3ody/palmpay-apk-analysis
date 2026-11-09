package Y9;

import com.transsnet.palmpay.contacts.ui.fragment.CloseContactsFragment;
import com.transsnet.palmpay.core.bean.QueryFamilyAccountRspV2;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CloseContactsFragment f11317f;

    public a(CloseContactsFragment closeContactsFragment) {
        this.f11317f = closeContactsFragment;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f11317f.f(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showShort(str);
        this.f11317f.t.setVisibility(0);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        QueryFamilyAccountRspV2 queryFamilyAccountRspV2 = (QueryFamilyAccountRspV2) obj;
        boolean zIsSuccess = queryFamilyAccountRspV2.isSuccess();
        CloseContactsFragment closeContactsFragment = this.f11317f;
        if (!zIsSuccess || queryFamilyAccountRspV2.data == null) {
            ToastUtils.showShort(queryFamilyAccountRspV2.getRespMsg());
        } else {
            closeContactsFragment.f27271w.clear();
            closeContactsFragment.f27271w.addAll(queryFamilyAccountRspV2.data.list);
            closeContactsFragment.f27270v.notifyDataSetChanged();
        }
        List list = closeContactsFragment.f27270v.f4985b;
        closeContactsFragment.t.setVisibility(list == null || list.isEmpty() ? 0 : 8);
    }
}
