package androidx.transition;

import Pa.C0505b;
import android.view.animation.AnimationUtils;
import androidx.core.util.Consumer;
import androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationEndListener;
import androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationUpdateListener;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class S extends U implements TransitionSeekController, DynamicAnimation$OnAnimationUpdateListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.dynamicanimation.animation.j f17983f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0505b f17985i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f17986j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Transition f17987o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17978a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f17979b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f17980c = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Consumer[] f17984g = null;

    public S(Transition transition) {
        this.f17987o = transition;
        C0505b c0505b = new C0505b((byte) 0, 4);
        long[] jArr = new long[20];
        c0505b.f7073c = jArr;
        c0505b.f7074d = new float[20];
        c0505b.f7072b = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f17985i = c0505b;
    }

    public final void a() {
        ArrayList arrayList = this.f17980c;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f17980c.size();
        if (this.f17984g == null) {
            this.f17984g = new Consumer[size];
        }
        Consumer[] consumerArr = (Consumer[]) this.f17980c.toArray(this.f17984g);
        this.f17984g = null;
        for (int i7 = 0; i7 < size; i7++) {
            consumerArr[i7].accept(this);
            consumerArr[i7] = null;
        }
        this.f17984g = consumerArr;
    }

    @Override // androidx.transition.TransitionSeekController
    public final void addOnProgressChangedListener(Consumer consumer) {
        if (this.f17980c == null) {
            this.f17980c = new ArrayList();
        }
        this.f17980c.add(consumer);
    }

    @Override // androidx.transition.TransitionSeekController
    public final void addOnReadyListener(Consumer consumer) {
        if (this.f17981d) {
            consumer.accept(this);
            return;
        }
        if (this.f17979b == null) {
            this.f17979b = new ArrayList();
        }
        this.f17979b.add(consumer);
    }

    @Override // androidx.transition.TransitionSeekController
    public final void animateToEnd() {
        b();
        this.f17983f.c(this.f17987o.getTotalDurationMillis() + 1);
    }

    @Override // androidx.transition.TransitionSeekController
    public final void animateToStart(Runnable runnable) {
        this.f17986j = runnable;
        b();
        this.f17983f.c(0.0f);
    }

    public final void b() {
        float fSqrt;
        if (this.f17983f != null) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f10 = this.f17978a;
        C0505b c0505b = this.f17985i;
        char c6 = 20;
        int i7 = (c0505b.f7072b + 1) % 20;
        c0505b.f7072b = i7;
        ((long[]) c0505b.f7073c)[i7] = jCurrentAnimationTimeMillis;
        ((float[]) c0505b.f7074d)[i7] = f10;
        androidx.dynamicanimation.animation.i iVar = new androidx.dynamicanimation.animation.i();
        float f11 = 0.0f;
        iVar.f16866a = 0.0f;
        androidx.dynamicanimation.animation.j jVar = new androidx.dynamicanimation.animation.j(iVar);
        jVar.f16867s = null;
        jVar.t = Float.MAX_VALUE;
        int i10 = 0;
        jVar.f16868u = false;
        this.f17983f = jVar;
        androidx.dynamicanimation.animation.k kVar = new androidx.dynamicanimation.animation.k();
        kVar.a(1.0f);
        kVar.b(200.0f);
        androidx.dynamicanimation.animation.j jVar2 = this.f17983f;
        jVar2.f16867s = kVar;
        jVar2.f16855b = this.f17978a;
        jVar2.f16856c = true;
        if (jVar2.f16859f) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList arrayList = jVar2.f16865l;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        androidx.dynamicanimation.animation.j jVar3 = this.f17983f;
        int i11 = c0505b.f7072b;
        long[] jArr = (long[]) c0505b.f7073c;
        long j6 = Long.MIN_VALUE;
        if (i11 != 0 || jArr[i11] != Long.MIN_VALUE) {
            long j10 = jArr[i11];
            long j11 = j10;
            while (true) {
                long j12 = jArr[i11];
                if (j12 == j6) {
                    break;
                }
                float f12 = j10 - j12;
                float fAbs = Math.abs(j12 - j11);
                if (f12 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                if (i11 == 0) {
                    i11 = 20;
                }
                i11--;
                i10++;
                if (i10 >= 20) {
                    break;
                }
                j11 = j12;
                j6 = Long.MIN_VALUE;
            }
            if (i10 >= 2) {
                float[] fArr = (float[]) c0505b.f7074d;
                if (i10 == 2) {
                    int i12 = c0505b.f7072b;
                    int i13 = i12 == 0 ? 19 : i12 - 1;
                    float f13 = jArr[i12] - jArr[i13];
                    if (f13 != 0.0f) {
                        fSqrt = (fArr[i12] - fArr[i13]) / f13;
                    }
                } else {
                    int i14 = c0505b.f7072b;
                    int i15 = ((i14 - i10) + 21) % 20;
                    int i16 = (i14 + 21) % 20;
                    long j13 = jArr[i15];
                    float f14 = fArr[i15];
                    int i17 = i15 + 1;
                    int i18 = i17 % 20;
                    float f15 = 0.0f;
                    while (i18 != i16) {
                        long j14 = jArr[i18];
                        float f16 = f11;
                        int i19 = i16;
                        float f17 = j14 - j13;
                        if (f17 != f16) {
                            float f18 = fArr[i18];
                            float f19 = (f18 - f14) / f17;
                            float fAbs2 = (Math.abs(f19) * (f19 - ((float) (Math.sqrt(2.0f * Math.abs(f15)) * ((double) Math.signum(f15)))))) + f15;
                            if (i18 == i17) {
                                fAbs2 *= 0.5f;
                            }
                            f15 = fAbs2;
                            f14 = f18;
                            j13 = j14;
                        }
                        i18 = (i18 + 1) % 20;
                        f11 = f16;
                        i16 = i19;
                        c6 = c6;
                        jArr = jArr;
                    }
                    fSqrt = (float) (Math.sqrt(Math.abs(f15) * 2.0f) * ((double) Math.signum(f15)));
                }
                f11 = fSqrt * 1000.0f;
            }
        }
        jVar3.f16854a = f11;
        this.f17983f.f16860g = this.f17987o.getTotalDurationMillis() + 1;
        androidx.dynamicanimation.animation.j jVar4 = this.f17983f;
        jVar4.f16861h = -1.0f;
        jVar4.f16863j = 4.0f;
        DynamicAnimation$OnAnimationEndListener dynamicAnimation$OnAnimationEndListener = new DynamicAnimation$OnAnimationEndListener() { // from class: androidx.transition.Q
            @Override // androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationEndListener
            public final void onAnimationEnd(androidx.dynamicanimation.animation.g gVar, boolean z3, float f20, float f21) {
                S s3 = this.f17977a;
                if (z3) {
                    s3.getClass();
                    return;
                }
                T t = Transition.TransitionNotification.f17999b;
                Transition transition = s3.f17987o;
                if (f20 >= 1.0f) {
                    transition.notifyListeners(t, false);
                    return;
                }
                long totalDurationMillis = transition.getTotalDurationMillis();
                Transition transitionG = ((TransitionSet) transition).g(0);
                Transition transition2 = transitionG.mCloneParent;
                transitionG.mCloneParent = null;
                transition.setCurrentPlayTimeMillis(-1L, s3.f17978a);
                transition.setCurrentPlayTimeMillis(totalDurationMillis, -1L);
                s3.f17978a = totalDurationMillis;
                Runnable runnable = s3.f17986j;
                if (runnable != null) {
                    runnable.run();
                }
                transition.mAnimators.clear();
                if (transition2 != null) {
                    transition2.notifyListeners(t, true);
                }
            }
        };
        ArrayList arrayList2 = jVar4.f16864k;
        if (arrayList2.contains(dynamicAnimation$OnAnimationEndListener)) {
            return;
        }
        arrayList2.add(dynamicAnimation$OnAnimationEndListener);
    }

    @Override // androidx.transition.TransitionSeekController
    public final float getCurrentFraction() {
        return getCurrentPlayTimeMillis() / this.f17987o.getTotalDurationMillis();
    }

    @Override // androidx.transition.TransitionSeekController
    public final long getCurrentPlayTimeMillis() {
        return Math.min(this.f17987o.getTotalDurationMillis(), Math.max(0L, this.f17978a));
    }

    @Override // androidx.transition.TransitionSeekController
    public final long getDurationMillis() {
        return this.f17987o.getTotalDurationMillis();
    }

    @Override // androidx.transition.TransitionSeekController
    public final boolean isReady() {
        return this.f17981d;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationUpdateListener
    public final void onAnimationUpdate(androidx.dynamicanimation.animation.g gVar, float f10, float f11) {
        Transition transition = this.f17987o;
        long jMax = Math.max(-1L, Math.min(transition.getTotalDurationMillis() + 1, Math.round(f10)));
        transition.setCurrentPlayTimeMillis(jMax, this.f17978a);
        this.f17978a = jMax;
        a();
    }

    @Override // androidx.transition.U, androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        this.f17982e = true;
    }

    @Override // androidx.transition.TransitionSeekController
    public final void removeOnProgressChangedListener(Consumer consumer) {
        ArrayList arrayList = this.f17980c;
        if (arrayList != null) {
            arrayList.remove(consumer);
        }
    }

    @Override // androidx.transition.TransitionSeekController
    public final void removeOnReadyListener(Consumer consumer) {
        ArrayList arrayList = this.f17979b;
        if (arrayList != null) {
            arrayList.remove(consumer);
            if (this.f17979b.isEmpty()) {
                this.f17979b = null;
            }
        }
    }

    @Override // androidx.transition.TransitionSeekController
    public final void setCurrentFraction(float f10) {
        if (this.f17983f != null) {
            throw new IllegalStateException("setCurrentFraction() called after animation has been started");
        }
        setCurrentPlayTimeMillis((long) (f10 * this.f17987o.getTotalDurationMillis()));
    }

    @Override // androidx.transition.TransitionSeekController
    public final void setCurrentPlayTimeMillis(long j6) {
        if (this.f17983f != null) {
            throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
        }
        long j10 = this.f17978a;
        if (j6 == j10 || !this.f17981d) {
            return;
        }
        if (!this.f17982e) {
            Transition transition = this.f17987o;
            if (j6 != 0 || j10 <= 0) {
                long totalDurationMillis = transition.getTotalDurationMillis();
                if (j6 == totalDurationMillis && this.f17978a < totalDurationMillis) {
                    j6 = 1 + totalDurationMillis;
                }
            } else {
                j6 = -1;
            }
            long j11 = this.f17978a;
            if (j6 != j11) {
                transition.setCurrentPlayTimeMillis(j6, j11);
                this.f17978a = j6;
            }
        }
        a();
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C0505b c0505b = this.f17985i;
        int i7 = (c0505b.f7072b + 1) % 20;
        c0505b.f7072b = i7;
        ((long[]) c0505b.f7073c)[i7] = jCurrentAnimationTimeMillis;
        ((float[]) c0505b.f7074d)[i7] = j6;
    }
}
