package I2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.drawee.drawable.n;
import com.facebook.drawee.drawable.o;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final o f3971q = o.f21331d;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o f3972r = o.f21330c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f3973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3974b = 300;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3975c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f3976d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f3977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f3978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n f3979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f3980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n f3981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f3982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n f3983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n f3984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f3985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f3986n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public StateListDrawable f3987o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f3988p;

    public b(Resources resources) {
        this.f3973a = resources;
        o oVar = f3971q;
        this.f3977e = oVar;
        this.f3978f = null;
        this.f3979g = oVar;
        this.f3980h = null;
        this.f3981i = oVar;
        this.f3982j = null;
        this.f3983k = oVar;
        this.f3984l = f3972r;
        this.f3985m = null;
        this.f3986n = null;
        this.f3987o = null;
        this.f3988p = null;
    }

    public final a a() {
        List list = this.f3986n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Drawable) it.next()).getClass();
            }
        }
        return new a(this);
    }
}
