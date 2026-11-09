package com.transsnet.palmpay.send_money.ui.fragment;

import Ab.B;
import Ab.i;
import C9.C0144k;
import Kd.C0358a;
import Kd.C0364c;
import L6.b;
import O6.c;
import O6.d;
import Pa.r0;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.req.CheckBankCardInfoReq;
import com.transsnet.palmpay.custom_view.MobileNumberEditText;
import com.transsnet.palmpay.send_money.bean.EditRecipientReq;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.ui.activity.SelectBankActivity;
import com.transsnet.palmpay.send_money.ui.fragment.AddBankAccountFragment;
import com.transsnet.palmpay.send_money.viewmodel.AddBankAccountViewModel;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p159kd.e;
import p159kd.f;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/AddBankAccountFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/send_money/viewmodel/AddBankAccountViewModel;", "Landroid/text/TextWatcher;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddBankAccountFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddBankAccountFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/AddBankAccountFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,380:1\n171#2,12:381\n215#2:393\n171#2,12:394\n215#2:406\n171#2,12:407\n215#2:419\n*S KotlinDebug\n*F\n+ 1 AddBankAccountFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/AddBankAccountFragment\n*L\n180#1:381,12\n180#1:393\n196#1:394,12\n196#1:406\n213#1:407,12\n213#1:419\n*E\n"})
public final class AddBankAccountFragment extends BaseMvvmFragment<AddBankAccountViewModel> implements TextWatcher, View.OnClickListener {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f33648M = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f33649A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f33650B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public BankInfo f33651C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public RecipientListResp.RecipientBean f33652H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f33653L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33654j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33655o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33656p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f33657v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f33658w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AddBankAccountFragment newInstance(@Nullable RecipientListResp.RecipientBean recipientBean) {
            AddBankAccountFragment addBankAccountFragment = new AddBankAccountFragment();
            if (recipientBean != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("beneficiary_bean", recipientBean);
                addBankAccountFragment.setArguments(bundle);
            }
            return addBankAccountFragment;
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public AddBankAccountFragment() {
        final int i7 = 0;
        this.f33654j = C2131j.b(new Function0(this) { // from class: Cd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankAccountFragment f1355b;

            {
                this.f1355b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankAccountFragment addBankAccountFragment = this.f1355b;
                switch (i7) {
                    case 0:
                        int i10 = AddBankAccountFragment.f33648M;
                        View view = addBankAccountFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p159kd.e.save);
                        }
                        return null;
                    case 1:
                        int i11 = AddBankAccountFragment.f33648M;
                        View view2 = addBankAccountFragment.f27318b;
                        if (view2 != null) {
                            return (MobileNumberEditText) view2.findViewById(p159kd.e.mobile_number);
                        }
                        return null;
                    case 2:
                        int i12 = AddBankAccountFragment.f33648M;
                        View view3 = addBankAccountFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p159kd.e.iv_arrow_right);
                        }
                        return null;
                    case 3:
                        int i13 = AddBankAccountFragment.f33648M;
                        View view4 = addBankAccountFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p159kd.e.tv_bank_name);
                        }
                        return null;
                    case 4:
                        int i14 = AddBankAccountFragment.f33648M;
                        View view5 = addBankAccountFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p159kd.e.iv_bank);
                        }
                        return null;
                    case 5:
                        int i15 = AddBankAccountFragment.f33648M;
                        View view6 = addBankAccountFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p159kd.e.tv_select_bank);
                        }
                        return null;
                    case 6:
                        int i16 = AddBankAccountFragment.f33648M;
                        View view7 = addBankAccountFragment.f27318b;
                        if (view7 != null) {
                            return (RelativeLayout) view7.findViewById(p159kd.e.rl_select_bank);
                        }
                        return null;
                    default:
                        int i17 = AddBankAccountFragment.f33648M;
                        View view8 = addBankAccountFragment.f27318b;
                        if (view8 != null) {
                            return (EditText) view8.findViewById(p159kd.e.et_bank_account);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f33655o = C2131j.b(new Function0(this) { // from class: Cd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankAccountFragment f1355b;

            {
                this.f1355b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankAccountFragment addBankAccountFragment = this.f1355b;
                switch (i10) {
                    case 0:
                        int i11 = AddBankAccountFragment.f33648M;
                        View view = addBankAccountFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p159kd.e.save);
                        }
                        return null;
                    case 1:
                        int i12 = AddBankAccountFragment.f33648M;
                        View view2 = addBankAccountFragment.f27318b;
                        if (view2 != null) {
                            return (MobileNumberEditText) view2.findViewById(p159kd.e.mobile_number);
                        }
                        return null;
                    case 2:
                        int i13 = AddBankAccountFragment.f33648M;
                        View view3 = addBankAccountFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p159kd.e.iv_arrow_right);
                        }
                        return null;
                    case 3:
                        int i14 = AddBankAccountFragment.f33648M;
                        View view4 = addBankAccountFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p159kd.e.tv_bank_name);
                        }
                        return null;
                    case 4:
                        int i15 = AddBankAccountFragment.f33648M;
                        View view5 = addBankAccountFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p159kd.e.iv_bank);
                        }
                        return null;
                    case 5:
                        int i16 = AddBankAccountFragment.f33648M;
                        View view6 = addBankAccountFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p159kd.e.tv_select_bank);
                        }
                        return null;
                    case 6:
                        int i17 = AddBankAccountFragment.f33648M;
                        View view7 = addBankAccountFragment.f27318b;
                        if (view7 != null) {
                            return (RelativeLayout) view7.findViewById(p159kd.e.rl_select_bank);
                        }
                        return null;
                    default:
                        int i18 = AddBankAccountFragment.f33648M;
                        View view8 = addBankAccountFragment.f27318b;
                        if (view8 != null) {
                            return (EditText) view8.findViewById(p159kd.e.et_bank_account);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f33656p = C2131j.b(new Function0(this) { // from class: Cd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankAccountFragment f1355b;

            {
                this.f1355b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankAccountFragment addBankAccountFragment = this.f1355b;
                switch (i11) {
                    case 0:
                        int i12 = AddBankAccountFragment.f33648M;
                        View view = addBankAccountFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p159kd.e.save);
                        }
                        return null;
                    case 1:
                        int i13 = AddBankAccountFragment.f33648M;
                        View view2 = addBankAccountFragment.f27318b;
                        if (view2 != null) {
                            return (MobileNumberEditText) view2.findViewById(p159kd.e.mobile_number);
                        }
                        return null;
                    case 2:
                        int i14 = AddBankAccountFragment.f33648M;
                        View view3 = addBankAccountFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p159kd.e.iv_arrow_right);
                        }
                        return null;
                    case 3:
                        int i15 = AddBankAccountFragment.f33648M;
                        View view4 = addBankAccountFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p159kd.e.tv_bank_name);
                        }
                        return null;
                    case 4:
                        int i16 = AddBankAccountFragment.f33648M;
                        View view5 = addBankAccountFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p159kd.e.iv_bank);
                        }
                        return null;
                    case 5:
                        int i17 = AddBankAccountFragment.f33648M;
                        View view6 = addBankAccountFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p159kd.e.tv_select_bank);
                        }
                        return null;
                    case 6:
                        int i18 = AddBankAccountFragment.f33648M;
                        View view7 = addBankAccountFragment.f27318b;
                        if (view7 != null) {
                            return (RelativeLayout) view7.findViewById(p159kd.e.rl_select_bank);
                        }
                        return null;
                    default:
                        int i19 = AddBankAccountFragment.f33648M;
                        View view8 = addBankAccountFragment.f27318b;
                        if (view8 != null) {
                            return (EditText) view8.findViewById(p159kd.e.et_bank_account);
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.t = C2131j.b(new Function0(this) { // from class: Cd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankAccountFragment f1355b;

            {
                this.f1355b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankAccountFragment addBankAccountFragment = this.f1355b;
                switch (i12) {
                    case 0:
                        int i13 = AddBankAccountFragment.f33648M;
                        View view = addBankAccountFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p159kd.e.save);
                        }
                        return null;
                    case 1:
                        int i14 = AddBankAccountFragment.f33648M;
                        View view2 = addBankAccountFragment.f27318b;
                        if (view2 != null) {
                            return (MobileNumberEditText) view2.findViewById(p159kd.e.mobile_number);
                        }
                        return null;
                    case 2:
                        int i15 = AddBankAccountFragment.f33648M;
                        View view3 = addBankAccountFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p159kd.e.iv_arrow_right);
                        }
                        return null;
                    case 3:
                        int i16 = AddBankAccountFragment.f33648M;
                        View view4 = addBankAccountFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p159kd.e.tv_bank_name);
                        }
                        return null;
                    case 4:
                        int i17 = AddBankAccountFragment.f33648M;
                        View view5 = addBankAccountFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p159kd.e.iv_bank);
                        }
                        return null;
                    case 5:
                        int i18 = AddBankAccountFragment.f33648M;
                        View view6 = addBankAccountFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p159kd.e.tv_select_bank);
                        }
                        return null;
                    case 6:
                        int i19 = AddBankAccountFragment.f33648M;
                        View view7 = addBankAccountFragment.f27318b;
                        if (view7 != null) {
                            return (RelativeLayout) view7.findViewById(p159kd.e.rl_select_bank);
                        }
                        return null;
                    default:
                        int i110 = AddBankAccountFragment.f33648M;
                        View view8 = addBankAccountFragment.f27318b;
                        if (view8 != null) {
                            return (EditText) view8.findViewById(p159kd.e.et_bank_account);
                        }
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f33657v = C2131j.b(new Function0(this) { // from class: Cd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankAccountFragment f1355b;

            {
                this.f1355b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankAccountFragment addBankAccountFragment = this.f1355b;
                switch (i13) {
                    case 0:
                        int i14 = AddBankAccountFragment.f33648M;
                        View view = addBankAccountFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p159kd.e.save);
                        }
                        return null;
                    case 1:
                        int i15 = AddBankAccountFragment.f33648M;
                        View view2 = addBankAccountFragment.f27318b;
                        if (view2 != null) {
                            return (MobileNumberEditText) view2.findViewById(p159kd.e.mobile_number);
                        }
                        return null;
                    case 2:
                        int i16 = AddBankAccountFragment.f33648M;
                        View view3 = addBankAccountFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p159kd.e.iv_arrow_right);
                        }
                        return null;
                    case 3:
                        int i17 = AddBankAccountFragment.f33648M;
                        View view4 = addBankAccountFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p159kd.e.tv_bank_name);
                        }
                        return null;
                    case 4:
                        int i18 = AddBankAccountFragment.f33648M;
                        View view5 = addBankAccountFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p159kd.e.iv_bank);
                        }
                        return null;
                    case 5:
                        int i19 = AddBankAccountFragment.f33648M;
                        View view6 = addBankAccountFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p159kd.e.tv_select_bank);
                        }
                        return null;
                    case 6:
                        int i110 = AddBankAccountFragment.f33648M;
                        View view7 = addBankAccountFragment.f27318b;
                        if (view7 != null) {
                            return (RelativeLayout) view7.findViewById(p159kd.e.rl_select_bank);
                        }
                        return null;
                    default:
                        int i111 = AddBankAccountFragment.f33648M;
                        View view8 = addBankAccountFragment.f27318b;
                        if (view8 != null) {
                            return (EditText) view8.findViewById(p159kd.e.et_bank_account);
                        }
                        return null;
                }
            }
        });
        final int i14 = 5;
        this.f33658w = C2131j.b(new Function0(this) { // from class: Cd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankAccountFragment f1355b;

            {
                this.f1355b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankAccountFragment addBankAccountFragment = this.f1355b;
                switch (i14) {
                    case 0:
                        int i15 = AddBankAccountFragment.f33648M;
                        View view = addBankAccountFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p159kd.e.save);
                        }
                        return null;
                    case 1:
                        int i16 = AddBankAccountFragment.f33648M;
                        View view2 = addBankAccountFragment.f27318b;
                        if (view2 != null) {
                            return (MobileNumberEditText) view2.findViewById(p159kd.e.mobile_number);
                        }
                        return null;
                    case 2:
                        int i17 = AddBankAccountFragment.f33648M;
                        View view3 = addBankAccountFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p159kd.e.iv_arrow_right);
                        }
                        return null;
                    case 3:
                        int i18 = AddBankAccountFragment.f33648M;
                        View view4 = addBankAccountFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p159kd.e.tv_bank_name);
                        }
                        return null;
                    case 4:
                        int i19 = AddBankAccountFragment.f33648M;
                        View view5 = addBankAccountFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p159kd.e.iv_bank);
                        }
                        return null;
                    case 5:
                        int i110 = AddBankAccountFragment.f33648M;
                        View view6 = addBankAccountFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p159kd.e.tv_select_bank);
                        }
                        return null;
                    case 6:
                        int i111 = AddBankAccountFragment.f33648M;
                        View view7 = addBankAccountFragment.f27318b;
                        if (view7 != null) {
                            return (RelativeLayout) view7.findViewById(p159kd.e.rl_select_bank);
                        }
                        return null;
                    default:
                        int i112 = AddBankAccountFragment.f33648M;
                        View view8 = addBankAccountFragment.f27318b;
                        if (view8 != null) {
                            return (EditText) view8.findViewById(p159kd.e.et_bank_account);
                        }
                        return null;
                }
            }
        });
        final int i15 = 6;
        this.f33649A = C2131j.b(new Function0(this) { // from class: Cd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankAccountFragment f1355b;

            {
                this.f1355b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankAccountFragment addBankAccountFragment = this.f1355b;
                switch (i15) {
                    case 0:
                        int i16 = AddBankAccountFragment.f33648M;
                        View view = addBankAccountFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p159kd.e.save);
                        }
                        return null;
                    case 1:
                        int i17 = AddBankAccountFragment.f33648M;
                        View view2 = addBankAccountFragment.f27318b;
                        if (view2 != null) {
                            return (MobileNumberEditText) view2.findViewById(p159kd.e.mobile_number);
                        }
                        return null;
                    case 2:
                        int i18 = AddBankAccountFragment.f33648M;
                        View view3 = addBankAccountFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p159kd.e.iv_arrow_right);
                        }
                        return null;
                    case 3:
                        int i19 = AddBankAccountFragment.f33648M;
                        View view4 = addBankAccountFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p159kd.e.tv_bank_name);
                        }
                        return null;
                    case 4:
                        int i110 = AddBankAccountFragment.f33648M;
                        View view5 = addBankAccountFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p159kd.e.iv_bank);
                        }
                        return null;
                    case 5:
                        int i111 = AddBankAccountFragment.f33648M;
                        View view6 = addBankAccountFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p159kd.e.tv_select_bank);
                        }
                        return null;
                    case 6:
                        int i112 = AddBankAccountFragment.f33648M;
                        View view7 = addBankAccountFragment.f27318b;
                        if (view7 != null) {
                            return (RelativeLayout) view7.findViewById(p159kd.e.rl_select_bank);
                        }
                        return null;
                    default:
                        int i113 = AddBankAccountFragment.f33648M;
                        View view8 = addBankAccountFragment.f27318b;
                        if (view8 != null) {
                            return (EditText) view8.findViewById(p159kd.e.et_bank_account);
                        }
                        return null;
                }
            }
        });
        final int i16 = 7;
        this.f33650B = C2131j.b(new Function0(this) { // from class: Cd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddBankAccountFragment f1355b;

            {
                this.f1355b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AddBankAccountFragment addBankAccountFragment = this.f1355b;
                switch (i16) {
                    case 0:
                        int i17 = AddBankAccountFragment.f33648M;
                        View view = addBankAccountFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p159kd.e.save);
                        }
                        return null;
                    case 1:
                        int i18 = AddBankAccountFragment.f33648M;
                        View view2 = addBankAccountFragment.f27318b;
                        if (view2 != null) {
                            return (MobileNumberEditText) view2.findViewById(p159kd.e.mobile_number);
                        }
                        return null;
                    case 2:
                        int i19 = AddBankAccountFragment.f33648M;
                        View view3 = addBankAccountFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p159kd.e.iv_arrow_right);
                        }
                        return null;
                    case 3:
                        int i110 = AddBankAccountFragment.f33648M;
                        View view4 = addBankAccountFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p159kd.e.tv_bank_name);
                        }
                        return null;
                    case 4:
                        int i111 = AddBankAccountFragment.f33648M;
                        View view5 = addBankAccountFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p159kd.e.iv_bank);
                        }
                        return null;
                    case 5:
                        int i112 = AddBankAccountFragment.f33648M;
                        View view6 = addBankAccountFragment.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(p159kd.e.tv_select_bank);
                        }
                        return null;
                    case 6:
                        int i113 = AddBankAccountFragment.f33648M;
                        View view7 = addBankAccountFragment.f27318b;
                        if (view7 != null) {
                            return (RelativeLayout) view7.findViewById(p159kd.e.rl_select_bank);
                        }
                        return null;
                    default:
                        int i114 = AddBankAccountFragment.f33648M;
                        View view8 = addBankAccountFragment.f27318b;
                        if (view8 != null) {
                            return (EditText) view8.findViewById(p159kd.e.et_bank_account);
                        }
                        return null;
                }
            }
        });
    }

    public static final void t(AddBankAccountFragment addBankAccountFragment, String str) {
        c cVar = new c(addBankAccountFragment.requireContext());
        cVar.e(k.core_title_attention);
        cVar.f6605k = true;
        cVar.f6598d = str;
        cVar.d(k.core_payment_confirm, null);
        d dVarA = cVar.a();
        if (addBankAccountFragment.requireActivity().isFinishing() || addBankAccountFragment.requireActivity().isDestroyed()) {
            return;
        }
        dVarA.setCanceledOnTouchOutside(false);
        dVarA.setCancelable(false);
        dVarA.show();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "editable");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.sm_add_bank_account_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            RecipientListResp.RecipientBean recipientBean = arguments != null ? (RecipientListResp.RecipientBean) arguments.getParcelable("beneficiary_bean") : null;
            this.f33652H = recipientBean;
            if (recipientBean != null) {
                this.f33653L = true;
                TextView textView = (TextView) this.f33658w.getValue();
                if (textView != null) {
                    h.s(textView, false);
                }
                t tVar = this.f33657v;
                ImageView imageView = (ImageView) tVar.getValue();
                if (imageView != null) {
                    h.s(imageView, true);
                }
                TextView textView2 = (TextView) this.t.getValue();
                if (textView2 != null) {
                    h.s(textView2, true);
                }
                EditText editTextV = v();
                if (editTextV != null) {
                    editTextV.setText(recipientBean.getRecipientAccountNumber());
                }
                EditText editTextV2 = v();
                if (editTextV2 != null) {
                    editTextV2.setEnabled(false);
                }
                EditText editTextV3 = v();
                if (editTextV3 != null) {
                    editTextV3.setTextColor(requireContext().getColor(b.ppColorTextNormal));
                }
                EditText editTextV4 = v();
                if (editTextV4 != null) {
                    editTextV4.setCompoundDrawablesWithIntrinsicBounds(0, 0, p159kd.d.sm_lock_icon, 0);
                }
                BankInfo bankInfo = new BankInfo();
                bankInfo.bankCode = recipientBean.getRecipientBankCode();
                bankInfo.bankName = recipientBean.getRecipientBankName();
                bankInfo.bankUrl = recipientBean.getRecipientHeadImage();
                bankInfo.mmo = recipientBean.getRecipientType() == 2 ? 0 : 1;
                w(bankInfo);
                ImageView imageView2 = (ImageView) tVar.getValue();
                if (imageView2 != null) {
                    imageView2.setAlpha(0.5f);
                }
                ImageView imageView3 = (ImageView) this.f33656p.getValue();
                if (imageView3 != null) {
                    imageView3.setImageResource(p159kd.d.sm_lock_icon);
                }
                RelativeLayout relativeLayout = (RelativeLayout) this.f33649A.getValue();
                if (relativeLayout != null) {
                    relativeLayout.setEnabled(false);
                }
                MobileNumberEditText mobileNumberEditText = (MobileNumberEditText) this.f33655o.getValue();
                if (mobileNumberEditText != null) {
                    mobileNumberEditText.setText(r0.w0(recipientBean.getRecipientPhone()));
                }
            }
        }
        return 1;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        AddBankAccountViewModel addBankAccountViewModel = (AddBankAccountViewModel) this.f27333i;
        n.B(this, addBankAccountViewModel != null ? addBankAccountViewModel.f33961e : null, this, new Ba.a(this, 1), new B(5), false, null, 240);
        AddBankAccountViewModel addBankAccountViewModel2 = (AddBankAccountViewModel) this.f27333i;
        l lVar = addBankAccountViewModel2 != null ? addBankAccountViewModel2.f33964i : null;
        if (lVar != null) {
            lVar.e(this, new C0144k(new Cd.b(this, this, 0), 3));
        }
        AddBankAccountViewModel addBankAccountViewModel3 = (AddBankAccountViewModel) this.f27333i;
        l lVar2 = addBankAccountViewModel3 != null ? addBankAccountViewModel3.f33962f : null;
        if (lVar2 != null) {
            lVar2.e(this, new C0144k(new Cd.b(this, this, 1), 3));
        }
        AddBankAccountViewModel addBankAccountViewModel4 = (AddBankAccountViewModel) this.f27333i;
        l lVar3 = addBankAccountViewModel4 != null ? addBankAccountViewModel4.f33963g : null;
        if (lVar3 != null) {
            lVar3.e(this, new C0144k(new Cd.b(this, this, 2), 3));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        t tVar = this.f33654j;
        TextView textView = (TextView) tVar.getValue();
        if (textView != null) {
            textView.setEnabled(false);
        }
        TextView textView2 = (TextView) this.t.getValue();
        if (textView2 != null) {
            textView2.addTextChangedListener(this);
        }
        boolean zIsAO = BaseApplication.isAO();
        t tVar2 = this.f33649A;
        if (zIsAO) {
            RelativeLayout relativeLayout = (RelativeLayout) tVar2.getValue();
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            EditText editTextV = v();
            if (editTextV != null) {
                editTextV.setText("AO06");
            }
            EditText editTextV2 = v();
            if (editTextV2 != null) {
                editTextV2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(25)});
            }
        } else {
            EditText editTextV3 = v();
            if (editTextV3 != null) {
                editTextV3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(12)});
            }
        }
        EditText editTextV4 = v();
        if (editTextV4 != null) {
            h.r(editTextV4, new i(this, 4), null);
        }
        t tVar3 = this.f33655o;
        MobileNumberEditText mobileNumberEditText = (MobileNumberEditText) tVar3.getValue();
        if (mobileNumberEditText != null) {
            mobileNumberEditText.setFilterIndex(BaseApplication.isAO() ? 7 : 8);
        }
        MobileNumberEditText mobileNumberEditText2 = (MobileNumberEditText) tVar3.getValue();
        if (mobileNumberEditText2 != null) {
            int i7 = 11;
            if (!BaseApplication.isNG() && BaseApplication.isAO()) {
                i7 = 9;
            }
            mobileNumberEditText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i7 + 2)});
        }
        TextView textView3 = (TextView) tVar.getValue();
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) tVar2.getValue();
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(this);
        }
        return 1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 100 && i10 == -1) {
            w(intent != null ? (BankInfo) intent.getParcelableExtra("BANK_CARD_INFO") : null);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int id2 = view.getId();
        if (id2 == e.rl_select_bank) {
            startActivityForResult(new Intent(requireContext(), (Class<?>) SelectBankActivity.class), 100);
            return;
        }
        if (id2 == e.save) {
            if (this.f33653L) {
                showLoadingDialog(true);
                EditRecipientReq req = new EditRecipientReq();
                RecipientListResp.RecipientBean recipientBean = this.f33652H;
                req.setRecipientId(recipientBean != null ? recipientBean.getRecipientId() : null);
                AddBankAccountViewModel addBankAccountViewModel = (AddBankAccountViewModel) this.f27333i;
                if (addBankAccountViewModel != null) {
                    Intrinsics.checkNotNullParameter(req, "req");
                    p140j8.f.s(addBankAccountViewModel, new C0364c(req, null), addBankAccountViewModel.f33963g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    return;
                }
                return;
            }
            String strU = u();
            BankInfo bankInfo = this.f33651C;
            CheckBankCardInfoReq req2 = new CheckBankCardInfoReq(1, strU, bankInfo != null ? bankInfo.bankCode : null, "1");
            AddBankAccountViewModel addBankAccountViewModel2 = (AddBankAccountViewModel) this.f27333i;
            if (addBankAccountViewModel2 != null) {
                Intrinsics.checkNotNullParameter(req2, "req");
                C0358a c0358a = new C0358a(req2, null);
                l lVar = addBankAccountViewModel2.f33961e;
                lVar.f27356m = req2;
                Unit unit = Unit.f38893a;
                p140j8.f.v(addBankAccountViewModel2, c0358a, lVar, 0L);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s3, int i7, int i10, int i11) {
        TextView textView;
        BankInfo bankInfo;
        Intrinsics.checkNotNullParameter(s3, "s");
        if (v() == null || (textView = (TextView) this.f33654j.getValue()) == null) {
            return;
        }
        textView.setEnabled((TextUtils.isEmpty(u()) || (BaseApplication.isNG() && ((bankInfo = this.f33651C) == null || TextUtils.isEmpty(bankInfo.bankCode)))) ? false : true);
    }

    public final String u() {
        EditText editTextV = v();
        return y.k(String.valueOf(editTextV != null ? editTextV.getText() : null), " ", "");
    }

    public final EditText v() {
        return (EditText) this.f33650B.getValue();
    }

    public final void w(BankInfo bankInfo) {
        if (bankInfo != null) {
            this.f33651C = bankInfo;
            t tVar = this.t;
            TextView textView = (TextView) tVar.getValue();
            if (textView != null) {
                textView.setText(bankInfo.bankName);
            }
            requireContext();
            String str = bankInfo.bankUrl;
            t tVar2 = this.f33657v;
            p002a.a.r(str, (ImageView) tVar2.getValue());
            ImageView imageView = (ImageView) tVar2.getValue();
            if (imageView != null) {
                h.s(imageView, true);
            }
            TextView textView2 = (TextView) tVar.getValue();
            if (textView2 != null) {
                h.s(textView2, true);
            }
            TextView textView3 = (TextView) this.f33658w.getValue();
            if (textView3 != null) {
                h.s(textView3, false);
            }
        }
    }
}
