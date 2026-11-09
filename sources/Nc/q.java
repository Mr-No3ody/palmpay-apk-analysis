package Nc;

import Pa.i0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.SavingProduct;
import com.transsnet.palmpay.main.export.ui.view.ModelNewCustomerSavings;
import com.transsnet.palmpay.managemoney.bean.resp.GetIntroductionResp;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends AbstractC0482a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModelNewCustomerSavings f6342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f6343c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f6343c = sVar;
        View viewFindViewById = itemView.findViewById(Jc.c.modelNewCustomerSavings);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f6342b = (ModelNewCustomerSavings) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(Jc.c.tvSecurity);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        IconicsTextView iconicsTextView = (IconicsTextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(Jc.c.iv_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById3;
        if (i0.T()) {
            int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, itemView.getContext());
            if (imageView != null) {
                imageView.setColorFilter(iColorInt);
            }
        }
        if (iconicsTextView != null) {
            iconicsTextView.setOnClickListener(new K8.a(13));
        }
    }

    @Override // Nc.AbstractC0482a
    public final void a(int i7, Object obj) {
        List<SavingProduct> exclusiveList;
        super.a(i7, obj);
        if (obj != null) {
            GetIntroductionResp.Data data = (GetIntroductionResp.Data) obj;
            p pVar = new p(this.f6343c, this);
            ModelNewCustomerSavings modelNewCustomerSavings = this.f6342b;
            modelNewCustomerSavings.setOnInvestBtnClickListener(pVar);
            List<SavingProduct> exclusiveList2 = data.getExclusiveList();
            if (exclusiveList2 == null || exclusiveList2.isEmpty()) {
                exclusiveList = data.getExclusiveList();
            } else {
                List<SavingProduct> exclusiveList3 = data.getExclusiveList();
                Intrinsics.e(exclusiveList3);
                List<SavingProduct> list = exclusiveList3;
                ArrayList arrayList = new ArrayList(kotlin.collections.r.l(list, 10));
                for (SavingProduct savingProduct : list) {
                    if (TextUtils.isEmpty(savingProduct.getIntroduction())) {
                        savingProduct.setIntroduction(data.getExclusiveListContent());
                    }
                    arrayList.add(savingProduct);
                }
                exclusiveList = CollectionsKt.Y(arrayList);
            }
            int i10 = com.transsnet.palmpay.custom_view.r.cv_rect_corner_12_bg_white;
            List<SavingProduct> list2 = exclusiveList;
            modelNewCustomerSavings.setVisibility((list2 == null || list2.isEmpty()) ? 8 : 0);
            modelNewCustomerSavings.mBottomLayoutBackgroundResId = i10;
            com.transsnet.palmpay.main.export.ui.view.a aVar = modelNewCustomerSavings.f31996c;
            if (aVar == null) {
                Intrinsics.n("mNewUserCustomerSavingsAdapter");
                throw null;
            }
            aVar.f31998a = exclusiveList;
            aVar.notifyDataSetChanged();
        }
    }

    @Override // Nc.AbstractC0482a
    public final void b(Bundle bundle) {
    }
}
