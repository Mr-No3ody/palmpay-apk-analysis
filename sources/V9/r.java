package V9;

import W9.C0724e;
import com.transsnet.palmpay.contacts.ui.activity.EditCloseContactsActivity;
import com.transsnet.palmpay.core.bean.CloseContactTag;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.rsp.QueryGroupTagRsp;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ EditCloseContactsActivity f10218g;

    public /* synthetic */ r(EditCloseContactsActivity editCloseContactsActivity, int i7) {
        this.f10217f = i7;
        this.f10218g = editCloseContactsActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f10217f) {
            case 0:
                this.f10218g.addSubscription(disposable);
                break;
            case 1:
                this.f10218g.addSubscription(disposable);
                break;
            case 2:
                this.f10218g.addSubscription(disposable);
                break;
            default:
                this.f10218g.addSubscription(disposable);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f10217f) {
            case 0:
                ToastUtils.showShort(str);
                break;
            case 1:
                break;
            case 2:
                ToastUtils.showShort(str);
                break;
            default:
                ToastUtils.showShort(str);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        List<CloseContactTag> list;
        switch (this.f10217f) {
            case 0:
                QueryGroupTagRsp queryGroupTagRsp = (QueryGroupTagRsp) obj;
                if (queryGroupTagRsp.isSuccess() && (list = queryGroupTagRsp.data) != null && !list.isEmpty()) {
                    EditCloseContactsActivity editCloseContactsActivity = this.f10218g;
                    editCloseContactsActivity.f27208o.clear();
                    editCloseContactsActivity.o();
                    editCloseContactsActivity.f27208o.addAll(queryGroupTagRsp.data);
                    ArrayList arrayList = new ArrayList(new LinkedHashSet(editCloseContactsActivity.f27208o));
                    editCloseContactsActivity.f27208o = arrayList;
                    C0724e c0724e = editCloseContactsActivity.f27207j;
                    c0724e.f4985b = arrayList;
                    c0724e.notifyDataSetChanged();
                    break;
                }
                break;
            case 1:
                if (((CommonResult) obj).isSuccess()) {
                    p367ya.a.d().f44149a.k("key_notification", true);
                }
                break;
            case 2:
                CommonResult commonResult = (CommonResult) obj;
                boolean zIsSuccess = commonResult.isSuccess();
                EditCloseContactsActivity editCloseContactsActivity2 = this.f10218g;
                if (!zIsSuccess) {
                    EditCloseContactsActivity.n(editCloseContactsActivity2, false, commonResult.getRespMsg());
                } else {
                    EditCloseContactsActivity.n(editCloseContactsActivity2, true, "");
                }
                break;
            default:
                CommonResult commonResult2 = (CommonResult) obj;
                ToastUtils.showShort(commonResult2.getRespMsg());
                if (commonResult2.isSuccess()) {
                    this.f10218g.finish();
                }
                break;
        }
    }

    private final void R(String str) {
    }
}
