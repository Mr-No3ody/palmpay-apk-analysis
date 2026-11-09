package com.transsnet.palmpay.account.ui.fragment.upgrade;

import Ad.C0058e;
import Bc.f;
import C0.AbstractC0130w;
import F8.e;
import N9.c;
import Pa.r0;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.rsp.LatestBillerOrderDetailRsp;
import com.transsnet.palmpay.account.bean.rsp.QueryAddressFromBillRsp;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity;
import com.transsnet.palmpay.account.ui.fragment.upgrade.UpgradeTier3StepBillsFragment;
import com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.custom_view.bean.OrderDetailItemBean;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1847n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import p010a9.m;
import p024b9.b;
import p024b9.d;
import p024b9.l;
import p025ba.k;
import p051d9.C1628z;
import p059e1.a;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/upgrade/UpgradeTier3StepBillsFragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "Ld9/z;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/PalmPayLevelUpTier3Contract$View;", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "Ljava/io/File;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUpgradeTier3StepBillsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpgradeTier3StepBillsFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/upgrade/UpgradeTier3StepBillsFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,220:1\n1#2:221\n1869#3,2:222\n*S KotlinDebug\n*F\n+ 1 UpgradeTier3StepBillsFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/upgrade/UpgradeTier3StepBillsFragment\n*L\n143#1:222,2\n*E\n"})
public final class UpgradeTier3StepBillsFragment extends BaseMVPFragment<C1628z> implements PalmPayLevelUpTier3Contract.View, CompleteCallback<File> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AbstractC0130w f26294j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LatestBillerOrderDetailRsp f26295o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f26296p;
    public d t;

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract.View
    public final void handleApplicationResult(CommonBeanResult commonBeanResult) {
        if (!"CFRONT_800405".equals(commonBeanResult != null ? commonBeanResult.getRespCode() : null)) {
            d.f18795f.handleApplicationResult(getActivity(), getContext(), commonBeanResult);
            return;
        }
        E activity = getActivity();
        if (activity != null) {
            n.O(activity, 0, null, "Failed to Verify Address", null, null, null, commonBeanResult.getRespMsg(), null, "Upload Now", new l(this, 0), null, null, null, null, false, 0, 8386939);
        }
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract.View
    public final void handleLatestBillOrder(LatestBillerOrderDetailRsp latestBillerOrderDetailRsp) {
        LatestBillerOrderDetailRsp.OrderDataBean orderDataBean;
        TextView textView;
        TextView textView2;
        LinearLayout linearLayout;
        PpButton ppButton;
        f fVar = this.f26296p;
        if (fVar != null && (ppButton = (PpButton) fVar.f700f) != null) {
            ppButton.setEnabled(true);
        }
        f fVar2 = this.f26296p;
        if (fVar2 != null && (linearLayout = (LinearLayout) fVar2.f698d) != null) {
            h.s(linearLayout, true);
        }
        this.f26295o = latestBillerOrderDetailRsp;
        if (latestBillerOrderDetailRsp == null || (orderDataBean = latestBillerOrderDetailRsp.orderInfo) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<OrderDetailItemBean> list = orderDataBean.ticketExtendFields;
        if (list != null) {
            for (OrderDetailItemBean orderDetailItemBean : list) {
                String key = orderDetailItemBean.getKey();
                String str = "";
                if (key == null) {
                    key = "";
                }
                arrayList.add(key);
                String value = orderDetailItemBean.getValue();
                if (value != null) {
                    str = value;
                }
                arrayList2.add(str);
            }
        }
        Long payAmount = orderDataBean.getPayAmount();
        long jLongValue = payAmount != null ? payAmount.longValue() : 0L;
        Long updateTime = orderDataBean.getUpdateTime();
        long jLongValue2 = updateTime != null ? updateTime.longValue() : 0L;
        f fVar3 = this.f26296p;
        if (fVar3 != null && (textView2 = (TextView) fVar3.f701g) != null) {
            textView2.setText(r0.B(jLongValue, false));
        }
        f fVar4 = this.f26296p;
        if (fVar4 != null && (textView = (TextView) fVar4.f702i) != null) {
            textView.setText(r0.R(jLongValue2));
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        for (int i7 = 0; i7 < iMin; i7++) {
            Object obj = arrayList.get(i7);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            String str2 = (String) obj;
            Object obj2 = arrayList2.get(i7);
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            String str3 = (String) obj2;
            if (y.h(getString(k.core_address), str2, true)) {
                u(1, str2, str3);
            } else {
                u(0, str2, str3);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        PpTitleBar titleBar;
        f fVar = this.f26296p;
        if (fVar != null) {
            TextView textView = (TextView) fVar.f696b;
            int i7 = F8.h.ac_bill_receipt_address_note;
            b bVar = d.f18795f;
            PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityV = v();
            textView.setText(Html.fromHtml(getString(i7, bVar.billReceiptAddressNoteDate(palmPayLevelUpTier3V2ActivityV != null ? palmPayLevelUpTier3V2ActivityV.f25920e : null)), 0));
        }
        PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityV2 = v();
        if (palmPayLevelUpTier3V2ActivityV2 != null && (titleBar = palmPayLevelUpTier3V2ActivityV2.getTitleBar()) != null) {
            titleBar.setBackButtonClickListener(new l(this, 1));
        }
        f fVar2 = this.f26296p;
        if (fVar2 != null) {
            ((PpButton) fVar2.f700f).setOnClickListener(new l(this, 2));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_palmpay_level_up_tier3_step_bills, viewGroup, false);
        int i7 = F8.d.bottomView;
        View viewM = a.m(i7, viewInflate);
        if (viewM != null) {
            Pb.a.bind(viewM);
            i7 = F8.d.itemContainer;
            LinearLayout linearLayout = (LinearLayout) a.m(i7, viewInflate);
            if (linearLayout != null) {
                i7 = F8.d.receiptView;
                LinearLayout linearLayout2 = (LinearLayout) a.m(i7, viewInflate);
                if (linearLayout2 != null) {
                    i7 = F8.d.textViewConfirm;
                    PpButton ppButton = (PpButton) a.m(i7, viewInflate);
                    if (ppButton != null) {
                        i7 = F8.d.tvAmount;
                        TextView textView = (TextView) a.m(i7, viewInflate);
                        if (textView != null) {
                            i7 = F8.d.tvDate;
                            TextView textView2 = (TextView) a.m(i7, viewInflate);
                            if (textView2 != null) {
                                i7 = F8.d.tvLine1;
                                TextView textView3 = (TextView) a.m(i7, viewInflate);
                                if (textView3 != null) {
                                    i7 = F8.d.tvLine2;
                                    TextView textView4 = (TextView) a.m(i7, viewInflate);
                                    if (textView4 != null) {
                                        f fVar = new f((ConstraintLayout) viewInflate, linearLayout, linearLayout2, ppButton, textView, textView2, textView3, textView4);
                                        this.f26296p = fVar;
                                        return fVar;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        String str;
        C1628z c1628z;
        super.n();
        PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityV = v();
        if (palmPayLevelUpTier3V2ActivityV == null || (str = palmPayLevelUpTier3V2ActivityV.f25918c) == null || (c1628z = (C1628z) this.f27328i) == null) {
            return;
        }
        c1628z.queryLatestBillOrder(str);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.f26294j = NavHostFragment.f17502e.findNavController(this);
        f fVar = this.f26296p;
        if (fVar != null) {
            ((PpButton) fVar.f700f).setEnabled(false);
        }
        PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2ActivityV = v();
        final int i7 = 0;
        Function0 function0 = new Function0(this) { // from class: b9.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpgradeTier3StepBillsFragment f18819b;

            {
                this.f18819b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return (C1628z) this.f18819b.f27328i;
                    default:
                        return this.f18819b.f26294j;
                }
            }
        };
        final int i10 = 1;
        this.t = new d(this, palmPayLevelUpTier3V2ActivityV, function0, new Function0(this) { // from class: b9.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpgradeTier3StepBillsFragment f18819b;

            {
                this.f18819b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return (C1628z) this.f18819b.f27328i;
                    default:
                        return this.f18819b.f26294j;
                }
            }
        }, new m(this, 1));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.callback.CompleteCallback
    public final void onComplete(File[] fileArr) {
        File[] objects = fileArr;
        Intrinsics.checkNotNullParameter(objects, "objects");
        f fVar = this.f26296p;
        if (fVar != null) {
            ((PpButton) fVar.f700f).b(false);
        }
        QueryAddressFromBillRsp queryAddressFromBillRspFromPpBillOrder = d.f18795f.fromPpBillOrder(this.f26295o);
        String str = this.f27317a;
        if (queryAddressFromBillRspFromPpBillOrder == null) {
            F6.d.h(str, 3, "pp bill order address is empty");
            ToastUtils.showLong(getString(F8.h.ac_upload_receipt_failed), new Object[0]);
            return;
        }
        File file = (File) C1847n.s(0, objects);
        if (file == null) {
            F6.d.h(str, 3, "receipt screenshot file is null");
            ToastUtils.showLong(getString(F8.h.ac_upload_receipt_failed), new Object[0]);
        } else {
            d dVar = this.t;
            if (dVar != null) {
                dVar.c(file, new C0058e(20, this, queryAddressFromBillRspFromPpBillOrder));
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new C1628z();
    }

    public final void u(int i7, String str, String str2) {
        View viewInflate = i7 == 1 ? LayoutInflater.from(getContext()).inflate(N9.d.cm_transaction_receipt_item_double, (ViewGroup) null, false) : LayoutInflater.from(getContext()).inflate(N9.d.cm_transaction_receipt_item, (ViewGroup) null, false);
        ((TextView) viewInflate.findViewById(c.tv_title)).setText(str);
        ((TextView) viewInflate.findViewById(c.tv_value)).setText(str2);
        f fVar = this.f26296p;
        if (fVar != null) {
            ((LinearLayout) fVar.f697c).addView(viewInflate);
        }
    }

    public final PalmPayLevelUpTier3V2Activity v() {
        E e10 = this.f27319c;
        if (!(e10 instanceof PalmPayLevelUpTier3V2Activity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity");
        return (PalmPayLevelUpTier3V2Activity) e10;
    }
}
