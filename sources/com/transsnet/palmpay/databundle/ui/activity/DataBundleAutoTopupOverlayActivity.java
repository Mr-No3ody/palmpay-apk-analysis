package com.transsnet.palmpay.databundle.ui.activity;

import Ba.a;
import C0.G;
import G7.q;
import L6.b;
import N8.q0;
import Oc.C0500c;
import Pa.n0;
import Pa.r0;
import Pd.c;
import Pd.d;
import Rd.C0600p;
import Rd.k0;
import T8.f;
import T8.o;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.video.u;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.databundle.ui.activity.DataBundleAutoTopupOverlayActivity;
import com.transsnet.palmpay.databundle.viewmodel.DataBundleHomeViewModel;
import com.transsnet.palmpay.teller.bean.AddAutoRenewTaskReq;
import com.transsnet.palmpay.teller.bean.AutoRenewalOrderBean;
import com.transsnet.palmpay.util.SpanUtils;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p010a9.m;
import p051d9.C1624v;
import p068ec.s;
import p068ec.t;
import p130ic.C1748c;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "数据包/自动充值弹窗", path = "/databundle/auto_renew_overlay", remark = "ignore")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/databundle/ui/activity/DataBundleAutoTopupOverlayActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/databundle/viewmodel/DataBundleHomeViewModel;", "LRd/p;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataBundleAutoTopupOverlayActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataBundleAutoTopupOverlayActivity.kt\ncom/transsnet/palmpay/databundle/ui/activity/DataBundleAutoTopupOverlayActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,358:1\n171#2,12:359\n215#2:371\n*S KotlinDebug\n*F\n+ 1 DataBundleAutoTopupOverlayActivity.kt\ncom/transsnet/palmpay/databundle/ui/activity/DataBundleAutoTopupOverlayActivity\n*L\n258#1:359,12\n258#1:371\n*E\n"})
public final class DataBundleAutoTopupOverlayActivity extends BaseMvvmVBActivity<DataBundleHomeViewModel, C0600p> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f31768f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31769d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AutoRenewalOrderBean f31770e;

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        DataBundleHomeViewModel dataBundleHomeViewModel = (DataBundleHomeViewModel) l();
        n.B(this, dataBundleHomeViewModel != null ? dataBundleHomeViewModel.f31797H : null, this, new a(this, 28), new C1624v(this, 18), false, null, 240);
        DataBundleHomeViewModel dataBundleHomeViewModel2 = (DataBundleHomeViewModel) l();
        l lVar = dataBundleHomeViewModel2 != null ? dataBundleHomeViewModel2.f31798L : null;
        if (lVar != null) {
            lVar.e(this, new f(new o(25, this, this), (char) 0, (char) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_databundle_auto_topup_overlay, (ViewGroup) null, false);
        int i7 = c.bottomContainer;
        View viewM = p059e1.a.m(i7, viewInflate);
        if (viewM != null) {
            k0 k0VarA = k0.a(viewM);
            int i10 = c.overlay_background;
            View viewM2 = p059e1.a.m(i10, viewInflate);
            if (viewM2 != null) {
                C0600p c0600p = new C0600p((MotionLayout) viewInflate, k0VarA, viewM2);
                Intrinsics.checkNotNullExpressionValue(c0600p, "inflate(...)");
                return c0600p;
            }
            i7 = i10;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void n() {
        MotionLayout motionLayout;
        C0600p c0600p = (C0600p) this.f27334c;
        if (c0600p == null || (motionLayout = c0600p.f8442a) == null) {
            return;
        }
        motionLayout.y();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        MotionLayout motionLayout;
        CharSequence title;
        AutoRenewalOrderBean autoRenewalOrderBean = this.f31770e;
        if (autoRenewalOrderBean == null) {
            finish();
            return;
        }
        Long amount = autoRenewalOrderBean.getAmount();
        long jLongValue = amount != null ? amount.longValue() : 0L;
        Long discountAmount = autoRenewalOrderBean.getDiscountAmount();
        long jLongValue2 = discountAmount != null ? discountAmount.longValue() : 0L;
        boolean z3 = discountAmount != null;
        long j6 = jLongValue - jLongValue2;
        C0600p c0600p = (C0600p) this.f27334c;
        if (c0600p != null) {
            ((TextView) c0600p.f8443b.f8380w).setText(z3 ? q0.y(r0.F(j6), " ", getString(Pd.f.qt_betting_auto_renew_offer_suffix)) : q0.y(getString(Pd.f.qt_auto_top_up_airtime), " ", r0.F(jLongValue)));
        }
        C0600p c0600p2 = (C0600p) this.f27334c;
        if (c0600p2 != null) {
            TextView textView = (TextView) c0600p2.f8443b.f8379v;
            Integer timeType = autoRenewalOrderBean.getTimeType();
            if (timeType != null && timeType.intValue() == 1) {
                SpanUtils spanUtils = new SpanUtils();
                String title2 = autoRenewalOrderBean.getTitle();
                if (title2 == null) {
                    title2 = "";
                }
                SpanUtils spanUtilsAppend = spanUtils.append(title2);
                String subTitle = autoRenewalOrderBean.getSubTitle();
                if (subTitle == null) {
                    subTitle = "";
                }
                title = spanUtilsAppend.append(subTitle).setFontFamily("sans-serif-medium").create();
            } else {
                title = autoRenewalOrderBean.getTitle();
                if (title == null) {
                    title = "";
                }
            }
            textView.setText(title);
        }
        Integer timeType2 = autoRenewalOrderBean.getTimeType();
        if (timeType2 != null && timeType2.intValue() == 1) {
            C0600p c0600p3 = (C0600p) this.f27334c;
            if (c0600p3 != null) {
                TextView textView2 = (TextView) c0600p3.f8443b.t;
                SpanUtils foregroundColor = G.i("Top-up ").setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, this));
                String volume = autoRenewalOrderBean.getVolume();
                if (volume == null) {
                    volume = "";
                }
                String volumeUnit = autoRenewalOrderBean.getVolumeUnit();
                if (volumeUnit == null) {
                    volumeUnit = "";
                }
                String validity = autoRenewalOrderBean.getValidity();
                if (validity == null) {
                    validity = "";
                }
                String validityUnit = autoRenewalOrderBean.getValidityUnit();
                textView2.setText(foregroundColor.append(u.n(volume, volumeUnit, " - ", validity, validityUnit != null ? validityUnit : "")).setForegroundColor(CommonViewExtKt.colorInt(Pd.a.qt_databundle_auto_renew_gold, this)).create());
            }
        } else {
            C0600p c0600p4 = (C0600p) this.f27334c;
            if (c0600p4 != null) {
                TextView textView3 = (TextView) c0600p4.f8443b.t;
                SpanUtils spanUtils2 = new SpanUtils();
                String volume2 = autoRenewalOrderBean.getVolume();
                if (volume2 == null) {
                    volume2 = "";
                }
                String volumeUnit2 = autoRenewalOrderBean.getVolumeUnit();
                if (volumeUnit2 == null) {
                    volumeUnit2 = "";
                }
                SpanUtils foregroundColor2 = spanUtils2.append(volume2.concat(volumeUnit2)).setForegroundColor(CommonViewExtKt.colorInt(Pd.a.qt_databundle_auto_renew_gold, this));
                String timeText = autoRenewalOrderBean.getTimeText();
                textView3.setText(foregroundColor2.append("/".concat(timeText != null ? timeText : "")).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, this)).create());
            }
        }
        C0600p c0600p5 = (C0600p) this.f27334c;
        if (c0600p5 != null) {
            c0600p5.f8443b.f8369b.setVisibility(z3 ? 0 : 8);
        }
        if (z3) {
            C0600p c0600p6 = (C0600p) this.f27334c;
            if (c0600p6 != null) {
                TextView textView4 = (TextView) c0600p6.f8443b.f8378p;
                textView4.setText(r0.F(jLongValue));
                textView4.setPaintFlags(textView4.getPaintFlags() | 16);
            }
            C0600p c0600p7 = (C0600p) this.f27334c;
            if (c0600p7 != null) {
                c0600p7.f8443b.f8373f.setText(r0.F(jLongValue2));
            }
            C0600p c0600p8 = (C0600p) this.f27334c;
            if (c0600p8 != null) {
                c0600p8.f8443b.f8373f.setTextColor(CommonViewExtKt.colorInt(Pd.a.qt_databundle_auto_renew_gold, D3.a.c(this)));
            }
        }
        C0600p c0600p9 = (C0600p) this.f27334c;
        if (c0600p9 == null || (motionLayout = c0600p9.f8442a) == null) {
            return;
        }
        motionLayout.x();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        MotionLayout motionLayout;
        MotionLayout motionLayout2;
        super.setupView();
        androidx.activity.u.a(getOnBackPressedDispatcher(), this, new m(this, 23));
        initStatusBar(CommonViewExtKt.colorInt(p.transparent_54, this), false);
        ARouter.getInstance().inject(this);
        C0600p c0600p = (C0600p) this.f27334c;
        if (c0600p != null) {
            c0600p.f8443b.f8370c.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C0600p c0600p2 = (C0600p) this.f27334c;
        if (c0600p2 != null) {
            c0600p2.f8443b.f8370c.setText(G.i("I confirm and accept ").setForegroundColor(getColor(b.ppColorTextPrimary)).append("Data Auto Top-up Plan Agreement").setForegroundColor(getColor(b.ppColorPrimary)).setClickSpan(new C0500c(this, 14)).create());
        }
        C0600p c0600p3 = (C0600p) this.f27334c;
        if (c0600p3 != null) {
            k0 k0Var = c0600p3.f8443b;
            k0Var.f8370c.setOnClickListener(new s(k0Var, 0));
            ((IconicsCheckBox) k0Var.f8376j).setChecked(true);
            TextView textView = (TextView) k0Var.f8378p;
            textView.setPaintFlags(textView.getPaintFlags() | 16);
        }
        C0600p c0600p4 = (C0600p) this.f27334c;
        if (c0600p4 != null) {
            k0 k0Var2 = c0600p4.f8443b;
            final int i7 = 0;
            k0Var2.f8371d.setOnClickListener(new View.OnClickListener(this) { // from class: ec.r

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DataBundleAutoTopupOverlayActivity f36280b;

                {
                    this.f36280b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DataBundleAutoTopupOverlayActivity dataBundleAutoTopupOverlayActivity = this.f36280b;
                    switch (i7) {
                        case 0:
                            int i10 = DataBundleAutoTopupOverlayActivity.f31768f;
                            if (!r0.U0()) {
                                n0.g().l("Auto_Topup_Overlay_Close");
                                dataBundleAutoTopupOverlayActivity.n();
                                break;
                            }
                            break;
                        case 1:
                            int i11 = DataBundleAutoTopupOverlayActivity.f31768f;
                            if (!r0.U0()) {
                                DataBundleAutoTopupOverlayActivity dataBundleAutoTopupOverlayActivity2 = this.f36280b;
                                C0600p c0600p5 = (C0600p) dataBundleAutoTopupOverlayActivity2.f27334c;
                                if (c0600p5 == null || ((IconicsCheckBox) c0600p5.f8443b.f8376j).isChecked()) {
                                    AddAutoRenewTaskReq req = new AddAutoRenewTaskReq();
                                    req.setTransType(TransType.TRANS_TYPE_BUNDLE);
                                    req.setOrderNo(dataBundleAutoTopupOverlayActivity2.f31769d);
                                    AutoRenewalOrderBean autoRenewalOrderBean = dataBundleAutoTopupOverlayActivity2.f31770e;
                                    req.setItemId(autoRenewalOrderBean != null ? autoRenewalOrderBean.getItemId() : null);
                                    DataBundleHomeViewModel dataBundleHomeViewModel = (DataBundleHomeViewModel) dataBundleAutoTopupOverlayActivity2.l();
                                    if (dataBundleHomeViewModel != null) {
                                        Intrinsics.checkNotNullParameter(req, "req");
                                        if (BaseApplication.hasLogin()) {
                                            C1748c c1748c = new C1748c(req, null);
                                            l lVar = dataBundleHomeViewModel.f31797H;
                                            lVar.f27356m = req;
                                            Unit unit = Unit.f38893a;
                                            p140j8.f.v(dataBundleHomeViewModel, c1748c, lVar, 0L);
                                        }
                                    }
                                } else {
                                    C0600p c0600p6 = (C0600p) dataBundleAutoTopupOverlayActivity2.f27334c;
                                    if (c0600p6 != null) {
                                        IconicsCheckBox iconicsCheckBox = (IconicsCheckBox) c0600p6.f8443b.f8376j;
                                        String string = dataBundleAutoTopupOverlayActivity2.getString(Pd.f.qt_please_agree_auto_renew_agreement);
                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                        CommonViewExtKt.showBalloon(iconicsCheckBox, string, dataBundleAutoTopupOverlayActivity2, (2089452 & 4) != 0 ? iconicsCheckBox : null, (2089452 & 8) != 0 ? 80 : 48, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.7f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 12.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? iconicsCheckBox.getContext().getDrawable(com.transsnet.palmpay.custom_view.r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? b.ppColorTextPrimary : b.ppColorTextPrimary, (2089452 & 1048576) != 0 ? q.f3135a : null);
                                    }
                                }
                                n0.g().l("DataResultPage_AutoNewPopUp_TurnOnButton");
                                break;
                            }
                            break;
                        default:
                            int i12 = DataBundleAutoTopupOverlayActivity.f31768f;
                            if (!r0.U0()) {
                                DataBundleHomeViewModel dataBundleHomeViewModel2 = (DataBundleHomeViewModel) dataBundleAutoTopupOverlayActivity.l();
                                if (dataBundleHomeViewModel2 != null && BaseApplication.hasLogin()) {
                                    p140j8.f.v(dataBundleHomeViewModel2, new p130ic.f(1, null), dataBundleHomeViewModel2.f31798L, 0L);
                                }
                                n0.g().l("DataResultPage_AutoNewPopUp_DontRemindMeButton");
                                break;
                            }
                            break;
                    }
                }
            });
            final int i10 = 1;
            ((PpButton) k0Var2.f8375i).setOnClickListener(new View.OnClickListener(this) { // from class: ec.r

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DataBundleAutoTopupOverlayActivity f36280b;

                {
                    this.f36280b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DataBundleAutoTopupOverlayActivity dataBundleAutoTopupOverlayActivity = this.f36280b;
                    switch (i10) {
                        case 0:
                            int i11 = DataBundleAutoTopupOverlayActivity.f31768f;
                            if (!r0.U0()) {
                                n0.g().l("Auto_Topup_Overlay_Close");
                                dataBundleAutoTopupOverlayActivity.n();
                                break;
                            }
                            break;
                        case 1:
                            int i12 = DataBundleAutoTopupOverlayActivity.f31768f;
                            if (!r0.U0()) {
                                DataBundleAutoTopupOverlayActivity dataBundleAutoTopupOverlayActivity2 = this.f36280b;
                                C0600p c0600p5 = (C0600p) dataBundleAutoTopupOverlayActivity2.f27334c;
                                if (c0600p5 == null || ((IconicsCheckBox) c0600p5.f8443b.f8376j).isChecked()) {
                                    AddAutoRenewTaskReq req = new AddAutoRenewTaskReq();
                                    req.setTransType(TransType.TRANS_TYPE_BUNDLE);
                                    req.setOrderNo(dataBundleAutoTopupOverlayActivity2.f31769d);
                                    AutoRenewalOrderBean autoRenewalOrderBean = dataBundleAutoTopupOverlayActivity2.f31770e;
                                    req.setItemId(autoRenewalOrderBean != null ? autoRenewalOrderBean.getItemId() : null);
                                    DataBundleHomeViewModel dataBundleHomeViewModel = (DataBundleHomeViewModel) dataBundleAutoTopupOverlayActivity2.l();
                                    if (dataBundleHomeViewModel != null) {
                                        Intrinsics.checkNotNullParameter(req, "req");
                                        if (BaseApplication.hasLogin()) {
                                            C1748c c1748c = new C1748c(req, null);
                                            l lVar = dataBundleHomeViewModel.f31797H;
                                            lVar.f27356m = req;
                                            Unit unit = Unit.f38893a;
                                            p140j8.f.v(dataBundleHomeViewModel, c1748c, lVar, 0L);
                                        }
                                    }
                                } else {
                                    C0600p c0600p6 = (C0600p) dataBundleAutoTopupOverlayActivity2.f27334c;
                                    if (c0600p6 != null) {
                                        IconicsCheckBox iconicsCheckBox = (IconicsCheckBox) c0600p6.f8443b.f8376j;
                                        String string = dataBundleAutoTopupOverlayActivity2.getString(Pd.f.qt_please_agree_auto_renew_agreement);
                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                        CommonViewExtKt.showBalloon(iconicsCheckBox, string, dataBundleAutoTopupOverlayActivity2, (2089452 & 4) != 0 ? iconicsCheckBox : null, (2089452 & 8) != 0 ? 80 : 48, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.7f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 12.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? iconicsCheckBox.getContext().getDrawable(com.transsnet.palmpay.custom_view.r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? b.ppColorTextPrimary : b.ppColorTextPrimary, (2089452 & 1048576) != 0 ? q.f3135a : null);
                                    }
                                }
                                n0.g().l("DataResultPage_AutoNewPopUp_TurnOnButton");
                                break;
                            }
                            break;
                        default:
                            int i13 = DataBundleAutoTopupOverlayActivity.f31768f;
                            if (!r0.U0()) {
                                DataBundleHomeViewModel dataBundleHomeViewModel2 = (DataBundleHomeViewModel) dataBundleAutoTopupOverlayActivity.l();
                                if (dataBundleHomeViewModel2 != null && BaseApplication.hasLogin()) {
                                    p140j8.f.v(dataBundleHomeViewModel2, new p130ic.f(1, null), dataBundleHomeViewModel2.f31798L, 0L);
                                }
                                n0.g().l("DataResultPage_AutoNewPopUp_DontRemindMeButton");
                                break;
                            }
                            break;
                    }
                }
            });
            final int i11 = 2;
            k0Var2.f8372e.setOnClickListener(new View.OnClickListener(this) { // from class: ec.r

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DataBundleAutoTopupOverlayActivity f36280b;

                {
                    this.f36280b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DataBundleAutoTopupOverlayActivity dataBundleAutoTopupOverlayActivity = this.f36280b;
                    switch (i11) {
                        case 0:
                            int i12 = DataBundleAutoTopupOverlayActivity.f31768f;
                            if (!r0.U0()) {
                                n0.g().l("Auto_Topup_Overlay_Close");
                                dataBundleAutoTopupOverlayActivity.n();
                                break;
                            }
                            break;
                        case 1:
                            int i13 = DataBundleAutoTopupOverlayActivity.f31768f;
                            if (!r0.U0()) {
                                DataBundleAutoTopupOverlayActivity dataBundleAutoTopupOverlayActivity2 = this.f36280b;
                                C0600p c0600p5 = (C0600p) dataBundleAutoTopupOverlayActivity2.f27334c;
                                if (c0600p5 == null || ((IconicsCheckBox) c0600p5.f8443b.f8376j).isChecked()) {
                                    AddAutoRenewTaskReq req = new AddAutoRenewTaskReq();
                                    req.setTransType(TransType.TRANS_TYPE_BUNDLE);
                                    req.setOrderNo(dataBundleAutoTopupOverlayActivity2.f31769d);
                                    AutoRenewalOrderBean autoRenewalOrderBean = dataBundleAutoTopupOverlayActivity2.f31770e;
                                    req.setItemId(autoRenewalOrderBean != null ? autoRenewalOrderBean.getItemId() : null);
                                    DataBundleHomeViewModel dataBundleHomeViewModel = (DataBundleHomeViewModel) dataBundleAutoTopupOverlayActivity2.l();
                                    if (dataBundleHomeViewModel != null) {
                                        Intrinsics.checkNotNullParameter(req, "req");
                                        if (BaseApplication.hasLogin()) {
                                            C1748c c1748c = new C1748c(req, null);
                                            l lVar = dataBundleHomeViewModel.f31797H;
                                            lVar.f27356m = req;
                                            Unit unit = Unit.f38893a;
                                            p140j8.f.v(dataBundleHomeViewModel, c1748c, lVar, 0L);
                                        }
                                    }
                                } else {
                                    C0600p c0600p6 = (C0600p) dataBundleAutoTopupOverlayActivity2.f27334c;
                                    if (c0600p6 != null) {
                                        IconicsCheckBox iconicsCheckBox = (IconicsCheckBox) c0600p6.f8443b.f8376j;
                                        String string = dataBundleAutoTopupOverlayActivity2.getString(Pd.f.qt_please_agree_auto_renew_agreement);
                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                        CommonViewExtKt.showBalloon(iconicsCheckBox, string, dataBundleAutoTopupOverlayActivity2, (2089452 & 4) != 0 ? iconicsCheckBox : null, (2089452 & 8) != 0 ? 80 : 48, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.7f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 12.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? iconicsCheckBox.getContext().getDrawable(com.transsnet.palmpay.custom_view.r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? b.ppColorTextPrimary : b.ppColorTextPrimary, (2089452 & 1048576) != 0 ? q.f3135a : null);
                                    }
                                }
                                n0.g().l("DataResultPage_AutoNewPopUp_TurnOnButton");
                                break;
                            }
                            break;
                        default:
                            int i14 = DataBundleAutoTopupOverlayActivity.f31768f;
                            if (!r0.U0()) {
                                DataBundleHomeViewModel dataBundleHomeViewModel2 = (DataBundleHomeViewModel) dataBundleAutoTopupOverlayActivity.l();
                                if (dataBundleHomeViewModel2 != null && BaseApplication.hasLogin()) {
                                    p140j8.f.v(dataBundleHomeViewModel2, new p130ic.f(1, null), dataBundleHomeViewModel2.f31798L, 0L);
                                }
                                n0.g().l("DataResultPage_AutoNewPopUp_DontRemindMeButton");
                                break;
                            }
                            break;
                    }
                }
            });
        }
        C0600p c0600p5 = (C0600p) this.f27334c;
        if (c0600p5 != null && (motionLayout2 = c0600p5.f8442a) != null) {
            motionLayout2.setTransitionListener(new t(this));
        }
        C0600p c0600p6 = (C0600p) this.f27334c;
        if (c0600p6 != null && (motionLayout = c0600p6.f8442a) != null) {
            motionLayout.setInteractionEnabled(false);
        }
        n0.g().v("DataResultPage_AutoNewPopUp");
    }
}
