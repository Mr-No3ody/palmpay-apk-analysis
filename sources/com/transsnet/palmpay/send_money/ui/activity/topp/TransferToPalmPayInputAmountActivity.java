package com.transsnet.palmpay.send_money.ui.activity.topp;

import B8.b;
import Ed.ViewOnTouchListenerC0223c;
import Hb.ViewOnClickListenerC0312n;
import L6.f;
import Oc.A;
import P8.a;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import R3.e;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.edit.AmountEditText;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.dialog.ConfirmLargeAndRecipientInfoDialog;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.custom_view.image.RoundImageView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.send_money.bean.ConfigReq;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoReq;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoRsp;
import com.transsnet.palmpay.send_money.bean.event.TransactionEvent;
import com.transsnet.palmpay.send_money.bean.req.TransferCreateOrderReq;
import com.transsnet.palmpay.send_money.bean.resp.MemberDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmDuplicateTransferDialog;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmPaymentInfoDialog;
import com.transsnet.palmpay.send_money.viewmodel.BaseTransferHistoryViewModel;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.SpanUtils;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.Nullable;
import p141j9.C1807o;
import p159kd.d;
import p220oa.h;
import p223od.j;
import p270rd.C1969l;
import p270rd.ViewOnTouchListenerC1971n;
import p284sb.C2023v;
import p353xd.v;
import p369yd.k;
import p369yd.o;
import p369yd.p;
import p369yd.q;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "To PP 03 金额输入页", path = "/sm/palmpay_personal_transfer")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/topp/TransferToPalmPayInputAmountActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/BaseTransferHistoryViewModel;", "Lod/j;", "<init>", "()V", "Lcom/transsnet/palmpay/send_money/bean/event/TransactionEvent;", "event", "", "onTransactionMessage", "(Lcom/transsnet/palmpay/send_money/bean/event/TransactionEvent;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToPalmPayInputAmountActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToPalmPayInputAmountActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/topp/TransferToPalmPayInputAmountActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,933:1\n562#2,10:934\n115#3,8:944\n145#3:952\n171#3,12:953\n215#3:965\n171#3,12:966\n215#3:978\n55#4,12:979\n84#4,3:991\n1#5:994\n*S KotlinDebug\n*F\n+ 1 TransferToPalmPayInputAmountActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/topp/TransferToPalmPayInputAmountActivity\n*L\n159#1:934,10\n201#1:944,8\n201#1:952\n211#1:953,12\n211#1:965\n228#1:966,12\n228#1:978\n414#1:979,12\n414#1:991,3\n*E\n"})
public final class TransferToPalmPayInputAmountActivity extends BaseMvvmVBActivity<BaseTransferHistoryViewModel, j> {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ int f33602Y = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AppCompatCheckBox f33603A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextView f33604B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f33605C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public EditText f33606H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public IconicsImageView f33607L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public RecyclerView f33608M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ConfirmDuplicateTransferDialog f33609Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public a f33610X;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33613f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f33615i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Boolean f33617o;
    public MemberDetailResp t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public BalanceAndLimitResp.BalanceAndLimitData f33619v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PpAmountEditText f33620w;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33614g = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f33616j = "COMMON";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f33618p = true;

    public static final void n(final TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity) {
        AmountEditText amountEditText;
        TextView textView;
        int i7 = 13;
        final int i10 = 0;
        final int i11 = 1;
        j jVar = (j) transferToPalmPayInputAmountActivity.f27334c;
        PpAmountEditText ppAmountEditText = jVar != null ? jVar.f40397e : null;
        transferToPalmPayInputAmountActivity.f33620w = ppAmountEditText;
        if (ppAmountEditText != null && (textView = (TextView) ppAmountEditText.findViewById(f.tv_error)) != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        j jVar2 = (j) transferToPalmPayInputAmountActivity.f27334c;
        transferToPalmPayInputAmountActivity.f33603A = jVar2 != null ? jVar2.f40395c : null;
        transferToPalmPayInputAmountActivity.f33604B = jVar2 != null ? jVar2.f40386B : null;
        transferToPalmPayInputAmountActivity.f33605C = jVar2 != null ? jVar2.f40391Q : null;
        transferToPalmPayInputAmountActivity.f33606H = jVar2 != null ? jVar2.f40396d : null;
        transferToPalmPayInputAmountActivity.f33607L = jVar2 != null ? jVar2.f40399g : null;
        transferToPalmPayInputAmountActivity.f33608M = jVar2 != null ? jVar2.f40404v : null;
        PpAmountEditText ppAmountEditText2 = transferToPalmPayInputAmountActivity.f33620w;
        AmountEditText amountEditText2 = ppAmountEditText2 != null ? (AmountEditText) ppAmountEditText2.findViewById(f.edit_amount) : null;
        b bVar = new b(7);
        EditText editText = transferToPalmPayInputAmountActivity.f33606H;
        if (editText != null) {
            editText.setFilters(new InputFilter[]{bVar});
        }
        if (amountEditText2 != null) {
            amountEditText2.setShowSoftInputOnFocus(false);
        }
        j jVar3 = (j) transferToPalmPayInputAmountActivity.f27334c;
        if (jVar3 != null) {
            jVar3.f40403p.setActionButtonEnable(false);
        }
        j jVar4 = (j) transferToPalmPayInputAmountActivity.f27334c;
        if (jVar4 != null) {
            jVar4.f40403p.setDigitalKeyboardClickListener(new o(amountEditText2, transferToPalmPayInputAmountActivity));
        }
        if (amountEditText2 != null) {
            amountEditText2.setOnTouchListener(new ViewOnTouchListenerC1971n(transferToPalmPayInputAmountActivity, amountEditText2, 3));
        }
        EditText editText2 = transferToPalmPayInputAmountActivity.f33606H;
        if (editText2 != null) {
            editText2.setOnTouchListener(new ViewOnTouchListenerC0223c(transferToPalmPayInputAmountActivity, i7));
        }
        PpAmountEditText ppAmountEditText3 = transferToPalmPayInputAmountActivity.f33620w;
        if (ppAmountEditText3 != null && (amountEditText = (AmountEditText) ppAmountEditText3.findViewById(f.edit_amount)) != null) {
            amountEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(13)});
        }
        PpAmountEditText ppAmountEditText4 = transferToPalmPayInputAmountActivity.f33620w;
        if (ppAmountEditText4 != null) {
            ppAmountEditText4.setOnErrorVisibilityChangeListener(new k(transferToPalmPayInputAmountActivity));
        }
        PpAmountEditText ppAmountEditText5 = transferToPalmPayInputAmountActivity.f33620w;
        if (ppAmountEditText5 != null) {
            ppAmountEditText5.setTextInputListener(new k(transferToPalmPayInputAmountActivity));
        }
        IconicsImageView iconicsImageView = transferToPalmPayInputAmountActivity.f33607L;
        if (iconicsImageView != null) {
            iconicsImageView.setOnClickListener(new View.OnClickListener(transferToPalmPayInputAmountActivity) { // from class: yd.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransferToPalmPayInputAmountActivity f44303b;

                {
                    this.f44303b = transferToPalmPayInputAmountActivity;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MemberDetailResp memberDetailResp;
                    TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity2 = this.f44303b;
                    switch (i10) {
                        case 0:
                            EditText editText3 = transferToPalmPayInputAmountActivity2.f33606H;
                            if (editText3 != null) {
                                editText3.setText("");
                            }
                            break;
                        case 1:
                            int i12 = transferToPalmPayInputAmountActivity2.f33614g;
                            if ((i12 == 2 || i12 == 4) && (memberDetailResp = transferToPalmPayInputAmountActivity2.t) != null) {
                                String memberId = memberDetailResp.getMemberId();
                                Postcard postcardWithInt = ARouter.getInstance().build("/send/personnal_home_page").withBoolean("isHideInfo", transferToPalmPayInputAmountActivity2.f33615i).withBoolean("is_send", true).withInt("extra_type", transferToPalmPayInputAmountActivity2.f33614g);
                                if (!TextUtils.isEmpty(memberId)) {
                                    postcardWithInt.withString("MEMBER_ID", memberId);
                                }
                                if (!TextUtils.isEmpty(transferToPalmPayInputAmountActivity2.f33612e)) {
                                    postcardWithInt.withString("phone_number", transferToPalmPayInputAmountActivity2.f33612e);
                                }
                                MemberDetailResp memberDetailResp2 = transferToPalmPayInputAmountActivity2.t;
                                if (!TextUtils.isEmpty(memberDetailResp2 != null ? memberDetailResp2.getAccountNo() : null)) {
                                    MemberDetailResp memberDetailResp3 = transferToPalmPayInputAmountActivity2.t;
                                    postcardWithInt.withString("extra_data", memberDetailResp3 != null ? memberDetailResp3.getAccountNo() : null);
                                }
                                postcardWithInt.navigation();
                            }
                            break;
                        default:
                            int i13 = TransferToPalmPayInputAmountActivity.f33602Y;
                            if (transferToPalmPayInputAmountActivity2.f33619v != null) {
                                transferToPalmPayInputAmountActivity2.s();
                                break;
                            }
                            break;
                    }
                }
            });
        }
        EditText editText3 = transferToPalmPayInputAmountActivity.f33606H;
        if (editText3 != null) {
            editText3.setOnFocusChangeListener(new v(transferToPalmPayInputAmountActivity, i11));
        }
        EditText editText4 = transferToPalmPayInputAmountActivity.f33606H;
        if (editText4 != null) {
            editText4.addTextChangedListener(new e(transferToPalmPayInputAmountActivity, 28));
        }
        EditText editText5 = transferToPalmPayInputAmountActivity.f33606H;
        if (editText5 != null) {
            editText5.setOnEditorActionListener(new A(transferToPalmPayInputAmountActivity, 9));
        }
        j jVar5 = (j) transferToPalmPayInputAmountActivity.f27334c;
        if (jVar5 != null) {
            jVar5.f40400i.setOnClickListener(new View.OnClickListener(transferToPalmPayInputAmountActivity) { // from class: yd.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransferToPalmPayInputAmountActivity f44303b;

                {
                    this.f44303b = transferToPalmPayInputAmountActivity;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MemberDetailResp memberDetailResp;
                    TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity2 = this.f44303b;
                    switch (i11) {
                        case 0:
                            EditText editText6 = transferToPalmPayInputAmountActivity2.f33606H;
                            if (editText6 != null) {
                                editText6.setText("");
                            }
                            break;
                        case 1:
                            int i12 = transferToPalmPayInputAmountActivity2.f33614g;
                            if ((i12 == 2 || i12 == 4) && (memberDetailResp = transferToPalmPayInputAmountActivity2.t) != null) {
                                String memberId = memberDetailResp.getMemberId();
                                Postcard postcardWithInt = ARouter.getInstance().build("/send/personnal_home_page").withBoolean("isHideInfo", transferToPalmPayInputAmountActivity2.f33615i).withBoolean("is_send", true).withInt("extra_type", transferToPalmPayInputAmountActivity2.f33614g);
                                if (!TextUtils.isEmpty(memberId)) {
                                    postcardWithInt.withString("MEMBER_ID", memberId);
                                }
                                if (!TextUtils.isEmpty(transferToPalmPayInputAmountActivity2.f33612e)) {
                                    postcardWithInt.withString("phone_number", transferToPalmPayInputAmountActivity2.f33612e);
                                }
                                MemberDetailResp memberDetailResp2 = transferToPalmPayInputAmountActivity2.t;
                                if (!TextUtils.isEmpty(memberDetailResp2 != null ? memberDetailResp2.getAccountNo() : null)) {
                                    MemberDetailResp memberDetailResp3 = transferToPalmPayInputAmountActivity2.t;
                                    postcardWithInt.withString("extra_data", memberDetailResp3 != null ? memberDetailResp3.getAccountNo() : null);
                                }
                                postcardWithInt.navigation();
                            }
                            break;
                        default:
                            int i13 = TransferToPalmPayInputAmountActivity.f33602Y;
                            if (transferToPalmPayInputAmountActivity2.f33619v != null) {
                                transferToPalmPayInputAmountActivity2.s();
                                break;
                            }
                            break;
                    }
                }
            });
        }
        j jVar6 = (j) transferToPalmPayInputAmountActivity.f27334c;
        if (jVar6 != null) {
            final int i12 = 2;
            jVar6.f40388H.setOnClickListener(new View.OnClickListener(transferToPalmPayInputAmountActivity) { // from class: yd.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransferToPalmPayInputAmountActivity f44303b;

                {
                    this.f44303b = transferToPalmPayInputAmountActivity;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MemberDetailResp memberDetailResp;
                    TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity2 = this.f44303b;
                    switch (i12) {
                        case 0:
                            EditText editText6 = transferToPalmPayInputAmountActivity2.f33606H;
                            if (editText6 != null) {
                                editText6.setText("");
                            }
                            break;
                        case 1:
                            int i13 = transferToPalmPayInputAmountActivity2.f33614g;
                            if ((i13 == 2 || i13 == 4) && (memberDetailResp = transferToPalmPayInputAmountActivity2.t) != null) {
                                String memberId = memberDetailResp.getMemberId();
                                Postcard postcardWithInt = ARouter.getInstance().build("/send/personnal_home_page").withBoolean("isHideInfo", transferToPalmPayInputAmountActivity2.f33615i).withBoolean("is_send", true).withInt("extra_type", transferToPalmPayInputAmountActivity2.f33614g);
                                if (!TextUtils.isEmpty(memberId)) {
                                    postcardWithInt.withString("MEMBER_ID", memberId);
                                }
                                if (!TextUtils.isEmpty(transferToPalmPayInputAmountActivity2.f33612e)) {
                                    postcardWithInt.withString("phone_number", transferToPalmPayInputAmountActivity2.f33612e);
                                }
                                MemberDetailResp memberDetailResp2 = transferToPalmPayInputAmountActivity2.t;
                                if (!TextUtils.isEmpty(memberDetailResp2 != null ? memberDetailResp2.getAccountNo() : null)) {
                                    MemberDetailResp memberDetailResp3 = transferToPalmPayInputAmountActivity2.t;
                                    postcardWithInt.withString("extra_data", memberDetailResp3 != null ? memberDetailResp3.getAccountNo() : null);
                                }
                                postcardWithInt.navigation();
                            }
                            break;
                        default:
                            int i14 = TransferToPalmPayInputAmountActivity.f33602Y;
                            if (transferToPalmPayInputAmountActivity2.f33619v != null) {
                                transferToPalmPayInputAmountActivity2.s();
                                break;
                            }
                            break;
                    }
                }
            });
        }
        n0.g().v("Transfer_ToPalmPay_Amount_View_03");
    }

    public static final void o(TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity, MemberDetailResp memberDetailResp, Integer num, boolean z3, boolean z8) {
        j jVar;
        String phone;
        String strW;
        String phone2;
        String phone3;
        String strW2;
        String phone4;
        String ppAccountNo;
        if (memberDetailResp != null) {
            j jVar2 = (j) transferToPalmPayInputAmountActivity.f27334c;
            r0.h1(jVar2 != null ? jVar2.f40400i : null, memberDetailResp.getHeadPortrait(), r.cv_avatar_default);
            j jVar3 = (j) transferToPalmPayInputAmountActivity.f27334c;
            if (jVar3 != null) {
                jVar3.f40400i.setOnClickListener(new ViewOnClickListenerC0312n(num, z3, memberDetailResp, transferToPalmPayInputAmountActivity));
            }
            String str = "";
            if (z8) {
                if (!TextUtils.isEmpty(memberDetailResp.getFullName())) {
                    j jVar4 = (j) transferToPalmPayInputAmountActivity.f27334c;
                    if (jVar4 != null) {
                        jVar4.f40387C.setText(memberDetailResp.getFullName());
                    }
                    j jVar5 = (j) transferToPalmPayInputAmountActivity.f27334c;
                    if (jVar5 != null) {
                        h.C(jVar5.f40387C);
                    }
                }
                j jVar6 = (j) transferToPalmPayInputAmountActivity.f27334c;
                r0.k1(jVar6 != null ? jVar6.f40401j : null, memberDetailResp.getRelationshipPic(), memberDetailResp.getRelationshipDarkPic());
                j jVar7 = (j) transferToPalmPayInputAmountActivity.f27334c;
                if (jVar7 != null) {
                    TextView textView = jVar7.f40405w;
                    if (TextUtils.isEmpty(transferToPalmPayInputAmountActivity.f33613f) ? !(!z3 ? (phone3 = memberDetailResp.getPhone()) == null || (strW2 = r0.w(phone3)) == null : (phone4 = memberDetailResp.getPhone()) == null || (strW2 = r0.u(phone4)) == null) : !((ppAccountNo = memberDetailResp.getPpAccountNo()) == null || (strW2 = r0.w(ppAccountNo)) == null)) {
                        str = strW2;
                    }
                    textView.setText(str);
                    return;
                }
                return;
            }
            j jVar8 = (j) transferToPalmPayInputAmountActivity.f27334c;
            if (jVar8 != null) {
                h.C(jVar8.f40387C);
            }
            j jVar9 = (j) transferToPalmPayInputAmountActivity.f27334c;
            if (jVar9 != null) {
                jVar9.f40387C.setText(p159kd.h.sm_not_registered);
            }
            if (!TextUtils.isEmpty(memberDetailResp.getPhone()) && (jVar = (j) transferToPalmPayInputAmountActivity.f27334c) != null) {
                TextView textView2 = jVar.f40405w;
                if (!z3 ? !((phone = memberDetailResp.getPhone()) == null || (strW = r0.w(phone)) == null) : !((phone2 = memberDetailResp.getPhone()) == null || (strW = r0.u(phone2)) == null)) {
                    str = strW;
                }
                textView2.setText(str);
            }
            j jVar10 = (j) transferToPalmPayInputAmountActivity.f27334c;
            if (jVar10 != null) {
                h.C(jVar10.f40389L);
            }
            j jVar11 = (j) transferToPalmPayInputAmountActivity.f27334c;
            if (jVar11 != null) {
                jVar11.f40389L.setText(new SpanUtils().appendImage(d.sm_ic_none_verified).append(" ").append(transferToPalmPayInputAmountActivity.getString(p159kd.h.sm_non_palmpay_member)).create());
            }
        }
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
        View viewInflate = getLayoutInflater().inflate(p159kd.f.sm_activity_transfer_to_palmpay_input_amount, (ViewGroup) null, false);
        int i7 = p159kd.e.bottom_action;
        FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewInflate);
        if (frameLayout != null) {
            i7 = p159kd.e.cb_balance;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) p059e1.a.m(i7, viewInflate);
            if (appCompatCheckBox != null) {
                i7 = p159kd.e.cl_amount_input;
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
                                        RoundImageView roundImageView = (RoundImageView) p059e1.a.m(i7, viewInflate);
                                        if (roundImageView != null) {
                                            i7 = p159kd.e.iv_relationship;
                                            ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                                            if (imageView != null) {
                                                i7 = p159kd.e.iv_transfer_safe_arrow;
                                                IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                                                if (iconicsImageView2 != null) {
                                                    i7 = p159kd.e.keyboardView;
                                                    DigitalKeyboardView digitalKeyboardView = (DigitalKeyboardView) p059e1.a.m(i7, viewInflate);
                                                    if (digitalKeyboardView != null) {
                                                        i7 = p159kd.e.ll_transfer_safe;
                                                        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                        if (linearLayout != null) {
                                                            i7 = p159kd.e.ryAmount;
                                                            RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                                                            if (recyclerView != null) {
                                                                i7 = p159kd.e.titleBar;
                                                                if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                                                                    i7 = p159kd.e.tv_account;
                                                                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                                    if (textView != null) {
                                                                        i7 = p159kd.e.tv_amount_title;
                                                                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                        if (textView2 != null) {
                                                                            i7 = p159kd.e.tv_balance;
                                                                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                            if (textView3 != null) {
                                                                                i7 = p159kd.e.tv_name;
                                                                                TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                if (textView4 != null) {
                                                                                    i7 = p159kd.e.tv_next;
                                                                                    TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                    if (textView5 != null) {
                                                                                        i7 = p159kd.e.tv_nont_verified;
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
                                                                                                            j jVar = new j((RelativeLayout) viewInflate, frameLayout, appCompatCheckBox, editText, ppAmountEditText, viewM, iconicsImageView, roundImageView, imageView, iconicsImageView2, digitalKeyboardView, linearLayout, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
                                                                                                            Intrinsics.checkNotNullExpressionValue(jVar, "inflate(...)");
                                                                                                            return jVar;
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
        if (this.f33618p) {
            this.f33618p = false;
        } else {
            r();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onTransactionMessage(@Nullable TransactionEvent event) {
        EditText editText = this.f33606H;
        if (editText != null) {
            editText.setText("");
        }
        PpAmountEditText ppAmountEditText = this.f33620w;
        if (ppAmountEditText != null) {
            ppAmountEditText.setAmount("");
        }
    }

    public final void p() {
        Editable text;
        BaseTransferHistoryViewModel baseTransferHistoryViewModel = (BaseTransferHistoryViewModel) l();
        TransferCreateOrderReq transferCreateOrderReq = new TransferCreateOrderReq();
        transferCreateOrderReq.setTransType("03");
        transferCreateOrderReq.setBusinessType(Integer.valueOf(this.f33614g));
        transferCreateOrderReq.setAccountNo(q());
        transferCreateOrderReq.setPayeeMemberId(this.f33611d);
        transferCreateOrderReq.setOrderSourceType(this.f33616j);
        PpAmountEditText ppAmountEditText = this.f33620w;
        transferCreateOrderReq.setAmount(ppAmountEditText != null ? Long.valueOf(ppAmountEditText.getLongAmount()) : null);
        EditText editText = this.f33606H;
        if (editText != null && (text = editText.getText()) != null) {
            Editable editable = TextUtils.isEmpty(text) ? null : text;
            if (editable != null) {
                transferCreateOrderReq.setTransferNotes(editable.toString());
            }
        }
        baseTransferHistoryViewModel.d(transferCreateOrderReq);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((BaseTransferHistoryViewModel) l()).f34062e;
        if (lVar != null) {
            lVar.e(this, new C2023v(new p(this, 0), 18));
        }
        l lVar2 = ((BaseTransferHistoryViewModel) l()).f34065i;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new q(this, this, 0), 18));
        }
        l lVar3 = ((BaseTransferHistoryViewModel) l()).f34063f;
        if (lVar3 != null) {
            lVar3.e(this, new C2023v(new q(this, this, 1), 18));
        }
        n.B(this, ((BaseTransferHistoryViewModel) l()).f34064g, this, new C1807o(this, 12), new p323v9.d(4), false, null, 240);
    }

    public final String q() {
        if (TextUtils.isEmpty(this.f33613f)) {
            MemberDetailResp memberDetailResp = this.t;
            if (memberDetailResp != null) {
                return memberDetailResp.getPhone();
            }
            return null;
        }
        MemberDetailResp memberDetailResp2 = this.t;
        if (memberDetailResp2 != null) {
            return memberDetailResp2.getPpAccountNo();
        }
        return null;
    }

    public final void r() {
        if (this.t != null) {
            ConfigReq configReq = new ConfigReq();
            configReq.setPayeeAccountType(1);
            if (TextUtils.isEmpty(this.f33611d)) {
                configReq.setPhone(this.f33612e);
            } else {
                configReq.setRecipientMemberId(this.f33611d);
            }
            ((BaseTransferHistoryViewModel) l()).e(configReq);
        }
    }

    public final void s() {
        KeyboardUtils.hideSoftInput(this);
        BaseTransferHistoryViewModel baseTransferHistoryViewModel = (BaseTransferHistoryViewModel) l();
        VerifyPaymentInfoReq verifyPaymentInfoReq = new VerifyPaymentInfoReq();
        verifyPaymentInfoReq.createOrderPreCheck = true;
        PpAmountEditText ppAmountEditText = this.f33620w;
        verifyPaymentInfoReq.amount = ppAmountEditText != null ? ppAmountEditText.getLongAmount() : 0L;
        MemberDetailResp memberDetailResp = this.t;
        verifyPaymentInfoReq.accountName = memberDetailResp != null ? memberDetailResp.getFullName() : null;
        verifyPaymentInfoReq.accountNo = q();
        verifyPaymentInfoReq.payeeMemberId = this.f33611d;
        verifyPaymentInfoReq.businessType = this.f33614g;
        baseTransferHistoryViewModel.g(verifyPaymentInfoReq);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        c.b().j(this);
        this.f33617o = getIntent().hasExtra("existRecipient") ? Boolean.valueOf(getIntent().getBooleanExtra("existRecipient", false)) : null;
        Handler uIHandler = getUIHandler();
        Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
        getWindow().getDecorView().post(new p7.h(uIHandler, 25, this, false));
    }

    public final void t(int i7, boolean z3, VerifyPaymentInfoRsp.DataBean dataBean) {
        String strW;
        ConfirmLargeAndRecipientInfoDialog confirmLargeAndRecipientInfoDialog = new ConfirmLargeAndRecipientInfoDialog(this);
        confirmLargeAndRecipientInfoDialog.show();
        String strQ = q();
        String str = (strQ == null || (strW = r0.w(strQ)) == null) ? "" : strW;
        MemberDetailResp memberDetailResp = this.t;
        Intrinsics.e(memberDetailResp);
        String fullName = memberDetailResp.getFullName();
        String str2 = fullName == null ? "" : fullName;
        PpAmountEditText ppAmountEditText = this.f33620w;
        confirmLargeAndRecipientInfoDialog.updateUi(i7, "Palmpay", str, str2, ppAmountEditText != null ? ppAmountEditText.getLongAmount() : 0.0d, z3);
        confirmLargeAndRecipientInfoDialog.setResultCallback(new p369yd.l(this, dataBean));
        confirmLargeAndRecipientInfoDialog.setRecheckCallback(new C1969l(confirmLargeAndRecipientInfoDialog, 4));
    }

    public final void u(VerifyPaymentInfoRsp.DataBean dataBean) {
        if (dataBean.status <= 0 || TextUtils.isEmpty(dataBean.statusDesc)) {
            p();
            return;
        }
        ConfirmPaymentInfoDialog confirmPaymentInfoDialog = new ConfirmPaymentInfoDialog(this);
        confirmPaymentInfoDialog.setResultCallback(new k(this));
        confirmPaymentInfoDialog.show();
        String str = dataBean.accountName;
        String strW = null;
        if (this.f33614g == 10) {
            MemberDetailResp memberDetailResp = this.t;
            strW = i0.E(memberDetailResp != null ? memberDetailResp.getAccountNo() : null);
        } else {
            String strQ = q();
            if (strQ != null) {
                strW = r0.w(strQ);
            }
        }
        String str2 = strW;
        PpAmountEditText ppAmountEditText = this.f33620w;
        confirmPaymentInfoDialog.updateUi(str, str2, ppAmountEditText != null ? ppAmountEditText.getLongAmount() : 0L, dataBean.statusDesc);
    }
}
