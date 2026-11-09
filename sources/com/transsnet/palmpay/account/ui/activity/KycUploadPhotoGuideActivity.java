package com.transsnet.palmpay.account.ui.activity;

import Bc.C0107d;
import C0.G;
import F8.d;
import F8.e;
import Je.l;
import L6.b;
import Pa.r0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/KycUploadPhotoGuideActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKycUploadPhotoGuideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KycUploadPhotoGuideActivity.kt\ncom/transsnet/palmpay/account/ui/activity/KycUploadPhotoGuideActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1#2:69\n1869#3,2:70\n*S KotlinDebug\n*F\n+ 1 KycUploadPhotoGuideActivity.kt\ncom/transsnet/palmpay/account/ui/activity/KycUploadPhotoGuideActivity\n*L\n41#1:70,2\n*E\n"})
public final class KycUploadPhotoGuideActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f25875b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0107d f25876a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void start(@NotNull Context context, @Nullable ArrayList<String> arrayList) {
            Intent intentPutStringArrayListExtra = G.e(context, "context", context, KycUploadPhotoGuideActivity.class).putStringArrayListExtra("extra_data", arrayList);
            Intrinsics.checkNotNullExpressionValue(intentPutStringArrayListExtra, "putStringArrayListExtra(...)");
            context.startActivity(intentPutStringArrayListExtra);
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        ArrayList<String> stringArrayListExtra;
        LinearLayout linearLayout;
        Intent intent = getIntent();
        if (intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("extra_data")) == null) {
            return;
        }
        if (stringArrayListExtra.isEmpty()) {
            stringArrayListExtra = null;
        }
        if (stringArrayListExtra != null) {
            for (String str : stringArrayListExtra) {
                ImageView imageView = new ImageView(this);
                imageView.setAdjustViewBounds(true);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                C0107d c0107d = this.f25876a;
                if (c0107d != null && (linearLayout = (LinearLayout) c0107d.f680b) != null) {
                    linearLayout.addView(imageView, new LinearLayout.LayoutParams(-1, -2));
                }
                r0.l1(str, imageView);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(e.ac_activity_kyc_upload_photo_guide, (ViewGroup) null, false);
        int i7 = d.btnConfirm;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = d.rootView;
            LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
            if (linearLayout != null) {
                i7 = d.titleBar;
                PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                if (ppTitleBar != null) {
                    C0107d c0107d = new C0107d((ConstraintLayout) viewInflate, ppButton, linearLayout, ppTitleBar);
                    this.f25876a = c0107d;
                    return c0107d;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        C0107d c0107d = this.f25876a;
        if (c0107d != null) {
            ((PpTitleBar) c0107d.f683e).setBackButton(S6.a.pay_Close);
        }
        C0107d c0107d2 = this.f25876a;
        if (c0107d2 != null) {
            ((PpButton) c0107d2.f682d).setOnClickListener(new l(this, 19));
        }
    }
}
