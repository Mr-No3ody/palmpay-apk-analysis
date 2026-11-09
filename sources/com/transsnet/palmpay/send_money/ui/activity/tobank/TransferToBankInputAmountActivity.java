package com.transsnet.palmpay.send_money.ui.activity.tobank;

import Ad.H;
import B8.b;
import C0.G;
import Ed.ViewOnTouchListenerC0223c;
import Kd.C0410r1;
import Kd.C0413s1;
import Kd.C0419u1;
import Kd.C0428x1;
import L6.f;
import N8.q0;
import Pa.n0;
import Pa.r0;
import R3.e;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.edit.AmountEditText;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.dialog.ConfirmLargeAndRecipientInfoDialog;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.custom_view.utils.CommonExtKt;
import com.transsnet.palmpay.send_money.bean.ConfigReq;
import com.transsnet.palmpay.send_money.bean.FinanceGuidanceBean;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoReq;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoRsp;
import com.transsnet.palmpay.send_money.bean.event.TransactionEvent;
import com.transsnet.palmpay.send_money.bean.req.TransferBankChannelInfoReq;
import com.transsnet.palmpay.send_money.bean.req.TransferCreateOrderReq;
import com.transsnet.palmpay.send_money.bean.resp.CreateTransferOrderBeforeResp;
import com.transsnet.palmpay.send_money.bean.resp.TransferBankChannelInfoResp;
import com.transsnet.palmpay.send_money.bean.resp.TransferToBankAccountInfoResp;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.dialog.BeneficiaryBankUnstableDialog;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmDuplicateTransferDialog;
import com.transsnet.palmpay.send_money.ui.dialog.CyberSecurityLevyDialog;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankViewModel;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p141j9.C1807o;
import p159kd.h;
import p223od.i;
import p270rd.C1969l;
import p270rd.ViewOnTouchListenerC1971n;
import p284sb.C2023v;
import p310ub.K;
import p353xd.A;
import p353xd.C;
import p353xd.r;
import p353xd.s;
import p353xd.t;
import p353xd.v;
import p353xd.x;
import p353xd.y;
import p353xd.z;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/trans_to_bank_confirm")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/tobank/TransferToBankInputAmountActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferToBankViewModel;", "Lod/i;", "<init>", "()V", "Lcom/transsnet/palmpay/send_money/bean/event/TransactionEvent;", "event", "", "onTransactionMessage", "(Lcom/transsnet/palmpay/send_money/bean/event/TransactionEvent;)V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToBankInputAmountActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToBankInputAmountActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/tobank/TransferToBankInputAmountActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1002:1\n171#2,12:1003\n215#2:1015\n171#2,12:1016\n215#2:1028\n171#2,12:1029\n215#2:1041\n115#2,8:1042\n145#2:1050\n115#2,8:1051\n145#2:1059\n562#3,10:1060\n55#4,12:1070\n84#4,3:1082\n1869#5,2:1085\n1#6:1087\n*S KotlinDebug\n*F\n+ 1 TransferToBankInputAmountActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/tobank/TransferToBankInputAmountActivity\n*L\n158#1:1003,12\n158#1:1015\n168#1:1016,12\n168#1:1028\n175#1:1029,12\n175#1:1041\n180#1:1042,8\n180#1:1050\n202#1:1051,8\n202#1:1059\n233#1:1060,10\n348#1:1070,12\n348#1:1082,3\n371#1:1085,2\n*E\n"})
public final class TransferToBankInputAmountActivity extends BaseMvvmVBActivity<TransferToBankViewModel, i> {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f33522C = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public H f33523A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public P8.a f33524B;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BankInfo f33526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f33528g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TransferBankChannelInfoResp f33531o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public BalanceAndLimitResp.BalanceAndLimitData f33532p;
    public ConfirmDuplicateTransferDialog t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public BeneficiaryBankUnstableDialog f33533v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CyberSecurityLevyDialog f33534w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33525d = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f33529i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f33530j = "COMMON";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void startAct$default(a aVar, Context context, String str, BankInfo bankInfo, String str2, String str3, Boolean bool, int i7, Object obj) {
            if ((i7 & 16) != 0) {
                str3 = "COMMON";
            }
            String str4 = str3;
            if ((i7 & 32) != 0) {
                bool = Boolean.TRUE;
            }
            aVar.startAct(context, str, bankInfo, str2, str4, bool);
        }

