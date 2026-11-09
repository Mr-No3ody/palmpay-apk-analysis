package androidx.camera.view.impl;

import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.palmpay.lib.ui.picker.wheel.view.WheelView;
import com.rnmaps.maps.MapView;
import com.transsnet.palmpay.account.ui.view.KeyboardView;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14960b;

    public /* synthetic */ e(Object obj, int i7) {
        this.f14959a = i7;
        this.f14960b = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent e10) {
        switch (this.f14959a) {
            case 0:
                Intrinsics.checkNotNullParameter(e10, "e");
                float x3 = e10.getX();
                f fVar = (f) this.f14960b;
                fVar.f14969i = x3;
                fVar.f14970j = e10.getY();
                fVar.f14971k = 1;
                return true;
            case 3:
                MapView mapView = (MapView) this.f14960b;
                if (mapView.f24870a == null) {
                    return false;
                }
                WritableNativeMap writableNativeMapP = mapView.p(mapView.f24870a.getProjection().fromScreenLocation(new Point((int) e10.getX(), (int) e10.getY())));
                int id2 = mapView.getId();
                ThemedReactContext themedReactContext = mapView.f24864S0;
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id2);
                if (eventDispatcherForReactTag == null) {
                    return false;
                }
                eventDispatcherForReactTag.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), id2, writableNativeMapP, 3));
                return false;
            default:
                return super.onDoubleTap(e10);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z3;
        switch (this.f14959a) {
            case 1:
                WheelView wheelView = (WheelView) this.f14960b;
                wheelView.a();
                wheelView.f24579i = wheelView.f24578g.scheduleWithFixedDelay(new p035c7.a(wheelView, f11), 0L, 5L, TimeUnit.MILLISECONDS);
                return true;
            case 2:
                com.github.chrisbanes.photoview.e eVar = (com.github.chrisbanes.photoview.e) this.f14960b;
                if (eVar.f22346Y == null || eVar.e() > 1.0f || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1) {
                    return false;
                }
                return eVar.f22346Y.onFling(motionEvent, motionEvent2, f10, f11);
            case 3:
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
            case 4:
                KeyboardView keyboardView = (KeyboardView) this.f14960b;
                if (!keyboardView.f26358S0) {
                    float fAbs = Math.abs(f10);
                    float fAbs2 = Math.abs(f11);
                    float x3 = motionEvent2.getX() - motionEvent.getX();
                    float y8 = motionEvent2.getY() - motionEvent.getY();
                    int width = keyboardView.getWidth() / 2;
                    int height = keyboardView.getHeight() / 2;
                    p066e9.e eVar2 = keyboardView.T0;
                    float[] fArr = eVar2.f36236a;
                    float f12 = fArr[0];
                    float[] fArr2 = eVar2.f36237b;
                    float f13 = fArr2[0];
                    z3 = false;
                    long[] jArr = eVar2.f36238c;
                    long j6 = jArr[0];
                    int i7 = 0;
                    while (i7 < 4 && jArr[i7] != 0) {
                        i7++;
                    }
                    float f14 = 0.0f;
                    float f15 = 0.0f;
                    int i10 = 1;
                    while (i10 < i7) {
                        int i11 = i7;
                        int i12 = i10;
                        int i13 = (int) (jArr[i10] - j6);
                        if (i13 != 0) {
                            float f16 = i13;
                            float f17 = (fArr[i12] - f12) / f16;
                            float f18 = 1000;
                            float f19 = f17 * f18;
                            f14 = f14 == 0.0f ? f19 : (f14 + f19) * 0.5f;
                            float f20 = ((fArr2[i12] - f13) / f16) * f18;
                            f15 = f15 == 0.0f ? f20 : (f15 + f20) * 0.5f;
                        }
                        i10 = i12 + 1;
                        i7 = i11;
                    }
                    eVar2.f36239d = f14 < 0.0f ? Math.max(f14, -3.4028235E38f) : Math.min(f14, Float.MAX_VALUE);
                    if (f15 < 0.0f) {
                        Math.max(f15, -3.4028235E38f);
                    } else {
                        Math.min(f15, Float.MAX_VALUE);
                    }
                    float f21 = keyboardView.T0.f36239d;
                    int i14 = keyboardView.f26359U0;
                    float f22 = i14;
                    if (f10 <= f22 || fAbs2 >= fAbs || x3 <= width) {
                        float f23 = -i14;
                        if (f10 < f23 && fAbs2 < fAbs && x3 < (-width)) {
                            keyboardView.f26385q0.swipeLeft();
                        } else if (f11 < f23 && fAbs < fAbs2 && y8 < (-height)) {
                            keyboardView.f26385q0.swipeUp();
                        } else if (f11 > f22 && fAbs < fAbs2 / 2.0f && y8 > height) {
                            keyboardView.f26385q0.swipeDown();
                        }
                    } else {
                        keyboardView.f26385q0.swipeRight();
                    }
                    return true;
                }
                z3 = false;
                return z3;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        switch (this.f14959a) {
            case 2:
                com.github.chrisbanes.photoview.e eVar = (com.github.chrisbanes.photoview.e) this.f14960b;
                View.OnLongClickListener onLongClickListener = eVar.f22344Q;
                if (onLongClickListener != null) {
                    onLongClickListener.onLongClick(eVar.f22355i);
                }
                break;
            default:
                super.onLongPress(motionEvent);
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        switch (this.f14959a) {
            case 3:
                MapView mapView = (MapView) this.f14960b;
                if (!mapView.f24901t0) {
                    return false;
                }
                WritableNativeMap writableNativeMapP = mapView.p(mapView.f24870a.getProjection().fromScreenLocation(new Point((int) motionEvent2.getX(), (int) motionEvent2.getY())));
                int id2 = mapView.getId();
                ThemedReactContext themedReactContext = mapView.f24864S0;
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id2);
                if (eventDispatcherForReactTag == null) {
                    return false;
                }
                eventDispatcherForReactTag.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), id2, writableNativeMapP, 19));
                return false;
            default:
                return super.onScroll(motionEvent, motionEvent2, f10, f11);
        }
    }

    public e(WheelView wheelView) {
        this.f14959a = 1;
        this.f14960b = wheelView;
    }
}
