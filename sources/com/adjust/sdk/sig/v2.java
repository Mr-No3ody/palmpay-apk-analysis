package com.adjust.sdk.sig;

import C0.G;
import androidx.camera.camera2.internal.F;
import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f19513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f19514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3 f19515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v2[] f19516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1 f19517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f19518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f19519g;

    public v2(x xVar, i1 i1Var, p3 p3Var, v2[] v2VarArr) {
        this.f19513a = xVar;
        this.f19514b = i1Var;
        this.f19515c = p3Var;
        this.f19516d = v2VarArr;
        this.f19517e = i1Var.f19465a;
        int iOrdinal = p3Var.ordinal();
        v2 v2Var = v2VarArr[iOrdinal];
        if (v2Var == null && v2Var == this) {
            return;
        }
        v2VarArr[iOrdinal] = this;
    }

    public final void a(r1 r1Var, Object obj) {
        String strDiscriminator;
        Set setC;
        int iA = w1.a(this.f19514b.f19465a.f19479c);
        if (iA == 0) {
            strDiscriminator = null;
        } else {
            if (iA == 1) {
                p2 p2VarD = r1Var.a().d();
                if (g1.a(p2VarD, e3.f19448a) || g1.a(p2VarD, h3.f19460a)) {
                    Iterator it = r1Var.a().getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            strDiscriminator = "type";
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (annotation instanceof k1) {
                            strDiscriminator = ((k1) annotation).discriminator();
                            break;
                        }
                    }
                }
            } else if (iA != 2) {
                throw new y1();
            }
            strDiscriminator = null;
        }
        if (strDiscriminator != null) {
            i1 i1Var = this.f19514b;
            l2 l2VarA = r1Var.a();
            g1.a(l2VarA.d(), e3.f19448a);
            if (l2VarA instanceof h) {
                setC = ((h) l2VarA).c();
            } else {
                HashSet hashSet = new HashSet(l2VarA.e());
                int iE = l2VarA.e();
                for (int i7 = 0; i7 < iE; i7++) {
                    hashSet.add(l2VarA.a(i7));
                }
                setC = hashSet;
            }
            if (setC.contains(strDiscriminator)) {
                String strB = r1Var.a().b();
                String strB2 = r1Var.a().b();
                throw new m1(G.r(F.f("Class '", strB2, "' cannot be serialized ", (i1Var.f19465a.f19479c == 2 && g1.a(strB, strB2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : G.l('\'', "as base class '", strB), " because it has property name that conflicts with JSON class discriminator '"), strDiscriminator, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
            }
            p2 p2VarD2 = r1Var.a().d();
            if (p2VarD2 instanceof o2) {
                throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (p2VarD2 instanceof f2) {
                throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            String strB3 = r1Var.a().b();
            this.f19518f = strDiscriminator;
            this.f19519g = strB3;
        }
        r1Var.a(this, obj);
    }

    public final void a(String str) {
        byte b7;
        o1 o1Var = this.f19513a.f19522a;
        o1Var.a(o1Var.f19492b, str.length() + 2);
        char[] cArr = o1Var.f19491a;
        int i7 = o1Var.f19492b;
        int i10 = i7 + 1;
        cArr[i7] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        int i11 = length + i10;
        int i12 = i10;
        while (i12 < i11) {
            char c6 = cArr[i12];
            byte[] bArr = w2.f19521b;
            if (c6 < bArr.length && bArr[c6] != 0) {
                int length2 = str.length();
                for (int i13 = i12 - i10; i13 < length2; i13++) {
                    int iA = o1Var.a(i12, 2);
                    char cCharAt = str.charAt(i13);
                    byte[] bArr2 = w2.f19521b;
                    if (cCharAt >= bArr2.length || (b7 = bArr2[cCharAt]) == 0) {
                        int i14 = iA + 1;
                        o1Var.f19491a[iA] = cCharAt;
                        i12 = i14;
                    } else if (b7 == 1) {
                        String str2 = w2.f19520a[cCharAt];
                        int iA2 = o1Var.a(iA, str2.length());
                        str2.getChars(0, str2.length(), o1Var.f19491a, iA2);
                        int length3 = str2.length() + iA2;
                        o1Var.f19492b = length3;
                        i12 = length3;
                    } else {
                        char[] cArr2 = o1Var.f19491a;
                        cArr2[iA] = '\\';
                        cArr2[iA + 1] = (char) b7;
                        i12 = iA + 2;
                        o1Var.f19492b = i12;
                    }
                }
                int iA3 = o1Var.a(i12, 1);
                o1Var.f19491a[iA3] = '\"';
                o1Var.f19492b = iA3 + 1;
                return;
            }
            i12++;
        }
        cArr[i11] = '\"';
        o1Var.f19492b = i11 + 1;
    }
}
