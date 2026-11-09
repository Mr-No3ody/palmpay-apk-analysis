package Yd;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.ui.dialog.PickBillerDialog;
import com.transsnet.palmpay.teller.ui.dialog.PickBillerNewDialog;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p055de.h f11348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f11349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.custom_view.dialog.b f11350d;

    public /* synthetic */ n(View view, com.transsnet.palmpay.custom_view.dialog.b bVar, p055de.h hVar, int i7) {
        this.f11347a = i7;
        this.f11349c = view;
        this.f11350d = bVar;
        this.f11348b = hVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String abbreviatedName;
        String shortName;
        p055de.h hVar = this.f11348b;
        com.transsnet.palmpay.custom_view.dialog.b bVar = this.f11350d;
        View view = this.f11349c;
        switch (this.f11347a) {
            case 0:
                ImageView imageView = (ImageView) view;
                if (TextUtils.isEmpty(String.valueOf(editable))) {
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                } else if (imageView != null) {
                    imageView.setVisibility(0);
                }
                String str = p070ee.c.f36289a;
                PickBillerDialog pickBillerDialog = (PickBillerDialog) bVar;
                pickBillerDialog.mSearchBillerResult = p070ee.c.g(String.valueOf(editable), pickBillerDialog.getDatas());
                Xd.l lVar = pickBillerDialog.mAdapter;
                if (lVar == null) {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
                lVar.f4985b = pickBillerDialog.mSearchBillerResult;
                Xd.l lVar2 = pickBillerDialog.mAdapter;
                if (lVar2 == null) {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
                lVar2.notifyDataSetChanged();
                pickBillerDialog.updateEmptyUI();
                hVar.a(String.valueOf(editable));
                return;
            default:
                if (TextUtils.isEmpty(String.valueOf(editable))) {
                    if (view != null) {
                        view.setVisibility(8);
                    }
                } else if (view != null) {
                    view.setVisibility(0);
                }
                String searchKey = String.valueOf(editable);
                PickBillerNewDialog pickBillerNewDialog = (PickBillerNewDialog) bVar;
                ArrayList<BillerListItemBean> datas = pickBillerNewDialog.getDatas();
                Intrinsics.checkNotNullParameter(searchKey, "searchKey");
                ArrayList arrayList = new ArrayList();
                if (datas != null) {
                    ArrayList<BillerListItemBean> arrayList2 = datas.isEmpty() ? null : datas;
                    if (arrayList2 != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : arrayList2) {
                            BillerListItemBean billerListItemBean = (BillerListItemBean) obj;
                            String billerName = billerListItemBean.getBillerName();
                            if ((billerName != null && StringsKt.A(billerName, searchKey, true)) || (((abbreviatedName = billerListItemBean.getAbbreviatedName()) != null && StringsKt.A(abbreviatedName, searchKey, true)) || ((shortName = billerListItemBean.getShortName()) != null && StringsKt.A(shortName, searchKey, true)))) {
                                arrayList3.add(obj);
                            }
                        }
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            arrayList.add((BillerListItemBean) it.next());
                        }
                    }
                }
                pickBillerNewDialog.mSearchBillerResult = arrayList;
                pickBillerNewDialog.getMAdapter().setList(pickBillerNewDialog.mSearchBillerResult);
                hVar.a(String.valueOf(editable));
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f11347a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f11347a;
    }

    private final void a(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void b(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void c(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void d(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
