package Wd;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.ui.activity.BillerSearchActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wd.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0738l implements BaseRecyclerViewAdapter$ItemViewOnClickListener, OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillerSearchActivity f10768b;

    public /* synthetic */ C0738l(BillerSearchActivity billerSearchActivity, int i7) {
        this.f10767a = i7;
        this.f10768b = billerSearchActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        String string;
        Editable editableText;
        BillerSearchActivity billerSearchActivity = this.f10768b;
        switch (this.f10767a) {
            case 0:
                HomePageMenuData homePageMenuData = (HomePageMenuData) obj;
                int i7 = BillerSearchActivity.f34173p;
                Rd.B b7 = (Rd.B) billerSearchActivity.f27334c;
                if (b7 == null || (editableText = ((EditText) b7.f7986j.f813d).getEditableText()) == null || (string = editableText.toString()) == null) {
                    string = "";
                }
                BillerSearchActivity.o(string);
                Pa.F.d(homePageMenuData);
                break;
            default:
                BillerListItemBean billerListItemBean = (BillerListItemBean) obj;
                int i10 = BillerSearchActivity.f34173p;
                Rd.B b10 = (Rd.B) billerSearchActivity.f27334c;
                BillerSearchActivity.o(String.valueOf(b10 != null ? ((EditText) b10.f7986j.f813d).getEditableText() : null));
                if (billerListItemBean != null && !TextUtils.isEmpty(billerListItemBean.getCategoryId()) && !TextUtils.isEmpty(billerListItemBean.getBillerId())) {
                    ARouter aRouter = ARouter.getInstance();
                    String str = p070ee.c.f36289a;
                    aRouter.build(Intrinsics.c(billerListItemBean.getCategoryId(), "8") ? "/quick_teller/betting_home" : "/quick_teller/bill_payment_home").withString("extra_type", billerListItemBean.getCategoryId()).withString("billerId", billerListItemBean.getBillerId()).navigation();
                    break;
                }
                break;
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j adapter, View view, int i7) {
        Rd.B b7;
        Bc.p pVar;
        EditText editText;
        Bc.p pVar2;
        EditText editText2;
        int i10 = BillerSearchActivity.f34173p;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        if (adapter.getItem(i7) instanceof Ud.a) {
            Object item = adapter.getItem(i7);
            Intrinsics.f(item, "null cannot be cast to non-null type com.transsnet.palmpay.teller.db.entity.BillerSearchRecord");
            String str = ((Ud.a) item).f9752c;
            BillerSearchActivity billerSearchActivity = this.f10768b;
            Rd.B b10 = (Rd.B) billerSearchActivity.f27334c;
            if (b10 != null && (pVar2 = b10.f7986j) != null && (editText2 = (EditText) pVar2.f813d) != null) {
                editText2.setText(str);
            }
            if (TextUtils.isEmpty(str) || (b7 = (Rd.B) billerSearchActivity.f27334c) == null || (pVar = b7.f7986j) == null || (editText = (EditText) pVar.f813d) == null) {
                return;
            }
            editText.setSelection(str.length());
        }
    }
}
