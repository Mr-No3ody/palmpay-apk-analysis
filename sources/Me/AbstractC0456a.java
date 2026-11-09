package Me;

import C0.G;
import android.content.IntentFilter;
import android.media.MediaCodecInfo;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.I;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.video.internal.encoder.EncoderInfo;
import com.facebook.imagepipeline.memory.PoolBackend;
import com.nimbusds.jose.JWSProvider;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: renamed from: Me.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0456a implements JWSProvider, EncoderInfo, PoolBackend {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f5949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5950b;

    public AbstractC0456a(int i7) {
        switch (i7) {
            case 4:
                this.f5949a = new Bundle();
                this.f5950b = new M.f(0);
                break;
            case 5:
                this.f5949a = new HashSet();
                this.f5950b = new androidx.camera.video.internal.c(16);
                break;
            default:
                this.f5950b = C2131j.b(new La.i(6));
                break;
        }
    }

    public static View g(AbstractC0456a abstractC0456a, LinearLayout linearLayout, int i7, int i10) {
        Integer numValueOf = (i10 & 4) != 0 ? Integer.valueOf(p025ba.a.core_anim_fade_out) : null;
        boolean z3 = (i10 & 8) != 0;
        if (linearLayout == null) {
            return null;
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) abstractC0456a.f5949a;
        if (appCompatImageView == null) {
            linearLayout.addView(abstractC0456a.h(linearLayout, i7, null));
            return null;
        }
        ViewParent parent = appCompatImageView.getParent();
        if (parent == null || !(parent instanceof FrameLayout)) {
            parent = null;
        }
        Intrinsics.f(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) parent;
        if (z3) {
            if (numValueOf == null) {
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) abstractC0456a.f5949a;
                if (appCompatImageView2 != null) {
                    p220oa.h.c(appCompatImageView2);
                }
            } else {
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) abstractC0456a.f5949a;
                if (appCompatImageView3 != null) {
                    p220oa.h.A(appCompatImageView3, false, numValueOf.intValue());
                }
            }
        }
        View viewH = abstractC0456a.h(frameLayout, i7, new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(viewH);
        if (z3) {
            abstractC0456a.f5949a = null;
        }
        return viewH;
    }

    public void a() {
        X.c cVar = (X.c) this.f5949a;
        if (cVar != null) {
            try {
                ((I) this.f5950b).f12144p.unregisterReceiver(cVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f5949a = null;
        }
    }

    public abstract IntentFilter b();

    public abstract int c();

    public int d() {
        return ((Number) ((p355xf.t) this.f5950b).getValue()).intValue();
    }

    public AppCompatImageView e(LinearLayout linearLayout, int i7) {
        if (linearLayout == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(d(), f(), d(), 0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext());
        appCompatImageView.setImageResource(i7);
        appCompatImageView.setAdjustViewBounds(true);
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout.addView(appCompatImageView, new FrameLayout.LayoutParams(-1, -2));
        linearLayout.addView(frameLayout, layoutParams);
        return appCompatImageView;
    }

    public int f() {
        return CommonViewExtKt.getDp(12);
    }

    @Override // com.facebook.imagepipeline.memory.PoolBackend
    public Object get(int i7) {
        Object obj;
        androidx.camera.video.internal.c cVar = (androidx.camera.video.internal.c) this.f5950b;
        synchronized (cVar) {
            p137j3.i iVar = (p137j3.i) ((SparseArray) cVar.f14621b).get(i7);
            if (iVar == null) {
                obj = null;
            } else {
                Object objPollFirst = iVar.f38237c.pollFirst();
                if (((p137j3.i) cVar.f14623d) != iVar) {
                    cVar.s(iVar);
                    p137j3.i iVar2 = (p137j3.i) cVar.f14623d;
                    if (iVar2 == null) {
                        cVar.f14623d = iVar;
                        cVar.f14622c = iVar;
                    } else {
                        iVar.f38238d = iVar2;
                        iVar2.f38235a = iVar;
                        cVar.f14623d = iVar;
                    }
                }
                obj = objPollFirst;
            }
        }
        if (obj == null) {
            return obj;
        }
        synchronized (this) {
            ((HashSet) this.f5949a).remove(obj);
        }
        return obj;
    }

    @Override // com.nimbusds.jose.jca.JCAAware
    public S5.a getJCAContext() {
        return (S5.a) this.f5950b;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    public String getName() {
        return ((MediaCodecInfo) this.f5949a).getName();
    }

    public View h(ViewGroup viewGroup, int i7, FrameLayout.LayoutParams layoutParams) {
        if (viewGroup == null) {
            return null;
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i7, viewGroup, false);
        if (layoutParams != null) {
            viewInflate.setLayoutParams(layoutParams);
            return viewInflate;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(d(), f(), d(), 0);
        viewInflate.setLayoutParams(layoutParams2);
        return viewInflate;
    }

    public abstract void i();

    public void j() {
        a();
        IntentFilter intentFilterB = b();
        if (intentFilterB.countActions() == 0) {
            return;
        }
        if (((X.c) this.f5949a) == null) {
            this.f5949a = new X.c(this, 1);
        }
        ((I) this.f5950b).f12144p.registerReceiver((X.c) this.f5949a, intentFilterB);
    }

    public void k(View view, boolean z3) {
        ViewParent parent;
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.f5949a;
        if (appCompatImageView != null) {
            parent = appCompatImageView.getParent();
        } else {
            parent = view != null ? view.getParent() : null;
        }
        if (parent != null) {
            ViewParent viewParent = parent instanceof FrameLayout ? parent : null;
            if (viewParent != null) {
                p220oa.h.k((FrameLayout) viewParent, Integer.valueOf(z3 ? f() : 0), null, null, null, 14);
            }
        }
    }

    @Override // com.facebook.imagepipeline.memory.PoolBackend
    public Object pop() {
        Object obj;
        androidx.camera.video.internal.c cVar = (androidx.camera.video.internal.c) this.f5950b;
        synchronized (cVar) {
            p137j3.i iVar = (p137j3.i) cVar.f14622c;
            if (iVar == null) {
                obj = null;
            } else {
                Object objPollLast = iVar.f38237c.pollLast();
                if (iVar.f38237c.isEmpty()) {
                    cVar.s(iVar);
                    ((SparseArray) cVar.f14621b).remove(iVar.f38236b);
                }
                obj = objPollLast;
            }
        }
        if (obj == null) {
            return obj;
        }
        synchronized (this) {
            ((HashSet) this.f5949a).remove(obj);
        }
        return obj;
    }

    @Override // com.facebook.imagepipeline.memory.PoolBackend
    public void put(Object obj) {
        boolean zAdd;
        synchronized (this) {
            zAdd = ((HashSet) this.f5949a).add(obj);
        }
        if (zAdd) {
            androidx.camera.video.internal.c cVar = (androidx.camera.video.internal.c) this.f5950b;
            int size = ((p137j3.g) this).getSize(obj);
            synchronized (cVar) {
                try {
                    p137j3.i iVar = (p137j3.i) ((SparseArray) cVar.f14621b).get(size);
                    if (iVar == null) {
                        LinkedList linkedList = new LinkedList();
                        iVar = new p137j3.i();
                        iVar.f38235a = null;
                        iVar.f38236b = size;
                        iVar.f38237c = linkedList;
                        iVar.f38238d = null;
                        ((SparseArray) cVar.f14621b).put(size, iVar);
                    }
                    iVar.f38237c.addLast(obj);
                    if (((p137j3.i) cVar.f14623d) != iVar) {
                        cVar.s(iVar);
                        p137j3.i iVar2 = (p137j3.i) cVar.f14623d;
                        if (iVar2 == null) {
                            cVar.f14623d = iVar;
                            cVar.f14622c = iVar;
                        } else {
                            iVar.f38238d = iVar2;
                            iVar2.f38235a = iVar;
                            cVar.f14623d = iVar;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.nimbusds.jose.JWSProvider
    public Set supportedJWSAlgorithms() {
        return (Set) this.f5949a;
    }

    public AbstractC0456a(MediaCodecInfo mediaCodecInfo, String str) throws androidx.camera.video.internal.encoder.x {
        this.f5949a = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.f5950b = capabilitiesForType;
        } catch (RuntimeException e10) {
            throw new androidx.camera.video.internal.encoder.x(G.o("Unable to get CodecCapabilities for mime: ", str), e10);
        }
    }

    public AbstractC0456a(I i7) {
        this.f5950b = i7;
    }
}
