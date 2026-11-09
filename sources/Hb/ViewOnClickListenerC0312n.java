package Hb;

import Pa.n0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.view.ProductContentListAdapter$OnApplyClickListener;
import com.transsnet.palmpay.credit.view.ProductContentListView;
import com.transsnet.palmpay.send_money.bean.resp.MemberDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Hb.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC0312n implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3842e;

    public /* synthetic */ ViewOnClickListenerC0312n(ProductContentInfo productContentInfo, PpButton ppButton, boolean z3, BaseViewHolder baseViewHolder, int i7) {
        this.f3838a = i7;
        this.f3839b = productContentInfo;
        this.f3840c = ppButton;
        this.f3841d = z3;
        this.f3842e = baseViewHolder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f3842e;
        Object obj2 = this.f3840c;
        boolean z3 = this.f3841d;
        Object obj3 = this.f3839b;
        switch (this.f3838a) {
            case 0:
                ProductContentInfo productContentInfo = (ProductContentInfo) obj3;
                if (Intrinsics.c(productContentInfo.loanProduct, "PALMPAY_BUSINESS_LOAN")) {
                    n0.g().k((ClickEvent) C0.G.f("BusinessLoanIncreaseLimitLoanPageClick", "module_name", "Borrow"));
                } else {
                    ProductContentListView.f30875c.addClickEvent(productContentInfo);
                    Set set = Eb.b.f2269a;
                    Context context = ((PpButton) obj2).getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Eb.b.b(context, productContentInfo);
                }
                if (!TextUtils.equals("needApply", productContentInfo.status) && !TextUtils.equals("disable", productContentInfo.status) && !TextUtils.equals("canBorrow", productContentInfo.status)) {
                    Pa.F.f(productContentInfo.jumpPath, productContentInfo.jumpType, productContentInfo.jumpParams);
                } else if (!z3) {
                    RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = ((BaseViewHolder) obj).getBindingAdapter();
                    Intrinsics.f(bindingAdapter, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
                    ProductContentListAdapter$OnApplyClickListener productContentListAdapter$OnApplyClickListener = ((Gb.O) bindingAdapter).f3255c;
                    if (productContentListAdapter$OnApplyClickListener != null) {
                        productContentListAdapter$OnApplyClickListener.onApplyClick(productContentInfo);
                    }
                } else {
                    Pa.F.f(productContentInfo.jumpPath, productContentInfo.jumpType, productContentInfo.jumpParams);
                }
                break;
            case 1:
                ProductContentInfo productContentInfo2 = (ProductContentInfo) obj3;
                if (Intrinsics.c(productContentInfo2.loanProduct, "PALMPAY_BUSINESS_LOAN")) {
                    n0.g().k((ClickEvent) C0.G.f("BusinessLoanIncreaseLimitLoanPageClick", "module_name", "Borrow"));
                } else {
                    ProductContentListView.f30875c.addClickEvent(productContentInfo2);
                    Set set2 = Eb.b.f2269a;
                    Context context2 = ((PpButton) obj2).getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    Eb.b.b(context2, productContentInfo2);
                }
                if (!TextUtils.equals("needApply", productContentInfo2.status) && !TextUtils.equals("disable", productContentInfo2.status) && !TextUtils.equals("canBorrow", productContentInfo2.status)) {
                    Pa.F.f(productContentInfo2.jumpPath, productContentInfo2.jumpType, productContentInfo2.jumpParams);
                } else if (!z3) {
                    RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter2 = ((BaseViewHolder) obj).getBindingAdapter();
                    Intrinsics.f(bindingAdapter2, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
                    ProductContentListAdapter$OnApplyClickListener productContentListAdapter$OnApplyClickListener2 = ((Gb.O) bindingAdapter2).f3255c;
                    if (productContentListAdapter$OnApplyClickListener2 != null) {
                        productContentListAdapter$OnApplyClickListener2.onApplyClick(productContentInfo2);
                    }
                } else {
                    Pa.F.f(productContentInfo2.jumpPath, productContentInfo2.jumpType, productContentInfo2.jumpParams);
                }
                break;
            default:
                int i7 = TransferToPalmPayInputAmountActivity.f33602Y;
                Integer num = (Integer) obj3;
                if (num == null || num.intValue() != 5) {
                    Postcard postcardWithInt = ARouter.getInstance().build("/send/personnal_home_page").withBoolean("isHideInfo", z3).withBoolean("is_send", true).withInt("extra_type", num != null ? num.intValue() : 2);
                    MemberDetailResp memberDetailResp = (MemberDetailResp) obj2;
                    if (!TextUtils.isEmpty(memberDetailResp.getMemberId())) {
                        postcardWithInt.withString("MEMBER_ID", memberDetailResp.getMemberId());
                    }
                    if (!TextUtils.isEmpty(memberDetailResp.getPhone())) {
                        postcardWithInt.withString("phone_number", memberDetailResp.getPhone());
                    }
                    TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity = (TransferToPalmPayInputAmountActivity) obj;
                    if (!TextUtils.isEmpty(transferToPalmPayInputAmountActivity.f33613f)) {
                        postcardWithInt.withString("extra_data", transferToPalmPayInputAmountActivity.f33613f);
                    }
                    postcardWithInt.navigation();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0312n(Integer num, boolean z3, MemberDetailResp memberDetailResp, TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity) {
        this.f3838a = 2;
        this.f3839b = num;
        this.f3841d = z3;
        this.f3840c = memberDetailResp;
        this.f3842e = transferToPalmPayInputAmountActivity;
    }
}
