package p137j3;

import R5.a;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BitmapPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import com.facebook.imagepipeline.memory.PoolStatsTracker;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p039cb.c;
import p213o2.e;
import p262r2.g;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f38269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f38270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BitmapPool f38271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f38272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f38273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f38274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f38275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p f38276h;

    public w(v vVar) {
        this.f38269a = vVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    public final BitmapPool a() {
        byte b7;
        if (this.f38271c == null) {
            v vVar = this.f38269a;
            switch (vVar.f38260c) {
                case "legacy_default_params":
                    b7 = 3;
                    break;
                case "legacy":
                    b7 = 4;
                    break;
                case "experimental":
                    b7 = 2;
                    break;
                case "dummy_with_tracking":
                    b7 = 1;
                    break;
                case "dummy":
                    b7 = 0;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            if (b7 == 0) {
                this.f38271c = new n();
            } else if (b7 == 1) {
                a aVar = new a();
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newIdentityHashSet(...)");
                aVar.f7931a = setNewSetFromMap;
                this.f38271c = aVar;
            } else if (b7 != 2) {
                u uVar = (u) vVar.f38265h;
                p262r2.c cVar = (p262r2.c) vVar.f38268k;
                if (b7 != 3) {
                    this.f38271c = new j(cVar, (x) vVar.f38261d, uVar);
                } else {
                    this.f38271c = new j(cVar, l.a(), uVar);
                }
            } else {
                this.f38271c = new q(vVar.f38259b, u.a());
            }
        }
        return this.f38271c;
    }

    public final PooledByteBufferFactory b(int i7) {
        r rVar;
        if (this.f38274f == null) {
            v vVar = this.f38269a;
            u uVar = (u) vVar.f38266i;
            x xVar = (x) vVar.f38263f;
            p262r2.c cVar = (p262r2.c) vVar.f38268k;
            if (i7 == 0) {
                if (this.f38273e == null) {
                    try {
                        this.f38273e = (r) NativeMemoryChunkPool.class.getConstructor(MemoryTrimmableRegistry.class, x.class, PoolStatsTracker.class).newInstance(cVar, xVar, uVar);
                    } catch (ClassNotFoundException e10) {
                        p229p2.a.i("PoolFactory", "", e10);
                        this.f38273e = null;
                    } catch (IllegalAccessException e11) {
                        p229p2.a.i("PoolFactory", "", e11);
                        this.f38273e = null;
                    } catch (InstantiationException e12) {
                        p229p2.a.i("PoolFactory", "", e12);
                        this.f38273e = null;
                    } catch (NoSuchMethodException e13) {
                        p229p2.a.i("PoolFactory", "", e13);
                        this.f38273e = null;
                    } catch (InvocationTargetException e14) {
                        p229p2.a.i("PoolFactory", "", e14);
                        this.f38273e = null;
                    }
                }
                rVar = this.f38273e;
            } else if (i7 == 1) {
                if (this.f38272d == null) {
                    try {
                        this.f38272d = (r) BufferMemoryChunkPool.class.getConstructor(MemoryTrimmableRegistry.class, x.class, PoolStatsTracker.class).newInstance(cVar, xVar, uVar);
                    } catch (ClassNotFoundException unused) {
                        this.f38272d = null;
                    } catch (IllegalAccessException unused2) {
                        this.f38272d = null;
                    } catch (InstantiationException unused3) {
                        this.f38272d = null;
                    } catch (NoSuchMethodException unused4) {
                        this.f38272d = null;
                    } catch (InvocationTargetException unused5) {
                        this.f38272d = null;
                    }
                }
                rVar = this.f38272d;
            } else {
                if (i7 != 2) {
                    throw new IllegalArgumentException("Invalid MemoryChunkType");
                }
                if (this.f38270b == null) {
                    try {
                        this.f38270b = (r) AshmemMemoryChunkPool.class.getConstructor(MemoryTrimmableRegistry.class, x.class, PoolStatsTracker.class).newInstance(cVar, xVar, uVar);
                    } catch (ClassNotFoundException unused6) {
                        this.f38270b = null;
                    } catch (IllegalAccessException unused7) {
                        this.f38270b = null;
                    } catch (InstantiationException unused8) {
                        this.f38270b = null;
                    } catch (NoSuchMethodException unused9) {
                        this.f38270b = null;
                    } catch (InvocationTargetException unused10) {
                        this.f38270b = null;
                    }
                }
                rVar = this.f38270b;
            }
            e.e(rVar, "failed to get pool for chunk type: " + i7);
            this.f38274f = new c(rVar, c());
        }
        return this.f38274f;
    }

    public final g c() {
        if (this.f38275g == null) {
            if (this.f38276h == null) {
                v vVar = this.f38269a;
                this.f38276h = new p((p262r2.c) vVar.f38268k, (x) vVar.f38264g, (u) vVar.f38267j);
            }
            this.f38275g = new g(this.f38276h);
        }
        return this.f38275g;
    }
}
