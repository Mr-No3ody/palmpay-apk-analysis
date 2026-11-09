package F3;

import N2.b;
import android.content.Context;
import com.facebook.soloader.RecoverableSoSource;
import com.facebook.soloader.recovery.RecoveryStrategy;
import com.facebook.soloader.recovery.RecoveryStrategyFactory;
import com.facebook.soloader.x;
import java.io.File;
import p045d3.j;
import p1.d;
import p121i2.e;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements RecoveryStrategyFactory, RecoveryStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4.a f2569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2570c;

    public a(Context context, int i7) {
        this.f2568a = context;
        this.f2570c = i7;
        C4.a aVar = new C4.a(2);
        this.f2569b = aVar;
        aVar.i(context.getApplicationInfo().sourceDir);
    }

    @Override // com.facebook.soloader.recovery.RecoveryStrategyFactory
    public RecoveryStrategy get() {
        int i7 = 3;
        int i10 = 1;
        Context context = this.f2568a;
        C4.a aVar = this.f2569b;
        a aVar2 = new a(context, aVar);
        d dVar = new d(5, context, aVar);
        e eVar = new e(i10);
        C2085k0 c2085k0 = new C2085k0(context, i7);
        b bVar = new b();
        bVar.f6069a = this.f2570c;
        return new C4.a(new RecoveryStrategy[]{aVar2, dVar, eVar, c2085k0, bVar, new j(i10), new p121i2.d((byte) 0, i10), new e(i10)}, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, x[] xVarArr) {
        int i7;
        Context context = this.f2568a;
        String str = context.getApplicationInfo().sourceDir;
        boolean zExists = new File(str).exists();
        C4.a aVar = this.f2569b;
        if (!zExists || !aVar.i(str)) {
            int i10 = this.f2570c;
            synchronized (aVar) {
                i7 = aVar.f1155b;
            }
            return i10 != i7;
        }
        for (int i11 = 0; i11 < xVarArr.length; i11++) {
            Object[] objArr = xVarArr[i11];
            if (objArr instanceof RecoverableSoSource) {
                xVarArr[i11] = ((RecoverableSoSource) objArr).recover(context);
            }
        }
        return true;
    }

    public a(Context context, C4.a aVar) {
        int i7;
        this.f2568a = context;
        this.f2569b = aVar;
        synchronized (aVar) {
            i7 = aVar.f1155b;
        }
        this.f2570c = i7;
    }
}
