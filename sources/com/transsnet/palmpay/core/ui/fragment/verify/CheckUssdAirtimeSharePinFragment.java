package com.transsnet.palmpay.core.ui.fragment.verify;

import Ab.i;
import C0.G;
import Ja.I;
import Pa.C0525w;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.V;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.bean.UssdDialBean;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.callback.PayVerificationCallback;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.dialog.UssdDialingDialog;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckUssdAirtimeSharePinFragment;
import com.transsnet.palmpay.core.ui.mvvm.PayVerifyViewModel;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.ActivityUtils;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.g;
import p025ba.k;
import p071ef.b;
import p220oa.h;
import p298tf.f;
import p324va.c;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/verify/CheckUssdAirtimeSharePinFragment;", "Lcom/transsnet/palmpay/core/ui/fragment/verify/BaseVerifyFragment;", "Lcom/transsnet/palmpay/core/ui/mvvm/PayVerifyViewModel;", "<init>", "()V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckUssdAirtimeSharePinFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckUssdAirtimeSharePinFragment.kt\ncom/transsnet/palmpay/core/ui/fragment/verify/CheckUssdAirtimeSharePinFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,288:1\n1#2:289\n694#3,50:290\n*S KotlinDebug\n*F\n+ 1 CheckUssdAirtimeSharePinFragment.kt\ncom/transsnet/palmpay/core/ui/fragment/verify/CheckUssdAirtimeSharePinFragment\n*L\n115#1:290,50\n*E\n"})
public final class CheckUssdAirtimeSharePinFragment extends BaseVerifyFragment<PayVerifyViewModel> {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f28035L = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public PayByOrderResp.DataBean f28036A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CheckPayReq f28037B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public UssdDialBean f28038C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f28039H;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f28040j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f28041o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f28042p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f28043v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f28044w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CheckUssdAirtimeSharePinFragment newInstance(@NotNull PayByOrderResp.DataBean bean, @NotNull CheckPayReq req, @Nullable String str) {
            Intrinsics.checkNotNullParameter(bean, "bean");
            Intrinsics.checkNotNullParameter(req, "req");
            CheckUssdAirtimeSharePinFragment checkUssdAirtimeSharePinFragment = new CheckUssdAirtimeSharePinFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_data", bean);
            bundle.putSerializable("core_check_pay_info", req);
            bundle.putString("core_calculation_ext_info", str);
            checkUssdAirtimeSharePinFragment.setArguments(bundle);
            return checkUssdAirtimeSharePinFragment;
        }

