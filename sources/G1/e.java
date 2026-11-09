package G1;

import J1.i;
import J1.o;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.engine.m;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.model.Model;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.mikepenz.iconics.IconicsDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Request, SizeReadyCallback, ResourceCallback {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final boolean f2931B = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2932A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K1.b f2933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f2935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f2937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.f f2938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f2939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f2940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f2941i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2943k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f2944l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Target f2945m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f2946n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TransitionFactory f2947o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Executor f2948p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Resource f2949q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.camera.video.internal.c f2950r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile m f2951s;
    public Drawable t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f2952u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f2953v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2954w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2955x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f2956y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RuntimeException f2957z;

    public e(Context context, com.bumptech.glide.f fVar, Object obj, Object obj2, Class cls, a aVar, int i7, int i10, g gVar, Target target, c cVar, ArrayList arrayList, RequestCoordinator requestCoordinator, m mVar, TransitionFactory transitionFactory, Executor executor) {
        if (f2931B) {
            String.valueOf(hashCode());
        }
        this.f2933a = new K1.b();
        this.f2934b = obj;
        this.f2937e = context;
        this.f2938f = fVar;
        this.f2939g = obj2;
        this.f2940h = cls;
        this.f2941i = aVar;
        this.f2942j = i7;
        this.f2943k = i10;
        this.f2944l = gVar;
        this.f2945m = target;
        this.f2935c = cVar;
        this.f2946n = arrayList;
        this.f2936d = requestCoordinator;
        this.f2951s = mVar;
        this.f2947o = transitionFactory;
        this.f2948p = executor;
        this.f2932A = 1;
        if (this.f2957z == null && ((Map) fVar.f20466h.f6830b).containsKey(com.bumptech.glide.d.class)) {
            this.f2957z = new RuntimeException("Glide request origin trace");
        }
    }

    public final void a() {
        if (this.f2956y) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f2933a.a();
        this.f2945m.removeCallback(this);
        androidx.camera.video.internal.c cVar = this.f2950r;
        if (cVar != null) {
            synchronized (((m) cVar.f14622c)) {
                ((q) cVar.f14621b).f((e) cVar.f14623d);
            }
            this.f2950r = null;
        }
    }

    public final Drawable b() {
        int i7;
        if (this.f2952u == null) {
            a aVar = this.f2941i;
            Drawable drawable = aVar.f2909g;
            this.f2952u = drawable;
            if (drawable == null && (i7 = aVar.f2910i) > 0) {
                Resources.Theme theme = aVar.f2898L;
                Context context = this.f2937e;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.f2952u = androidx.camera.core.impl.utils.executor.g.n(context, context, i7, theme);
            }
        }
        return this.f2952u;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.Request
    public final void begin() {
        synchronized (this.f2934b) {
            try {
                if (this.f2956y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f2933a.a();
                int i7 = i.f4465a;
                SystemClock.elapsedRealtimeNanos();
                if (this.f2939g == null) {
                    if (o.i(this.f2942j, this.f2943k)) {
                        this.f2954w = this.f2942j;
                        this.f2955x = this.f2943k;
                    }
                    if (this.f2953v == null) {
                        this.f2953v = this.f2941i.f2915w;
                    }
                    c(new u("Received null model"), this.f2953v == null ? 5 : 3);
                    return;
                }
                int i10 = this.f2932A;
                if (i10 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i10 == 4) {
                    onResourceReady(this.f2949q, com.bumptech.glide.load.a.f20512e, false);
                    return;
                }
                ArrayList<RequestListener> arrayList = this.f2946n;
                if (arrayList != null) {
                    for (RequestListener requestListener : arrayList) {
                    }
                }
                this.f2932A = 3;
                if (o.i(this.f2942j, this.f2943k)) {
                    onSizeReady(this.f2942j, this.f2943k);
                } else {
                    this.f2945m.getSize(this);
                }
                int i11 = this.f2932A;
                if (i11 == 2 || i11 == 3) {
                    ?? r3 = this.f2936d;
                    if (r3 == 0 || r3.canNotifyStatusChanged(this)) {
                        this.f2945m.onLoadStarted(b());
                    }
                }
                if (f2931B) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    public final void c(u uVar, int i7) {
        boolean zOnLoadFailed;
        int i10;
        this.f2933a.a();
        synchronized (this.f2934b) {
            try {
                uVar.getClass();
                int i11 = this.f2938f.f20467i;
                if (i11 <= i7) {
                    Objects.toString(this.f2939g);
                    if (i11 <= 4) {
                        ArrayList arrayList = new ArrayList();
                        u.a(uVar, arrayList);
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            i12 = i13;
                        }
                    }
                }
                Drawable drawableB = null;
                this.f2950r = null;
                this.f2932A = 5;
                ?? r3 = this.f2936d;
                if (r3 != 0) {
                    r3.onRequestFailed(this);
                }
                boolean z3 = true;
                this.f2956y = true;
                try {
                    ArrayList<RequestListener> arrayList2 = this.f2946n;
                    if (arrayList2 != null) {
                        zOnLoadFailed = false;
                        for (RequestListener requestListener : arrayList2) {
                            Object obj = this.f2939g;
                            Target target = this.f2945m;
                            ?? r10 = this.f2936d;
                            zOnLoadFailed |= requestListener.onLoadFailed(uVar, obj, target, r10 == 0 || !r10.getRoot().isAnyResourceSet());
                        }
                    } else {
                        zOnLoadFailed = false;
                    }
                    c cVar = this.f2935c;
                    if (cVar != null) {
                        Object obj2 = this.f2939g;
                        Target target2 = this.f2945m;
                        ?? r11 = this.f2936d;
                        cVar.onLoadFailed(uVar, obj2, target2, r11 == 0 || !r11.getRoot().isAnyResourceSet());
                    }
                    if (!zOnLoadFailed) {
                        ?? r12 = this.f2936d;
                        if (r12 != 0 && !r12.canNotifyStatusChanged(this)) {
                            z3 = false;
                        }
                        if (z3) {
                            if (this.f2939g == null) {
                                if (this.f2953v == null) {
                                    this.f2953v = this.f2941i.f2915w;
                                }
                                drawableB = this.f2953v;
                            }
                            if (drawableB == null) {
                                if (this.t == null) {
                                    a aVar = this.f2941i;
                                    IconicsDrawable iconicsDrawable = aVar.f2907e;
                                    this.t = iconicsDrawable;
                                    if (iconicsDrawable == null && (i10 = aVar.f2908f) > 0) {
                                        Resources.Theme theme = aVar.f2898L;
                                        Context context = this.f2937e;
                                        if (theme == null) {
                                            theme = context.getTheme();
                                        }
                                        this.t = androidx.camera.core.impl.utils.executor.g.n(context, context, i10, theme);
                                    }
                                }
                                drawableB = this.t;
                            }
                            if (drawableB == null) {
                                drawableB = b();
                            }
                            this.f2945m.onLoadFailed(drawableB);
                        }
                    }
                    this.f2956y = false;
                } catch (Throwable th) {
                    this.f2956y = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.Request
    public final void clear() {
        synchronized (this.f2934b) {
            try {
                if (this.f2956y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f2933a.a();
                if (this.f2932A == 6) {
                    return;
                }
                a();
                Resource resource = this.f2949q;
                if (resource != null) {
                    this.f2949q = null;
                } else {
                    resource = null;
                }
                ?? r3 = this.f2936d;
                if (r3 == 0 || r3.canNotifyCleared(this)) {
                    this.f2945m.onLoadCleared(b());
                }
                this.f2932A = 6;
                if (resource != null) {
                    this.f2951s.getClass();
                    m.c(resource);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    public final void d(Resource resource, Object obj, com.bumptech.glide.load.a aVar) {
        boolean zOnResourceReady;
        ?? r3 = this.f2936d;
        boolean z3 = r3 == 0 || !r3.getRoot().isAnyResourceSet();
        this.f2932A = 4;
        this.f2949q = resource;
        if (this.f2938f.f20467i <= 3) {
            Objects.toString(aVar);
            Objects.toString(this.f2939g);
            int i7 = i.f4465a;
            SystemClock.elapsedRealtimeNanos();
        }
        if (r3 != 0) {
            r3.onRequestSuccess(this);
        }
        this.f2956y = true;
        try {
            ArrayList arrayList = this.f2946n;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                zOnResourceReady = false;
                while (it.hasNext()) {
                    Object obj2 = obj;
                    com.bumptech.glide.load.a aVar2 = aVar;
                    zOnResourceReady |= ((RequestListener) it.next()).onResourceReady(obj2, this.f2939g, this.f2945m, aVar2, z3);
                    obj = obj2;
                    aVar = aVar2;
                }
            } else {
                zOnResourceReady = false;
            }
            Object obj3 = obj;
            com.bumptech.glide.load.a aVar3 = aVar;
            c cVar = this.f2935c;
            if (cVar != null) {
                cVar.onResourceReady(obj3, this.f2939g, this.f2945m, aVar3, z3);
            }
            if (!zOnResourceReady) {
                this.f2945m.onResourceReady(obj3, this.f2947o.build(aVar3, z3));
            }
        } finally {
            this.f2956y = false;
        }
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public final Object getLock() {
        this.f2933a.a();
        return this.f2934b;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isAnyResourceSet() {
        boolean z3;
        synchronized (this.f2934b) {
            z3 = this.f2932A == 4;
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isCleared() {
        boolean z3;
        synchronized (this.f2934b) {
            z3 = this.f2932A == 6;
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isComplete() {
        boolean z3;
        synchronized (this.f2934b) {
            z3 = this.f2932A == 4;
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isEquivalentTo(Request request) {
        int i7;
        int i10;
        Object obj;
        Class cls;
        a aVar;
        g gVar;
        int size;
        int i11;
        int i12;
        Object obj2;
        Class cls2;
        a aVar2;
        g gVar2;
        int size2;
        boolean zIsEquivalentTo;
        boolean zN;
        if (!(request instanceof e)) {
            return false;
        }
        synchronized (this.f2934b) {
            try {
                i7 = this.f2942j;
                i10 = this.f2943k;
                obj = this.f2939g;
                cls = this.f2940h;
                aVar = this.f2941i;
                gVar = this.f2944l;
                ArrayList arrayList = this.f2946n;
                size = arrayList != null ? arrayList.size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = (e) request;
        synchronized (eVar.f2934b) {
            try {
                i11 = eVar.f2942j;
                i12 = eVar.f2943k;
                obj2 = eVar.f2939g;
                cls2 = eVar.f2940h;
                aVar2 = eVar.f2941i;
                gVar2 = eVar.f2944l;
                ArrayList arrayList2 = eVar.f2946n;
                size2 = arrayList2 != null ? arrayList2.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i7 != i11 || i10 != i12) {
            return false;
        }
        char[] cArr = o.f4478a;
        if (obj == null) {
            zIsEquivalentTo = obj2 == null;
        } else {
            zIsEquivalentTo = obj instanceof Model ? ((Model) obj).isEquivalentTo(obj2) : obj.equals(obj2);
        }
        if (!zIsEquivalentTo || !cls.equals(cls2)) {
            return false;
        }
        if (aVar == null) {
            zN = aVar2 == null;
        } else {
            zN = aVar.n(aVar2);
        }
        return zN && gVar == gVar2 && size == size2;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isRunning() {
        boolean z3;
        synchronized (this.f2934b) {
            int i7 = this.f2932A;
            z3 = i7 == 2 || i7 == 3;
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public final void onLoadFailed(u uVar) {
        c(uVar, 5);
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.ResourceCallback
    public final void onResourceReady(Resource resource, com.bumptech.glide.load.a aVar, boolean z3) {
        this.f2933a.a();
        Resource resource2 = null;
        try {
            synchronized (this.f2934b) {
                try {
                    this.f2950r = null;
                    if (resource == null) {
                        c(new u("Expected to receive a Resource<R> with an object of " + this.f2940h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = resource.get();
                    try {
                        if (obj == null || !this.f2940h.isAssignableFrom(obj.getClass())) {
                            this.f2949q = null;
                            StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                            sb2.append(this.f2940h);
                            sb2.append(" but instead got ");
                            sb2.append(obj != null ? obj.getClass() : "");
                            sb2.append("{");
                            sb2.append(obj);
                            sb2.append("} inside Resource{");
                            sb2.append(resource);
                            sb2.append("}.");
                            sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            c(new u(sb2.toString()), 5);
                        } else {
                            ?? r10 = this.f2936d;
                            if (r10 == 0 || r10.canSetImage(this)) {
                                d(resource, obj, aVar);
                                return;
                            } else {
                                this.f2949q = null;
                                this.f2932A = 4;
                            }
                        }
                        this.f2951s.getClass();
                        m.c(resource);
                    } catch (Throwable th) {
                        resource2 = resource;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (resource2 != null) {
                this.f2951s.getClass();
                m.c(resource2);
            }
            throw th3;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    public final void onSizeReady(int i7, int i10) throws Throwable {
        Object obj;
        e eVar = this;
        int iRound = i7;
        eVar.f2933a.a();
        Object obj2 = eVar.f2934b;
        synchronized (obj2) {
            try {
                try {
                    boolean z3 = f2931B;
                    if (z3) {
                        int i11 = i.f4465a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (eVar.f2932A == 3) {
                        eVar.f2932A = 2;
                        float f10 = eVar.f2941i.f2904b;
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * f10);
                        }
                        eVar.f2954w = iRound;
                        eVar.f2955x = i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
                        if (z3) {
                            int i12 = i.f4465a;
                            SystemClock.elapsedRealtimeNanos();
                        }
                        m mVar = eVar.f2951s;
                        try {
                            com.bumptech.glide.f fVar = eVar.f2938f;
                            Object obj3 = eVar.f2939g;
                            a aVar = eVar.f2941i;
                            try {
                                Key key = aVar.t;
                                int i13 = eVar.f2954w;
                                try {
                                    int i14 = eVar.f2955x;
                                    Class cls = aVar.f2896C;
                                    try {
                                        Class cls2 = eVar.f2940h;
                                        g gVar = eVar.f2944l;
                                        try {
                                            k kVar = aVar.f2905c;
                                            J1.d dVar = aVar.f2895B;
                                            try {
                                                boolean z8 = aVar.f2914v;
                                                boolean z10 = aVar.f2901X;
                                                try {
                                                    h hVar = aVar.f2894A;
                                                    boolean z11 = aVar.f2911j;
                                                    boolean z12 = aVar.f2902Y;
                                                    boolean z13 = aVar.f2900Q;
                                                    Executor executor = eVar.f2948p;
                                                    Object obj4 = obj2;
                                                    try {
                                                        eVar.f2950r = mVar.a(fVar, obj3, key, i13, i14, cls, cls2, gVar, kVar, dVar, z8, z10, hVar, z11, z12, z13, eVar, executor);
                                                        if (eVar.f2932A != 2) {
                                                            eVar.f2950r = null;
                                                        }
                                                        if (z3) {
                                                            int i15 = i.f4465a;
                                                            SystemClock.elapsedRealtimeNanos();
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        obj = obj4;
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    obj = obj2;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                obj = obj2;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj = obj2;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj = obj2;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj = obj2;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                obj = obj2;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    obj = obj2;
                }
            } catch (Throwable th10) {
                th = th10;
                obj = eVar;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final void pause() {
        synchronized (this.f2934b) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f2934b) {
            obj = this.f2939g;
            cls = this.f2940h;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[model=");
        sb2.append(obj);
        sb2.append(", transcodeClass=");
        return androidx.camera.video.u.o(sb2, cls, "]");
    }
}
