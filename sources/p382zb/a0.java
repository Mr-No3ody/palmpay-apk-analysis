package p382zb;

import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.E;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRspData;
import com.transsnet.palmpay.credit.bean.rsp.TopTipsData;
import com.transsnet.palmpay.credit.ui.fragment.OcMainFragment;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcMainFragment f44565b;

    public /* synthetic */ a0(OcMainFragment ocMainFragment, int i7) {
        this.f44564a = i7;
        this.f44565b = ocMainFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TopTipsData accountStatusPrompt;
        TopTipsData accountStatusPrompt2;
        TopTipsData accountStatusPrompt3;
        TopTipsData accountStatusPrompt4;
        OcMainFragment ocMainFragment = this.f44565b;
        switch (this.f44564a) {
            case 0:
                int i7 = OcMainFragment.f30445B0;
                ocMainFragment.getClass();
                ARouter.getInstance().build("/credit_score/oc_protocol_activity").withString("oc_apply_enter_point", "HOME").navigation();
                break;
            case 1:
                int i10 = OcMainFragment.f30445B0;
                E activity = ocMainFragment.getActivity();
                if (activity != null) {
                    ((BaseActivity) activity).goBackToHome();
                }
                break;
            default:
                int i11 = OcMainFragment.f30445B0;
                OkCardMainPageRspData okCardMainPageRspData = ocMainFragment.f30369o;
                if (!TextUtils.isEmpty((okCardMainPageRspData == null || (accountStatusPrompt4 = okCardMainPageRspData.getAccountStatusPrompt()) == null) ? null : accountStatusPrompt4.getJumpPath())) {
                    OkCardMainPageRspData okCardMainPageRspData2 = ocMainFragment.f30369o;
                    String jumpType = (okCardMainPageRspData2 == null || (accountStatusPrompt3 = okCardMainPageRspData2.getAccountStatusPrompt()) == null) ? null : accountStatusPrompt3.getJumpType();
                    OkCardMainPageRspData okCardMainPageRspData3 = ocMainFragment.f30369o;
                    String jumpPath = (okCardMainPageRspData3 == null || (accountStatusPrompt2 = okCardMainPageRspData3.getAccountStatusPrompt()) == null) ? null : accountStatusPrompt2.getJumpPath();
                    OkCardMainPageRspData okCardMainPageRspData4 = ocMainFragment.f30369o;
                    b.Q(jumpType, jumpPath, (okCardMainPageRspData4 == null || (accountStatusPrompt = okCardMainPageRspData4.getAccountStatusPrompt()) == null) ? null : accountStatusPrompt.getJumpParams(), null);
                }
                break;
        }
    }
}
