package p235pb;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.credit.bean.resp.RecipientListResp;
import com.transsnet.palmpay.credit.contract.ContactListContract$IView;
import io.reactivex.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f41281a;

    public e(g gVar) {
        this.f41281a = gVar;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        List<RecipientListResp.RecipientBean> list = (List) obj;
        IBaseView iBaseView = this.f41281a.f27351a;
        if (iBaseView != null) {
            ((ContactListContract$IView) iBaseView).showLikeQueryRecipients(list);
        }
    }
}
