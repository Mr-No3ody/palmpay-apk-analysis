package K8;

import C0.G;
import F8.d;
import Pa.r0;
import Ya.e;
import Ya.f;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.adsdk.widgets.banner.bannerview.BaseBannerAdapter;
import com.transsnet.adsdk.widgets.banner.bannerview.BaseViewHolder;
import com.transsnet.palmpay.account.bean.MyBankListRsp;
import com.transsnet.palmpay.credit.bean.OcIntroduceData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends BaseBannerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4968a;

    public /* synthetic */ b(int i7) {
        this.f4968a = i7;
    }

    @Override // com.transsnet.adsdk.widgets.banner.bannerview.BaseBannerAdapter
    public final void bindData(BaseViewHolder baseViewHolder, Object obj, int i7, int i10) {
        switch (this.f4968a) {
            case 0:
                MyBankListRsp myBankListRsp = (MyBankListRsp) obj;
                ImageView imageView = baseViewHolder != null ? (ImageView) baseViewHolder.findViewById(d.ivBg) : null;
                ImageView imageView2 = baseViewHolder != null ? (ImageView) baseViewHolder.findViewById(d.ivLogo) : null;
                TextView textView = baseViewHolder != null ? (TextView) baseViewHolder.findViewById(d.tvName) : null;
                TextView textView2 = baseViewHolder != null ? (TextView) baseViewHolder.findViewById(d.tvCardNo) : null;
                if (myBankListRsp != null) {
                    r0.l1(myBankListRsp.bankUrl, imageView2);
                    r0.l1(myBankListRsp.bgUrl, imageView);
                    if (textView != null) {
                        textView.setText(myBankListRsp.bankName);
                    }
                    if (textView2 != null) {
                        String bankAccountNo = myBankListRsp.bankAccountNo;
                        Intrinsics.checkNotNullExpressionValue(bankAccountNo, "bankAccountNo");
                        String strSubstring = bankAccountNo.substring(myBankListRsp.bankAccountNo.length() - 4);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        G.x("**** ", strSubstring, textView2);
                    }
                }
                break;
            default:
                OcIntroduceData ocIntroduceData = (OcIntroduceData) obj;
                if (ocIntroduceData != null) {
                    r0.d1(baseViewHolder != null ? (ImageView) baseViewHolder.findViewById(e.csImageview14) : null, ocIntroduceData.introduceImg);
                    TextView textView3 = baseViewHolder != null ? (TextView) baseViewHolder.findViewById(e.csTextview55) : null;
                    if (textView3 != null) {
                        textView3.setText(ocIntroduceData.introduceTitle);
                    }
                    TextView textView4 = baseViewHolder != null ? (TextView) baseViewHolder.findViewById(e.csTextview83) : null;
                    if (textView4 != null) {
                        textView4.setText(ocIntroduceData.topTitle);
                    }
                    TextView textView5 = baseViewHolder != null ? (TextView) baseViewHolder.findViewById(e.csTextview86) : null;
                    if (textView5 != null) {
                        textView5.setText(ocIntroduceData.introduceContent);
                    }
                }
                break;
        }
    }

    @Override // com.transsnet.adsdk.widgets.banner.bannerview.BaseBannerAdapter
    public final int getLayoutId(int i7) {
        switch (this.f4968a) {
            case 0:
                return F8.e.ac_layout_bank_item;
            default:
                return f.cs_cl_evalution_vp_item_new;
        }
    }
}