        public final void startAct(@NotNull Context context, @Nullable String str, @Nullable BankInfo bankInfo, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool) {
            context.startActivity(G.e(context, "context", context, TransferToBankInputAmountActivity.class).putExtra("BANK_ACCOUNT_NUMBER", str).putExtra("BANK_CARD_INFO", bankInfo).putExtra("contact_name", str2).putExtra("core_order_source_type", str3).putExtra("receiveAccountNameFlag", bool));
        }

        private a() {
        }
    }

    public static final void n(final TransferToBankInputAmountActivity transferToBankInputAmountActivity) {
        TextView textView;
        AmountEditText amountEditText;
        final int i7 = 1;
        final int i10 = 0;
        i iVar = (i) transferToBankInputAmountActivity.f27334c;
        AmountEditText amountEditText2 = iVar != null ? (AmountEditText) iVar.f40374c.findViewById(f.edit_amount) : null;
        b bVar = new b(6);
        i iVar2 = (i) transferToBankInputAmountActivity.f27334c;
        if (iVar2 != null) {
            iVar2.f40373b.setFilters(new InputFilter[]{bVar});
        }
        if (amountEditText2 != null) {
            amountEditText2.setShowSoftInputOnFocus(false);
        }
        i iVar3 = (i) transferToBankInputAmountActivity.f27334c;
        if (iVar3 != null) {
            iVar3.f40380j.setDigitalKeyboardClickListener(new A(amountEditText2, transferToBankInputAmountActivity));
        }
        if (amountEditText2 != null) {
            amountEditText2.setOnTouchListener(new ViewOnTouchListenerC1971n(transferToBankInputAmountActivity, amountEditText2, 2));
        }
        i iVar4 = (i) transferToBankInputAmountActivity.f27334c;
        if (iVar4 != null) {
            iVar4.f40373b.setOnTouchListener(new ViewOnTouchListenerC0223c(transferToBankInputAmountActivity, 12));
        }
        i iVar5 = (i) transferToBankInputAmountActivity.f27334c;
        if (iVar5 != null && (amountEditText = (AmountEditText) iVar5.f40374c.findViewById(f.edit_amount)) != null) {
            amountEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(13)});
        }
        i iVar6 = (i) transferToBankInputAmountActivity.f27334c;
        if (iVar6 != null) {
            iVar6.f40374c.setOnErrorVisibilityChangeListener(new r(transferToBankInputAmountActivity));
        }
        i iVar7 = (i) transferToBankInputAmountActivity.f27334c;
        if (iVar7 != null) {
            iVar7.f40374c.setTextInputListener(new r(transferToBankInputAmountActivity));
        }
        i iVar8 = (i) transferToBankInputAmountActivity.f27334c;
        if (iVar8 != null && (textView = (TextView) iVar8.f40374c.findViewById(f.tv_error)) != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        i iVar9 = (i) transferToBankInputAmountActivity.f27334c;
        if (iVar9 != null) {
            iVar9.f40376e.setOnClickListener(new View.OnClickListener(transferToBankInputAmountActivity) { // from class: xd.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransferToBankInputAmountActivity f43903b;

                {
                    this.f43903b = transferToBankInputAmountActivity;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EditText editText;
                    TransferToBankInputAmountActivity transferToBankInputAmountActivity2 = this.f43903b;
                    switch (i10) {
                        case 0:
                            TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
                            i iVar10 = (i) transferToBankInputAmountActivity2.f27334c;
                            if (iVar10 != null && (editText = iVar10.f40373b) != null) {
                                editText.setText("");
                                break;
                            }
                            break;
                        default:
                            TransferToBankInputAmountActivity.a aVar2 = TransferToBankInputAmountActivity.f33522C;
                            transferToBankInputAmountActivity2.getClass();
                            transferToBankInputAmountActivity2.s();
                            break;
                    }
                }
            });
        }
        i iVar10 = (i) transferToBankInputAmountActivity.f27334c;
        if (iVar10 != null) {
            iVar10.f40373b.setHint("What’s this for? (optional)");
        }
        i iVar11 = (i) transferToBankInputAmountActivity.f27334c;
        if (iVar11 != null) {
            iVar11.f40373b.setOnFocusChangeListener(new v(transferToBankInputAmountActivity, i10));
        }
        i iVar12 = (i) transferToBankInputAmountActivity.f27334c;
        if (iVar12 != null) {
            iVar12.f40373b.addTextChangedListener(new e(transferToBankInputAmountActivity, 27));
        }
        i iVar13 = (i) transferToBankInputAmountActivity.f27334c;
        if (iVar13 != null) {
            iVar13.f40373b.setOnEditorActionListener(new Oc.A(transferToBankInputAmountActivity, 8));
        }
        i iVar14 = (i) transferToBankInputAmountActivity.f27334c;
        if (iVar14 != null) {
            iVar14.f40368L.setOnClickListener(new View.OnClickListener(transferToBankInputAmountActivity) { // from class: xd.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransferToBankInputAmountActivity f43903b;

                {
                    this.f43903b = transferToBankInputAmountActivity;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EditText editText;
                    TransferToBankInputAmountActivity transferToBankInputAmountActivity2 = this.f43903b;
                    switch (i7) {
                        case 0:
                            TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
                            i iVar15 = (i) transferToBankInputAmountActivity2.f27334c;
                            if (iVar15 != null && (editText = iVar15.f40373b) != null) {
                                editText.setText("");
                                break;
                            }
                            break;
                        default:
                            TransferToBankInputAmountActivity.a aVar2 = TransferToBankInputAmountActivity.f33522C;
                            transferToBankInputAmountActivity2.getClass();
                            transferToBankInputAmountActivity2.s();
                            break;
                    }
                }
            });
        }
    }

    public static final void o(TransferToBankInputAmountActivity transferToBankInputAmountActivity) {
        i iVar;
        String strK;
        i iVar2 = (i) transferToBankInputAmountActivity.f27334c;
        if (iVar2 != null) {
            iVar2.f40367H.setText(transferToBankInputAmountActivity.f33528g);
        }
        BankInfo bankInfo = transferToBankInputAmountActivity.f33526e;
        if (bankInfo != null) {
            i iVar3 = (i) transferToBankInputAmountActivity.f27334c;
            if (iVar3 != null) {
                TextView textView = iVar3.f40384w;
                String str = bankInfo.bankName;
                if (str == null || str.length() == 0) {
                    strK = transferToBankInputAmountActivity.f33527f;
                } else {
                    String str2 = transferToBankInputAmountActivity.f33527f;
                    if (str2 == null) {
                        str2 = "";
                    }
                    strK = q0.k("(", str2, ")");
                }
                textView.setText(strK);
            }
            i iVar4 = (i) transferToBankInputAmountActivity.f27334c;
            if (iVar4 != null) {
                iVar4.f40366C.setText(bankInfo.bankName);
            }
            String str3 = bankInfo.bankUrl;
            i iVar5 = (i) transferToBankInputAmountActivity.f27334c;
            p002a.a.r(str3, iVar5 != null ? iVar5.f40377f : null);
            i iVar6 = (i) transferToBankInputAmountActivity.f27334c;
            r0.k1(iVar6 != null ? iVar6.f40378g : null, bankInfo.relationshipPic, bankInfo.relationshipDarkPic);
        }
        if (!Intrinsics.c(transferToBankInputAmountActivity.f33530j, "WITHDRAW") || (iVar = (i) transferToBankInputAmountActivity.f27334c) == null) {
            return;
        }
        iVar.f40383v.setTitle(transferToBankInputAmountActivity.getString(h.sm_withdraw_with_bank_account));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((TransferToBankViewModel) l()).f34057g;
        if (lVar != null) {
            lVar.e(this, new C2023v(new z(this, this, 0), 17));
        }
        l lVar2 = ((TransferToBankViewModel) l()).f34055e;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new z(this, this, 1), 17));
        }
        l lVar3 = ((TransferToBankViewModel) l()).f34058i;
        if (lVar3 != null) {
            lVar3.e(this, new C2023v(new z(this, this, 2), 17));
        }
        l lVar4 = ((TransferToBankViewModel) l()).f34060o;
        if (lVar4 != null) {
            lVar4.e(this, new C2023v(new y(this, 0), 17));
        }
        l lVar5 = ((TransferToBankViewModel) l()).f34059j;
        if (lVar5 != null) {
            lVar5.e(this, new C2023v(new y(this, 1), 17));
        }
        n.B(this, ((TransferToBankViewModel) l()).f34056f, this, new C1807o(this, 11), new s(this, 1), false, null, 240);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(0, !isDarkMode());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(p159kd.f.sm_activity_transfer_to_bank_input_amount, (ViewGroup) null, false);
        int i7 = p159kd.e.cl_amount_input;
        if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = p159kd.e.clNote;
            if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = p159kd.e.cl_transfer_info;
                if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = p159kd.e.et_note;
                    EditText editText = (EditText) p059e1.a.m(i7, viewInflate);
                    if (editText != null) {
                        i7 = p159kd.e.et_transfer_money;
                        PpAmountEditText ppAmountEditText = (PpAmountEditText) p059e1.a.m(i7, viewInflate);
                        if (ppAmountEditText != null && (viewM = p059e1.a.m((i7 = p159kd.e.etTransferMoneyErrorSpace), viewInflate)) != null) {
                            i7 = p159kd.e.iiv_clear;
                            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                            if (iconicsImageView != null) {
                                i7 = p159kd.e.iv_avatar;
                                ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                                if (imageView != null) {
                                    i7 = p159kd.e.iv_relationship;
                                    ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                                    if (imageView2 != null) {
                                        i7 = p159kd.e.iv_transfer_safe_arrow;
                                        IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                                        if (iconicsImageView2 != null) {
                                            i7 = p159kd.e.keyboardView;
                                            DigitalKeyboardView digitalKeyboardView = (DigitalKeyboardView) p059e1.a.m(i7, viewInflate);
                                            if (digitalKeyboardView != null) {
                                                i7 = p159kd.e.llEntrance;
                                                LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                if (linearLayout != null) {
                                                    i7 = p159kd.e.ll_transfer_safe;
                                                    LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                    if (linearLayout2 != null) {
                                                        i7 = p159kd.e.ryAmount;
                                                        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                                                        if (recyclerView != null) {
                                                            i7 = p159kd.e.titleBar;
                                                            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                                            if (ppTitleBar != null) {
                                                                i7 = p159kd.e.tv_account;
                                                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                                if (textView != null) {
                                                                    i7 = p159kd.e.tv_amount_title;
                                                                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                    if (textView2 != null) {
                                                                        i7 = p159kd.e.tv_balance;
                                                                        TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                        if (textView3 != null) {
                                                                            i7 = p159kd.e.tv_bank_name;
                                                                            TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                            if (textView4 != null) {
                                                                                i7 = p159kd.e.tv_name;
                                                                                TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                if (textView5 != null) {
                                                                                    i7 = p159kd.e.tv_next;
                                                                                    TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                    if (textView6 != null) {
                                                                                        i7 = p159kd.e.tvNoteTitle;
                                                                                        TextView textView7 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                        if (textView7 != null) {
                                                                                            i7 = p159kd.e.tvTips;
                                                                                            TextView textView8 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                            if (textView8 != null) {
                                                                                                i7 = p159kd.e.tv_transfer_safe_content;
                                                                                                TextView textView9 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                if (textView9 != null) {
                                                                                                    i7 = p159kd.e.viewContainer;
                                                                                                    if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                                        i iVar = new i((RelativeLayout) viewInflate, editText, ppAmountEditText, viewM, iconicsImageView, imageView, imageView2, iconicsImageView2, digitalKeyboardView, linearLayout, linearLayout2, recyclerView, ppTitleBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
                                                                                                        Intrinsics.checkNotNullExpressionValue(iVar, "inflate(...)");
                                                                                                        return iVar;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f33525d) {
            this.f33525d = false;
            return;
        }
        TransferToBankViewModel transferToBankViewModel = (TransferToBankViewModel) l();
        TransferBankChannelInfoReq req = new TransferBankChannelInfoReq();
        req.setPayeeBankCardNo(this.f33527f);
        BankInfo bankInfo = this.f33526e;
        req.setPayeeBankCode(bankInfo != null ? bankInfo.bankCode : null);
        req.setPayeeAccountName(this.f33528g);
        transferToBankViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        p140j8.f.s(transferToBankViewModel, new C0413s1(req, null), transferToBankViewModel.f34058i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onTransactionMessage(@Nullable TransactionEvent event) {
        ConfigReq req = new ConfigReq();
        req.setPayeeAccountType(6);
        TransferToBankViewModel transferToBankViewModel = (TransferToBankViewModel) l();
        transferToBankViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        p140j8.f.s(transferToBankViewModel, new C0419u1(req, null), transferToBankViewModel.f34057g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        i iVar = (i) this.f27334c;
        if (iVar != null) {
            iVar.f40374c.setAmount("");
        }
        i iVar2 = (i) this.f27334c;
        if (iVar2 != null) {
            iVar2.f40373b.setText("");
        }
    }

    public final void p(String str) {
        TransferCreateOrderReq req = new TransferCreateOrderReq();
        i iVar = (i) this.f27334c;
        req.setAmount(Long.valueOf(r0.f(iVar != null ? iVar.f40374c.getDoubleAmount() : 0.0d)));
        req.setAccountNo(this.f33527f);
        req.setAccountName(str);
        BankInfo bankInfo = this.f33526e;
        req.setBusinessType((bankInfo == null || bankInfo.mmo != 1) ? 3 : 9);
        req.setTransType("03");
        req.setOrderSourceType(this.f33530j);
        BankInfo bankInfo2 = this.f33526e;
        if (bankInfo2 != null) {
            req.setPayeeBankCode(bankInfo2.bankCode);
        }
        i iVar2 = (i) this.f27334c;
        String strValueOf = String.valueOf(iVar2 != null ? iVar2.f40373b.getText() : null);
        if (!StringsKt.F(strValueOf)) {
            req.setTransferNotes(strValueOf);
        }
        TransferToBankViewModel transferToBankViewModel = (TransferToBankViewModel) l();
        transferToBankViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        if (r0.U0()) {
            return;
        }
        C0410r1 c0410r1 = new C0410r1(req, null);
        l lVar = transferToBankViewModel.f34056f;
        lVar.f27356m = req;
        Unit unit = Unit.f38893a;
        p140j8.f.v(transferToBankViewModel, c0410r1, lVar, 0L);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        Handler uIHandler = getUIHandler();
        Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
        getWindow().getDecorView().post(new p7.h(uIHandler, 21, this, false));
    }

    public final void q(CreateTransferOrderBeforeResp createTransferOrderBeforeResp, String str) {
        Object obj;
        if (createTransferOrderBeforeResp != null) {
            Integer feeType = createTransferOrderBeforeResp.getFeeType();
            if ((feeType != null && feeType.intValue() == 2) || (feeType != null && feeType.intValue() == 3)) {
                if (this.f33534w == null) {
                    this.f33534w = new CyberSecurityLevyDialog(this);
                }
                CyberSecurityLevyDialog cyberSecurityLevyDialog = this.f33534w;
                if (cyberSecurityLevyDialog != null) {
                    if (!cyberSecurityLevyDialog.isShowing()) {
                        cyberSecurityLevyDialog.show();
                        cyberSecurityLevyDialog.setData(createTransferOrderBeforeResp.getBankAccountMemberInfo());
                        cyberSecurityLevyDialog.setOnDismissListener(new K(this, 1));
                        cyberSecurityLevyDialog.setOnButtonClickListener(new x(createTransferOrderBeforeResp, this, str));
                    }
                    obj = cyberSecurityLevyDialog;
                } else {
                    obj = null;
                }
            } else {
                p(str);
                obj = Unit.f38893a;
            }
            if (obj != null) {
                return;
            }
        }
        p(str);
        Unit unit = Unit.f38893a;
    }

    public final long r() {
        PpAmountEditText ppAmountEditText;
        i iVar = (i) this.f27334c;
        return r0.f((iVar == null || (ppAmountEditText = iVar.f40374c) == null) ? 0.0d : ppAmountEditText.getDoubleAmount());
    }

    public final void s() {
        n0.g().l("SendMoney_Bank_click_Next");
        VerifyPaymentInfoReq verifyPaymentInfoReq = new VerifyPaymentInfoReq();
        i iVar = (i) this.f27334c;
        verifyPaymentInfoReq.amount = r0.f(iVar != null ? iVar.f40374c.getDoubleAmount() : 0.0d);
        verifyPaymentInfoReq.accountNo = this.f33527f;
        BankInfo bankInfo = this.f33526e;
        if (bankInfo != null) {
            verifyPaymentInfoReq.payeeBankCode = bankInfo.bankCode;
            verifyPaymentInfoReq.businessType = bankInfo.mmo == 1 ? 9 : 3;
        }
        verifyPaymentInfoReq.accountName = this.f33528g;
        verifyPaymentInfoReq.receiveAccountNameFlag = Boolean.valueOf(this.f33529i);
        verifyPaymentInfoReq.createOrderPreCheck = true;
        verifyPaymentInfoReq.financialGuide = H.f164i.canShowFinanceGuidance();
        TransferToBankViewModel transferToBankViewModel = (TransferToBankViewModel) l();
        transferToBankViewModel.getClass();
        p140j8.f.s(transferToBankViewModel, new C0428x1(verifyPaymentInfoReq, null), transferToBankViewModel.f34055e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        c.b().j(this);
        n0.g().l("Transfer_ToBank_Amount_View");
    }

    public final void t(VerifyPaymentInfoRsp.DataBean dataBean) {
        String str;
        Integer recipientTradeStatus;
        Long l5;
        TransferToBankInputAmountActivity transferToBankInputAmountActivity;
        FinanceGuidanceBean financeGuidanceBean;
        boolean z3 = false;
        if (!((dataBean == null || (financeGuidanceBean = dataBean.financialGuidePopUp) == null) ? false : Intrinsics.c(financeGuidanceBean.getPopUp(), Boolean.TRUE)) || !H.f164i.canShowFinanceGuidance()) {
            if (dataBean != null ? Intrinsics.c(dataBean.repeatedTransfer, Boolean.TRUE) : false) {
                if (this.t == null) {
                    transferToBankInputAmountActivity = this;
                    transferToBankInputAmountActivity.t = new ConfirmDuplicateTransferDialog(this, "Transfer_ToBankAmount_DuplicatedTransfers", null, 4, null);
                } else {
                    transferToBankInputAmountActivity = this;
                }
                ConfirmDuplicateTransferDialog confirmDuplicateTransferDialog = transferToBankInputAmountActivity.t;
                if (confirmDuplicateTransferDialog == null || confirmDuplicateTransferDialog.isShowing()) {
                    return;
                }
                confirmDuplicateTransferDialog.show();
                confirmDuplicateTransferDialog.setOnContinueClickListener(new t(this, dataBean, 0));
                return;
            }
            BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = this.f33532p;
            if ((balanceAndLimitData != null ? balanceAndLimitData.reminderAmount : null) != null) {
                long jR = r();
                BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData2 = this.f33532p;
                if (jR >= ((balanceAndLimitData2 == null || (l5 = balanceAndLimitData2.reminderAmount) == null) ? 0L : l5.longValue())) {
                    ConfirmLargeAndRecipientInfoDialog confirmLargeAndRecipientInfoDialog = new ConfirmLargeAndRecipientInfoDialog(this);
                    confirmLargeAndRecipientInfoDialog.show();
                    BankInfo bankInfo = this.f33526e;
                    confirmLargeAndRecipientInfoDialog.updateUi(1, bankInfo != null ? bankInfo.bankName : null, this.f33527f, this.f33528g, r(), false);
                    confirmLargeAndRecipientInfoDialog.setResultCallback(new t(this, dataBean, 1));
                    confirmLargeAndRecipientInfoDialog.setRecheckCallback(new C1969l(confirmLargeAndRecipientInfoDialog, 2));
                    return;
                }
            }
            TransferToBankAccountInfoResp transferToBankAccountInfoResp = ((TransferToBankViewModel) l()).f34061p;
            if (transferToBankAccountInfoResp != null && (recipientTradeStatus = transferToBankAccountInfoResp.getRecipientTradeStatus()) != null && recipientTradeStatus.intValue() == 1) {
                z3 = true;
            }
            if (z3) {
                ConfirmLargeAndRecipientInfoDialog confirmLargeAndRecipientInfoDialog2 = new ConfirmLargeAndRecipientInfoDialog(this);
                confirmLargeAndRecipientInfoDialog2.show();
                BankInfo bankInfo2 = this.f33526e;
                confirmLargeAndRecipientInfoDialog2.updateUi(2, bankInfo2 != null ? bankInfo2.bankName : null, this.f33527f, this.f33528g, r(), false);
                confirmLargeAndRecipientInfoDialog2.setResultCallback(new t(this, dataBean, 2));
                confirmLargeAndRecipientInfoDialog2.setRecheckCallback(new C1969l(confirmLargeAndRecipientInfoDialog2, 3));
                return;
            }
            TransferBankChannelInfoResp transferBankChannelInfoResp = this.f33531o;
            CreateTransferOrderBeforeResp csLevyFeeGuide = transferBankChannelInfoResp != null ? transferBankChannelInfoResp.getCsLevyFeeGuide() : null;
            if (dataBean == null || (str = dataBean.accountName) == null) {
                str = "";
            }
            q(csLevyFeeGuide, str);
            return;
        }
        if (this.f33523A == null) {
            Intrinsics.checkNotNullParameter(this, "context");
            Intrinsics.checkNotNullParameter(this, "context");
            final H h7 = new H(this);
            h7.setContentView(p159kd.f.sm_dialog_finance_guidance);
            TextView textView = (TextView) h7.findViewById(p159kd.e.tv_confirm);
            h7.f169f = textView;
            h7.f166c = (TextView) h7.findViewById(p159kd.e.tv_content);
            TextView textView2 = (TextView) h7.findViewById(p159kd.e.tv_cancel);
            h7.f168e = textView2;
            h7.f165b = (TextView) h7.findViewById(p159kd.e.tv_title);
            h7.f167d = (ImageView) h7.findViewById(p159kd.e.ivFinanceGuidance);
            IconicsImageView iconicsImageView = (IconicsImageView) h7.findViewById(p159kd.e.iv_close);
            if (iconicsImageView != null) {
                final int i7 = 0;
                iconicsImageView.setOnClickListener(new View.OnClickListener() { // from class: Ad.F
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i7) {
                            case 0:
                                H h10 = h7;
                                h10.getClass();
                                H.b("TransferSavingPopup_closeclick");
                                h10.dismiss();
                                break;
                            case 1:
                                H h11 = h7;
                                h11.getClass();
                                H.b("TransferSavingPopup_transferclick");
                                p353xd.C c6 = h11.f170g;
                                if (c6 != null) {
                                    c6.onTransfer();
                                }
                                h11.dismiss();
                                break;
                            default:
                                H h12 = h7;
                                h12.getClass();
                                H.b("TransferSavingPopup_saveclick");
                                p353xd.C c10 = h12.f170g;
                                if (c10 != null) {
                                    c10.onSaveToCashBox();
                                }
                                h12.dismiss();
                                break;
                        }
                    }
                });
            }
            if (textView2 != null) {
                final int i10 = 1;
                textView2.setOnClickListener(new View.OnClickListener() { // from class: Ad.F
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                H h10 = h7;
                                h10.getClass();
                                H.b("TransferSavingPopup_closeclick");
                                h10.dismiss();
                                break;
                            case 1:
                                H h11 = h7;
                                h11.getClass();
                                H.b("TransferSavingPopup_transferclick");
                                p353xd.C c6 = h11.f170g;
                                if (c6 != null) {
                                    c6.onTransfer();
                                }
                                h11.dismiss();
                                break;
                            default:
                                H h12 = h7;
                                h12.getClass();
                                H.b("TransferSavingPopup_saveclick");
                                p353xd.C c10 = h12.f170g;
                                if (c10 != null) {
                                    c10.onSaveToCashBox();
                                }
                                h12.dismiss();
                                break;
                        }
                    }
                });
            }
            if (textView != null) {
                final int i11 = 2;
                textView.setOnClickListener(new View.OnClickListener() { // from class: Ad.F
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                H h10 = h7;
                                h10.getClass();
                                H.b("TransferSavingPopup_closeclick");
                                h10.dismiss();
                                break;
                            case 1:
                                H h11 = h7;
                                h11.getClass();
                                H.b("TransferSavingPopup_transferclick");
                                p353xd.C c6 = h11.f170g;
                                if (c6 != null) {
                                    c6.onTransfer();
                                }
                                h11.dismiss();
                                break;
                            default:
                                H h12 = h7;
                                h12.getClass();
                                H.b("TransferSavingPopup_saveclick");
                                p353xd.C c10 = h12.f170g;
                                if (c10 != null) {
                                    c10.onSaveToCashBox();
                                }
                                h12.dismiss();
                                break;
                        }
                    }
                });
            }
            this.f33523A = h7;
        }
        H h10 = this.f33523A;
        if (h10 == null || h10.isShowing()) {
            return;
        }
        h10.show();
        FinanceGuidanceBean financeGuidanceBean2 = dataBean.financialGuidePopUp;
        boolean zIsDarkMode = isDarkMode();
        if (financeGuidanceBean2 != null) {
            r0.k1(h10.f167d, financeGuidanceBean2.getPic(), financeGuidanceBean2.getDarkPic());
            TextView textView3 = h10.f165b;
            if (textView3 != null) {
                textView3.setText(financeGuidanceBean2.getTitle());
            }
            String content = (!zIsDarkMode || TextUtils.isEmpty(financeGuidanceBean2.getDarkContent())) ? financeGuidanceBean2.getContent() : financeGuidanceBean2.getDarkContent();
            TextView textView4 = h10.f166c;
            if (textView4 != null) {
                textView4.setText(content != null ? CommonExtKt.formatHtmlText(content) : null);
            }
            TextView textView5 = h10.f169f;
            if (textView5 != null) {
                textView5.setText(financeGuidanceBean2.getFinancialButtonContent());
            }
            TextView textView6 = h10.f168e;
            if (textView6 != null) {
                textView6.setText(financeGuidanceBean2.getTransferButtonContent());
            }
        }
        h10.f170g = new C(dataBean, this);
    }
}
