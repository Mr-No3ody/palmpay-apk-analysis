package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A0 f16949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B0 f16950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B0 f16951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B0 f16952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B0 f16953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ B0[] f16954f;

    static {
        B0 b0 = new B0("REMOVED", 0);
        f16950b = b0;
        B0 b7 = new B0("VISIBLE", 1);
        f16951c = b7;
        B0 b10 = new B0("GONE", 2);
        f16952d = b10;
        B0 b11 = new B0("INVISIBLE", 3);
        f16953e = b11;
        f16954f = new B0[]{b0, b7, b10, b11};
        f16949a = new A0(null);
    }

    public static B0 valueOf(String str) {
        return (B0) Enum.valueOf(B0.class, str);
    }

    public static B0[] values() {
        return (B0[]) f16954f.clone();
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (Z.L(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if (Z.L(2)) {
                Objects.toString(view);
            }
            view.setVisibility(0);
        } else if (iOrdinal == 2) {
            if (Z.L(2)) {
                Objects.toString(view);
            }
            view.setVisibility(8);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            if (Z.L(2)) {
                Objects.toString(view);
            }
            view.setVisibility(4);
        }
    }
}
