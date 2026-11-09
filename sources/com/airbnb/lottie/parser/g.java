package com.airbnb.lottie.parser;

import C0.G;
import android.graphics.Path;
import androidx.camera.camera2.internal.F;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.content.ContentModel;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p039cb.c f20147a = p039cb.c.d("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:123:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046 A[PHI: r17
      0x0046: PHI (r17v18 java.lang.Object) = 
      (r17v20 java.lang.Object)
      (r17v21 java.lang.Object)
      (r17v22 java.lang.Object)
      (r17v23 java.lang.Object)
      (r17v24 java.lang.Object)
      (r17v25 java.lang.Object)
      (r17v26 java.lang.Object)
      (r17v27 java.lang.Object)
      (r17v28 java.lang.Object)
      (r17v29 java.lang.Object)
      (r17v30 java.lang.Object)
      (r17v31 java.lang.Object)
      (r17v32 java.lang.Object)
      (r17v33 java.lang.Object)
      (r17v19 java.lang.Object)
     binds: [B:71:0x0114, B:67:0x0107, B:63:0x00fa, B:59:0x00ed, B:55:0x00e0, B:51:0x00d3, B:47:0x00c6, B:43:0x00b7, B:39:0x00a7, B:35:0x0096, B:31:0x0085, B:27:0x0074, B:23:0x0063, B:19:0x0052, B:16:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:437:0x0779 A[LOOP:1: B:435:0x0773->B:437:0x0779, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v3, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r17v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v16, types: [com.airbnb.lottie.model.content.k] */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v34 */
    /* JADX WARN: Type inference failed for: r17v35 */
    /* JADX WARN: Type inference failed for: r17v36 */
    /* JADX WARN: Type inference failed for: r17v37 */
    /* JADX WARN: Type inference failed for: r17v38 */
    /* JADX WARN: Type inference failed for: r17v39 */
    /* JADX WARN: Type inference failed for: r17v40 */
    /* JADX WARN: Type inference failed for: r17v41 */
    /* JADX WARN: Type inference failed for: r17v42 */
    /* JADX WARN: Type inference failed for: r17v43 */
    /* JADX WARN: Type inference failed for: r17v44 */
    /* JADX WARN: Type inference failed for: r17v45 */
    /* JADX WARN: Type inference failed for: r17v46 */
    /* JADX WARN: Type inference failed for: r17v47 */
    /* JADX WARN: Type inference failed for: r17v48 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v26 */
    /* JADX WARN: Type inference failed for: r19v27 */
    /* JADX WARN: Type inference failed for: r19v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v30 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [com.airbnb.lottie.model.animatable.AnimatableValue] */
    /* JADX WARN: Type inference failed for: r20v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14, types: [com.airbnb.lottie.model.animatable.AnimatableValue] */
    /* JADX WARN: Type inference failed for: r20v15, types: [com.airbnb.lottie.model.animatable.AnimatableValue] */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v17 */
    /* JADX WARN: Type inference failed for: r20v18, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r20v19, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r20v2, types: [com.airbnb.lottie.model.animatable.AnimatableValue] */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v26 */
    /* JADX WARN: Type inference failed for: r20v27, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r20v28 */
    /* JADX WARN: Type inference failed for: r20v29 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v30 */
    /* JADX WARN: Type inference failed for: r20v31 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v19, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r21v2, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r21v20, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r21v21 */
    /* JADX WARN: Type inference failed for: r21v22 */
    /* JADX WARN: Type inference failed for: r21v23, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r21v24, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r21v25 */
    /* JADX WARN: Type inference failed for: r21v26 */
    /* JADX WARN: Type inference failed for: r21v27, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r21v28, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r21v29 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v31 */
    /* JADX WARN: Type inference failed for: r21v32, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r21v33 */
    /* JADX WARN: Type inference failed for: r21v34, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r21v6, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v17, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r22v18, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v21, types: [com.airbnb.lottie.model.animatable.d] */
    /* JADX WARN: Type inference failed for: r22v22, types: [com.airbnb.lottie.model.animatable.d] */
    /* JADX WARN: Type inference failed for: r22v23 */
    /* JADX WARN: Type inference failed for: r22v24 */
    /* JADX WARN: Type inference failed for: r22v25, types: [com.airbnb.lottie.model.animatable.AnimatableValue] */
    /* JADX WARN: Type inference failed for: r22v26, types: [com.airbnb.lottie.model.animatable.AnimatableValue] */
    /* JADX WARN: Type inference failed for: r22v27 */
    /* JADX WARN: Type inference failed for: r22v28 */
    /* JADX WARN: Type inference failed for: r22v29, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r22v30, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r22v31 */
    /* JADX WARN: Type inference failed for: r22v32 */
    /* JADX WARN: Type inference failed for: r22v33, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r22v34, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r22v35 */
    /* JADX WARN: Type inference failed for: r22v5, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v11, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r23v13 */
    /* JADX WARN: Type inference failed for: r23v14, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r23v23 */
    /* JADX WARN: Type inference failed for: r23v24, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r23v25, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r23v26 */
    /* JADX WARN: Type inference failed for: r23v27, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r23v28 */
    /* JADX WARN: Type inference failed for: r23v29, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r23v30, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r23v31 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v10, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r24v11, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r24v12 */
    /* JADX WARN: Type inference failed for: r24v2, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r24v3, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r24v7, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r25v10, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v2, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r25v6, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r26v10, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v2, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r26v6, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v8 */
    /* JADX WARN: Type inference failed for: r26v9, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r27v10, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r2v54, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r3v20, types: [com.airbnb.lottie.model.animatable.b] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r7v48, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r7v54, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r7v65, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v68, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v73 */
    /* JADX WARN: Type inference failed for: r7v74 */
    /* JADX WARN: Type inference failed for: r7v75, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v76 */
    /* JADX WARN: Type inference failed for: r7v77, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Type inference failed for: r7v82, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r7v83, types: [com.airbnb.lottie.model.animatable.a] */
    /* JADX WARN: Type inference failed for: r7v84 */
    /* JADX WARN: Type inference failed for: r7v85 */
    /* JADX WARN: Type inference failed for: r7v87, types: [com.airbnb.lottie.model.content.ContentModel] */
    /* JADX WARN: Type inference failed for: r7v88 */
    /* JADX WARN: Type inference failed for: r7v90 */
    /* JADX WARN: Type inference failed for: r7v91 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.String] */
    public static ContentModel a(com.airbnb.lottie.parser.moshi.b bVar, com.airbnb.lottie.k kVar) throws Kf.d, EOFException {
        String strI;
        byte b7;
        ?? kVar2;
        Object cVar;
        ?? iVar;
        Object lVar;
        int i7;
        Object aVar;
        Object obj;
        boolean zF = false;
        boolean zF2 = false;
        int i10 = 0;
        bVar.b();
        int iH = 2;
        while (true) {
            if (!bVar.e()) {
                strI = null;
                break;
            }
            int iL = bVar.l(f20147a);
            if (iL == 0) {
                strI = bVar.i();
                break;
            }
            if (iL != 1) {
                bVar.m();
                bVar.n();
            } else {
                iH = bVar.h();
            }
        }
        if (strI == null) {
            return null;
        }
        switch (strI.hashCode()) {
            case 3239:
                obj = null;
                if (!strI.equals("el")) {
                    b7 = -1;
                    kVar2 = obj;
                } else {
                    b7 = 0;
                    kVar2 = null;
                }
                break;
            case 3270:
                obj = null;
                if (!strI.equals("fl")) {
                    b7 = -1;
                    kVar2 = obj;
                } else {
                    b7 = 1;
                    kVar2 = null;
                }
                break;
            case 3295:
                obj = null;
                if (!strI.equals("gf")) {
                    b7 = -1;
                    kVar2 = obj;
                } else {
                    b7 = 2;
                    kVar2 = null;
                }
                break;
            case 3307:
                obj = null;
                if (!strI.equals("gr")) {
                    b7 = -1;
                    kVar2 = obj;
                } else {
                    b7 = 3;
                    kVar2 = null;
                }
                break;
            case 3308:
                obj = null;
                if (!strI.equals("gs")) {
                    b7 = -1;
                    kVar2 = obj;
                } else {
                    b7 = 4;
                    kVar2 = null;
                }
                break;
            case 3488:
                obj = null;
                if (!strI.equals("mm")) {
                    b7 = -1;
                    kVar2 = obj;
                } else {
                    b7 = 5;
                    kVar2 = null;
                }
                break;
            case 3633:
                obj = null;
                if (!strI.equals("rc")) {
                    b7 = -1;
                    kVar2 = obj;
                } else {
                    b7 = 6;
                    kVar2 = null;
                }
                break;
            case 3634:
                obj = null;
                if (!strI.equals("rd")) {
                    b7 = -1;
                    kVar2 = obj;
                } else {
                    b7 = 7;
                    kVar2 = null;
                }
                break;
            case 3646:
                obj = null;
                if (!strI.equals("rp")) {
                    b7 = -1;
                    kVar2 = obj;
                } else {
                    b7 = 8;
                    kVar2 = null;
                }
                break;
            case 3669:
                obj = null;
                if (!strI.equals("sh")) {
                    b7 = -1;
                    kVar2 = obj;
                } else {
                    b7 = 9;
                    kVar2 = null;
                }
                break;
            case 3679:
                obj = null;
                if (!strI.equals("sr")) {
                    b7 = -1;
                    kVar2 = obj;
                } else {
                    b7 = 10;
                    kVar2 = null;
                }
                break;
            case 3681:
                obj = null;
                if (!strI.equals("st")) {
                    b7 = -1;
                    kVar2 = obj;
                } else {
                    b7 = Ascii.VT;
                    kVar2 = null;
                }
                break;
            case 3705:
                obj = null;
                if (!strI.equals("tm")) {
                    b7 = -1;
                    kVar2 = obj;
                } else {
                    b7 = Ascii.FF;
                    kVar2 = null;
                }
                break;
            case 3710:
                obj = null;
                if (!strI.equals("tr")) {
                    b7 = -1;
                    kVar2 = obj;
                } else {
                    b7 = Ascii.CR;
                    kVar2 = null;
                }
                break;
            default:
                obj = null;
                b7 = -1;
                kVar2 = obj;
                break;
        }
        switch (b7) {
            case 0:
                p039cb.c cVar2 = e.f20139a;
                boolean z3 = iH == 3;
                boolean zF3 = false;
                ?? I7 = kVar2;
                ?? B10 = I7;
                ?? Z8 = B10;
                while (bVar.e()) {
                    int iL2 = bVar.l(e.f20139a);
                    if (iL2 == 0) {
                        I7 = bVar.i();
                    } else if (iL2 == 1) {
                        B10 = AbstractC1319a.b(bVar, kVar);
                    } else if (iL2 == 2) {
                        Z8 = p002a.a.z(bVar, kVar);
                    } else if (iL2 == 3) {
                        zF3 = bVar.f();
                    } else if (iL2 != 4) {
                        bVar.m();
                        bVar.n();
                    } else {
                        z3 = bVar.h() == 3;
                    }
                }
                aVar = new com.airbnb.lottie.model.content.a(I7, B10, Z8, z3, zF3);
                iVar = aVar;
                while (bVar.e()) {
                    bVar.n();
                }
                bVar.d();
                return iVar;
            case 1:
                p039cb.c cVar3 = z.f20199a;
                boolean zF4 = false;
                boolean zF5 = false;
                int iH2 = 1;
                ?? aVar2 = kVar2;
                ?? I10 = aVar2;
                ?? V2 = I10;
                while (bVar.e()) {
                    int iL3 = bVar.l(z.f20199a);
                    if (iL3 == 0) {
                        I10 = bVar.i();
                    } else if (iL3 == 1) {
                        V2 = p002a.a.v(bVar, kVar);
                    } else if (iL3 == 2) {
                        aVar2 = p002a.a.y(bVar, kVar);
                    } else if (iL3 == 3) {
                        zF4 = bVar.f();
                    } else if (iL3 == 4) {
                        iH2 = bVar.h();
                    } else if (iL3 != 5) {
                        bVar.m();
                        bVar.n();
                    } else {
                        zF5 = bVar.f();
                    }
                }
                if (aVar2 == 0) {
                    aVar2 = new com.airbnb.lottie.model.animatable.a(Collections.singletonList(new p243q1.a(100)), 2);
                }
                kVar2 = new com.airbnb.lottie.model.content.k(I10, zF4, iH2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, V2, aVar2, zF5);
                while (bVar.e()) {
                    bVar.n();
                }
                bVar.d();
                return iVar;
            case 2:
                p039cb.c cVar4 = m.f20161a;
                Path.FillType fillType = Path.FillType.WINDING;
                int i11 = 0;
                boolean zF6 = false;
                ?? aVar3 = kVar2;
                ?? I11 = aVar3;
                ?? X4 = I11;
                ?? Z10 = X4;
                ?? Z11 = Z10;
                while (bVar.e()) {
                    switch (bVar.l(m.f20161a)) {
                        case 0:
                            I11 = bVar.i();
                            break;
                        case 1:
                            bVar.b();
                            int iH3 = -1;
                            while (bVar.e()) {
                                int iL4 = bVar.l(m.f20162b);
                                if (iL4 == 0) {
                                    iH3 = bVar.h();
                                } else if (iL4 != 1) {
                                    bVar.m();
                                    bVar.n();
                                } else {
                                    X4 = p002a.a.x(bVar, kVar, iH3);
                                }
                            }
                            bVar.d();
                            break;
                        case 2:
                            aVar3 = p002a.a.y(bVar, kVar);
                            break;
                        case 3:
                            i11 = bVar.h() != 1 ? 2 : 1;
                            break;
                        case 4:
                            Z10 = p002a.a.z(bVar, kVar);
                            break;
                        case 5:
                            Z11 = p002a.a.z(bVar, kVar);
                            break;
                        case 6:
                            fillType = bVar.h() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zF6 = bVar.f();
                            break;
                        default:
                            bVar.m();
                            bVar.n();
                            break;
                    }
                }
                if (aVar3 == 0) {
                    aVar3 = new com.airbnb.lottie.model.animatable.a(Collections.singletonList(new p243q1.a(100)), 2);
                }
                cVar = new com.airbnb.lottie.model.content.c(I11, i11, fillType, X4, aVar3, Z10, Z11, zF6);
                iVar = cVar;
                while (bVar.e()) {
                    bVar.n();
                }
                bVar.d();
                return iVar;
            case 3:
                p039cb.c cVar5 = A.f20126a;
                ArrayList arrayList = new ArrayList();
                ?? I12 = kVar2;
                while (bVar.e()) {
                    int iL5 = bVar.l(A.f20126a);
                    if (iL5 == 0) {
                        I12 = bVar.i();
                    } else if (iL5 == 1) {
                        zF = bVar.f();
                    } else if (iL5 != 2) {
                        bVar.n();
                    } else {
                        bVar.a();
                        while (bVar.e()) {
                            ContentModel contentModelA = a(bVar, kVar);
                            if (contentModelA != null) {
                                arrayList.add(contentModelA);
                            }
                        }
                        bVar.c();
                    }
                }
                lVar = new com.airbnb.lottie.model.content.l(I12, arrayList, zF);
                iVar = lVar;
                while (bVar.e()) {
                    bVar.n();
                }
                bVar.d();
                return iVar;
            case 4:
                p039cb.c cVar6 = n.f20176a;
                ArrayList arrayList2 = new ArrayList();
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                boolean zF7 = false;
                float fG = 0.0f;
                ?? aVar4 = kVar2;
                ?? I13 = aVar4;
                ?? X9 = I13;
                ?? Z12 = X9;
                ?? Z13 = Z12;
                ?? W10 = Z13;
                ?? r31 = W10;
                while (bVar.e()) {
                    switch (bVar.l(n.f20176a)) {
                        case 0:
                            I13 = bVar.i();
                            break;
                        case 1:
                            bVar.b();
                            int iH4 = -1;
                            while (bVar.e()) {
                                int iL6 = bVar.l(n.f20177b);
                                if (iL6 == 0) {
                                    iH4 = bVar.h();
                                } else if (iL6 != 1) {
                                    bVar.m();
                                    bVar.n();
                                } else {
                                    X9 = p002a.a.x(bVar, kVar, iH4);
                                }
                            }
                            bVar.d();
                            break;
                        case 2:
                            aVar4 = p002a.a.y(bVar, kVar);
                            break;
                        case 3:
                            i12 = bVar.h() != 1 ? 2 : 1;
                            break;
                        case 4:
                            Z12 = p002a.a.z(bVar, kVar);
                            break;
                        case 5:
                            Z13 = p002a.a.z(bVar, kVar);
                            break;
                        case 6:
                            W10 = p002a.a.w(bVar, kVar, true);
                            break;
                        case 7:
                            i13 = F.l(3)[bVar.h() - 1];
                            break;
                        case 8:
                            i14 = F.l(3)[bVar.h() - 1];
                            break;
                        case 9:
                            fG = (float) bVar.g();
                            break;
                        case 10:
                            zF7 = bVar.f();
                            break;
                        case 11:
                            bVar.a();
                            while (bVar.e()) {
                                bVar.b();
                                ?? I14 = kVar2;
                                ?? W11 = I14;
                                while (bVar.e()) {
                                    int iL7 = bVar.l(n.f20178c);
                                    if (iL7 == 0) {
                                        I14 = bVar.i();
                                    } else if (iL7 != 1) {
                                        bVar.m();
                                        bVar.n();
                                    } else {
                                        W11 = p002a.a.w(bVar, kVar, true);
                                    }
                                }
                                bVar.d();
                                if (I14.equals("o")) {
                                    r31 = W11;
                                } else if (I14.equals("d") || I14.equals("g")) {
                                    kVar.f19888o = true;
                                    arrayList2.add(W11);
                                }
                            }
                            bVar.c();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((com.airbnb.lottie.model.animatable.b) arrayList2.get(0));
                            }
                            break;
                        default:
                            bVar.m();
                            bVar.n();
                            break;
                    }
                }
                if (aVar4 == 0) {
                    aVar4 = new com.airbnb.lottie.model.animatable.a(Collections.singletonList(new p243q1.a(100)), 2);
                }
                cVar = new com.airbnb.lottie.model.content.d(I13, i12, X9, aVar4, Z12, Z13, W10, i13, i14, fG, arrayList2, r31, zF7);
                iVar = cVar;
                while (bVar.e()) {
                    bVar.n();
                }
                bVar.d();
                return iVar;
            case 5:
                p039cb.c cVar7 = t.f20192a;
                boolean zF8 = false;
                ?? I15 = kVar2;
                while (bVar.e()) {
                    int iL8 = bVar.l(t.f20192a);
                    if (iL8 == 0) {
                        I15 = bVar.i();
                    } else if (iL8 == 1) {
                        int iH5 = bVar.h();
                        if (iH5 != 1) {
                            if (iH5 == 2) {
                                i10 = 2;
                            } else if (iH5 == 3) {
                                i10 = 3;
                            } else if (iH5 == 4) {
                                i10 = 4;
                            } else if (iH5 == 5) {
                                i10 = 5;
                            }
                        }
                        i10 = 1;
                    } else if (iL8 != 2) {
                        bVar.m();
                        bVar.n();
                    } else {
                        zF8 = bVar.f();
                    }
                }
                com.airbnb.lottie.model.content.f fVar = new com.airbnb.lottie.model.content.f(I15, i10, zF8);
                kVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                iVar = fVar;
                while (bVar.e()) {
                    bVar.n();
                }
                bVar.d();
                return iVar;
            case 6:
                p039cb.c cVar8 = v.f20194a;
                boolean zF9 = false;
                ?? I16 = kVar2;
                ?? B11 = I16;
                ?? Z14 = B11;
                ?? W12 = Z14;
                while (bVar.e()) {
                    int iL9 = bVar.l(v.f20194a);
                    if (iL9 == 0) {
                        I16 = bVar.i();
                    } else if (iL9 == 1) {
                        B11 = AbstractC1319a.b(bVar, kVar);
                    } else if (iL9 == 2) {
                        Z14 = p002a.a.z(bVar, kVar);
                    } else if (iL9 == 3) {
                        W12 = p002a.a.w(bVar, kVar, true);
                    } else if (iL9 != 4) {
                        bVar.n();
                    } else {
                        zF9 = bVar.f();
                    }
                }
                aVar = new com.airbnb.lottie.model.content.h((String) I16, (AnimatableValue) B11, (com.airbnb.lottie.model.animatable.a) Z14, (com.airbnb.lottie.model.animatable.b) W12, zF9);
                iVar = aVar;
                while (bVar.e()) {
                    bVar.n();
                }
                bVar.d();
                return iVar;
            case 7:
                p039cb.c cVar9 = x.f20196a;
                ?? I17 = kVar2;
                ?? W13 = I17;
                while (bVar.e()) {
                    int iL10 = bVar.l(x.f20196a);
                    if (iL10 == 0) {
                        I17 = bVar.i();
                    } else if (iL10 == 1) {
                        W13 = p002a.a.w(bVar, kVar, true);
                    } else if (iL10 != 2) {
                        bVar.n();
                    } else {
                        zF2 = bVar.f();
                    }
                }
                iVar = zF2 ? kVar2 : new com.airbnb.lottie.model.content.i(I17, W13);
                while (bVar.e()) {
                    bVar.n();
                }
                bVar.d();
                return iVar;
            case 8:
                p039cb.c cVar10 = w.f20195a;
                boolean zF10 = false;
                ?? I18 = kVar2;
                ?? W14 = I18;
                ?? W15 = W14;
                ?? C10 = W15;
                while (bVar.e()) {
                    int iL11 = bVar.l(w.f20195a);
                    if (iL11 == 0) {
                        I18 = bVar.i();
                    } else if (iL11 == 1) {
                        W14 = p002a.a.w(bVar, kVar, false);
                    } else if (iL11 == 2) {
                        W15 = p002a.a.w(bVar, kVar, false);
                    } else if (iL11 == 3) {
                        C10 = AbstractC1321c.c(bVar, kVar);
                    } else if (iL11 != 4) {
                        bVar.n();
                    } else {
                        zF10 = bVar.f();
                    }
                }
                aVar = new com.airbnb.lottie.model.content.h((String) I18, (com.airbnb.lottie.model.animatable.b) W14, (com.airbnb.lottie.model.animatable.b) W15, (com.airbnb.lottie.model.animatable.d) C10, zF10);
                iVar = aVar;
                while (bVar.e()) {
                    bVar.n();
                }
                bVar.d();
                return iVar;
            case 9:
                p039cb.c cVar11 = B.f20127a;
                int iH6 = 0;
                boolean zF11 = false;
                ?? aVar5 = kVar2;
                ?? I19 = aVar5;
                while (bVar.e()) {
                    int iL12 = bVar.l(B.f20127a);
                    if (iL12 == 0) {
                        I19 = bVar.i();
                    } else if (iL12 == 1) {
                        iH6 = bVar.h();
                    } else if (iL12 == 2) {
                        aVar5 = new com.airbnb.lottie.model.animatable.a(q.a(bVar, kVar, com.airbnb.lottie.utils.i.c(), y.f20197a, false), 5);
                    } else if (iL12 != 3) {
                        bVar.n();
                    } else {
                        zF11 = bVar.f();
                    }
                }
                lVar = new com.airbnb.lottie.model.content.m(I19, iH6, aVar5, zF11);
                iVar = lVar;
                while (bVar.e()) {
                    bVar.n();
                }
                bVar.d();
                return iVar;
            case 10:
                p039cb.c cVar12 = u.f20193a;
                boolean z8 = iH == 3;
                int i15 = 0;
                boolean zF12 = false;
                ?? I20 = kVar2;
                ?? W16 = I20;
                ?? B12 = W16;
                ?? W17 = B12;
                ?? W18 = W17;
                ?? W19 = W18;
                ?? W20 = W19;
                ?? W21 = W20;
                while (bVar.e()) {
                    switch (bVar.l(u.f20193a)) {
                        case 0:
                            I20 = bVar.i();
                            break;
                        case 1:
                            int iH7 = bVar.h();
                            int[] iArrL = F.l(2);
                            int length = iArrL.length;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= length) {
                                    i15 = 0;
                                }
                                int i17 = iArrL[i16];
                                if (i17 == 1) {
                                    i7 = 1;
                                } else {
                                    if (i17 != 2) {
                                        throw kVar2;
                                    }
                                    i7 = 2;
                                }
                                if (i7 == iH7) {
                                    i15 = i17;
                                }
                                i16++;
                                break;
                                break;
                            }
                            break;
                        case 2:
                            W16 = p002a.a.w(bVar, kVar, false);
                            break;
                        case 3:
                            B12 = AbstractC1319a.b(bVar, kVar);
                            break;
                        case 4:
                            W17 = p002a.a.w(bVar, kVar, false);
                            break;
                        case 5:
                            W19 = p002a.a.w(bVar, kVar, true);
                            break;
                        case 6:
                            W21 = p002a.a.w(bVar, kVar, false);
                            break;
                        case 7:
                            W18 = p002a.a.w(bVar, kVar, true);
                            break;
                        case 8:
                            W20 = p002a.a.w(bVar, kVar, false);
                            break;
                        case 9:
                            zF12 = bVar.f();
                            break;
                        case 10:
                            z8 = bVar.h() == 3;
                            break;
                        default:
                            bVar.m();
                            bVar.n();
                            break;
                    }
                }
                aVar = new com.airbnb.lottie.model.content.g(I20, i15, W16, B12, W17, W18, W19, W20, W21, zF12, z8);
                iVar = aVar;
                while (bVar.e()) {
                    bVar.n();
                }
                bVar.d();
                return iVar;
            case 11:
                p039cb.c cVar13 = C.f20128a;
                ArrayList arrayList3 = new ArrayList();
                int i18 = 0;
                int i19 = 0;
                boolean zF13 = false;
                float fG2 = 0.0f;
                ?? aVar6 = kVar2;
                ?? I21 = aVar6;
                ?? r20 = I21;
                ?? V10 = r20;
                ?? W22 = V10;
                while (bVar.e()) {
                    switch (bVar.l(C.f20128a)) {
                        case 0:
                            I21 = bVar.i();
                            break;
                        case 1:
                            V10 = p002a.a.v(bVar, kVar);
                            break;
                        case 2:
                            W22 = p002a.a.w(bVar, kVar, true);
                            break;
                        case 3:
                            aVar6 = p002a.a.y(bVar, kVar);
                            break;
                        case 4:
                            i18 = F.l(3)[bVar.h() - 1];
                            break;
                        case 5:
                            i19 = F.l(3)[bVar.h() - 1];
                            break;
                        case 6:
                            fG2 = (float) bVar.g();
                            break;
                        case 7:
                            zF13 = bVar.f();
                            break;
                        case 8:
                            bVar.a();
                            while (bVar.e()) {
                                bVar.b();
                                ?? I22 = kVar2;
                                ?? W23 = I22;
                                while (bVar.e()) {
                                    int iL13 = bVar.l(C.f20129b);
                                    if (iL13 == 0) {
                                        I22 = bVar.i();
                                    } else if (iL13 != 1) {
                                        bVar.m();
                                        bVar.n();
                                    } else {
                                        W23 = p002a.a.w(bVar, kVar, true);
                                    }
                                }
                                bVar.d();
                                I22.getClass();
                                switch (I22) {
                                    case "d":
                                    case "g":
                                        kVar.f19888o = true;
                                        arrayList3.add(W23);
                                        break;
                                    case "o":
                                        r20 = W23;
                                        break;
                                }
                            }
                            bVar.c();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((com.airbnb.lottie.model.animatable.b) arrayList3.get(0));
                            }
                            break;
                        default:
                            bVar.n();
                            break;
                    }
                }
                if (aVar6 == 0) {
                    aVar6 = new com.airbnb.lottie.model.animatable.a(Collections.singletonList(new p243q1.a(100)), 2);
                }
                aVar = new com.airbnb.lottie.model.content.n(I21, r20, arrayList3, V10, aVar6, W22, i18 == 0 ? 1 : i18, i19 == 0 ? 1 : i19, fG2, zF13);
                iVar = aVar;
                while (bVar.e()) {
                    bVar.n();
                }
                bVar.d();
                return iVar;
            case 12:
                p039cb.c cVar14 = D.f20130a;
                int i20 = 0;
                boolean zF14 = false;
                ?? I23 = kVar2;
                ?? W24 = I23;
                ?? W25 = W24;
                ?? W26 = W25;
                while (bVar.e()) {
                    int iL14 = bVar.l(D.f20130a);
                    if (iL14 == 0) {
                        W24 = p002a.a.w(bVar, kVar, false);
                    } else if (iL14 == 1) {
                        W25 = p002a.a.w(bVar, kVar, false);
                    } else if (iL14 == 2) {
                        W26 = p002a.a.w(bVar, kVar, false);
                    } else if (iL14 == 3) {
                        I23 = bVar.i();
                    } else if (iL14 == 4) {
                        int iH8 = bVar.h();
                        if (iH8 == 1) {
                            i20 = 1;
                        } else {
                            if (iH8 != 2) {
                                throw new IllegalArgumentException(G.m(iH8, "Unknown trim path type "));
                            }
                            i20 = 2;
                        }
                    } else if (iL14 != 5) {
                        bVar.n();
                    } else {
                        zF14 = bVar.f();
                    }
                }
                aVar = new com.airbnb.lottie.model.content.o(I23, i20, W24, W25, W26, zF14);
                iVar = aVar;
                while (bVar.e()) {
                    bVar.n();
                }
                bVar.d();
                return iVar;
            case 13:
                iVar = AbstractC1321c.c(bVar, kVar);
                while (bVar.e()) {
                    bVar.n();
                }
                bVar.d();
                return iVar;
            default:
                com.airbnb.lottie.utils.c.b("Unknown shape type ".concat(strI));
                while (bVar.e()) {
                    bVar.n();
                }
                bVar.d();
                return iVar;
        }
    }
}
