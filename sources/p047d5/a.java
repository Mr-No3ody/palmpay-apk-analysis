package p047d5;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import androidx.camera.video.u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import io.fastkv.n;
import java.util.WeakHashMap;
import p021b5.b;
import p021b5.c;
import p021b5.d;
import p198n5.h;
import p305u5.f;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f35521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f35523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f35527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f35529i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35530j;

    public final b a() {
        MenuItem menuItemA;
        int childPosition;
        if (this.f35529i) {
            if (this.f35521a.getParent() != null && (this.f35521a.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) this.f35521a.getParent();
                if (p291t5.a.f42332c && (viewGroup instanceof ViewPager)) {
                    this.f35530j = ((ViewPager) viewGroup).getCurrentItem();
                } else if (p291t5.a.f42330a && (viewGroup instanceof ViewPager)) {
                    this.f35530j = ((ViewPager) viewGroup).getCurrentItem();
                } else if (viewGroup instanceof AdapterView) {
                    this.f35530j = ((AdapterView) viewGroup).getFirstVisiblePosition() + this.f35530j;
                } else if ((p291t5.a.f42338i && (viewGroup instanceof RecyclerView)) || (p291t5.a.f42336g && (viewGroup instanceof RecyclerView))) {
                    View view = this.f35521a;
                    if (p291t5.a.f42338i && (viewGroup instanceof RecyclerView)) {
                        childPosition = ((RecyclerView) viewGroup).getChildAdapterPosition(view);
                    } else if (p291t5.a.f42336g && (viewGroup instanceof RecyclerView)) {
                        try {
                            childPosition = ((RecyclerView) viewGroup).getChildAdapterPosition(view);
                        } catch (Throwable unused) {
                            childPosition = ((RecyclerView) viewGroup).getChildPosition(view);
                        }
                    } else {
                        childPosition = -1;
                    }
                    if (childPosition >= 0) {
                        this.f35530j = childPosition;
                    }
                }
            }
            ViewParent parent = this.f35521a.getParent();
            if (parent != null) {
                C2085k0 c2085k0 = f.f42708a;
                View view2 = this.f35521a;
                c2085k0.getClass();
                if ((view2.getParent() instanceof View) || (parent instanceof View)) {
                    String strQ = p059e1.a.q(this.f35521a);
                    b bVarK = p059e1.a.K(this.f35521a);
                    if (strQ != null) {
                        String strConcat = "/".concat(strQ);
                        this.f35523c = strConcat;
                        this.f35522b = strConcat;
                    } else if (bVarK != null) {
                        this.f35523c = "/Page";
                        this.f35522b = "/Page";
                        this.f35527g = "/Page";
                    } else {
                        StringBuilder sb2 = new StringBuilder(this.f35523c);
                        StringBuilder sb3 = new StringBuilder(this.f35522b);
                        String simpleName = this.f35521a.getClass().getSimpleName();
                        if (TextUtils.isEmpty(simpleName)) {
                            simpleName = "Anonymous";
                        }
                        if (!p034c5.a.b(this.f35521a) || (menuItemA = new p034c5.a(this.f35521a).a()) == null) {
                            if (parent instanceof ViewGroup) {
                                ViewGroup viewGroup2 = (ViewGroup) parent;
                                if (viewGroup2 instanceof ExpandableListView) {
                                    ExpandableListView expandableListView = (ExpandableListView) viewGroup2;
                                    long expandableListPosition = ((ExpandableListView) this.f35521a.getParent()).getExpandableListPosition(this.f35530j);
                                    if (ExpandableListView.getPackedPositionType(expandableListPosition) != 2) {
                                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(expandableListPosition);
                                        int packedPositionChild = ExpandableListView.getPackedPositionChild(expandableListPosition);
                                        if (packedPositionChild != -1) {
                                            this.f35528h = packedPositionChild;
                                            StringBuilder sb4 = new StringBuilder(sb2);
                                            sb4.append("/ELVG[");
                                            sb4.append(packedPositionGroup);
                                            sb4.append("]/ELVC[-]/");
                                            sb4.append(simpleName);
                                            sb4.append("[0]");
                                            sb2.append("/ELVG[");
                                            sb2.append(packedPositionGroup);
                                            sb2.append("]/ELVC[");
                                            sb2.append(packedPositionChild);
                                            sb2.append("]/");
                                            sb2.append(simpleName);
                                            sb2.append("[0]");
                                            sb3 = sb4;
                                        } else {
                                            this.f35528h = packedPositionGroup;
                                            sb3 = new StringBuilder(sb2);
                                            sb3.append("/ELVG[-]/");
                                            sb3.append(simpleName);
                                            sb3.append("[0]");
                                            sb2.append("/ELVG[");
                                            sb2.append(packedPositionGroup);
                                            sb2.append("]/");
                                            sb2.append(simpleName);
                                            sb2.append("[0]");
                                        }
                                    } else if (this.f35530j < expandableListView.getHeaderViewsCount()) {
                                        sb2.append("/ELH[");
                                        sb2.append(this.f35530j);
                                        sb2.append("]/");
                                        sb2.append(simpleName);
                                        sb2.append("[0]");
                                        sb3.append("/ELH[");
                                        sb3.append(this.f35530j);
                                        sb3.append("]/");
                                        sb3.append(simpleName);
                                        sb3.append("[0]");
                                    } else {
                                        int count = this.f35530j - (expandableListView.getCount() - expandableListView.getFooterViewsCount());
                                        sb2.append("/ELF[");
                                        sb2.append(count);
                                        u.w(sb2, "]/", simpleName, "[0]");
                                        sb3.append("/ELF[");
                                        sb3.append(count);
                                        sb3.append("]/");
                                        sb3.append(simpleName);
                                        sb3.append("[0]");
                                    }
                                } else if (p291t5.a.d(viewGroup2) || ((p291t5.a.f42338i && (viewGroup2 instanceof RecyclerView)) || (p291t5.a.f42336g && (viewGroup2 instanceof RecyclerView)))) {
                                    this.f35528h = this.f35530j;
                                    sb3 = new StringBuilder(sb2);
                                    sb3.append("/");
                                    sb3.append(simpleName);
                                    sb3.append("[-]");
                                    sb2.append("/");
                                    sb2.append(simpleName);
                                    sb2.append("[");
                                    sb2.append(this.f35530j);
                                    sb2.append("]");
                                } else if ((!p291t5.a.f42339j || !(parent instanceof SwipeRefreshLayout)) && (!p291t5.a.f42337h || !(parent instanceof SwipeRefreshLayout))) {
                                    String simpleName2 = this.f35521a.getClass().getSimpleName();
                                    int i7 = 0;
                                    int i10 = 0;
                                    while (true) {
                                        if (i7 >= viewGroup2.getChildCount()) {
                                            u.w(sb2, "/", simpleName, "[");
                                            sb2.append(this.f35530j);
                                            sb2.append("]");
                                            sb3.append("/");
                                            sb3.append(simpleName);
                                            sb3.append("[");
                                            sb3.append(this.f35530j);
                                            sb3.append("]");
                                            break;
                                        }
                                        View childAt = viewGroup2.getChildAt(i7);
                                        if (childAt == this.f35521a) {
                                            sb2.append("/");
                                            sb2.append(simpleName);
                                            sb2.append("[");
                                            sb2.append(i10);
                                            sb2.append("]");
                                            sb3.append("/");
                                            sb3.append(simpleName);
                                            sb3.append("[");
                                            sb3.append(i10);
                                            sb3.append("]");
                                            break;
                                        }
                                        if (childAt.getClass().getSimpleName().equals(simpleName2)) {
                                            i10++;
                                        }
                                        i7++;
                                    }
                                } else {
                                    u.w(sb2, "/", simpleName, "[0]");
                                    u.w(sb3, "/", simpleName, "[0]");
                                }
                            } else {
                                u.w(sb2, "/", simpleName, "[");
                                sb2.append(this.f35530j);
                                sb2.append("]");
                                sb3.append("/");
                                sb3.append(simpleName);
                                sb3.append("[");
                                sb3.append(this.f35530j);
                                sb3.append("]");
                            }
                            View view3 = this.f35521a;
                            Context context = view3.getContext();
                            int id2 = view3.getId();
                            String resourceEntryName = null;
                            if (id2 > 2130706432) {
                                try {
                                    resourceEntryName = context.getResources().getResourceEntryName(id2);
                                } catch (Resources.NotFoundException e10) {
                                    h.b("ViewHelper", e10);
                                }
                            }
                            if (resourceEntryName != null) {
                                sb2.append("#");
                                sb2.append(resourceEntryName);
                                sb3.append("#");
                                sb3.append(resourceEntryName);
                            }
                            this.f35522b = sb3.toString();
                            this.f35523c = sb2.toString();
                        } else {
                            Activity activityX = p279s5.a.f42018a.x();
                            WeakHashMap weakHashMap = d.f18781a;
                            c.f18780a.getClass();
                            b bVarK2 = n.k((b) d.f18781a.get(activityX), menuItemA);
                            this.f35522b = bVarK2.f35532b;
                            this.f35528h = bVarK2.f35538h;
                            this.f35525e = bVarK2.f35535e;
                            String str = bVarK2.f35533c;
                            this.f35523c = str;
                            this.f35527g = str;
                        }
                    }
                }
            }
            this.f35525e = n.q(this.f35521a);
        }
        b bVar = new b();
        bVar.f35531a = this.f35521a;
        bVar.f35532b = this.f35522b;
        bVar.f35533c = this.f35523c;
        bVar.f35534d = this.f35524d;
        bVar.f35535e = this.f35525e;
        bVar.f35536f = this.f35526f;
        bVar.f35537g = this.f35527g;
        bVar.f35538h = this.f35528h;
        return bVar;
    }
}
