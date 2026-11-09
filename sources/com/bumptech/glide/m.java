package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class m extends G1.a implements ModelTypes {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final Context f21021Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final p f21022k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Class f21023p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final f f21024q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public q f21025r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Object f21026s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ArrayList f21027t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public m f21028u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public m f21029v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f21030w0 = true;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f21031x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f21032y0;

    static {
    }

    public m(b bVar, p pVar, Class cls, Context context) {
        G1.d dVar;
        this.f21022k0 = pVar;
        this.f21023p0 = cls;
        this.f21021Z = context;
        M.f fVar = pVar.f21067a.f20436d.f20464f;
        q qVar = (q) fVar.get(cls);
        if (qVar == null) {
            for (Map.Entry entry : (M.a) fVar.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    qVar = (q) entry.getValue();
                }
            }
        }
        this.f21025r0 = qVar == null ? f.f20458k : qVar;
        this.f21024q0 = bVar.f20436d;
        Iterator it = pVar.f21075j.iterator();
        while (it.hasNext()) {
            N((RequestListener) it.next());
        }
        synchronized (pVar) {
            dVar = pVar.f21076o;
        }
        a(dVar);
    }

    public m N(RequestListener requestListener) {
        if (this.f2899M) {
            return clone().N(requestListener);
        }
        if (requestListener != null) {
            if (this.f21027t0 == null) {
                this.f21027t0 = new ArrayList();
            }
            this.f21027t0.add(requestListener);
        }
        B();
        return this;
    }

    @Override // G1.a
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public m a(G1.a aVar) {
        J1.g.b(aVar);
        return (m) super.a(aVar);
    }

    public final m P(m mVar) {
        Context context = this.f21021Z;
        return (m) ((m) mVar.G(context.getTheme())).D(new I1.a(context.getResources().getConfiguration().uiMode & 48, I1.b.a(context)));
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final Request Q(Object obj, Target target, G1.c cVar, RequestCoordinator requestCoordinator, q qVar, g gVar, int i7, int i10, G1.a aVar, Executor executor) {
        RequestCoordinator requestCoordinator2;
        RequestCoordinator bVar;
        G1.a aVar2;
        Request eVar;
        g gVar2;
        if (this.f21029v0 != null) {
            bVar = new G1.b(obj, requestCoordinator);
            requestCoordinator2 = bVar;
        } else {
            requestCoordinator2 = null;
            bVar = requestCoordinator;
        }
        m mVar = this.f21028u0;
        if (mVar == null) {
            Object obj2 = this.f21026s0;
            ArrayList arrayList = this.f21027t0;
            f fVar = this.f21024q0;
            aVar2 = aVar;
            eVar = new G1.e(this.f21021Z, fVar, obj, obj2, this.f21023p0, aVar2, i7, i10, gVar, target, cVar, arrayList, bVar, fVar.f20465g, qVar.f21077a, executor);
        } else {
            if (this.f21032y0) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            q qVar2 = mVar.f21030w0 ? qVar : mVar.f21025r0;
            if (G1.a.o(mVar.f2903a, 8)) {
                gVar2 = this.f21028u0.f2906d;
            } else {
                int iOrdinal = gVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    gVar2 = g.f20469a;
                } else if (iOrdinal == 2) {
                    gVar2 = g.f20470b;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f2906d);
                    }
                    gVar2 = g.f20471c;
                }
            }
            g gVar3 = gVar2;
            m mVar2 = this.f21028u0;
            int i11 = mVar2.f2913p;
            int i12 = mVar2.f2912o;
            if (J1.o.i(i7, i10)) {
                m mVar3 = this.f21028u0;
                if (!J1.o.i(mVar3.f2913p, mVar3.f2912o)) {
                    i11 = aVar.f2913p;
                    i12 = aVar.f2912o;
                }
            }
            int i13 = i12;
            int i14 = i11;
            G1.f fVar2 = new G1.f(obj, bVar);
            Object obj3 = this.f21026s0;
            ArrayList arrayList2 = this.f21027t0;
            f fVar3 = this.f21024q0;
            G1.e eVar2 = new G1.e(this.f21021Z, fVar3, obj, obj3, this.f21023p0, aVar, i7, i10, gVar, target, cVar, arrayList2, fVar2, fVar3.f20465g, qVar.f21077a, executor);
            this.f21032y0 = true;
            m mVar4 = this.f21028u0;
            Request requestQ = mVar4.Q(obj, target, cVar, fVar2, qVar2, gVar3, i14, i13, mVar4, executor);
            this.f21032y0 = false;
            fVar2.f2960c = eVar2;
            fVar2.f2961d = requestQ;
            aVar2 = aVar;
            eVar = fVar2;
        }
        if (requestCoordinator2 == null) {
            return eVar;
        }
        m mVar5 = this.f21029v0;
        int i15 = mVar5.f2913p;
        int i16 = mVar5.f2912o;
        if (J1.o.i(i7, i10)) {
            m mVar6 = this.f21029v0;
            if (!J1.o.i(mVar6.f2913p, mVar6.f2912o)) {
                i15 = aVar2.f2913p;
                i16 = aVar2.f2912o;
            }
        }
        int i17 = i16;
        m mVar7 = this.f21029v0;
        G1.b bVar2 = requestCoordinator2;
        Request requestQ2 = mVar7.Q(obj, target, cVar, bVar2, mVar7.f21025r0, mVar7.f2906d, i15, i17, mVar7, executor);
        bVar2.f2918c = eVar;
        bVar2.f2919d = requestQ2;
        return bVar2;
    }

    @Override // G1.a
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public m clone() {
        m mVar = (m) super.clone();
        mVar.f21025r0 = mVar.f21025r0.clone();
        if (mVar.f21027t0 != null) {
            mVar.f21027t0 = new ArrayList(mVar.f21027t0);
        }
        m mVar2 = mVar.f21028u0;
        if (mVar2 != null) {
            mVar.f21028u0 = mVar2.clone();
        }
        m mVar3 = mVar.f21029v0;
        if (mVar3 != null) {
            mVar.f21029v0 = mVar3.clone();
        }
        return mVar;
    }

    public final void S(ImageView imageView) {
        G1.a aVarR;
        Target bVar;
        J1.o.a();
        J1.g.b(imageView);
        if (!G1.a.o(this.f2903a, 2048) && imageView.getScaleType() != null) {
            switch (l.f20504a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVarR = clone().r();
                    break;
                case 2:
                    aVarR = clone().s();
                    break;
                case 3:
                case 4:
                case 5:
                    aVarR = clone().t();
                    break;
                case 6:
                    aVarR = clone().s();
                    break;
                default:
                    aVarR = this;
                    break;
            }
        } else {
            aVarR = this;
        }
        this.f21024q0.f20461c.getClass();
        Class cls = this.f21023p0;
        if (Bitmap.class.equals(cls)) {
            bVar = new H1.b(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            bVar = new H1.b(imageView, 1);
        }
        T(bVar, null, aVarR, J1.g.f4461a);
    }

    public final void T(Target target, G1.c cVar, G1.a aVar, Executor executor) {
        J1.g.b(target);
        if (!this.f21031x0) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Request requestQ = Q(new Object(), target, cVar, null, this.f21025r0, aVar.f2906d, aVar.f2913p, aVar.f2912o, aVar, executor);
        Request request = target.getRequest();
        if (requestQ.isEquivalentTo(request) && (aVar.f2911j || !request.isComplete())) {
            J1.g.c(request, "Argument must not be null");
            if (request.isRunning()) {
                return;
            }
            request.begin();
            return;
        }
        this.f21022k0.e(target);
        target.setRequest(requestQ);
        p pVar = this.f21022k0;
        synchronized (pVar) {
            pVar.f21072f.f21063a.add(target);
            He.a aVar2 = pVar.f21070d;
            ((Set) aVar2.f3865c).add(requestQ);
            if (aVar2.f3864b) {
                requestQ.clear();
                ((HashSet) aVar2.f3866d).add(requestQ);
            } else {
                requestQ.begin();
            }
        }
    }

    public m U(RequestListener requestListener) {
        if (this.f2899M) {
            return clone().U(requestListener);
        }
        this.f21027t0 = null;
        return N(requestListener);
    }

    @Override // com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public m load(Bitmap bitmap) {
        return e0(bitmap).a(G1.d.N(com.bumptech.glide.load.engine.k.f20704c));
    }

    @Override // com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public m load(Drawable drawable) {
        return e0(drawable).a(G1.d.N(com.bumptech.glide.load.engine.k.f20704c));
    }

    @Override // com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public m load(Uri uri) {
        m mVarE0 = e0(uri);
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? mVarE0 : P(mVarE0);
    }

    @Override // com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public m load(File file) {
        return e0(file);
    }

    @Override // com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public m load(Integer num) {
        return P(e0(num));
    }

    @Override // com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public m load(Object obj) {
        return e0(obj);
    }

    @Override // com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public m load(String str) {
        return e0(str);
    }

    @Override // com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public m load(URL url) {
        return e0(url);
    }

    @Override // com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public m load(byte[] bArr) {
        m mVarE0 = e0(bArr);
        if (!G1.a.o(mVarE0.f2903a, 4)) {
            mVarE0 = mVarE0.a(G1.d.N(com.bumptech.glide.load.engine.k.f20704c));
        }
        return !G1.a.o(mVarE0.f2903a, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) ? mVarE0.a(G1.d.P()) : mVarE0;
    }

    public final m e0(Object obj) {
        if (this.f2899M) {
            return clone().e0(obj);
        }
        this.f21026s0 = obj;
        this.f21031x0 = true;
        B();
        return this;
    }

    @Override // G1.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (super.equals(mVar)) {
            return Objects.equals(this.f21023p0, mVar.f21023p0) && this.f21025r0.equals(mVar.f21025r0) && Objects.equals(this.f21026s0, mVar.f21026s0) && Objects.equals(this.f21027t0, mVar.f21027t0) && Objects.equals(this.f21028u0, mVar.f21028u0) && Objects.equals(this.f21029v0, mVar.f21029v0) && this.f21030w0 == mVar.f21030w0 && this.f21031x0 == mVar.f21031x0;
        }
        return false;
    }

    public final G1.c f0(int i7, int i10) {
        G1.c cVar = new G1.c(i7, i10);
        T(cVar, cVar, this, J1.g.f4462b);
        return cVar;
    }

    public m g0(C1.c cVar) {
        if (this.f2899M) {
            return clone().g0(cVar);
        }
        this.f21025r0 = cVar;
        this.f21030w0 = false;
        B();
        return this;
    }

    @Override // G1.a
    public final int hashCode() {
        return J1.o.g(this.f21031x0 ? 1 : 0, J1.o.g(this.f21030w0 ? 1 : 0, J1.o.h(J1.o.h(J1.o.h(J1.o.h(J1.o.h(J1.o.h(J1.o.h(super.hashCode(), this.f21023p0), this.f21025r0), this.f21026s0), this.f21027t0), this.f21028u0), this.f21029v0), null)));
    }
}
