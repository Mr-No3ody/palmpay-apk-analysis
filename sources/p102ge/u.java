package p102ge;

import com.transsnet.palmpay.util.DeviceUtils;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f37234a;

    static {
        int[] iArr = new int[DeviceUtils.LEVEL.values().length];
        try {
            iArr[DeviceUtils.LEVEL.BEST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeviceUtils.LEVEL.HIGH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeviceUtils.LEVEL.MIDDLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f37234a = iArr;
    }
}
