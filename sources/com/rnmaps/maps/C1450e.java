package com.rnmaps.maps;

import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileProvider;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.rnmaps.maps.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1450e implements TileProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MapLocalTile f24928d;

    public C1450e(MapLocalTile mapLocalTile, int i7, String str, boolean z3) {
        this.f24928d = mapLocalTile;
        this.f24925a = i7;
        this.f24926b = str;
        this.f24927c = z3;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008f A[Catch: Exception -> 0x0092, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0092, blocks: (B:28:0x0073, B:40:0x008f), top: B:64:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[SYNTHETIC] */
    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i7, int i10, int i11) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        String strReplace = this.f24926b.replace("{x}", Integer.toString(i7)).replace("{y}", Integer.toString(i10)).replace("{z}", Integer.toString(i11));
        byte[] byteArray = null;
        byteArray = null;
        byteArray = null;
        InputStream inputStream2 = null;
        try {
            try {
                InputStream inputStreamOpen = this.f24927c ? this.f24928d.getContext().getAssets().open(strReplace) : new FileInputStream(strReplace);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[16384];
                        while (true) {
                            int i12 = inputStreamOpen.read(bArr, 0, 16384);
                            if (i12 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i12);
                        }
                        byteArrayOutputStream.flush();
                        byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            inputStreamOpen.close();
                        } catch (Exception unused) {
                        }
                        byteArrayOutputStream.close();
                    } catch (IOException e10) {
                        e = e10;
                        inputStream = inputStreamOpen;
                        e = e;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        try {
                            e.printStackTrace();
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Exception unused2) {
                                }
                            }
                            if (byteArrayOutputStream2 != null) {
                                byteArrayOutputStream2.close();
                            }
                            if (byteArray == null) {
                                return TileProvider.NO_TILE;
                            }
                            int i13 = this.f24925a;
                            return new Tile(i13, i13, byteArray);
                        } catch (Throwable th) {
                            th = th;
                            inputStream2 = inputStream;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Exception unused3) {
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                throw th;
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (Exception unused4) {
                                throw th;
                            }
                        }
                    } catch (OutOfMemoryError e11) {
                        e = e11;
                        inputStream = inputStreamOpen;
                        e = e;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        e.printStackTrace();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (byteArrayOutputStream2 != null) {
                            byteArrayOutputStream2.close();
                        }
                        if (byteArray == null) {
                            return TileProvider.NO_TILE;
                        }
                        int i14 = this.f24925a;
                        return new Tile(i14, i14, byteArray);
                    } catch (Throwable th2) {
                        inputStream2 = inputStreamOpen;
                        th = th2;
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        if (byteArrayOutputStream != null) {
                            throw th;
                        }
                        byteArrayOutputStream.close();
                        throw th;
                    }
                } catch (IOException e12) {
                    e = e12;
                    Throwable th3 = e;
                    inputStream = inputStreamOpen;
                    e = th3;
                    byteArrayOutputStream2 = null;
                    e.printStackTrace();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (byteArrayOutputStream2 != null) {
                        byteArrayOutputStream2.close();
                    }
                    if (byteArray == null) {
                        return TileProvider.NO_TILE;
                    }
                    int i15 = this.f24925a;
                    return new Tile(i15, i15, byteArray);
                } catch (OutOfMemoryError e13) {
                    e = e13;
                    Throwable th4 = e;
                    inputStream = inputStreamOpen;
                    e = th4;
                    byteArrayOutputStream2 = null;
                    e.printStackTrace();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (byteArrayOutputStream2 != null) {
                        byteArrayOutputStream2.close();
                    }
                    if (byteArray == null) {
                        return TileProvider.NO_TILE;
                    }
                    int i16 = this.f24925a;
                    return new Tile(i16, i16, byteArray);
                } catch (Throwable th5) {
                    inputStream2 = inputStreamOpen;
                    th = th5;
                    byteArrayOutputStream = null;
                }
            } catch (Exception unused5) {
            }
        } catch (IOException e14) {
            e = e14;
            inputStream = null;
            byteArrayOutputStream2 = null;
            e.printStackTrace();
            if (inputStream != null) {
                inputStream.close();
            }
            if (byteArrayOutputStream2 != null) {
                byteArrayOutputStream2.close();
            }
            if (byteArray == null) {
                return TileProvider.NO_TILE;
            }
            int i17 = this.f24925a;
            return new Tile(i17, i17, byteArray);
        } catch (OutOfMemoryError e15) {
            e = e15;
            inputStream = null;
            byteArrayOutputStream2 = null;
            e.printStackTrace();
            if (inputStream != null) {
                inputStream.close();
            }
            if (byteArrayOutputStream2 != null) {
                byteArrayOutputStream2.close();
            }
            if (byteArray == null) {
                return TileProvider.NO_TILE;
            }
            int i18 = this.f24925a;
            return new Tile(i18, i18, byteArray);
        } catch (Throwable th6) {
            th = th6;
            byteArrayOutputStream = null;
        }
        if (byteArray == null) {
            return TileProvider.NO_TILE;
        }
        int i19 = this.f24925a;
        return new Tile(i19, i19, byteArray);
    }
}
