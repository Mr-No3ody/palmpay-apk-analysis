package com.mikepenz.iconics.utils;

import android.text.ParcelableSpan;
import android.text.style.CharacterStyle;
import com.mikepenz.iconics.typeface.ITypeface;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ITypeface f23609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ParcelableSpan f23610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharacterStyle f23611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23612g;

    public b(int i7, int i10, String str, ITypeface iTypeface, ParcelableSpan parcelableSpan, CharacterStyle characterStyle, int i11, int i12) {
        str = (i12 & 4) != 0 ? null : str;
        iTypeface = (i12 & 8) != 0 ? null : iTypeface;
        parcelableSpan = (i12 & 16) != 0 ? null : parcelableSpan;
        characterStyle = (i12 & 32) != 0 ? null : characterStyle;
        i11 = (i12 & 64) != 0 ? 33 : i11;
        this.f23606a = i7;
        this.f23607b = i10;
        this.f23608c = str;
        this.f23609d = iTypeface;
        this.f23610e = parcelableSpan;
        this.f23611f = characterStyle;
        this.f23612g = i11;
    }
}
