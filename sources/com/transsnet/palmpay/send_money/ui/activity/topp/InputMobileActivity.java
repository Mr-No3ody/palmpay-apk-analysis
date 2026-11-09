package com.transsnet.palmpay.send_money.ui.activity.topp;

import Pa.n0;
import Pa.r0;
import V9.C0714c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.q;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.QueryMemberByKeywordResp;
import com.transsnet.palmpay.send_money.bean.QueryMemberDetailResp;
import com.transsnet.palmpay.send_money.contract.TransferToMobileContract$IView;
import com.transsnet.palmpay.send_money.ui.activity.topp.InputMobileActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1765q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p051d9.C1605b;
import p159kd.f;
import p161kf.e;
import p173ld.l;
import p206nd.b;
import p220oa.h;
import p255qd.v;
import p287se.d;
import p355xf.C2131j;
import p355xf.t;
import x9.u;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "To PP 搜索联系人", path = "/request/input_mobile")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/topp/InputMobileActivity;", "Lcom/transsnet/palmpay/core/base/i;", "Lqd/v;", "Lcom/transsnet/palmpay/send_money/contract/TransferToMobileContract$IView;", "Landroid/text/TextWatcher;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "yd/c", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInputMobileActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputMobileActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/topp/InputMobileActivity\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,529:1\n108#2:530\n80#2,22:531\n108#2:553\n80#2,22:554\n*S KotlinDebug\n*F\n+ 1 InputMobileActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/topp/InputMobileActivity\n*L\n274#1:530\n274#1:531,22\n305#1:553\n305#1:554,22\n*E\n"})
public final class InputMobileActivity extends i implements TransferToMobileContract$IView, TextWatcher, View.OnClickListener {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final /* synthetic */ int f33535Z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f33536A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f33537B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f33538C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f33539H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f33540L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public e f33541M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public List f33542Q = new ArrayList();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ArrayList f33543X = new ArrayList();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f33544Y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f33545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33550g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f33551i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33552j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33553o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33554p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f33555v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f33556w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startAct(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) InputMobileActivity.class));
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public InputMobileActivity() {
        final int i7 = 0;
        final int i10 = 8;
        final int i11 = 12;
        this.f33545b = C2131j.b(new Function0(this) { // from class: yd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputMobileActivity f44283b;

            {
                this.f44283b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputMobileActivity inputMobileActivity = this.f44283b;
                switch (i11) {
                    case 0:
                        int i12 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.delete_bt);
                    case 1:
                        int i13 = InputMobileActivity.f33535Z;
                        return (EditText) inputMobileActivity.findViewById(p159kd.e.search_et);
                    case 2:
                        int i14 = InputMobileActivity.f33535Z;
                        return new c(inputMobileActivity);
                    case 3:
                        int i15 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.empty_view);
                    case 4:
                        int i16 = InputMobileActivity.f33535Z;
                        return inputMobileActivity.findViewById(p159kd.e.ivEmpty);
                    case 5:
                        int i17 = InputMobileActivity.f33535Z;
                        return (RecyclerView) inputMobileActivity.findViewById(p159kd.e.result_view);
                    case 6:
                        int i18 = InputMobileActivity.f33535Z;
                        return (LinearLayout) inputMobileActivity.findViewById(p159kd.e.ll_searching);
                    case 7:
                        int i19 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_business_number);
                    case 8:
                        int i20 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_partner_number);
                    case 9:
                        int i21 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_email);
                    case 10:
                        int i22 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_qr_account_number);
                    case 11:
                        int i23 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_facebook_name);
                    case 12:
                        int i24 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.directly_send_view);
                    case 13:
                        int i25 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_palmpay_tag);
                    case 14:
                        int i26 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_mobile);
                    case 15:
                        int i27 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_search_tip);
                    default:
                        int i28 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.si_contact_tv);
                }
            }
        });
        final int i12 = 3;
        this.f33546c = C2131j.b(new Function0(this) { // from class: yd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputMobileActivity f44283b;

            {
                this.f44283b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputMobileActivity inputMobileActivity = this.f44283b;
                switch (i12) {
                    case 0:
                        int i13 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.delete_bt);
                    case 1:
                        int i14 = InputMobileActivity.f33535Z;
                        return (EditText) inputMobileActivity.findViewById(p159kd.e.search_et);
                    case 2:
                        int i15 = InputMobileActivity.f33535Z;
                        return new c(inputMobileActivity);
                    case 3:
                        int i16 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.empty_view);
                    case 4:
                        int i17 = InputMobileActivity.f33535Z;
                        return inputMobileActivity.findViewById(p159kd.e.ivEmpty);
                    case 5:
                        int i18 = InputMobileActivity.f33535Z;
                        return (RecyclerView) inputMobileActivity.findViewById(p159kd.e.result_view);
                    case 6:
                        int i19 = InputMobileActivity.f33535Z;
                        return (LinearLayout) inputMobileActivity.findViewById(p159kd.e.ll_searching);
                    case 7:
                        int i110 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_business_number);
                    case 8:
                        int i20 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_partner_number);
                    case 9:
                        int i21 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_email);
                    case 10:
                        int i22 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_qr_account_number);
                    case 11:
                        int i23 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_facebook_name);
                    case 12:
                        int i24 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.directly_send_view);
                    case 13:
                        int i25 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_palmpay_tag);
                    case 14:
                        int i26 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_mobile);
                    case 15:
                        int i27 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_search_tip);
                    default:
                        int i28 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.si_contact_tv);
                }
            }
        });
        final int i13 = 4;
        this.f33547d = C2131j.b(new Function0(this) { // from class: yd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputMobileActivity f44283b;

            {
                this.f44283b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputMobileActivity inputMobileActivity = this.f44283b;
                switch (i13) {
                    case 0:
                        int i14 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.delete_bt);
                    case 1:
                        int i15 = InputMobileActivity.f33535Z;
                        return (EditText) inputMobileActivity.findViewById(p159kd.e.search_et);
                    case 2:
                        int i16 = InputMobileActivity.f33535Z;
                        return new c(inputMobileActivity);
                    case 3:
                        int i17 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.empty_view);
                    case 4:
                        int i18 = InputMobileActivity.f33535Z;
                        return inputMobileActivity.findViewById(p159kd.e.ivEmpty);
                    case 5:
                        int i19 = InputMobileActivity.f33535Z;
                        return (RecyclerView) inputMobileActivity.findViewById(p159kd.e.result_view);
                    case 6:
                        int i110 = InputMobileActivity.f33535Z;
                        return (LinearLayout) inputMobileActivity.findViewById(p159kd.e.ll_searching);
                    case 7:
                        int i111 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_business_number);
                    case 8:
                        int i20 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_partner_number);
                    case 9:
                        int i21 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_email);
                    case 10:
                        int i22 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_qr_account_number);
                    case 11:
                        int i23 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_facebook_name);
                    case 12:
                        int i24 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.directly_send_view);
                    case 13:
                        int i25 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_palmpay_tag);
                    case 14:
                        int i26 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_mobile);
                    case 15:
                        int i27 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_search_tip);
                    default:
                        int i28 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.si_contact_tv);
                }
            }
        });
        final int i14 = 5;
        this.f33548e = C2131j.b(new Function0(this) { // from class: yd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputMobileActivity f44283b;

            {
                this.f44283b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputMobileActivity inputMobileActivity = this.f44283b;
                switch (i14) {
                    case 0:
                        int i15 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.delete_bt);
                    case 1:
                        int i16 = InputMobileActivity.f33535Z;
                        return (EditText) inputMobileActivity.findViewById(p159kd.e.search_et);
                    case 2:
                        int i17 = InputMobileActivity.f33535Z;
                        return new c(inputMobileActivity);
                    case 3:
                        int i18 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.empty_view);
                    case 4:
                        int i19 = InputMobileActivity.f33535Z;
                        return inputMobileActivity.findViewById(p159kd.e.ivEmpty);
                    case 5:
                        int i110 = InputMobileActivity.f33535Z;
                        return (RecyclerView) inputMobileActivity.findViewById(p159kd.e.result_view);
                    case 6:
                        int i111 = InputMobileActivity.f33535Z;
                        return (LinearLayout) inputMobileActivity.findViewById(p159kd.e.ll_searching);
                    case 7:
                        int i112 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_business_number);
                    case 8:
                        int i20 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_partner_number);
                    case 9:
                        int i21 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_email);
                    case 10:
                        int i22 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_qr_account_number);
                    case 11:
                        int i23 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_facebook_name);
                    case 12:
                        int i24 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.directly_send_view);
                    case 13:
                        int i25 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_palmpay_tag);
                    case 14:
                        int i26 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_mobile);
                    case 15:
                        int i27 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_search_tip);
                    default:
                        int i28 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.si_contact_tv);
                }
            }
        });
        final int i15 = 6;
        this.f33549f = C2131j.b(new Function0(this) { // from class: yd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputMobileActivity f44283b;

            {
                this.f44283b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputMobileActivity inputMobileActivity = this.f44283b;
                switch (i15) {
                    case 0:
                        int i16 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.delete_bt);
                    case 1:
                        int i17 = InputMobileActivity.f33535Z;
                        return (EditText) inputMobileActivity.findViewById(p159kd.e.search_et);
                    case 2:
                        int i18 = InputMobileActivity.f33535Z;
                        return new c(inputMobileActivity);
                    case 3:
                        int i19 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.empty_view);
                    case 4:
                        int i110 = InputMobileActivity.f33535Z;
                        return inputMobileActivity.findViewById(p159kd.e.ivEmpty);
                    case 5:
                        int i111 = InputMobileActivity.f33535Z;
                        return (RecyclerView) inputMobileActivity.findViewById(p159kd.e.result_view);
                    case 6:
                        int i112 = InputMobileActivity.f33535Z;
                        return (LinearLayout) inputMobileActivity.findViewById(p159kd.e.ll_searching);
                    case 7:
                        int i113 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_business_number);
                    case 8:
                        int i20 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_partner_number);
                    case 9:
                        int i21 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_email);
                    case 10:
                        int i22 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_qr_account_number);
                    case 11:
                        int i23 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_facebook_name);
                    case 12:
                        int i24 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.directly_send_view);
                    case 13:
                        int i25 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_palmpay_tag);
                    case 14:
                        int i26 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_mobile);
                    case 15:
                        int i27 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_search_tip);
                    default:
                        int i28 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.si_contact_tv);
                }
            }
        });
        final int i16 = 7;
        this.f33550g = C2131j.b(new Function0(this) { // from class: yd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputMobileActivity f44283b;

            {
                this.f44283b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputMobileActivity inputMobileActivity = this.f44283b;
                switch (i16) {
                    case 0:
                        int i17 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.delete_bt);
                    case 1:
                        int i18 = InputMobileActivity.f33535Z;
                        return (EditText) inputMobileActivity.findViewById(p159kd.e.search_et);
                    case 2:
                        int i19 = InputMobileActivity.f33535Z;
                        return new c(inputMobileActivity);
                    case 3:
                        int i110 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.empty_view);
                    case 4:
                        int i111 = InputMobileActivity.f33535Z;
                        return inputMobileActivity.findViewById(p159kd.e.ivEmpty);
                    case 5:
                        int i112 = InputMobileActivity.f33535Z;
                        return (RecyclerView) inputMobileActivity.findViewById(p159kd.e.result_view);
                    case 6:
                        int i113 = InputMobileActivity.f33535Z;
                        return (LinearLayout) inputMobileActivity.findViewById(p159kd.e.ll_searching);
                    case 7:
                        int i114 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_business_number);
                    case 8:
                        int i20 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_partner_number);
                    case 9:
                        int i21 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_email);
                    case 10:
                        int i22 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_qr_account_number);
                    case 11:
                        int i23 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_facebook_name);
                    case 12:
                        int i24 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.directly_send_view);
                    case 13:
                        int i25 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_palmpay_tag);
                    case 14:
                        int i26 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_mobile);
                    case 15:
                        int i27 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_search_tip);
                    default:
                        int i28 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.si_contact_tv);
                }
            }
        });
        this.f33551i = C2131j.b(new Function0(this) { // from class: yd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputMobileActivity f44283b;

            {
                this.f44283b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputMobileActivity inputMobileActivity = this.f44283b;
                switch (i10) {
                    case 0:
                        int i17 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.delete_bt);
                    case 1:
                        int i18 = InputMobileActivity.f33535Z;
                        return (EditText) inputMobileActivity.findViewById(p159kd.e.search_et);
                    case 2:
                        int i19 = InputMobileActivity.f33535Z;
                        return new c(inputMobileActivity);
                    case 3:
                        int i110 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.empty_view);
                    case 4:
                        int i111 = InputMobileActivity.f33535Z;
                        return inputMobileActivity.findViewById(p159kd.e.ivEmpty);
                    case 5:
                        int i112 = InputMobileActivity.f33535Z;
                        return (RecyclerView) inputMobileActivity.findViewById(p159kd.e.result_view);
                    case 6:
                        int i113 = InputMobileActivity.f33535Z;
                        return (LinearLayout) inputMobileActivity.findViewById(p159kd.e.ll_searching);
                    case 7:
                        int i114 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_business_number);
                    case 8:
                        int i20 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_partner_number);
                    case 9:
                        int i21 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_email);
                    case 10:
                        int i22 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_qr_account_number);
                    case 11:
                        int i23 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_facebook_name);
                    case 12:
                        int i24 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.directly_send_view);
                    case 13:
                        int i25 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_palmpay_tag);
                    case 14:
                        int i26 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_mobile);
                    case 15:
                        int i27 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_search_tip);
                    default:
                        int i28 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.si_contact_tv);
                }
            }
        });
        final int i17 = 9;
        this.f33552j = C2131j.b(new Function0(this) { // from class: yd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputMobileActivity f44283b;

            {
                this.f44283b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputMobileActivity inputMobileActivity = this.f44283b;
                switch (i17) {
                    case 0:
                        int i18 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.delete_bt);
                    case 1:
                        int i19 = InputMobileActivity.f33535Z;
                        return (EditText) inputMobileActivity.findViewById(p159kd.e.search_et);
                    case 2:
                        int i110 = InputMobileActivity.f33535Z;
                        return new c(inputMobileActivity);
                    case 3:
                        int i111 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.empty_view);
                    case 4:
                        int i112 = InputMobileActivity.f33535Z;
                        return inputMobileActivity.findViewById(p159kd.e.ivEmpty);
                    case 5:
                        int i113 = InputMobileActivity.f33535Z;
                        return (RecyclerView) inputMobileActivity.findViewById(p159kd.e.result_view);
                    case 6:
                        int i114 = InputMobileActivity.f33535Z;
                        return (LinearLayout) inputMobileActivity.findViewById(p159kd.e.ll_searching);
                    case 7:
                        int i115 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_business_number);
                    case 8:
                        int i20 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_partner_number);
                    case 9:
                        int i21 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_email);
                    case 10:
                        int i22 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_qr_account_number);
                    case 11:
                        int i23 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_facebook_name);
                    case 12:
                        int i24 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.directly_send_view);
                    case 13:
                        int i25 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_palmpay_tag);
                    case 14:
                        int i26 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_mobile);
                    case 15:
                        int i27 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_search_tip);
                    default:
                        int i28 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.si_contact_tv);
                }
            }
        });
        final int i18 = 10;
        this.f33553o = C2131j.b(new Function0(this) { // from class: yd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputMobileActivity f44283b;

            {
                this.f44283b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputMobileActivity inputMobileActivity = this.f44283b;
                switch (i18) {
                    case 0:
                        int i19 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.delete_bt);
                    case 1:
                        int i110 = InputMobileActivity.f33535Z;
                        return (EditText) inputMobileActivity.findViewById(p159kd.e.search_et);
                    case 2:
                        int i111 = InputMobileActivity.f33535Z;
                        return new c(inputMobileActivity);
                    case 3:
                        int i112 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.empty_view);
                    case 4:
                        int i113 = InputMobileActivity.f33535Z;
                        return inputMobileActivity.findViewById(p159kd.e.ivEmpty);
                    case 5:
                        int i114 = InputMobileActivity.f33535Z;
                        return (RecyclerView) inputMobileActivity.findViewById(p159kd.e.result_view);
                    case 6:
                        int i115 = InputMobileActivity.f33535Z;
                        return (LinearLayout) inputMobileActivity.findViewById(p159kd.e.ll_searching);
                    case 7:
                        int i116 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_business_number);
                    case 8:
                        int i20 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_partner_number);
                    case 9:
                        int i21 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_email);
                    case 10:
                        int i22 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_qr_account_number);
                    case 11:
                        int i23 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_facebook_name);
                    case 12:
                        int i24 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.directly_send_view);
                    case 13:
                        int i25 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_palmpay_tag);
                    case 14:
                        int i26 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_mobile);
                    case 15:
                        int i27 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_search_tip);
                    default:
                        int i28 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.si_contact_tv);
                }
            }
        });
        final int i19 = 11;
        this.f33554p = C2131j.b(new Function0(this) { // from class: yd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputMobileActivity f44283b;

            {
                this.f44283b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputMobileActivity inputMobileActivity = this.f44283b;
                switch (i19) {
                    case 0:
                        int i110 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.delete_bt);
                    case 1:
                        int i111 = InputMobileActivity.f33535Z;
                        return (EditText) inputMobileActivity.findViewById(p159kd.e.search_et);
                    case 2:
                        int i112 = InputMobileActivity.f33535Z;
                        return new c(inputMobileActivity);
                    case 3:
                        int i113 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.empty_view);
                    case 4:
                        int i114 = InputMobileActivity.f33535Z;
                        return inputMobileActivity.findViewById(p159kd.e.ivEmpty);
                    case 5:
                        int i115 = InputMobileActivity.f33535Z;
                        return (RecyclerView) inputMobileActivity.findViewById(p159kd.e.result_view);
                    case 6:
                        int i116 = InputMobileActivity.f33535Z;
                        return (LinearLayout) inputMobileActivity.findViewById(p159kd.e.ll_searching);
                    case 7:
                        int i117 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_business_number);
                    case 8:
                        int i20 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_partner_number);
                    case 9:
                        int i21 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_email);
                    case 10:
                        int i22 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_qr_account_number);
                    case 11:
                        int i23 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_facebook_name);
                    case 12:
                        int i24 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.directly_send_view);
                    case 13:
                        int i25 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_palmpay_tag);
                    case 14:
                        int i26 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_mobile);
                    case 15:
                        int i27 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_search_tip);
                    default:
                        int i28 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.si_contact_tv);
                }
            }
        });
        final int i20 = 13;
        this.t = C2131j.b(new Function0(this) { // from class: yd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputMobileActivity f44283b;

            {
                this.f44283b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputMobileActivity inputMobileActivity = this.f44283b;
                switch (i20) {
                    case 0:
                        int i110 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.delete_bt);
                    case 1:
                        int i111 = InputMobileActivity.f33535Z;
                        return (EditText) inputMobileActivity.findViewById(p159kd.e.search_et);
                    case 2:
                        int i112 = InputMobileActivity.f33535Z;
                        return new c(inputMobileActivity);
                    case 3:
                        int i113 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.empty_view);
                    case 4:
                        int i114 = InputMobileActivity.f33535Z;
                        return inputMobileActivity.findViewById(p159kd.e.ivEmpty);
                    case 5:
                        int i115 = InputMobileActivity.f33535Z;
                        return (RecyclerView) inputMobileActivity.findViewById(p159kd.e.result_view);
                    case 6:
                        int i116 = InputMobileActivity.f33535Z;
                        return (LinearLayout) inputMobileActivity.findViewById(p159kd.e.ll_searching);
                    case 7:
                        int i117 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_business_number);
                    case 8:
                        int i21 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_partner_number);
                    case 9:
                        int i22 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_email);
                    case 10:
                        int i23 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_qr_account_number);
                    case 11:
                        int i24 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_facebook_name);
                    case 12:
                        int i25 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.directly_send_view);
                    case 13:
                        int i26 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_palmpay_tag);
                    case 14:
                        int i27 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_mobile);
                    case 15:
                        int i28 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_search_tip);
                    default:
                        int i29 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.si_contact_tv);
                }
            }
        });
        final int i21 = 14;
        this.f33555v = C2131j.b(new Function0(this) { // from class: yd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputMobileActivity f44283b;

            {
                this.f44283b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputMobileActivity inputMobileActivity = this.f44283b;
                switch (i21) {
                    case 0:
                        int i110 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.delete_bt);
                    case 1:
                        int i111 = InputMobileActivity.f33535Z;
                        return (EditText) inputMobileActivity.findViewById(p159kd.e.search_et);
                    case 2:
                        int i112 = InputMobileActivity.f33535Z;
                        return new c(inputMobileActivity);
                    case 3:
                        int i113 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.empty_view);
                    case 4:
                        int i114 = InputMobileActivity.f33535Z;
                        return inputMobileActivity.findViewById(p159kd.e.ivEmpty);
                    case 5:
                        int i115 = InputMobileActivity.f33535Z;
                        return (RecyclerView) inputMobileActivity.findViewById(p159kd.e.result_view);
                    case 6:
                        int i116 = InputMobileActivity.f33535Z;
                        return (LinearLayout) inputMobileActivity.findViewById(p159kd.e.ll_searching);
                    case 7:
                        int i117 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_business_number);
                    case 8:
                        int i22 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_partner_number);
                    case 9:
                        int i23 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_email);
                    case 10:
                        int i24 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_qr_account_number);
                    case 11:
                        int i25 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_facebook_name);
                    case 12:
                        int i26 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.directly_send_view);
                    case 13:
                        int i27 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_palmpay_tag);
                    case 14:
                        int i28 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_mobile);
                    case 15:
                        int i29 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_search_tip);
                    default:
                        int i210 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.si_contact_tv);
                }
            }
        });
        final int i22 = 15;
        this.f33556w = C2131j.b(new Function0(this) { // from class: yd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputMobileActivity f44283b;

            {
                this.f44283b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputMobileActivity inputMobileActivity = this.f44283b;
                switch (i22) {
                    case 0:
                        int i110 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.delete_bt);
                    case 1:
                        int i111 = InputMobileActivity.f33535Z;
                        return (EditText) inputMobileActivity.findViewById(p159kd.e.search_et);
                    case 2:
                        int i112 = InputMobileActivity.f33535Z;
                        return new c(inputMobileActivity);
                    case 3:
                        int i113 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.empty_view);
                    case 4:
                        int i114 = InputMobileActivity.f33535Z;
                        return inputMobileActivity.findViewById(p159kd.e.ivEmpty);
                    case 5:
                        int i115 = InputMobileActivity.f33535Z;
                        return (RecyclerView) inputMobileActivity.findViewById(p159kd.e.result_view);
                    case 6:
                        int i116 = InputMobileActivity.f33535Z;
                        return (LinearLayout) inputMobileActivity.findViewById(p159kd.e.ll_searching);
                    case 7:
                        int i117 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_business_number);
                    case 8:
                        int i23 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_partner_number);
                    case 9:
                        int i24 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_email);
                    case 10:
                        int i25 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_qr_account_number);
                    case 11:
                        int i26 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_facebook_name);
                    case 12:
                        int i27 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.directly_send_view);
                    case 13:
                        int i28 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_palmpay_tag);
                    case 14:
                        int i29 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_mobile);
                    case 15:
                        int i210 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_search_tip);
                    default:
                        int i211 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.si_contact_tv);
                }
            }
        });
        final int i23 = 16;
        this.f33536A = C2131j.b(new Function0(this) { // from class: yd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputMobileActivity f44283b;

            {
                this.f44283b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputMobileActivity inputMobileActivity = this.f44283b;
                switch (i23) {
                    case 0:
                        int i110 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.delete_bt);
                    case 1:
                        int i111 = InputMobileActivity.f33535Z;
                        return (EditText) inputMobileActivity.findViewById(p159kd.e.search_et);
                    case 2:
                        int i112 = InputMobileActivity.f33535Z;
                        return new c(inputMobileActivity);
                    case 3:
                        int i113 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.empty_view);
                    case 4:
                        int i114 = InputMobileActivity.f33535Z;
                        return inputMobileActivity.findViewById(p159kd.e.ivEmpty);
                    case 5:
                        int i115 = InputMobileActivity.f33535Z;
                        return (RecyclerView) inputMobileActivity.findViewById(p159kd.e.result_view);
                    case 6:
                        int i116 = InputMobileActivity.f33535Z;
                        return (LinearLayout) inputMobileActivity.findViewById(p159kd.e.ll_searching);
                    case 7:
                        int i117 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_business_number);
                    case 8:
                        int i24 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_partner_number);
                    case 9:
                        int i25 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_email);
                    case 10:
                        int i26 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_qr_account_number);
                    case 11:
                        int i27 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_facebook_name);
                    case 12:
                        int i28 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.directly_send_view);
                    case 13:
                        int i29 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_palmpay_tag);
                    case 14:
                        int i210 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_mobile);
                    case 15:
                        int i211 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_search_tip);
                    default:
                        int i212 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.si_contact_tv);
                }
            }
        });
        this.f33537B = C2131j.b(new Function0(this) { // from class: yd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputMobileActivity f44283b;

            {
                this.f44283b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputMobileActivity inputMobileActivity = this.f44283b;
                switch (i7) {
                    case 0:
                        int i110 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.delete_bt);
                    case 1:
                        int i111 = InputMobileActivity.f33535Z;
                        return (EditText) inputMobileActivity.findViewById(p159kd.e.search_et);
                    case 2:
                        int i112 = InputMobileActivity.f33535Z;
                        return new c(inputMobileActivity);
                    case 3:
                        int i113 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.empty_view);
                    case 4:
                        int i114 = InputMobileActivity.f33535Z;
                        return inputMobileActivity.findViewById(p159kd.e.ivEmpty);
                    case 5:
                        int i115 = InputMobileActivity.f33535Z;
                        return (RecyclerView) inputMobileActivity.findViewById(p159kd.e.result_view);
                    case 6:
                        int i116 = InputMobileActivity.f33535Z;
                        return (LinearLayout) inputMobileActivity.findViewById(p159kd.e.ll_searching);
                    case 7:
                        int i117 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_business_number);
                    case 8:
                        int i24 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_partner_number);
                    case 9:
                        int i25 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_email);
                    case 10:
                        int i26 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_qr_account_number);
                    case 11:
                        int i27 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_facebook_name);
                    case 12:
                        int i28 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.directly_send_view);
                    case 13:
                        int i29 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_palmpay_tag);
                    case 14:
                        int i210 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_mobile);
                    case 15:
                        int i211 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_search_tip);
                    default:
                        int i212 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.si_contact_tv);
                }
            }
        });
        final int i24 = 1;
        this.f33538C = C2131j.b(new Function0(this) { // from class: yd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputMobileActivity f44283b;

            {
                this.f44283b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputMobileActivity inputMobileActivity = this.f44283b;
                switch (i24) {
                    case 0:
                        int i110 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.delete_bt);
                    case 1:
                        int i111 = InputMobileActivity.f33535Z;
                        return (EditText) inputMobileActivity.findViewById(p159kd.e.search_et);
                    case 2:
                        int i112 = InputMobileActivity.f33535Z;
                        return new c(inputMobileActivity);
                    case 3:
                        int i113 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.empty_view);
                    case 4:
                        int i114 = InputMobileActivity.f33535Z;
                        return inputMobileActivity.findViewById(p159kd.e.ivEmpty);
                    case 5:
                        int i115 = InputMobileActivity.f33535Z;
                        return (RecyclerView) inputMobileActivity.findViewById(p159kd.e.result_view);
                    case 6:
                        int i116 = InputMobileActivity.f33535Z;
                        return (LinearLayout) inputMobileActivity.findViewById(p159kd.e.ll_searching);
                    case 7:
                        int i117 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_business_number);
                    case 8:
                        int i25 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_partner_number);
                    case 9:
                        int i26 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_email);
                    case 10:
                        int i27 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_qr_account_number);
                    case 11:
                        int i28 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_facebook_name);
                    case 12:
                        int i29 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.directly_send_view);
                    case 13:
                        int i210 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_palmpay_tag);
                    case 14:
                        int i211 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_mobile);
                    case 15:
                        int i212 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_search_tip);
                    default:
                        int i213 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.si_contact_tv);
                }
            }
        });
        final int i25 = 2;
        this.f33539H = C2131j.b(new Function0(this) { // from class: yd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputMobileActivity f44283b;

            {
                this.f44283b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InputMobileActivity inputMobileActivity = this.f44283b;
                switch (i25) {
                    case 0:
                        int i110 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.delete_bt);
                    case 1:
                        int i111 = InputMobileActivity.f33535Z;
                        return (EditText) inputMobileActivity.findViewById(p159kd.e.search_et);
                    case 2:
                        int i112 = InputMobileActivity.f33535Z;
                        return new c(inputMobileActivity);
                    case 3:
                        int i113 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.empty_view);
                    case 4:
                        int i114 = InputMobileActivity.f33535Z;
                        return inputMobileActivity.findViewById(p159kd.e.ivEmpty);
                    case 5:
                        int i115 = InputMobileActivity.f33535Z;
                        return (RecyclerView) inputMobileActivity.findViewById(p159kd.e.result_view);
                    case 6:
                        int i116 = InputMobileActivity.f33535Z;
                        return (LinearLayout) inputMobileActivity.findViewById(p159kd.e.ll_searching);
                    case 7:
                        int i117 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_business_number);
                    case 8:
                        int i26 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_partner_number);
                    case 9:
                        int i27 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_email);
                    case 10:
                        int i28 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_qr_account_number);
                    case 11:
                        int i29 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_facebook_name);
                    case 12:
                        int i210 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.directly_send_view);
                    case 13:
                        int i211 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_palmpay_tag);
                    case 14:
                        int i212 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_mobile);
                    case 15:
                        int i213 = InputMobileActivity.f33535Z;
                        return (TextView) inputMobileActivity.findViewById(p159kd.e.tv_search_tip);
                    default:
                        int i214 = InputMobileActivity.f33535Z;
                        return (ImageView) inputMobileActivity.findViewById(p159kd.e.si_contact_tv);
                }
            }
        });
        this.f33540L = C2131j.b(new u(i10));
        p206nd.a aVar = b.f39930c;
        this.f33544Y = 0;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "editable");
        String string = editable.toString();
        Object value = this.f33537B.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ImageView) value).setVisibility(TextUtils.isEmpty(string) ? 8 : 0);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_input_mobile_activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.send_money.contract.TransferToMobileContract$IView
    public final void getTransferConfig(CommonBeanResult commonBeanResult) {
        if (commonBeanResult == null || !commonBeanResult.isSuccess()) {
            return;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new v();
    }

    public final void m() {
        p().setHint(b.f39930c.getEnumByType(Integer.valueOf(this.f33544Y)).f39934b);
        Object value = this.f33555v.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        s((TextView) value, 1);
        Object value2 = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        s((TextView) value2, 3);
        Object value3 = this.f33552j.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        s((TextView) value3, 2);
        Object value4 = this.f33554p.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        s((TextView) value4, 4);
        Object value5 = this.f33553o.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        s((TextView) value5, 5);
        Object value6 = this.f33551i.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        s((TextView) value6, 6);
        Object value7 = this.f33550g.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        s((TextView) value7, 7);
        q();
    }

    public final void n(int i7) {
        this.f33544Y = this.f33544Y == i7 ? 0 : i7;
        p206nd.a aVar = b.f39930c;
        t tVar = this.f33556w;
        if (i7 == 6 || i7 == 5) {
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((TextView) value).setVisibility(0);
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((TextView) value2).setText(i7 == 6 ? "If you are sending money to a partner agent, please enter the 10-digits agent account ID here." : "If you are sending money to a QR card, you can either search by QR card number on top of the physical card, or search the owner's mobile number.");
        } else {
            Object value3 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((TextView) value3).setVisibility(8);
        }
        m();
    }

    public final RecyclerView o() {
        Object value = this.f33548e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 1 && i10 == -1) {
            p().setText(r0.w0(intent != null ? intent.getStringExtra("PHONE_NUMBER") : null));
            p().setSelection(p().getText().length());
            return;
        }
        if (i7 == 2 && i10 == -1) {
            showLoadingDialog(true);
            String stringExtra = intent != null ? intent.getStringExtra("PHONE_NUMBER") : null;
            p().setText(stringExtra);
            p().setSelection(p().getText().length());
            v vVar = (v) this.f27350a;
            if (vVar != null) {
                vVar.queryMemberDetailByPhone(r0.v0(stringExtra));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        int id2 = v3.getId();
        if (id2 == p159kd.e.si_contact_tv) {
            ARouter.getInstance().build("/sm/transfer_to_palmpay_contact").navigation();
            n0.g().l("PalmPay_SendMoneyMobile_Btn_Contacts");
            return;
        }
        if (id2 == p159kd.e.delete_bt) {
            p().setText("");
            return;
        }
        if (id2 == p159kd.e.tv_mobile) {
            p206nd.a aVar = b.f39930c;
            n(1);
            return;
        }
        if (id2 == p159kd.e.tv_palmpay_tag) {
            p206nd.a aVar2 = b.f39930c;
            n(3);
            return;
        }
        if (id2 == p159kd.e.tv_email) {
            p206nd.a aVar3 = b.f39930c;
            n(2);
            return;
        }
        if (id2 == p159kd.e.tv_facebook_name) {
            p206nd.a aVar4 = b.f39930c;
            n(4);
            return;
        }
        if (id2 == p159kd.e.tv_qr_account_number) {
            p206nd.a aVar5 = b.f39930c;
            n(5);
        } else if (id2 == p159kd.e.tv_partner_number) {
            p206nd.a aVar6 = b.f39930c;
            n(6);
        } else if (id2 == p159kd.e.tv_business_number) {
            p206nd.a aVar7 = b.f39930c;
            n(7);
        }
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((Handler) this.f33539H.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        v vVar = (v) this.f27350a;
        if (vVar != null) {
            vVar.queryRecipients(1, 0);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        l lVar = (l) this.f33540L.getValue();
        String string = charSequence.toString();
        int length = string.length() - 1;
        int i12 = 0;
        boolean z3 = false;
        while (i12 <= length) {
            boolean z8 = Intrinsics.h(string.charAt(!z3 ? i12 : length), 32) <= 0;
            if (z3) {
                if (!z8) {
                    break;
                } else {
                    length--;
                }
            } else if (z8) {
                i12++;
            } else {
                z3 = true;
            }
        }
        String string2 = string.subSequence(i12, length + 1).toString();
        lVar.getClass();
        if (string2 == null) {
            string2 = "";
        }
        lVar.f39331a = string2;
        q();
    }

    public final EditText p() {
        Object value = this.f33538C.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (EditText) value;
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        String stringExtra = getIntent().getStringExtra("phone_number");
        if (!TextUtils.isEmpty(stringExtra)) {
            p().setText(r0.w0(stringExtra));
            String strW0 = r0.w0(stringExtra);
            Intrinsics.checkNotNullExpressionValue(strW0, "getPhoneNumberWithoutCountryCode(...)");
            Object value = this.f33549f.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            h.C((LinearLayout) value);
            v vVar = (v) this.f27350a;
            if (vVar != null) {
                vVar.queryMemberDetailByKeyword(strW0, this.f33544Y);
            }
        }
        v vVar2 = (v) this.f27350a;
        if (vVar2 != null) {
            ((SendMoneyApiService) p188md.b.f39648a.f6830b).getTransferBizConfig().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0714c(vVar2, 19));
        }
    }

    public final void q() {
        e eVar;
        String string = p().getText().toString();
        int length = string.length() - 1;
        int i7 = 0;
        boolean z3 = false;
        while (i7 <= length) {
            boolean z8 = Intrinsics.h(string.charAt(!z3 ? i7 : length), 32) <= 0;
            if (z3) {
                if (!z8) {
                    break;
                } else {
                    length--;
                }
            } else if (z8) {
                i7++;
            } else {
                z3 = true;
            }
        }
        String string2 = string.subSequence(i7, length + 1).toString();
        List list = this.f33542Q;
        if (list == null || list.isEmpty()) {
            this.f33543X.clear();
            r(string2);
            return;
        }
        if (TextUtils.isEmpty(string2)) {
            ((Handler) this.f33539H.getValue()).removeMessages(1);
            this.f33543X.clear();
            ((l) this.f33540L.getValue()).setList(this.f33543X);
            t(string2);
            return;
        }
        e eVar2 = this.f33541M;
        if (eVar2 != null && !eVar2.isDisposed() && (eVar = this.f33541M) != null) {
            p001if.a.a(eVar);
        }
        C1765q c1765qI = new C1755g(new com.transsnet.adsdk.b(18, string2, this), 0).f(new d(new p323v9.d(3), 22)).k(p298tf.f.f42629b).i(p071ef.b.a());
        e eVar3 = new e(new d(new C1605b(18, this, string2), 23), p147jf.a.f38601e, p147jf.a.f38599c);
        c1765qI.subscribe(eVar3);
        this.f33541M = eVar3;
        addSubscription(eVar3);
    }

    public final void r(String str) {
        if (TextUtils.isEmpty(str)) {
            t(str);
            return;
        }
        t tVar = this.f33539H;
        ((Handler) tVar.getValue()).removeMessages(1);
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = str;
        ((Handler) tVar.getValue()).sendMessageDelayed(messageObtain, 600L);
    }

    public final void s(TextView textView, int i7) {
        textView.setTextColor(getColor(this.f33544Y == i7 ? L6.b.ppColorTextBase : L6.b.ppColorPrimary));
        textView.setBackgroundResource(this.f33544Y == i7 ? r.cv_shape_rect_corner_20_bg_primary : r.cv_shape_rect_corner_20_bg_white);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this));
        p().addTextChangedListener(this);
        p().setFocusable(true);
        p().setFocusableInTouchMode(true);
        p().requestFocus();
        o().setLayoutManager(new LinearLayoutManager(this));
        C1548f c1548f = new C1548f(getColor(p.transparent), getResources().getDimensionPixelOffset(q.dp1));
        c1548f.f31336e = false;
        o().addItemDecoration(c1548f);
        o().setAdapter((l) this.f33540L.getValue());
        m();
        Object value = this.f33536A.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ImageView) value).setOnClickListener(this);
        Object value2 = this.f33537B.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((ImageView) value2).setOnClickListener(this);
        Object value3 = this.f33555v.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((TextView) value3).setOnClickListener(this);
        Object value4 = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((TextView) value4).setOnClickListener(this);
        Object value5 = this.f33552j.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((TextView) value5).setOnClickListener(this);
        Object value6 = this.f33554p.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        ((TextView) value6).setOnClickListener(this);
        Object value7 = this.f33553o.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        ((TextView) value7).setOnClickListener(this);
        Object value8 = this.f33551i.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        ((TextView) value8).setOnClickListener(this);
        Object value9 = this.f33550g.getValue();
        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
        ((TextView) value9).setOnClickListener(this);
    }

    @Override // com.transsnet.palmpay.send_money.contract.TransferToMobileContract$IView
    public final void showQueryMemberByKeyword(QueryMemberByKeywordResp resp, String searchKey) {
        String str;
        Intrinsics.checkNotNullParameter(resp, "resp");
        Intrinsics.checkNotNullParameter(searchKey, "searchKey");
        Object value = this.f33549f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        h.c((LinearLayout) value);
        if (!resp.isSuccess()) {
            ToastUtils.showShort(resp.getRespMsg(), new Object[0]);
            return;
        }
        List<QueryMemberDetailResp.Data> list = resp.data;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = this.f33543X;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (QueryMemberDetailResp.Data data : this.f33543X) {
                    for (QueryMemberDetailResp.Data data2 : resp.data) {
                        if (data2 != null && (str = data.memberId) != null && str.equals(data2.memberId)) {
                            resp.data.remove(data2);
                            break;
                        }
                    }
                }
            }
            List<QueryMemberDetailResp.Data> list2 = resp.data;
            if (list2 != null && list2.size() > 0) {
                ArrayList arrayList2 = this.f33543X;
                List<QueryMemberDetailResp.Data> data3 = resp.data;
                Intrinsics.checkNotNullExpressionValue(data3, "data");
                arrayList2.addAll(data3);
            }
        }
        t(searchKey);
    }

    @Override // com.transsnet.palmpay.send_money.contract.TransferToMobileContract$IView
    public final void showQueryMemberDetail(QueryMemberDetailResp resp, String phone) {
        Intrinsics.checkNotNullParameter(resp, "resp");
        Intrinsics.checkNotNullParameter(phone, "phone");
        showLoadingDialog(false);
        if (resp.isSuccess()) {
            return;
        }
        ToastUtils.showShort(resp.getRespMsg(), new Object[0]);
    }

    @Override // com.transsnet.palmpay.send_money.contract.TransferToMobileContract$IView
    public final void showQueryMemberDetailError(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Object value = this.f33549f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        h.c((LinearLayout) value);
        ToastUtils.showShort(message, new Object[0]);
    }

    @Override // com.transsnet.palmpay.send_money.contract.TransferToMobileContract$IView
    public final void showRecipientsResp(List members) {
        Intrinsics.checkNotNullParameter(members, "members");
        this.f33542Q = members;
    }

    public final void t(String str) {
        ArrayList arrayList = this.f33543X;
        t tVar = this.f33545b;
        t tVar2 = this.f33547d;
        t tVar3 = this.f33546c;
        if (arrayList != null && !arrayList.isEmpty()) {
            ((QueryMemberDetailResp.Data) this.f33543X.get(0)).headTitle = getString(p159kd.h.sm_recipients);
            if (this.f33543X.size() >= 2) {
                ((QueryMemberDetailResp.Data) this.f33543X.get(0)).headSubTitle = getString(p159kd.h.sm_member_tip, str);
            }
            Object value = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            h.s((TextView) value, false);
            Object value2 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            h.s((View) value2, false);
            Object value3 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            h.s((TextView) value3, false);
            h.s(o(), true);
            t tVar4 = this.f33540L;
            ((l) tVar4.getValue()).setList(this.f33543X);
            ((l) tVar4.getValue()).notifyDataSetChanged();
            return;
        }
        h.s(o(), false);
        if (!TextUtils.isEmpty(str) && r0.b1(str)) {
            int i7 = this.f33544Y;
            p206nd.a aVar = b.f39930c;
            if (i7 == 0 || i7 == 1) {
                Object value4 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                h.s((TextView) value4, true);
                Object value5 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                h.s((View) value5, true);
                return;
            }
        }
        Object value6 = tVar3.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        h.s((TextView) value6, false);
        Object value7 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        h.s((TextView) value7, false);
    }
}
