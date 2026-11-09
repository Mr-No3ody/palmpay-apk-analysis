package com.transsnet.palmpay.core.ui.fragment.verify;

import C0.G;
import Ha.d;
import O6.c;
import Pa.C0521s;
import Pa.n0;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.E;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.CheckPayResp;
import com.transsnet.palmpay.core.ui.activity.PayVerificationActivity;
import com.transsnet.palmpay.core.ui.mvvm.PayVerifyViewModel;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.core.viewmodel.ModelItemFee;
import com.transsnet.palmpay.custom_view.q;
import io.fastkv.n;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/verify/BaseCheckPinFragment;", "Lcom/transsnet/palmpay/core/ui/fragment/verify/BaseVerifyFragment;", "Lcom/transsnet/palmpay/core/ui/mvvm/PayVerifyViewModel;", "<init>", "()V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseCheckPinFragment extends BaseVerifyFragment<PayVerifyViewModel> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f27928A = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f27929j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f27930o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f27931p = true;
    public long t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f27932v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f27933w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BaseCheckPinFragment newInstance(@Nullable CheckPayReq checkPayReq) {
            BaseCheckPinFragment checkPalmPayPinWithTouchFragment = n.x() ? new CheckPalmPayPinWithTouchFragment() : new CheckPalmPayPinFragment();
            Bundle bundle = new Bundle();
            if (checkPayReq != null) {
                bundle.putString("_order_no", checkPayReq.orderNo);
                bundle.putLong("payAmount", checkPayReq.payAmount);
                bundle.putBoolean("payAmountShow", checkPayReq.showPayAmount);
                bundle.putLong("orderAmount", checkPayReq.orderAmount);
                bundle.putLong("feeAmount", checkPayReq.feeAmount);
                bundle.putString("transType", checkPayReq.transType);
            }
            checkPalmPayPinWithTouchFragment.setArguments(bundle);
            String str = checkPayReq != null ? checkPayReq.transType : null;
            boolean zX = n.x();
            D3.a.J(D3.a.C(str), zX ? "fingerprint" : "pin", zX ? "supported" : "unsupported", zX ? null : "app_not_enabled", "cashier");
            n0.g().u(((ViewEvent) G.g("PalmPayCashier_PIN_VerifyType", false)).add("orderNo", checkPayReq != null ? checkPayReq.orderNo : null).add("transType", checkPayReq != null ? checkPayReq.transType : null).add("VerifyType", n.x() ? "3" : "1"));
            return checkPalmPayPinWithTouchFragment;
        }

        private a() {
        }
    }

    public final void A() {
        if (!(getActivity() instanceof PayVerificationActivity)) {
            E activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        if (!TextUtils.equals(this.f27933w, TransType.TRANS_TYPE_CASH_BOX_WITHDRAW)) {
            E activity2 = getActivity();
            Intrinsics.f(activity2, "null cannot be cast to non-null type com.transsnet.palmpay.core.ui.activity.PayVerificationActivity");
            ((PayVerificationActivity) activity2).n();
        } else {
            E activity3 = getActivity();
            if (activity3 != null) {
                activity3.finish();
            }
        }
    }

    public final void B(ViewGroup viewGroup) {
        HashMap map;
        PayVerificationActivity payVerificationActivityT = t();
        if (payVerificationActivityT == null || (map = payVerificationActivityT.f27696f) == null) {
            return;
        }
        for (String str : map.keySet()) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            ModelItemFee modelItemFee = new ModelItemFee(requireContext());
            ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, contextRequireContext.getResources().getDimensionPixelSize(q.cv_preview_item_height));
            if (viewGroup != null) {
                viewGroup.addView(modelItemFee, 0, layoutParams);
            }
            CharSequence charSequence = (CharSequence) map.get(str);
            modelItemFee.f28361b.setText(str);
            modelItemFee.setContent(charSequence);
        }
        if (viewGroup != null) {
            h.s(viewGroup, true);
        }
    }

    public final void C(BaseCheckPinFragment baseCheckPinFragment) {
        Bundle bundle = new Bundle();
        bundle.putString("_order_no", this.f27929j);
        bundle.putLong("payAmount", this.f27930o);
        bundle.putBoolean("payAmountShow", this.f27931p);
        bundle.putLong("orderAmount", this.t);
        bundle.putLong("feeAmount", this.f27932v);
        bundle.putString("transType", this.f27933w);
        baseCheckPinFragment.setArguments(bundle);
        PayVerificationActivity payVerificationActivityT = t();
        if (payVerificationActivityT != null) {
            payVerificationActivityT.m(baseCheckPinFragment);
        }
    }

    public final void D() {
        D3.a.K("pin", D3.a.C(this.f27933w));
        C(new CheckPalmPayPinFragment());
        n0.g().u(((ViewEvent) G.g("PalmPayCashier_PIN_VerifyType", false)).add("orderNo", this.f27929j).add("transType", this.f27933w).add("VerifyType", "1"));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27929j = arguments.getString("_order_no");
            this.f27933w = arguments.getString("transType");
            this.f27930o = arguments.getLong("payAmount");
            this.f27931p = arguments.getBoolean("payAmountShow", true);
            this.t = arguments.getLong("orderAmount");
            this.f27932v = arguments.getLong("feeAmount");
        }
    }

    public boolean z(CheckPayResp checkPayResp) {
        String respCode = checkPayResp.getRespCode();
        if ("pin_300044".equalsIgnoreCase(respCode) || CommonResult.CODE_PIN_LOCKED.equalsIgnoreCase(respCode) || "pin_300026".equalsIgnoreCase(respCode)) {
            c cVar = new c(getActivity());
            cVar.e(k.core_failed_all_cap);
            cVar.f6598d = checkPayResp.getRespMsg();
            cVar.d(k.core_forgot_pin, new d(this, 20));
            cVar.c(k.core_confirm, null);
            cVar.g();
            return true;
        }
        if ("pin_300001".equalsIgnoreCase(respCode)) {
            Context context = getContext();
            if (context != null) {
                S6.a aVar = S6.a.pay_WarningOutline;
                String respMsg = checkPayResp.getRespMsg();
                Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                h.z(context, respMsg, aVar, null, 53);
                return true;
            }
        } else if (!C0521s.f7158a.j(getActivity(), checkPayResp)) {
            return false;
        }
        return true;
    }
}
