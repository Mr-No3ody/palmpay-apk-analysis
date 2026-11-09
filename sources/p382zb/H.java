package p382zb;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.credit.bean.rsp.OcRepaidListDetail;
import com.transsnet.palmpay.credit.ui.fragment.OcBillFragment;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p241q.a;
import p241q.b;
import p241q.d;
import p241q.j;

/* JADX INFO: loaded from: classes4.dex */
public final class H implements OnRvItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f44527a;

    public static H a(Context context) {
        H h7 = new H();
        h7.f44527a = context;
        return h7;
    }

    public int b() {
        Configuration configuration = ((Context) this.f44527a).getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i7 > 600) {
            return 5;
        }
        if (i7 > 960 && i10 > 720) {
            return 5;
        }
        if (i7 > 720 && i10 > 960) {
            return 5;
        }
        if (i7 >= 500) {
            return 4;
        }
        if (i7 > 640 && i10 > 480) {
            return 4;
        }
        if (i7 <= 480 || i10 <= 640) {
            return i7 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int c() {
        int[] iArr = j.ActionBar;
        int i7 = a.actionBarStyle;
        Context context = (Context) this.f44527a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, i7, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(j.ActionBar_height, 0);
        Resources resources = context.getResources();
        if (!((Context) this.f44527a).getResources().getBoolean(b.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(d.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener
    public void onItemClick(View itemView, int i7) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ArrayList arrayList = ((OcBillFragment) this.f44527a).f30377C0;
        if (arrayList == null) {
            Intrinsics.n("mListData");
            throw null;
        }
        Object obj = arrayList.get(i7);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        OcRepaidListDetail ocRepaidListDetail = (OcRepaidListDetail) obj;
        Integer operationType = ocRepaidListDetail.getOperationType();
        if (operationType != null && operationType.intValue() == 9) {
            return;
        }
        ARouter.getInstance().build("/credit_score/oc_repay_order_detail_activity").withString("orderType", TransType.TRANS_TYPE_OK_CARD).withString("orderNo", ocRepaidListDetail.getPayId()).navigation();
    }
}
