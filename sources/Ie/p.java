package Ie;

import Pa.C0525w;
import Pa.H;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.collections.C;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class p {
    public /* synthetic */ p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final Pair<ArrayList<Integer>, ArrayList<Integer>> diffSort(List<? extends HomePageMenuData> list) {
        IntRange intRangeF = C1850q.f(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : intRangeF) {
            if (!TextUtils.isEmpty(list.get(((Number) obj).intValue()).cornerImgUrl)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(list.get(((Number) it.next()).intValue()).cornerOrder));
        }
        kotlin.collections.u.m(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(q.f4389b);
        kotlin.collections.u.m(arrayList3);
        return new Pair<>(arrayList2, arrayList3);
    }

    private final void getMenuSpare(ArrayList<HomePageMenuData> arrayList) {
        HashMap map = H.f7018b;
        String string = TextUtils.isEmpty("Pref__home_menu_corner") ? null : H.e().getString("Pref__home_menu_corner", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                C0525w c0525wF = C0525w.f();
                Class<?> cls = new ArrayList().getClass();
                c0525wF.getClass();
                ArrayList arrayList2 = (ArrayList) C0525w.d(string, cls);
                Intrinsics.e(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    q.f4389b.add(Integer.valueOf((int) ((Number) it.next()).doubleValue()));
                }
            } catch (JsonSyntaxException e10) {
                e10.printStackTrace();
            }
        }
        try {
            CopyOnWriteArrayList copyOnWriteArrayList = q.f4389b;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                return;
            }
            IntRange intRangeF = C1850q.f(arrayList);
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = intRangeF.iterator();
            while (((Rf.b) it2).f8613c) {
                Object next = ((C) it2).next();
                if (!TextUtils.isEmpty(arrayList.get(((Number) next).intValue()).cornerImgUrl)) {
                    arrayList3.add(next);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(Integer.valueOf(arrayList.get(((Number) it3.next()).intValue()).cornerOrder));
            }
            kotlin.collections.u.m(arrayList4);
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                copyOnWriteArrayList2.add(Integer.valueOf(((Number) it4.next()).intValue()));
            }
            q.f4389b = copyOnWriteArrayList2;
        } catch (Exception e11) {
            F6.d.h("menu_excp_menuSpare", 3, "tag", e11);
        }
    }

    public final void clearCornerData() {
        CopyOnWriteArrayList copyOnWriteArrayList = q.f4389b;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        H.c(BaseApplication.getContext()).g("Pref__home_menu_corner", "");
    }

    public final void getMenuCornerLevel(@Nullable p354xe.g gVar, @NotNull ArrayList<HomePageMenuData> menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (gVar != null) {
            try {
                gVar.f43933i.clear();
            } catch (Exception unused) {
                return;
            }
        }
        q.f4389b.clear();
        if (menu.isEmpty()) {
            return;
        }
        getMenuSpare(menu);
        if (q.f4389b.isEmpty() || gVar == null) {
            return;
        }
        int size = q.f4389b.size();
        int iP = androidx.camera.core.impl.utils.executor.g.p();
        CopyOnWriteArrayList copyOnWriteArrayList = gVar.f43933i;
        if (size <= iP) {
            copyOnWriteArrayList.clear();
            copyOnWriteArrayList.addAll(q.f4389b);
        } else {
            List listSubList = q.f4389b.subList(0, androidx.camera.core.impl.utils.executor.g.p());
            Intrinsics.checkNotNullExpressionValue(listSubList, "subList(...)");
            copyOnWriteArrayList.clear();
            copyOnWriteArrayList.addAll(listSubList);
        }
    }

    public final void reFreshMenuAdapter(@Nullable p354xe.g gVar, @NotNull HomePageMenuData clickItem) {
        Intrinsics.checkNotNullParameter(clickItem, "clickItem");
        if (gVar != null) {
            try {
                CopyOnWriteArrayList copyOnWriteArrayList = gVar.f43933i;
                CopyOnWriteArrayList copyOnWriteArrayList2 = q.f4389b;
                if (copyOnWriteArrayList2 != null && !copyOnWriteArrayList2.isEmpty() && gVar.f43934j && q.f4389b.size() > androidx.camera.core.impl.utils.executor.g.p() && !TextUtils.isEmpty(clickItem.cornerImgUrl)) {
                    F6.d.h("MenuCornerUtils", 3, "reFreshMenuAdapter: allCornerList: " + q.f4389b);
                    Intrinsics.e(copyOnWriteArrayList);
                    Iterator it = copyOnWriteArrayList.iterator();
                    int i7 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i7 = -1;
                            break;
                        }
                        Object next = it.next();
                        int i10 = i7 + 1;
                        if (i7 < 0) {
                            C1850q.k();
                            throw null;
                        }
                        if (Intrinsics.c(next, Integer.valueOf(clickItem.cornerOrder))) {
                            break;
                        } else {
                            i7 = i10;
                        }
                    }
                    F6.d.h("MenuCornerUtils", 3, "reFreshMenuAdapter: click item index " + i7);
                    if (i7 > -1) {
                        q.f4389b.add((Integer) q.f4389b.remove(i7));
                        List listSubList = q.f4389b.subList(0, androidx.camera.core.impl.utils.executor.g.p() - 1);
                        Intrinsics.checkNotNullExpressionValue(listSubList, "subList(...)");
                        copyOnWriteArrayList.clear();
                        copyOnWriteArrayList.addAll(listSubList);
                        gVar.notifyDataSetChanged();
                        F6.d.h("MenuCornerUtils", 3, "reFreshMenuAdapter new list: " + q.f4389b);
                        H.c(BaseApplication.getContext()).g("Pref__home_menu_corner", ((Gson) C0525w.f().f7166b).toJson(q.f4389b, new ArrayList().getClass()));
                    }
                }
            } catch (Exception unused) {
                H.c(BaseApplication.getContext()).g("Pref__home_menu_corner", "");
                gVar.f43934j = false;
            }
        }
    }

    public final void showNextCorner(@Nullable p354xe.g gVar) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = q.f4389b;
        if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.isEmpty() || q.f4389b.size() <= androidx.camera.core.impl.utils.executor.g.p()) {
            F6.d.h("MenuCornerUtils", 3, "showNextCorner: corner is empty");
            return;
        }
        if (gVar == null || (copyOnWriteArrayList = gVar.f43933i) == null) {
            return;
        }
        try {
            if (copyOnWriteArrayList.size() < androidx.camera.core.impl.utils.executor.g.p()) {
                List listSubList = q.f4389b.subList(0, androidx.camera.core.impl.utils.executor.g.p());
                Intrinsics.checkNotNullExpressionValue(listSubList, "subList(...)");
                copyOnWriteArrayList.clear();
                copyOnWriteArrayList.addAll(listSubList);
                gVar.notifyDataSetChanged();
            }
        } catch (ConcurrentModificationException | Exception unused) {
        }
    }

    public final boolean updateMenuCornerLevel(@Nullable p354xe.g gVar, @NotNull List<? extends HomePageMenuData> menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        try {
            Pair<ArrayList<Integer>, ArrayList<Integer>> pairDiffSort = diffSort(menu);
            ArrayList arrayList = (ArrayList) pairDiffSort.f38891a;
            if (!Intrinsics.c(arrayList, (ArrayList) pairDiffSort.f38892b)) {
                clearCornerData();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    copyOnWriteArrayList.add(Integer.valueOf(((Number) it.next()).intValue()));
                }
                q.f4389b = copyOnWriteArrayList;
                if (gVar == null) {
                    return true;
                }
                int size = copyOnWriteArrayList.size();
                int iP = androidx.camera.core.impl.utils.executor.g.p();
                CopyOnWriteArrayList copyOnWriteArrayList2 = gVar.f43933i;
                if (size <= iP) {
                    copyOnWriteArrayList2.clear();
                    copyOnWriteArrayList2.addAll(q.f4389b);
                    return true;
                }
                List listSubList = q.f4389b.subList(0, androidx.camera.core.impl.utils.executor.g.p());
                Intrinsics.checkNotNullExpressionValue(listSubList, "subList(...)");
                copyOnWriteArrayList2.clear();
                copyOnWriteArrayList2.addAll(listSubList);
                return true;
            }
        } catch (ConcurrentModificationException e10) {
            F6.d.h("menu_Excp_current", 3, "tag", e10);
        } catch (Exception e11) {
            F6.d.h("menu_Excp", 3, "tag", e11);
        }
        return false;
    }

    private p() {
    }
}
