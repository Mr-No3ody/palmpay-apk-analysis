package Cd;

import android.widget.TextView;
import com.transsnet.palmpay.send_money.bean.resp.QueryRecipientMemberInfoResp;
import com.transsnet.palmpay.send_money.ui.fragment.AddMobileContactFragment;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AddMobileContactFragment f1365f;

    public g(AddMobileContactFragment addMobileContactFragment) {
        this.f1365f = addMobileContactFragment;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        AddMobileContactFragment addMobileContactFragment = this.f1365f;
        addMobileContactFragment.f33664B = d2;
        addMobileContactFragment.f(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        TextView textView;
        Intrinsics.checkNotNullParameter(message, "message");
        int i7 = AddMobileContactFragment.f33662C;
        AddMobileContactFragment addMobileContactFragment = this.f1365f;
        p223od.l lVar = (p223od.l) addMobileContactFragment.f27335j;
        if (lVar != null && (textView = lVar.f40421p) != null) {
            textView.setText("");
        }
        AddMobileContactFragment.u(addMobileContactFragment);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        QueryRecipientMemberInfoResp queryRecipientMemberInfoResp = (QueryRecipientMemberInfoResp) obj;
        AddMobileContactFragment addMobileContactFragment = this.f1365f;
        if (queryRecipientMemberInfoResp == null || !queryRecipientMemberInfoResp.isSuccess() || queryRecipientMemberInfoResp.getData() == null) {
            int i7 = AddMobileContactFragment.f33662C;
            p223od.l lVar = (p223od.l) addMobileContactFragment.f27335j;
            if (lVar != null) {
                lVar.f40421p.setText("");
            }
        } else {
            int i10 = AddMobileContactFragment.f33662C;
            p223od.l lVar2 = (p223od.l) addMobileContactFragment.f27335j;
            if (lVar2 != null) {
                TextView textView = lVar2.f40421p;
                QueryRecipientMemberInfoResp.Data data = queryRecipientMemberInfoResp.getData();
                textView.setText(data != null ? data.getRecipientNickname() : null);
            }
        }
        AddMobileContactFragment.u(addMobileContactFragment);
    }
}
