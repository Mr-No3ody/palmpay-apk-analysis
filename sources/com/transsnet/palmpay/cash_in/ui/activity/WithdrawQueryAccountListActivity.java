package com.transsnet.palmpay.cash_in.ui.activity;

import A8.b;
import Aa.a;
import C0.G;
import C9.C0144k;
import C9.Z;
import C9.a0;
import C9.b0;
import C9.c0;
import E9.g;
import E9.h;
import E9.i;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.cash_in.bean.response.NearbyAgentsResp;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawQueryAccountListActivity;
import com.transsnet.palmpay.cash_in.ui.viewmodel.WithdrawViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.QueryMemberByCodePlateResp;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.req.QueryRecipientReq;
import com.transsnet.palmpay.core.bean.rsp.QueryRecentlyMerchantResp;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.KeyboardUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p140j8.f;
import p355xf.C2131j;
import p355xf.t;
import p366y9.c;
import p366y9.d;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/cashout/withdraw_query_account")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/activity/WithdrawQueryAccountListActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/cash_in/ui/viewmodel/WithdrawViewModel;", "<init>", "()V", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawQueryAccountListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawQueryAccountListActivity.kt\ncom/transsnet/palmpay/cash_in/ui/activity/WithdrawQueryAccountListActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,366:1\n1#2:367\n152#3:368\n169#3:369\n152#3:370\n169#3:371\n*S KotlinDebug\n*F\n+ 1 WithdrawQueryAccountListActivity.kt\ncom/transsnet/palmpay/cash_in/ui/activity/WithdrawQueryAccountListActivity\n*L\n262#1:368\n262#1:369\n290#1:370\n290#1:371\n*E\n"})
public final class WithdrawQueryAccountListActivity extends BaseMvvmActivity<WithdrawViewModel> {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f26945C = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f26948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f26949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f26950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f26951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f26952g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f26953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f26954j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f26955o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f26956p;
    public List t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f26957v = C2131j.b(new a(4));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f26958w = C2131j.b(new a(5));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f26946A = C2131j.b(new a(6));

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final b f26947B = new b(this, 24);

