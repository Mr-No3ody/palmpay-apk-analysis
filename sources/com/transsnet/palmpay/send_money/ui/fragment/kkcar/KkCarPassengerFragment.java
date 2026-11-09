package com.transsnet.palmpay.send_money.ui.fragment.kkcar;

import Ab.ViewOnClickListenerC0053e;
import Bc.p;
import C0.G;
import C9.C0144k;
import Ce.p0;
import Dd.g;
import Dd.h;
import Dd.i;
import Dd.j;
import Kd.C0385j;
import Kd.C0388k;
import Kd.C0391l;
import L6.b;
import O6.c;
import O6.d;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.t0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.E;
import androidx.lifecycle.F;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.bumptech.glide.n;
import com.facebook.imageutils.JfifUtil;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.ui.activity.d0;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.kkcar.KkCarPayVerificationArgs;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.AuthErrorDTO;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.KkCarQrCodeRsp;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import com.transsnet.palmpay.send_money.ui.fragment.kkcar.KkCarPassengerFragment;
import com.transsnet.palmpay.send_money.ui.view.kkcar.KkCarQrView;
import com.transsnet.palmpay.send_money.util.kkcar.KkCarPassengerAuthStore;
import com.transsnet.palmpay.send_money.viewmodel.KkCarHostViewModel;
import com.transsnet.palmpay.send_money.viewmodel.KkCarPassengerViewModel;
import com.transsnet.palmpay.util.NetworkUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p140j8.f;
import p159kd.e;
import p223od.u;
import p355xf.C2131j;
import p355xf.l;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000b\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/kkcar/KkCarPassengerFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/send_money/viewmodel/KkCarPassengerViewModel;", "Lod/u;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "messageEvent", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "Dd/i", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKkCarPassengerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KkCarPassengerFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/kkcar/KkCarPassengerFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,715:1\n115#2,8:716\n145#2:724\n115#2,8:725\n145#2:733\n115#2,8:734\n145#2:742\n1#3:743\n*S KotlinDebug\n*F\n+ 1 KkCarPassengerFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/kkcar/KkCarPassengerFragment\n*L\n247#1:716,8\n247#1:724\n260#1:725,8\n260#1:733\n268#1:734,8\n268#1:742\n*E\n"})
public final class KkCarPassengerFragment extends BaseMvvmVBFragment<KkCarPassengerViewModel, u> {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f33729B = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f33732p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f33733v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f33734w;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f33731o = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f33730A = C2131j.b(new h(this, 0));

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

