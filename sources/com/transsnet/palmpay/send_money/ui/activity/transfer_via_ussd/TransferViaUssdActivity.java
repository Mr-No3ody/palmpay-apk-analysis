package com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd;

import L6.b;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import androidx.camera.camera2.internal.F;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.TransferViaUssdActivity;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p159kd.e;
import p159kd.f;
import p327vd.c;
import p355xf.C2131j;
import p355xf.t;
import p382zb.b0;
import p7.h;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/transfer_via_ussd")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/transfer_via_ussd/TransferViaUssdActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferViaUssdActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferViaUssdActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/transfer_via_ussd/TransferViaUssdActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,266:1\n562#2,10:267\n1#3:277\n*S KotlinDebug\n*F\n+ 1 TransferViaUssdActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/transfer_via_ussd/TransferViaUssdActivity\n*L\n84#1:267,10\n*E\n"})
public final class TransferViaUssdActivity extends BaseActivity {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f33628A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f33629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f33630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33635g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BankInfo f33636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f33637j;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f33640v;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f33638o = "Amount";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f33639p = "Bank Code";
    public String t = "10 digit Acc No.";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f33641w = new c(this, 24);

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

    public TransferViaUssdActivity() {
        final int i7 = 0;
        this.f33629a = C2131j.b(new Function0(this) { // from class: zd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferViaUssdActivity f44685b;

            {
                this.f44685b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferViaUssdActivity transferViaUssdActivity = this.f44685b;
                switch (i7) {
                    case 0:
                        int i10 = TransferViaUssdActivity.f33628A;
                        return (TextView) transferViaUssdActivity.findViewById(e.tv_next);
                    case 1:
                        int i11 = TransferViaUssdActivity.f33628A;
                        return (PpAmountEditText) transferViaUssdActivity.findViewById(e.et_transfer_money);
                    case 2:
                        int i12 = TransferViaUssdActivity.f33628A;
                        return (ModelErrorDivider) transferViaUssdActivity.findViewById(e.med_bank);
                    case 3:
                        int i13 = TransferViaUssdActivity.f33628A;
                        return (IconicsTextView) transferViaUssdActivity.findViewById(e.tv_select_bank);
                    case 4:
                        int i14 = TransferViaUssdActivity.f33628A;
                        return (ModelErrorDivider) transferViaUssdActivity.findViewById(e.med_account);
                    case 5:
                        int i15 = TransferViaUssdActivity.f33628A;
                        return (EditText) transferViaUssdActivity.findViewById(e.et_bank_account);
                    default:
                        int i16 = TransferViaUssdActivity.f33628A;
                        return (TextView) transferViaUssdActivity.findViewById(e.tv_ussd_code);
                }
            }
        });
        final int i10 = 1;
        this.f33630b = C2131j.b(new Function0(this) { // from class: zd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferViaUssdActivity f44685b;

            {
                this.f44685b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferViaUssdActivity transferViaUssdActivity = this.f44685b;
                switch (i10) {
                    case 0:
                        int i11 = TransferViaUssdActivity.f33628A;
                        return (TextView) transferViaUssdActivity.findViewById(e.tv_next);
                    case 1:
                        int i12 = TransferViaUssdActivity.f33628A;
                        return (PpAmountEditText) transferViaUssdActivity.findViewById(e.et_transfer_money);
                    case 2:
                        int i13 = TransferViaUssdActivity.f33628A;
                        return (ModelErrorDivider) transferViaUssdActivity.findViewById(e.med_bank);
                    case 3:
                        int i14 = TransferViaUssdActivity.f33628A;
                        return (IconicsTextView) transferViaUssdActivity.findViewById(e.tv_select_bank);
                    case 4:
                        int i15 = TransferViaUssdActivity.f33628A;
                        return (ModelErrorDivider) transferViaUssdActivity.findViewById(e.med_account);
                    case 5:
                        int i16 = TransferViaUssdActivity.f33628A;
                        return (EditText) transferViaUssdActivity.findViewById(e.et_bank_account);
                    default:
                        int i17 = TransferViaUssdActivity.f33628A;
                        return (TextView) transferViaUssdActivity.findViewById(e.tv_ussd_code);
                }
            }
        });
        final int i11 = 2;
        this.f33631c = C2131j.b(new Function0(this) { // from class: zd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferViaUssdActivity f44685b;

            {
                this.f44685b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferViaUssdActivity transferViaUssdActivity = this.f44685b;
                switch (i11) {
                    case 0:
                        int i12 = TransferViaUssdActivity.f33628A;
                        return (TextView) transferViaUssdActivity.findViewById(e.tv_next);
                    case 1:
                        int i13 = TransferViaUssdActivity.f33628A;
                        return (PpAmountEditText) transferViaUssdActivity.findViewById(e.et_transfer_money);
                    case 2:
                        int i14 = TransferViaUssdActivity.f33628A;
                        return (ModelErrorDivider) transferViaUssdActivity.findViewById(e.med_bank);
                    case 3:
                        int i15 = TransferViaUssdActivity.f33628A;
                        return (IconicsTextView) transferViaUssdActivity.findViewById(e.tv_select_bank);
                    case 4:
                        int i16 = TransferViaUssdActivity.f33628A;
                        return (ModelErrorDivider) transferViaUssdActivity.findViewById(e.med_account);
                    case 5:
                        int i17 = TransferViaUssdActivity.f33628A;
                        return (EditText) transferViaUssdActivity.findViewById(e.et_bank_account);
                    default:
                        int i18 = TransferViaUssdActivity.f33628A;
                        return (TextView) transferViaUssdActivity.findViewById(e.tv_ussd_code);
                }
            }
        });
        final int i12 = 3;
        this.f33632d = C2131j.b(new Function0(this) { // from class: zd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferViaUssdActivity f44685b;

            {
                this.f44685b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferViaUssdActivity transferViaUssdActivity = this.f44685b;
                switch (i12) {
                    case 0:
                        int i13 = TransferViaUssdActivity.f33628A;
                        return (TextView) transferViaUssdActivity.findViewById(e.tv_next);
                    case 1:
                        int i14 = TransferViaUssdActivity.f33628A;
                        return (PpAmountEditText) transferViaUssdActivity.findViewById(e.et_transfer_money);
                    case 2:
                        int i15 = TransferViaUssdActivity.f33628A;
                        return (ModelErrorDivider) transferViaUssdActivity.findViewById(e.med_bank);
                    case 3:
                        int i16 = TransferViaUssdActivity.f33628A;
                        return (IconicsTextView) transferViaUssdActivity.findViewById(e.tv_select_bank);
                    case 4:
                        int i17 = TransferViaUssdActivity.f33628A;
                        return (ModelErrorDivider) transferViaUssdActivity.findViewById(e.med_account);
                    case 5:
                        int i18 = TransferViaUssdActivity.f33628A;
                        return (EditText) transferViaUssdActivity.findViewById(e.et_bank_account);
                    default:
                        int i19 = TransferViaUssdActivity.f33628A;
                        return (TextView) transferViaUssdActivity.findViewById(e.tv_ussd_code);
                }
            }
        });
        final int i13 = 4;
        this.f33633e = C2131j.b(new Function0(this) { // from class: zd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferViaUssdActivity f44685b;

            {
                this.f44685b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferViaUssdActivity transferViaUssdActivity = this.f44685b;
                switch (i13) {
                    case 0:
                        int i14 = TransferViaUssdActivity.f33628A;
                        return (TextView) transferViaUssdActivity.findViewById(e.tv_next);
                    case 1:
                        int i15 = TransferViaUssdActivity.f33628A;
                        return (PpAmountEditText) transferViaUssdActivity.findViewById(e.et_transfer_money);
                    case 2:
                        int i16 = TransferViaUssdActivity.f33628A;
                        return (ModelErrorDivider) transferViaUssdActivity.findViewById(e.med_bank);
                    case 3:
                        int i17 = TransferViaUssdActivity.f33628A;
                        return (IconicsTextView) transferViaUssdActivity.findViewById(e.tv_select_bank);
                    case 4:
                        int i18 = TransferViaUssdActivity.f33628A;
                        return (ModelErrorDivider) transferViaUssdActivity.findViewById(e.med_account);
                    case 5:
                        int i19 = TransferViaUssdActivity.f33628A;
                        return (EditText) transferViaUssdActivity.findViewById(e.et_bank_account);
                    default:
                        int i110 = TransferViaUssdActivity.f33628A;
                        return (TextView) transferViaUssdActivity.findViewById(e.tv_ussd_code);
                }
            }
        });
        final int i14 = 5;
        this.f33634f = C2131j.b(new Function0(this) { // from class: zd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferViaUssdActivity f44685b;

            {
                this.f44685b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferViaUssdActivity transferViaUssdActivity = this.f44685b;
                switch (i14) {
                    case 0:
                        int i15 = TransferViaUssdActivity.f33628A;
                        return (TextView) transferViaUssdActivity.findViewById(e.tv_next);
                    case 1:
                        int i16 = TransferViaUssdActivity.f33628A;
                        return (PpAmountEditText) transferViaUssdActivity.findViewById(e.et_transfer_money);
                    case 2:
                        int i17 = TransferViaUssdActivity.f33628A;
                        return (ModelErrorDivider) transferViaUssdActivity.findViewById(e.med_bank);
                    case 3:
                        int i18 = TransferViaUssdActivity.f33628A;
                        return (IconicsTextView) transferViaUssdActivity.findViewById(e.tv_select_bank);
                    case 4:
                        int i19 = TransferViaUssdActivity.f33628A;
                        return (ModelErrorDivider) transferViaUssdActivity.findViewById(e.med_account);
                    case 5:
                        int i110 = TransferViaUssdActivity.f33628A;
                        return (EditText) transferViaUssdActivity.findViewById(e.et_bank_account);
                    default:
                        int i111 = TransferViaUssdActivity.f33628A;
                        return (TextView) transferViaUssdActivity.findViewById(e.tv_ussd_code);
                }
            }
        });
        final int i15 = 6;
        this.f33635g = C2131j.b(new Function0(this) { // from class: zd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferViaUssdActivity f44685b;

            {
                this.f44685b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferViaUssdActivity transferViaUssdActivity = this.f44685b;
                switch (i15) {
                    case 0:
                        int i16 = TransferViaUssdActivity.f33628A;
                        return (TextView) transferViaUssdActivity.findViewById(e.tv_next);
                    case 1:
                        int i17 = TransferViaUssdActivity.f33628A;
                        return (PpAmountEditText) transferViaUssdActivity.findViewById(e.et_transfer_money);
                    case 2:
                        int i18 = TransferViaUssdActivity.f33628A;
                        return (ModelErrorDivider) transferViaUssdActivity.findViewById(e.med_bank);
                    case 3:
                        int i19 = TransferViaUssdActivity.f33628A;
                        return (IconicsTextView) transferViaUssdActivity.findViewById(e.tv_select_bank);
                    case 4:
                        int i110 = TransferViaUssdActivity.f33628A;
                        return (ModelErrorDivider) transferViaUssdActivity.findViewById(e.med_account);
                    case 5:
                        int i111 = TransferViaUssdActivity.f33628A;
                        return (EditText) transferViaUssdActivity.findViewById(e.et_bank_account);
                    default:
                        int i112 = TransferViaUssdActivity.f33628A;
                        return (TextView) transferViaUssdActivity.findViewById(e.tv_ussd_code);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_activity_transfer_via_ussd;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        getSupportFragmentManager().setFragmentResultListener("REQUEST_SELECT_BANK", this, new b0(this));
    }

    public final EditText l() {
        Object value = this.f33634f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (EditText) value;
    }

    public final PpAmountEditText m() {
        Object value = this.f33630b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PpAmountEditText) value;
    }

    public final ModelErrorDivider n() {
        Object value = this.f33633e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelErrorDivider) value;
    }

    public final IconicsTextView o() {
        Object value = this.f33632d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IconicsTextView) value;
    }

    public final void p() {
        if (TextUtils.isEmpty(this.f33637j)) {
            this.f33637j = SPUtils.get().getString("ussd_dial_code", "");
        }
        String str = this.f33637j;
        String str2 = this.f33638o;
        String str3 = this.t;
        String str4 = this.f33639p;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("*");
        sb2.append(str2);
        sb2.append("*");
        sb2.append(str3);
        this.f33640v = F.d(sb2, "*", str4, "#");
        Object value = this.f33635g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TextView textView = (TextView) value;
        SpanUtils spanUtilsAppendLine = new SpanUtils().appendLine("USSD Code");
        String str5 = this.f33640v;
        textView.setText(spanUtilsAppendLine.append(str5 != null ? str5 : "").setForegroundColor(getColor(b.ppColorPrimary)).setFontSize(18, true).create());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(-1);
        ARouter.getInstance().inject(this);
        Handler uIHandler = getUIHandler();
        Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
        getWindow().getDecorView().post(new h(uIHandler, 27, this, false));
    }
}
