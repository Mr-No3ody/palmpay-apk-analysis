package com.transsnet.palmpay.core.ui.activity;

import C9.C0142i;
import Pa.i0;
import Pa.r0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/coreImpl/transaction_receipt_page")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/CoreTransactionReceiptActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "Ljava/io/File;", "<init>", "()V", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CoreTransactionReceiptActivity extends BaseActivity implements CompleteCallback<File> {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f27593B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f27594A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p355xf.t f27595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p355xf.t f27596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f27597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f27598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f27599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p355xf.t f27600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p355xf.t f27601g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p355xf.t f27602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f27603j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f27604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f27605p;
    public long t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f27606v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f27607w;

    public CoreTransactionReceiptActivity() {
        final int i7 = 0;
        this.f27595a = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreTransactionReceiptActivity f27667b;

            {
                this.f27667b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoreTransactionReceiptActivity coreTransactionReceiptActivity = this.f27667b;
                switch (i7) {
                    case 0:
                        int i10 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.saveTv);
                    case 1:
                        int i11 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.shareTv);
                    case 2:
                        int i12 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tvBottomDesc);
                    case 3:
                        int i13 = CoreTransactionReceiptActivity.f27593B;
                        return (LinearLayout) coreTransactionReceiptActivity.findViewById(L9.a.ll_item_container);
                    case 4:
                        int i14 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tv_date);
                    case 5:
                        int i15 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tv_amount);
                    case 6:
                        int i16 = CoreTransactionReceiptActivity.f27593B;
                        return (ImageView) coreTransactionReceiptActivity.findViewById(L9.a.iv_logo);
                    default:
                        int i17 = CoreTransactionReceiptActivity.f27593B;
                        return (LinearLayout) coreTransactionReceiptActivity.findViewById(L9.a.receiptView);
                }
            }
        });
        final int i10 = 1;
        this.f27596b = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreTransactionReceiptActivity f27667b;

            {
                this.f27667b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoreTransactionReceiptActivity coreTransactionReceiptActivity = this.f27667b;
                switch (i10) {
                    case 0:
                        int i11 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.saveTv);
                    case 1:
                        int i12 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.shareTv);
                    case 2:
                        int i13 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tvBottomDesc);
                    case 3:
                        int i14 = CoreTransactionReceiptActivity.f27593B;
                        return (LinearLayout) coreTransactionReceiptActivity.findViewById(L9.a.ll_item_container);
                    case 4:
                        int i15 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tv_date);
                    case 5:
                        int i16 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tv_amount);
                    case 6:
                        int i17 = CoreTransactionReceiptActivity.f27593B;
                        return (ImageView) coreTransactionReceiptActivity.findViewById(L9.a.iv_logo);
                    default:
                        int i18 = CoreTransactionReceiptActivity.f27593B;
                        return (LinearLayout) coreTransactionReceiptActivity.findViewById(L9.a.receiptView);
                }
            }
        });
        final int i11 = 2;
        this.f27597c = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreTransactionReceiptActivity f27667b;

            {
                this.f27667b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoreTransactionReceiptActivity coreTransactionReceiptActivity = this.f27667b;
                switch (i11) {
                    case 0:
                        int i12 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.saveTv);
                    case 1:
                        int i13 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.shareTv);
                    case 2:
                        int i14 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tvBottomDesc);
                    case 3:
                        int i15 = CoreTransactionReceiptActivity.f27593B;
                        return (LinearLayout) coreTransactionReceiptActivity.findViewById(L9.a.ll_item_container);
                    case 4:
                        int i16 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tv_date);
                    case 5:
                        int i17 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tv_amount);
                    case 6:
                        int i18 = CoreTransactionReceiptActivity.f27593B;
                        return (ImageView) coreTransactionReceiptActivity.findViewById(L9.a.iv_logo);
                    default:
                        int i19 = CoreTransactionReceiptActivity.f27593B;
                        return (LinearLayout) coreTransactionReceiptActivity.findViewById(L9.a.receiptView);
                }
            }
        });
        final int i12 = 3;
        this.f27598d = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreTransactionReceiptActivity f27667b;

            {
                this.f27667b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoreTransactionReceiptActivity coreTransactionReceiptActivity = this.f27667b;
                switch (i12) {
                    case 0:
                        int i13 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.saveTv);
                    case 1:
                        int i14 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.shareTv);
                    case 2:
                        int i15 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tvBottomDesc);
                    case 3:
                        int i16 = CoreTransactionReceiptActivity.f27593B;
                        return (LinearLayout) coreTransactionReceiptActivity.findViewById(L9.a.ll_item_container);
                    case 4:
                        int i17 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tv_date);
                    case 5:
                        int i18 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tv_amount);
                    case 6:
                        int i19 = CoreTransactionReceiptActivity.f27593B;
                        return (ImageView) coreTransactionReceiptActivity.findViewById(L9.a.iv_logo);
                    default:
                        int i110 = CoreTransactionReceiptActivity.f27593B;
                        return (LinearLayout) coreTransactionReceiptActivity.findViewById(L9.a.receiptView);
                }
            }
        });
        final int i13 = 4;
        this.f27599e = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreTransactionReceiptActivity f27667b;

            {
                this.f27667b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoreTransactionReceiptActivity coreTransactionReceiptActivity = this.f27667b;
                switch (i13) {
                    case 0:
                        int i14 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.saveTv);
                    case 1:
                        int i15 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.shareTv);
                    case 2:
                        int i16 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tvBottomDesc);
                    case 3:
                        int i17 = CoreTransactionReceiptActivity.f27593B;
                        return (LinearLayout) coreTransactionReceiptActivity.findViewById(L9.a.ll_item_container);
                    case 4:
                        int i18 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tv_date);
                    case 5:
                        int i19 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tv_amount);
                    case 6:
                        int i110 = CoreTransactionReceiptActivity.f27593B;
                        return (ImageView) coreTransactionReceiptActivity.findViewById(L9.a.iv_logo);
                    default:
                        int i111 = CoreTransactionReceiptActivity.f27593B;
                        return (LinearLayout) coreTransactionReceiptActivity.findViewById(L9.a.receiptView);
                }
            }
        });
        final int i14 = 5;
        this.f27600f = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreTransactionReceiptActivity f27667b;

            {
                this.f27667b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoreTransactionReceiptActivity coreTransactionReceiptActivity = this.f27667b;
                switch (i14) {
                    case 0:
                        int i15 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.saveTv);
                    case 1:
                        int i16 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.shareTv);
                    case 2:
                        int i17 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tvBottomDesc);
                    case 3:
                        int i18 = CoreTransactionReceiptActivity.f27593B;
                        return (LinearLayout) coreTransactionReceiptActivity.findViewById(L9.a.ll_item_container);
                    case 4:
                        int i19 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tv_date);
                    case 5:
                        int i110 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tv_amount);
                    case 6:
                        int i111 = CoreTransactionReceiptActivity.f27593B;
                        return (ImageView) coreTransactionReceiptActivity.findViewById(L9.a.iv_logo);
                    default:
                        int i112 = CoreTransactionReceiptActivity.f27593B;
                        return (LinearLayout) coreTransactionReceiptActivity.findViewById(L9.a.receiptView);
                }
            }
        });
        final int i15 = 6;
        this.f27601g = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreTransactionReceiptActivity f27667b;

            {
                this.f27667b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoreTransactionReceiptActivity coreTransactionReceiptActivity = this.f27667b;
                switch (i15) {
                    case 0:
                        int i16 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.saveTv);
                    case 1:
                        int i17 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.shareTv);
                    case 2:
                        int i18 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tvBottomDesc);
                    case 3:
                        int i19 = CoreTransactionReceiptActivity.f27593B;
                        return (LinearLayout) coreTransactionReceiptActivity.findViewById(L9.a.ll_item_container);
                    case 4:
                        int i110 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tv_date);
                    case 5:
                        int i111 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tv_amount);
                    case 6:
                        int i112 = CoreTransactionReceiptActivity.f27593B;
                        return (ImageView) coreTransactionReceiptActivity.findViewById(L9.a.iv_logo);
                    default:
                        int i113 = CoreTransactionReceiptActivity.f27593B;
                        return (LinearLayout) coreTransactionReceiptActivity.findViewById(L9.a.receiptView);
                }
            }
        });
        final int i16 = 7;
        this.f27602i = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreTransactionReceiptActivity f27667b;

            {
                this.f27667b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoreTransactionReceiptActivity coreTransactionReceiptActivity = this.f27667b;
                switch (i16) {
                    case 0:
                        int i17 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.saveTv);
                    case 1:
                        int i18 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.shareTv);
                    case 2:
                        int i19 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tvBottomDesc);
                    case 3:
                        int i110 = CoreTransactionReceiptActivity.f27593B;
                        return (LinearLayout) coreTransactionReceiptActivity.findViewById(L9.a.ll_item_container);
                    case 4:
                        int i111 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tv_date);
                    case 5:
                        int i112 = CoreTransactionReceiptActivity.f27593B;
                        return (TextView) coreTransactionReceiptActivity.findViewById(L9.a.tv_amount);
                    case 6:
                        int i113 = CoreTransactionReceiptActivity.f27593B;
                        return (ImageView) coreTransactionReceiptActivity.findViewById(L9.a.iv_logo);
                    default:
                        int i114 = CoreTransactionReceiptActivity.f27593B;
                        return (LinearLayout) coreTransactionReceiptActivity.findViewById(L9.a.receiptView);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return L9.b.cm_activity_transaction_receipt;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean zIsEmpty = TextUtils.isEmpty(this.f27605p);
        p355xf.t tVar = this.f27601g;
        if (zIsEmpty) {
            ImageView imageView = (ImageView) tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(imageView, "<get-iv_logo>(...)");
            p220oa.h.s(imageView, false);
        } else {
            ImageView imageView2 = (ImageView) tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(imageView2, "<get-iv_logo>(...)");
            p220oa.h.s(imageView2, true);
            r0.v1(this.f27605p, (ImageView) tVar.getValue());
        }
        ((TextView) this.f27600f.getValue()).setText(r0.B(this.f27604o, false));
        long j6 = this.t;
        p355xf.t tVar2 = this.f27599e;
        if (j6 > 0) {
            ((TextView) tVar2.getValue()).setText(r0.R(this.t));
            TextView textView = (TextView) tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(textView, "<get-tv_date>(...)");
            p220oa.h.s(textView, true);
        } else {
            TextView textView2 = (TextView) tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(textView2, "<get-tv_date>(...)");
            p220oa.h.s(textView2, false);
        }
        ArrayList arrayList = this.f27606v;
        if (arrayList == null || this.f27607w == null) {
            finish();
            return;
        }
        int size = arrayList.size();
        ArrayList arrayList2 = this.f27607w;
        int iMin = Math.min(size, arrayList2 != null ? arrayList2.size() : 0);
        for (int i7 = 0; i7 < iMin; i7++) {
            String string = getString(p025ba.k.core_address);
            ArrayList arrayList3 = this.f27606v;
            String str6 = "";
            if (arrayList3 == null || (str = (String) arrayList3.get(i7)) == null) {
                str = "";
            }
            boolean zH = kotlin.text.y.h(string, str, true);
            p355xf.t tVar3 = this.f27598d;
            if (zH) {
                View viewInflate = LayoutInflater.from(this).inflate(N9.d.cm_transaction_receipt_item_double, (ViewGroup) null, false);
                TextView textView3 = (TextView) viewInflate.findViewById(N9.c.tv_title);
                ArrayList arrayList4 = this.f27606v;
                if (arrayList4 == null || (str4 = (String) arrayList4.get(i7)) == null) {
                    str4 = "";
                }
                textView3.setText(str4);
                TextView textView4 = (TextView) viewInflate.findViewById(N9.c.tv_value);
                ArrayList arrayList5 = this.f27607w;
                if (arrayList5 != null && (str5 = (String) arrayList5.get(i7)) != null) {
                    str6 = str5;
                }
                textView4.setText(str6);
                ((LinearLayout) tVar3.getValue()).addView(viewInflate);
            } else {
                ArrayList arrayList6 = this.f27606v;
                if (arrayList6 == null || (str2 = (String) arrayList6.get(i7)) == null) {
                    str2 = "";
                }
                ArrayList arrayList7 = this.f27607w;
                if (arrayList7 != null && (str3 = (String) arrayList7.get(i7)) != null) {
                    str6 = str3;
                }
                View viewInflate2 = LayoutInflater.from(this).inflate(N9.d.cm_transaction_receipt_item, (ViewGroup) null, false);
                ((TextView) viewInflate2.findViewById(N9.c.tv_title)).setText(str2);
                ((TextView) viewInflate2.findViewById(N9.c.tv_value)).setText(str6);
                ((LinearLayout) tVar3.getValue()).addView(viewInflate2);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.callback.CompleteCallback
    public final void onComplete(File[] fileArr) {
        File[] objects = fileArr;
        Intrinsics.checkNotNullParameter(objects, "objects");
        File file = objects[0];
        if (file != null) {
            com.facebook.imagepipeline.nativecode.b.F(this, androidx.core.content.f.getUriForFile(BaseApplication.getContext(), i0.w(BaseApplication.getContext()), file));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ArrayList arrayList;
        ARouter.getInstance().inject(this);
        ArrayList arrayList2 = this.f27607w;
        if (arrayList2 == null || arrayList2.isEmpty() || (arrayList = this.f27606v) == null || arrayList.isEmpty()) {
            finish();
            return;
        }
        final int i7 = 0;
        ((TextView) this.f27596b.getValue()).setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreTransactionReceiptActivity f27674b;

            {
                this.f27674b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreTransactionReceiptActivity coreTransactionReceiptActivity = this.f27674b;
                switch (i7) {
                    case 0:
                        int i10 = CoreTransactionReceiptActivity.f27593B;
                        r0.L1(null, coreTransactionReceiptActivity, (LinearLayout) coreTransactionReceiptActivity.f27602i.getValue());
                        break;
                    default:
                        int i11 = CoreTransactionReceiptActivity.f27593B;
                        r0.L1(null, new C0142i(coreTransactionReceiptActivity, 16), (LinearLayout) coreTransactionReceiptActivity.f27602i.getValue());
                        break;
                }
            }
        });
        final int i10 = 1;
        ((TextView) this.f27595a.getValue()).setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreTransactionReceiptActivity f27674b;

            {
                this.f27674b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreTransactionReceiptActivity coreTransactionReceiptActivity = this.f27674b;
                switch (i10) {
                    case 0:
                        int i11 = CoreTransactionReceiptActivity.f27593B;
                        r0.L1(null, coreTransactionReceiptActivity, (LinearLayout) coreTransactionReceiptActivity.f27602i.getValue());
                        break;
                    default:
                        int i12 = CoreTransactionReceiptActivity.f27593B;
                        r0.L1(null, new C0142i(coreTransactionReceiptActivity, 16), (LinearLayout) coreTransactionReceiptActivity.f27602i.getValue());
                        break;
                }
            }
        });
        boolean zIsEmpty = TextUtils.isEmpty(this.f27594A);
        p355xf.t tVar = this.f27597c;
        if (zIsEmpty) {
            ((TextView) tVar.getValue()).setText(getString(p025ba.k.core_receipt_bottom_text_tips));
        } else {
            ((TextView) tVar.getValue()).setText(this.f27594A);
        }
    }
}
