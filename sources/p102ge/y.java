package p102ge;

import M1.j;
import Pa.C0525w;
import Pa.F;
import Pa.n0;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.google.gson.reflect.TypeToken;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import com.transsnet.palmpay.core.bean.rsp.GetMenuBillPaymentGroup;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.ui.activity.LifeBillsHomeActivity;
import com.transsnet.palmpay.viewmodule.LifeBillsHomeViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p328ve.e;
import p328ve.k;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y implements OnItemClickListener, Argument2Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifeBillsHomeActivity f37240b;

    public /* synthetic */ y(LifeBillsHomeActivity lifeBillsHomeActivity, int i7) {
        this.f37239a = i7;
        this.f37240b = lifeBillsHomeActivity;
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        Intent intent = (Intent) obj2;
        int i7 = LifeBillsHomeActivity.f34485A;
        if (iIntValue == -1) {
            LifeBillsHomeActivity lifeBillsHomeActivity = this.f37240b;
            if (intent == null || TextUtils.isEmpty(intent.getStringExtra("key_json_menu_item_list"))) {
                ((LifeBillsHomeViewModel) lifeBillsHomeActivity.l()).f();
                return;
            }
            ArrayList arrayList = (ArrayList) C0525w.f().e(intent.getStringExtra("key_json_menu_item_list"), new TypeToken<ArrayList<GetMenuBillPaymentGroup>>() { // from class: com.transsnet.palmpay.ui.activity.LifeBillsHomeActivity$mOnClickListener$1$1$1$menuListType$1
            }.getType());
            Intrinsics.e(arrayList);
            lifeBillsHomeActivity.o(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j jVar, View view, int i7) {
        LifeBillsHomeActivity lifeBillsHomeActivity = this.f37240b;
        switch (this.f37239a) {
            case 0:
                int i10 = LifeBillsHomeActivity.f34485A;
                Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                HomePageMenuData homePageMenuData = (HomePageMenuData) ((e) lifeBillsHomeActivity.f34487e.getValue()).getItem(i7);
                n0.g().k(new ClickEvent("bill_payment_home_page_element_click").add("element_name", homePageMenuData.menuName));
                F.d(homePageMenuData);
                break;
            default:
                int i11 = LifeBillsHomeActivity.f34485A;
                Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                SectionEntity sectionEntity = (SectionEntity) ((k) lifeBillsHomeActivity.f34488f.getValue()).getItem(i7);
                if (!sectionEntity.getIsHeader() && (sectionEntity instanceof HomePageMenuData)) {
                    F.d((HomeMenuBean) sectionEntity);
                    break;
                }
                break;
        }
    }
}
