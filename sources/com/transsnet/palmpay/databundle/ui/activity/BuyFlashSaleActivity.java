package com.transsnet.palmpay.databundle.ui.activity;

import Ba.a;
import C0.G;
import C9.C0142i;
import Pa.C0525w;
import T8.f;
import T8.o;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.RecommendedItem;
import com.transsnet.palmpay.databundle.viewmodel.DataBundleHomeViewModel;
import com.transsnet.palmpay.teller.ui.dialog.InputFlashSaleNumberDialog;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p010a9.m;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/quick_teller/buy_flash_sale")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/databundle/ui/activity/BuyFlashSaleActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/databundle/viewmodel/DataBundleHomeViewModel;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBuyFlashSaleActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyFlashSaleActivity.kt\ncom/transsnet/palmpay/databundle/ui/activity/BuyFlashSaleActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,211:1\n115#2,8:212\n145#2:220\n*S KotlinDebug\n*F\n+ 1 BuyFlashSaleActivity.kt\ncom/transsnet/palmpay/databundle/ui/activity/BuyFlashSaleActivity\n*L\n70#1:212,8\n70#1:220\n*E\n"})
public final class BuyFlashSaleActivity extends BaseMvvmActivity<DataBundleHomeViewModel> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f31762f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecommendedItem f31764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InputFlashSaleNumberDialog f31765e;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        ARouter.getInstance().inject(this);
        if (TextUtils.isEmpty(this.f31763c)) {
            finish();
            return;
        }
        C0525w c0525wF = C0525w.f();
        String str = this.f31763c;
        c0525wF.getClass();
        this.f31764d = (RecommendedItem) C0525w.d(str, RecommendedItem.class);
        DataBundleHomeViewModel dataBundleHomeViewModel = (DataBundleHomeViewModel) l();
        n.B(this, dataBundleHomeViewModel != null ? dataBundleHomeViewModel.f31804o : null, this, new a(this, 27), new m(this, 22), true, null, 224);
        m();
    }

    public final void m() {
        InputFlashSaleNumberDialog inputFlashSaleNumberDialog = new InputFlashSaleNumberDialog(this);
        this.f31765e = inputFlashSaleNumberDialog;
        inputFlashSaleNumberDialog.setCallback(new C0142i(this, 17));
        InputFlashSaleNumberDialog inputFlashSaleNumberDialog2 = this.f31765e;
        if (inputFlashSaleNumberDialog2 != null) {
            inputFlashSaleNumberDialog2.show();
        }
        InputFlashSaleNumberDialog inputFlashSaleNumberDialog3 = this.f31765e;
        if (inputFlashSaleNumberDialog3 != null) {
            inputFlashSaleNumberDialog3.updateUi(this.f31764d);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String strA = G.A();
        ((DataBundleHomeViewModel) l()).i(strA);
        l lVar = ((DataBundleHomeViewModel) l()).f31802i;
        if (lVar != null) {
            lVar.e(this, new f(new o(23, this, strA), (char) 0, false));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
    }
}
