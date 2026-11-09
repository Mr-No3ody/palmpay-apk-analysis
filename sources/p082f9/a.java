package p082f9;

import Bc.q;
import android.widget.TextView;
import com.transsnet.palmpay.account.bean.rsp.UserRawIdNo;
import com.transsnet.palmpay.account.ui.dialog.KycDetailsDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p010a9.m;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f36422b;

    public /* synthetic */ a(b bVar, int i7) {
        this.f36421a = i7;
        this.f36422b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TextView textView;
        TextView textView2;
        switch (this.f36421a) {
            case 0:
                b bVar = this.f36422b;
                bVar.f36429g = true;
                q qVar = bVar.f36425c;
                if (qVar != null && (textView = qVar.f822j) != null) {
                    UserRawIdNo userRawIdNo = bVar.f36427e;
                    textView.setText(userRawIdNo != null ? userRawIdNo.getBvn() : null);
                }
                bVar.e(true);
                break;
            case 1:
                b bVar2 = this.f36422b;
                bVar2.f36428f = true;
                q qVar2 = bVar2.f36425c;
                if (qVar2 != null && (textView2 = (TextView) qVar2.f823o) != null) {
                    UserRawIdNo userRawIdNo2 = bVar2.f36427e;
                    textView2.setText(userRawIdNo2 != null ? userRawIdNo2.getAuthIdNum() : null);
                }
                bVar2.f(true);
                break;
            default:
                b bVar3 = this.f36422b;
                bVar3.c("details");
                new KycDetailsDialog(bVar3.f36424b, bVar3.f36423a, bVar3.f36426d, bVar3.f36427e, new m(bVar3, 24)).show();
                break;
        }
        return Unit.f38893a;
    }
}
