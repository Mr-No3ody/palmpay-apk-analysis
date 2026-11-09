package Ie;

import Gb.T;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f4373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f4374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p354xe.g f4375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f4376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f4377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f4378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4379g;

    static {
        new l(null);
    }

    public m(View view) {
        this.f4373a = view;
        LinearLayout linearLayout = null;
        LinearLayout linearLayout2 = view instanceof LinearLayout ? (LinearLayout) view : null;
        if (linearLayout2 != null) {
            linearLayout = linearLayout2;
        } else if (view != null) {
            linearLayout = (LinearLayout) view.findViewById(Ac.e.functionList);
        }
        this.f4374b = linearLayout;
        Intrinsics.e(view);
        p354xe.g gVar = new p354xe.g(view.getContext());
        gVar.f43931f = true;
        gVar.f43935o = 1;
        this.f4375c = gVar;
        this.f4376d = new ArrayList();
        this.f4377e = new ArrayList();
        if (linearLayout != null) {
            linearLayout.addOnLayoutChangeListener(new k(this, 0));
        }
    }

    public final void a() {
        ArrayList arrayList;
        int size;
        TextPaint textPaint;
        boolean z3;
        View view;
        LinearLayout linearLayout = this.f4374b;
        if (linearLayout == null || (size = (arrayList = this.f4377e).size()) <= 0) {
            return;
        }
        int width = linearLayout.getWidth();
        if (width <= 0) {
            linearLayout.post(new Ae.n(this, 22));
            return;
        }
        int dp = ((width - ((size - 1) * CommonViewExtKt.getDp(6))) / size) - (CommonViewExtKt.getDp(3) * 2);
        boolean z8 = true;
        if (dp < 1) {
            dp = 1;
        }
        StringBuilder sb2 = new StringBuilder((arrayList.size() * 16) + 8);
        sb2.append(dp);
        sb2.append('|');
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (true) {
            TextView textView = null;
            if (!it.hasNext()) {
                String string = sb2.toString();
                if (Intrinsics.c(string, this.f4378f)) {
                    z3 = this.f4379g;
                } else {
                    RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) CollectionsKt.firstOrNull(this.f4376d);
                    if (viewHolder != null && (view = viewHolder.itemView) != null) {
                        textView = (TextView) view.findViewById(Ac.e.tvTitle);
                    }
                    if (textView != null) {
                        textPaint = new TextPaint(textView.getPaint());
                    } else {
                        textPaint = new TextPaint();
                        textPaint.setTextSize(CommonViewExtKt.getDp(12));
                        textPaint.setAntiAlias(true);
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z8 = false;
                                break;
                            }
                            String str = ((HomePageMenuData) it2.next()).menuName;
                            if (str != null && str.length() != 0 && dp > 0) {
                                if (StringsKt.D(str, '\n', 0, 6) >= 0) {
                                    break;
                                }
                                StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, dp).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false).setLineSpacing(0.0f, 1.0f).setMaxLines(2).build();
                                Intrinsics.e(staticLayoutBuild);
                                if (staticLayoutBuild.getLineCount() > 1) {
                                    break;
                                }
                            }
                        }
                    } else {
                        z8 = false;
                        break;
                    }
                    this.f4378f = string;
                    this.f4379g = z8;
                    z3 = z8;
                }
                int dp2 = CommonViewExtKt.getDp(z3 ? 84 : 71);
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams == null || layoutParams.height == dp2) {
                    return;
                }
                layoutParams.height = dp2;
                linearLayout.setLayoutParams(layoutParams);
                return;
            }
            Object next = it.next();
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            HomePageMenuData homePageMenuData = (HomePageMenuData) next;
            if (i7 > 0) {
                sb2.append((char) 1);
            }
            String str2 = homePageMenuData.menuName;
            if (str2 == null) {
                str2 = "";
            }
            sb2.append(str2);
            i7 = i10;
        }
    }

    public final void b() {
        ViewGroup.LayoutParams layoutParams;
        LinearLayout linearLayout = this.f4374b;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        this.f4376d.clear();
        ArrayList arrayList = this.f4377e;
        arrayList.clear();
        this.f4375c.f4985b = arrayList;
        this.f4378f = null;
        this.f4379g = false;
        if (linearLayout == null || (layoutParams = linearLayout.getLayoutParams()) == null || layoutParams.height == CommonViewExtKt.getDp(71)) {
            return;
        }
        layoutParams.height = CommonViewExtKt.getDp(71);
        linearLayout.setLayoutParams(layoutParams);
    }

    public final void c(List list) {
        p354xe.g gVar = this.f4375c;
        PpPerfTrace.begin("Home.sendMoney.bind");
        try {
            List list2 = list;
            View view = this.f4373a;
            if (list2 == null || list2.isEmpty()) {
                b();
                if (view != null) {
                    p220oa.h.s(view, false);
                }
            } else {
                List list3 = list;
                if (list3 == null || list3.isEmpty()) {
                    list = z.f38935a;
                } else if (list.size() > 4) {
                    list = list.subList(0, 4);
                }
                if (view != null) {
                    p220oa.h.s(view, true);
                }
                ArrayList arrayList = this.f4377e;
                if (arrayList.size() != list.size() || !arrayList.equals(list)) {
                    boolean z3 = arrayList.size() != list.size();
                    arrayList.clear();
                    arrayList.addAll(list);
                    gVar.f4985b = arrayList;
                    this.f4378f = null;
                    if (z3) {
                        d(list.size());
                    }
                    int size = list.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        Object obj = this.f4376d.get(i7);
                        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                        gVar.bindViewHolder((RecyclerView.ViewHolder) obj, i7);
                    }
                    a();
                }
            }
            Unit unit = Unit.f38893a;
        } finally {
            PpPerfTrace.end();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d(int i7) {
        ArrayList arrayList;
        LinearLayout linearLayout = this.f4374b;
        if (linearLayout == null) {
            return;
        }
        while (true) {
            arrayList = this.f4376d;
            if (arrayList.size() <= i7) {
                break;
            } else {
                linearLayout.removeView(((RecyclerView.ViewHolder) arrayList.remove(C1850q.g(arrayList))).itemView);
            }
        }
        while (arrayList.size() < i7) {
            int size = arrayList.size();
            RecyclerView.ViewHolder viewHolderCreateViewHolder = this.f4375c.createViewHolder(linearLayout, 0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
            if (size > 0) {
                layoutParams.setMarginStart(CommonViewExtKt.getDp(6));
            }
            linearLayout.addView(viewHolderCreateViewHolder.itemView, layoutParams);
            arrayList.add(viewHolderCreateViewHolder);
            viewHolderCreateViewHolder.itemView.setOnClickListener(new T(5, this, viewHolderCreateViewHolder));
        }
    }
}
