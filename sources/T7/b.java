package T7;

import androidx.lifecycle.EnumC1203m;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9036a;

    static {
        int[] iArr = new int[EnumC1203m.values().length];
        try {
            iArr[EnumC1203m.ON_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC1203m.ON_RESUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC1203m.ON_PAUSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC1203m.ON_STOP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC1203m.ON_DESTROY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EnumC1203m.ON_CREATE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[EnumC1203m.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f9036a = iArr;
    }
}
