package N2;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.fresco.animation.bitmap.preparation.BitmapFramePreparationStrategy;
import com.facebook.fresco.animation.bitmap.preparation.BitmapFramePreparer;
import com.facebook.soloader.C1392b;
import com.facebook.soloader.e;
import com.facebook.soloader.recovery.RecoveryStrategy;
import com.facebook.soloader.v;
import com.facebook.soloader.w;
import com.facebook.soloader.x;
import com.hjq.toast.config.IToastStyle;
import com.swmansion.rnscreens.gamma.helpers.ViewIdProviding;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements BitmapFramePreparationStrategy, IToastStyle, RecoveryStrategy, ViewIdProviding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6069a;

    public /* synthetic */ b(int i7) {
        this.f6069a = i7;
    }

    @Override // com.hjq.toast.config.IToastStyle
    public View createView(Context context) {
        return LayoutInflater.from(context).inflate(this.f6069a, (ViewGroup) null);
    }

    @Override // com.swmansion.rnscreens.gamma.helpers.ViewIdProviding
    public int generateViewId() {
        int i7 = this.f6069a;
        int i10 = i7 + 2;
        this.f6069a = i10;
        if (i10 % 10 == 1) {
            this.f6069a = i7 + 4;
        }
        return i7;
    }

    @Override // com.hjq.toast.config.IToastStyle
    public int getGravity() {
        return 17;
    }

    @Override // com.hjq.toast.config.IToastStyle
    public float getHorizontalMargin() {
        return 0.0f;
    }

    @Override // com.hjq.toast.config.IToastStyle
    public float getVerticalMargin() {
        return 0.0f;
    }

    @Override // com.hjq.toast.config.IToastStyle
    public int getXOffset() {
        return 0;
    }

    @Override // com.hjq.toast.config.IToastStyle
    public int getYOffset() {
        return 0;
    }

    @Override // com.facebook.fresco.animation.bitmap.preparation.BitmapFramePreparationStrategy
    public void prepareFrames(BitmapFramePreparer bitmapFramePreparer, BitmapFrameCache bitmapFrameCache, AnimationBackend animationBackend, int i7) {
        for (int i10 = 1; i10 <= this.f6069a; i10++) {
            int frameCount = (i7 + i10) % animationBackend.getFrameCount();
            if (p229p2.a.f41180a.isLoggable(2)) {
                p229p2.a.p(b.class, "Preparing frame %d, last drawn: %d", Integer.valueOf(frameCount), Integer.valueOf(i7));
            }
            if (!bitmapFramePreparer.prepareFrame(bitmapFrameCache, animationBackend, frameCount)) {
                return;
            }
        }
    }

    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, x[] xVarArr) {
        if (unsatisfiedLinkError instanceof w) {
            w wVar = (w) unsatisfiedLinkError;
            String str = wVar.f21905a;
            String message = wVar.getMessage();
            if (str == null) {
                Log.e("SoLoader", "No so name provided in ULE, cannot recover");
                return false;
            }
            if (!(wVar instanceof v)) {
                if (message != null && (message.contains("/app/") || message.contains("/mnt/"))) {
                    Log.e("SoLoader", "Reunpacking BackupSoSources due to " + wVar + ", retrying for specific library " + str);
                    int length = xVarArr.length;
                    for (int i7 = 0; i7 < length; i7++) {
                        x xVar = xVarArr[i7];
                        if (xVar instanceof C1392b) {
                            C1392b c1392b = (C1392b) xVar;
                            try {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Preparing BackupSoSource for the first time ");
                                c1392b.getClass();
                                sb2.append("BackupSoSource");
                                Log.e("SoLoader", sb2.toString());
                                c1392b.d(0);
                                for (x xVar2 : xVarArr) {
                                    if ((xVar2 instanceof e) && !(xVar2 instanceof C1392b)) {
                                        ((e) xVar2).f21878b |= 1;
                                    }
                                }
                                return true;
                            } catch (Exception e10) {
                                StringBuilder sb3 = new StringBuilder("Encountered an exception while reunpacking BackupSoSource BackupSoSource for library ");
                                c1392b.getClass();
                                sb3.append(str);
                                sb3.append(": ");
                                Log.e("SoLoader", sb3.toString(), e10);
                                break;
                            }
                        }
                    }
                }
            } else if ((this.f6069a & 1) != 0) {
                Log.e("SoLoader", "Reunpacking BackupSoSources due to " + wVar + ", retrying for specific library " + str);
                try {
                    for (x xVar3 : xVarArr) {
                        if ((xVar3 instanceof C1392b) && ((C1392b) xVar3).k(str)) {
                            return true;
                        }
                    }
                } catch (IOException e11) {
                    Log.e("SoLoader", "Failed to run recovery for backup so source due to: " + e11);
                }
            }
        }
        return false;
    }
}
