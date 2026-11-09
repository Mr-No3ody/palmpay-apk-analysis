package Ye;

import D4.f;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p039cb.c f11378c;

    public b(Context context) {
        super(new c(context, "_nohttp_cache_db.db", null, 3, 0), 4);
        this.f11378c = new p039cb.c(context.getApplicationInfo().packageName);
    }

    @Override // D4.f
    public final String b() {
        return "cache_table";
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0090 A[PHI: r2
      0x0090: PHI (r2v3 android.database.Cursor) = (r2v2 android.database.Cursor), (r2v4 android.database.Cursor) binds: [B:20:0x008e, B:15:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // D4.f
    public final ArrayList h(String str) {
        SQLiteDatabase readableDatabase = ((c) this.f1592b).getReadableDatabase();
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = readableDatabase.rawQuery(str, null);
                while (!cursorRawQuery.isClosed() && cursorRawQuery.moveToNext()) {
                    a aVar = new a();
                    aVar.f11373a = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("_id"));
                    aVar.f11374b = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("key"));
                    aVar.b(x(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("head"))));
                    aVar.f11376d = Base64.decode(x(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(Constants.ScionAnalytics.MessageType.DATA_MESSAGE))), 0);
                    aVar.f11377e = Long.parseLong(x(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("local_expires"))));
                    arrayList.add(aVar);
                }
                if (!cursorRawQuery.isClosed()) {
                    cursorRawQuery.close();
                }
            } catch (Exception e10) {
                G8.a.c(e10);
                if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                    cursorRawQuery.close();
                }
            }
            f.d(readableDatabase);
            return arrayList;
        } catch (Throwable th) {
            if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
            f.d(readableDatabase);
            throw th;
        }
    }

    public final void w(p105h.b bVar) {
        a aVar = (a) bVar;
        SQLiteDatabase writableDatabase = ((c) this.f1592b).getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", aVar.f11374b);
            contentValues.put("head", y(aVar.a()));
            contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, y(Base64.encodeToString(aVar.f11376d, 0)));
            contentValues.put("local_expires", y(Long.toString(aVar.f11377e)));
            writableDatabase.replace("cache_table", null, contentValues);
            writableDatabase.setTransactionSuccessful();
        } catch (Exception unused) {
        } finally {
            writableDatabase.endTransaction();
            f.d(writableDatabase);
        }
    }

    public final String x(String str) {
        p039cb.c cVar = this.f11378c;
        cVar.getClass();
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        byte[] bArr = new byte[length / 2];
        for (int i7 = 0; i7 < length; i7 += 2) {
            bArr[i7 / 2] = (byte) Integer.parseInt(new String(bytes, i7, 2), 16);
        }
        return new String(((Cipher) cVar.f18902c).doFinal(bArr));
    }

    public final String y(String str) throws BadPaddingException, IllegalBlockSizeException {
        p039cb.c cVar = this.f11378c;
        cVar.getClass();
        byte[] bArrDoFinal = ((Cipher) cVar.f18901b).doFinal(str.getBytes());
        StringBuffer stringBuffer = new StringBuffer(bArrDoFinal.length * 2);
        for (int i7 : bArrDoFinal) {
            while (i7 < 0) {
                i7 += IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
            if (i7 < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toString(i7, 16));
        }
        return stringBuffer.toString();
    }
}
