package com.airbnb.lottie.model.layer;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import com.airbnb.lottie.A;
import com.airbnb.lottie.ImageAssetDelegate;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.r;
import com.airbnb.lottie.k;
import com.airbnb.lottie.y;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f20041D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Rect f20042E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Rect f20043F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final RectF f20044G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final A f20045H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public r f20046I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public r f20047J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.g f20048K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public com.airbnb.lottie.utils.h f20049L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C4.a f20050M;

    public c(y yVar, e eVar) {
        A a3;
        super(yVar, eVar);
        this.f20041D = new com.airbnb.lottie.animation.a(3, 0);
        this.f20042E = new Rect();
        this.f20043F = new Rect();
        this.f20044G = new RectF();
        k kVar = yVar.f20304a;
        if (kVar == null) {
            a3 = null;
        } else {
            a3 = (A) ((HashMap) kVar.c()).get(eVar.f20057g);
        }
        this.f20045H = a3;
        E2.a aVar = this.f20021p.f20073x;
        if (aVar != null) {
            this.f20048K = new com.airbnb.lottie.animation.keyframe.g(this, this, aVar);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.model.KeyPathElement
    public final void addValueCallback(Object obj, p243q1.c cVar) {
        super.addValueCallback(obj, cVar);
        if (obj == LottieProperty.f19602I) {
            if (cVar == null) {
                this.f20046I = null;
                return;
            } else {
                this.f20046I = new r(null, cVar);
                return;
            }
        }
        if (obj == LottieProperty.f19605L) {
            if (cVar == null) {
                this.f20047J = null;
                return;
            } else {
                this.f20047J = new r(null, cVar);
                return;
            }
        }
        com.airbnb.lottie.animation.keyframe.g gVar = this.f20048K;
        if (obj == 5 && gVar != null) {
            gVar.f19801c.j(cVar);
            return;
        }
        if (obj == LottieProperty.f19598E && gVar != null) {
            gVar.b(cVar);
            return;
        }
        if (obj == LottieProperty.f19599F && gVar != null) {
            gVar.f19803e.j(cVar);
            return;
        }
        if (obj == LottieProperty.f19600G && gVar != null) {
            gVar.f19804f.j(cVar);
        } else {
            if (obj != LottieProperty.f19601H || gVar == null) {
                return;
            }
            gVar.f19805g.j(cVar);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void d(Canvas canvas, Matrix matrix, int i7, com.airbnb.lottie.utils.a aVar) {
        A a3;
        Bitmap bitmapL = l();
        if (bitmapL == null || bitmapL.isRecycled() || (a3 = this.f20045H) == null) {
            return;
        }
        float fC = com.airbnb.lottie.utils.i.c();
        com.airbnb.lottie.animation.a aVar2 = this.f20041D;
        aVar2.setAlpha(i7);
        r rVar = this.f20046I;
        if (rVar != null) {
            aVar2.setColorFilter((ColorFilter) rVar.e());
        }
        com.airbnb.lottie.animation.keyframe.g gVar = this.f20048K;
        if (gVar != null) {
            aVar = gVar.a(matrix, i7);
        }
        int width = bitmapL.getWidth();
        int height = bitmapL.getHeight();
        Rect rect = this.f20042E;
        rect.set(0, 0, width, height);
        boolean z3 = this.f20020o.f20285B;
        Rect rect2 = this.f20043F;
        if (z3) {
            rect2.set(0, 0, (int) (a3.f19550a * fC), (int) (a3.f19551b * fC));
        } else {
            rect2.set(0, 0, (int) (bitmapL.getWidth() * fC), (int) (bitmapL.getHeight() * fC));
        }
        boolean z8 = aVar != null;
        if (z8) {
            if (this.f20049L == null) {
                this.f20049L = new com.airbnb.lottie.utils.h();
            }
            if (this.f20050M == null) {
                this.f20050M = new C4.a(8);
            }
            C4.a aVar3 = this.f20050M;
            aVar3.f1155b = 255;
            aVar3.f1156c = null;
            aVar.getClass();
            com.airbnb.lottie.utils.a aVar4 = new com.airbnb.lottie.utils.a(aVar);
            aVar3.f1156c = aVar4;
            aVar4.b(i7);
            RectF rectF = this.f20044G;
            rectF.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            matrix.mapRect(rectF);
            canvas = this.f20049L.e(canvas, rectF, this.f20050M);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapL, rect, rect2, aVar2);
        if (z8) {
            this.f20049L.c();
            if (this.f20049L.f20246c == 4) {
                return;
            }
        }
        canvas.restore();
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.animation.content.DrawingContent
    public final void getBounds(RectF rectF, Matrix matrix, boolean z3) {
        Bitmap bitmapL;
        super.getBounds(rectF, matrix, z3);
        A a3 = this.f20045H;
        if (a3 != null) {
            float fC = com.airbnb.lottie.utils.i.c();
            if (this.f20020o.f20285B || (bitmapL = l()) == null) {
                rectF.set(0.0f, 0.0f, a3.f19550a * fC, a3.f19551b * fC);
            } else {
                rectF.set(0.0f, 0.0f, bitmapL.getWidth() * fC, bitmapL.getHeight() * fC);
            }
            this.f20019n.mapRect(rectF);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    public final Bitmap l() {
        Bitmap bitmapD;
        Bitmap bitmap;
        r rVar = this.f20047J;
        if (rVar != null && (bitmap = (Bitmap) rVar.e()) != null) {
            return bitmap;
        }
        String str = this.f20021p.f20057g;
        y yVar = this.f20020o;
        com.airbnb.lottie.manager.a aVar = yVar.f20310g;
        if (aVar != null) {
            Context contextH = yVar.h();
            Context context = aVar.f19897a;
            if (contextH != null) {
                if (context instanceof Application) {
                    contextH = contextH.getApplicationContext();
                }
                if (contextH != context) {
                    yVar.f20310g = null;
                }
            } else if (context != null) {
                yVar.f20310g = null;
            }
        }
        if (yVar.f20310g == null) {
            yVar.f20310g = new com.airbnb.lottie.manager.a(yVar.getCallback(), yVar.f20311i, yVar.f20312j, yVar.f20304a.c());
        }
        com.airbnb.lottie.manager.a aVar2 = yVar.f20310g;
        if (aVar2 != null) {
            String str2 = aVar2.f19898b;
            A a3 = (A) aVar2.f19900d.get(str);
            if (a3 != null) {
                bitmapD = a3.f19555f;
                if (bitmapD == null) {
                    ImageAssetDelegate imageAssetDelegate = aVar2.f19899c;
                    if (imageAssetDelegate != null) {
                        bitmapD = imageAssetDelegate.fetchBitmap(a3);
                        if (bitmapD != null) {
                            aVar2.a(str, bitmapD);
                        }
                    } else {
                        Context context2 = aVar2.f19897a;
                        if (context2 == null) {
                            bitmapD = null;
                        } else {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inScaled = true;
                            options.inDensity = 160;
                            String str3 = a3.f19553d;
                            boolean zStartsWith = str3.startsWith("data:");
                            int i7 = a3.f19551b;
                            int i10 = a3.f19550a;
                            if (!zStartsWith || str3.indexOf("base64,") <= 0) {
                                try {
                                    if (TextUtils.isEmpty(str2)) {
                                        throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                    }
                                    try {
                                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context2.getAssets().open(str2 + str3), null, options);
                                        if (bitmapDecodeStream == null) {
                                            com.airbnb.lottie.utils.c.b("Decoded image `" + str + "` is null.");
                                            bitmapD = null;
                                        } else {
                                            bitmapD = com.airbnb.lottie.utils.i.d(bitmapDecodeStream, i10, i7);
                                            aVar2.a(str, bitmapD);
                                        }
                                    } catch (IllegalArgumentException e10) {
                                        com.airbnb.lottie.utils.c.c("Unable to decode image `" + str + "`.", e10);
                                    }
                                } catch (IOException e11) {
                                    com.airbnb.lottie.utils.c.c("Unable to open asset.", e11);
                                }
                            } else {
                                try {
                                    byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                    try {
                                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                                        if (bitmapDecodeByteArray == null) {
                                            com.airbnb.lottie.utils.c.b("Decoded image `" + str + "` is null.");
                                            bitmapD = null;
                                        } else {
                                            bitmapD = com.airbnb.lottie.utils.i.d(bitmapDecodeByteArray, i10, i7);
                                            aVar2.a(str, bitmapD);
                                        }
                                    } catch (IllegalArgumentException e12) {
                                        com.airbnb.lottie.utils.c.c("Unable to decode image `" + str + "`.", e12);
                                    }
                                } catch (IllegalArgumentException e13) {
                                    com.airbnb.lottie.utils.c.c("data URL did not have correct base64 format.", e13);
                                }
                            }
                        }
                    }
                }
            } else {
                bitmapD = null;
            }
        } else {
            bitmapD = null;
        }
        if (bitmapD != null) {
            return bitmapD;
        }
        A a10 = this.f20045H;
        if (a10 != null) {
            return a10.f19555f;
        }
        return null;
    }
}
