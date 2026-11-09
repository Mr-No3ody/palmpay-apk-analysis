package Nc;

import android.content.Context;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.fragment.app.Z;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.main.export.bean.rsp.SavingProduct;
import com.transsnet.palmpay.main.export.ui.view.ModelNewCustomerSavings;
import com.transsnet.palmpay.managemoney.ui.fragment.O;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements ModelNewCustomerSavings.OnInvestBtnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f6340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f6341b;

    public p(s sVar, q qVar) {
        this.f6340a = sVar;
        this.f6341b = qVar;
    }

    @Override // com.transsnet.palmpay.main.export.ui.view.ModelNewCustomerSavings.OnInvestBtnClickListener
    public final void onInvestBtnClick(SavingProduct savingProduct) {
        if (savingProduct != null) {
            int i7 = s.f6349c;
            s sVar = this.f6340a;
            int productStatus = savingProduct.getProductStatus();
            q qVar = this.f6341b;
            if (productStatus == 7) {
                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, "Oops!", qVar.itemView.getContext().getResources().getString(Jc.f.mm_product_sell_out_desc, savingProduct.getShowName(), "tomorrow"), "Ok", null, 8, null);
                Context context = qVar.itemView.getContext();
                Intrinsics.f(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                Z supportFragmentManager = ((AbstractActivityC0837o) context).getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager, "showCommonTipsDialog");
                return;
            }
            if (savingProduct.getProductStatus() != 1) {
                O o10 = sVar.f6351b;
                if (o10 != null) {
                    o10.onInvestBtnClick(savingProduct);
                    return;
                }
                return;
            }
            CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, "Oops!", qVar.itemView.getContext().getResources().getString(Jc.f.mm_product_sell_out_desc, savingProduct.getShowName(), "today 9:00am"), "Ok", null, 8, null);
            Context context2 = qVar.itemView.getContext();
            Intrinsics.f(context2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            Z supportFragmentManager2 = ((AbstractActivityC0837o) context2).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
            commonTipsDialogFragmentCreateDialog$default2.show(supportFragmentManager2, "showCommonTipsDialog");
        }
    }
}
