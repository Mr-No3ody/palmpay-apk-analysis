package R;

import androidx.constraintlayout.core.widgets.analyzer.Dependency;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e implements Dependency {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f7875d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7878g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f7872a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7873b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7874c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7876e = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7879h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f7880i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7881j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f7882k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f7883l = new ArrayList();

    public e(n nVar) {
        this.f7875d = nVar;
    }

    public final void a(n nVar) {
        this.f7882k.add(nVar);
        if (this.f7881j) {
            nVar.update(nVar);
        }
    }

    public final void b() {
        this.f7883l.clear();
        this.f7882k.clear();
        this.f7881j = false;
        this.f7878g = 0;
        this.f7874c = false;
        this.f7873b = false;
    }

    public void c(int i7) {
        if (this.f7881j) {
            return;
        }
        this.f7881j = true;
        this.f7878g = i7;
        for (Dependency dependency : this.f7882k) {
            dependency.update(dependency);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7875d.f7898b.f7477k0);
        sb2.append(":");
        switch (this.f7876e) {
            case 1:
                str = p381za.c.UNKNOWN_PROCESS_NAME;
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = BuildConfig.TRAVIS;
                break;
        }
        sb2.append(str);
        sb2.append("(");
        sb2.append(this.f7881j ? Integer.valueOf(this.f7878g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f7883l.size());
        sb2.append(":d=");
        sb2.append(this.f7882k.size());
        sb2.append(">");
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public final void update(Dependency dependency) {
        ArrayList<e> arrayList = this.f7883l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((e) it.next()).f7881j) {
                return;
            }
        }
        this.f7874c = true;
        n nVar = this.f7872a;
        if (nVar != null) {
            nVar.update(this);
        }
        if (this.f7873b) {
            this.f7875d.update(this);
            return;
        }
        e eVar = null;
        int i7 = 0;
        for (e eVar2 : arrayList) {
            if (!(eVar2 instanceof f)) {
                i7++;
                eVar = eVar2;
            }
        }
        if (eVar != null && i7 == 1 && eVar.f7881j) {
            f fVar = this.f7880i;
            if (fVar != null) {
                if (!fVar.f7881j) {
                    return;
                } else {
                    this.f7877f = this.f7879h * fVar.f7878g;
                }
            }
            c(eVar.f7878g + this.f7877f);
        }
        n nVar2 = this.f7872a;
        if (nVar2 != null) {
            nVar2.update(this);
        }
    }
}
