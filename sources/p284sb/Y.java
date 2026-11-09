package p284sb;

import com.transsnet.palmpay.core.bean.rsp.GetRecentMerchantsResp;
import com.transsnet.palmpay.credit.ui.activity.SearchMIDActivity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class Y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchMIDActivity f42147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42148c;

    public Y(int i7, SearchMIDActivity searchMIDActivity, String str) {
        this.f42146a = i7;
        this.f42147b = searchMIDActivity;
        this.f42148c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SearchMIDActivity searchMIDActivity = this.f42147b;
        if (this.f42146a == searchMIDActivity.f28787L) {
            W wP = searchMIDActivity.p();
            T tO = searchMIDActivity.o();
            tO.getClass();
            String key = this.f42148c;
            Intrinsics.checkNotNullParameter(key, "key");
            ArrayList arrayList = new ArrayList();
            int length = key.length();
            SearchMIDActivity searchMIDActivity2 = tO.f42140a;
            t tVar = searchMIDActivity2.f28786H;
            if (length == 0) {
                arrayList.addAll((ArrayList) tVar.getValue());
            } else {
                Iterator it = ((ArrayList) tVar.getValue()).iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                    GetRecentMerchantsResp.ListDataBean listDataBean = (GetRecentMerchantsResp.ListDataBean) next;
                    T tO2 = searchMIDActivity2.o();
                    String snNo = listDataBean.snNo;
                    Intrinsics.checkNotNullExpressionValue(snNo, "snNo");
                    if (!StringsKt.A(new Regex(" ").replace(tO2.c(snNo), ""), new Regex(" ").replace(key, ""), false)) {
                        listDataBean = null;
                    }
                    if (listDataBean != null) {
                        arrayList.add(listDataBean);
                    }
                }
            }
            wP.b(arrayList);
            searchMIDActivity.f28787L = 0;
        }
        return Unit.f38893a;
    }
}
