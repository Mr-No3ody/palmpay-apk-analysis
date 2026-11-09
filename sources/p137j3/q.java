package p137j3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Log;
import com.facebook.imagepipeline.memory.BitmapPool;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import p262r2.b;
import ph.a;
import top.zibin.luban.InputStreamProvider;

/* JADX INFO: loaded from: classes.dex */
public final class q implements BitmapPool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f38247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f38248d;

    public q(InputStreamProvider inputStreamProvider, File file) {
        this.f38248d = file;
        this.f38247c = inputStreamProvider;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 1;
        BitmapFactory.decodeStream(inputStreamProvider.open(), null, options);
        this.f38245a = options.outWidth;
        this.f38246b = options.outHeight;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    public File a() throws IOException {
        int iCeil;
        int i7;
        int i10 = 0;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i11 = this.f38245a;
        if (i11 % 2 == 1) {
            i11++;
        }
        this.f38245a = i11;
        int i12 = this.f38246b;
        if (i12 % 2 == 1) {
            i12++;
        }
        this.f38246b = i12;
        int iMax = Math.max(i11, i12);
        float fMin = Math.min(this.f38245a, this.f38246b) / iMax;
        if (fMin > 1.0f || fMin <= 0.5625d) {
            double d2 = fMin;
            if (d2 > 0.5625d || d2 <= 0.5d) {
                iCeil = (int) Math.ceil(((double) iMax) / (1280.0d / d2));
            } else {
                iCeil = iMax / 1280;
                if (iCeil == 0) {
                    iCeil = 1;
                }
            }
        } else if (iMax < 1664) {
            iCeil = 1;
        } else if (iMax < 4990) {
            iCeil = 2;
        } else {
            iCeil = (iMax <= 4990 || iMax >= 10240) ? iMax / 1280 : 4;
        }
        options.inSampleSize = iCeil;
        InputStreamProvider inputStreamProvider = (InputStreamProvider) this.f38247c;
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamProvider.open(), null, options);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a aVar = a.SINGLE;
        byte[] bArrC = a.c(inputStreamProvider.open());
        if ((bArrC == null || bArrC.length < 3) ? false : Arrays.equals(aVar.f41317a, new byte[]{bArrC[0], bArrC[1], bArrC[2]})) {
            byte[] bArrC2 = a.c(inputStreamProvider.open());
            if (bArrC2 != null) {
                int i13 = 0;
                while (true) {
                    if (i13 + 3 < bArrC2.length) {
                        int i14 = i13 + 1;
                        if ((bArrC2[i13] & UnsignedBytes.MAX_VALUE) == 255) {
                            int i15 = bArrC2[i14] & UnsignedBytes.MAX_VALUE;
                            if (i15 == 255) {
                                i13 = i14;
                            } else {
                                i14 = i13 + 2;
                                if (i15 != 216 && i15 != 1) {
                                    if (i15 != 217 && i15 != 218) {
                                        int iB = a.b(bArrC2, i14, 2, false);
                                        if (iB < 2 || (i14 = i14 + iB) > bArrC2.length) {
                                            Log.e("Luban", "Invalid length");
                                        } else if (i15 == 225 && iB >= 8 && a.b(bArrC2, i13 + 4, 4, false) == 1165519206 && a.b(bArrC2, i13 + 8, 2, false) == 0) {
                                            i13 += 10;
                                            i7 = iB - 8;
                                        }
                                    }
                                }
                                i13 = i14;
                            }
                        }
                        i7 = 0;
                        i13 = i14;
                    } else {
                        i7 = 0;
                    }
                    if (i7 <= 8) {
                        Log.e("Luban", "Orientation not found");
                        break;
                    }
                    int iB2 = a.b(bArrC2, i13, 4, false);
                    if (iB2 == 1229531648 || iB2 == 1296891946) {
                        boolean z3 = iB2 == 1229531648;
                        int iB3 = a.b(bArrC2, i13 + 4, 4, z3) + 2;
                        if (iB3 < 10 || iB3 > i7) {
                            Log.e("Luban", "Invalid offset");
                        } else {
                            int i16 = i13 + iB3;
                            int i17 = i7 - iB3;
                            int iB4 = a.b(bArrC2, i16 - 2, 2, z3);
                            while (true) {
                                int i18 = iB4 - 1;
                                if (iB4 <= 0 || i17 < 12) {
                                    Log.e("Luban", "Orientation not found");
                                    break;
                                }
                                if (a.b(bArrC2, i16, 2, z3) == 274) {
                                    int iB5 = a.b(bArrC2, i16 + 8, 2, z3);
                                    if (iB5 == 1) {
                                        break;
                                    }
                                    if (iB5 == 3) {
                                        i10 = 180;
                                        break;
                                    }
                                    if (iB5 == 6) {
                                        i10 = 90;
                                        break;
                                    }
                                    if (iB5 == 8) {
                                        i10 = 270;
                                        break;
                                    }
                                    Log.e("Luban", "Unsupported orientation");
                                    break;
                                }
                                i16 += 12;
                                i17 -= 12;
                                iB4 = i18;
                            }
                        }
                    } else {
                        Log.e("Luban", "Invalid byte order");
                    }
                }
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i10);
            bitmapDecodeStream = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
        }
        bitmapDecodeStream.compress(bitmapDecodeStream.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 60, byteArrayOutputStream);
        bitmapDecodeStream.recycle();
        File file = (File) this.f38248d;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.flush();
        fileOutputStream.close();
        byteArrayOutputStream.close();
        return file;
    }

    public synchronized void b(int i7) {
        Bitmap bitmap;
        while (this.f38246b > i7 && (bitmap = (Bitmap) ((g) this.f38247c).pop()) != null) {
            this.f38246b -= ((g) this.f38247c).getSize(bitmap);
            ((u) this.f38248d).getClass();
        }
    }

    @Override // com.facebook.common.memory.Pool
    public Bitmap get(int i7) {
        synchronized (this) {
            try {
                if (this.f38246b > 0) {
                    b(0);
                }
                Bitmap bitmap = (Bitmap) ((g) this.f38247c).get(i7);
                if (bitmap == null) {
                    ((u) this.f38248d).getClass();
                    return Bitmap.createBitmap(1, i7, Bitmap.Config.ALPHA_8);
                }
                this.f38246b -= ((g) this.f38247c).getSize(bitmap);
                ((u) this.f38248d).getClass();
                return bitmap;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.common.memory.Pool, com.facebook.common.references.ResourceReleaser
    public void release(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        int size = ((g) this.f38247c).getSize(bitmap);
        if (size <= this.f38245a) {
            ((u) this.f38248d).getClass();
            ((g) this.f38247c).put(bitmap);
            synchronized (this) {
                this.f38246b += size;
            }
        }
    }

    @Override // com.facebook.common.memory.MemoryTrimmable
    public void trim(b bVar) {
        b((int) ((1.0d - bVar.f41550a) * ((double) 0)));
    }

    public q(int i7, u uVar) {
        this.f38247c = new g(5);
        this.f38245a = i7;
        this.f38248d = uVar;
    }
}
