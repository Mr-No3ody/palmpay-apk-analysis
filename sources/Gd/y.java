package Gd;

import android.view.View;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.send_money.bean.resp.SearchPalmPayAccountResp;
import com.transsnet.palmpay.send_money.ui.view.TransferToPalmPayAccountView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y implements OnItemClickListener, ResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayAccountView f3381a;

    public /* synthetic */ y(TransferToPalmPayAccountView transferToPalmPayAccountView) {
        this.f3381a = transferToPalmPayAccountView;
    }

    @Override // com.transsnet.palmpay.core.callback.ResultCallback
    public void onComplete(Object obj) {
        TransferToPalmPayAccountView transferToPalmPayAccountView;
        SearchPalmPayAccountResp searchPalmPayAccountResp;
        int i7 = TransferToPalmPayAccountView.t;
        if (!((Boolean) obj).booleanValue() || (searchPalmPayAccountResp = (transferToPalmPayAccountView = this.f3381a).f33933f) == null) {
            return;
        }
        transferToPalmPayAccountView.g(searchPalmPayAccountResp);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        TransferToPalmPayAccountView.b(this.f3381a, jVar, view, i7);
    }
}
