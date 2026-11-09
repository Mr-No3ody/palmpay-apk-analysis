package p317v0;

import android.view.View;
import p059e1.a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f43018e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7) {
        super(19);
        this.f43018e = i7;
    }

    @Override // p059e1.a
    public final int o(View view, int i7, int i10) {
        switch (this.f43018e) {
            case 0:
                return Integer.MIN_VALUE;
            case 1:
                return 0;
            case 2:
                return i7;
            case 3:
                return i7 >> 1;
            case 4:
                if (view.getVisibility() == 8) {
                    return 0;
                }
                int baseline = view.getBaseline();
                if (baseline == -1) {
                    return Integer.MIN_VALUE;
                }
                return baseline;
            default:
                return Integer.MIN_VALUE;
        }
    }

    @Override // p059e1.a
    public g p() {
        switch (this.f43018e) {
            case 4:
                return new d();
            default:
                return super.p();
        }
    }

    @Override // p059e1.a
    public final String r() {
        switch (this.f43018e) {
            case 0:
                return "UNDEFINED";
            case 1:
                return "LEADING";
            case 2:
                return "TRAILING";
            case 3:
                return "CENTER";
            case 4:
                return "BASELINE";
            default:
                return "FILL";
        }
    }

    @Override // p059e1.a
    public final int u(int i7, View view) {
        switch (this.f43018e) {
            case 0:
                return Integer.MIN_VALUE;
            case 1:
                return 0;
            case 2:
                return i7;
            case 3:
                return i7 >> 1;
            case 4:
                return 0;
            default:
                return 0;
        }
    }

    @Override // p059e1.a
    public int z(int i7, int i10) {
        switch (this.f43018e) {
            case 5:
                return i10;
            default:
                return i7;
        }
    }
}
