package N7;

import androidx.lifecycle.EnumC1203m;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6119a;

    static {
        int[] iArr = new int[EnumC1203m.values().length];
        try {
            iArr[EnumC1203m.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC1203m.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC1203m.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC1203m.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC1203m.ON_DESTROY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f6119a = iArr;
    }
}
