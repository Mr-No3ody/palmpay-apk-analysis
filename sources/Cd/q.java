package Cd;

import Kd.C0389k0;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.custom_view.PpSwipeRefreshLayout;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferHomeFragment;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferHomeFragment f1383b;

    public /* synthetic */ q(ScheduleTransferHomeFragment scheduleTransferHomeFragment, int i7) {
        this.f1382a = i7;
        this.f1383b = scheduleTransferHomeFragment;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0165  */
    /* JADX WARN: Code duplicated, block: B:73:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x010f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0116  */
    /* JADX WARN: Code duplicated, block: B:81:0x011d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0124  */
    /* JADX WARN: Code duplicated, block: B:86:0x0128  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0130  */
    /* JADX WARN: Code duplicated, block: B:90:0x0132  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z3;
        Group group;
        TextView textView;
        RecyclerView recyclerView;
        TextView textView2;
        List list;
        int size;
        boolean z8;
        ScheduleTransferHomeFragment scheduleTransferHomeFragment = this.f1383b;
        switch (this.f1382a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (commonListResultV2.isSuccess()) {
                            ScheduleTransferHomeFragment.a aVar = ScheduleTransferHomeFragment.f33695k0;
                            Collection collection = commonListResultV2.data;
                            if (collection == null || collection.isEmpty()) {
                                List list2 = scheduleTransferHomeFragment.f33703X;
                                if ((list2 != null ? list2.size() : 0) <= 0) {
                                    TextView textView3 = scheduleTransferHomeFragment.f33696A;
                                    if (textView3 != null) {
                                        p220oa.h.c(textView3);
                                    }
                                    RecyclerView recyclerView2 = scheduleTransferHomeFragment.f33697B;
                                    if (recyclerView2 != null) {
                                        p220oa.h.c(recyclerView2);
                                    }
                                    TextView textView4 = scheduleTransferHomeFragment.f33698C;
                                    if (textView4 != null) {
                                        p220oa.h.c(textView4);
                                    }
                                    Group group2 = scheduleTransferHomeFragment.f33699H;
                                    if (group2 != null) {
                                        p220oa.h.c(group2);
                                    }
                                } else {
                                    group = scheduleTransferHomeFragment.f33699H;
                                    if (group != null) {
                                        p220oa.h.C(group);
                                    }
                                    textView = scheduleTransferHomeFragment.f33696A;
                                    if (textView != null) {
                                        p220oa.h.C(textView);
                                    }
                                    recyclerView = scheduleTransferHomeFragment.f33697B;
                                    if (recyclerView != null) {
                                        p220oa.h.C(recyclerView);
                                    }
                                    textView2 = scheduleTransferHomeFragment.f33698C;
                                    if (textView2 != null) {
                                        list = scheduleTransferHomeFragment.f33703X;
                                        if (list != null) {
                                            size = list.size();
                                        } else {
                                            size = 0;
                                        }
                                        if (size > 0) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        p220oa.h.s(textView2, z8);
                                    }
                                    scheduleTransferHomeFragment.u().setList(commonListResultV2.data);
                                }
                            } else {
                                group = scheduleTransferHomeFragment.f33699H;
                                if (group != null) {
                                    p220oa.h.C(group);
                                }
                                textView = scheduleTransferHomeFragment.f33696A;
                                if (textView != null) {
                                    p220oa.h.C(textView);
                                }
                                recyclerView = scheduleTransferHomeFragment.f33697B;
                                if (recyclerView != null) {
                                    p220oa.h.C(recyclerView);
                                }
                                textView2 = scheduleTransferHomeFragment.f33698C;
                                if (textView2 != null) {
                                    list = scheduleTransferHomeFragment.f33703X;
                                    if (list != null) {
                                        size = list.size();
                                    } else {
                                        size = 0;
                                    }
                                    if (size > 0) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    p220oa.h.s(textView2, z8);
                                }
                                scheduleTransferHomeFragment.u().setList(commonListResultV2.data);
                            }
                            if (scheduleTransferHomeFragment.f33701M) {
                                Collection collection2 = commonListResultV2.data;
                                if (!(collection2 == null || collection2.isEmpty())) {
                                    z3 = false;
                                } else {
                                    List list3 = scheduleTransferHomeFragment.f33703X;
                                    if ((list3 != null ? list3.size() : 0) > 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                }
                                scheduleTransferHomeFragment.f33702Q = z3;
                                scheduleTransferHomeFragment.f33701M = false;
                            }
                            TextView textView5 = scheduleTransferHomeFragment.f33698C;
                            if (textView5 != null) {
                                List list4 = scheduleTransferHomeFragment.f33703X;
                                p220oa.h.s(textView5, (list4 != null ? list4.size() : 0) > 0);
                            }
                            scheduleTransferHomeFragment.w();
                            View view = scheduleTransferHomeFragment.f33700L;
                            if (view != null) {
                                List list5 = scheduleTransferHomeFragment.f33703X;
                                p220oa.h.s(view, (list5 != null ? list5.size() : 0) <= 0 && scheduleTransferHomeFragment.u().getData().size() <= 0);
                            }
                        } else {
                            p220oa.h.y(scheduleTransferHomeFragment, commonListResultV2.getRespMsg());
                        }
                        ScheduleTransferHomeFragment.a aVar2 = ScheduleTransferHomeFragment.f33695k0;
                        PpSwipeRefreshLayout ppSwipeRefreshLayoutV = scheduleTransferHomeFragment.v();
                        if (ppSwipeRefreshLayoutV != null) {
                            ppSwipeRefreshLayoutV.setRefreshing(false);
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                        ToastUtils.showLong(nVar.f27358a, new Object[0]);
                        String str = nVar.f27358a;
                        ScheduleTransferHomeFragment.a aVar3 = ScheduleTransferHomeFragment.f33695k0;
                        PpSwipeRefreshLayout ppSwipeRefreshLayoutV2 = scheduleTransferHomeFragment.v();
                        if (ppSwipeRefreshLayoutV2 != null) {
                            ppSwipeRefreshLayoutV2.setRefreshing(false);
                        }
                        p220oa.h.y(scheduleTransferHomeFragment, str);
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonListResultV2 commonListResultV3 = (CommonListResultV2) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (commonListResultV3.isSuccess()) {
                            if (scheduleTransferHomeFragment.f33709v == 1) {
                                scheduleTransferHomeFragment.f33703X = commonListResultV3.data;
                                ScheduleTransferViewModel scheduleTransferViewModel = (ScheduleTransferViewModel) scheduleTransferHomeFragment.f27333i;
                                if (scheduleTransferViewModel != null) {
                                    p140j8.f.s(scheduleTransferViewModel, new C0389k0(1, null), scheduleTransferViewModel.f34015i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                            } else {
                                Collection<Object> collection3 = commonListResultV3.data;
                                if (collection3 != null) {
                                    if (scheduleTransferHomeFragment.f33702Q) {
                                        scheduleTransferHomeFragment.t().addData(collection3);
                                    }
                                    List list6 = scheduleTransferHomeFragment.f33703X;
                                    if (list6 != null) {
                                        list6.addAll(collection3);
                                    }
                                }
                            }
                            S1.c loadMoreModule = scheduleTransferHomeFragment.t().getLoadMoreModule();
                            List<T> list7 = commonListResultV3.data;
                            int size2 = list7 != 0 ? list7.size() : 0;
                            Intrinsics.checkNotNullParameter(loadMoreModule, "<this>");
                            if (10 > size2) {
                                loadMoreModule.g();
                            } else {
                                loadMoreModule.f();
                            }
                        } else {
                            p220oa.h.y(scheduleTransferHomeFragment, commonListResultV3.getRespMsg());
                            ScheduleTransferHomeFragment.a aVar4 = ScheduleTransferHomeFragment.f33695k0;
                            PpSwipeRefreshLayout ppSwipeRefreshLayoutV3 = scheduleTransferHomeFragment.v();
                            if (ppSwipeRefreshLayoutV3 != null) {
                                ppSwipeRefreshLayoutV3.setRefreshing(false);
                            }
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        com.transsnet.palmpay.core.base.n nVar2 = (com.transsnet.palmpay.core.base.n) it2;
                        ToastUtils.showLong(nVar2.f27358a, new Object[0]);
                        String str2 = nVar2.f27358a;
                        ScheduleTransferHomeFragment.a aVar5 = ScheduleTransferHomeFragment.f33695k0;
                        PpSwipeRefreshLayout ppSwipeRefreshLayoutV4 = scheduleTransferHomeFragment.v();
                        if (ppSwipeRefreshLayoutV4 != null) {
                            ppSwipeRefreshLayoutV4.setRefreshing(false);
                        }
                        p220oa.h.y(scheduleTransferHomeFragment, str2);
                    }
                }
                return Unit.f38893a;
        }
    }
}
