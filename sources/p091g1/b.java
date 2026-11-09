package p091g1;

import Ef.a;
import Ff.h;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.camera.core.impl.utils.executor.g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f36810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f36811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36812c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, List list, int i7, Continuation continuation) {
        super(2, continuation);
        this.f36810a = context;
        this.f36811b = list;
        this.f36812c = i7;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f36810a, this.f36811b, this.f36812c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        e eVar = e.f36833b;
        Uri uri = (Uri) this.f36811b.get(this.f36812c);
        eVar.getClass();
        Context context = this.f36810a;
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = contentResolver.query(uri, new String[]{"_data"}, null, null, null);
                if (cursorQuery == null) {
                    throw new Exception();
                }
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
                cursorQuery.moveToFirst();
                String string = cursorQuery.getString(columnIndexOrThrow);
                Intrinsics.checkNotNullExpressionValue(string, "{\n                val co…lumnIndex)\n\n            }");
                cursorQuery.close();
                return string;
            } catch (Throwable th) {
                if (0 == 0) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        } catch (Exception unused) {
            File file = new File(context.getApplicationInfo().dataDir + File.separator + System.currentTimeMillis());
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i7 = inputStreamOpenInputStream.read(bArr);
                            if (i7 <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i7);
                        }
                        Unit unit = Unit.f38893a;
                        fileOutputStream.close();
                        inputStreamOpenInputStream.close();
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            org.chromium.support_lib_boundary.util.b.o(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        org.chromium.support_lib_boundary.util.b.o(inputStreamOpenInputStream, th4);
                        throw th5;
                    }
                }
            }
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
            if (0 != 0) {
                cursor.close();
            }
            return absolutePath;
        }
    }
}
