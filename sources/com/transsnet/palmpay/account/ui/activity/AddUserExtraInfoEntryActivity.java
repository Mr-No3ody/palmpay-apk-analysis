package com.transsnet.palmpay.account.ui.activity;

import C9.C0138e;
import C9.Q;
import Pa.C0525w;
import Pa.F;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.transsnet.palmpay.account.bean.rsp.AddUserExtraActionRsp;
import com.transsnet.palmpay.account.ui.viewmodel.PalmPayLevelViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p097g9.O;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/add_extra")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/AddUserExtraInfoEntryActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/account/ui/viewmodel/PalmPayLevelViewModel;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddUserExtraInfoEntryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddUserExtraInfoEntryActivity.kt\ncom/transsnet/palmpay/account/ui/activity/AddUserExtraInfoEntryActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,97:1\n171#2,12:98\n215#2:110\n*S KotlinDebug\n*F\n+ 1 AddUserExtraInfoEntryActivity.kt\ncom/transsnet/palmpay/account/ui/activity/AddUserExtraInfoEntryActivity\n*L\n51#1:98,12\n51#1:110\n*E\n"})
public final class AddUserExtraInfoEntryActivity extends BaseMvvmActivity<PalmPayLevelViewModel> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f25819e = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25821d = "1";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void gotoNextStep$default(a aVar, Context context, AddUserExtraActionRsp addUserExtraActionRsp, String str, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                str = null;
            }
            aVar.gotoNextStep(context, addUserExtraActionRsp, str);
        }

        public final void gotoNextStep(@NotNull Context context, @NotNull AddUserExtraActionRsp it, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(it, "it");
            Intent intentA = F.a(context, it.jumpUrl);
            if (intentA != null) {
                intentA.putExtra("_dialog_title", it.popUpTitle);
            }
            if (intentA != null) {
                intentA.putExtra("_dialog_message", it.popUpBody);
            }
            if (intentA != null) {
                intentA.putExtra("source", "FROM_EXTRA_INFO_PAGE");
            }
            if (!TextUtils.isEmpty(str) && intentA != null) {
                intentA.putExtra("scene", str);
            }
            if (intentA != null) {
                intentA.putExtra("kycPreCheckResults", ((Gson) C0525w.f().f7166b).toJson(it));
            }
            ActivityUtils.startActivity(intentA);
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        PalmPayLevelViewModel palmPayLevelViewModel = (PalmPayLevelViewModel) l();
        String str = this.f25821d;
        palmPayLevelViewModel.getClass();
        f.s(palmPayLevelViewModel, new O(str, null), palmPayLevelViewModel.f26434j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        l lVar = ((PalmPayLevelViewModel) l()).f26434j;
        if (lVar != null) {
            lVar.e(this, new C0138e(new Q(19, this, this), (byte) 0, (byte) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        initStatusBar(true);
        getWindow().setBackgroundDrawable(new ColorDrawable(CommonViewExtKt.colorInt(p.transparent_60, this)));
    }
}