        private a() {
        }
    }

    public CheckUssdAirtimeSharePinFragment() {
        final int i7 = 0;
        this.f28040j = C2131j.b(new Function0(this) { // from class: Ja.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckUssdAirtimeSharePinFragment f4629b;

            {
                this.f4629b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckUssdAirtimeSharePinFragment checkUssdAirtimeSharePinFragment = this.f4629b;
                switch (i7) {
                    case 0:
                        CheckUssdAirtimeSharePinFragment.a aVar = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view != null) {
                            return (PpButton) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckUssdAirtimeSharePinFragment.a aVar2 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view2 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvSetPin);
                        }
                        return null;
                    case 2:
                        CheckUssdAirtimeSharePinFragment.a aVar3 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view3 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p025ba.e.ivHide);
                        }
                        return null;
                    case 3:
                        CheckUssdAirtimeSharePinFragment.a aVar4 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view4 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view4 != null) {
                            return (AppCompatEditText) view4.findViewById(p025ba.e.editSharePin);
                        }
                        return null;
                    case 4:
                        CheckUssdAirtimeSharePinFragment.a aVar5 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view5 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 5:
                        CheckUssdAirtimeSharePinFragment.a aVar6 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view6 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                    default:
                        CheckUssdAirtimeSharePinFragment.a aVar7 = CheckUssdAirtimeSharePinFragment.f28035L;
                        Context contextRequireContext = checkUssdAirtimeSharePinFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        UssdDialingDialog ussdDialingDialog = new UssdDialingDialog(contextRequireContext);
                        ussdDialingDialog.setOnUssdDialingListener(new K(checkUssdAirtimeSharePinFragment));
                        return ussdDialingDialog;
                }
            }
        });
        final int i10 = 1;
        this.f28041o = C2131j.b(new Function0(this) { // from class: Ja.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckUssdAirtimeSharePinFragment f4629b;

            {
                this.f4629b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckUssdAirtimeSharePinFragment checkUssdAirtimeSharePinFragment = this.f4629b;
                switch (i10) {
                    case 0:
                        CheckUssdAirtimeSharePinFragment.a aVar = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view != null) {
                            return (PpButton) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckUssdAirtimeSharePinFragment.a aVar2 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view2 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvSetPin);
                        }
                        return null;
                    case 2:
                        CheckUssdAirtimeSharePinFragment.a aVar3 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view3 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p025ba.e.ivHide);
                        }
                        return null;
                    case 3:
                        CheckUssdAirtimeSharePinFragment.a aVar4 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view4 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view4 != null) {
                            return (AppCompatEditText) view4.findViewById(p025ba.e.editSharePin);
                        }
                        return null;
                    case 4:
                        CheckUssdAirtimeSharePinFragment.a aVar5 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view5 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 5:
                        CheckUssdAirtimeSharePinFragment.a aVar6 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view6 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                    default:
                        CheckUssdAirtimeSharePinFragment.a aVar7 = CheckUssdAirtimeSharePinFragment.f28035L;
                        Context contextRequireContext = checkUssdAirtimeSharePinFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        UssdDialingDialog ussdDialingDialog = new UssdDialingDialog(contextRequireContext);
                        ussdDialingDialog.setOnUssdDialingListener(new K(checkUssdAirtimeSharePinFragment));
                        return ussdDialingDialog;
                }
            }
        });
        final int i11 = 2;
        this.f28042p = C2131j.b(new Function0(this) { // from class: Ja.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckUssdAirtimeSharePinFragment f4629b;

            {
                this.f4629b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckUssdAirtimeSharePinFragment checkUssdAirtimeSharePinFragment = this.f4629b;
                switch (i11) {
                    case 0:
                        CheckUssdAirtimeSharePinFragment.a aVar = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view != null) {
                            return (PpButton) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckUssdAirtimeSharePinFragment.a aVar2 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view2 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvSetPin);
                        }
                        return null;
                    case 2:
                        CheckUssdAirtimeSharePinFragment.a aVar3 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view3 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p025ba.e.ivHide);
                        }
                        return null;
                    case 3:
                        CheckUssdAirtimeSharePinFragment.a aVar4 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view4 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view4 != null) {
                            return (AppCompatEditText) view4.findViewById(p025ba.e.editSharePin);
                        }
                        return null;
                    case 4:
                        CheckUssdAirtimeSharePinFragment.a aVar5 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view5 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 5:
                        CheckUssdAirtimeSharePinFragment.a aVar6 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view6 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                    default:
                        CheckUssdAirtimeSharePinFragment.a aVar7 = CheckUssdAirtimeSharePinFragment.f28035L;
                        Context contextRequireContext = checkUssdAirtimeSharePinFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        UssdDialingDialog ussdDialingDialog = new UssdDialingDialog(contextRequireContext);
                        ussdDialingDialog.setOnUssdDialingListener(new K(checkUssdAirtimeSharePinFragment));
                        return ussdDialingDialog;
                }
            }
        });
        final int i12 = 3;
        this.t = C2131j.b(new Function0(this) { // from class: Ja.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckUssdAirtimeSharePinFragment f4629b;

            {
                this.f4629b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckUssdAirtimeSharePinFragment checkUssdAirtimeSharePinFragment = this.f4629b;
                switch (i12) {
                    case 0:
                        CheckUssdAirtimeSharePinFragment.a aVar = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view != null) {
                            return (PpButton) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckUssdAirtimeSharePinFragment.a aVar2 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view2 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvSetPin);
                        }
                        return null;
                    case 2:
                        CheckUssdAirtimeSharePinFragment.a aVar3 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view3 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p025ba.e.ivHide);
                        }
                        return null;
                    case 3:
                        CheckUssdAirtimeSharePinFragment.a aVar4 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view4 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view4 != null) {
                            return (AppCompatEditText) view4.findViewById(p025ba.e.editSharePin);
                        }
                        return null;
                    case 4:
                        CheckUssdAirtimeSharePinFragment.a aVar5 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view5 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 5:
                        CheckUssdAirtimeSharePinFragment.a aVar6 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view6 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                    default:
                        CheckUssdAirtimeSharePinFragment.a aVar7 = CheckUssdAirtimeSharePinFragment.f28035L;
                        Context contextRequireContext = checkUssdAirtimeSharePinFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        UssdDialingDialog ussdDialingDialog = new UssdDialingDialog(contextRequireContext);
                        ussdDialingDialog.setOnUssdDialingListener(new K(checkUssdAirtimeSharePinFragment));
                        return ussdDialingDialog;
                }
            }
        });
        final int i13 = 4;
        this.f28043v = C2131j.b(new Function0(this) { // from class: Ja.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckUssdAirtimeSharePinFragment f4629b;

            {
                this.f4629b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckUssdAirtimeSharePinFragment checkUssdAirtimeSharePinFragment = this.f4629b;
                switch (i13) {
                    case 0:
                        CheckUssdAirtimeSharePinFragment.a aVar = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view != null) {
                            return (PpButton) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckUssdAirtimeSharePinFragment.a aVar2 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view2 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvSetPin);
                        }
                        return null;
                    case 2:
                        CheckUssdAirtimeSharePinFragment.a aVar3 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view3 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p025ba.e.ivHide);
                        }
                        return null;
                    case 3:
                        CheckUssdAirtimeSharePinFragment.a aVar4 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view4 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view4 != null) {
                            return (AppCompatEditText) view4.findViewById(p025ba.e.editSharePin);
                        }
                        return null;
                    case 4:
                        CheckUssdAirtimeSharePinFragment.a aVar5 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view5 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 5:
                        CheckUssdAirtimeSharePinFragment.a aVar6 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view6 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                    default:
                        CheckUssdAirtimeSharePinFragment.a aVar7 = CheckUssdAirtimeSharePinFragment.f28035L;
                        Context contextRequireContext = checkUssdAirtimeSharePinFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        UssdDialingDialog ussdDialingDialog = new UssdDialingDialog(contextRequireContext);
                        ussdDialingDialog.setOnUssdDialingListener(new K(checkUssdAirtimeSharePinFragment));
                        return ussdDialingDialog;
                }
            }
        });
        final int i14 = 5;
        this.f28044w = C2131j.b(new Function0(this) { // from class: Ja.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckUssdAirtimeSharePinFragment f4629b;

            {
                this.f4629b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckUssdAirtimeSharePinFragment checkUssdAirtimeSharePinFragment = this.f4629b;
                switch (i14) {
                    case 0:
                        CheckUssdAirtimeSharePinFragment.a aVar = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view != null) {
                            return (PpButton) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckUssdAirtimeSharePinFragment.a aVar2 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view2 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvSetPin);
                        }
                        return null;
                    case 2:
                        CheckUssdAirtimeSharePinFragment.a aVar3 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view3 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p025ba.e.ivHide);
                        }
                        return null;
                    case 3:
                        CheckUssdAirtimeSharePinFragment.a aVar4 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view4 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view4 != null) {
                            return (AppCompatEditText) view4.findViewById(p025ba.e.editSharePin);
                        }
                        return null;
                    case 4:
                        CheckUssdAirtimeSharePinFragment.a aVar5 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view5 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 5:
                        CheckUssdAirtimeSharePinFragment.a aVar6 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view6 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                    default:
                        CheckUssdAirtimeSharePinFragment.a aVar7 = CheckUssdAirtimeSharePinFragment.f28035L;
                        Context contextRequireContext = checkUssdAirtimeSharePinFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        UssdDialingDialog ussdDialingDialog = new UssdDialingDialog(contextRequireContext);
                        ussdDialingDialog.setOnUssdDialingListener(new K(checkUssdAirtimeSharePinFragment));
                        return ussdDialingDialog;
                }
            }
        });
        final int i15 = 6;
        this.f28039H = C2131j.b(new Function0(this) { // from class: Ja.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckUssdAirtimeSharePinFragment f4629b;

            {
                this.f4629b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckUssdAirtimeSharePinFragment checkUssdAirtimeSharePinFragment = this.f4629b;
                switch (i15) {
                    case 0:
                        CheckUssdAirtimeSharePinFragment.a aVar = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view != null) {
                            return (PpButton) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckUssdAirtimeSharePinFragment.a aVar2 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view2 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvSetPin);
                        }
                        return null;
                    case 2:
                        CheckUssdAirtimeSharePinFragment.a aVar3 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view3 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p025ba.e.ivHide);
                        }
                        return null;
                    case 3:
                        CheckUssdAirtimeSharePinFragment.a aVar4 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view4 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view4 != null) {
                            return (AppCompatEditText) view4.findViewById(p025ba.e.editSharePin);
                        }
                        return null;
                    case 4:
                        CheckUssdAirtimeSharePinFragment.a aVar5 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view5 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 5:
                        CheckUssdAirtimeSharePinFragment.a aVar6 = CheckUssdAirtimeSharePinFragment.f28035L;
                        View view6 = checkUssdAirtimeSharePinFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                    default:
                        CheckUssdAirtimeSharePinFragment.a aVar7 = CheckUssdAirtimeSharePinFragment.f28035L;
                        Context contextRequireContext = checkUssdAirtimeSharePinFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        UssdDialingDialog ussdDialingDialog = new UssdDialingDialog(contextRequireContext);
                        ussdDialingDialog.setOnUssdDialingListener(new K(checkUssdAirtimeSharePinFragment));
                        return ussdDialingDialog;
                }
            }
        });
    }

    public static final void z(CheckUssdAirtimeSharePinFragment checkUssdAirtimeSharePinFragment) {
        CheckPayReq checkPayReq;
        if (ActivityUtils.isValidActivityContext(checkUssdAirtimeSharePinFragment.requireActivity()) && (checkPayReq = checkUssdAirtimeSharePinFragment.f28037B) != null) {
            ((PayApiService) c.f43141a.f14621b).queryNewPayResult(checkPayReq).k(f.f42629b).i(b.a()).subscribe(new I(checkUssdAirtimeSharePinFragment, 0));
        }
    }

    public final AppCompatEditText A() {
        return (AppCompatEditText) this.t.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return g.core_fragment_check_airtime_share_pin;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        String string;
        Window window;
        super.o();
        E activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(5);
        }
        Bundle arguments = getArguments();
        this.f28036A = arguments != null ? (PayByOrderResp.DataBean) arguments.getParcelable("extra_data") : null;
        Bundle arguments2 = getArguments();
        Serializable serializable = arguments2 != null ? arguments2.getSerializable("core_check_pay_info") : null;
        Intrinsics.f(serializable, "null cannot be cast to non-null type com.transsnet.palmpay.core.bean.payment.CheckPayReq");
        this.f28037B = (CheckPayReq) serializable;
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string = arguments3.getString("core_calculation_ext_info", "")) != null) {
            if (TextUtils.isEmpty(string)) {
                string = null;
            }
            if (string != null) {
                this.f28038C = (UssdDialBean) d0.l(UssdDialBean.class, string);
            }
        }
        PayByOrderResp.DataBean dataBean = this.f28036A;
        if (dataBean != null) {
            boolean zIsEmpty = TextUtils.isEmpty(dataBean.promptMessage);
            t tVar = this.f28043v;
            if (zIsEmpty) {
                TextView textView = (TextView) tVar.getValue();
                if (textView != null) {
                    textView.setText(Html.fromHtml(getString(k.core_confirm_airtime_share_pin), 0));
                }
            } else {
                TextView textView2 = (TextView) tVar.getValue();
                if (textView2 != null) {
                    textView2.setText(dataBean.promptMessage);
                }
            }
            if (!TextUtils.isEmpty(dataBean.errorMsg)) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                String errorMsg = dataBean.errorMsg;
                Intrinsics.checkNotNullExpressionValue(errorMsg, "errorMsg");
                int i7 = r.cv_icon_dialog_warning;
                int i10 = k.core_try_again1;
                int i11 = k.core_opps;
                O6.c cVar = new O6.c(contextRequireContext);
                cVar.f6614u = 3;
                cVar.e(i11);
                cVar.f("");
                cVar.f6607m = i7;
                cVar.f6598d = errorMsg;
                cVar.d(i10, null);
                cVar.f6605k = true;
                cVar.f6606l = 1;
                G.v(cVar, false, false);
            }
        }
        x((ImageView) this.f28044w.getValue());
        AppCompatEditText appCompatEditTextA = A();
        if (appCompatEditTextA != null) {
            appCompatEditTextA.requestFocus();
        }
        AppCompatEditText appCompatEditTextA2 = A();
        if (appCompatEditTextA2 != null) {
            h.r(appCompatEditTextA2, new i(this, 23), null);
        }
        t tVar2 = this.f28040j;
        PpButton ppButton = (PpButton) tVar2.getValue();
        if (ppButton != null) {
            ppButton.setEnabled(false);
        }
        PpButton ppButton2 = (PpButton) tVar2.getValue();
        if (ppButton2 != null) {
            final int i12 = 0;
            ppButton2.setOnClickListener(new View.OnClickListener(this) { // from class: Ja.G

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CheckUssdAirtimeSharePinFragment f4627b;

                {
                    this.f4627b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Editable text;
                    CheckUssdAirtimeSharePinFragment checkUssdAirtimeSharePinFragment = this.f4627b;
                    switch (i12) {
                        case 0:
                            CheckUssdAirtimeSharePinFragment.a aVar = CheckUssdAirtimeSharePinFragment.f28035L;
                            PayVerificationCallback payVerificationCallbackU = checkUssdAirtimeSharePinFragment.u();
                            if (payVerificationCallbackU != null) {
                                AppCompatEditText appCompatEditTextA3 = checkUssdAirtimeSharePinFragment.A();
                                payVerificationCallbackU.verifyPayMethod(String.valueOf(appCompatEditTextA3 != null ? appCompatEditTextA3.getText() : null), 23);
                            }
                            p355xf.t tVar3 = checkUssdAirtimeSharePinFragment.f28039H;
                            if (!((UssdDialingDialog) tVar3.getValue()).isShowing()) {
                                ((UssdDialingDialog) tVar3.getValue()).show();
                                UssdDialingDialog ussdDialingDialog = (UssdDialingDialog) tVar3.getValue();
                                AbstractC1205o lifecycle = checkUssdAirtimeSharePinFragment.getLifecycle();
                                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                                ussdDialingDialog.startCountdown(V.e(lifecycle));
                            }
                            break;
                        case 1:
                            PayByOrderResp.DataBean dataBean2 = checkUssdAirtimeSharePinFragment.f28036A;
                            if (!TextUtils.isEmpty(dataBean2 != null ? dataBean2.orderData : null)) {
                                Postcard postcardBuild = ARouter.getInstance().build("/airtime/recharge_2_cash_set_pin");
                                PayByOrderResp.DataBean dataBean3 = checkUssdAirtimeSharePinFragment.f28036A;
                                Postcard postcardWithString = postcardBuild.withString("PHONE_NUM", C0525w.j(dataBean3 != null ? dataBean3.orderData : null, "senderPhoneNo"));
                                PayByOrderResp.DataBean dataBean4 = checkUssdAirtimeSharePinFragment.f28036A;
                                Postcard postcardWithString2 = postcardWithString.withString("extra_data_1", C0525w.j(dataBean4 != null ? dataBean4.orderData : null, "icon"));
                                PayByOrderResp.DataBean dataBean5 = checkUssdAirtimeSharePinFragment.f28036A;
                                postcardWithString2.withString("extra_data_2", C0525w.j(dataBean5 != null ? dataBean5.orderData : null, "biller")).navigation();
                            }
                            break;
                        default:
                            CheckUssdAirtimeSharePinFragment.a aVar2 = CheckUssdAirtimeSharePinFragment.f28035L;
                            Object tag = view.getTag();
                            if (tag == null) {
                                tag = Boolean.TRUE;
                            }
                            Boolean bool = Boolean.TRUE;
                            boolean zEquals = tag.equals(bool);
                            p355xf.t tVar4 = checkUssdAirtimeSharePinFragment.f28042p;
                            if (zEquals) {
                                AppCompatEditText appCompatEditTextA4 = checkUssdAirtimeSharePinFragment.A();
                                if (appCompatEditTextA4 != null) {
                                    appCompatEditTextA4.setInputType(2);
                                }
                                ImageView imageView = (ImageView) tVar4.getValue();
                                if (imageView != null) {
                                    imageView.setImageResource(com.transsnet.palmpay.custom_view.r.cv_hide_psw);
                                }
                            } else {
                                AppCompatEditText appCompatEditTextA5 = checkUssdAirtimeSharePinFragment.A();
                                if (appCompatEditTextA5 != null) {
                                    appCompatEditTextA5.setInputType(18);
                                }
                                ImageView imageView2 = (ImageView) tVar4.getValue();
                                if (imageView2 != null) {
                                    imageView2.setImageResource(com.transsnet.palmpay.custom_view.r.cv_show_psw);
                                }
                            }
                            AppCompatEditText appCompatEditTextA6 = checkUssdAirtimeSharePinFragment.A();
                            if (appCompatEditTextA6 != null) {
                                AppCompatEditText appCompatEditTextA7 = checkUssdAirtimeSharePinFragment.A();
                                appCompatEditTextA6.setSelection((appCompatEditTextA7 == null || (text = appCompatEditTextA7.getText()) == null) ? 0 : text.length());
                            }
                            view.setTag(Boolean.valueOf(!tag.equals(bool)));
                            break;
                    }
                }
            });
        }
        TextView textView3 = (TextView) this.f28041o.getValue();
        if (textView3 != null) {
            final int i13 = 1;
            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: Ja.G

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CheckUssdAirtimeSharePinFragment f4627b;

                {
                    this.f4627b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Editable text;
                    CheckUssdAirtimeSharePinFragment checkUssdAirtimeSharePinFragment = this.f4627b;
                    switch (i13) {
                        case 0:
                            CheckUssdAirtimeSharePinFragment.a aVar = CheckUssdAirtimeSharePinFragment.f28035L;
                            PayVerificationCallback payVerificationCallbackU = checkUssdAirtimeSharePinFragment.u();
                            if (payVerificationCallbackU != null) {
                                AppCompatEditText appCompatEditTextA3 = checkUssdAirtimeSharePinFragment.A();
                                payVerificationCallbackU.verifyPayMethod(String.valueOf(appCompatEditTextA3 != null ? appCompatEditTextA3.getText() : null), 23);
                            }
                            p355xf.t tVar3 = checkUssdAirtimeSharePinFragment.f28039H;
                            if (!((UssdDialingDialog) tVar3.getValue()).isShowing()) {
                                ((UssdDialingDialog) tVar3.getValue()).show();
                                UssdDialingDialog ussdDialingDialog = (UssdDialingDialog) tVar3.getValue();
                                AbstractC1205o lifecycle = checkUssdAirtimeSharePinFragment.getLifecycle();
                                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                                ussdDialingDialog.startCountdown(V.e(lifecycle));
                            }
                            break;
                        case 1:
                            PayByOrderResp.DataBean dataBean2 = checkUssdAirtimeSharePinFragment.f28036A;
                            if (!TextUtils.isEmpty(dataBean2 != null ? dataBean2.orderData : null)) {
                                Postcard postcardBuild = ARouter.getInstance().build("/airtime/recharge_2_cash_set_pin");
                                PayByOrderResp.DataBean dataBean3 = checkUssdAirtimeSharePinFragment.f28036A;
                                Postcard postcardWithString = postcardBuild.withString("PHONE_NUM", C0525w.j(dataBean3 != null ? dataBean3.orderData : null, "senderPhoneNo"));
                                PayByOrderResp.DataBean dataBean4 = checkUssdAirtimeSharePinFragment.f28036A;
                                Postcard postcardWithString2 = postcardWithString.withString("extra_data_1", C0525w.j(dataBean4 != null ? dataBean4.orderData : null, "icon"));
                                PayByOrderResp.DataBean dataBean5 = checkUssdAirtimeSharePinFragment.f28036A;
                                postcardWithString2.withString("extra_data_2", C0525w.j(dataBean5 != null ? dataBean5.orderData : null, "biller")).navigation();
                            }
                            break;
                        default:
                            CheckUssdAirtimeSharePinFragment.a aVar2 = CheckUssdAirtimeSharePinFragment.f28035L;
                            Object tag = view.getTag();
                            if (tag == null) {
                                tag = Boolean.TRUE;
                            }
                            Boolean bool = Boolean.TRUE;
                            boolean zEquals = tag.equals(bool);
                            p355xf.t tVar4 = checkUssdAirtimeSharePinFragment.f28042p;
                            if (zEquals) {
                                AppCompatEditText appCompatEditTextA4 = checkUssdAirtimeSharePinFragment.A();
                                if (appCompatEditTextA4 != null) {
                                    appCompatEditTextA4.setInputType(2);
                                }
                                ImageView imageView = (ImageView) tVar4.getValue();
                                if (imageView != null) {
                                    imageView.setImageResource(com.transsnet.palmpay.custom_view.r.cv_hide_psw);
                                }
                            } else {
                                AppCompatEditText appCompatEditTextA5 = checkUssdAirtimeSharePinFragment.A();
                                if (appCompatEditTextA5 != null) {
                                    appCompatEditTextA5.setInputType(18);
                                }
                                ImageView imageView2 = (ImageView) tVar4.getValue();
                                if (imageView2 != null) {
                                    imageView2.setImageResource(com.transsnet.palmpay.custom_view.r.cv_show_psw);
                                }
                            }
                            AppCompatEditText appCompatEditTextA6 = checkUssdAirtimeSharePinFragment.A();
                            if (appCompatEditTextA6 != null) {
                                AppCompatEditText appCompatEditTextA7 = checkUssdAirtimeSharePinFragment.A();
                                appCompatEditTextA6.setSelection((appCompatEditTextA7 == null || (text = appCompatEditTextA7.getText()) == null) ? 0 : text.length());
                            }
                            view.setTag(Boolean.valueOf(!tag.equals(bool)));
                            break;
                    }
                }
            });
        }
        ImageView imageView = (ImageView) this.f28042p.getValue();
        if (imageView != null) {
            final int i14 = 2;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: Ja.G

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CheckUssdAirtimeSharePinFragment f4627b;

                {
                    this.f4627b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Editable text;
                    CheckUssdAirtimeSharePinFragment checkUssdAirtimeSharePinFragment = this.f4627b;
                    switch (i14) {
                        case 0:
                            CheckUssdAirtimeSharePinFragment.a aVar = CheckUssdAirtimeSharePinFragment.f28035L;
                            PayVerificationCallback payVerificationCallbackU = checkUssdAirtimeSharePinFragment.u();
                            if (payVerificationCallbackU != null) {
                                AppCompatEditText appCompatEditTextA3 = checkUssdAirtimeSharePinFragment.A();
                                payVerificationCallbackU.verifyPayMethod(String.valueOf(appCompatEditTextA3 != null ? appCompatEditTextA3.getText() : null), 23);
                            }
                            p355xf.t tVar3 = checkUssdAirtimeSharePinFragment.f28039H;
                            if (!((UssdDialingDialog) tVar3.getValue()).isShowing()) {
                                ((UssdDialingDialog) tVar3.getValue()).show();
                                UssdDialingDialog ussdDialingDialog = (UssdDialingDialog) tVar3.getValue();
                                AbstractC1205o lifecycle = checkUssdAirtimeSharePinFragment.getLifecycle();
                                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                                ussdDialingDialog.startCountdown(V.e(lifecycle));
                            }
                            break;
                        case 1:
                            PayByOrderResp.DataBean dataBean2 = checkUssdAirtimeSharePinFragment.f28036A;
                            if (!TextUtils.isEmpty(dataBean2 != null ? dataBean2.orderData : null)) {
                                Postcard postcardBuild = ARouter.getInstance().build("/airtime/recharge_2_cash_set_pin");
                                PayByOrderResp.DataBean dataBean3 = checkUssdAirtimeSharePinFragment.f28036A;
                                Postcard postcardWithString = postcardBuild.withString("PHONE_NUM", C0525w.j(dataBean3 != null ? dataBean3.orderData : null, "senderPhoneNo"));
                                PayByOrderResp.DataBean dataBean4 = checkUssdAirtimeSharePinFragment.f28036A;
                                Postcard postcardWithString2 = postcardWithString.withString("extra_data_1", C0525w.j(dataBean4 != null ? dataBean4.orderData : null, "icon"));
                                PayByOrderResp.DataBean dataBean5 = checkUssdAirtimeSharePinFragment.f28036A;
                                postcardWithString2.withString("extra_data_2", C0525w.j(dataBean5 != null ? dataBean5.orderData : null, "biller")).navigation();
                            }
                            break;
                        default:
                            CheckUssdAirtimeSharePinFragment.a aVar2 = CheckUssdAirtimeSharePinFragment.f28035L;
                            Object tag = view.getTag();
                            if (tag == null) {
                                tag = Boolean.TRUE;
                            }
                            Boolean bool = Boolean.TRUE;
                            boolean zEquals = tag.equals(bool);
                            p355xf.t tVar4 = checkUssdAirtimeSharePinFragment.f28042p;
                            if (zEquals) {
                                AppCompatEditText appCompatEditTextA4 = checkUssdAirtimeSharePinFragment.A();
                                if (appCompatEditTextA4 != null) {
                                    appCompatEditTextA4.setInputType(2);
                                }
                                ImageView imageView2 = (ImageView) tVar4.getValue();
                                if (imageView2 != null) {
                                    imageView2.setImageResource(com.transsnet.palmpay.custom_view.r.cv_hide_psw);
                                }
                            } else {
                                AppCompatEditText appCompatEditTextA5 = checkUssdAirtimeSharePinFragment.A();
                                if (appCompatEditTextA5 != null) {
                                    appCompatEditTextA5.setInputType(18);
                                }
                                ImageView imageView3 = (ImageView) tVar4.getValue();
                                if (imageView3 != null) {
                                    imageView3.setImageResource(com.transsnet.palmpay.custom_view.r.cv_show_psw);
                                }
                            }
                            AppCompatEditText appCompatEditTextA6 = checkUssdAirtimeSharePinFragment.A();
                            if (appCompatEditTextA6 != null) {
                                AppCompatEditText appCompatEditTextA7 = checkUssdAirtimeSharePinFragment.A();
                                appCompatEditTextA6.setSelection((appCompatEditTextA7 == null || (text = appCompatEditTextA7.getText()) == null) ? 0 : text.length());
                            }
                            view.setTag(Boolean.valueOf(!tag.equals(bool)));
                            break;
                    }
                }
            });
        }
        return 0;
    }
}
