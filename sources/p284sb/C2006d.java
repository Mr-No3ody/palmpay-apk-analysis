package p284sb;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.credit.bean.resp.CLTaskResp;
import com.transsnet.palmpay.credit.bean.resp.UnfreezePopupDataResp;
import com.transsnet.palmpay.credit.ui.activity.HowToUnfreezeActivity;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p339wb.b;
import p355xf.l;

/* JADX INFO: renamed from: sb.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2006d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HowToUnfreezeActivity f42156b;

    public /* synthetic */ C2006d(HowToUnfreezeActivity howToUnfreezeActivity, int i7) {
        this.f42155a = i7;
        this.f42156b = howToUnfreezeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LinkedHashMap linkedHashMap;
        List taskList;
        List taskList2;
        List list;
        List list2;
        List<CLTaskResp.CLTaskData.CLTask> dailyTasks;
        HowToUnfreezeActivity howToUnfreezeActivity = this.f42156b;
        switch (this.f42155a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    if (it instanceof p) {
                        CLTaskResp cLTaskResp = (CLTaskResp) ((p) it).f27360a;
                        if (cLTaskResp.isSuccess()) {
                            CLTaskResp.CLTaskData data = cLTaskResp.getData();
                            if (data == null || (dailyTasks = data.getDailyTasks()) == null) {
                                linkedHashMap = null;
                            } else {
                                linkedHashMap = new LinkedHashMap();
                                for (Object obj2 : dailyTasks) {
                                    Integer sign = ((CLTaskResp.CLTaskData.CLTask) obj2).getSign();
                                    Integer numValueOf = Integer.valueOf((sign != null && sign.intValue() == 0) ? 0 : 1);
                                    Object arrayList = linkedHashMap.get(numValueOf);
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                        linkedHashMap.put(numValueOf, arrayList);
                                    }
                                    ((List) arrayList).add(obj2);
                                }
                            }
                            LinearLayout linearLayout = (LinearLayout) howToUnfreezeActivity.f28667o.getValue();
                            int i7 = 8;
                            if (linearLayout != null) {
                                linearLayout.setVisibility((linkedHashMap == null || !(linkedHashMap.isEmpty() ^ true)) ? 8 : 0);
                            }
                            boolean z3 = (linkedHashMap == null || (list2 = (List) linkedHashMap.get(0)) == null || !(list2.isEmpty() ^ true)) ? false : true;
                            TextView textView = (TextView) howToUnfreezeActivity.f28666j.getValue();
                            if (textView != null) {
                                textView.setVisibility(z3 ? 0 : 8);
                            }
                            RecyclerView recyclerView = (RecyclerView) howToUnfreezeActivity.f28665i.getValue();
                            if (recyclerView != null) {
                                recyclerView.setVisibility(z3 ? 0 : 8);
                            }
                            boolean z8 = (linkedHashMap == null || (list = (List) linkedHashMap.get(1)) == null || !(list.isEmpty() ^ true)) ? false : true;
                            TextView textView2 = (TextView) howToUnfreezeActivity.f28664g.getValue();
                            if (textView2 != null) {
                                textView2.setVisibility(z8 ? 0 : 8);
                            }
                            RecyclerView recyclerView2 = (RecyclerView) howToUnfreezeActivity.f28662e.getValue();
                            if (recyclerView2 != null) {
                                recyclerView2.setVisibility(z8 ? 0 : 8);
                            }
                            TextView textView3 = (TextView) howToUnfreezeActivity.f28663f.getValue();
                            if (textView3 != null) {
                                if (z8 && !z3) {
                                    i7 = 0;
                                }
                                textView3.setVisibility(i7);
                            }
                            b bVar = (b) howToUnfreezeActivity.f28657A.getValue();
                            if (linkedHashMap == null || (taskList = (List) linkedHashMap.get(0)) == null) {
                                taskList = z.f38935a;
                            }
                            bVar.getClass();
                            Intrinsics.checkNotNullParameter(taskList, "taskList");
                            bVar.f4985b = taskList;
                            bVar.notifyDataSetChanged();
                            b bVar2 = (b) howToUnfreezeActivity.f28658B.getValue();
                            if (linkedHashMap == null || (taskList2 = (List) linkedHashMap.get(1)) == null) {
                                taskList2 = z.f38935a;
                            }
                            bVar2.getClass();
                            Intrinsics.checkNotNullParameter(taskList2, "taskList");
                            bVar2.f4985b = taskList2;
                            bVar2.notifyDataSetChanged();
                        }
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    if (it2 instanceof p) {
                        UnfreezePopupDataResp unfreezePopupDataResp = (UnfreezePopupDataResp) ((p) it2).f27360a;
                        if (unfreezePopupDataResp.isSuccess()) {
                            UnfreezePopupDataResp.Data data2 = unfreezePopupDataResp.getData();
                            int i10 = HowToUnfreezeActivity.f28656H;
                            howToUnfreezeActivity.n(TransType.TRANS_TYPE_OK_CARD, data2);
                        }
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                        ((n) it2).getClass();
                    }
                }
                return Unit.f38893a;
        }
    }
}
