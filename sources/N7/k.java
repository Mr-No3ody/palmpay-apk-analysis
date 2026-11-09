package N7;

import androidx.camera.video.u;
import com.alibaba.android.arouter.utils.Consts;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenContentWrapper;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6120a;

    static {
        new j(null);
    }

    public k(List rawDetents) {
        Intrinsics.checkNotNullParameter(rawDetents, "rawDetents");
        this.f6120a = CollectionsKt.Y(rawDetents);
        if (rawDetents.isEmpty()) {
            throw new IllegalArgumentException("[RNScreens] At least one detent must be provided.");
        }
        if (rawDetents.size() > 3) {
            throw new IllegalArgumentException("[RNScreens] Maximum of 3 detents supported.");
        }
        if (rawDetents.size() == 1) {
            double dDoubleValue = ((Number) rawDetents.get(0)).doubleValue();
            if ((0.0d > dDoubleValue || dDoubleValue > 1.0d) && dDoubleValue != -1.0d) {
                throw new IllegalArgumentException(("[RNScreens] Detent value must be within 0.0 and 1.0, or SHEET_FIT_TO_CONTENTS should be defined, got " + dDoubleValue + Consts.DOT).toString());
            }
            return;
        }
        List list = rawDetents;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            double dDoubleValue2 = ((Number) it.next()).doubleValue();
            if (0.0d > dDoubleValue2 || dDoubleValue2 > 1.0d) {
                throw new IllegalArgumentException(("[RNScreens] Detent values must be within 0.0 and 1.0, got " + dDoubleValue2 + Consts.DOT).toString());
            }
        }
        if (!rawDetents.equals(CollectionsKt.S(list))) {
            throw new IllegalArgumentException("[RNScreens] Detents must be sorted in ascending order.");
        }
    }

    public static int d(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        ScreenContentWrapper contentWrapper = screen.getContentWrapper();
        if (contentWrapper == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(contentWrapper.getHeight());
        Intrinsics.checkNotNullParameter(contentWrapper, "<this>");
        if (!contentWrapper.isLaidOut() && contentWrapper.getHeight() <= 0 && contentWrapper.getWidth() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public final int a(int i7, int i10) {
        List list = this.f6120a;
        if (list.size() >= 3) {
            return ((int) ((((double) 1) - ((Number) list.get(2)).doubleValue()) * ((double) i7))) + i10;
        }
        throw new IllegalStateException("[RNScreens] At least 3 detents required for expandedOffsetFromTop.");
    }

    public final int b(int i7, int i10) {
        double dDoubleValue = ((Number) this.f6120a.get(i7)).doubleValue();
        if (dDoubleValue != -1.0d) {
            return (int) (dDoubleValue * ((double) i10));
        }
        throw new IllegalArgumentException("[RNScreens] FIT_TO_CONTENTS is not supported by heightAt.");
    }

    public final int c(int i7) {
        return b(this.f6120a.size() - 1, i7);
    }

    public final int e(int i7) {
        int size = this.f6120a.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    throw new IllegalArgumentException(u.h(size, "[RNScreens] Invalid detentCount/index combination ", i7, " / "));
                }
                if (i7 == -1) {
                    return 5;
                }
                if (i7 == 0) {
                    return 4;
                }
                if (i7 == 1) {
                    return 6;
                }
                if (i7 != 2) {
                    throw new IllegalArgumentException(u.h(size, "[RNScreens] Invalid detentCount/index combination ", i7, " / "));
                }
            } else {
                if (i7 == -1) {
                    return 5;
                }
                if (i7 == 0) {
                    return 4;
                }
                if (i7 != 1) {
                    throw new IllegalArgumentException(u.h(size, "[RNScreens] Invalid detentCount/index combination ", i7, " / "));
                }
            }
        } else {
            if (i7 == -1) {
                return 5;
            }
            if (i7 != 0) {
                throw new IllegalArgumentException(u.h(size, "[RNScreens] Invalid detentCount/index combination ", i7, " / "));
            }
        }
        return 3;
    }
}