    public WithdrawQueryAccountListActivity() {
        final int i7 = 3;
        this.f26948c = C2131j.b(new Function0(this) { // from class: C9.Y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawQueryAccountListActivity f1288b;

            {
                this.f1288b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawQueryAccountListActivity withdrawQueryAccountListActivity = this.f1288b;
                switch (i7) {
                    case 0:
                        int i10 = WithdrawQueryAccountListActivity.f26945C;
                        return (IconicsImageView) withdrawQueryAccountListActivity.findViewById(p366y9.b.ivScan);
                    case 1:
                        int i11 = WithdrawQueryAccountListActivity.f26945C;
                        return (IconicsImageView) withdrawQueryAccountListActivity.findViewById(p366y9.b.ivClear);
                    case 2:
                        int i12 = WithdrawQueryAccountListActivity.f26945C;
                        return (EditText) withdrawQueryAccountListActivity.findViewById(p366y9.b.et_account_no);
                    case 3:
                        int i13 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rvQueryList);
                    case 4:
                        int i14 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rvRecentLyList);
                    case 5:
                        int i15 = WithdrawQueryAccountListActivity.f26945C;
                        return (TextView) withdrawQueryAccountListActivity.findViewById(p366y9.b.tv_Recent);
                    case 6:
                        int i16 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rv_nearest);
                    case 7:
                        int i17 = WithdrawQueryAccountListActivity.f26945C;
                        return (LinearLayout) withdrawQueryAccountListActivity.findViewById(p366y9.b.ll_nearest);
                    default:
                        int i18 = WithdrawQueryAccountListActivity.f26945C;
                        return (LinearLayout) withdrawQueryAccountListActivity.findViewById(p366y9.b.ll_recently);
                }
            }
        });
        final int i10 = 4;
        this.f26949d = C2131j.b(new Function0(this) { // from class: C9.Y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawQueryAccountListActivity f1288b;

            {
                this.f1288b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawQueryAccountListActivity withdrawQueryAccountListActivity = this.f1288b;
                switch (i10) {
                    case 0:
                        int i11 = WithdrawQueryAccountListActivity.f26945C;
                        return (IconicsImageView) withdrawQueryAccountListActivity.findViewById(p366y9.b.ivScan);
                    case 1:
                        int i12 = WithdrawQueryAccountListActivity.f26945C;
                        return (IconicsImageView) withdrawQueryAccountListActivity.findViewById(p366y9.b.ivClear);
                    case 2:
                        int i13 = WithdrawQueryAccountListActivity.f26945C;
                        return (EditText) withdrawQueryAccountListActivity.findViewById(p366y9.b.et_account_no);
                    case 3:
                        int i14 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rvQueryList);
                    case 4:
                        int i15 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rvRecentLyList);
                    case 5:
                        int i16 = WithdrawQueryAccountListActivity.f26945C;
                        return (TextView) withdrawQueryAccountListActivity.findViewById(p366y9.b.tv_Recent);
                    case 6:
                        int i17 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rv_nearest);
                    case 7:
                        int i18 = WithdrawQueryAccountListActivity.f26945C;
                        return (LinearLayout) withdrawQueryAccountListActivity.findViewById(p366y9.b.ll_nearest);
                    default:
                        int i19 = WithdrawQueryAccountListActivity.f26945C;
                        return (LinearLayout) withdrawQueryAccountListActivity.findViewById(p366y9.b.ll_recently);
                }
            }
        });
        final int i11 = 5;
        this.f26950e = C2131j.b(new Function0(this) { // from class: C9.Y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawQueryAccountListActivity f1288b;

            {
                this.f1288b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawQueryAccountListActivity withdrawQueryAccountListActivity = this.f1288b;
                switch (i11) {
                    case 0:
                        int i12 = WithdrawQueryAccountListActivity.f26945C;
                        return (IconicsImageView) withdrawQueryAccountListActivity.findViewById(p366y9.b.ivScan);
                    case 1:
                        int i13 = WithdrawQueryAccountListActivity.f26945C;
                        return (IconicsImageView) withdrawQueryAccountListActivity.findViewById(p366y9.b.ivClear);
                    case 2:
                        int i14 = WithdrawQueryAccountListActivity.f26945C;
                        return (EditText) withdrawQueryAccountListActivity.findViewById(p366y9.b.et_account_no);
                    case 3:
                        int i15 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rvQueryList);
                    case 4:
                        int i16 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rvRecentLyList);
                    case 5:
                        int i17 = WithdrawQueryAccountListActivity.f26945C;
                        return (TextView) withdrawQueryAccountListActivity.findViewById(p366y9.b.tv_Recent);
                    case 6:
                        int i18 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rv_nearest);
                    case 7:
                        int i19 = WithdrawQueryAccountListActivity.f26945C;
                        return (LinearLayout) withdrawQueryAccountListActivity.findViewById(p366y9.b.ll_nearest);
                    default:
                        int i110 = WithdrawQueryAccountListActivity.f26945C;
                        return (LinearLayout) withdrawQueryAccountListActivity.findViewById(p366y9.b.ll_recently);
                }
            }
        });
        final int i12 = 6;
        this.f26951f = C2131j.b(new Function0(this) { // from class: C9.Y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawQueryAccountListActivity f1288b;

            {
                this.f1288b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawQueryAccountListActivity withdrawQueryAccountListActivity = this.f1288b;
                switch (i12) {
                    case 0:
                        int i13 = WithdrawQueryAccountListActivity.f26945C;
                        return (IconicsImageView) withdrawQueryAccountListActivity.findViewById(p366y9.b.ivScan);
                    case 1:
                        int i14 = WithdrawQueryAccountListActivity.f26945C;
                        return (IconicsImageView) withdrawQueryAccountListActivity.findViewById(p366y9.b.ivClear);
                    case 2:
                        int i15 = WithdrawQueryAccountListActivity.f26945C;
                        return (EditText) withdrawQueryAccountListActivity.findViewById(p366y9.b.et_account_no);
                    case 3:
                        int i16 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rvQueryList);
                    case 4:
                        int i17 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rvRecentLyList);
                    case 5:
                        int i18 = WithdrawQueryAccountListActivity.f26945C;
                        return (TextView) withdrawQueryAccountListActivity.findViewById(p366y9.b.tv_Recent);
                    case 6:
                        int i19 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rv_nearest);
                    case 7:
                        int i110 = WithdrawQueryAccountListActivity.f26945C;
                        return (LinearLayout) withdrawQueryAccountListActivity.findViewById(p366y9.b.ll_nearest);
                    default:
                        int i111 = WithdrawQueryAccountListActivity.f26945C;
                        return (LinearLayout) withdrawQueryAccountListActivity.findViewById(p366y9.b.ll_recently);
                }
            }
        });
        final int i13 = 7;
        this.f26952g = C2131j.b(new Function0(this) { // from class: C9.Y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawQueryAccountListActivity f1288b;

            {
                this.f1288b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawQueryAccountListActivity withdrawQueryAccountListActivity = this.f1288b;
                switch (i13) {
                    case 0:
                        int i14 = WithdrawQueryAccountListActivity.f26945C;
                        return (IconicsImageView) withdrawQueryAccountListActivity.findViewById(p366y9.b.ivScan);
                    case 1:
                        int i15 = WithdrawQueryAccountListActivity.f26945C;
                        return (IconicsImageView) withdrawQueryAccountListActivity.findViewById(p366y9.b.ivClear);
                    case 2:
                        int i16 = WithdrawQueryAccountListActivity.f26945C;
                        return (EditText) withdrawQueryAccountListActivity.findViewById(p366y9.b.et_account_no);
                    case 3:
                        int i17 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rvQueryList);
                    case 4:
                        int i18 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rvRecentLyList);
                    case 5:
                        int i19 = WithdrawQueryAccountListActivity.f26945C;
                        return (TextView) withdrawQueryAccountListActivity.findViewById(p366y9.b.tv_Recent);
                    case 6:
                        int i110 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rv_nearest);
                    case 7:
                        int i111 = WithdrawQueryAccountListActivity.f26945C;
                        return (LinearLayout) withdrawQueryAccountListActivity.findViewById(p366y9.b.ll_nearest);
                    default:
                        int i112 = WithdrawQueryAccountListActivity.f26945C;
                        return (LinearLayout) withdrawQueryAccountListActivity.findViewById(p366y9.b.ll_recently);
                }
            }
        });
        final int i14 = 8;
        this.f26953i = C2131j.b(new Function0(this) { // from class: C9.Y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawQueryAccountListActivity f1288b;

            {
                this.f1288b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawQueryAccountListActivity withdrawQueryAccountListActivity = this.f1288b;
                switch (i14) {
                    case 0:
                        int i15 = WithdrawQueryAccountListActivity.f26945C;
                        return (IconicsImageView) withdrawQueryAccountListActivity.findViewById(p366y9.b.ivScan);
                    case 1:
                        int i16 = WithdrawQueryAccountListActivity.f26945C;
                        return (IconicsImageView) withdrawQueryAccountListActivity.findViewById(p366y9.b.ivClear);
                    case 2:
                        int i17 = WithdrawQueryAccountListActivity.f26945C;
                        return (EditText) withdrawQueryAccountListActivity.findViewById(p366y9.b.et_account_no);
                    case 3:
                        int i18 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rvQueryList);
                    case 4:
                        int i19 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rvRecentLyList);
                    case 5:
                        int i110 = WithdrawQueryAccountListActivity.f26945C;
                        return (TextView) withdrawQueryAccountListActivity.findViewById(p366y9.b.tv_Recent);
                    case 6:
                        int i111 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rv_nearest);
                    case 7:
                        int i112 = WithdrawQueryAccountListActivity.f26945C;
                        return (LinearLayout) withdrawQueryAccountListActivity.findViewById(p366y9.b.ll_nearest);
                    default:
                        int i113 = WithdrawQueryAccountListActivity.f26945C;
                        return (LinearLayout) withdrawQueryAccountListActivity.findViewById(p366y9.b.ll_recently);
                }
            }
        });
        final int i15 = 0;
        this.f26954j = C2131j.b(new Function0(this) { // from class: C9.Y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawQueryAccountListActivity f1288b;

            {
                this.f1288b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawQueryAccountListActivity withdrawQueryAccountListActivity = this.f1288b;
                switch (i15) {
                    case 0:
                        int i16 = WithdrawQueryAccountListActivity.f26945C;
                        return (IconicsImageView) withdrawQueryAccountListActivity.findViewById(p366y9.b.ivScan);
                    case 1:
                        int i17 = WithdrawQueryAccountListActivity.f26945C;
                        return (IconicsImageView) withdrawQueryAccountListActivity.findViewById(p366y9.b.ivClear);
                    case 2:
                        int i18 = WithdrawQueryAccountListActivity.f26945C;
                        return (EditText) withdrawQueryAccountListActivity.findViewById(p366y9.b.et_account_no);
                    case 3:
                        int i19 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rvQueryList);
                    case 4:
                        int i110 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rvRecentLyList);
                    case 5:
                        int i111 = WithdrawQueryAccountListActivity.f26945C;
                        return (TextView) withdrawQueryAccountListActivity.findViewById(p366y9.b.tv_Recent);
                    case 6:
                        int i112 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rv_nearest);
                    case 7:
                        int i113 = WithdrawQueryAccountListActivity.f26945C;
                        return (LinearLayout) withdrawQueryAccountListActivity.findViewById(p366y9.b.ll_nearest);
                    default:
                        int i114 = WithdrawQueryAccountListActivity.f26945C;
                        return (LinearLayout) withdrawQueryAccountListActivity.findViewById(p366y9.b.ll_recently);
                }
            }
        });
        final int i16 = 1;
        this.f26955o = C2131j.b(new Function0(this) { // from class: C9.Y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawQueryAccountListActivity f1288b;

            {
                this.f1288b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawQueryAccountListActivity withdrawQueryAccountListActivity = this.f1288b;
                switch (i16) {
                    case 0:
                        int i17 = WithdrawQueryAccountListActivity.f26945C;
                        return (IconicsImageView) withdrawQueryAccountListActivity.findViewById(p366y9.b.ivScan);
                    case 1:
                        int i18 = WithdrawQueryAccountListActivity.f26945C;
                        return (IconicsImageView) withdrawQueryAccountListActivity.findViewById(p366y9.b.ivClear);
                    case 2:
                        int i19 = WithdrawQueryAccountListActivity.f26945C;
                        return (EditText) withdrawQueryAccountListActivity.findViewById(p366y9.b.et_account_no);
                    case 3:
                        int i110 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rvQueryList);
                    case 4:
                        int i111 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rvRecentLyList);
                    case 5:
                        int i112 = WithdrawQueryAccountListActivity.f26945C;
                        return (TextView) withdrawQueryAccountListActivity.findViewById(p366y9.b.tv_Recent);
                    case 6:
                        int i113 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rv_nearest);
                    case 7:
                        int i114 = WithdrawQueryAccountListActivity.f26945C;
                        return (LinearLayout) withdrawQueryAccountListActivity.findViewById(p366y9.b.ll_nearest);
                    default:
                        int i115 = WithdrawQueryAccountListActivity.f26945C;
                        return (LinearLayout) withdrawQueryAccountListActivity.findViewById(p366y9.b.ll_recently);
                }
            }
        });
        final int i17 = 2;
        this.f26956p = C2131j.b(new Function0(this) { // from class: C9.Y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawQueryAccountListActivity f1288b;

            {
                this.f1288b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawQueryAccountListActivity withdrawQueryAccountListActivity = this.f1288b;
                switch (i17) {
                    case 0:
                        int i18 = WithdrawQueryAccountListActivity.f26945C;
                        return (IconicsImageView) withdrawQueryAccountListActivity.findViewById(p366y9.b.ivScan);
                    case 1:
                        int i19 = WithdrawQueryAccountListActivity.f26945C;
                        return (IconicsImageView) withdrawQueryAccountListActivity.findViewById(p366y9.b.ivClear);
                    case 2:
                        int i110 = WithdrawQueryAccountListActivity.f26945C;
                        return (EditText) withdrawQueryAccountListActivity.findViewById(p366y9.b.et_account_no);
                    case 3:
                        int i111 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rvQueryList);
                    case 4:
                        int i112 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rvRecentLyList);
                    case 5:
                        int i113 = WithdrawQueryAccountListActivity.f26945C;
                        return (TextView) withdrawQueryAccountListActivity.findViewById(p366y9.b.tv_Recent);
                    case 6:
                        int i114 = WithdrawQueryAccountListActivity.f26945C;
                        return (RecyclerView) withdrawQueryAccountListActivity.findViewById(p366y9.b.rv_nearest);
                    case 7:
                        int i115 = WithdrawQueryAccountListActivity.f26945C;
                        return (LinearLayout) withdrawQueryAccountListActivity.findViewById(p366y9.b.ll_nearest);
                    default:
                        int i116 = WithdrawQueryAccountListActivity.f26945C;
                        return (LinearLayout) withdrawQueryAccountListActivity.findViewById(p366y9.b.ll_recently);
                }
            }
        });
    }

    public static void v(String str, String str2, String str3, String str4) {
        String str5;
        ARouter aRouter = ARouter.getInstance();
        if (Intrinsics.c(str, TransType.TRANS_TYPE_PAY_SHOP)) {
            str5 = "/sm/pay_shop_input_amount";
        } else {
            str5 = Intrinsics.c(str, TransType.TRANS_TYPE_WITHDRAW_TO_AGENT) ? "/sm/withdraw_input_amount" : "/credit_score/input_amount";
        }
        Postcard postcardWithString = aRouter.build(str5).withBoolean("is_send", true).withString("core_order_source_type", "WITHDRAW").withString("sn_no", str4);
        if (TextUtils.equals("03", str)) {
            postcardWithString.withInt("extra_type", 14);
        }
        if (!TextUtils.isEmpty(str2)) {
            postcardWithString.withString("MEMBER_ID", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            postcardWithString.withString("phone_number", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            postcardWithString.withString("extra_data", str4);
        }
        postcardWithString.navigation();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.cash_in_activity_withdraw_query_account;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((WithdrawViewModel) l()).f27118v;
        if (lVar != null) {
            lVar.e(this, new C0144k(new Z(this, 0), 2));
        }
        l lVar2 = ((WithdrawViewModel) l()).f27116o;
        if (lVar2 != null) {
            lVar2.e(this, new C0144k(new Z(this, 1), 2));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final EditText m() {
        Object value = this.f26956p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (EditText) value;
    }

    public final IconicsImageView n() {
        Object value = this.f26955o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IconicsImageView) value;
    }

    public final LinearLayout o() {
        Object value = this.f26953i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final i p() {
        return (i) this.f26957v.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        QueryRecipientReq req = new QueryRecipientReq(2, 5, G.k());
        WithdrawViewModel withdrawViewModel = (WithdrawViewModel) l();
        withdrawViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        f.s(withdrawViewModel, new J9.G(req, null), withdrawViewModel.f27116o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final g q() {
        return (g) this.f26946A.getValue();
    }

    public final h r() {
        return (h) this.f26958w.getValue();
    }

    public final RecyclerView s() {
        Object value = this.f26948c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this), !isDarkMode());
        Intent intent = getIntent();
        this.t = (List) (intent != null ? intent.getSerializableExtra("KEY_DATA") : null);
        Object value = this.f26954j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        IconicsImageView iconicsImageView = (IconicsImageView) value;
        b bVar = this.f26947B;
        if (iconicsImageView != null) {
            iconicsImageView.setOnClickListener(bVar);
        }
        IconicsImageView iconicsImageViewN = n();
        if (iconicsImageViewN != null) {
            iconicsImageViewN.setOnClickListener(bVar);
        }
        List list = this.t;
        if (list != null && !list.isEmpty()) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            t tVar = this.f26951f;
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((RecyclerView) value2).setLayoutManager(linearLayoutManager);
            Object value3 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((RecyclerView) value3).addItemDecoration(new a0());
            Object value4 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((RecyclerView) value4).setAdapter(q());
            Object value5 = this.f26952g.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            ((LinearLayout) value5).setVisibility(0);
            q().setList(this.t);
            final int i7 = 1;
            q().setOnItemClickListener(new OnItemClickListener(this) { // from class: C9.X

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ WithdrawQueryAccountListActivity f1286b;

                {
                    this.f1286b = this;
                }

                @Override // com.chad.library.adapter.base.listener.OnItemClickListener
                public final void onItemClick(M1.j jVar, View view, int i10) {
                    WithdrawQueryAccountListActivity withdrawQueryAccountListActivity = this.f1286b;
                    switch (i7) {
                        case 0:
                            int i11 = WithdrawQueryAccountListActivity.f26945C;
                            Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(view, "<unused var>");
                            QueryMemberByCodePlateResp queryMemberByCodePlateResp = (QueryMemberByCodePlateResp) withdrawQueryAccountListActivity.r().getItem(i10);
                            WithdrawQueryAccountListActivity.v(queryMemberByCodePlateResp.transType, queryMemberByCodePlateResp.memberId, queryMemberByCodePlateResp.phone, queryMemberByCodePlateResp.accountNo);
                            break;
                        case 1:
                            int i12 = WithdrawQueryAccountListActivity.f26945C;
                            Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(view, "<unused var>");
                            NearbyAgentsResp.NearbyShopListBean nearbyShopListBean = (NearbyAgentsResp.NearbyShopListBean) withdrawQueryAccountListActivity.q().getItem(i10);
                            WithdrawQueryAccountListActivity.v(nearbyShopListBean.transType, nearbyShopListBean.memberId, nearbyShopListBean.networkMobile, nearbyShopListBean.accountNo);
                            break;
                        default:
                            int i13 = WithdrawQueryAccountListActivity.f26945C;
                            Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(view, "<unused var>");
                            QueryRecentlyMerchantResp.Data data = (QueryRecentlyMerchantResp.Data) withdrawQueryAccountListActivity.p().getItem(i10);
                            WithdrawQueryAccountListActivity.v(data.getTransType(), data.getMerchantMemberId(), data.getPhone(), data.getSnNo());
                            break;
                    }
                }
            });
            w();
        }
        t().setLayoutManager(new LinearLayoutManager(this));
        t().addItemDecoration(new c0());
        t().setAdapter(p());
        final int i10 = 2;
        p().setOnItemClickListener(new OnItemClickListener(this) { // from class: C9.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawQueryAccountListActivity f1286b;

            {
                this.f1286b = this;
            }

            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(M1.j jVar, View view, int i11) {
                WithdrawQueryAccountListActivity withdrawQueryAccountListActivity = this.f1286b;
                switch (i10) {
                    case 0:
                        int i12 = WithdrawQueryAccountListActivity.f26945C;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        QueryMemberByCodePlateResp queryMemberByCodePlateResp = (QueryMemberByCodePlateResp) withdrawQueryAccountListActivity.r().getItem(i11);
                        WithdrawQueryAccountListActivity.v(queryMemberByCodePlateResp.transType, queryMemberByCodePlateResp.memberId, queryMemberByCodePlateResp.phone, queryMemberByCodePlateResp.accountNo);
                        break;
                    case 1:
                        int i13 = WithdrawQueryAccountListActivity.f26945C;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        NearbyAgentsResp.NearbyShopListBean nearbyShopListBean = (NearbyAgentsResp.NearbyShopListBean) withdrawQueryAccountListActivity.q().getItem(i11);
                        WithdrawQueryAccountListActivity.v(nearbyShopListBean.transType, nearbyShopListBean.memberId, nearbyShopListBean.networkMobile, nearbyShopListBean.accountNo);
                        break;
                    default:
                        int i14 = WithdrawQueryAccountListActivity.f26945C;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        QueryRecentlyMerchantResp.Data data = (QueryRecentlyMerchantResp.Data) withdrawQueryAccountListActivity.p().getItem(i11);
                        WithdrawQueryAccountListActivity.v(data.getTransType(), data.getMerchantMemberId(), data.getPhone(), data.getSnNo());
                        break;
                }
            }
        });
        s().setLayoutManager(new LinearLayoutManager(this));
        s().addItemDecoration(new b0());
        final int i11 = 0;
        r().setOnItemClickListener(new OnItemClickListener(this) { // from class: C9.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawQueryAccountListActivity f1286b;

            {
                this.f1286b = this;
            }

            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(M1.j jVar, View view, int i12) {
                WithdrawQueryAccountListActivity withdrawQueryAccountListActivity = this.f1286b;
                switch (i11) {
                    case 0:
                        int i13 = WithdrawQueryAccountListActivity.f26945C;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        QueryMemberByCodePlateResp queryMemberByCodePlateResp = (QueryMemberByCodePlateResp) withdrawQueryAccountListActivity.r().getItem(i12);
                        WithdrawQueryAccountListActivity.v(queryMemberByCodePlateResp.transType, queryMemberByCodePlateResp.memberId, queryMemberByCodePlateResp.phone, queryMemberByCodePlateResp.accountNo);
                        break;
                    case 1:
                        int i14 = WithdrawQueryAccountListActivity.f26945C;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        NearbyAgentsResp.NearbyShopListBean nearbyShopListBean = (NearbyAgentsResp.NearbyShopListBean) withdrawQueryAccountListActivity.q().getItem(i12);
                        WithdrawQueryAccountListActivity.v(nearbyShopListBean.transType, nearbyShopListBean.memberId, nearbyShopListBean.networkMobile, nearbyShopListBean.accountNo);
                        break;
                    default:
                        int i15 = WithdrawQueryAccountListActivity.f26945C;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        QueryRecentlyMerchantResp.Data data = (QueryRecentlyMerchantResp.Data) withdrawQueryAccountListActivity.p().getItem(i12);
                        WithdrawQueryAccountListActivity.v(data.getTransType(), data.getMerchantMemberId(), data.getPhone(), data.getSnNo());
                        break;
                }
            }
        });
        s().setAdapter(r());
        m().requestFocus();
        m().setHint(G.i("").append(getString(d.ci_digit_number)).setFontFamily("sans-serif").create());
        KeyboardUtils.showSoftInput(m());
        m().addTextChangedListener(new Ab.i(this, 3));
    }

    public final RecyclerView t() {
        Object value = this.f26949d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    public final TextView u() {
        Object value = this.f26950e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void w() {
        p220oa.h.s(o(), p().getData().size() > 0 || q().getData().size() > 0);
    }
}
