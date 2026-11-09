package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@KeepName
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zad();
    private static final Builder zak = new zab(new String[0], null);

    @SafeParcelable.VersionField(id = 1000)
    final int zaa;
    Bundle zab;
    int[] zac;
    int zad;
    boolean zae;

    @SafeParcelable.Field(getter = "getColumns", id = 1)
    private final String[] zaf;

    @SafeParcelable.Field(getter = "getWindows", id = 2)
    private final CursorWindow[] zag;

    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private final int zah;

    @Nullable
    @SafeParcelable.Field(getter = "getMetadata", id = 4)
    private final Bundle zai;
    private boolean zaj;

    @KeepForSdk
    public static class Builder {
        private final String[] zaa;
        private final ArrayList zab = new ArrayList();
        private final HashMap zac = new HashMap();

        public /* synthetic */ Builder(String[] strArr, String str, byte[] bArr) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        @KeepForSdk
        public DataHolder build(int i7) {
            return new DataHolder(this, i7, (Bundle) null, (byte[]) (0 == true ? 1 : 0));
        }

        @NonNull
        @KeepForSdk
        public Builder withRow(@NonNull ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap map = new HashMap(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return zaa(map);
        }

        @NonNull
        public Builder zaa(@NonNull HashMap map) {
            Asserts.checkNotNull(map);
            this.zab.add(map);
            return this;
        }

        public final /* synthetic */ String[] zab() {
            return this.zaa;
        }

        public final /* synthetic */ ArrayList zac() {
            return this.zab;
        }

        @NonNull
        @KeepForSdk
        public DataHolder build(int i7, @NonNull Bundle bundle) {
            return new DataHolder(this, i7, bundle, -1, (byte[]) null);
        }
    }

    public /* synthetic */ DataHolder(Builder builder, int i7, Bundle bundle, byte[] bArr) {
        this(builder, i7, (Bundle) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    @KeepForSdk
    public static Builder builder(@NonNull String[] strArr) {
        return new Builder(strArr, null, 0 == true ? 1 : 0);
    }

    @NonNull
    @KeepForSdk
    public static DataHolder empty(int i7) {
        return new DataHolder(zak, i7, (Bundle) null);
    }

    private static CursorWindow[] zae(Builder builder, int i7) {
        if (builder.zab().length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayListZac = builder.zac();
        int size = arrayListZac.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cursorWindow);
        cursorWindow.setNumColumns(builder.zab().length);
        int i10 = 0;
        boolean z3 = false;
        while (i10 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    new StringBuilder(String.valueOf(i10).length() + 61);
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i10);
                    cursorWindow.setNumColumns(builder.zab().length);
                    arrayList.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList.remove(cursorWindow);
                        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                    }
                }
                Map map = (Map) arrayListZac.get(i10);
                int i11 = 0;
                boolean zPutDouble = true;
                while (true) {
                    if (i11 >= builder.zab().length) {
                        z3 = zPutDouble ? false : true;
                        i10++;
                    } else if (zPutDouble) {
                        String str = builder.zab()[i11];
                        Object obj = map.get(str);
                        if (obj == null) {
                            zPutDouble = cursorWindow.putNull(i10, i11);
                        } else if (obj instanceof String) {
                            zPutDouble = cursorWindow.putString((String) obj, i10, i11);
                        } else if (obj instanceof Long) {
                            zPutDouble = cursorWindow.putLong(((Long) obj).longValue(), i10, i11);
                        } else if (obj instanceof Integer) {
                            zPutDouble = cursorWindow.putLong(((Integer) obj).intValue(), i10, i11);
                        } else if (obj instanceof Boolean) {
                            zPutDouble = cursorWindow.putLong(true != ((Boolean) obj).booleanValue() ? 0L : 1L, i10, i11);
                        } else if (obj instanceof byte[]) {
                            zPutDouble = cursorWindow.putBlob((byte[]) obj, i10, i11);
                        } else if (obj instanceof Double) {
                            zPutDouble = cursorWindow.putDouble(((Double) obj).doubleValue(), i10, i11);
                        } else {
                            if (!(obj instanceof Float)) {
                                String string = obj.toString();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + string.length());
                                sb2.append("Unsupported object for column ");
                                sb2.append(str);
                                sb2.append(": ");
                                sb2.append(string);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            zPutDouble = cursorWindow.putDouble(((Float) obj).floatValue(), i10, i11);
                        }
                        i11++;
                    }
                    if (z3) {
                        throw new zac("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                    }
                    new StringBuilder(String.valueOf(i10).length() + 63);
                    cursorWindow.freeLastRow();
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i10);
                    cursorWindow.setNumColumns(builder.zab().length);
                    arrayList.add(cursorWindow);
                    i10--;
                    i10++;
                }
            } catch (RuntimeException e10) {
                int size2 = arrayList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((CursorWindow) arrayList.get(i12)).close();
                }
                throw e10;
            }
        }
        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
    }

    private final void zaf(String str, int i7) {
        Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i7 < 0 || i7 >= this.zad) {
            throw new CursorIndexOutOfBoundsException(i7, this.zad);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public void close() {
        synchronized (this) {
            try {
                if (!this.zae) {
                    this.zae = true;
                    int i7 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.zag;
                        if (i7 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i7].close();
                        i7++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            if (this.zaj && this.zag.length > 0 && !isClosed()) {
                close();
                String string = toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 178);
                sb2.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb2.append(string);
                sb2.append(")");
                Log.e("DataBuffer", sb2.toString());
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public boolean getBoolean(@NonNull String str, int i7, int i10) {
        zaf(str, i7);
        return this.zag[i10].getLong(i7, this.zab.getInt(str)) == 1;
    }

    @NonNull
    @KeepForSdk
    public byte[] getByteArray(@NonNull String str, int i7, int i10) {
        zaf(str, i7);
        return this.zag[i10].getBlob(i7, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getCount() {
        return this.zad;
    }

    @KeepForSdk
    public int getInteger(@NonNull String str, int i7, int i10) {
        zaf(str, i7);
        return this.zag[i10].getInt(i7, this.zab.getInt(str));
    }

    @KeepForSdk
    public long getLong(@NonNull String str, int i7, int i10) {
        zaf(str, i7);
        return this.zag[i10].getLong(i7, this.zab.getInt(str));
    }

    @Nullable
    @KeepForSdk
    public Bundle getMetadata() {
        return this.zai;
    }

    @KeepForSdk
    public int getStatusCode() {
        return this.zah;
    }

    @NonNull
    @KeepForSdk
    public String getString(@NonNull String str, int i7, int i10) {
        zaf(str, i7);
        return this.zag[i10].getString(i7, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getWindowIndex(int i7) {
        int length;
        int i10 = 0;
        Preconditions.checkState(i7 >= 0 && i7 < this.zad);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i10 >= length) {
                break;
            }
            if (i7 < iArr[i10]) {
                i10--;
                break;
            }
            i10++;
        }
        return i10 == length ? i10 - 1 : i10;
    }

    @KeepForSdk
    public boolean hasColumn(@NonNull String str) {
        return this.zab.containsKey(str);
    }

    @KeepForSdk
    public boolean hasNull(@NonNull String str, int i7, int i10) {
        zaf(str, i7);
        return this.zag[i10].isNull(i7, this.zab.getInt(str));
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z3;
        synchronized (this) {
            z3 = this.zae;
        }
        return z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i7) {
        String[] strArr = this.zaf;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, strArr, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zag, i7, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if ((i7 & 1) != 0) {
            close();
        }
    }

    public final void zaa() {
        this.zab = new Bundle();
        int i7 = 0;
        while (true) {
            String[] strArr = this.zaf;
            if (i7 >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i7], i7);
            i7++;
        }
        CursorWindow[] cursorWindowArr = this.zag;
        this.zac = new int[cursorWindowArr.length];
        int numRows = 0;
        for (int i10 = 0; i10 < cursorWindowArr.length; i10++) {
            this.zac[i10] = numRows;
            numRows += cursorWindowArr[i10].getNumRows() - (numRows - cursorWindowArr[i10].getStartPosition());
        }
        this.zad = numRows;
    }

    public final float zab(@NonNull String str, int i7, int i10) {
        zaf(str, i7);
        return this.zag[i10].getFloat(i7, this.zab.getInt(str));
    }

    public final double zac(@NonNull String str, int i7, int i10) {
        zaf(str, i7);
        return this.zag[i10].getDouble(i7, this.zab.getInt(str));
    }

    public final void zad(@NonNull String str, int i7, int i10, @NonNull CharArrayBuffer charArrayBuffer) {
        zaf(str, i7);
        this.zag[i10].copyStringToBuffer(i7, this.zab.getInt(str), charArrayBuffer);
    }

    @SafeParcelable.Constructor
    public DataHolder(@SafeParcelable.Param(id = 1000) int i7, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i10, @Nullable @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.zae = false;
        this.zaj = true;
        this.zaa = i7;
        this.zaf = strArr;
        this.zag = cursorWindowArr;
        this.zah = i10;
        this.zai = bundle;
    }

    @KeepForSdk
    public DataHolder(@NonNull String[] strArr, @NonNull CursorWindow[] cursorWindowArr, int i7, @Nullable Bundle bundle) {
        this.zae = false;
        this.zaj = true;
        this.zaa = 1;
        this.zaf = (String[]) Preconditions.checkNotNull(strArr);
        this.zag = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zah = i7;
        this.zai = bundle;
        zaa();
    }

    public DataHolder(@NonNull Cursor cursor, int i7, @Nullable Bundle bundle) {
        int startPosition;
        CursorWrapper cursorWrapper = new CursorWrapper(cursor);
        String[] columnNames = cursorWrapper.getColumnNames();
        ArrayList arrayList = new ArrayList();
        try {
            int count = cursorWrapper.getCount();
            CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                startPosition = 0;
            } else {
                window.acquireReference();
                cursorWrapper.setWindow(null);
                arrayList.add(window);
                startPosition = window.getNumRows();
            }
            while (startPosition < count && cursorWrapper.moveToPosition(startPosition)) {
                CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(startPosition);
                    cursorWrapper.fillWindow(startPosition, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                startPosition = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
            this(columnNames, (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]), i7, bundle);
        } catch (Throwable th) {
            cursorWrapper.close();
            throw th;
        }
    }

    private DataHolder(Builder builder, int i7, @Nullable Bundle bundle) {
        this(builder.zab(), zae(builder, -1), i7, (Bundle) null);
    }

    public /* synthetic */ DataHolder(Builder builder, int i7, Bundle bundle, int i10, byte[] bArr) {
        this(builder.zab(), zae(builder, -1), i7, bundle);
    }
}
