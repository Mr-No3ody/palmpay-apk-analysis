package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.camera2.internal.P0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C1314f f19574w = new C1314f(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1318j f19575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1318j f19576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LottieListener f19577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f19579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f19580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19581g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19582i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f19583j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f19584o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashSet f19585p;
    public final HashSet t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public D f19586v;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1316h();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f19587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f19589c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f19590d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f19591e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f19592f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f19593g;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeString(this.f19587a);
            parcel.writeFloat(this.f19589c);
            parcel.writeInt(this.f19590d ? 1 : 0);
            parcel.writeString(this.f19591e);
            parcel.writeInt(this.f19592f);
            parcel.writeInt(this.f19593g);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f19575a = new C1318j(this, 1);
        this.f19576b = new C1318j(this, 0);
        this.f19578d = 0;
        this.f19579e = new y();
        this.f19582i = false;
        this.f19583j = false;
        this.f19584o = true;
        this.f19585p = new HashSet();
        this.t = new HashSet();
        d(null, F.lottieAnimationViewStyle);
    }

    private void setCompositionTask(D d2) {
        B b7 = d2.f19563d;
        y yVar = this.f19579e;
        if (b7 != null && yVar == getDrawable() && yVar.f20304a == b7.f19556a) {
            return;
        }
        this.f19585p.add(EnumC1317i.f19865a);
        this.f19579e.d();
        b();
        d2.b(this.f19575a);
        d2.a(this.f19576b);
        this.f19586v = d2;
    }

    public final void a() {
        this.f19583j = false;
        this.f19585p.add(EnumC1317i.f19870f);
        y yVar = this.f19579e;
        yVar.f20309f.clear();
        yVar.f20305b.cancel();
        if (yVar.isVisible()) {
            return;
        }
        yVar.f20297K0 = 1;
    }

    public final void b() {
        D d2 = this.f19586v;
        if (d2 != null) {
            C1318j c1318j = this.f19575a;
            synchronized (d2) {
                d2.f19560a.remove(c1318j);
            }
            D d10 = this.f19586v;
            C1318j c1318j2 = this.f19576b;
            synchronized (d10) {
                d10.f19561b.remove(c1318j2);
            }
        }
    }

    public final void c(boolean z3) {
        z zVar = z.f20329a;
        y yVar = this.f19579e;
        HashSet hashSet = (HashSet) yVar.f20283A.f35518b;
        boolean zAdd = z3 ? hashSet.add(zVar) : hashSet.remove(zVar);
        if (yVar.f20304a == null || !zAdd) {
            return;
        }
        yVar.c();
    }

    public final void d(AttributeSet attributeSet, int i7) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, G.LottieAnimationView, i7, 0);
        this.f19584o = typedArrayObtainStyledAttributes.getBoolean(G.LottieAnimationView_lottie_cacheComposition, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(G.LottieAnimationView_lottie_rawRes);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(G.LottieAnimationView_lottie_fileName);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(G.LottieAnimationView_lottie_url);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(G.LottieAnimationView_lottie_rawRes, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(G.LottieAnimationView_lottie_fileName);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(G.LottieAnimationView_lottie_url)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(G.LottieAnimationView_lottie_fallbackRes, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(G.LottieAnimationView_lottie_autoPlay, false)) {
            this.f19583j = true;
        }
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(G.LottieAnimationView_lottie_loop, false);
        y yVar = this.f19579e;
        if (z3) {
            yVar.f20305b.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(G.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(G.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(G.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(G.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(G.LottieAnimationView_lottie_speed)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(G.LottieAnimationView_lottie_speed, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(G.LottieAnimationView_lottie_clipToCompositionBounds)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(G.LottieAnimationView_lottie_clipToCompositionBounds, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(G.LottieAnimationView_lottie_clipTextToBoundingBox)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(G.LottieAnimationView_lottie_clipTextToBoundingBox, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(G.LottieAnimationView_lottie_defaultFontFileExtension)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(G.LottieAnimationView_lottie_defaultFontFileExtension));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(G.LottieAnimationView_lottie_imageAssetsFolder));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(G.LottieAnimationView_lottie_progress);
        float f10 = typedArrayObtainStyledAttributes.getFloat(G.LottieAnimationView_lottie_progress, 0.0f);
        if (zHasValue4) {
            this.f19585p.add(EnumC1317i.f19866b);
        }
        yVar.w(f10);
        c(typedArrayObtainStyledAttributes.getBoolean(G.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(G.LottieAnimationView_lottie_applyOpacityToLayers, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(G.LottieAnimationView_lottie_applyShadowToLayers, true));
        if (typedArrayObtainStyledAttributes.hasValue(G.LottieAnimationView_lottie_colorFilter)) {
            yVar.a(new p212o1.e("**"), LottieProperty.f19602I, new p243q1.c(new I(androidx.core.content.d.c(typedArrayObtainStyledAttributes.getResourceId(G.LottieAnimationView_lottie_colorFilter, -1), getContext()).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(G.LottieAnimationView_lottie_renderMode)) {
            int i10 = typedArrayObtainStyledAttributes.getInt(G.LottieAnimationView_lottie_renderMode, 0);
            if (i10 >= H.values().length) {
                i10 = 0;
            }
            setRenderMode(H.values()[i10]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(G.LottieAnimationView_lottie_asyncUpdates)) {
            int i11 = typedArrayObtainStyledAttributes.getInt(G.LottieAnimationView_lottie_asyncUpdates, 0);
            if (i11 >= H.values().length) {
                i11 = 0;
            }
            setAsyncUpdates(EnumC1309a.values()[i11]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(G.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        if (typedArrayObtainStyledAttributes.hasValue(G.LottieAnimationView_lottie_useCompositionFrameRate)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(G.LottieAnimationView_lottie_useCompositionFrameRate, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void e() {
        this.f19585p.add(EnumC1317i.f19870f);
        this.f19579e.m();
    }

    public final void f(InputStream inputStream, String str) {
        setCompositionTask(p.a(str, new CallableC1313e(inputStream, str, 1), new m(inputStream, 0)));
    }

    public final void g(ZipInputStream zipInputStream, String str) {
        setCompositionTask(p.a(str, new CallableC1313e(zipInputStream, str, 2), new m(zipInputStream, 1)));
    }

    public EnumC1309a getAsyncUpdates() {
        EnumC1309a enumC1309a = this.f19579e.f20290E0;
        return enumC1309a != null ? enumC1309a : EnumC1309a.f19633a;
    }

    public boolean getAsyncUpdatesEnabled() {
        EnumC1309a enumC1309a = this.f19579e.f20290E0;
        if (enumC1309a == null) {
            enumC1309a = EnumC1309a.f19633a;
        }
        return enumC1309a == EnumC1309a.f19634b;
    }

    public boolean getClipTextToBoundingBox() {
        return this.f19579e.f20303Z;
    }

    public boolean getClipToCompositionBounds() {
        return this.f19579e.f20287C;
    }

    @Nullable
    public k getComposition() {
        Drawable drawable = getDrawable();
        y yVar = this.f19579e;
        if (drawable == yVar) {
            return yVar.f20304a;
        }
        return null;
    }

    public long getDuration() {
        k composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f19579e.f20305b.f20234i;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f19579e.f20311i;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f19579e.f20285B;
    }

    public float getMaxFrame() {
        return this.f19579e.f20305b.b();
    }

    public float getMinFrame() {
        return this.f19579e.f20305b.c();
    }

    @Nullable
    public E getPerformanceTracker() {
        k kVar = this.f19579e.f20304a;
        if (kVar != null) {
            return kVar.f19874a;
        }
        return null;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f19579e.f20305b.a();
    }

    public H getRenderMode() {
        return this.f19579e.f20316p0 ? H.f19569c : H.f19568b;
    }

    public int getRepeatCount() {
        return this.f19579e.f20305b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f19579e.f20305b.getRepeatMode();
    }

    public float getSpeed() {
        return this.f19579e.f20305b.f20230d;
    }

    public final void h(String str, String str2) {
        setCompositionTask(p.a(str2, new l(getContext(), 0, str, str2), null));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof y) {
            boolean z3 = ((y) drawable).f20316p0;
            H h7 = H.f19569c;
            if ((z3 ? h7 : H.f19568b) == h7) {
                this.f19579e.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        y yVar = this.f19579e;
        if (drawable2 == yVar) {
            super.invalidateDrawable(yVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f19583j) {
            return;
        }
        this.f19579e.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i7;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f19580f = savedState.f19587a;
        EnumC1317i enumC1317i = EnumC1317i.f19865a;
        HashSet hashSet = this.f19585p;
        if (!hashSet.contains(enumC1317i) && !TextUtils.isEmpty(this.f19580f)) {
            setAnimation(this.f19580f);
        }
        this.f19581g = savedState.f19588b;
        if (!hashSet.contains(enumC1317i) && (i7 = this.f19581g) != 0) {
            setAnimation(i7);
        }
        if (!hashSet.contains(EnumC1317i.f19866b)) {
            this.f19579e.w(savedState.f19589c);
        }
        if (!hashSet.contains(EnumC1317i.f19870f) && savedState.f19590d) {
            e();
        }
        if (!hashSet.contains(EnumC1317i.f19869e)) {
            setImageAssetsFolder(savedState.f19591e);
        }
        if (!hashSet.contains(EnumC1317i.f19867c)) {
            setRepeatMode(savedState.f19592f);
        }
        if (hashSet.contains(EnumC1317i.f19868d)) {
            return;
        }
        setRepeatCount(savedState.f19593g);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z3;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f19587a = this.f19580f;
        savedState.f19588b = this.f19581g;
        y yVar = this.f19579e;
        savedState.f19589c = yVar.f20305b.a();
        boolean zIsVisible = yVar.isVisible();
        com.airbnb.lottie.utils.e eVar = yVar.f20305b;
        if (zIsVisible) {
            z3 = eVar.f20238v;
        } else {
            int i7 = yVar.f20297K0;
            z3 = i7 == 2 || i7 == 3;
        }
        savedState.f19590d = z3;
        savedState.f19591e = yVar.f20311i;
        savedState.f19592f = eVar.getRepeatMode();
        savedState.f19593g = eVar.getRepeatCount();
        return savedState;
    }

    public void setAnimation(@RawRes final int i7) {
        D dF;
        this.f19581g = i7;
        this.f19580f = null;
        if (isInEditMode()) {
            dF = new D(new Callable() { // from class: com.airbnb.lottie.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this.f19863a;
                    boolean z3 = lottieAnimationView.f19584o;
                    int i10 = i7;
                    if (!z3) {
                        return p.g(lottieAnimationView.getContext(), i10, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    return p.g(context, i10, p.m(i10, context));
                }
            }, true);
        } else if (this.f19584o) {
            Context context = getContext();
            dF = p.f(context, i7, p.m(i7, context));
        } else {
            dF = p.f(getContext(), i7, null);
        }
        setCompositionTask(dF);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        f(new ByteArrayInputStream(str.getBytes()), null);
    }

    public void setAnimationFromUrl(String str) {
        D dA;
        if (this.f19584o) {
            dA = p.h(getContext(), str);
        } else {
            dA = p.a(null, new l(getContext(), 0, str, null), null);
        }
        setCompositionTask(dA);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z3) {
        this.f19579e.f20301X = z3;
    }

    public void setApplyingShadowToLayersEnabled(boolean z3) {
        this.f19579e.f20302Y = z3;
    }

    public void setAsyncUpdates(EnumC1309a enumC1309a) {
        this.f19579e.f20290E0 = enumC1309a;
    }

    public void setCacheComposition(boolean z3) {
        this.f19584o = z3;
    }

    public void setClipTextToBoundingBox(boolean z3) {
        y yVar = this.f19579e;
        if (z3 != yVar.f20303Z) {
            yVar.f20303Z = z3;
            yVar.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z3) {
        y yVar = this.f19579e;
        if (z3 != yVar.f20287C) {
            yVar.f20287C = z3;
            com.airbnb.lottie.model.layer.b bVar = yVar.f20293H;
            if (bVar != null) {
                bVar.f20039L = z3;
            }
            yVar.invalidateSelf();
        }
    }

    public void setComposition(@NonNull k kVar) {
        y yVar = this.f19579e;
        yVar.setCallback(this);
        boolean z3 = true;
        this.f19582i = true;
        if (yVar.f20304a == kVar) {
            z3 = false;
        } else {
            yVar.f20289D0 = true;
            yVar.d();
            yVar.f20304a = kVar;
            yVar.c();
            com.airbnb.lottie.utils.e eVar = yVar.f20305b;
            boolean z8 = eVar.t == null;
            eVar.t = kVar;
            if (z8) {
                eVar.i(Math.max(eVar.f20236o, kVar.f19885l), Math.min(eVar.f20237p, kVar.f19886m));
            } else {
                eVar.i((int) kVar.f19885l, (int) kVar.f19886m);
            }
            float f10 = eVar.f20234i;
            eVar.f20234i = 0.0f;
            eVar.f20233g = 0.0f;
            eVar.h((int) f10);
            eVar.f();
            yVar.w(eVar.getAnimatedFraction());
            ArrayList arrayList = yVar.f20309f;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                LottieDrawable$LazyCompositionTask lottieDrawable$LazyCompositionTask = (LottieDrawable$LazyCompositionTask) it.next();
                if (lottieDrawable$LazyCompositionTask != null) {
                    lottieDrawable$LazyCompositionTask.run(kVar);
                }
                it.remove();
            }
            arrayList.clear();
            kVar.f19874a.f19564a = yVar.f20299M;
            yVar.e();
            Drawable.Callback callback = yVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(yVar);
            }
        }
        if (this.f19583j) {
            yVar.m();
        }
        this.f19582i = false;
        if (getDrawable() != yVar || z3) {
            if (!z3) {
                boolean zJ = yVar.j();
                setImageDrawable(null);
                setImageDrawable(yVar);
                if (zJ) {
                    yVar.o();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.t.iterator();
            while (it2.hasNext()) {
                ((LottieOnCompositionLoadedListener) it2.next()).onCompositionLoaded(kVar);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        y yVar = this.f19579e;
        yVar.t = str;
        P0 p0I = yVar.i();
        if (p0I != null) {
            p0I.f13251f = str;
        }
    }

    public void setFailureListener(@Nullable LottieListener<Throwable> lottieListener) {
        this.f19577c = lottieListener;
    }

    public void setFallbackResource(@DrawableRes int i7) {
        this.f19578d = i7;
    }

    public void setFontAssetDelegate(AbstractC1310b abstractC1310b) {
        y yVar = this.f19579e;
        yVar.f20322v = abstractC1310b;
        P0 p3 = yVar.f20314o;
        if (p3 != null) {
            p3.f13250e = abstractC1310b;
        }
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        y yVar = this.f19579e;
        if (map == yVar.f20315p) {
            return;
        }
        yVar.f20315p = map;
        yVar.invalidateSelf();
    }

    public void setFrame(int i7) {
        this.f19579e.p(i7);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z3) {
        this.f19579e.f20307d = z3;
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        y yVar = this.f19579e;
        yVar.f20312j = imageAssetDelegate;
        com.airbnb.lottie.manager.a aVar = yVar.f20310g;
        if (aVar != null) {
            aVar.f19899c = imageAssetDelegate;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.f19579e.f20311i = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f19581g = 0;
        this.f19580f = null;
        b();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f19581g = 0;
        this.f19580f = null;
        b();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i7) {
        this.f19581g = 0;
        this.f19580f = null;
        b();
        super.setImageResource(i7);
    }

    public void setMaintainOriginalImageBounds(boolean z3) {
        this.f19579e.f20285B = z3;
    }

    public void setMaxFrame(int i7) {
        this.f19579e.q(i7);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        y yVar = this.f19579e;
        k kVar = yVar.f20304a;
        if (kVar == null) {
            yVar.f20309f.add(new t(yVar, f10, 0));
            return;
        }
        float f11 = com.airbnb.lottie.utils.g.f(kVar.f19885l, kVar.f19886m, f10);
        com.airbnb.lottie.utils.e eVar = yVar.f20305b;
        eVar.i(eVar.f20236o, f11);
    }

    public void setMinAndMaxFrame(String str) {
        this.f19579e.t(str);
    }

    public void setMinFrame(int i7) {
        this.f19579e.u(i7);
    }

    public void setMinProgress(float f10) {
        y yVar = this.f19579e;
        k kVar = yVar.f20304a;
        if (kVar == null) {
            yVar.f20309f.add(new t(yVar, f10, 1));
        } else {
            yVar.u((int) com.airbnb.lottie.utils.g.f(kVar.f19885l, kVar.f19886m, f10));
        }
    }

    public void setOutlineMasksAndMattes(boolean z3) {
        y yVar = this.f19579e;
        if (yVar.f20300Q == z3) {
            return;
        }
        yVar.f20300Q = z3;
        com.airbnb.lottie.model.layer.b bVar = yVar.f20293H;
        if (bVar != null) {
            bVar.j(z3);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z3) {
        y yVar = this.f19579e;
        yVar.f20299M = z3;
        k kVar = yVar.f20304a;
        if (kVar != null) {
            kVar.f19874a.f19564a = z3;
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        this.f19585p.add(EnumC1317i.f19866b);
        this.f19579e.w(f10);
    }

    public void setRenderMode(H h7) {
        y yVar = this.f19579e;
        yVar.f20313k0 = h7;
        yVar.e();
    }

    public void setRepeatCount(int i7) {
        this.f19585p.add(EnumC1317i.f19868d);
        this.f19579e.f20305b.setRepeatCount(i7);
    }

    public void setRepeatMode(int i7) {
        this.f19585p.add(EnumC1317i.f19867c);
        this.f19579e.f20305b.setRepeatMode(i7);
    }

    public void setSafeMode(boolean z3) {
        this.f19579e.f20308e = z3;
    }

    public void setSpeed(float f10) {
        this.f19579e.f20305b.f20230d = f10;
    }

    public void setTextDelegate(J j6) {
        this.f19579e.f20324w = j6;
    }

    public void setUseCompositionFrameRate(boolean z3) {
        this.f19579e.f20305b.f20239w = z3;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        y yVar;
        if (!this.f19582i && drawable == (yVar = this.f19579e) && yVar.j()) {
            this.f19583j = false;
            yVar.l();
        } else if (!this.f19582i && (drawable instanceof y)) {
            y yVar2 = (y) drawable;
            if (yVar2.j()) {
                yVar2.l();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f19579e.r(str);
    }

    public void setMinFrame(String str) {
        this.f19579e.v(str);
    }

    public void setAnimation(String str) {
        D dA;
        int i7 = 1;
        this.f19580f = str;
        int i10 = 0;
        this.f19581g = 0;
        if (isInEditMode()) {
            dA = new D(new CallableC1313e(this, str, i10), true);
        } else {
            String str2 = null;
            if (this.f19584o) {
                Context context = getContext();
                HashMap map = p.f20122a;
                String strO = C0.G.o("asset_", str);
                dA = p.a(strO, new l(context.getApplicationContext(), i7, str, strO), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = p.f20122a;
                dA = p.a(null, new l(context2.getApplicationContext(), i7, str, str2), null);
            }
        }
        setCompositionTask(dA);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19575a = new C1318j(this, 1);
        this.f19576b = new C1318j(this, 0);
        this.f19578d = 0;
        this.f19579e = new y();
        this.f19582i = false;
        this.f19583j = false;
        this.f19584o = true;
        this.f19585p = new HashSet();
        this.t = new HashSet();
        d(attributeSet, F.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f19575a = new C1318j(this, 1);
        this.f19576b = new C1318j(this, 0);
        this.f19578d = 0;
        this.f19579e = new y();
        this.f19582i = false;
        this.f19583j = false;
        this.f19584o = true;
        this.f19585p = new HashSet();
        this.t = new HashSet();
        d(attributeSet, i7);
    }
}
