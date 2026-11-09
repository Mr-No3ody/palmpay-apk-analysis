package Da;

import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1765a;

    static {
        int[] iArr = new int[ReadableType.values().length];
        try {
            iArr[ReadableType.Map.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReadableType.Array.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ReadableType.String.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ReadableType.Number.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ReadableType.Boolean.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ReadableType.Null.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f1765a = iArr;
    }
}
