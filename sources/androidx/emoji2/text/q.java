package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f16917b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f16916a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public short f16918c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f16919d = 1.0f;

    public q(w wVar) {
        p118hf.a.j(wVar, "rasterizer cannot be null");
        this.f16917b = wVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f16916a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        w wVar = this.f16917b;
        androidx.emoji2.text.flatbuffer.a aVarB = wVar.b();
        int iA = aVarB.a(14);
        this.f16919d = fAbs / (iA != 0 ? ((ByteBuffer) aVarB.f348d).getShort(iA + aVarB.f345a) : (short) 0);
        androidx.emoji2.text.flatbuffer.a aVarB2 = wVar.b();
        int iA2 = aVarB2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) aVarB2.f348d).getShort(iA2 + aVarB2.f345a);
        }
        androidx.emoji2.text.flatbuffer.a aVarB3 = wVar.b();
        int iA3 = aVarB3.a(12);
        short s3 = (short) ((iA3 != 0 ? ((ByteBuffer) aVarB3.f348d).getShort(iA3 + aVarB3.f345a) : (short) 0) * this.f16919d);
        this.f16918c = s3;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }
}
