package Dd;

import C0.G;
import Hb.L;
import Pa.F;
import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.databundle.ui.view.ModelDataBundleHighlyRecommendItem;
import com.transsnet.palmpay.send_money.ui.fragment.kkcar.KkCarPassengerFragment;
import com.transsnet.palmpay.send_money.ui.view.ClipboardAccountPromptView;
import com.transsnet.palmpay.teller.bean.DataBundleHighlyRecommendItemBean;
import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import com.transsnet.palmpay.teller.ui.dialog.DataBundleDescInfoDialog;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1852a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1856e;

    public /* synthetic */ g(DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean dataBundleWalletItemChildBean, String str, ModelDataBundleHighlyRecommendItem modelDataBundleHighlyRecommendItem, DataBundleHighlyRecommendItemBean dataBundleHighlyRecommendItemBean) {
        this.f1854c = dataBundleWalletItemChildBean;
        this.f1853b = str;
        this.f1855d = modelDataBundleHighlyRecommendItem;
        this.f1856e = dataBundleHighlyRecommendItemBean;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intentA;
        Object obj = this.f1856e;
        Object obj2 = this.f1855d;
        String str = this.f1853b;
        Object obj3 = this.f1854c;
        switch (this.f1852a) {
            case 0:
                int i7 = KkCarPassengerFragment.f33729B;
                ((B) obj3).f38947a = true;
                int iOrdinal = ((i) obj2).ordinal();
                if (iOrdinal == 0) {
                    n0.g().k((ClickEvent) G.f("keke_turnon_accounttopup_click", "app", "native"));
                } else {
                    if (iOrdinal != 1) {
                        throw new l();
                    }
                    n0.g().k((ClickEvent) G.f("keke_qr_biz_error_popup_click", "app", "native"));
                }
                if (str.length() == 0 || (intentA = F.a(((KkCarPassengerFragment) obj).requireContext(), str)) == null) {
                    return;
                }
                ActivityUtils.startActivity(intentA);
                return;
            case 1:
                int i10 = ClipboardAccountPromptView.f33832b;
                n0.g().l(str + "_PasteUp_Click");
                p220oa.h.c((ClipboardAccountPromptView) obj3);
                ((Function1) obj2).invoke((String) obj);
                return;
            default:
                int i11 = ModelDataBundleHighlyRecommendItem.f31780B;
                DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean dataBundleWalletItemChildBean = (DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean) obj3;
                if (dataBundleWalletItemChildBean == null || str == null || StringsKt.F(str) || r0.U0()) {
                    return;
                }
                ModelDataBundleHighlyRecommendItem modelDataBundleHighlyRecommendItem = (ModelDataBundleHighlyRecommendItem) obj2;
                Context context = modelDataBundleHighlyRecommendItem.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                DataBundleHighlyRecommendItemBean dataBundleHighlyRecommendItemBean = (DataBundleHighlyRecommendItemBean) obj;
                String remark = dataBundleHighlyRecommendItemBean.cornerMark;
                if (remark == null) {
                    remark = dataBundleWalletItemChildBean.getRemark();
                }
                new DataBundleDescInfoDialog(context, dataBundleWalletItemChildBean.copy((32703 & 1) != 0 ? dataBundleWalletItemChildBean.price : 0L, (32703 & 2) != 0 ? dataBundleWalletItemChildBean.color : null, (32703 & 4) != 0 ? dataBundleWalletItemChildBean.image : null, (32703 & 8) != 0 ? dataBundleWalletItemChildBean.cornerMark : null, (32703 & 16) != 0 ? dataBundleWalletItemChildBean.itemId : null, (32703 & 32) != 0 ? dataBundleWalletItemChildBean.itemName : null, (32703 & 64) != 0 ? dataBundleWalletItemChildBean.remark : remark, (32703 & 128) != 0 ? dataBundleWalletItemChildBean.deductionAmount : null, (32703 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? dataBundleWalletItemChildBean.description : null, (32703 & 512) != 0 ? dataBundleWalletItemChildBean.volume : null, (32703 & 1024) != 0 ? dataBundleWalletItemChildBean.volumeUnit : null, (32703 & 2048) != 0 ? dataBundleWalletItemChildBean.validityExtDesc : null, (32703 & 4096) != 0 ? dataBundleWalletItemChildBean.validity : null, (32703 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? dataBundleWalletItemChildBean.validityDay : null, (32703 & 16384) != 0 ? dataBundleWalletItemChildBean.isBuyAgain : null), new L(16, modelDataBundleHighlyRecommendItem, dataBundleHighlyRecommendItemBean)).show();
                return;
        }
    }

    public /* synthetic */ g(String str, ClipboardAccountPromptView clipboardAccountPromptView, Function1 function1, String str2) {
        this.f1853b = str;
        this.f1854c = clipboardAccountPromptView;
        this.f1855d = function1;
        this.f1856e = str2;
    }

    public /* synthetic */ g(B b7, i iVar, String str, KkCarPassengerFragment kkCarPassengerFragment) {
        this.f1854c = b7;
        this.f1855d = iVar;
        this.f1853b = str;
        this.f1856e = kkCarPassengerFragment;
    }
}
