package Uc;

import com.transsnet.palmpay.p2pcash.bean.rsp.CommonMoneyListResp;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingNotesPage;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Uc.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0679x extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BookingNotesPage f9735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0681z f9736g;

    public C0679x(BookingNotesPage bookingNotesPage, C0681z c0681z) {
        this.f9735f = bookingNotesPage;
        this.f9736g = c0681z;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f9735f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        ToastUtils.showLong(msg, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CommonMoneyListResp.DataBean dataBean;
        CommonMoneyListResp commonMoneyListResp = (CommonMoneyListResp) obj;
        if (commonMoneyListResp != null) {
            CommonMoneyListResp commonMoneyListResp2 = commonMoneyListResp.isSuccess() ? commonMoneyListResp : null;
            if (commonMoneyListResp2 != null && (dataBean = commonMoneyListResp2.data) != null) {
                C0681z c0681z = this.f9736g;
                c0681z.f9744b.setValue(c0681z, C0681z.f9742f[0], dataBean);
            }
        }
        if (commonMoneyListResp != null) {
            if ((commonMoneyListResp.isSuccess() ? null : commonMoneyListResp) != null) {
                ToastUtils.showLong(commonMoneyListResp.getRespMsg(), new Object[0]);
            }
        }
    }
}
