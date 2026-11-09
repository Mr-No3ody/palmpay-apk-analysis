package com.transsnet.palmpay.send_money.ui.activity;

import C0.G;
import F6.d;
import Gd.l;
import Kd.E0;
import Kd.G0;
import Kd.H0;
import Kd.I0;
import L6.b;
import O6.f;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.t0;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.u;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.common.export.bean.req.DialogConfigSettingsReq;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.BillProcessTitleData1;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.viewmodel.FailResultPageAdView;
import com.transsnet.palmpay.core.viewmodel.OrderResultRewardModel;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.ui.activity.J;
import com.transsnet.palmpay.send_money.bean.OrderCompensateBean;
import com.transsnet.palmpay.send_money.bean.TransferData;
import com.transsnet.palmpay.send_money.bean.TransferDetailCompensation;
import com.transsnet.palmpay.send_money.bean.event.TransactionEvent;
import com.transsnet.palmpay.send_money.bean.resp.AddFavoriteRelationshipBean;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankAccountActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayHomeActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.dialog.AddShortcutDialog;
import com.transsnet.palmpay.send_money.ui.dialog.NotificationEmailDialog;
import com.transsnet.palmpay.send_money.ui.view.TransferResultHeaderModel;
import com.transsnet.palmpay.send_money.ui.view.TransferToBankProgressModel;
import com.transsnet.palmpay.send_money.ui.view.TransferToFastTransferSafeguardProgressModel;
import com.transsnet.palmpay.send_money.ui.view.TransferToPalmPayProgressView;
import com.transsnet.palmpay.send_money.util.TransferTrackingUtils;
import com.transsnet.palmpay.send_money.viewmodel.TransferResultViewModel;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.sufficientlysecure.htmltextview.HtmlTextView;
import p025ba.c;
import p025ba.k;
import p042cg.e;
import p054dd.n;
import p141j9.C1807o;
import p220oa.h;
import p223od.g;
import p270rd.K;
import p270rd.L;
import p270rd.M;
import p270rd.O;
import p270rd.P;
import p270rd.Q;
import p355xf.o;
import p355xf.q;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/send/complete")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/TransferResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferResultViewModel;", "Lod/g;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferResultActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/TransferResultActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,1239:1\n562#2,10:1240\n1#3:1250\n1878#4,3:1251\n1869#4,2:1318\n1869#4,2:1320\n260#5,10:1254\n296#5:1264\n171#5,12:1265\n215#5:1277\n115#5,8:1278\n145#5:1286\n115#5,8:1287\n145#5:1295\n115#5,8:1296\n145#5:1304\n171#5,12:1305\n215#5:1317\n*S KotlinDebug\n*F\n+ 1 TransferResultActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/TransferResultActivity\n*L\n200#1:1240,10\n583#1:1251,3\n1019#1:1318,2\n1030#1:1320,2\n723#1:1254,10\n723#1:1264\n868#1:1265,12\n868#1:1277\n877#1:1278,8\n877#1:1286\n888#1:1287,8\n888#1:1295\n917#1:1296,8\n917#1:1304\n926#1:1305,12\n926#1:1317\n*E\n"})
public final class TransferResultActivity extends BaseMvvmVBActivity<TransferResultViewModel, g> {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final ArrayList f33237Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final ArrayList f33238k0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public p131id.a f33239A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public AddShortcutDialog f33240B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TransferToFastTransferSafeguardProgressModel f33241C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public TransferToBankProgressModel f33242H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public TransferToPalmPayProgressView f33243L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public OrderResultRewardModel f33244M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public SingleAdView f33245Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public SingleAdView f33246X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public SingleAdView f33247Y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PayByOrderResp.DataBean f33248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TransferData f33249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public NotificationEmailDialog f33250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f33251g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f33254o;
    public boolean t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f33252i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f33253j = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f33255p = 100;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Boolean f33256v = Boolean.TRUE;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f33257w = true;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
        f33237Z = C1850q.e(TransferToBankAccountActivity.class, TransferToPalmPayHomeActivity.class);
        f33238k0 = C1850q.e(TransferToMobileActivity.class, TransferToBankInputAmountActivity.class, TransferToCommonAccountActivity.class, TransferToPalmPayInputAmountActivity.class);
    }

    public static final void n(TransferResultActivity transferResultActivity) {
        g gVar = (g) transferResultActivity.f27334c;
        if (gVar != null) {
            gVar.f40354p.setBackButtonClickListener(new L(transferResultActivity, 1));
        }
        g gVar2 = (g) transferResultActivity.f27334c;
        if (gVar2 != null) {
            FailResultPageAdView failResultPageAdView = gVar2.f40343B;
            g gVar3 = (g) transferResultActivity.f27334c;
            failResultPageAdView.setAdListener(new com.chuanyi.ad.a(gVar3 != null ? gVar3.f40343B : null, ""));
        }
    }

    /* JADX WARN: Code duplicated, block: B:225:0x0455  */
    /* JADX WARN: Code duplicated, block: B:228:0x0462  */
    /* JADX WARN: Code duplicated, block: B:233:0x0473  */
    /* JADX WARN: Code duplicated, block: B:237:0x0480  */
    /* JADX WARN: Code duplicated, block: B:239:0x0488  */
    /* JADX WARN: Code duplicated, block: B:241:0x0491  */
    /* JADX WARN: Code duplicated, block: B:242:0x0495  */
    /* JADX WARN: Code duplicated, block: B:244:0x0498  */
    /* JADX WARN: Code duplicated, block: B:248:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:250:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:263:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:264:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:270:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:271:0x0500  */
    /* JADX WARN: Code duplicated, block: B:278:0x050f  */
    /* JADX WARN: Code duplicated, block: B:279:0x0512  */
    /* JADX WARN: Code duplicated, block: B:282:0x051a  */
    /* JADX WARN: Code duplicated, block: B:284:0x051e  */
    /* JADX WARN: Code duplicated, block: B:285:0x0521  */
    /* JADX WARN: Code duplicated, block: B:288:0x0529  */
    /* JADX WARN: Code duplicated, block: B:290:0x0555  */
    /* JADX WARN: Code duplicated, block: B:291:0x0558  */
    /* JADX WARN: Code duplicated, block: B:298:0x0567  */
    /* JADX WARN: Code duplicated, block: B:299:0x056a  */
    /* JADX WARN: Code duplicated, block: B:302:0x0572  */
    /* JADX WARN: Code duplicated, block: B:304:0x0581  */
    /* JADX WARN: Code duplicated, block: B:309:0x0593  */
    /* JADX WARN: Code duplicated, block: B:317:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:320:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:323:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:324:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:326:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:327:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:329:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:332:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:334:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:335:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:338:0x05f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:339:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:340:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:389:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:392:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:398:0x070f  */
    /* JADX WARN: Code duplicated, block: B:401:0x0716  */
    /* JADX WARN: Code duplicated, block: B:403:0x071a  */
    /* JADX WARN: Code duplicated, block: B:405:0x071e  */
    /* JADX WARN: Code duplicated, block: B:408:0x0725  */
    /* JADX WARN: Code duplicated, block: B:410:0x0729  */
    /* JADX WARN: Code duplicated, block: B:412:0x072d  */
    /* JADX WARN: Code duplicated, block: B:414:0x0737  */
    /* JADX WARN: Code duplicated, block: B:415:0x073c  */
    /* JADX WARN: Code duplicated, block: B:417:0x0740  */
    /* JADX WARN: Code duplicated, block: B:418:0x0749  */
    /* JADX WARN: Code duplicated, block: B:422:0x0751  */
    /* JADX WARN: Code duplicated, block: B:425:0x0758  */
    /* JADX WARN: Code duplicated, block: B:431:0x0767  */
    /* JADX WARN: Code duplicated, block: B:433:0x076b  */
    /* JADX WARN: Code duplicated, block: B:434:0x076f  */
    /* JADX WARN: Code duplicated, block: B:436:0x0773  */
    /* JADX WARN: Code duplicated, block: B:439:0x077c  */
    /* JADX WARN: Code duplicated, block: B:444:0x0791  */
    /* JADX WARN: Code duplicated, block: B:447:0x079b  */
    /* JADX WARN: Code duplicated, block: B:449:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:457:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:458:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:465:0x07db  */
    /* JADX WARN: Code duplicated, block: B:467:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:468:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:470:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:471:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:475:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:478:0x080b  */
    /* JADX WARN: Code duplicated, block: B:479:0x080f  */
    /* JADX WARN: Code duplicated, block: B:481:0x0813  */
    /* JADX WARN: Code duplicated, block: B:484:0x081c  */
    /* JADX WARN: Code duplicated, block: B:486:0x0828  */
    /* JADX WARN: Code duplicated, block: B:488:0x082c  */
    /* JADX WARN: Code duplicated, block: B:490:0x0836  */
    /* JADX WARN: Code duplicated, block: B:491:0x083b  */
    /* JADX WARN: Code duplicated, block: B:493:0x083f  */
    /* JADX WARN: Code duplicated, block: B:494:0x0848  */
    /* JADX WARN: Code duplicated, block: B:498:0x0850  */
    /* JADX WARN: Code duplicated, block: B:499:0x0854  */
    /* JADX WARN: Code duplicated, block: B:501:0x0858  */
    /* JADX WARN: Code duplicated, block: B:504:0x0861  */
    /* JADX WARN: Code duplicated, block: B:506:0x0867  */
    /* JADX WARN: Code duplicated, block: B:509:0x0872  */
    /* JADX WARN: Code duplicated, block: B:512:0x089a  */
    /* JADX WARN: Code duplicated, block: B:515:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:520:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:522:0x08be  */
    /* JADX WARN: Code duplicated, block: B:525:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:531:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:533:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:534:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:536:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:537:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:541:0x0902  */
    /* JADX WARN: Code duplicated, block: B:550:0x06df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x06d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x06d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x06d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x06d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:560:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v115 */
    /* JADX WARN: Type inference failed for: r0v116, types: [com.transsnet.palmpay.send_money.bean.TransferData$OrderResultKeyDetailBean] */
    /* JADX WARN: Type inference failed for: r0v126, types: [com.transsnet.palmpay.send_money.util.TransferTrackingUtils] */
    /* JADX WARN: Type inference failed for: r0v209 */
    /* JADX WARN: Type inference failed for: r0v210 */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v102 */
    /* JADX WARN: Type inference failed for: r2v103, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v107 */
    /* JADX WARN: Type inference failed for: r2v108, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v112 */
    /* JADX WARN: Type inference failed for: r2v113, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v127 */
    /* JADX WARN: Type inference failed for: r2v128, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v163 */
    /* JADX WARN: Type inference failed for: r2v164 */
    /* JADX WARN: Type inference failed for: r2v165 */
    /* JADX WARN: Type inference failed for: r2v166 */
    /* JADX WARN: Type inference failed for: r2v167 */
    /* JADX WARN: Type inference failed for: r2v168 */
    /* JADX WARN: Type inference failed for: r2v169 */
    /* JADX WARN: Type inference failed for: r2v171 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46, types: [com.transsnet.palmpay.send_money.ui.view.TransferToPalmPayProgressView] */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64, types: [com.transsnet.palmpay.send_money.ui.view.TransferToFastTransferSafeguardProgressModel] */
    /* JADX WARN: Type inference failed for: r2v81, types: [com.transsnet.palmpay.send_money.ui.view.TransferToBankProgressModel] */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v89, types: [com.transsnet.palmpay.send_money.ui.view.TransferToBankProgressModel] */
    /* JADX WARN: Type inference failed for: r2v98, types: [android.view.View, com.transsnet.palmpay.custom_view.model.OrderResultItemModel] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r3v35, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r7v11, types: [org.sufficientlysecure.htmltextview.HtmlTextView] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void o(TransferResultActivity transferResultActivity) {
        long j6;
        TextView orderResultStatusTipsTv;
        TextView orderResultStatusTipsTv2;
        t0 t0Var;
        g gVar;
        g gVar2;
        TransferData transferData;
        Iterable iterable;
        g gVar3;
        SingleAdView singleAdView;
        g gVar4;
        g gVar5;
        BillProcessDetail billProcessDetail;
        TransferToBankProgressModel transferToBankProgressModel;
        TransferDetailCompensation transferDetailCompensation;
        TransferToFastTransferSafeguardProgressModel transferToFastTransferSafeguardProgressModel;
        OrderCompensateBean orderCompensateBean;
        TransferToPalmPayProgressView transferToPalmPayProgressView;
        TransferData.GuideInfoBean guideInfoBean;
        g gVar6;
        SingleAdView singleAdView2;
        ViewStub viewStub;
        View viewInflate;
        SingleAdView singleAdView3;
        g gVar7;
        g gVar8;
        String str;
        Object obj;
        g gVar9;
        TransferToPalmPayProgressView transferToPalmPayProgressView2;
        ViewStub viewStub2;
        View viewInflate2;
        ?? r3;
        String successCompensationPic;
        g gVar10;
        TransferToFastTransferSafeguardProgressModel transferToFastTransferSafeguardProgressModel2;
        TransferToFastTransferSafeguardProgressModel transferToFastTransferSafeguardProgressModel3;
        ViewStub viewStub3;
        View viewInflate3;
        ?? r10;
        ImageView transferResultImage;
        g gVar11;
        g gVar12;
        TransferToFastTransferSafeguardProgressModel transferToFastTransferSafeguardProgressModel4;
        ImageView transferResultImage2;
        TransferToBankProgressModel transferToBankProgressModel2;
        List<BillProcessTitleData1> list;
        ?? r11;
        TransferToBankProgressModel transferToBankProgressModel3;
        ?? r12;
        TransferData.EarlyRefundFeeInfoBean earlyRefundFeeInfoBean;
        TransferToBankProgressModel transferToBankProgressModel4;
        ViewStub viewStub4;
        View viewInflate4;
        ?? r13;
        LinearLayout linearLayout;
        List<TransferData.OrderResultItemBean> list2;
        ?? r14;
        TransferData transferData2;
        TransferData.OrderResultKeyDetailBean orderResultKeyDetailBean;
        Iterator it;
        int i7;
        Object next;
        int i10;
        TransferData.OrderResultItemBean orderResultItemBean;
        ?? orderResultItemModel;
        String str2;
        String str3;
        SingleAdView singleAdView4;
        ?? r15;
        ?? r16;
        String str4;
        ?? j10;
        LinearLayout.LayoutParams layoutParams;
        TransferData transferData3;
        ?? r17;
        ?? r18;
        String str5;
        Object obj2;
        ?? r19;
        ?? r20;
        LinearLayout.LayoutParams layoutParams2;
        View view;
        String str6;
        String str7;
        TransferData.OrderResultKeyDetailBean orderResultKeyDetailBean2;
        String str8;
        Object obj3;
        String str9;
        TransferData transferData4;
        String str10;
        ?? r21;
        String str11;
        Object obj4;
        String str12;
        Object obj5;
        String str13;
        TransferData transferData5;
        long jLongValue;
        Long payAmount;
        AddFavoriteRelationshipBean addFavoriteRelationshipBean;
        TextView orderResultStatusTipsTv3;
        t0 t0Var2;
        int i11 = 3;
        int i12 = 2;
        final int i13 = 0;
        int i14 = 4;
        final int i15 = 1;
        PayByOrderResp.DataBean dataBean = transferResultActivity.f33248d;
        SingleAdView singleAdView5 = null;
        boolean zC = Intrinsics.c(dataBean != null ? Integer.valueOf(dataBean.payStatus) : null, 1);
        g gVar13 = (g) transferResultActivity.f27334c;
        if (gVar13 != null) {
            h.s(gVar13.f40352j, transferResultActivity.f33248d != null);
        }
        g gVar14 = (g) transferResultActivity.f27334c;
        if (gVar14 != null) {
            gVar14.f40351i.setText(zC ? k.core_complete : p159kd.h.sm_another_transfer_text);
        }
        g gVar15 = (g) transferResultActivity.f27334c;
        if (gVar15 != null) {
            gVar15.f40351i.setOnClickListener(new L(transferResultActivity, i12));
        }
        g gVar16 = (g) transferResultActivity.f27334c;
        if (gVar16 != null) {
            h.s(gVar16.f40350g, zC);
        }
        PayByOrderResp.DataBean dataBean2 = transferResultActivity.f33248d;
        if (dataBean2 != null) {
            int i16 = dataBean2.payStatus;
            String str14 = "";
            if (i16 != 1) {
                if (i16 == 2) {
                    transferResultActivity.t = true;
                    g gVar17 = (g) transferResultActivity.f27334c;
                    if (gVar17 != null && (t0Var = gVar17.f40342A.f33885f) != null) {
                        t0Var.cancel((CancellationException) null);
                    }
                    AutoTrackUtil.trackTransactionResult(transferResultActivity, 3);
                    p(transferResultActivity, "TransferPaymentResultsView", "TransferPaymentFailedPage");
                    g gVar18 = (g) transferResultActivity.f27334c;
                    if (gVar18 != null) {
                        gVar18.f40343B.s(dataBean2.payId);
                    }
                    g gVar19 = (g) transferResultActivity.f27334c;
                    if (gVar19 != null) {
                        gVar19.f40342A.e(TransactionResultHeaderModel.a.failIcon$default(TransactionResultHeaderModel.f31650j, transferResultActivity, 0.0f, 2, null));
                    }
                    if (TextUtils.isEmpty(dataBean2.errorMsg)) {
                        TransferData transferData6 = transferResultActivity.f33249e;
                        if (transferData6 != null && transferData6.getBusinessType() == 2) {
                            g gVar20 = (g) transferResultActivity.f27334c;
                            if (gVar20 != null) {
                                gVar20.f40342A.f("Payment failed. Payment amount has not been deducted. Please try again.");
                            }
                        } else {
                            g gVar21 = (g) transferResultActivity.f27334c;
                            if (gVar21 != null && (orderResultStatusTipsTv2 = gVar21.f40342A.getOrderResultStatusTipsTv()) != null) {
                                h.c(orderResultStatusTipsTv2);
                            }
                        }
                    } else {
                        g gVar22 = (g) transferResultActivity.f27334c;
                        if (gVar22 != null) {
                            gVar22.f40342A.f(dataBean2.errorMsg);
                        }
                    }
                    g gVar23 = (g) transferResultActivity.f27334c;
                    if (gVar23 != null) {
                        PpTitleBar ppTitleBar = gVar23.f40354p;
                        ImageView backImageView = ppTitleBar.getBackImageView();
                        if (backImageView != null) {
                            h.C(backImageView);
                        }
                        ImageView rightImageView1 = ppTitleBar.getRightImageView1();
                        if (rightImageView1 != null) {
                            h.C(rightImageView1);
                        }
                        ImageView rightImageView2 = ppTitleBar.getRightImageView1();
                        if (rightImageView2 != null) {
                            IconicsDrawable iconicsDrawable = new IconicsDrawable(transferResultActivity, S6.a.pay_CustomerService);
                            iconicsDrawable.a(new K(transferResultActivity, i14));
                            rightImageView2.setImageDrawable(iconicsDrawable);
                        }
                        ImageView rightImageView3 = ppTitleBar.getRightImageView1();
                        if (rightImageView3 != null) {
                            rightImageView3.setOnClickListener(new L(transferResultActivity, 5));
                        }
                        ppTitleBar.setRightText("");
                    }
                } else {
                    transferResultActivity.s();
                    AutoTrackUtil.trackTransactionResult(transferResultActivity, 2);
                    if (transferResultActivity.f33253j) {
                        p(transferResultActivity, "TransferPaymentResultsView", "TransferPaymentPendingPage");
                    }
                    if (TextUtils.isEmpty(dataBean2.pendingDesc)) {
                        g gVar24 = (g) transferResultActivity.f27334c;
                        if (gVar24 != null && (orderResultStatusTipsTv = gVar24.f40342A.getOrderResultStatusTipsTv()) != null) {
                            h.c(orderResultStatusTipsTv);
                        }
                    } else {
                        g gVar25 = (g) transferResultActivity.f27334c;
                        if (gVar25 != null) {
                            gVar25.f40342A.f(dataBean2.pendingDesc);
                        }
                    }
                    g gVar26 = (g) transferResultActivity.f27334c;
                    if (gVar26 != null) {
                        gVar26.f40342A.e(TransactionResultHeaderModel.a.processingIcon$default(TransactionResultHeaderModel.f31650j, transferResultActivity, 0.0f, 2, null));
                    }
                    g gVar27 = (g) transferResultActivity.f27334c;
                    if (gVar27 != null) {
                        TransferResultHeaderModel transferResultHeaderModel = gVar27.f40342A;
                        long jCurrentTimeMillis = dataBean2.pendingAcTime - System.currentTimeMillis();
                        LifecycleCoroutineScopeImpl scope = V.f(transferResultActivity);
                        j6 = 0;
                        Intrinsics.checkNotNullParameter(scope, "scope");
                        Context context = transferResultHeaderModel.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        transferResultHeaderModel.e(TransferResultHeaderModel.a.processingIcon$default(TransferResultHeaderModel.f33879g, context, 0.0f, 2, null));
                        if (jCurrentTimeMillis > 0 && transferResultHeaderModel.f33885f == null) {
                            try {
                                o oVar = q.f43977a;
                                p042cg.f fVar = I.f10809a;
                                transferResultHeaderModel.f33885f = AbstractC0780y.m(scope, p015ag.o.f11960a, null, new l(jCurrentTimeMillis, transferResultHeaderModel, null), 2);
                                Unit unit = Unit.f38893a;
                            } catch (Throwable th) {
                                o oVar2 = q.f43977a;
                                androidx.camera.core.impl.utils.executor.g.f(th);
                            }
                        }
                    } else {
                        j6 = 0;
                    }
                    d.h(transferResultActivity.TAG, 3, "delayRefreshOrder: pending refresh");
                    CoroutineScope coroutineScopeH = V.h(transferResultActivity.l());
                    p042cg.f fVar2 = I.f10809a;
                    AbstractC0780y.m(coroutineScopeH, e.f19009c, null, new O(transferResultActivity, null), 2);
                    if (transferResultActivity.f33252i) {
                        transferResultActivity.f33252i = false;
                    } else if (!transferResultActivity.f33254o) {
                        transferResultActivity.f33254o = true;
                        TransferResultViewModel transferResultViewModel = (TransferResultViewModel) transferResultActivity.l();
                        transferResultViewModel.getClass();
                        p140j8.f.s(transferResultViewModel, new E0(1, null), transferResultViewModel.f34036g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    }
                    g gVar28 = (g) transferResultActivity.f27334c;
                    if (gVar28 != null) {
                        PpTitleBar ppTitleBar2 = gVar28.f40354p;
                        ImageView backImageView2 = ppTitleBar2.getBackImageView();
                        if (backImageView2 != null) {
                            h.C(backImageView2);
                        }
                        ImageView rightImageView4 = ppTitleBar2.getRightImageView1();
                        if (rightImageView4 != null) {
                            h.C(rightImageView4);
                        }
                        ImageView rightImageView5 = ppTitleBar2.getRightImageView1();
                        if (rightImageView5 != null) {
                            IconicsDrawable iconicsDrawable2 = new IconicsDrawable(transferResultActivity, S6.a.pay_CustomerService);
                            iconicsDrawable2.a(new K(transferResultActivity, i15));
                            rightImageView5.setImageDrawable(iconicsDrawable2);
                        }
                        ImageView rightImageView6 = ppTitleBar2.getRightImageView1();
                        if (rightImageView6 != null) {
                            rightImageView6.setOnClickListener(new L(transferResultActivity, i13));
                        }
                        ppTitleBar2.setRightText("");
                    }
                }
                gVar = (g) transferResultActivity.f27334c;
                if (gVar != null) {
                    gVar.f40342A.d(dataBean2.payStatusDesc);
                }
                gVar2 = (g) transferResultActivity.f27334c;
                if (gVar2 != null) {
                    TransferResultHeaderModel transferResultHeaderModel2 = gVar2.f40342A;
                    transferData5 = transferResultActivity.f33249e;
                    if (transferData5 != null || (payAmount = transferData5.getPayAmount()) == null) {
                        jLongValue = j6;
                    } else {
                        jLongValue = payAmount.longValue();
                    }
                    transferResultHeaderModel2.c(r0.B(jLongValue, true));
                }
                transferData = transferResultActivity.f33249e;
                if (transferData != null) {
                    iterable = transferData.orderResultList;
                    gVar3 = (g) transferResultActivity.f27334c;
                    if (gVar3 != null) {
                        r14 = gVar3.f40349f;
                        r14.removeAllViews();
                        transferData2 = transferResultActivity.f33249e;
                        if (transferData2 != null) {
                            orderResultKeyDetailBean = transferData2.orderResultKeyDetail;
                        } else {
                            orderResultKeyDetailBean = null;
                        }
                        if (iterable == null) {
                            iterable = z.f38935a;
                        }
                        it = iterable.iterator();
                        i7 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                i10 = i7 + 1;
                                if (i7 >= 0) {
                                    ?? r22 = singleAdView5;
                                    C1850q.k();
                                    throw r22;
                                }
                                orderResultItemBean = (TransferData.OrderResultItemBean) next;
                                String str15 = orderResultItemBean.contentSubKey;
                                str3 = str14;
                                singleAdView4 = singleAdView5;
                                orderResultItemModel = new OrderResultItemModel(transferResultActivity, ((str15 != null || str15.length() == 0) && ((str2 = orderResultItemBean.contentSubValue) == null || str2.length() == 0)) ? 1002 : 1008, orderResultItemBean.contentKey, orderResultItemBean.contentValue, 0.0f, 0.0f, CommonViewExtKt.getDp(20));
                                if (orderResultKeyDetailBean != null) {
                                    str13 = orderResultKeyDetailBean.paymentMethodKey;
                                } else {
                                    r15 = singleAdView4;
                                }
                                if (r15 != 0 && r15.length() != 0) {
                                    if (orderResultKeyDetailBean != null) {
                                        r21 = orderResultKeyDetailBean.paymentMethodValue;
                                    } else {
                                        r21 = singleAdView4;
                                    }
                                    if (r21 != 0 && r21.length() != 0) {
                                        str11 = orderResultItemBean.contentKey;
                                        if (orderResultKeyDetailBean != null) {
                                            obj4 = orderResultKeyDetailBean.paymentMethodKey;
                                        } else {
                                            obj4 = singleAdView4;
                                        }
                                        if (Intrinsics.c(str11, obj4)) {
                                            str12 = orderResultItemBean.contentValue;
                                            if (orderResultKeyDetailBean != null) {
                                                obj5 = orderResultKeyDetailBean.paymentMethodValue;
                                            } else {
                                                obj5 = singleAdView4;
                                            }
                                            if (Intrinsics.c(str12, obj5)) {
                                                orderResultItemModel.getItemValueTv().setTextColor(CommonViewExtKt.colorInt(c.core_color_00a49a, transferResultActivity));
                                                orderResultItemModel.k(p025ba.d.core_ic_result_flexi_loan);
                                                orderResultItemModel.j(new SpanUtils().append(orderResultItemBean.contentValue).setFontFamily("sans-serif-medium").create());
                                            }
                                        }
                                    }
                                }
                                if (orderResultKeyDetailBean != null) {
                                    r16 = orderResultKeyDetailBean.paymentMethodKey;
                                } else {
                                    r16 = singleAdView4;
                                }
                                if (r16 != 0 && r16.length() != 0) {
                                    str8 = orderResultItemBean.contentKey;
                                    if (orderResultKeyDetailBean != null) {
                                        obj3 = orderResultKeyDetailBean.paymentMethodKey;
                                    } else {
                                        obj3 = singleAdView4;
                                    }
                                    if (Intrinsics.c(str8, obj3)) {
                                        n0 n0VarG = n0.g();
                                        ViewEvent viewEvent = new ViewEvent("Transfer_Result_PaymentMehod");
                                        str9 = orderResultItemBean.contentValue;
                                        if (str9 == null) {
                                            str9 = str3;
                                        }
                                        ViewEvent viewEventAdd = viewEvent.add("paymentMethodValue", str9);
                                        transferData4 = transferResultActivity.f33249e;
                                        if (transferData4 != null || (str10 = transferData4.orderStatusDesc) == null) {
                                            str10 = str3;
                                        }
                                        n0VarG.u(viewEventAdd.add("orderStatus", str10));
                                    }
                                }
                                str4 = orderResultItemBean.contentSubUrl;
                                if (str4 != null || str4.length() == 0) {
                                    j10 = singleAdView4;
                                } else {
                                    j10 = new J(transferResultActivity, i14, str4, orderResultItemBean);
                                }
                                orderResultItemModel.n(orderResultItemBean.contentSubKey, orderResultItemBean.contentSubValue, j10);
                                layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                if (i7 > 0) {
                                    layoutParams.topMargin = CommonViewExtKt.getDp(12);
                                }
                                r14.addView(orderResultItemModel, layoutParams);
                                transferData3 = transferResultActivity.f33249e;
                                if (transferData3 != null) {
                                    orderResultKeyDetailBean2 = transferData3.orderResultKeyDetail;
                                } else {
                                    r17 = singleAdView4;
                                }
                                if (r17 != 0) {
                                    str7 = r17.recipientAccountKey;
                                } else {
                                    r18 = singleAdView4;
                                }
                                if (r18 != 0) {
                                    r17 = orderResultKeyDetailBean2;
                                    if (r18.length() == 0) {
                                        r17 = orderResultKeyDetailBean2;
                                        r18 = str7;
                                        continue;
                                    } else {
                                        str5 = orderResultItemBean.contentKey;
                                        if (r17 != 0) {
                                            r17 = orderResultKeyDetailBean2;
                                            r18 = str7;
                                            obj2 = r17.recipientAccountKey;
                                        } else {
                                            r17 = orderResultKeyDetailBean2;
                                            r18 = str7;
                                            obj2 = singleAdView4;
                                        }
                                        if (Intrinsics.c(str5, obj2)) {
                                            continue;
                                        } else {
                                            if (r17 != 0) {
                                                str6 = r17.recipientAccountValue;
                                            } else {
                                                r19 = singleAdView4;
                                            }
                                            if (r19 == 0 && r19.length() != 0) {
                                                String str16 = orderResultItemBean.contentValue;
                                                View viewInflate5 = transferResultActivity.getLayoutInflater().inflate(p159kd.f.sm_item_transfer_result_invite, r14, false);
                                                int i17 = p159kd.e.btnInvite;
                                                PpButton ppButton = (PpButton) p059e1.a.m(i17, viewInflate5);
                                                if (ppButton != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate5;
                                                    int i18 = p159kd.e.ivArrow;
                                                    if (((AppCompatImageView) p059e1.a.m(i18, viewInflate5)) != null) {
                                                        i18 = p159kd.e.tvInviteTip;
                                                        ?? r23 = (HtmlTextView) p059e1.a.m(i18, viewInflate5);
                                                        if (r23 != 0) {
                                                            Bc.l lVar = new Bc.l(constraintLayout, ppButton, (HtmlTextView) r23);
                                                            Intrinsics.checkNotNullExpressionValue(lVar, "inflate(...)");
                                                            if (r17 != 0) {
                                                                g gVar29 = (g) transferResultActivity.f27334c;
                                                                if (gVar29 != null) {
                                                                    r19 = str6;
                                                                    view = gVar29.f40353o;
                                                                } else {
                                                                    r19 = str6;
                                                                    view = singleAdView4;
                                                                }
                                                                String str17 = (!i0.V(view) || TextUtils.isEmpty(r17.recipientAccountDarkValue)) ? r17.recipientAccountValue : r17.recipientAccountDarkValue;
                                                                if (str17 != null) {
                                                                    ?? r24 = str17.length() > 0 ? str17 : singleAdView4;
                                                                    if (r24 != 0) {
                                                                        try {
                                                                            r23.setHtml(r24);
                                                                        } catch (Exception e10) {
                                                                            d.c(transferResultActivity.TAG, "addInviteTipItem: ", e10);
                                                                        }
                                                                        TransferTrackingUtils.INSTANCE.logInviteGuideShow(TransferTrackingUtils.EVENT_SUCCESS_INVITE_SHOW, str16, r24);
                                                                    }
                                                                }
                                                            }
                                                            r19 = str6;
                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) lVar.f754b;
                                                            ViewGroup.LayoutParams layoutParams3 = constraintLayout2.getLayoutParams();
                                                            if (layoutParams3 instanceof LinearLayout.LayoutParams) {
                                                                layoutParams2 = (LinearLayout.LayoutParams) layoutParams3;
                                                            } else {
                                                                r20 = singleAdView4;
                                                            }
                                                            if (r20 != 0) {
                                                                r20 = layoutParams2;
                                                                ((LinearLayout.LayoutParams) r20).topMargin = CommonViewExtKt.getDp(4);
                                                            }
                                                            r20 = layoutParams2;
                                                            final Hb.L l5 = new Hb.L(25, transferResultActivity, str16);
                                                            ((PpButton) lVar.f755c).setOnClickListener(new View.OnClickListener() { // from class: rd.N
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view2) {
                                                                    Hb.L l6 = l5;
                                                                    switch (i13) {
                                                                        case 0:
                                                                            ArrayList arrayList = TransferResultActivity.f33237Z;
                                                                            l6.invoke();
                                                                            break;
                                                                        default:
                                                                            ArrayList arrayList2 = TransferResultActivity.f33237Z;
                                                                            l6.invoke();
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: rd.N
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view2) {
                                                                    Hb.L l6 = l5;
                                                                    switch (i15) {
                                                                        case 0:
                                                                            ArrayList arrayList = TransferResultActivity.f33237Z;
                                                                            l6.invoke();
                                                                            break;
                                                                        default:
                                                                            ArrayList arrayList2 = TransferResultActivity.f33237Z;
                                                                            l6.invoke();
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            r14.addView(constraintLayout2);
                                                        } else {
                                                            r19 = str6;
                                                        }
                                                    } else {
                                                        r19 = str6;
                                                    }
                                                    i17 = i18;
                                                } else {
                                                    r19 = str6;
                                                }
                                                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate5.getResources().getResourceName(i17)));
                                            }
                                            r19 = str6;
                                        }
                                    }
                                } else {
                                    r17 = orderResultKeyDetailBean2;
                                    r17 = orderResultKeyDetailBean2;
                                    r18 = str7;
                                }
                                i7 = i10;
                                singleAdView5 = singleAdView4;
                                str14 = str3;
                            }
                        }
                    }
                    singleAdView = singleAdView5;
                    gVar4 = (g) transferResultActivity.f27334c;
                    if (gVar4 != null) {
                        IconicsTextView iconicsTextView = gVar4.f40356w;
                        h.C(iconicsTextView);
                        iconicsTextView.setOnClickListener(new n(23, transferResultActivity, transferData));
                    }
                    gVar5 = (g) transferResultActivity.f27334c;
                    if (gVar5 != null) {
                        linearLayout = gVar5.f40348e;
                        list2 = transferData.orderResultList;
                        if (list2 != null || list2.isEmpty()) {
                            h.c(linearLayout);
                        } else {
                            h.C(linearLayout);
                        }
                    }
                    billProcessDetail = transferData.orderStatusInfo;
                    if (billProcessDetail != null) {
                        transferToBankProgressModel = transferResultActivity.f33242H;
                        if (transferToBankProgressModel != null) {
                            h.c(transferToBankProgressModel);
                            Unit unit2 = Unit.f38893a;
                        }
                    } else if (billProcessDetail.showProcessBar) {
                        list = billProcessDetail.tips;
                        if (list != null) {
                            if (list.size() <= 0) {
                                r11 = list;
                                r11 = singleAdView;
                            }
                            if (r11 != 0) {
                                if (transferResultActivity.f33242H == null) {
                                    viewStub4 = (ViewStub) transferResultActivity.findViewById(p159kd.e.vs_transfer_to_bank_progress);
                                    if (viewStub4 != null) {
                                        viewInflate4 = viewStub4.inflate();
                                    } else {
                                        viewInflate4 = singleAdView;
                                    }
                                    if (viewInflate4 != null) {
                                        r13 = (TransferToBankProgressModel) viewInflate4.findViewById(p159kd.e.v_progress_to_bank);
                                    } else {
                                        r13 = singleAdView;
                                    }
                                    transferResultActivity.f33242H = r13;
                                }
                                transferToBankProgressModel3 = transferResultActivity.f33242H;
                                if (transferToBankProgressModel3 != null) {
                                    h.C(transferToBankProgressModel3);
                                }
                                r12 = transferResultActivity.f33242H;
                                if (r12 != 0) {
                                    r12.a(r11, true);
                                }
                                earlyRefundFeeInfoBean = transferData.earlyRefundFeeInfo;
                                if (earlyRefundFeeInfoBean != null && (transferToBankProgressModel4 = transferResultActivity.f33242H) != null) {
                                    transferToBankProgressModel4.setEarlyRefund(earlyRefundFeeInfoBean);
                                }
                            }
                        }
                    } else {
                        transferToBankProgressModel2 = transferResultActivity.f33242H;
                        if (transferToBankProgressModel2 != null) {
                            h.c(transferToBankProgressModel2);
                        }
                    }
                    transferDetailCompensation = transferData.compensation;
                    if (transferDetailCompensation != null) {
                        if (transferResultActivity.isDarkMode() || TextUtils.isEmpty(transferDetailCompensation.getSuccessDarkCompensationPic())) {
                            successCompensationPic = transferDetailCompensation.getSuccessCompensationPic();
                        } else {
                            successCompensationPic = transferDetailCompensation.getSuccessDarkCompensationPic();
                        }
                        if (TextUtils.isEmpty(successCompensationPic)) {
                            gVar10 = (g) transferResultActivity.f27334c;
                            if (gVar10 != null && (transferResultImage = gVar10.f40342A.getTransferResultImage()) != null) {
                                h.c(transferResultImage);
                            }
                            if (transferResultActivity.f33241C == null) {
                                viewStub3 = (ViewStub) transferResultActivity.findViewById(p159kd.e.vs_transfer_to_bank_fast_refund_progress);
                                if (viewStub3 != null) {
                                    viewInflate3 = viewStub3.inflate();
                                } else {
                                    viewInflate3 = singleAdView;
                                }
                                if (viewInflate3 != null) {
                                    r10 = (TransferToFastTransferSafeguardProgressModel) viewInflate3.findViewById(p159kd.e.v_progress_fast_refund);
                                } else {
                                    r10 = singleAdView;
                                }
                                transferResultActivity.f33241C = r10;
                            }
                            transferToFastTransferSafeguardProgressModel2 = transferResultActivity.f33241C;
                            if (transferToFastTransferSafeguardProgressModel2 != null) {
                                transferToFastTransferSafeguardProgressModel2.setOnFastTransferSafeguardListener(new M(transferResultActivity));
                            }
                            transferToFastTransferSafeguardProgressModel3 = transferResultActivity.f33241C;
                            if (transferToFastTransferSafeguardProgressModel3 != null) {
                                transferToFastTransferSafeguardProgressModel3.c(transferResultActivity, transferDetailCompensation);
                            }
                        } else {
                            gVar11 = (g) transferResultActivity.f27334c;
                            if (gVar11 != null) {
                                gVar11.f40342A.setTransferResultImage(successCompensationPic);
                            }
                            gVar12 = (g) transferResultActivity.f27334c;
                            if (gVar12 != null && (transferResultImage2 = gVar12.f40342A.getTransferResultImage()) != null) {
                                transferResultImage2.setOnClickListener(new n(24, transferResultActivity, transferDetailCompensation));
                            }
                            transferToFastTransferSafeguardProgressModel4 = transferResultActivity.f33241C;
                            if (transferToFastTransferSafeguardProgressModel4 != null) {
                                h.c(transferToFastTransferSafeguardProgressModel4);
                            }
                        }
                    } else {
                        transferToFastTransferSafeguardProgressModel = transferResultActivity.f33241C;
                        if (transferToFastTransferSafeguardProgressModel != null) {
                            h.c(transferToFastTransferSafeguardProgressModel);
                            Unit unit3 = Unit.f38893a;
                        }
                    }
                    orderCompensateBean = transferData.orderCompensate;
                    if (orderCompensateBean != null) {
                        transferToPalmPayProgressView = transferResultActivity.f33243L;
                        if (transferToPalmPayProgressView != null) {
                            h.c(transferToPalmPayProgressView);
                            Unit unit4 = Unit.f38893a;
                        }
                    } else if (Intrinsics.c(orderCompensateBean.getShowCompensate(), Boolean.TRUE)) {
                        if (transferResultActivity.f33243L == null) {
                            viewStub2 = (ViewStub) transferResultActivity.findViewById(p159kd.e.vs_transfer_to_palmpay_progress);
                            if (viewStub2 != null) {
                                viewInflate2 = viewStub2.inflate();
                            } else {
                                viewInflate2 = singleAdView;
                            }
                            if (viewInflate2 != null) {
                                r3 = (TransferToPalmPayProgressView) viewInflate2.findViewById(p159kd.e.v_progress_to_palmpay);
                            } else {
                                r3 = singleAdView;
                            }
                            transferResultActivity.f33243L = r3;
                        }
                        transferToPalmPayProgressView2 = transferResultActivity.f33243L;
                        if (transferToPalmPayProgressView2 != null) {
                            transferToPalmPayProgressView2.setData(orderCompensateBean);
                        }
                    }
                    guideInfoBean = transferData.bankGuidePp;
                    if (guideInfoBean != null) {
                        gVar7 = (g) transferResultActivity.f27334c;
                        if (gVar7 != null) {
                            h.C(gVar7.f40355v);
                        }
                        gVar8 = (g) transferResultActivity.f27334c;
                        if (gVar8 != null) {
                            gVar8.f40355v.setText(new SpanUtils().append(guideInfoBean.contentPrefix).append(guideInfoBean.contentSuffix).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, transferResultActivity)).create());
                        }
                        str = guideInfoBean.jumpPath;
                        if (str != null) {
                            if (TextUtils.isEmpty(str)) {
                                obj = str;
                                obj = singleAdView;
                            }
                            if (obj != null && (gVar9 = (g) transferResultActivity.f27334c) != null) {
                                gVar9.f40355v.setOnClickListener(new n(25, transferResultActivity, guideInfoBean));
                            }
                        }
                    } else {
                        gVar6 = (g) transferResultActivity.f27334c;
                        if (gVar6 != null) {
                            h.c(gVar6.f40355v);
                            Unit unit5 = Unit.f38893a;
                        }
                    }
                    if (transferData.getBusinessType() == 14) {
                        if (transferData.redeemPoint <= j6 || transferData.cashEarned > j6) {
                            if (transferResultActivity.f33247Y == null) {
                                viewStub = (ViewStub) transferResultActivity.findViewById(p159kd.e.vs_cashback);
                                if (viewStub != null) {
                                    viewInflate = viewStub.inflate();
                                } else {
                                    viewInflate = singleAdView;
                                }
                                if (viewInflate != null) {
                                    singleAdView3 = (SingleAdView) viewInflate.findViewById(p159kd.e.ad_result);
                                } else {
                                    singleAdView3 = singleAdView;
                                }
                                transferResultActivity.f33247Y = singleAdView3;
                            }
                            singleAdView2 = transferResultActivity.f33247Y;
                            if (singleAdView2 != null) {
                                singleAdView2.setSlotId(transferResultActivity.getString(k.ad_send_money_result_cash_back));
                                singleAdView2.setAdListener(new Ab.k(28));
                            }
                        }
                        return;
                    }
                }
            }
            n0.g().u((ViewEvent) G.g("Transfer_SuccessfulResult_View", true));
            transferResultActivity.t = true;
            g gVar30 = (g) transferResultActivity.f27334c;
            if (gVar30 != null && (t0Var2 = gVar30.f40342A.f33885f) != null) {
                t0Var2.cancel((CancellationException) null);
            }
            AutoTrackUtil.trackTransactionResult(transferResultActivity, 1);
            if (transferResultActivity.f33245Q == null) {
                ViewStub viewStub5 = (ViewStub) transferResultActivity.findViewById(p159kd.e.vs_view_ad);
                View viewInflate6 = viewStub5 != null ? viewStub5.inflate() : null;
                transferResultActivity.f33245Q = viewInflate6 != null ? (SingleAdView) viewInflate6.findViewById(p159kd.e.ad_result) : null;
            }
            SingleAdView singleAdView6 = transferResultActivity.f33245Q;
            if (singleAdView6 != null) {
                singleAdView6.setSlotId(org.chromium.support_lib_boundary.util.b.z("03"));
                singleAdView6.setAdListener(new com.chuanyi.ad.a(singleAdView6, ""));
            }
            if (transferResultActivity.f33246X == null) {
                ViewStub viewStub6 = (ViewStub) transferResultActivity.findViewById(p159kd.e.vs_success);
                View viewInflate7 = viewStub6 != null ? viewStub6.inflate() : null;
                transferResultActivity.f33246X = viewInflate7 != null ? (SingleAdView) viewInflate7.findViewById(p159kd.e.ad_result) : null;
            }
            SingleAdView singleAdView7 = transferResultActivity.f33246X;
            if (singleAdView7 != null) {
                singleAdView7.setSlotId(transferResultActivity.getString(k.ad_send_money_result_success1));
                singleAdView7.setAdListener(new com.chuanyi.ad.a(singleAdView7, ""));
            }
            g gVar31 = (g) transferResultActivity.f27334c;
            if (gVar31 != null) {
                gVar31.f40342A.e(TransactionResultHeaderModel.a.successIcon$default(TransactionResultHeaderModel.f31650j, transferResultActivity, 0.0f, 2, null));
            }
            if (TextUtils.isEmpty(dataBean2.successfulDesc)) {
                g gVar32 = (g) transferResultActivity.f27334c;
                if (gVar32 != null && (orderResultStatusTipsTv3 = gVar32.f40342A.getOrderResultStatusTipsTv()) != null) {
                    h.c(orderResultStatusTipsTv3);
                }
            } else {
                g gVar33 = (g) transferResultActivity.f27334c;
                if (gVar33 != null) {
                    gVar33.f40342A.f(dataBean2.successfulDesc);
                }
            }
            if (transferResultActivity.f33244M == null) {
                ViewStub viewStub7 = (ViewStub) transferResultActivity.findViewById(p159kd.e.vs_payment_rewards);
                View viewInflate8 = viewStub7 != null ? viewStub7.inflate() : null;
                OrderResultRewardModel orderResultRewardModel = viewInflate8 != null ? (OrderResultRewardModel) viewInflate8.findViewById(p159kd.e.vReward) : null;
                transferResultActivity.f33244M = orderResultRewardModel;
                if (orderResultRewardModel != null) {
                    orderResultRewardModel.setOnClaimRewardListener(new M(transferResultActivity));
                }
            }
            OrderResultRewardModel orderResultRewardModel2 = transferResultActivity.f33244M;
            if (orderResultRewardModel2 != null) {
                orderResultRewardModel2.a("03", dataBean2.payId, dataBean2.orderNo);
            }
            if (transferResultActivity.f33257w) {
                transferResultActivity.f33257w = false;
                if (transferResultActivity.f33239A == null) {
                    transferResultActivity.f33239A = new p131id.a(transferResultActivity);
                }
                TransferResultViewModel transferResultViewModel2 = (TransferResultViewModel) transferResultActivity.l();
                p131id.a aVar = transferResultActivity.f33239A;
                DialogConfigSettingsReq req = new DialogConfigSettingsReq(aVar != null ? Boolean.valueOf(aVar.W()) : null, Boolean.valueOf(io.fastkv.n.x()), null, null, Boolean.valueOf(BaseApplication.get().getUser().isLoginPswSet()), 1, null, null, null, Boolean.valueOf(new androidx.core.app.M(transferResultActivity).f15943b.areNotificationsEnabled()), 2, 460, null);
                transferResultViewModel2.getClass();
                Intrinsics.checkNotNullParameter(req, "req");
                p140j8.f.v(transferResultViewModel2, new G0(req, null), transferResultViewModel2.f34039o, 0L);
            }
            g gVar34 = (g) transferResultActivity.f27334c;
            if (gVar34 != null) {
                PpTitleBar ppTitleBar3 = gVar34.f40354p;
                ImageView backImageView3 = ppTitleBar3.getBackImageView();
                if (backImageView3 != null) {
                    h.c(backImageView3);
                }
                ImageView rightImageView7 = ppTitleBar3.getRightImageView1();
                Intrinsics.checkNotNullExpressionValue(rightImageView7, "getRightImageView1(...)");
                h.c(rightImageView7);
            }
            g gVar35 = (g) transferResultActivity.f27334c;
            if (gVar35 != null) {
                gVar35.f40346c.setOnClickListener(new L(transferResultActivity, i11));
            }
            g gVar36 = (g) transferResultActivity.f27334c;
            if (gVar36 != null) {
                LinearLayout linearLayout2 = gVar36.f40345b;
                TransferData transferData7 = transferResultActivity.f33249e;
                if ((transferData7 == null || (addFavoriteRelationshipBean = transferData7.favoriteLabel) == null) ? false : Intrinsics.c(addFavoriteRelationshipBean.getShow(), Boolean.TRUE)) {
                    linearLayout2.setOnClickListener(new L(transferResultActivity, i14));
                    h.C(linearLayout2);
                } else {
                    h.c(linearLayout2);
                    g gVar37 = (g) transferResultActivity.f27334c;
                    ViewGroup.LayoutParams layoutParams4 = gVar37 != null ? gVar37.f40346c.getLayoutParams() : null;
                    Intrinsics.f(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
                    layoutParams5.weight = 0.0f;
                    layoutParams5.width = CommonViewExtKt.getDp(140);
                    g gVar38 = (g) transferResultActivity.f27334c;
                    if (gVar38 != null) {
                        gVar38.f40346c.setLayoutParams(layoutParams5);
                    }
                }
            }
            j6 = 0;
            gVar = (g) transferResultActivity.f27334c;
            if (gVar != null) {
                gVar.f40342A.d(dataBean2.payStatusDesc);
            }
            gVar2 = (g) transferResultActivity.f27334c;
            if (gVar2 != null) {
                TransferResultHeaderModel transferResultHeaderModel3 = gVar2.f40342A;
                transferData5 = transferResultActivity.f33249e;
                if (transferData5 != null) {
                    jLongValue = j6;
                } else {
                    jLongValue = j6;
                }
                transferResultHeaderModel3.c(r0.B(jLongValue, true));
            }
            transferData = transferResultActivity.f33249e;
            if (transferData != null) {
                iterable = transferData.orderResultList;
                gVar3 = (g) transferResultActivity.f27334c;
                if (gVar3 != null) {
                    r14 = gVar3.f40349f;
                    r14.removeAllViews();
                    transferData2 = transferResultActivity.f33249e;
                    if (transferData2 != null) {
                        orderResultKeyDetailBean = transferData2.orderResultKeyDetail;
                    } else {
                        orderResultKeyDetailBean = null;
                    }
                    if (iterable == null) {
                        iterable = z.f38935a;
                    }
                    it = iterable.iterator();
                    i7 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            i10 = i7 + 1;
                            if (i7 >= 0) {
                                ?? r25 = singleAdView5;
                                C1850q.k();
                                throw r25;
                            }
                            orderResultItemBean = (TransferData.OrderResultItemBean) next;
                            String str18 = orderResultItemBean.contentSubKey;
                            str3 = str14;
                            singleAdView4 = singleAdView5;
                            orderResultItemModel = new OrderResultItemModel(transferResultActivity, ((str18 != null || str18.length() == 0) && ((str2 = orderResultItemBean.contentSubValue) == null || str2.length() == 0)) ? 1002 : 1008, orderResultItemBean.contentKey, orderResultItemBean.contentValue, 0.0f, 0.0f, CommonViewExtKt.getDp(20));
                            if (orderResultKeyDetailBean != null) {
                                str13 = orderResultKeyDetailBean.paymentMethodKey;
                            } else {
                                r15 = singleAdView4;
                            }
                            if (r15 != 0) {
                                if (orderResultKeyDetailBean != null) {
                                    r21 = orderResultKeyDetailBean.paymentMethodValue;
                                } else {
                                    r21 = singleAdView4;
                                }
                                if (r21 != 0) {
                                    str11 = orderResultItemBean.contentKey;
                                    if (orderResultKeyDetailBean != null) {
                                        obj4 = orderResultKeyDetailBean.paymentMethodKey;
                                    } else {
                                        obj4 = singleAdView4;
                                    }
                                    if (Intrinsics.c(str11, obj4)) {
                                        str12 = orderResultItemBean.contentValue;
                                        if (orderResultKeyDetailBean != null) {
                                            obj5 = orderResultKeyDetailBean.paymentMethodValue;
                                        } else {
                                            obj5 = singleAdView4;
                                        }
                                        if (Intrinsics.c(str12, obj5)) {
                                            orderResultItemModel.getItemValueTv().setTextColor(CommonViewExtKt.colorInt(c.core_color_00a49a, transferResultActivity));
                                            orderResultItemModel.k(p025ba.d.core_ic_result_flexi_loan);
                                            orderResultItemModel.j(new SpanUtils().append(orderResultItemBean.contentValue).setFontFamily("sans-serif-medium").create());
                                        }
                                    }
                                }
                            }
                            if (orderResultKeyDetailBean != null) {
                                r16 = orderResultKeyDetailBean.paymentMethodKey;
                            } else {
                                r16 = singleAdView4;
                            }
                            if (r16 != 0) {
                                str8 = orderResultItemBean.contentKey;
                                if (orderResultKeyDetailBean != null) {
                                    obj3 = orderResultKeyDetailBean.paymentMethodKey;
                                } else {
                                    obj3 = singleAdView4;
                                }
                                if (Intrinsics.c(str8, obj3)) {
                                    n0 n0VarG2 = n0.g();
                                    ViewEvent viewEvent2 = new ViewEvent("Transfer_Result_PaymentMehod");
                                    str9 = orderResultItemBean.contentValue;
                                    if (str9 == null) {
                                        str9 = str3;
                                    }
                                    ViewEvent viewEventAdd2 = viewEvent2.add("paymentMethodValue", str9);
                                    transferData4 = transferResultActivity.f33249e;
                                    if (transferData4 != null) {
                                        str10 = str3;
                                    } else {
                                        str10 = str3;
                                    }
                                    n0VarG2.u(viewEventAdd2.add("orderStatus", str10));
                                }
                            }
                            str4 = orderResultItemBean.contentSubUrl;
                            if (str4 != null) {
                                j10 = singleAdView4;
                            } else {
                                j10 = singleAdView4;
                            }
                            orderResultItemModel.n(orderResultItemBean.contentSubKey, orderResultItemBean.contentSubValue, j10);
                            layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            if (i7 > 0) {
                                layoutParams.topMargin = CommonViewExtKt.getDp(12);
                            }
                            r14.addView(orderResultItemModel, layoutParams);
                            transferData3 = transferResultActivity.f33249e;
                            if (transferData3 != null) {
                                orderResultKeyDetailBean2 = transferData3.orderResultKeyDetail;
                            } else {
                                r17 = singleAdView4;
                            }
                            if (r17 != 0) {
                                str7 = r17.recipientAccountKey;
                            } else {
                                r18 = singleAdView4;
                            }
                            if (r18 != 0) {
                                r17 = orderResultKeyDetailBean2;
                                if (r18.length() == 0) {
                                    r17 = orderResultKeyDetailBean2;
                                    r18 = str7;
                                    continue;
                                } else {
                                    str5 = orderResultItemBean.contentKey;
                                    if (r17 != 0) {
                                        r17 = orderResultKeyDetailBean2;
                                        r18 = str7;
                                        obj2 = r17.recipientAccountKey;
                                    } else {
                                        r17 = orderResultKeyDetailBean2;
                                        r18 = str7;
                                        obj2 = singleAdView4;
                                    }
                                    if (Intrinsics.c(str5, obj2)) {
                                        if (r17 != 0) {
                                            str6 = r17.recipientAccountValue;
                                        } else {
                                            r19 = singleAdView4;
                                        }
                                        if (r19 == 0) {
                                            r19 = str6;
                                        } else {
                                            r19 = str6;
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                r17 = orderResultKeyDetailBean2;
                                r17 = orderResultKeyDetailBean2;
                                r18 = str7;
                            }
                            i7 = i10;
                            singleAdView5 = singleAdView4;
                            str14 = str3;
                        }
                    }
                }
                singleAdView = singleAdView5;
                gVar4 = (g) transferResultActivity.f27334c;
                if (gVar4 != null) {
                    IconicsTextView iconicsTextView2 = gVar4.f40356w;
                    h.C(iconicsTextView2);
                    iconicsTextView2.setOnClickListener(new n(23, transferResultActivity, transferData));
                }
                gVar5 = (g) transferResultActivity.f27334c;
                if (gVar5 != null) {
                    linearLayout = gVar5.f40348e;
                    list2 = transferData.orderResultList;
                    if (list2 != null) {
                        h.c(linearLayout);
                    } else {
                        h.c(linearLayout);
                    }
                }
                billProcessDetail = transferData.orderStatusInfo;
                if (billProcessDetail != null) {
                    transferToBankProgressModel = transferResultActivity.f33242H;
                    if (transferToBankProgressModel != null) {
                        h.c(transferToBankProgressModel);
                        Unit unit6 = Unit.f38893a;
                    }
                } else if (billProcessDetail.showProcessBar) {
                    list = billProcessDetail.tips;
                    if (list != null) {
                        if (list.size() <= 0) {
                            r11 = list;
                            r11 = singleAdView;
                        }
                        if (r11 != 0) {
                            if (transferResultActivity.f33242H == null) {
                                viewStub4 = (ViewStub) transferResultActivity.findViewById(p159kd.e.vs_transfer_to_bank_progress);
                                if (viewStub4 != null) {
                                    viewInflate4 = viewStub4.inflate();
                                } else {
                                    viewInflate4 = singleAdView;
                                }
                                if (viewInflate4 != null) {
                                    r13 = (TransferToBankProgressModel) viewInflate4.findViewById(p159kd.e.v_progress_to_bank);
                                } else {
                                    r13 = singleAdView;
                                }
                                transferResultActivity.f33242H = r13;
                            }
                            transferToBankProgressModel3 = transferResultActivity.f33242H;
                            if (transferToBankProgressModel3 != null) {
                                h.C(transferToBankProgressModel3);
                            }
                            r12 = transferResultActivity.f33242H;
                            if (r12 != 0) {
                                r12.a(r11, true);
                            }
                            earlyRefundFeeInfoBean = transferData.earlyRefundFeeInfo;
                            if (earlyRefundFeeInfoBean != null) {
                                transferToBankProgressModel4.setEarlyRefund(earlyRefundFeeInfoBean);
                            }
                        }
                    }
                } else {
                    transferToBankProgressModel2 = transferResultActivity.f33242H;
                    if (transferToBankProgressModel2 != null) {
                        h.c(transferToBankProgressModel2);
                    }
                }
                transferDetailCompensation = transferData.compensation;
                if (transferDetailCompensation != null) {
                    if (transferResultActivity.isDarkMode()) {
                        successCompensationPic = transferDetailCompensation.getSuccessCompensationPic();
                    } else {
                        successCompensationPic = transferDetailCompensation.getSuccessCompensationPic();
                    }
                    if (TextUtils.isEmpty(successCompensationPic)) {
                        gVar11 = (g) transferResultActivity.f27334c;
                        if (gVar11 != null) {
                            gVar11.f40342A.setTransferResultImage(successCompensationPic);
                        }
                        gVar12 = (g) transferResultActivity.f27334c;
                        if (gVar12 != null) {
                            transferResultImage2.setOnClickListener(new n(24, transferResultActivity, transferDetailCompensation));
                        }
                        transferToFastTransferSafeguardProgressModel4 = transferResultActivity.f33241C;
                        if (transferToFastTransferSafeguardProgressModel4 != null) {
                            h.c(transferToFastTransferSafeguardProgressModel4);
                        }
                    } else {
                        gVar10 = (g) transferResultActivity.f27334c;
                        if (gVar10 != null) {
                            h.c(transferResultImage);
                        }
                        if (transferResultActivity.f33241C == null) {
                            viewStub3 = (ViewStub) transferResultActivity.findViewById(p159kd.e.vs_transfer_to_bank_fast_refund_progress);
                            if (viewStub3 != null) {
                                viewInflate3 = viewStub3.inflate();
                            } else {
                                viewInflate3 = singleAdView;
                            }
                            if (viewInflate3 != null) {
                                r10 = (TransferToFastTransferSafeguardProgressModel) viewInflate3.findViewById(p159kd.e.v_progress_fast_refund);
                            } else {
                                r10 = singleAdView;
                            }
                            transferResultActivity.f33241C = r10;
                        }
                        transferToFastTransferSafeguardProgressModel2 = transferResultActivity.f33241C;
                        if (transferToFastTransferSafeguardProgressModel2 != null) {
                            transferToFastTransferSafeguardProgressModel2.setOnFastTransferSafeguardListener(new M(transferResultActivity));
                        }
                        transferToFastTransferSafeguardProgressModel3 = transferResultActivity.f33241C;
                        if (transferToFastTransferSafeguardProgressModel3 != null) {
                            transferToFastTransferSafeguardProgressModel3.c(transferResultActivity, transferDetailCompensation);
                        }
                    }
                } else {
                    transferToFastTransferSafeguardProgressModel = transferResultActivity.f33241C;
                    if (transferToFastTransferSafeguardProgressModel != null) {
                        h.c(transferToFastTransferSafeguardProgressModel);
                        Unit unit7 = Unit.f38893a;
                    }
                }
                orderCompensateBean = transferData.orderCompensate;
                if (orderCompensateBean != null) {
                    transferToPalmPayProgressView = transferResultActivity.f33243L;
                    if (transferToPalmPayProgressView != null) {
                        h.c(transferToPalmPayProgressView);
                        Unit unit8 = Unit.f38893a;
                    }
                } else if (Intrinsics.c(orderCompensateBean.getShowCompensate(), Boolean.TRUE)) {
                    if (transferResultActivity.f33243L == null) {
                        viewStub2 = (ViewStub) transferResultActivity.findViewById(p159kd.e.vs_transfer_to_palmpay_progress);
                        if (viewStub2 != null) {
                            viewInflate2 = viewStub2.inflate();
                        } else {
                            viewInflate2 = singleAdView;
                        }
                        if (viewInflate2 != null) {
                            r3 = (TransferToPalmPayProgressView) viewInflate2.findViewById(p159kd.e.v_progress_to_palmpay);
                        } else {
                            r3 = singleAdView;
                        }
                        transferResultActivity.f33243L = r3;
                    }
                    transferToPalmPayProgressView2 = transferResultActivity.f33243L;
                    if (transferToPalmPayProgressView2 != null) {
                        transferToPalmPayProgressView2.setData(orderCompensateBean);
                    }
                }
                guideInfoBean = transferData.bankGuidePp;
                if (guideInfoBean != null) {
                    gVar7 = (g) transferResultActivity.f27334c;
                    if (gVar7 != null) {
                        h.C(gVar7.f40355v);
                    }
                    gVar8 = (g) transferResultActivity.f27334c;
                    if (gVar8 != null) {
                        gVar8.f40355v.setText(new SpanUtils().append(guideInfoBean.contentPrefix).append(guideInfoBean.contentSuffix).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, transferResultActivity)).create());
                    }
                    str = guideInfoBean.jumpPath;
                    if (str != null) {
                        if (TextUtils.isEmpty(str)) {
                            obj = str;
                            obj = singleAdView;
                        }
                        if (obj != null) {
                            gVar9.f40355v.setOnClickListener(new n(25, transferResultActivity, guideInfoBean));
                        }
                    }
                } else {
                    gVar6 = (g) transferResultActivity.f27334c;
                    if (gVar6 != null) {
                        h.c(gVar6.f40355v);
                        Unit unit9 = Unit.f38893a;
                    }
                }
                if (transferData.getBusinessType() == 14) {
                    if (transferData.redeemPoint <= j6) {
                    }
                    if (transferResultActivity.f33247Y == null) {
                        viewStub = (ViewStub) transferResultActivity.findViewById(p159kd.e.vs_cashback);
                        if (viewStub != null) {
                            viewInflate = viewStub.inflate();
                        } else {
                            viewInflate = singleAdView;
                        }
                        if (viewInflate != null) {
                            singleAdView3 = (SingleAdView) viewInflate.findViewById(p159kd.e.ad_result);
                        } else {
                            singleAdView3 = singleAdView;
                        }
                        transferResultActivity.f33247Y = singleAdView3;
                    }
                    singleAdView2 = transferResultActivity.f33247Y;
                    if (singleAdView2 != null) {
                        singleAdView2.setSlotId(transferResultActivity.getString(k.ad_send_money_result_cash_back));
                        singleAdView2.setAdListener(new Ab.k(28));
                    }
                }
            }
        }
    }

    public static void p(TransferResultActivity transferResultActivity, String str, String str2) {
        transferResultActivity.getClass();
        ClickEvent clickEventAdd = new ClickEvent(str).add("element_name", str2);
        if ("TransferPaymentResultsView".equalsIgnoreCase(str) || "TransferPaymentResultsClick".equalsIgnoreCase(str)) {
            clickEventAdd.afEvt(true);
        }
        n0.g().k(clickEventAdd);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Handler uIHandler = getUIHandler();
        Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
        getWindow().getDecorView().post(new p7.h(uIHandler, 3, this, false));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(p159kd.f.sm_activity_transfer_result, (ViewGroup) null, false);
        int i7 = p159kd.e.btnAddToFavorite;
        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
        if (linearLayout != null) {
            i7 = p159kd.e.btnShareReceipt;
            LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
            if (linearLayout2 != null) {
                i7 = p159kd.e.iivFovarit;
                IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                if (iconicsImageView != null) {
                    i7 = p159kd.e.llOrderResultCard;
                    LinearLayout linearLayout3 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                    if (linearLayout3 != null) {
                        i7 = p159kd.e.llOrderResultList;
                        LinearLayout linearLayout4 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                        if (linearLayout4 != null) {
                            i7 = p159kd.e.llSuccessfulBtn;
                            LinearLayout linearLayout5 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                            if (linearLayout5 != null) {
                                i7 = p159kd.e.result_right_btn;
                                Button button = (Button) p059e1.a.m(i7, viewInflate);
                                if (button != null) {
                                    i7 = p159kd.e.result_two_btn_view;
                                    LinearLayout linearLayout6 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                    if (linearLayout6 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        i7 = p159kd.e.title_bar;
                                        PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                        if (ppTitleBar != null) {
                                            i7 = p159kd.e.tvAddFavorite;
                                            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView != null) {
                                                i7 = p159kd.e.tvTransferToPP;
                                                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView2 != null) {
                                                    i7 = p159kd.e.tv_view_detail;
                                                    IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i7, viewInflate);
                                                    if (iconicsTextView != null) {
                                                        i7 = p159kd.e.v_header;
                                                        TransferResultHeaderModel transferResultHeaderModel = (TransferResultHeaderModel) p059e1.a.m(i7, viewInflate);
                                                        if (transferResultHeaderModel != null) {
                                                            i7 = p159kd.e.viewFailOkcardAd;
                                                            FailResultPageAdView failResultPageAdView = (FailResultPageAdView) p059e1.a.m(i7, viewInflate);
                                                            if (failResultPageAdView != null) {
                                                                i7 = p159kd.e.vs_cashback;
                                                                if (((ViewStub) p059e1.a.m(i7, viewInflate)) != null) {
                                                                    i7 = p159kd.e.vs_fail;
                                                                    if (((ViewStub) p059e1.a.m(i7, viewInflate)) != null) {
                                                                        i7 = p159kd.e.vs_payment_rewards;
                                                                        if (((ViewStub) p059e1.a.m(i7, viewInflate)) != null) {
                                                                            i7 = p159kd.e.vs_success;
                                                                            if (((ViewStub) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                i7 = p159kd.e.vs_transfer_to_bank_fast_refund_progress;
                                                                                if (((ViewStub) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                    i7 = p159kd.e.vs_transfer_to_bank_progress;
                                                                                    if (((ViewStub) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                        i7 = p159kd.e.vs_transfer_to_palmpay_progress;
                                                                                        if (((ViewStub) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                            i7 = p159kd.e.vs_view_ad;
                                                                                            if (((ViewStub) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                                g gVar = new g(constraintLayout, linearLayout, linearLayout2, iconicsImageView, linearLayout3, linearLayout4, linearLayout5, button, linearLayout6, constraintLayout, ppTitleBar, textView, textView2, iconicsTextView, transferResultHeaderModel, failResultPageAdView);
                                                                                                Intrinsics.checkNotNullExpressionValue(gVar, "inflate(...)");
                                                                                                return gVar;
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
        AdManager.clearPreloadSingleAd();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f33253j) {
            this.f33253j = false;
        } else {
            s();
            t();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        com.transsnet.palmpay.core.base.l lVar = ((TransferResultViewModel) l()).f34039o;
        if (lVar != null) {
            lVar.e(this, new p054dd.q(new P(this, this), 21));
        }
        com.transsnet.palmpay.core.base.l lVar2 = ((TransferResultViewModel) l()).f34036g;
        if (lVar2 != null) {
            lVar2.e(this, new p054dd.q(new Q(this, this, 0), 21));
        }
        com.transsnet.palmpay.core.base.l lVar3 = ((TransferResultViewModel) l()).f34034e;
        if (lVar3 != null) {
            lVar3.e(this, new p054dd.q(new P(this, 0), 21));
        }
        com.transsnet.palmpay.core.base.l lVar4 = ((TransferResultViewModel) l()).f34035f;
        if (lVar4 != null) {
            lVar4.e(this, new p054dd.q(new P(this, 1), 21));
        }
        com.transsnet.palmpay.core.base.l lVar5 = ((TransferResultViewModel) l()).f34040p;
        if (lVar5 != null) {
            lVar5.e(this, new p054dd.q(new P(this, 2), 21));
        }
        com.transsnet.palmpay.core.base.l lVar6 = ((TransferResultViewModel) l()).f34037i;
        if (lVar6 != null) {
            lVar6.e(this, new p054dd.q(new Q(this, this, 1), 21));
        }
        int i7 = 3;
        io.fastkv.n.B(this, ((TransferResultViewModel) l()).f34038j, this, new C1807o(this, i7), new K(this, i7), false, null, 240);
    }

    public final void q() {
        org.greenrobot.eventbus.c cVarB = org.greenrobot.eventbus.c.b();
        TransactionEvent transactionEvent = new TransactionEvent();
        transactionEvent.setSendAgain(false);
        cVarB.f(transactionEvent);
        for (Class cls : f33237Z) {
            if (ActivityUtils.isActivityExistsInStack((Class<?>) cls)) {
                ActivityUtils.finishToActivity((Class<?>) cls, false);
                finish();
                return;
            }
        }
        i0.H(null);
    }

    public final void r() {
        TransferData transferData = this.f33249e;
        if (transferData != null) {
            OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
            orderInfoForCustomerService.paymentType = getString(p159kd.h.sm_money_transfer_label);
            Long updateTime = transferData.getUpdateTime();
            orderInfoForCustomerService.time = updateTime != null ? updateTime.longValue() : 0L;
            Long payAmount = transferData.getPayAmount();
            orderInfoForCustomerService.amount = payAmount != null ? payAmount.longValue() : 0L;
            Long payFee = transferData.getPayFee();
            orderInfoForCustomerService.fee = payFee != null ? payFee.longValue() : 0L;
            orderInfoForCustomerService.vat = transferData.taxFee;
            orderInfoForCustomerService.pointsUsed = transferData.deductPoint;
            orderInfoForCustomerService.pointsEarned = transferData.redeemPoint;
            orderInfoForCustomerService.orderNumber = transferData.getOrderNo();
            orderInfoForCustomerService.orderStatus = transferData.orderStatusDesc;
            BillProcessDetail billProcessDetail = transferData.orderStatusInfo;
            if (billProcessDetail != null) {
                orderInfoForCustomerService.faqUrl = billProcessDetail.faqLink;
            }
            orderInfoForCustomerService.transType = "03";
            i0.M(this, orderInfoForCustomerService);
        }
    }

    public final void s() {
        PayByOrderResp.DataBean dataBean;
        if (Intrinsics.c(this.f33256v, Boolean.FALSE)) {
            return;
        }
        NotificationEmailDialog notificationEmailDialog = this.f33250f;
        if ((notificationEmailDialog == null || !notificationEmailDialog.isShowing()) && (dataBean = this.f33248d) != null) {
            int i7 = dataBean.payStatus;
            if (i7 == 1 || i7 == 0) {
                TransferResultViewModel transferResultViewModel = (TransferResultViewModel) l();
                transferResultViewModel.getClass();
                p140j8.f.s(transferResultViewModel, new H0(1, null), transferResultViewModel.f34035f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        u.a(getOnBackPressedDispatcher(), this, new K(this, 0));
    }

    public final void t() {
        PayByOrderResp.DataBean dataBean = this.f33248d;
        if (dataBean == null || TextUtils.isEmpty(dataBean.payId) || TextUtils.isEmpty(dataBean.subPayId)) {
            return;
        }
        TransferData transferData = this.f33249e;
        if (TextUtils.isEmpty(transferData != null ? transferData.getOrderNo() : null)) {
            return;
        }
        TransferData transferData2 = this.f33249e;
        if (TextUtils.isEmpty(transferData2 != null ? transferData2.getTransType() : null)) {
            return;
        }
        CheckPayReq checkPayReq = new CheckPayReq();
        checkPayReq.payId = dataBean.payId;
        checkPayReq.subPayId = dataBean.subPayId;
        TransferData transferData3 = this.f33249e;
        checkPayReq.orderNo = transferData3 != null ? transferData3.getOrderNo() : null;
        TransferData transferData4 = this.f33249e;
        checkPayReq.transType = transferData4 != null ? transferData4.getTransType() : null;
        checkPayReq.endFlag = false;
        TransferResultViewModel transferResultViewModel = (TransferResultViewModel) l();
        transferResultViewModel.getClass();
        p140j8.f.s(transferResultViewModel, new I0(checkPayReq, null), transferResultViewModel.f34034e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }
}
