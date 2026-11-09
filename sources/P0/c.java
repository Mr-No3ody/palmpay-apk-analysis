package P0;

import N8.q0;

/* JADX INFO: loaded from: classes.dex */
public class c extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6857a;

    @Override // java.lang.Throwable
    public String getMessage() {
        switch (this.f6857a) {
            case 11:
                return "Chain of Causes for CompositeException In Order Received =>";
            default:
                return super.getMessage();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i7, String str, Throwable th) {
        super(str, th);
        this.f6857a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i7, Throwable th) {
        super(th);
        this.f6857a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i7, boolean z3) {
        super(str);
        this.f6857a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, int i7) {
        super(str.toString());
        this.f6857a = i7;
        switch (i7) {
            case 9:
                super("Invalid request builder: ".concat(str));
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Integer num) {
        super("Invalid size: " + num.toString());
        this.f6857a = 12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(int i7, int i10, int i11, int i12) {
        this.f6857a = 13;
        StringBuilder sbP = q0.p(i7, "Pool hard cap violation? Hard cap = ", i10, " Used size = ", " Free size = ");
        sbP.append(i11);
        sbP.append(" Request size = ");
        sbP.append(i12);
        super(sbP.toString());
    }
}
