package Fe;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.rsp.QrcodeGenerateResp;
import com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IView;
import com.transsnet.palmpay.util.SizeUtils;
import io.reactivex.functions.Function;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f2767a;

    public d0(f0 f0Var) {
        this.f2767a = f0Var;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        QrcodeGenerateResp qrcodeGenerateResp = (QrcodeGenerateResp) obj;
        if (TextUtils.isEmpty(qrcodeGenerateResp.data.qrcodeKey)) {
            return null;
        }
        int iDp2px = SizeUtils.dp2px(176.0f);
        Bitmap bitmap = (Bitmap) com.bumptech.glide.b.e(BaseApplication.getContext()).b().load(Integer.valueOf(com.transsnet.palmpay.custom_view.r.cv_qrcode_logo_icon)).f0(SizeUtils.dp2px(45.0f), SizeUtils.dp2px(45.0f)).get();
        IBaseView iBaseView = this.f2767a.f27351a;
        if (iBaseView != null) {
            ((ReceiveMoneyContract$IView) iBaseView).queryRefreshDurationSuccess(qrcodeGenerateResp.data.expiredate);
        }
        return J3.a.i(qrcodeGenerateResp.data.qrcodeKey, iDp2px, iDp2px, bitmap);
    }
}
