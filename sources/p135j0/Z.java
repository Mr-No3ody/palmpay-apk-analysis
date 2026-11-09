package p135j0;

import Ef.a;
import Pg.j;
import androidx.camera.core.impl.utils.executor.g;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.WriteScope;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends Q implements WriteScope {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.WriteScope
    public final Object writeData(Object obj, Continuation continuation) {
        Y y8;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (continuation instanceof Y) {
            y8 = (Y) continuation;
            int i7 = y8.f38011e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                y8.f38011e = i7 - Integer.MIN_VALUE;
            } else {
                y8 = new Y(this, continuation);
            }
        } else {
            y8 = new Y(this, continuation);
        }
        Object obj2 = y8.f38009c;
        a aVar = a.f2423a;
        int i10 = y8.f38011e;
        if (i10 == 0) {
            g.M(obj2);
            if (this.f37980c.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(this.f37978a);
            try {
                Serializer serializer = this.f37979b;
                j jVar = new j(fileOutputStream3);
                y8.f38007a = fileOutputStream3;
                y8.f38008b = fileOutputStream3;
                y8.f38011e = 1;
                if (serializer.writeTo(obj, jVar, y8) == aVar) {
                    return aVar;
                }
                fileOutputStream2 = fileOutputStream3;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream3;
                throw th;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream2 = y8.f38008b;
            fileOutputStream = y8.f38007a;
            try {
                g.M(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    b.o(fileOutputStream, th);
                    throw th3;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        Unit unit = Unit.f38893a;
        b.o(fileOutputStream, null);
        return Unit.f38893a;
    }
}