    public static KkCarQrCodeRsp y() {
        String string = SPUtils.get().getString("sm_kk_car_passenger_qr_code_json", "");
        String str = string != null ? string : "";
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (KkCarQrCodeRsp) new Gson().fromJson(str, KkCarQrCodeRsp.class);
        } catch (JsonSyntaxException | Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    public final void A(AuthErrorDTO authErrorDTO, i iVar) {
        String string;
        String string2;
        String string3;
        int iOrdinal = iVar.ordinal();
        if (iOrdinal == 0) {
            n0.g().u(new ViewEvent("keke_turnon_accounttopup_show").add("app", "native"));
        } else {
            if (iOrdinal != 1) {
                throw new l();
            }
            n0.g().u(new ViewEvent("keke_qr_biz_error_popup_show").add("app", "native"));
        }
        B b7 = new B();
        c cVar = new c(requireContext());
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        cVar.f6608n = G8.a.x(contextRequireContext, S6.a.pay_WarningOutline, null, Integer.valueOf(b.ppColorPrimary), 36.0f, 114);
        String title = authErrorDTO.getTitle();
        if (title != null && (string3 = StringsKt.V(title).toString()) != null) {
            if (string3.length() <= 0) {
                string3 = null;
            }
            if (string3 != null) {
                cVar.f(string3);
            }
        }
        String desc = authErrorDTO.getDesc();
        if (desc != null && (string2 = StringsKt.V(desc).toString()) != null) {
            if (string2.length() <= 0) {
                string2 = null;
            }
            if (string2 != null) {
                cVar.f6598d = string2;
            }
        }
        String button = authErrorDTO.getButton();
        if (button == null || (string = StringsKt.V(button).toString()) == null) {
            string = getString(k.core_confirm);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            if (string.length() <= 0) {
                string = null;
            }
            if (string == null) {
                string = getString(k.core_confirm);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
        }
        String jumpUrl = authErrorDTO.getJumpUrl();
        String string4 = jumpUrl != null ? StringsKt.V(jumpUrl).toString() : null;
        if (string4 == null) {
            string4 = "";
        }
        g gVar = new g(b7, iVar, string4, this);
        cVar.f6600f = string;
        cVar.f6602h = gVar;
        d dVarA = cVar.a();
        dVarA.setOnDismissListener(new p0(1, b7, iVar));
        dVarA.show();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        F f10;
        F f11;
        F f12;
        F f13;
        F f14;
        F f15;
        KkCarPassengerViewModel kkCarPassengerViewModel = (KkCarPassengerViewModel) this.f27333i;
        if (kkCarPassengerViewModel != null && (f15 = kkCarPassengerViewModel.f33972e) != null) {
            final int i7 = 0;
            f15.e(getViewLifecycleOwner(), new C0144k(new Function1(this) { // from class: Dd.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ KkCarPassengerFragment f1849b;

                {
                    this.f1849b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    KkCarQrCodeRsp.QrCodeDTO qrCodeDTO;
                    KkCarQrCodeRsp.QrCodeDTO qrCodeDTO2;
                    F f16;
                    String orderId;
                    String string;
                    F f17;
                    F f18;
                    F f19;
                    KkCarPassengerFragment kkCarPassengerFragment = this.f1849b;
                    switch (i7) {
                        case 0:
                            int i10 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.w((KkCarQrCodeRsp) obj);
                            break;
                        case 1:
                            KkCarQrCodeRsp kkCarQrCodeRsp = (KkCarQrCodeRsp) obj;
                            int i11 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.w(kkCarQrCodeRsp);
                            AuthErrorDTO error = (kkCarQrCodeRsp == null || (qrCodeDTO2 = kkCarQrCodeRsp.getQrCodeDTO()) == null) ? null : qrCodeDTO2.getError();
                            String qrCode = (kkCarQrCodeRsp == null || (qrCodeDTO = kkCarQrCodeRsp.getQrCodeDTO()) == null) ? null : qrCodeDTO.getQrCode();
                            if (error == null) {
                                kkCarPassengerFragment.t = null;
                            } else {
                                String title = error.getTitle();
                                String string2 = title != null ? StringsKt.V(title).toString() : null;
                                String desc = error.getDesc();
                                String string3 = desc != null ? StringsKt.V(desc).toString() : null;
                                if ((string2 != null && string2.length() != 0) || (string3 != null && string3.length() != 0)) {
                                    if (qrCode == null) {
                                        qrCode = "";
                                    }
                                    String jumpUrl = error.getJumpUrl();
                                    String str = jumpUrl != null ? jumpUrl : "";
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(qrCode);
                                    sb2.append("|");
                                    sb2.append(string2);
                                    sb2.append("|");
                                    sb2.append(string3);
                                    String strR = G.r(sb2, "|", str);
                                    if (!Intrinsics.c(strR, kkCarPassengerFragment.t) && i0.W(kkCarPassengerFragment.getActivity())) {
                                        kkCarPassengerFragment.t = strR;
                                        kkCarPassengerFragment.A(error, i.f1860b);
                                    }
                                }
                            }
                            break;
                        case 2:
                            int i12 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.z(kkCarPassengerFragment.x(), kkCarPassengerFragment.f33731o);
                            break;
                        case 3:
                            KkCarQrCodeRsp.QrCodeOrderDTO qrCodeOrderDTO = (KkCarQrCodeRsp.QrCodeOrderDTO) obj;
                            int i13 = KkCarPassengerFragment.f33729B;
                            if (qrCodeOrderDTO != null) {
                                KkCarPayResultDialog kkCarPayResultDialogTryShow = KkCarPayResultDialog.INSTANCE.tryShow(kkCarPassengerFragment.requireContext(), qrCodeOrderDTO);
                                if (kkCarPayResultDialogTryShow != null) {
                                    KkCarPassengerViewModel kkCarPassengerViewModel2 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                    if (kkCarPassengerViewModel2 != null && (orderId = qrCodeOrderDTO.getOrderId()) != null && (string = StringsKt.V(orderId).toString()) != null) {
                                        if (string.length() <= 0) {
                                            string = null;
                                        }
                                        if (string != null) {
                                            AbstractC0780y.m(V.h(kkCarPassengerViewModel2), null, null, new C0385j(string, null), 3);
                                        }
                                    }
                                    kkCarPayResultDialogTryShow.setOnDismissListener(new b(kkCarPassengerFragment, 1));
                                    kkCarPayResultDialogTryShow.show();
                                    KkCarPassengerViewModel kkCarPassengerViewModel3 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                    if (kkCarPassengerViewModel3 != null && (f16 = kkCarPassengerViewModel3.f33974g) != null) {
                                        f16.i(null);
                                    }
                                } else {
                                    KkCarPassengerViewModel kkCarPassengerViewModel4 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                    if (kkCarPassengerViewModel4 != null && (f17 = kkCarPassengerViewModel4.f33974g) != null) {
                                        f17.i(null);
                                    }
                                }
                            }
                            break;
                        case 4:
                            KkCarPayVerificationArgs kkCarPayVerificationArgs = (KkCarPayVerificationArgs) obj;
                            int i14 = KkCarPassengerFragment.f33729B;
                            if (kkCarPayVerificationArgs != null) {
                                d0 d0Var = new d0(kkCarPassengerFragment.requireContext());
                                d0Var.f27748b = kkCarPayVerificationArgs.getCheckPayReq();
                                d0Var.f27756j = true;
                                d0Var.f27749c = kkCarPayVerificationArgs.getPayByOrderResp();
                                d0Var.a();
                                KkCarPassengerViewModel kkCarPassengerViewModel5 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                if (kkCarPassengerViewModel5 != null && (f18 = kkCarPassengerViewModel5.f33975i) != null) {
                                    f18.i(null);
                                }
                            }
                            break;
                        default:
                            String str2 = (String) obj;
                            int i15 = KkCarPassengerFragment.f33729B;
                            if (str2 != null && str2.length() != 0) {
                                ToastUtils.showShort(str2, new Object[0]);
                                KkCarPassengerViewModel kkCarPassengerViewModel6 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                if (kkCarPassengerViewModel6 != null && (f19 = kkCarPassengerViewModel6.f33976j) != null) {
                                    f19.i(null);
                                }
                            }
                            break;
                    }
                    return Unit.f38893a;
                }
            }, 16));
        }
        KkCarPassengerViewModel kkCarPassengerViewModel2 = (KkCarPassengerViewModel) this.f27333i;
        if (kkCarPassengerViewModel2 != null && (f14 = kkCarPassengerViewModel2.f33973f) != null) {
            final int i10 = 1;
            f14.e(getViewLifecycleOwner(), new C0144k(new Function1(this) { // from class: Dd.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ KkCarPassengerFragment f1849b;

                {
                    this.f1849b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    KkCarQrCodeRsp.QrCodeDTO qrCodeDTO;
                    KkCarQrCodeRsp.QrCodeDTO qrCodeDTO2;
                    F f16;
                    String orderId;
                    String string;
                    F f17;
                    F f18;
                    F f19;
                    KkCarPassengerFragment kkCarPassengerFragment = this.f1849b;
                    switch (i10) {
                        case 0:
                            int i11 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.w((KkCarQrCodeRsp) obj);
                            break;
                        case 1:
                            KkCarQrCodeRsp kkCarQrCodeRsp = (KkCarQrCodeRsp) obj;
                            int i12 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.w(kkCarQrCodeRsp);
                            AuthErrorDTO error = (kkCarQrCodeRsp == null || (qrCodeDTO2 = kkCarQrCodeRsp.getQrCodeDTO()) == null) ? null : qrCodeDTO2.getError();
                            String qrCode = (kkCarQrCodeRsp == null || (qrCodeDTO = kkCarQrCodeRsp.getQrCodeDTO()) == null) ? null : qrCodeDTO.getQrCode();
                            if (error == null) {
                                kkCarPassengerFragment.t = null;
                            } else {
                                String title = error.getTitle();
                                String string2 = title != null ? StringsKt.V(title).toString() : null;
                                String desc = error.getDesc();
                                String string3 = desc != null ? StringsKt.V(desc).toString() : null;
                                if ((string2 != null && string2.length() != 0) || (string3 != null && string3.length() != 0)) {
                                    if (qrCode == null) {
                                        qrCode = "";
                                    }
                                    String jumpUrl = error.getJumpUrl();
                                    String str = jumpUrl != null ? jumpUrl : "";
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(qrCode);
                                    sb2.append("|");
                                    sb2.append(string2);
                                    sb2.append("|");
                                    sb2.append(string3);
                                    String strR = G.r(sb2, "|", str);
                                    if (!Intrinsics.c(strR, kkCarPassengerFragment.t) && i0.W(kkCarPassengerFragment.getActivity())) {
                                        kkCarPassengerFragment.t = strR;
                                        kkCarPassengerFragment.A(error, i.f1860b);
                                    }
                                }
                            }
                            break;
                        case 2:
                            int i13 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.z(kkCarPassengerFragment.x(), kkCarPassengerFragment.f33731o);
                            break;
                        case 3:
                            KkCarQrCodeRsp.QrCodeOrderDTO qrCodeOrderDTO = (KkCarQrCodeRsp.QrCodeOrderDTO) obj;
                            int i14 = KkCarPassengerFragment.f33729B;
                            if (qrCodeOrderDTO != null) {
                                KkCarPayResultDialog kkCarPayResultDialogTryShow = KkCarPayResultDialog.INSTANCE.tryShow(kkCarPassengerFragment.requireContext(), qrCodeOrderDTO);
                                if (kkCarPayResultDialogTryShow != null) {
                                    KkCarPassengerViewModel kkCarPassengerViewModel3 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                    if (kkCarPassengerViewModel3 != null && (orderId = qrCodeOrderDTO.getOrderId()) != null && (string = StringsKt.V(orderId).toString()) != null) {
                                        if (string.length() <= 0) {
                                            string = null;
                                        }
                                        if (string != null) {
                                            AbstractC0780y.m(V.h(kkCarPassengerViewModel3), null, null, new C0385j(string, null), 3);
                                        }
                                    }
                                    kkCarPayResultDialogTryShow.setOnDismissListener(new b(kkCarPassengerFragment, 1));
                                    kkCarPayResultDialogTryShow.show();
                                    KkCarPassengerViewModel kkCarPassengerViewModel4 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                    if (kkCarPassengerViewModel4 != null && (f16 = kkCarPassengerViewModel4.f33974g) != null) {
                                        f16.i(null);
                                    }
                                } else {
                                    KkCarPassengerViewModel kkCarPassengerViewModel5 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                    if (kkCarPassengerViewModel5 != null && (f17 = kkCarPassengerViewModel5.f33974g) != null) {
                                        f17.i(null);
                                    }
                                }
                            }
                            break;
                        case 4:
                            KkCarPayVerificationArgs kkCarPayVerificationArgs = (KkCarPayVerificationArgs) obj;
                            int i15 = KkCarPassengerFragment.f33729B;
                            if (kkCarPayVerificationArgs != null) {
                                d0 d0Var = new d0(kkCarPassengerFragment.requireContext());
                                d0Var.f27748b = kkCarPayVerificationArgs.getCheckPayReq();
                                d0Var.f27756j = true;
                                d0Var.f27749c = kkCarPayVerificationArgs.getPayByOrderResp();
                                d0Var.a();
                                KkCarPassengerViewModel kkCarPassengerViewModel6 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                if (kkCarPassengerViewModel6 != null && (f18 = kkCarPassengerViewModel6.f33975i) != null) {
                                    f18.i(null);
                                }
                            }
                            break;
                        default:
                            String str2 = (String) obj;
                            int i16 = KkCarPassengerFragment.f33729B;
                            if (str2 != null && str2.length() != 0) {
                                ToastUtils.showShort(str2, new Object[0]);
                                KkCarPassengerViewModel kkCarPassengerViewModel7 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                if (kkCarPassengerViewModel7 != null && (f19 = kkCarPassengerViewModel7.f33976j) != null) {
                                    f19.i(null);
                                }
                            }
                            break;
                    }
                    return Unit.f38893a;
                }
            }, 16));
        }
        KkCarPassengerViewModel kkCarPassengerViewModel3 = (KkCarPassengerViewModel) this.f27333i;
        if (kkCarPassengerViewModel3 != null && (f13 = kkCarPassengerViewModel3.f33978p) != null) {
            final int i11 = 2;
            f13.e(getViewLifecycleOwner(), new C0144k(new Function1(this) { // from class: Dd.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ KkCarPassengerFragment f1849b;

                {
                    this.f1849b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    KkCarQrCodeRsp.QrCodeDTO qrCodeDTO;
                    KkCarQrCodeRsp.QrCodeDTO qrCodeDTO2;
                    F f16;
                    String orderId;
                    String string;
                    F f17;
                    F f18;
                    F f19;
                    KkCarPassengerFragment kkCarPassengerFragment = this.f1849b;
                    switch (i11) {
                        case 0:
                            int i12 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.w((KkCarQrCodeRsp) obj);
                            break;
                        case 1:
                            KkCarQrCodeRsp kkCarQrCodeRsp = (KkCarQrCodeRsp) obj;
                            int i13 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.w(kkCarQrCodeRsp);
                            AuthErrorDTO error = (kkCarQrCodeRsp == null || (qrCodeDTO2 = kkCarQrCodeRsp.getQrCodeDTO()) == null) ? null : qrCodeDTO2.getError();
                            String qrCode = (kkCarQrCodeRsp == null || (qrCodeDTO = kkCarQrCodeRsp.getQrCodeDTO()) == null) ? null : qrCodeDTO.getQrCode();
                            if (error == null) {
                                kkCarPassengerFragment.t = null;
                            } else {
                                String title = error.getTitle();
                                String string2 = title != null ? StringsKt.V(title).toString() : null;
                                String desc = error.getDesc();
                                String string3 = desc != null ? StringsKt.V(desc).toString() : null;
                                if ((string2 != null && string2.length() != 0) || (string3 != null && string3.length() != 0)) {
                                    if (qrCode == null) {
                                        qrCode = "";
                                    }
                                    String jumpUrl = error.getJumpUrl();
                                    String str = jumpUrl != null ? jumpUrl : "";
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(qrCode);
                                    sb2.append("|");
                                    sb2.append(string2);
                                    sb2.append("|");
                                    sb2.append(string3);
                                    String strR = G.r(sb2, "|", str);
                                    if (!Intrinsics.c(strR, kkCarPassengerFragment.t) && i0.W(kkCarPassengerFragment.getActivity())) {
                                        kkCarPassengerFragment.t = strR;
                                        kkCarPassengerFragment.A(error, i.f1860b);
                                    }
                                }
                            }
                            break;
                        case 2:
                            int i14 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.z(kkCarPassengerFragment.x(), kkCarPassengerFragment.f33731o);
                            break;
                        case 3:
                            KkCarQrCodeRsp.QrCodeOrderDTO qrCodeOrderDTO = (KkCarQrCodeRsp.QrCodeOrderDTO) obj;
                            int i15 = KkCarPassengerFragment.f33729B;
                            if (qrCodeOrderDTO != null) {
                                KkCarPayResultDialog kkCarPayResultDialogTryShow = KkCarPayResultDialog.INSTANCE.tryShow(kkCarPassengerFragment.requireContext(), qrCodeOrderDTO);
                                if (kkCarPayResultDialogTryShow != null) {
                                    KkCarPassengerViewModel kkCarPassengerViewModel4 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                    if (kkCarPassengerViewModel4 != null && (orderId = qrCodeOrderDTO.getOrderId()) != null && (string = StringsKt.V(orderId).toString()) != null) {
                                        if (string.length() <= 0) {
                                            string = null;
                                        }
                                        if (string != null) {
                                            AbstractC0780y.m(V.h(kkCarPassengerViewModel4), null, null, new C0385j(string, null), 3);
                                        }
                                    }
                                    kkCarPayResultDialogTryShow.setOnDismissListener(new b(kkCarPassengerFragment, 1));
                                    kkCarPayResultDialogTryShow.show();
                                    KkCarPassengerViewModel kkCarPassengerViewModel5 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                    if (kkCarPassengerViewModel5 != null && (f16 = kkCarPassengerViewModel5.f33974g) != null) {
                                        f16.i(null);
                                    }
                                } else {
                                    KkCarPassengerViewModel kkCarPassengerViewModel6 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                    if (kkCarPassengerViewModel6 != null && (f17 = kkCarPassengerViewModel6.f33974g) != null) {
                                        f17.i(null);
                                    }
                                }
                            }
                            break;
                        case 4:
                            KkCarPayVerificationArgs kkCarPayVerificationArgs = (KkCarPayVerificationArgs) obj;
                            int i16 = KkCarPassengerFragment.f33729B;
                            if (kkCarPayVerificationArgs != null) {
                                d0 d0Var = new d0(kkCarPassengerFragment.requireContext());
                                d0Var.f27748b = kkCarPayVerificationArgs.getCheckPayReq();
                                d0Var.f27756j = true;
                                d0Var.f27749c = kkCarPayVerificationArgs.getPayByOrderResp();
                                d0Var.a();
                                KkCarPassengerViewModel kkCarPassengerViewModel7 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                if (kkCarPassengerViewModel7 != null && (f18 = kkCarPassengerViewModel7.f33975i) != null) {
                                    f18.i(null);
                                }
                            }
                            break;
                        default:
                            String str2 = (String) obj;
                            int i17 = KkCarPassengerFragment.f33729B;
                            if (str2 != null && str2.length() != 0) {
                                ToastUtils.showShort(str2, new Object[0]);
                                KkCarPassengerViewModel kkCarPassengerViewModel8 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                if (kkCarPassengerViewModel8 != null && (f19 = kkCarPassengerViewModel8.f33976j) != null) {
                                    f19.i(null);
                                }
                            }
                            break;
                    }
                    return Unit.f38893a;
                }
            }, 16));
        }
        KkCarPassengerViewModel kkCarPassengerViewModel4 = (KkCarPassengerViewModel) this.f27333i;
        if (kkCarPassengerViewModel4 != null && (f12 = kkCarPassengerViewModel4.f33974g) != null) {
            final int i12 = 3;
            f12.e(getViewLifecycleOwner(), new C0144k(new Function1(this) { // from class: Dd.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ KkCarPassengerFragment f1849b;

                {
                    this.f1849b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    KkCarQrCodeRsp.QrCodeDTO qrCodeDTO;
                    KkCarQrCodeRsp.QrCodeDTO qrCodeDTO2;
                    F f16;
                    String orderId;
                    String string;
                    F f17;
                    F f18;
                    F f19;
                    KkCarPassengerFragment kkCarPassengerFragment = this.f1849b;
                    switch (i12) {
                        case 0:
                            int i13 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.w((KkCarQrCodeRsp) obj);
                            break;
                        case 1:
                            KkCarQrCodeRsp kkCarQrCodeRsp = (KkCarQrCodeRsp) obj;
                            int i14 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.w(kkCarQrCodeRsp);
                            AuthErrorDTO error = (kkCarQrCodeRsp == null || (qrCodeDTO2 = kkCarQrCodeRsp.getQrCodeDTO()) == null) ? null : qrCodeDTO2.getError();
                            String qrCode = (kkCarQrCodeRsp == null || (qrCodeDTO = kkCarQrCodeRsp.getQrCodeDTO()) == null) ? null : qrCodeDTO.getQrCode();
                            if (error == null) {
                                kkCarPassengerFragment.t = null;
                            } else {
                                String title = error.getTitle();
                                String string2 = title != null ? StringsKt.V(title).toString() : null;
                                String desc = error.getDesc();
                                String string3 = desc != null ? StringsKt.V(desc).toString() : null;
                                if ((string2 != null && string2.length() != 0) || (string3 != null && string3.length() != 0)) {
                                    if (qrCode == null) {
                                        qrCode = "";
                                    }
                                    String jumpUrl = error.getJumpUrl();
                                    String str = jumpUrl != null ? jumpUrl : "";
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(qrCode);
                                    sb2.append("|");
                                    sb2.append(string2);
                                    sb2.append("|");
                                    sb2.append(string3);
                                    String strR = G.r(sb2, "|", str);
                                    if (!Intrinsics.c(strR, kkCarPassengerFragment.t) && i0.W(kkCarPassengerFragment.getActivity())) {
                                        kkCarPassengerFragment.t = strR;
                                        kkCarPassengerFragment.A(error, i.f1860b);
                                    }
                                }
                            }
                            break;
                        case 2:
                            int i15 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.z(kkCarPassengerFragment.x(), kkCarPassengerFragment.f33731o);
                            break;
                        case 3:
                            KkCarQrCodeRsp.QrCodeOrderDTO qrCodeOrderDTO = (KkCarQrCodeRsp.QrCodeOrderDTO) obj;
                            int i16 = KkCarPassengerFragment.f33729B;
                            if (qrCodeOrderDTO != null) {
                                KkCarPayResultDialog kkCarPayResultDialogTryShow = KkCarPayResultDialog.INSTANCE.tryShow(kkCarPassengerFragment.requireContext(), qrCodeOrderDTO);
                                if (kkCarPayResultDialogTryShow != null) {
                                    KkCarPassengerViewModel kkCarPassengerViewModel5 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                    if (kkCarPassengerViewModel5 != null && (orderId = qrCodeOrderDTO.getOrderId()) != null && (string = StringsKt.V(orderId).toString()) != null) {
                                        if (string.length() <= 0) {
                                            string = null;
                                        }
                                        if (string != null) {
                                            AbstractC0780y.m(V.h(kkCarPassengerViewModel5), null, null, new C0385j(string, null), 3);
                                        }
                                    }
                                    kkCarPayResultDialogTryShow.setOnDismissListener(new b(kkCarPassengerFragment, 1));
                                    kkCarPayResultDialogTryShow.show();
                                    KkCarPassengerViewModel kkCarPassengerViewModel6 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                    if (kkCarPassengerViewModel6 != null && (f16 = kkCarPassengerViewModel6.f33974g) != null) {
                                        f16.i(null);
                                    }
                                } else {
                                    KkCarPassengerViewModel kkCarPassengerViewModel7 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                    if (kkCarPassengerViewModel7 != null && (f17 = kkCarPassengerViewModel7.f33974g) != null) {
                                        f17.i(null);
                                    }
                                }
                            }
                            break;
                        case 4:
                            KkCarPayVerificationArgs kkCarPayVerificationArgs = (KkCarPayVerificationArgs) obj;
                            int i17 = KkCarPassengerFragment.f33729B;
                            if (kkCarPayVerificationArgs != null) {
                                d0 d0Var = new d0(kkCarPassengerFragment.requireContext());
                                d0Var.f27748b = kkCarPayVerificationArgs.getCheckPayReq();
                                d0Var.f27756j = true;
                                d0Var.f27749c = kkCarPayVerificationArgs.getPayByOrderResp();
                                d0Var.a();
                                KkCarPassengerViewModel kkCarPassengerViewModel8 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                if (kkCarPassengerViewModel8 != null && (f18 = kkCarPassengerViewModel8.f33975i) != null) {
                                    f18.i(null);
                                }
                            }
                            break;
                        default:
                            String str2 = (String) obj;
                            int i18 = KkCarPassengerFragment.f33729B;
                            if (str2 != null && str2.length() != 0) {
                                ToastUtils.showShort(str2, new Object[0]);
                                KkCarPassengerViewModel kkCarPassengerViewModel9 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                if (kkCarPassengerViewModel9 != null && (f19 = kkCarPassengerViewModel9.f33976j) != null) {
                                    f19.i(null);
                                }
                            }
                            break;
                    }
                    return Unit.f38893a;
                }
            }, 16));
        }
        KkCarPassengerViewModel kkCarPassengerViewModel5 = (KkCarPassengerViewModel) this.f27333i;
        if (kkCarPassengerViewModel5 != null && (f11 = kkCarPassengerViewModel5.f33975i) != null) {
            final int i13 = 4;
            f11.e(getViewLifecycleOwner(), new C0144k(new Function1(this) { // from class: Dd.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ KkCarPassengerFragment f1849b;

                {
                    this.f1849b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    KkCarQrCodeRsp.QrCodeDTO qrCodeDTO;
                    KkCarQrCodeRsp.QrCodeDTO qrCodeDTO2;
                    F f16;
                    String orderId;
                    String string;
                    F f17;
                    F f18;
                    F f19;
                    KkCarPassengerFragment kkCarPassengerFragment = this.f1849b;
                    switch (i13) {
                        case 0:
                            int i14 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.w((KkCarQrCodeRsp) obj);
                            break;
                        case 1:
                            KkCarQrCodeRsp kkCarQrCodeRsp = (KkCarQrCodeRsp) obj;
                            int i15 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.w(kkCarQrCodeRsp);
                            AuthErrorDTO error = (kkCarQrCodeRsp == null || (qrCodeDTO2 = kkCarQrCodeRsp.getQrCodeDTO()) == null) ? null : qrCodeDTO2.getError();
                            String qrCode = (kkCarQrCodeRsp == null || (qrCodeDTO = kkCarQrCodeRsp.getQrCodeDTO()) == null) ? null : qrCodeDTO.getQrCode();
                            if (error == null) {
                                kkCarPassengerFragment.t = null;
                            } else {
                                String title = error.getTitle();
                                String string2 = title != null ? StringsKt.V(title).toString() : null;
                                String desc = error.getDesc();
                                String string3 = desc != null ? StringsKt.V(desc).toString() : null;
                                if ((string2 != null && string2.length() != 0) || (string3 != null && string3.length() != 0)) {
                                    if (qrCode == null) {
                                        qrCode = "";
                                    }
                                    String jumpUrl = error.getJumpUrl();
                                    String str = jumpUrl != null ? jumpUrl : "";
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(qrCode);
                                    sb2.append("|");
                                    sb2.append(string2);
                                    sb2.append("|");
                                    sb2.append(string3);
                                    String strR = G.r(sb2, "|", str);
                                    if (!Intrinsics.c(strR, kkCarPassengerFragment.t) && i0.W(kkCarPassengerFragment.getActivity())) {
                                        kkCarPassengerFragment.t = strR;
                                        kkCarPassengerFragment.A(error, i.f1860b);
                                    }
                                }
                            }
                            break;
                        case 2:
                            int i16 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.z(kkCarPassengerFragment.x(), kkCarPassengerFragment.f33731o);
                            break;
                        case 3:
                            KkCarQrCodeRsp.QrCodeOrderDTO qrCodeOrderDTO = (KkCarQrCodeRsp.QrCodeOrderDTO) obj;
                            int i17 = KkCarPassengerFragment.f33729B;
                            if (qrCodeOrderDTO != null) {
                                KkCarPayResultDialog kkCarPayResultDialogTryShow = KkCarPayResultDialog.INSTANCE.tryShow(kkCarPassengerFragment.requireContext(), qrCodeOrderDTO);
                                if (kkCarPayResultDialogTryShow != null) {
                                    KkCarPassengerViewModel kkCarPassengerViewModel6 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                    if (kkCarPassengerViewModel6 != null && (orderId = qrCodeOrderDTO.getOrderId()) != null && (string = StringsKt.V(orderId).toString()) != null) {
                                        if (string.length() <= 0) {
                                            string = null;
                                        }
                                        if (string != null) {
                                            AbstractC0780y.m(V.h(kkCarPassengerViewModel6), null, null, new C0385j(string, null), 3);
                                        }
                                    }
                                    kkCarPayResultDialogTryShow.setOnDismissListener(new b(kkCarPassengerFragment, 1));
                                    kkCarPayResultDialogTryShow.show();
                                    KkCarPassengerViewModel kkCarPassengerViewModel7 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                    if (kkCarPassengerViewModel7 != null && (f16 = kkCarPassengerViewModel7.f33974g) != null) {
                                        f16.i(null);
                                    }
                                } else {
                                    KkCarPassengerViewModel kkCarPassengerViewModel8 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                    if (kkCarPassengerViewModel8 != null && (f17 = kkCarPassengerViewModel8.f33974g) != null) {
                                        f17.i(null);
                                    }
                                }
                            }
                            break;
                        case 4:
                            KkCarPayVerificationArgs kkCarPayVerificationArgs = (KkCarPayVerificationArgs) obj;
                            int i18 = KkCarPassengerFragment.f33729B;
                            if (kkCarPayVerificationArgs != null) {
                                d0 d0Var = new d0(kkCarPassengerFragment.requireContext());
                                d0Var.f27748b = kkCarPayVerificationArgs.getCheckPayReq();
                                d0Var.f27756j = true;
                                d0Var.f27749c = kkCarPayVerificationArgs.getPayByOrderResp();
                                d0Var.a();
                                KkCarPassengerViewModel kkCarPassengerViewModel9 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                if (kkCarPassengerViewModel9 != null && (f18 = kkCarPassengerViewModel9.f33975i) != null) {
                                    f18.i(null);
                                }
                            }
                            break;
                        default:
                            String str2 = (String) obj;
                            int i19 = KkCarPassengerFragment.f33729B;
                            if (str2 != null && str2.length() != 0) {
                                ToastUtils.showShort(str2, new Object[0]);
                                KkCarPassengerViewModel kkCarPassengerViewModel10 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                if (kkCarPassengerViewModel10 != null && (f19 = kkCarPassengerViewModel10.f33976j) != null) {
                                    f19.i(null);
                                }
                            }
                            break;
                    }
                    return Unit.f38893a;
                }
            }, 16));
        }
        KkCarPassengerViewModel kkCarPassengerViewModel6 = (KkCarPassengerViewModel) this.f27333i;
        if (kkCarPassengerViewModel6 != null && (f10 = kkCarPassengerViewModel6.f33976j) != null) {
            final int i14 = 5;
            f10.e(getViewLifecycleOwner(), new C0144k(new Function1(this) { // from class: Dd.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ KkCarPassengerFragment f1849b;

                {
                    this.f1849b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    KkCarQrCodeRsp.QrCodeDTO qrCodeDTO;
                    KkCarQrCodeRsp.QrCodeDTO qrCodeDTO2;
                    F f16;
                    String orderId;
                    String string;
                    F f17;
                    F f18;
                    F f19;
                    KkCarPassengerFragment kkCarPassengerFragment = this.f1849b;
                    switch (i14) {
                        case 0:
                            int i15 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.w((KkCarQrCodeRsp) obj);
                            break;
                        case 1:
                            KkCarQrCodeRsp kkCarQrCodeRsp = (KkCarQrCodeRsp) obj;
                            int i16 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.w(kkCarQrCodeRsp);
                            AuthErrorDTO error = (kkCarQrCodeRsp == null || (qrCodeDTO2 = kkCarQrCodeRsp.getQrCodeDTO()) == null) ? null : qrCodeDTO2.getError();
                            String qrCode = (kkCarQrCodeRsp == null || (qrCodeDTO = kkCarQrCodeRsp.getQrCodeDTO()) == null) ? null : qrCodeDTO.getQrCode();
                            if (error == null) {
                                kkCarPassengerFragment.t = null;
                            } else {
                                String title = error.getTitle();
                                String string2 = title != null ? StringsKt.V(title).toString() : null;
                                String desc = error.getDesc();
                                String string3 = desc != null ? StringsKt.V(desc).toString() : null;
                                if ((string2 != null && string2.length() != 0) || (string3 != null && string3.length() != 0)) {
                                    if (qrCode == null) {
                                        qrCode = "";
                                    }
                                    String jumpUrl = error.getJumpUrl();
                                    String str = jumpUrl != null ? jumpUrl : "";
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(qrCode);
                                    sb2.append("|");
                                    sb2.append(string2);
                                    sb2.append("|");
                                    sb2.append(string3);
                                    String strR = G.r(sb2, "|", str);
                                    if (!Intrinsics.c(strR, kkCarPassengerFragment.t) && i0.W(kkCarPassengerFragment.getActivity())) {
                                        kkCarPassengerFragment.t = strR;
                                        kkCarPassengerFragment.A(error, i.f1860b);
                                    }
                                }
                            }
                            break;
                        case 2:
                            int i17 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.z(kkCarPassengerFragment.x(), kkCarPassengerFragment.f33731o);
                            break;
                        case 3:
                            KkCarQrCodeRsp.QrCodeOrderDTO qrCodeOrderDTO = (KkCarQrCodeRsp.QrCodeOrderDTO) obj;
                            int i18 = KkCarPassengerFragment.f33729B;
                            if (qrCodeOrderDTO != null) {
                                KkCarPayResultDialog kkCarPayResultDialogTryShow = KkCarPayResultDialog.INSTANCE.tryShow(kkCarPassengerFragment.requireContext(), qrCodeOrderDTO);
                                if (kkCarPayResultDialogTryShow != null) {
                                    KkCarPassengerViewModel kkCarPassengerViewModel7 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                    if (kkCarPassengerViewModel7 != null && (orderId = qrCodeOrderDTO.getOrderId()) != null && (string = StringsKt.V(orderId).toString()) != null) {
                                        if (string.length() <= 0) {
                                            string = null;
                                        }
                                        if (string != null) {
                                            AbstractC0780y.m(V.h(kkCarPassengerViewModel7), null, null, new C0385j(string, null), 3);
                                        }
                                    }
                                    kkCarPayResultDialogTryShow.setOnDismissListener(new b(kkCarPassengerFragment, 1));
                                    kkCarPayResultDialogTryShow.show();
                                    KkCarPassengerViewModel kkCarPassengerViewModel8 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                    if (kkCarPassengerViewModel8 != null && (f16 = kkCarPassengerViewModel8.f33974g) != null) {
                                        f16.i(null);
                                    }
                                } else {
                                    KkCarPassengerViewModel kkCarPassengerViewModel9 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                    if (kkCarPassengerViewModel9 != null && (f17 = kkCarPassengerViewModel9.f33974g) != null) {
                                        f17.i(null);
                                    }
                                }
                            }
                            break;
                        case 4:
                            KkCarPayVerificationArgs kkCarPayVerificationArgs = (KkCarPayVerificationArgs) obj;
                            int i19 = KkCarPassengerFragment.f33729B;
                            if (kkCarPayVerificationArgs != null) {
                                d0 d0Var = new d0(kkCarPassengerFragment.requireContext());
                                d0Var.f27748b = kkCarPayVerificationArgs.getCheckPayReq();
                                d0Var.f27756j = true;
                                d0Var.f27749c = kkCarPayVerificationArgs.getPayByOrderResp();
                                d0Var.a();
                                KkCarPassengerViewModel kkCarPassengerViewModel10 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                if (kkCarPassengerViewModel10 != null && (f18 = kkCarPassengerViewModel10.f33975i) != null) {
                                    f18.i(null);
                                }
                            }
                            break;
                        default:
                            String str2 = (String) obj;
                            int i110 = KkCarPassengerFragment.f33729B;
                            if (str2 != null && str2.length() != 0) {
                                ToastUtils.showShort(str2, new Object[0]);
                                KkCarPassengerViewModel kkCarPassengerViewModel11 = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                                if (kkCarPassengerViewModel11 != null && (f19 = kkCarPassengerViewModel11.f33976j) != null) {
                                    f19.i(null);
                                }
                            }
                            break;
                    }
                    return Unit.f38893a;
                }
            }, 16));
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        KkCarPassengerViewModel kkCarPassengerViewModel7 = (KkCarPassengerViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar = kkCarPassengerViewModel7 != null ? kkCarPassengerViewModel7.t : null;
        if (lVar != null) {
            lVar.e(viewLifecycleOwner, new C0144k(new j(this, 0), 15));
        }
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        com.transsnet.palmpay.core.base.l lVar2 = ((KkCarHostViewModel) this.f33730A.getValue()).f33969f;
        if (lVar2 != null) {
            lVar2.e(viewLifecycleOwner2, new C0144k(new j(this, 1), 15));
        }
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        KkCarPassengerViewModel kkCarPassengerViewModel8 = (KkCarPassengerViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar3 = kkCarPassengerViewModel8 != null ? kkCarPassengerViewModel8.f33977o : null;
        if (lVar3 == null) {
            return 0;
        }
        lVar3.e(viewLifecycleOwner3, new C0144k(new j(this, 2), 15));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        KkCarPassengerViewModel kkCarPassengerViewModel;
        KkCarQrCodeRsp snapshot = y();
        if (snapshot != null && (kkCarPassengerViewModel = (KkCarPassengerViewModel) this.f27333i) != null) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            KkCarQrCodeRsp.QrCodeDTO qrCodeDTO = snapshot.getQrCodeDTO();
            kkCarPassengerViewModel.f33980w = qrCodeDTO != null ? qrCodeDTO.getQrCode() : null;
            kkCarPassengerViewModel.f33972e.k(snapshot);
        }
        int authStatus = KkCarPassengerAuthStore.INSTANCE.readAuthStatus();
        if (authStatus == 1 || authStatus == 2) {
            v(authStatus);
        } else {
            z(x(), this.f33731o);
        }
        KkCarPassengerViewModel kkCarPassengerViewModel2 = (KkCarPassengerViewModel) this.f27333i;
        if (kkCarPassengerViewModel2 != null) {
            int i7 = KkCarPassengerViewModel.f33971A;
            kkCarPassengerViewModel2.f(false);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        TextView rightTextView;
        super.o();
        u uVar = (u) this.f27335j;
        if (uVar != null) {
            PpTitleBar ppTitleBar = uVar.f40517g;
            ImageView backImageView = ppTitleBar.getBackImageView();
            if (backImageView != null) {
                final int i7 = 0;
                backImageView.setOnClickListener(new View.OnClickListener(this) { // from class: Dd.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ KkCarPassengerFragment f1851b;

                    {
                        this.f1851b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        KkCarPassengerFragment kkCarPassengerFragment = this.f1851b;
                        switch (i7) {
                            case 0:
                                int i10 = KkCarPassengerFragment.f33729B;
                                kkCarPassengerFragment.requireActivity().onBackPressed();
                                break;
                            default:
                                int i11 = KkCarPassengerFragment.f33729B;
                                if (!r0.U0() && kkCarPassengerFragment.f33732p) {
                                    n0.g().k((ClickEvent) G.f("keke_tab_click_switch_driver", "app", "native"));
                                    i0.c0(com.transsnet.palmpay.core.config.d.g("/kk-car-driver/kk-driver/home?nLoad=true"));
                                }
                                break;
                        }
                    }
                });
            }
            TextView rightTextView2 = ppTitleBar.getRightTextView();
            if (rightTextView2 != null) {
                rightTextView2.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextBase, requireContext()));
            }
            final int i10 = 1;
            ppTitleBar.setRightTextViewClickListener(new View.OnClickListener(this) { // from class: Dd.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ KkCarPassengerFragment f1851b;

                {
                    this.f1851b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KkCarPassengerFragment kkCarPassengerFragment = this.f1851b;
                    switch (i10) {
                        case 0:
                            int i11 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.requireActivity().onBackPressed();
                            break;
                        default:
                            int i12 = KkCarPassengerFragment.f33729B;
                            if (!r0.U0() && kkCarPassengerFragment.f33732p) {
                                n0.g().k((ClickEvent) G.f("keke_tab_click_switch_driver", "app", "native"));
                                i0.c0(com.transsnet.palmpay.core.config.d.g("/kk-car-driver/kk-driver/home?nLoad=true"));
                            }
                            break;
                    }
                }
            });
        }
        u uVar2 = (u) this.f27335j;
        if (uVar2 != null) {
            ImageView imageView = uVar2.f40513c;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            imageView.setImageDrawable(G8.a.x(contextRequireContext, S6.a.pay_TransactionHistory, null, Integer.valueOf(b.ppColorTextPrimary), 28.0f, 114));
        }
        u uVar3 = (u) this.f27335j;
        if (uVar3 != null) {
            ImageView imageView2 = uVar3.f40514d;
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            imageView2.setImageDrawable(G8.a.x(contextRequireContext2, S6.a.pay_Setup, null, Integer.valueOf(b.ppColorTextPrimary), 28.0f, 114));
        }
        u uVar4 = (u) this.f27335j;
        if (uVar4 != null) {
            uVar4.f40515e.setOnClickListener(new ViewOnClickListenerC0053e(7));
        }
        u uVar5 = (u) this.f27335j;
        if (uVar5 != null) {
            uVar5.f40516f.setOnClickListener(new ViewOnClickListenerC0053e(8));
        }
        u uVar6 = (u) this.f27335j;
        if (uVar6 != null) {
            uVar6.f40518i.setOnTapToRefreshListener(new h(this, 1));
        }
        u uVar7 = (u) this.f27335j;
        if (uVar7 != null) {
            uVar7.f40518i.setOnEnableClickListener(new h(this, 2));
        }
        u uVar8 = (u) this.f27335j;
        if (uVar8 != null && (rightTextView = uVar8.f40517g.getRightTextView()) != null) {
            p220oa.h.s(rightTextView, this.f33732p);
        }
        u uVar9 = (u) this.f27335j;
        if (uVar9 != null) {
            n0.g().u(new ViewEvent("keke_qr_page_show").add("app", "native").add("qr_status", String.valueOf(this.f33731o)).add("has_switch_entry", String.valueOf(this.f33732p)).add("offer_show", String.valueOf(((LinearLayout) uVar9.f40518i.f33949a.f742j).getVisibility() == 0)));
        }
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        String stringExtra;
        KkCarPassengerViewModel kkCarPassengerViewModel;
        super.onActivityResult(i7, i10, intent);
        if (i10 != -1 || intent == null || (stringExtra = intent.getStringExtra("extra_data")) == null || i7 != 1002 || (kkCarPassengerViewModel = (KkCarPassengerViewModel) this.f27333i) == null) {
            return;
        }
        f.s(kkCarPassengerViewModel, new C0391l(stringExtra, kkCarPassengerViewModel, null), kkCarPassengerViewModel.t, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (org.greenrobot.eventbus.c.b().e(this)) {
            return;
        }
        org.greenrobot.eventbus.c.b().j(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (org.greenrobot.eventbus.c.b().e(this)) {
            org.greenrobot.eventbus.c.b().l(this);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        E activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE);
        }
        u(false);
        super.onPause();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable MessageEvent messageEvent) {
        if (messageEvent == null) {
            return;
        }
        int eventType = messageEvent.getEventType();
        if (eventType == 343) {
            KkCarPassengerViewModel kkCarPassengerViewModel = (KkCarPassengerViewModel) this.f27333i;
            if (kkCarPassengerViewModel != null) {
                kkCarPassengerViewModel.f(true);
                return;
            }
            return;
        }
        if (eventType != 90001) {
            return;
        }
        F6.d.h("SendEventBridgeDataBean", 3, "onReceivePushMessage EVENT_CONTENT_REFRESH_KEKE_CODE_STATUS");
        KkCarPassengerViewModel kkCarPassengerViewModel2 = (KkCarPassengerViewModel) this.f27333i;
        if (kkCarPassengerViewModel2 != null) {
            f.s(kkCarPassengerViewModel2, new C0388k(1, null), kkCarPassengerViewModel2.f33977o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        KkCarPassengerViewModel kkCarPassengerViewModel3 = (KkCarPassengerViewModel) this.f27333i;
        if (kkCarPassengerViewModel3 != null) {
            kkCarPassengerViewModel3.f(true);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        KkCarPassengerViewModel kkCarPassengerViewModel;
        Window window;
        super.onResume();
        E activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        }
        u(this.f33731o == 1);
        if (this.f33731o != 1 || (kkCarPassengerViewModel = (KkCarPassengerViewModel) this.f27333i) == null) {
            return;
        }
        KkCarPassengerViewModel.e(kkCarPassengerViewModel);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        KkCarPassengerViewModel kkCarPassengerViewModel;
        super.onStart();
        if (this.f33731o != 1 || (kkCarPassengerViewModel = (KkCarPassengerViewModel) this.f27333i) == null) {
            return;
        }
        KkCarPassengerViewModel.e(kkCarPassengerViewModel);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        KkCarPassengerViewModel kkCarPassengerViewModel = (KkCarPassengerViewModel) this.f27333i;
        if (kkCarPassengerViewModel != null) {
            t0 t0Var = kkCarPassengerViewModel.f33979v;
            if (t0Var != null) {
                t0Var.cancel((CancellationException) null);
            }
            kkCarPassengerViewModel.f33979v = null;
        }
        super.onStop();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(p159kd.f.sm_kk_fragment_passenger, viewGroup, false);
        int i7 = e.adKkQuickActionsBottom;
        if (((SingleAdView) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = e.adKkQuickActionsTop;
            if (((SingleAdView) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = e.flKkQuickActionsCard;
                FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewInflate);
                if (frameLayout != null && (viewM = p059e1.a.m((i7 = e.includeCvLoginRegisterBottom), viewInflate)) != null) {
                    Pb.a.bind(viewM);
                    i7 = e.ivKkQrHistoryIcon;
                    ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                    if (imageView != null) {
                        i7 = e.ivKkQrSettingsIcon;
                        ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                        if (imageView2 != null) {
                            i7 = e.llKkQrHistory;
                            LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                            if (linearLayout != null) {
                                i7 = e.llKkQrSettings;
                                LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                if (linearLayout2 != null) {
                                    i7 = e.svKkPassengerContent;
                                    if (((NestedScrollView) p059e1.a.m(i7, viewInflate)) != null) {
                                        i7 = e.titleBarKkPassenger;
                                        PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                        if (ppTitleBar != null) {
                                            i7 = e.viewKkQr;
                                            KkCarQrView kkCarQrView = (KkCarQrView) p059e1.a.m(i7, viewInflate);
                                            if (kkCarQrView != null) {
                                                u uVar = new u((ConstraintLayout) viewInflate, frameLayout, imageView, imageView2, linearLayout, linearLayout2, ppTitleBar, kkCarQrView);
                                                Intrinsics.checkNotNullExpressionValue(uVar, "inflate(...)");
                                                return uVar;
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

    public final void u(boolean z3) {
        Window window;
        E activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = z3 ? 1.0f : -1.0f;
        window.setAttributes(attributes);
    }

    public final void v(int i7) {
        KkCarQrCodeRsp snapshot;
        KkCarPassengerViewModel kkCarPassengerViewModel;
        this.f33731o = i7;
        if (i7 == 1 && (snapshot = y()) != null && (kkCarPassengerViewModel = (KkCarPassengerViewModel) this.f27333i) != null) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            KkCarQrCodeRsp.QrCodeDTO qrCodeDTO = snapshot.getQrCodeDTO();
            kkCarPassengerViewModel.f33980w = qrCodeDTO != null ? qrCodeDTO.getQrCode() : null;
            kkCarPassengerViewModel.f33972e.k(snapshot);
        }
        z(x(), i7);
        if (i7 == 1) {
            KkCarPassengerViewModel kkCarPassengerViewModel2 = (KkCarPassengerViewModel) this.f27333i;
            if (kkCarPassengerViewModel2 != null) {
                KkCarPassengerViewModel.e(kkCarPassengerViewModel2);
            }
            u(true);
            return;
        }
        KkCarPassengerViewModel kkCarPassengerViewModel3 = (KkCarPassengerViewModel) this.f27333i;
        if (kkCarPassengerViewModel3 != null) {
            t0 t0Var = kkCarPassengerViewModel3.f33979v;
            if (t0Var != null) {
                t0Var.cancel((CancellationException) null);
            }
            kkCarPassengerViewModel3.f33979v = null;
        }
        u(false);
    }

    public final void w(KkCarQrCodeRsp kkCarQrCodeRsp) {
        int authStatus = KkCarPassengerAuthStore.INSTANCE.readAuthStatus();
        if (authStatus != 1 && authStatus != 2) {
            z(kkCarQrCodeRsp, this.f33731o);
        } else if (this.f33731o != authStatus) {
            v(authStatus);
        } else {
            z(kkCarQrCodeRsp, authStatus);
        }
    }

    public final KkCarQrCodeRsp x() {
        F f10;
        F f11;
        KkCarQrCodeRsp kkCarQrCodeRsp;
        KkCarPassengerViewModel kkCarPassengerViewModel = (KkCarPassengerViewModel) this.f27333i;
        if (kkCarPassengerViewModel != null && (f11 = kkCarPassengerViewModel.f33973f) != null && (kkCarQrCodeRsp = (KkCarQrCodeRsp) f11.d()) != null) {
            return kkCarQrCodeRsp;
        }
        KkCarPassengerViewModel kkCarPassengerViewModel2 = (KkCarPassengerViewModel) this.f27333i;
        if (kkCarPassengerViewModel2 == null || (f10 = kkCarPassengerViewModel2.f33972e) == null) {
            return null;
        }
        return (KkCarQrCodeRsp) f10.d();
    }

    public final void z(KkCarQrCodeRsp kkCarQrCodeRsp, int i7) {
        F f10;
        u uVar = (u) this.f27335j;
        if (uVar != null) {
            KkCarQrView kkCarQrView = uVar.f40518i;
            KkCarPassengerViewModel kkCarPassengerViewModel = (KkCarPassengerViewModel) this.f27333i;
            boolean zC = (kkCarPassengerViewModel == null || (f10 = kkCarPassengerViewModel.f33978p) == null) ? false : Intrinsics.c(f10.d(), Boolean.TRUE);
            kkCarQrView.f33952d = i7;
            kkCarQrView.f33955g = zC;
            KkCarQrCodeRsp.QrCodeDTO qrCodeDTO = (i7 != 1 || kkCarQrCodeRsp == null) ? null : kkCarQrCodeRsp.getQrCodeDTO();
            kkCarQrView.f33956i = qrCodeDTO;
            Bc.j jVar = kkCarQrView.f33949a;
            if (i7 == 2) {
                p pVar = kkCarQrView.f33957j;
                if (pVar == null) {
                    View viewInflate = ((ViewStub) jVar.f744p).inflate();
                    int i10 = e.btnKkQrEnable;
                    PpButton ppButton = (PpButton) p059e1.a.m(i10, viewInflate);
                    if (ppButton != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        int i11 = e.flKkQrFrozenIllustrationBg;
                        FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i11, viewInflate);
                        if (frameLayout != null) {
                            i11 = e.ivKkQrFrozenIllustration;
                            ImageView imageView = (ImageView) p059e1.a.m(i11, viewInflate);
                            if (imageView != null) {
                                pVar = new p(constraintLayout, ppButton, frameLayout, imageView);
                                Intrinsics.checkNotNullExpressionValue(pVar, "bind(...)");
                                ppButton.setOnClickListener(new Hd.a(kkCarQrView, 0));
                                kkCarQrView.f33957j = pVar;
                            }
                        }
                        i10 = i11;
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
                }
                ConstraintLayout flKkQrCard = (ConstraintLayout) jVar.f735b;
                Intrinsics.checkNotNullExpressionValue(flKkQrCard, "flKkQrCard");
                p220oa.h.s(flKkQrCard, true);
                ((TextView) jVar.f732B).setText(p159kd.h.sm_kk_paused_title);
                TextView tvKkQrDesc = (TextView) jVar.f733C;
                Intrinsics.checkNotNullExpressionValue(tvKkQrDesc, "tvKkQrDesc");
                p220oa.h.s(tvKkQrDesc, true);
                FrameLayout flKkQrContainer = (FrameLayout) jVar.f738e;
                Intrinsics.checkNotNullExpressionValue(flKkQrContainer, "flKkQrContainer");
                p220oa.h.c(flKkQrContainer);
                TextView tvKkQrHint = (TextView) jVar.t;
                Intrinsics.checkNotNullExpressionValue(tvKkQrHint, "tvKkQrHint");
                p220oa.h.c(tvKkQrHint);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) pVar.f811b;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
                p220oa.h.s(constraintLayout2, true);
                r0.l1("https://static.chuanyinet.com/images/icon_kk_reopen1ae91014-02fb-49.png", (ImageView) pVar.f813d);
            } else {
                p pVar2 = kkCarQrView.f33957j;
                if (pVar2 != null) {
                    ImageView imageView2 = (ImageView) pVar2.f813d;
                    com.bumptech.glide.p pVarF = com.bumptech.glide.b.f(imageView2);
                    pVarF.getClass();
                    pVarF.e(new n(imageView2));
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) pVar2.f811b;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout3, "getRoot(...)");
                    p220oa.h.c(constraintLayout3);
                }
                TextView tvKkQrDesc2 = (TextView) jVar.f733C;
                Intrinsics.checkNotNullExpressionValue(tvKkQrDesc2, "tvKkQrDesc");
                p220oa.h.c(tvKkQrDesc2);
                String string = kkCarQrView.f33953e;
                if (string == null) {
                    string = kkCarQrView.getContext().getString(p159kd.h.sm_kk_qr_title);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                }
                ((TextView) jVar.f732B).setText(string);
                ConstraintLayout flKkQrCard2 = (ConstraintLayout) jVar.f735b;
                Intrinsics.checkNotNullExpressionValue(flKkQrCard2, "flKkQrCard");
                p220oa.h.s(flKkQrCard2, true);
                FrameLayout flKkQrContainer2 = (FrameLayout) jVar.f738e;
                Intrinsics.checkNotNullExpressionValue(flKkQrContainer2, "flKkQrContainer");
                p220oa.h.s(flKkQrContainer2, true);
                ImageView ivKkQrCode = (ImageView) jVar.f740g;
                Intrinsics.checkNotNullExpressionValue(ivKkQrCode, "ivKkQrCode");
                p220oa.h.s(ivKkQrCode, true);
                TextView tvKkQrHint2 = (TextView) jVar.t;
                Intrinsics.checkNotNullExpressionValue(tvKkQrHint2, "tvKkQrHint");
                p220oa.h.s(tvKkQrHint2, true);
                boolean zIsConnected = NetworkUtils.isConnected();
                TextView tvKkQrSubHint = (TextView) jVar.f731A;
                TextView tvKkQrMaskSubtitle = (TextView) jVar.f745v;
                FrameLayout flKkQrMask = (FrameLayout) jVar.f739f;
                if (!zIsConnected) {
                    CircularProgressIndicator pbKkQrLoading = (CircularProgressIndicator) jVar.f743o;
                    Intrinsics.checkNotNullExpressionValue(pbKkQrLoading, "pbKkQrLoading");
                    p220oa.h.c(pbKkQrLoading);
                    ivKkQrCode.setImageDrawable(null);
                    Intrinsics.checkNotNullExpressionValue(flKkQrMask, "flKkQrMask");
                    p220oa.h.s(flKkQrMask, true);
                    kkCarQrView.d(S6.a.pay_NoNetwork);
                    Intrinsics.checkNotNullExpressionValue(tvKkQrMaskSubtitle, "tvKkQrMaskSubtitle");
                    p220oa.h.s(tvKkQrMaskSubtitle, true);
                    tvKkQrMaskSubtitle.setText(k.core_no_network_str);
                    Intrinsics.checkNotNullExpressionValue(tvKkQrHint2, "tvKkQrHint");
                    p220oa.h.s(tvKkQrHint2, false);
                    Intrinsics.checkNotNullExpressionValue(tvKkQrSubHint, "tvKkQrSubHint");
                    p220oa.h.s(tvKkQrSubHint, true);
                    tvKkQrSubHint.setText(p159kd.h.sm_kk_qr_offline);
                } else if (kkCarQrView.f33955g) {
                    CircularProgressIndicator pbKkQrLoading2 = (CircularProgressIndicator) jVar.f743o;
                    Intrinsics.checkNotNullExpressionValue(pbKkQrLoading2, "pbKkQrLoading");
                    p220oa.h.s(pbKkQrLoading2, true);
                    Intrinsics.checkNotNullExpressionValue(flKkQrMask, "flKkQrMask");
                    p220oa.h.c(flKkQrMask);
                    tvKkQrHint2.setText(p159kd.h.sm_kk_qr_tap_to_refresh);
                } else {
                    CircularProgressIndicator pbKkQrLoading3 = (CircularProgressIndicator) jVar.f743o;
                    Intrinsics.checkNotNullExpressionValue(pbKkQrLoading3, "pbKkQrLoading");
                    p220oa.h.c(pbKkQrLoading3);
                    Integer qrCodeStatus = qrCodeDTO != null ? qrCodeDTO.getQrCodeStatus() : null;
                    String qrCode = qrCodeDTO != null ? qrCodeDTO.getQrCode() : null;
                    if (qrCodeDTO != null) {
                        if (qrCodeStatus == null || qrCodeStatus.intValue() != 1 || qrCode == null || qrCode.length() == 0) {
                            CircularProgressIndicator pbKkQrLoading4 = (CircularProgressIndicator) jVar.f743o;
                            Intrinsics.checkNotNullExpressionValue(pbKkQrLoading4, "pbKkQrLoading");
                            p220oa.h.c(pbKkQrLoading4);
                            ivKkQrCode.setImageDrawable(null);
                            Intrinsics.checkNotNullExpressionValue(flKkQrMask, "flKkQrMask");
                            p220oa.h.s(flKkQrMask, true);
                            kkCarQrView.d(S6.a.pay_Refresh);
                            Intrinsics.checkNotNullExpressionValue(tvKkQrMaskSubtitle, "tvKkQrMaskSubtitle");
                            p220oa.h.s(tvKkQrMaskSubtitle, true);
                            tvKkQrMaskSubtitle.setText(p159kd.h.sm_kk_qr_expired_title);
                            Intrinsics.checkNotNullExpressionValue(tvKkQrHint2, "tvKkQrHint");
                            p220oa.h.s(tvKkQrHint2, false);
                            Intrinsics.checkNotNullExpressionValue(tvKkQrSubHint, "tvKkQrSubHint");
                            p220oa.h.s(tvKkQrSubHint, true);
                            tvKkQrSubHint.setText(p159kd.h.sm_kk_qr_expired_tap_regenerate);
                        } else {
                            int dp = CommonViewExtKt.getDp(JfifUtil.MARKER_SOI);
                            ivKkQrCode.setImageBitmap(J3.a.i(qrCode, dp, dp, null));
                            Intrinsics.checkNotNullExpressionValue(flKkQrMask, "flKkQrMask");
                            p220oa.h.c(flKkQrMask);
                            tvKkQrHint2.setText(p159kd.h.sm_kk_qr_tap_to_refresh);
                        }
                    }
                }
            }
            kkCarQrView.c(i7);
        }
        boolean z3 = i7 != -1;
        u uVar2 = (u) this.f27335j;
        if (uVar2 != null) {
            p220oa.h.s(uVar2.f40512b, z3);
        }
        if (i7 == 2) {
            if (!this.f33734w) {
                n0.g().u(new ViewEvent("keke_qr_closed_show").add("app", "native"));
                this.f33734w = true;
            }
            this.f33733v = false;
            return;
        }
        this.f33734w = false;
        u uVar3 = (u) this.f27335j;
        if (uVar3 == null || !uVar3.f40518i.e()) {
            this.f33733v = false;
        } else {
            if (this.f33733v) {
                return;
            }
            n0.g().u(new ViewEvent("keke_qr_expired_show").add("app", "native"));
            this.f33733v = true;
        }
    }
}
