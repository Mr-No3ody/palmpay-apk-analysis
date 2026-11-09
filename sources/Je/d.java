package Je;

import Gb.T;
import Ie.q;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import com.transsnet.palmpay.core.init.PpPerfTrace;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.fragment.HomeFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HomeFragment f4777a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4779c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f4781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f4782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f4783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p354xe.g f4784h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f4786j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4787k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f4788l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4789m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4778b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f4780d = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f4785i = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f4790n = new c(this);

    static {
        new b(null);
    }

    public d(HomeFragment homeFragment) {
        this.f4777a = homeFragment;
    }

    public final void a(int i7) {
        TextPaint textPaint;
        View view;
        TextView textView;
        TextPaint paint;
        View view2;
        LinearLayout linearLayout = i7 == 0 ? this.f4782f : this.f4783g;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        int i10 = i7 * 4;
        int i11 = i10 + 4;
        ArrayList arrayList = this.f4780d;
        int size = arrayList.size();
        if (i11 > size) {
            i11 = size;
        }
        if (i10 >= i11) {
            return;
        }
        List listSubList = arrayList.subList(i10, i11);
        Intrinsics.checkNotNullExpressionValue(listSubList, "subList(...)");
        int width = linearLayout.getWidth();
        if (width <= 0) {
            linearLayout.post(new B3.a(this, i7, 1));
            return;
        }
        int dp = ((width - (CommonViewExtKt.getDp(6) * 3)) / 4) - (CommonViewExtKt.getDp(6) * 2);
        boolean z3 = true;
        if (dp < 1) {
            dp = 1;
        }
        StringBuilder sb2 = new StringBuilder((listSubList.size() * 16) + 8);
        sb2.append(dp);
        sb2.append('|');
        List list = listSubList;
        Iterator it = list.iterator();
        int i12 = 0;
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                String string = sb2.toString();
                String str2 = i7 == 0 ? this.f4786j : this.f4788l;
                boolean z8 = i7 == 0 ? this.f4787k : this.f4789m;
                int height = linearLayout.getHeight();
                ArrayList arrayList2 = this.f4785i;
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) CollectionsKt.G(i10, arrayList2);
                TextView textView2 = (viewHolder == null || (view2 = viewHolder.itemView) == null) ? null : (TextView) view2.findViewById(Ac.e.tvTitle);
                if (textView2 != null) {
                    textPaint = new TextPaint(textView2.getPaint());
                } else {
                    textPaint = new TextPaint();
                    textPaint.setTextSize(CommonViewExtKt.getDp(12));
                    textPaint.setAntiAlias(true);
                }
                if (!Intrinsics.c(string, str2)) {
                    RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) CollectionsKt.G(i10, arrayList2);
                    if (viewHolder2 != null && (view = viewHolder2.itemView) != null && (textView = (TextView) view.findViewById(Ac.e.tvTitle)) != null && (paint = textView.getPaint()) != null) {
                        textPaint = new TextPaint(paint);
                    }
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z3 = false;
                                break;
                            }
                            String str3 = ((HomePageMenuData) it2.next()).menuName;
                            if (str3 == null) {
                                str3 = "";
                            }
                            if (str3.length() != 0 && dp > 0) {
                                if (StringsKt.D(str3, '\n', 0, 6) >= 0) {
                                    break;
                                }
                                StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str3, 0, str3.length(), textPaint, dp).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false).setLineSpacing(0.0f, 1.0f).setMaxLines(2).build();
                                Intrinsics.e(staticLayoutBuild);
                                if (staticLayoutBuild.getLineCount() > 1) {
                                    break;
                                }
                            }
                        }
                    } else {
                        z3 = false;
                        break;
                    }
                    if (i7 == 0) {
                        this.f4786j = string;
                        this.f4787k = z3;
                    } else {
                        this.f4788l = string;
                        this.f4789m = z3;
                    }
                    z8 = z3;
                }
                int dp2 = CommonViewExtKt.getDp(z8 ? 66 : 54);
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams == null) {
                    return;
                }
                if (layoutParams.height != dp2 || (height > 0 && height != dp2)) {
                    layoutParams.height = dp2;
                    linearLayout.setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C1850q.k();
                throw null;
            }
            HomePageMenuData homePageMenuData = (HomePageMenuData) next;
            if (i12 > 0) {
                sb2.append((char) 1);
            }
            String str4 = homePageMenuData.menuName;
            if (str4 != null) {
                str = str4;
            }
            sb2.append(str);
            i12 = i13;
        }
    }

    public final void b() {
        ViewGroup.LayoutParams layoutParams;
        int dp;
        ViewGroup.LayoutParams layoutParams2;
        int dp2;
        LinearLayout linearLayout = this.f4782f;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        LinearLayout linearLayout2 = this.f4783g;
        if (linearLayout2 != null) {
            linearLayout2.removeAllViews();
        }
        LinearLayout linearLayout3 = this.f4783g;
        if (linearLayout3 != null) {
            p220oa.h.s(linearLayout3, false);
        }
        this.f4785i.clear();
        ArrayList arrayList = this.f4780d;
        arrayList.clear();
        p354xe.g gVar = this.f4784h;
        if (gVar != null) {
            gVar.f4985b = arrayList;
        }
        this.f4786j = null;
        this.f4787k = false;
        this.f4788l = null;
        this.f4789m = false;
        LinearLayout linearLayout4 = this.f4782f;
        if (linearLayout4 != null && (layoutParams2 = linearLayout4.getLayoutParams()) != null && layoutParams2.height != (dp2 = CommonViewExtKt.getDp(54))) {
            layoutParams2.height = dp2;
            linearLayout4.setLayoutParams(layoutParams2);
        }
        LinearLayout linearLayout5 = this.f4783g;
        if (linearLayout5 == null || (layoutParams = linearLayout5.getLayoutParams()) == null || layoutParams.height == (dp = CommonViewExtKt.getDp(54))) {
            return;
        }
        layoutParams.height = dp;
        linearLayout5.setLayoutParams(layoutParams);
    }

    public final void c() {
        p354xe.g gVar = this.f4784h;
        if (gVar == null) {
            return;
        }
        int size = this.f4780d.size();
        ArrayList arrayList = this.f4785i;
        int size2 = arrayList.size();
        for (int i7 = 0; i7 < size2; i7++) {
            Object obj = arrayList.get(i7);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj;
            if (i7 < size) {
                viewHolder.itemView.setVisibility(0);
                gVar.bindViewHolder(viewHolder, i7);
            } else {
                viewHolder.itemView.setVisibility(4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(List list) {
        PpPerfTrace.begin("Home.funMenu.bind.v2");
        try {
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                b();
                View view = this.f4781e;
                if (view != null) {
                    p220oa.h.s(view, false);
                }
            } else {
                if (list.size() > 8) {
                    list = list.subList(0, 8);
                }
                View view2 = this.f4781e;
                if (view2 != null) {
                    p220oa.h.s(view2, true);
                }
                ArrayList<HomePageMenuData> arrayList = this.f4780d;
                boolean z3 = arrayList.size() != list.size();
                if (this.f4778b) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    p354xe.g gVar = this.f4784h;
                    if (gVar != null) {
                        gVar.f4985b = arrayList;
                    }
                    q.f4388a.getMenuCornerLevel(gVar, arrayList);
                    this.f4778b = false;
                } else {
                    q.f4388a.updateMenuCornerLevel(this.f4784h, list);
                    arrayList.clear();
                    arrayList.addAll(list);
                    p354xe.g gVar2 = this.f4784h;
                    if (gVar2 != null) {
                        gVar2.f4985b = arrayList;
                    }
                }
                this.f4786j = null;
                this.f4788l = null;
                if (z3 || this.f4785i.isEmpty()) {
                    e(list.size());
                }
                c();
                a(0);
                if (list.size() > 4) {
                    a(1);
                }
            }
            Unit unit = Unit.f38893a;
        } finally {
            PpPerfTrace.end();
        }
    }

    public final void e(int i7) {
        ArrayList arrayList;
        LinearLayout linearLayout;
        p354xe.g gVar = this.f4784h;
        if (gVar == null) {
            return;
        }
        int i10 = i7 <= 0 ? 0 : (i7 + 3) / 4;
        int i11 = i10 * 4;
        LinearLayout linearLayout2 = this.f4783g;
        if (linearLayout2 != null) {
            p220oa.h.s(linearLayout2, i10 > 1);
        }
        while (true) {
            arrayList = this.f4785i;
            if (arrayList.size() <= i11) {
                break;
            }
            int iG = C1850q.g(arrayList);
            Object objRemove = arrayList.remove(iG);
            Intrinsics.checkNotNullExpressionValue(objRemove, "removeAt(...)");
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) objRemove;
            LinearLayout linearLayout3 = iG < 4 ? this.f4782f : this.f4783g;
            if (linearLayout3 != null) {
                linearLayout3.removeView(viewHolder.itemView);
            }
        }
        while (arrayList.size() < i11) {
            int size = arrayList.size();
            if (size < 4) {
                linearLayout = this.f4782f;
                if (linearLayout == null) {
                    return;
                }
            } else {
                linearLayout = this.f4783g;
                if (linearLayout == null) {
                    return;
                }
            }
            int i12 = size % 4;
            RecyclerView.ViewHolder viewHolderCreateViewHolder = gVar.createViewHolder(linearLayout, 0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
            if (i12 > 0) {
                layoutParams.setMarginStart(CommonViewExtKt.getDp(6));
            }
            linearLayout.addView(viewHolderCreateViewHolder.itemView, layoutParams);
            arrayList.add(viewHolderCreateViewHolder);
            viewHolderCreateViewHolder.itemView.setOnClickListener(new T(8, viewHolderCreateViewHolder, this));
        }
    }
}
