package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1055g implements DifferentialMotionFlingController$FlingVelocityThresholdCalculator, DifferentialMotionFlingController$DifferentialVelocityProvider {
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    @Override // androidx.core.view.DifferentialMotionFlingController$FlingVelocityThresholdCalculator
    public void calculateFlingVelocityThresholds(Context context, int[] iArr, MotionEvent motionEvent, int i7) {
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int deviceId = motionEvent.getDeviceId();
        int source = motionEvent.getSource();
        int i10 = Build.VERSION.SDK_INT;
        boolean z3 = false;
        if (i10 >= 34) {
            Method method = O.f16174a;
            scaledMinimumFlingVelocity = androidx.camera.core.imagecapture.i.i(viewConfiguration, deviceId, i7, source);
        } else {
            Method method2 = O.f16174a;
            InputDevice device = InputDevice.getDevice(deviceId);
            if ((device == null || device.getMotionRange(i7, source) == null) ? false : true) {
                Resources resources = context.getResources();
                int identifier = (source == 4194304 && i7 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                Objects.requireNonNull(viewConfiguration);
                if (identifier == -1) {
                    scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                }
            } else {
                scaledMinimumFlingVelocity = Integer.MAX_VALUE;
            }
        }
        iArr[0] = scaledMinimumFlingVelocity;
        int deviceId2 = motionEvent.getDeviceId();
        int source2 = motionEvent.getSource();
        if (i10 >= 34) {
            scaledMaximumFlingVelocity = androidx.camera.core.imagecapture.i.h(viewConfiguration, deviceId2, i7, source2);
        } else {
            InputDevice device2 = InputDevice.getDevice(deviceId2);
            if (device2 != null && device2.getMotionRange(i7, source2) != null) {
                z3 = true;
            }
            if (z3) {
                Resources resources2 = context.getResources();
                int identifier2 = (source2 == 4194304 && i7 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                Objects.requireNonNull(viewConfiguration);
                if (identifier2 == -1) {
                    scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                }
            } else {
                scaledMaximumFlingVelocity = Integer.MIN_VALUE;
            }
        }
        iArr[1] = scaledMaximumFlingVelocity;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    @Override // androidx.core.view.DifferentialMotionFlingController$DifferentialVelocityProvider
    public float getCurrentVelocity(VelocityTracker velocityTracker, MotionEvent motionEvent, int i7) {
        float f10;
        long j6;
        float fSqrt;
        float f11;
        int i10;
        Map map = AbstractC1071x.f16299a;
        velocityTracker.addMovement(motionEvent);
        float f12 = 0.0f;
        int i11 = 0;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC1071x.f16299a;
            if (!map2.containsKey(velocityTracker)) {
                map2.put(velocityTracker, new C1072y());
            }
            C1072y c1072y = (C1072y) map2.get(velocityTracker);
            c1072y.getClass();
            long eventTime = motionEvent.getEventTime();
            int i12 = c1072y.f16303d;
            long[] jArr = c1072y.f16301b;
            if (i12 != 0 && eventTime - jArr[c1072y.f16304e] > 40) {
                c1072y.f16303d = 0;
                c1072y.f16302c = 0.0f;
            }
            int i13 = (c1072y.f16304e + 1) % 20;
            c1072y.f16304e = i13;
            int i14 = c1072y.f16303d;
            if (i14 != 20) {
                c1072y.f16303d = i14 + 1;
            }
            c1072y.f16300a[i13] = motionEvent.getAxisValue(26);
            jArr[c1072y.f16304e] = eventTime;
        }
        velocityTracker.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C1072y c1072y2 = (C1072y) AbstractC1071x.f16299a.get(velocityTracker);
        if (c1072y2 != null) {
            int i15 = c1072y2.f16303d;
            if (i15 < 2) {
                fSqrt = 0.0f;
                f10 = 0.0f;
            } else {
                int i16 = c1072y2.f16304e;
                int i17 = ((i16 + 20) - (i15 - 1)) % 20;
                long[] jArr2 = c1072y2.f16301b;
                long j10 = jArr2[i16];
                while (true) {
                    j6 = jArr2[i17];
                    if (j10 - j6 <= 100) {
                        break;
                    }
                    c1072y2.f16303d--;
                    i17 = (i17 + 1) % 20;
                }
                int i18 = c1072y2.f16303d;
                if (i18 < 2) {
                    fSqrt = 0.0f;
                    f10 = 0.0f;
                } else {
                    float[] fArr = c1072y2.f16300a;
                    if (i18 == 2) {
                        int i19 = (i17 + 1) % 20;
                        long j11 = jArr2[i19];
                        if (j6 == j11) {
                            fSqrt = 0.0f;
                            f10 = 0.0f;
                        } else {
                            fSqrt = fArr[i19] / (j11 - j6);
                            f10 = 0.0f;
                        }
                    } else {
                        float fAbs = 0.0f;
                        int i20 = 0;
                        while (true) {
                            if (i11 >= c1072y2.f16303d - 1) {
                                break;
                            }
                            int i21 = i11 + i17;
                            long j12 = jArr2[i21 % 20];
                            int i22 = (i21 + 1) % 20;
                            if (jArr2[i22] == j12) {
                                f11 = f12;
                                i10 = i11;
                            } else {
                                i20++;
                                f11 = f12;
                                i10 = i11;
                                float fSqrt2 = (fAbs < f12 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                                float f13 = fArr[i22] / (jArr2[i22] - j12);
                                fAbs += Math.abs(f13) * (f13 - fSqrt2);
                                if (i20 == 1) {
                                    fAbs *= 0.5f;
                                }
                            }
                            i11 = i10 + 1;
                            f12 = f11;
                        }
                        f10 = f12;
                        fSqrt = ((float) Math.sqrt(Math.abs(fAbs) * 2.0f)) * (fAbs < f10 ? -1.0f : 1.0f);
                    }
                }
            }
            float f14 = fSqrt * 1000;
            c1072y2.f16302c = f14;
            if (f14 < (-Math.abs(Float.MAX_VALUE))) {
                c1072y2.f16302c = -Math.abs(Float.MAX_VALUE);
            } else if (c1072y2.f16302c > Math.abs(Float.MAX_VALUE)) {
                c1072y2.f16302c = Math.abs(Float.MAX_VALUE);
            }
        } else {
            f10 = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return androidx.camera.core.imagecapture.i.c(velocityTracker, i7);
        }
        if (i7 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i7 == 1) {
            return velocityTracker.getYVelocity();
        }
        C1072y c1072y3 = (C1072y) AbstractC1071x.f16299a.get(velocityTracker);
        return (c1072y3 == null || i7 != 26) ? f10 : c1072y3.f16302c;
    }
}
