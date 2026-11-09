package com.transsnet.palmpay.send_money.ui.activity;

import C0.G;
import Ce.C0170l;
import Kd.C0424w0;
import Kd.C0427x0;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.imagepipeline.nativecode.b;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.send_money.bean.TradeRecordDetailResp;
import com.transsnet.palmpay.send_money.bean.resp.TransReceiptTypeBean;
import com.transsnet.palmpay.send_money.ui.activity.TransReceiptActivity;
import com.transsnet.palmpay.send_money.ui.view.TransferDefaultReceipt;
import com.transsnet.palmpay.send_money.ui.view.TransferSpecialReceipt;
import com.transsnet.palmpay.send_money.viewmodel.TransReceiptViewModel;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p054dd.q;
import p141j9.C1794b;
import p159kd.e;
import p159kd.f;
import p173ld.v;
import p270rd.C1976t;
import p270rd.I;
import p270rd.J;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "转账小票", path = "/sm/receipt")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/TransReceiptActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransReceiptViewModel;", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "Ljava/io/File;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransReceiptActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransReceiptActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/TransReceiptActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,282:1\n1#2:283\n171#3,12:284\n215#3:296\n171#3,12:297\n215#3:309\n*S KotlinDebug\n*F\n+ 1 TransReceiptActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/TransReceiptActivity\n*L\n165#1:284,12\n165#1:296\n175#1:297,12\n175#1:309\n*E\n"})
public final class TransReceiptActivity extends BaseMvvmActivity<TransReceiptViewModel> implements CompleteCallback<File> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f33225A = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33230g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f33231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TransReceiptTypeBean f33232j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TransferSpecialReceipt f33233o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TransferSpecialReceipt f33234p;
    public TradeRecordDetailResp.RecordDetail t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f33235v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f33236w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void startAct(@NotNull Context context, @NotNull String orderNo) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(orderNo, "orderNo");
            Intent intent = new Intent(context, (Class<?>) TransReceiptActivity.class);
            intent.putExtra("extra_id", orderNo);
            context.startActivity(intent);
        }

        private a() {
        }
    }

    public TransReceiptActivity() {
        final int i7 = 0;
        this.f33226c = C2131j.b(new Function0(this) { // from class: rd.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransReceiptActivity f41684b;

            {
                this.f41684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransReceiptActivity transReceiptActivity = this.f41684b;
                switch (i7) {
                    case 0:
                        TransReceiptActivity.a aVar = TransReceiptActivity.f33225A;
                        return (IconicsTextView) transReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        TransReceiptActivity.a aVar2 = TransReceiptActivity.f33225A;
                        return (IconicsTextView) transReceiptActivity.findViewById(e.shareTv);
                    case 2:
                        TransReceiptActivity.a aVar3 = TransReceiptActivity.f33225A;
                        return (RecyclerView) transReceiptActivity.findViewById(e.rv_receipt_type);
                    case 3:
                        TransReceiptActivity.a aVar4 = TransReceiptActivity.f33225A;
                        return (FrameLayout) transReceiptActivity.findViewById(e.fl_receipt_container);
                    default:
                        TransReceiptActivity.a aVar5 = TransReceiptActivity.f33225A;
                        return (FrameLayout) transReceiptActivity.findViewById(e.fl_share_receipt_container);
                }
            }
        });
        final int i10 = 1;
        this.f33227d = C2131j.b(new Function0(this) { // from class: rd.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransReceiptActivity f41684b;

            {
                this.f41684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransReceiptActivity transReceiptActivity = this.f41684b;
                switch (i10) {
                    case 0:
                        TransReceiptActivity.a aVar = TransReceiptActivity.f33225A;
                        return (IconicsTextView) transReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        TransReceiptActivity.a aVar2 = TransReceiptActivity.f33225A;
                        return (IconicsTextView) transReceiptActivity.findViewById(e.shareTv);
                    case 2:
                        TransReceiptActivity.a aVar3 = TransReceiptActivity.f33225A;
                        return (RecyclerView) transReceiptActivity.findViewById(e.rv_receipt_type);
                    case 3:
                        TransReceiptActivity.a aVar4 = TransReceiptActivity.f33225A;
                        return (FrameLayout) transReceiptActivity.findViewById(e.fl_receipt_container);
                    default:
                        TransReceiptActivity.a aVar5 = TransReceiptActivity.f33225A;
                        return (FrameLayout) transReceiptActivity.findViewById(e.fl_share_receipt_container);
                }
            }
        });
        final int i11 = 2;
        this.f33228e = C2131j.b(new Function0(this) { // from class: rd.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransReceiptActivity f41684b;

            {
                this.f41684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransReceiptActivity transReceiptActivity = this.f41684b;
                switch (i11) {
                    case 0:
                        TransReceiptActivity.a aVar = TransReceiptActivity.f33225A;
                        return (IconicsTextView) transReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        TransReceiptActivity.a aVar2 = TransReceiptActivity.f33225A;
                        return (IconicsTextView) transReceiptActivity.findViewById(e.shareTv);
                    case 2:
                        TransReceiptActivity.a aVar3 = TransReceiptActivity.f33225A;
                        return (RecyclerView) transReceiptActivity.findViewById(e.rv_receipt_type);
                    case 3:
                        TransReceiptActivity.a aVar4 = TransReceiptActivity.f33225A;
                        return (FrameLayout) transReceiptActivity.findViewById(e.fl_receipt_container);
                    default:
                        TransReceiptActivity.a aVar5 = TransReceiptActivity.f33225A;
                        return (FrameLayout) transReceiptActivity.findViewById(e.fl_share_receipt_container);
                }
            }
        });
        final int i12 = 3;
        this.f33229f = C2131j.b(new Function0(this) { // from class: rd.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransReceiptActivity f41684b;

            {
                this.f41684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransReceiptActivity transReceiptActivity = this.f41684b;
                switch (i12) {
                    case 0:
                        TransReceiptActivity.a aVar = TransReceiptActivity.f33225A;
                        return (IconicsTextView) transReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        TransReceiptActivity.a aVar2 = TransReceiptActivity.f33225A;
                        return (IconicsTextView) transReceiptActivity.findViewById(e.shareTv);
                    case 2:
                        TransReceiptActivity.a aVar3 = TransReceiptActivity.f33225A;
                        return (RecyclerView) transReceiptActivity.findViewById(e.rv_receipt_type);
                    case 3:
                        TransReceiptActivity.a aVar4 = TransReceiptActivity.f33225A;
                        return (FrameLayout) transReceiptActivity.findViewById(e.fl_receipt_container);
                    default:
                        TransReceiptActivity.a aVar5 = TransReceiptActivity.f33225A;
                        return (FrameLayout) transReceiptActivity.findViewById(e.fl_share_receipt_container);
                }
            }
        });
        final int i13 = 4;
        this.f33230g = C2131j.b(new Function0(this) { // from class: rd.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransReceiptActivity f41684b;

            {
                this.f41684b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransReceiptActivity transReceiptActivity = this.f41684b;
                switch (i13) {
                    case 0:
                        TransReceiptActivity.a aVar = TransReceiptActivity.f33225A;
                        return (IconicsTextView) transReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        TransReceiptActivity.a aVar2 = TransReceiptActivity.f33225A;
                        return (IconicsTextView) transReceiptActivity.findViewById(e.shareTv);
                    case 2:
                        TransReceiptActivity.a aVar3 = TransReceiptActivity.f33225A;
                        return (RecyclerView) transReceiptActivity.findViewById(e.rv_receipt_type);
                    case 3:
                        TransReceiptActivity.a aVar4 = TransReceiptActivity.f33225A;
                        return (FrameLayout) transReceiptActivity.findViewById(e.fl_receipt_container);
                    default:
                        TransReceiptActivity.a aVar5 = TransReceiptActivity.f33225A;
                        return (FrameLayout) transReceiptActivity.findViewById(e.fl_share_receipt_container);
                }
            }
        });
        TransReceiptTypeBean transReceiptTypeBean = new TransReceiptTypeBean();
        transReceiptTypeBean.setCheck(true);
        this.f33232j = transReceiptTypeBean;
        this.f33235v = C1850q.e(transReceiptTypeBean);
        this.f33236w = C2131j.b(new C1976t(1));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_activity_multi_trans_receipt;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((TransReceiptViewModel) l()).f34025e;
        if (lVar != null) {
            lVar.e(this, new q(new I(this, this, 0), 20));
        }
        l lVar2 = ((TransReceiptViewModel) l()).f34026f;
        if (lVar2 != null) {
            lVar2.e(this, new q(new I(this, this, 1), 20));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final v m() {
        return (v) this.f33236w.getValue();
    }

    public final FrameLayout n() {
        Object value = this.f33229f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FrameLayout) value;
    }

    public final FrameLayout o() {
        Object value = this.f33230g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FrameLayout) value;
    }

    @Override // com.transsnet.palmpay.core.callback.CompleteCallback
    public final void onComplete(File[] fileArr) {
        File[] files = fileArr;
        Intrinsics.checkNotNullParameter(files, "files");
        File file = files[0];
        if (file != null) {
            try {
                b.F(this, androidx.core.content.f.getUriForFile(BaseApplication.getContext(), i0.w(BaseApplication.getContext()), file));
            } catch (Exception unused) {
            }
        }
    }

    public final RecyclerView p() {
        Object value = this.f33228e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (!TextUtils.isEmpty(this.f33231i)) {
            TransReceiptViewModel transReceiptViewModel = (TransReceiptViewModel) l();
            String str = this.f33231i;
            transReceiptViewModel.getClass();
            p140j8.f.s(transReceiptViewModel, new C0427x0(str, null), transReceiptViewModel.f34025e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        TransReceiptViewModel transReceiptViewModel2 = (TransReceiptViewModel) l();
        transReceiptViewModel2.getClass();
        p140j8.f.s(transReceiptViewModel2, new C0424w0(1, null), transReceiptViewModel2.f34026f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final void q() {
        AttributeSet attributeSet = null;
        this.f33233o = null;
        this.f33234p = null;
        n().removeAllViews();
        o().removeAllViews();
        TradeRecordDetailResp.RecordDetail recordDetail = this.t;
        if (recordDetail != null) {
            FrameLayout frameLayoutN = n();
            int i7 = 6;
            int i10 = 0;
            TransferDefaultReceipt transferDefaultReceipt = new TransferDefaultReceipt(this, attributeSet, i7, i10);
            transferDefaultReceipt.setData(recordDetail);
            frameLayoutN.addView(transferDefaultReceipt);
            FrameLayout frameLayoutO = o();
            TransferDefaultReceipt transferDefaultReceipt2 = new TransferDefaultReceipt(this, attributeSet, i7, i10);
            transferDefaultReceipt2.setData(recordDetail);
            frameLayoutO.addView(transferDefaultReceipt2);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        p().setLayoutManager(new LinearLayoutManager(this, 0, false));
        p().setAdapter(m());
        p().addItemDecoration(new J());
        m().setOnItemClickListener(new C1794b(this, 22));
        m().setList(this.f33235v);
        Object value = this.f33227d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        final int i7 = 0;
        ((IconicsTextView) value).setOnClickListener(new View.OnClickListener(this) { // from class: rd.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransReceiptActivity f41686b;

            {
                this.f41686b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferSpecialReceipt transferSpecialReceipt;
                TransReceiptActivity transReceiptActivity = this.f41686b;
                switch (i7) {
                    case 0:
                        TransReceiptTypeBean transReceiptTypeBean = transReceiptActivity.f33232j;
                        if (transReceiptTypeBean != null) {
                            n0.g().k((ClickEvent) G.f("TransferReceiptShare", "element_name", !TextUtils.isEmpty(transReceiptTypeBean.getName()) ? transReceiptActivity.f33232j.getName() : "Default"));
                        }
                        TransferSpecialReceipt transferSpecialReceipt2 = transReceiptActivity.f33233o;
                        if (transferSpecialReceipt2 != null && (transferSpecialReceipt = transReceiptActivity.f33234p) != null) {
                            transferSpecialReceipt.setNote(transferSpecialReceipt2.getNote());
                        }
                        r0.M1(transReceiptActivity.f33231i, 0, transReceiptActivity, transReceiptActivity.o());
                        break;
                    default:
                        TransReceiptActivity.a aVar = TransReceiptActivity.f33225A;
                        r0.J1(new C0170l(2), transReceiptActivity.o());
                        break;
                }
            }
        });
        Object value2 = this.f33226c.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        final int i10 = 1;
        ((IconicsTextView) value2).setOnClickListener(new View.OnClickListener(this) { // from class: rd.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransReceiptActivity f41686b;

            {
                this.f41686b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferSpecialReceipt transferSpecialReceipt;
                TransReceiptActivity transReceiptActivity = this.f41686b;
                switch (i10) {
                    case 0:
                        TransReceiptTypeBean transReceiptTypeBean = transReceiptActivity.f33232j;
                        if (transReceiptTypeBean != null) {
                            n0.g().k((ClickEvent) G.f("TransferReceiptShare", "element_name", !TextUtils.isEmpty(transReceiptTypeBean.getName()) ? transReceiptActivity.f33232j.getName() : "Default"));
                        }
                        TransferSpecialReceipt transferSpecialReceipt2 = transReceiptActivity.f33233o;
                        if (transferSpecialReceipt2 != null && (transferSpecialReceipt = transReceiptActivity.f33234p) != null) {
                            transferSpecialReceipt.setNote(transferSpecialReceipt2.getNote());
                        }
                        r0.M1(transReceiptActivity.f33231i, 0, transReceiptActivity, transReceiptActivity.o());
                        break;
                    default:
                        TransReceiptActivity.a aVar = TransReceiptActivity.f33225A;
                        r0.J1(new C0170l(2), transReceiptActivity.o());
                        break;
                }
            }
        });
    }
}
