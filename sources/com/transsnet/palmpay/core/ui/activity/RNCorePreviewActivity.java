package com.transsnet.palmpay.core.ui.activity;

import Pa.C0525w;
import android.content.Intent;
import android.net.Uri;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.reflect.TypeToken;
import com.transsnet.palmpay.core.bean.cashier.CalcOfPaymentMethodResultBean;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierRNPaymentExtra;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/core/rn_preview")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/RNCorePreviewActivity;", "Lcom/transsnet/palmpay/core/ui/activity/CoreCashierPreviewActivity;", "<init>", "()V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRNCorePreviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNCorePreviewActivity.kt\ncom/transsnet/palmpay/core/ui/activity/RNCorePreviewActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1869#2,2:103\n*S KotlinDebug\n*F\n+ 1 RNCorePreviewActivity.kt\ncom/transsnet/palmpay/core/ui/activity/RNCorePreviewActivity\n*L\n58#1:103,2\n*E\n"})
public final class RNCorePreviewActivity extends CoreCashierPreviewActivity {

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final /* synthetic */ int f27706a1 = 0;
    public final p355xf.t Z0 = C2131j.b(new X6.c(this, 17));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity
    public final void h0() {
        if (((Boolean) this.Z0.getValue()).booleanValue()) {
            super.h0();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity
    public final void p0(CalcOfPaymentMethodResultBean bean, boolean z3) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        super.p0(bean, z3);
        if (((Boolean) this.Z0.getValue()).booleanValue()) {
            return;
        }
        showLoadingDialog(true);
        c0();
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    public final String s() {
        String stringExtra;
        Intent intent = getIntent();
        return (intent == null || (stringExtra = intent.getStringExtra("mPayeeAccountType")) == null) ? "" : stringExtra;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    /* JADX INFO: renamed from: t */
    public final String getF27456f() {
        String stringExtra;
        Intent intent = getIntent();
        return (intent == null || (stringExtra = intent.getStringExtra("mSubTransType")) == null) ? "" : stringExtra;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    public final void v(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("mJSONExtras");
        if (stringExtra != null) {
            try {
                ArrayList<CoreCashierRNPaymentExtra> arrayList = (ArrayList) C0525w.f().e(stringExtra, new TypeToken<ArrayList<CoreCashierRNPaymentExtra>>() { // from class: com.transsnet.palmpay.core.ui.activity.RNCorePreviewActivity$parseData$1$type$1
                }.getType());
                ArrayList arrayList2 = this.f27505P0;
                if (arrayList2 == null) {
                    this.f27505P0 = new ArrayList();
                } else {
                    arrayList2.clear();
                }
                Intrinsics.e(arrayList);
                for (CoreCashierRNPaymentExtra coreCashierRNPaymentExtra : arrayList) {
                    ArrayList arrayList3 = this.f27505P0;
                    if (arrayList3 != null) {
                        String str = coreCashierRNPaymentExtra.key;
                        String str2 = coreCashierRNPaymentExtra.value;
                        Integer num = coreCashierRNPaymentExtra.style;
                        String str3 = coreCashierRNPaymentExtra.subValue;
                        String str4 = coreCashierRNPaymentExtra.tagIv;
                        if (str4 == null) {
                            str4 = "";
                        }
                        arrayList3.add(new CoreCashierPaymentExtra(str, str2, num, str3, Uri.parse(str4)));
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
