package com.transsnet.palmpay.cash_in.ui.activity.instruction;

import Ab.C;
import Ab.D;
import D9.f;
import D9.h;
import D9.i;
import L6.b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.cash_in.network.IRechargeService;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.InterBankCashInInstructionActivity;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;
import p355xf.t;
import p366y9.c;
import p366y9.d;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/cashin_out/fund_instructions")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/activity/instruction/InterBankCashInInstructionActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "D9/h", "a", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InterBankCashInInstructionActivity extends BaseActivity {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f26981p = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f26982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f26983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f26984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f26985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f26986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f26987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f26988g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f26989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f26990j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f f26991o = new f(this, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) InterBankCashInInstructionActivity.class);
            intent.addFlags(268435456);
            context.startActivity(intent);
        }

        private a() {
        }
    }

    public InterBankCashInInstructionActivity() {
        final int i7 = 0;
        this.f26982a = C2131j.b(new Function0(this) { // from class: D9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterBankCashInInstructionActivity f1721b;

            {
                this.f1721b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InterBankCashInInstructionActivity interBankCashInInstructionActivity = this.f1721b;
                switch (i7) {
                    case 0:
                        InterBankCashInInstructionActivity.a aVar = InterBankCashInInstructionActivity.f26981p;
                        return (RecyclerView) interBankCashInInstructionActivity.findViewById(p366y9.b.bankList);
                    case 1:
                        InterBankCashInInstructionActivity.a aVar2 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvShare);
                    case 2:
                        InterBankCashInInstructionActivity.a aVar3 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvBeneficiary);
                    case 3:
                        InterBankCashInInstructionActivity.a aVar4 = InterBankCashInInstructionActivity.f26981p;
                        return (IconicsTextView) interBankCashInInstructionActivity.findViewById(p366y9.b.ivCopy);
                    case 4:
                        InterBankCashInInstructionActivity.a aVar5 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvAccountNumber);
                    case 5:
                        InterBankCashInInstructionActivity.a aVar6 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tv_tip);
                    default:
                        InterBankCashInInstructionActivity.a aVar7 = InterBankCashInInstructionActivity.f26981p;
                        return (PpTitleBar) interBankCashInInstructionActivity.findViewById(p366y9.b.titleBar);
                }
            }
        });
        final int i10 = 1;
        this.f26983b = C2131j.b(new Function0(this) { // from class: D9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterBankCashInInstructionActivity f1721b;

            {
                this.f1721b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InterBankCashInInstructionActivity interBankCashInInstructionActivity = this.f1721b;
                switch (i10) {
                    case 0:
                        InterBankCashInInstructionActivity.a aVar = InterBankCashInInstructionActivity.f26981p;
                        return (RecyclerView) interBankCashInInstructionActivity.findViewById(p366y9.b.bankList);
                    case 1:
                        InterBankCashInInstructionActivity.a aVar2 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvShare);
                    case 2:
                        InterBankCashInInstructionActivity.a aVar3 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvBeneficiary);
                    case 3:
                        InterBankCashInInstructionActivity.a aVar4 = InterBankCashInInstructionActivity.f26981p;
                        return (IconicsTextView) interBankCashInInstructionActivity.findViewById(p366y9.b.ivCopy);
                    case 4:
                        InterBankCashInInstructionActivity.a aVar5 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvAccountNumber);
                    case 5:
                        InterBankCashInInstructionActivity.a aVar6 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tv_tip);
                    default:
                        InterBankCashInInstructionActivity.a aVar7 = InterBankCashInInstructionActivity.f26981p;
                        return (PpTitleBar) interBankCashInInstructionActivity.findViewById(p366y9.b.titleBar);
                }
            }
        });
        final int i11 = 2;
        this.f26984c = C2131j.b(new Function0(this) { // from class: D9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterBankCashInInstructionActivity f1721b;

            {
                this.f1721b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InterBankCashInInstructionActivity interBankCashInInstructionActivity = this.f1721b;
                switch (i11) {
                    case 0:
                        InterBankCashInInstructionActivity.a aVar = InterBankCashInInstructionActivity.f26981p;
                        return (RecyclerView) interBankCashInInstructionActivity.findViewById(p366y9.b.bankList);
                    case 1:
                        InterBankCashInInstructionActivity.a aVar2 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvShare);
                    case 2:
                        InterBankCashInInstructionActivity.a aVar3 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvBeneficiary);
                    case 3:
                        InterBankCashInInstructionActivity.a aVar4 = InterBankCashInInstructionActivity.f26981p;
                        return (IconicsTextView) interBankCashInInstructionActivity.findViewById(p366y9.b.ivCopy);
                    case 4:
                        InterBankCashInInstructionActivity.a aVar5 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvAccountNumber);
                    case 5:
                        InterBankCashInInstructionActivity.a aVar6 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tv_tip);
                    default:
                        InterBankCashInInstructionActivity.a aVar7 = InterBankCashInInstructionActivity.f26981p;
                        return (PpTitleBar) interBankCashInInstructionActivity.findViewById(p366y9.b.titleBar);
                }
            }
        });
        final int i12 = 3;
        this.f26985d = C2131j.b(new Function0(this) { // from class: D9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterBankCashInInstructionActivity f1721b;

            {
                this.f1721b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InterBankCashInInstructionActivity interBankCashInInstructionActivity = this.f1721b;
                switch (i12) {
                    case 0:
                        InterBankCashInInstructionActivity.a aVar = InterBankCashInInstructionActivity.f26981p;
                        return (RecyclerView) interBankCashInInstructionActivity.findViewById(p366y9.b.bankList);
                    case 1:
                        InterBankCashInInstructionActivity.a aVar2 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvShare);
                    case 2:
                        InterBankCashInInstructionActivity.a aVar3 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvBeneficiary);
                    case 3:
                        InterBankCashInInstructionActivity.a aVar4 = InterBankCashInInstructionActivity.f26981p;
                        return (IconicsTextView) interBankCashInInstructionActivity.findViewById(p366y9.b.ivCopy);
                    case 4:
                        InterBankCashInInstructionActivity.a aVar5 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvAccountNumber);
                    case 5:
                        InterBankCashInInstructionActivity.a aVar6 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tv_tip);
                    default:
                        InterBankCashInInstructionActivity.a aVar7 = InterBankCashInInstructionActivity.f26981p;
                        return (PpTitleBar) interBankCashInInstructionActivity.findViewById(p366y9.b.titleBar);
                }
            }
        });
        final int i13 = 4;
        this.f26986e = C2131j.b(new Function0(this) { // from class: D9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterBankCashInInstructionActivity f1721b;

            {
                this.f1721b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InterBankCashInInstructionActivity interBankCashInInstructionActivity = this.f1721b;
                switch (i13) {
                    case 0:
                        InterBankCashInInstructionActivity.a aVar = InterBankCashInInstructionActivity.f26981p;
                        return (RecyclerView) interBankCashInInstructionActivity.findViewById(p366y9.b.bankList);
                    case 1:
                        InterBankCashInInstructionActivity.a aVar2 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvShare);
                    case 2:
                        InterBankCashInInstructionActivity.a aVar3 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvBeneficiary);
                    case 3:
                        InterBankCashInInstructionActivity.a aVar4 = InterBankCashInInstructionActivity.f26981p;
                        return (IconicsTextView) interBankCashInInstructionActivity.findViewById(p366y9.b.ivCopy);
                    case 4:
                        InterBankCashInInstructionActivity.a aVar5 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvAccountNumber);
                    case 5:
                        InterBankCashInInstructionActivity.a aVar6 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tv_tip);
                    default:
                        InterBankCashInInstructionActivity.a aVar7 = InterBankCashInInstructionActivity.f26981p;
                        return (PpTitleBar) interBankCashInInstructionActivity.findViewById(p366y9.b.titleBar);
                }
            }
        });
        final int i14 = 5;
        this.f26987f = C2131j.b(new Function0(this) { // from class: D9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterBankCashInInstructionActivity f1721b;

            {
                this.f1721b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InterBankCashInInstructionActivity interBankCashInInstructionActivity = this.f1721b;
                switch (i14) {
                    case 0:
                        InterBankCashInInstructionActivity.a aVar = InterBankCashInInstructionActivity.f26981p;
                        return (RecyclerView) interBankCashInInstructionActivity.findViewById(p366y9.b.bankList);
                    case 1:
                        InterBankCashInInstructionActivity.a aVar2 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvShare);
                    case 2:
                        InterBankCashInInstructionActivity.a aVar3 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvBeneficiary);
                    case 3:
                        InterBankCashInInstructionActivity.a aVar4 = InterBankCashInInstructionActivity.f26981p;
                        return (IconicsTextView) interBankCashInInstructionActivity.findViewById(p366y9.b.ivCopy);
                    case 4:
                        InterBankCashInInstructionActivity.a aVar5 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvAccountNumber);
                    case 5:
                        InterBankCashInInstructionActivity.a aVar6 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tv_tip);
                    default:
                        InterBankCashInInstructionActivity.a aVar7 = InterBankCashInInstructionActivity.f26981p;
                        return (PpTitleBar) interBankCashInInstructionActivity.findViewById(p366y9.b.titleBar);
                }
            }
        });
        final int i15 = 6;
        this.f26988g = C2131j.b(new Function0(this) { // from class: D9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterBankCashInInstructionActivity f1721b;

            {
                this.f1721b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InterBankCashInInstructionActivity interBankCashInInstructionActivity = this.f1721b;
                switch (i15) {
                    case 0:
                        InterBankCashInInstructionActivity.a aVar = InterBankCashInInstructionActivity.f26981p;
                        return (RecyclerView) interBankCashInInstructionActivity.findViewById(p366y9.b.bankList);
                    case 1:
                        InterBankCashInInstructionActivity.a aVar2 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvShare);
                    case 2:
                        InterBankCashInInstructionActivity.a aVar3 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvBeneficiary);
                    case 3:
                        InterBankCashInInstructionActivity.a aVar4 = InterBankCashInInstructionActivity.f26981p;
                        return (IconicsTextView) interBankCashInInstructionActivity.findViewById(p366y9.b.ivCopy);
                    case 4:
                        InterBankCashInInstructionActivity.a aVar5 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tvAccountNumber);
                    case 5:
                        InterBankCashInInstructionActivity.a aVar6 = InterBankCashInInstructionActivity.f26981p;
                        return (TextView) interBankCashInInstructionActivity.findViewById(p366y9.b.tv_tip);
                    default:
                        InterBankCashInInstructionActivity.a aVar7 = InterBankCashInInstructionActivity.f26981p;
                        return (PpTitleBar) interBankCashInInstructionActivity.findViewById(p366y9.b.titleBar);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.ci_activity_inter_bank_cash_in_instruction;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Object value = this.f26987f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TextView textView = (TextView) value;
        if (textView != null) {
            textView.setText(new SpanUtils().append("You can now transfer money directly from ").append("any bank").setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, this)).append(" into PalmPay balance").create());
        }
        TextView textViewM = m();
        if (textViewM != null) {
            textViewM.setOnClickListener(new f(this, 1));
        }
        this.f26990j = new h(this);
        t tVar = this.f26982a;
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        RecyclerView recyclerView = (RecyclerView) value2;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        }
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        RecyclerView recyclerView2 = (RecyclerView) value3;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new i());
        }
        Object value4 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        RecyclerView recyclerView3 = (RecyclerView) value4;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.f26990j);
        }
        h hVar = this.f26990j;
        if (hVar != null) {
            hVar.f4986c = new A8.a(this, 28);
        }
        TextView textViewM2 = m();
        if (textViewM2 != null) {
            textViewM2.setText(BaseApplication.getInstance().getUser().getFormatAccountNumber());
        }
        Object value5 = this.f26984c.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        TextView textView2 = (TextView) value5;
        if (textView2 != null) {
            textView2.setText(this.f26989i);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void l() {
        showLoadingDialog(true);
        ((IRechargeService) A9.a.f95a.f35518b).getFundInstruction().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new D(this, 5));
    }

    public final TextView m() {
        Object value = this.f26986e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Object value = this.f26988g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        PpTitleBar ppTitleBar = (PpTitleBar) value;
        f fVar = this.f26991o;
        if (ppTitleBar != null) {
            ppTitleBar.setRightTextViewClickListener(fVar);
        }
        Object value2 = this.f26985d.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        IconicsTextView iconicsTextView = (IconicsTextView) value2;
        if (iconicsTextView != null) {
            iconicsTextView.setOnClickListener(fVar);
        }
        t tVar = this.f26983b;
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        TextView textView = (TextView) value3;
        if (textView != null) {
            textView.setOnClickListener(fVar);
        }
        Object value4 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        SpanUtils spanUtils = new SpanUtils();
        IconicsDrawable iconicsDrawable = new IconicsDrawable(this, S6.a.pay_Share);
        iconicsDrawable.a(new C(this, 9));
        ((TextView) value4).setText(spanUtils.appendImage(iconicsDrawable).append(" ").append(getString(d.ci_share_account_information)).create());
        this.f26989i = !TextUtils.isEmpty(BaseApplication.getInstance().getUser().getFullName()) ? BaseApplication.getInstance().getUser().getFullName() : BaseApplication.getInstance().getUser().getNickName();
    }
}
