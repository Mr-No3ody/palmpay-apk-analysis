package com.transsnet.palmpay.credit.ui.dialog;

import android.widget.TextView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.credit.bean.resp.QueryPopUpsBean;
import com.transsnet.palmpay.custom_view.dialog.BaseChainResponsibilityDialog;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class T0 extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ OpenCashSuccDialog f30031f;

    public T0(OpenCashSuccDialog openCashSuccDialog) {
        this.f30031f = openCashSuccDialog;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f30031f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str, new Object[0]);
        BaseChainResponsibilityDialog nextChain = this.f30031f.getNextChain();
        if (nextChain != null) {
            nextChain.handlerChain();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z4.e
    public final void y(Object obj) {
        QueryPopUpsBean.BusinessInfo businessInfo;
        CommonBeanResult response = (CommonBeanResult) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        QueryPopUpsBean queryPopUpsBean = (QueryPopUpsBean) response.data;
        if (queryPopUpsBean != null) {
            boolean popUp = queryPopUpsBean.getPopUp();
            OpenCashSuccDialog openCashSuccDialog = this.f30031f;
            if (!popUp) {
                BaseChainResponsibilityDialog nextChain = openCashSuccDialog.getNextChain();
                if (nextChain != null) {
                    nextChain.handlerChain();
                    return;
                }
                return;
            }
            openCashSuccDialog.interceptChain();
            SPUtils.getInstance().put(com.transsnet.palmpay.core.config.d.e(), true);
            TextView textView = openCashSuccDialog.amountTv;
            if (textView != null) {
                QueryPopUpsBean queryPopUpsBean2 = (QueryPopUpsBean) response.data;
                textView.setText(Pa.r0.F((queryPopUpsBean2 == null || (businessInfo = queryPopUpsBean2.getBusinessInfo()) == null) ? 0L : businessInfo.getCreditQuota()));
            }
        }
    }
}
